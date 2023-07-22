@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.controltower

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.controltower.CfnEnabledControlProps

/**
 * Properties for defining a `CfnEnabledControl`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.controltower.*;
 * CfnEnabledControlProps cfnEnabledControlProps = CfnEnabledControlProps.builder()
 * .controlIdentifier("controlIdentifier")
 * .targetIdentifier("targetIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
 */
@CdkDslMarker
public class CfnEnabledControlPropsDsl {
  private val cdkBuilder: CfnEnabledControlProps.Builder = CfnEnabledControlProps.builder()

  /**
   * @param controlIdentifier The ARN of the control. 
   * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
   * *Region deny* guardrail.
   */
  public fun controlIdentifier(controlIdentifier: String) {
    cdkBuilder.controlIdentifier(controlIdentifier)
  }

  /**
   * @param targetIdentifier The ARN of the organizational unit. 
   */
  public fun targetIdentifier(targetIdentifier: String) {
    cdkBuilder.targetIdentifier(targetIdentifier)
  }

  public fun build(): CfnEnabledControlProps = cdkBuilder.build()
}
