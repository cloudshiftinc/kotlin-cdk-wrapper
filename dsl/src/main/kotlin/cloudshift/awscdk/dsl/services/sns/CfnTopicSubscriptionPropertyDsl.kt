@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sns.CfnTopic

@CdkDslMarker
public class CfnTopicSubscriptionPropertyDsl {
  private val cdkBuilder: CfnTopic.SubscriptionProperty.Builder =
      CfnTopic.SubscriptionProperty.builder()

  /**
   * @param endpoint The endpoint that receives notifications from the Amazon SNS topic. 
   * The endpoint value depends on the protocol that you specify. For more information, see the
   * `Endpoint` parameter of the
   * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the *Amazon
   * SNS API Reference* .
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param protocol The subscription's protocol. 
   * For more information, see the `Protocol` parameter of the
   * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the *Amazon
   * SNS API Reference* .
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnTopic.SubscriptionProperty = cdkBuilder.build()
}
