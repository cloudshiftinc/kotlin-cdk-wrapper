@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnCrawler

@CdkDslMarker
public class CfnCrawlerRecrawlPolicyPropertyDsl {
  private val cdkBuilder: CfnCrawler.RecrawlPolicyProperty.Builder =
      CfnCrawler.RecrawlPolicyProperty.builder()

  public fun recrawlBehavior(recrawlBehavior: String) {
    cdkBuilder.recrawlBehavior(recrawlBehavior)
  }

  public fun build(): CfnCrawler.RecrawlPolicyProperty = cdkBuilder.build()
}
