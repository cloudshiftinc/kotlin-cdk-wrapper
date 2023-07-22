@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect

/**
 * Aspect that applies IMDS configuration on EC2 Instance constructs.
 *
 * This aspect configures IMDS on an EC2 instance by creating a Launch Template with the
 * IMDS configuration and associating that Launch Template with the instance. If an Instance
 * is already associated with a Launch Template, a warning will (optionally) be added to the
 * construct node and it will be skipped.
 *
 * To cover Instances already associated with Launch Templates, use `LaunchTemplateImdsAspect`.
 *
 * Example:
 *
 * ```
 * InstanceRequireImdsv2Aspect aspect = new InstanceRequireImdsv2Aspect();
 * Aspects.of(this).add(aspect);
 * ```
 */
@CdkDslMarker
public class InstanceRequireImdsv2AspectDsl {
  private val cdkBuilder: InstanceRequireImdsv2Aspect.Builder =
      InstanceRequireImdsv2Aspect.Builder.create()

  /**
   * Whether warnings that would be raised when an Instance is associated with an existing Launch
   * Template should be suppressed or not.
   *
   * You can set this to `true` if `LaunchTemplateImdsAspect` is being used alongside this Aspect to
   * suppress false-positive warnings because any Launch Templates associated with Instances will
   * still be covered.
   *
   * Default: - false
   *
   * @param suppressLaunchTemplateWarning Whether warnings that would be raised when an Instance is
   * associated with an existing Launch Template should be suppressed or not. 
   */
  public fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean) {
    cdkBuilder.suppressLaunchTemplateWarning(suppressLaunchTemplateWarning)
  }

  /**
   * Whether warning annotations from this Aspect should be suppressed or not.
   *
   * Default: - false
   *
   * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
   * not. 
   */
  public fun suppressWarnings(suppressWarnings: Boolean) {
    cdkBuilder.suppressWarnings(suppressWarnings)
  }

  public fun build(): InstanceRequireImdsv2Aspect = cdkBuilder.build()
}
