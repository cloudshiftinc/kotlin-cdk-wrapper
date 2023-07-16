@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnWebhook

@CdkDslMarker
public class CfnWebhookWebhookFilterRulePropertyDsl {
  private val cdkBuilder: CfnWebhook.WebhookFilterRuleProperty.Builder =
      CfnWebhook.WebhookFilterRuleProperty.builder()

  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  public fun matchEquals(matchEquals: String) {
    cdkBuilder.matchEquals(matchEquals)
  }

  public fun build(): CfnWebhook.WebhookFilterRuleProperty = cdkBuilder.build()
}
