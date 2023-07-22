@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you
 * want to crawl.
 *
 * You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap
 * URLs.
 *
 * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
 * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the
 * website is blocked from crawling.
 *
 * *When selecting websites to index, you must adhere to the [Amazon Acceptable Use
 * Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only
 * use the Amazon Kendra web crawler to index your own webpages, or webpages that you have
 * authorization to index.*
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * WebCrawlerUrlsProperty webCrawlerUrlsProperty = WebCrawlerUrlsProperty.builder()
 * .seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty.builder()
 * .seedUrls(List.of("seedUrls"))
 * // the properties below are optional
 * .webCrawlerMode("webCrawlerMode")
 * .build())
 * .siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty.builder()
 * .siteMaps(List.of("siteMaps"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerurls.html)
 */
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
