@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupTagPropertyPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.TagPropertyProperty.Builder =
      CfnAutoScalingGroup.TagPropertyProperty.builder()

  /**
   * @param key The tag key. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param propagateAtLaunch Set to `true` if you want CloudFormation to copy the tag to EC2
   * instances that are launched as part of the Auto Scaling group. 
   * Set to `false` if you want the tag attached only to the Auto Scaling group and not copied to
   * any instances launched as part of the Auto Scaling group.
   */
  public fun propagateAtLaunch(propagateAtLaunch: Boolean) {
    cdkBuilder.propagateAtLaunch(propagateAtLaunch)
  }

  /**
   * @param propagateAtLaunch Set to `true` if you want CloudFormation to copy the tag to EC2
   * instances that are launched as part of the Auto Scaling group. 
   * Set to `false` if you want the tag attached only to the Auto Scaling group and not copied to
   * any instances launched as part of the Auto Scaling group.
   */
  public fun propagateAtLaunch(propagateAtLaunch: IResolvable) {
    cdkBuilder.propagateAtLaunch(propagateAtLaunch)
  }

  /**
   * @param value The tag value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAutoScalingGroup.TagPropertyProperty = cdkBuilder.build()
}
