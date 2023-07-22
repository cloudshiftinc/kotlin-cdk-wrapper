@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnRule

/**
 * The EventBridge action definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EventBridgeActionProperty eventBridgeActionProperty = EventBridgeActionProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-rule-eventbridgeaction.html)
 */
@CdkDslMarker
public class CfnRuleEventBridgeActionPropertyDsl {
  private val cdkBuilder: CfnRule.EventBridgeActionProperty.Builder =
      CfnRule.EventBridgeActionProperty.builder()

  /**
   * @param name The name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRule.EventBridgeActionProperty = cdkBuilder.build()
}
