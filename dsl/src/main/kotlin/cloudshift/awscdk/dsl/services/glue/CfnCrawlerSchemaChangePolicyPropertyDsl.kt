@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnCrawler

@CdkDslMarker
public class CfnCrawlerSchemaChangePolicyPropertyDsl {
  private val cdkBuilder: CfnCrawler.SchemaChangePolicyProperty.Builder =
      CfnCrawler.SchemaChangePolicyProperty.builder()

  public fun deleteBehavior(deleteBehavior: String) {
    cdkBuilder.deleteBehavior(deleteBehavior)
  }

  public fun updateBehavior(updateBehavior: String) {
    cdkBuilder.updateBehavior(updateBehavior)
  }

  public fun build(): CfnCrawler.SchemaChangePolicyProperty = cdkBuilder.build()
}
