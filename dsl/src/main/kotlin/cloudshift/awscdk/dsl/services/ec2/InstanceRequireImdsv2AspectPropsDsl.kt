@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps

/**
 * Properties for `InstanceRequireImdsv2Aspect`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * InstanceRequireImdsv2AspectProps instanceRequireImdsv2AspectProps =
 * InstanceRequireImdsv2AspectProps.builder()
 * .suppressLaunchTemplateWarning(false)
 * .suppressWarnings(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class InstanceRequireImdsv2AspectPropsDsl {
  private val cdkBuilder: InstanceRequireImdsv2AspectProps.Builder =
      InstanceRequireImdsv2AspectProps.builder()

  /**
   * @param suppressLaunchTemplateWarning Whether warnings that would be raised when an Instance is
   * associated with an existing Launch Template should be suppressed or not.
   * You can set this to `true` if `LaunchTemplateImdsAspect` is being used alongside this Aspect to
   * suppress false-positive warnings because any Launch Templates associated with Instances will
   * still be covered.
   */
  public fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean) {
    cdkBuilder.suppressLaunchTemplateWarning(suppressLaunchTemplateWarning)
  }

  /**
   * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
   * not.
   */
  public fun suppressWarnings(suppressWarnings: Boolean) {
    cdkBuilder.suppressWarnings(suppressWarnings)
  }

  public fun build(): InstanceRequireImdsv2AspectProps = cdkBuilder.build()
}
