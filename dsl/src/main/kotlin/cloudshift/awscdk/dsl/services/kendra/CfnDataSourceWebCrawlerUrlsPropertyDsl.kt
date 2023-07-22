@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceWebCrawlerUrlsPropertyDsl {
  private val cdkBuilder: CfnDataSource.WebCrawlerUrlsProperty.Builder =
      CfnDataSource.WebCrawlerUrlsProperty.builder()

  /**
   * @param seedUrlConfiguration Configuration of the seed or starting point URLs of the websites
   * you want to crawl.
   * You can choose to crawl only the website host names, or the website host names with subdomains,
   * or the website host names with subdomains and other domains that the web pages link to.
   *
   * You can list up to 100 seed URLs.
   */
  public fun seedUrlConfiguration(seedUrlConfiguration: IResolvable) {
    cdkBuilder.seedUrlConfiguration(seedUrlConfiguration)
  }

  /**
   * @param seedUrlConfiguration Configuration of the seed or starting point URLs of the websites
   * you want to crawl.
   * You can choose to crawl only the website host names, or the website host names with subdomains,
   * or the website host names with subdomains and other domains that the web pages link to.
   *
   * You can list up to 100 seed URLs.
   */
  public
      fun seedUrlConfiguration(seedUrlConfiguration: CfnDataSource.WebCrawlerSeedUrlConfigurationProperty) {
    cdkBuilder.seedUrlConfiguration(seedUrlConfiguration)
  }

  /**
   * @param siteMapsConfiguration Configuration of the sitemap URLs of the websites you want to
   * crawl.
   * Only URLs belonging to the same website host names are crawled. You can list up to three
   * sitemap URLs.
   */
  public fun siteMapsConfiguration(siteMapsConfiguration: IResolvable) {
    cdkBuilder.siteMapsConfiguration(siteMapsConfiguration)
  }

  /**
   * @param siteMapsConfiguration Configuration of the sitemap URLs of the websites you want to
   * crawl.
   * Only URLs belonging to the same website host names are crawled. You can list up to three
   * sitemap URLs.
   */
  public
      fun siteMapsConfiguration(siteMapsConfiguration: CfnDataSource.WebCrawlerSiteMapsConfigurationProperty) {
    cdkBuilder.siteMapsConfiguration(siteMapsConfiguration)
  }

  public fun build(): CfnDataSource.WebCrawlerUrlsProperty = cdkBuilder.build()
}
