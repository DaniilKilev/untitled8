package Builder;

public class EnterpriceSite extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprice site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(1009);
    }
}
