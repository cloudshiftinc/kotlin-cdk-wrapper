@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * A key-value pair that you define in the header.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * UserPropertyProperty userPropertyProperty = UserPropertyProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-userproperty.html)
 */
@CdkDslMarker
public class CfnTopicRuleUserPropertyPropertyDsl {
  private val cdkBuilder: CfnTopicRule.UserPropertyProperty.Builder =
      CfnTopicRule.UserPropertyProperty.builder()

  /**
   * @param key A key to be specified in `UserProperty` . 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value A value to be specified in `UserProperty` . 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTopicRule.UserPropertyProperty = cdkBuilder.build()
}
