@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition

@CdkDslMarker
public class CfnSubscriptionDefinitionSubscriptionPropertyDsl {
  private val cdkBuilder: CfnSubscriptionDefinition.SubscriptionProperty.Builder =
      CfnSubscriptionDefinition.SubscriptionProperty.builder()

  /**
   * @param id A descriptive or arbitrary ID for the subscription. 
   * This value must be unique within the subscription definition version. Maximum length is 128
   * characters with pattern `[a-zA-Z0-9:_-]+` .
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param source The originator of the message. 
   * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version, a
   * connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * @param subject The MQTT topic used to route the message. 
   */
  public fun subject(subject: String) {
    cdkBuilder.subject(subject)
  }

  /**
   * @param target The destination of the message. 
   * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version, a
   * connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
   */
  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnSubscriptionDefinition.SubscriptionProperty = cdkBuilder.build()
}
