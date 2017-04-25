package softuniBlog.entity;




import javax.persistence.*;


@Entity
@Table(name="comments")
public class Comment{
    private Integer id;
    private String name;

    private String comment;
    private Article article;

    public Comment() {    }

    public Comment(String name, String comment, Article article) {

        this.name = name;
        this.comment = comment;
        this.article=article;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(columnDefinition = "text", nullable = false)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    @ManyToOne()
    @JoinColumn(nullable = false, name = "article_id")
    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
