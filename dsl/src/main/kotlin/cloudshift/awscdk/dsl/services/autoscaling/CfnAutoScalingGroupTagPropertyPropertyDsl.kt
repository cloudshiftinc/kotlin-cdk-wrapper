@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * A structure that specifies a tag for the `Tags` property of
 * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html)
 * resource.
 *
 * For more information, see [Tag Auto Scaling groups and
 * instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html) in the
 * *Amazon EC2 Auto Scaling User Guide* . You can find a sample template snippet in the
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#aws-properties-as-group--examples)
 * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
 *
 * CloudFormation adds the following tags to all Auto Scaling groups and associated instances:
 *
 * * aws:cloudformation:stack-name
 * * aws:cloudformation:stack-id
 * * aws:cloudformation:logical-id
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * TagPropertyProperty tagPropertyProperty = TagPropertyProperty.builder()
 * .key("key")
 * .propagateAtLaunch(false)
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-tagproperty.html)
 */
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
