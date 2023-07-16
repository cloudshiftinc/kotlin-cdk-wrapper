@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sns.CfnTopic

@CdkDslMarker
public class CfnTopicSubscriptionPropertyDsl {
  private val cdkBuilder: CfnTopic.SubscriptionProperty.Builder =
      CfnTopic.SubscriptionProperty.builder()

  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnTopic.SubscriptionProperty = cdkBuilder.build()
}
