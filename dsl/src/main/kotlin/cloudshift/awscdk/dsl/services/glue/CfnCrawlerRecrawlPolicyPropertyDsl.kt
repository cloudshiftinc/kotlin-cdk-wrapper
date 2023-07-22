@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnCrawler

@CdkDslMarker
public class CfnCrawlerRecrawlPolicyPropertyDsl {
  private val cdkBuilder: CfnCrawler.RecrawlPolicyProperty.Builder =
      CfnCrawler.RecrawlPolicyProperty.builder()

  /**
   * @param recrawlBehavior Specifies whether to crawl the entire dataset again or to crawl only
   * folders that were added since the last crawler run.
   * A value of `CRAWL_EVERYTHING` specifies crawling the entire dataset again.
   *
   * A value of `CRAWL_NEW_FOLDERS_ONLY` specifies crawling only folders that were added since the
   * last crawler run.
   *
   * A value of `CRAWL_EVENT_MODE` specifies crawling only the changes identified by Amazon S3
   * events.
   */
  public fun recrawlBehavior(recrawlBehavior: String) {
    cdkBuilder.recrawlBehavior(recrawlBehavior)
  }

  public fun build(): CfnCrawler.RecrawlPolicyProperty = cdkBuilder.build()
}
