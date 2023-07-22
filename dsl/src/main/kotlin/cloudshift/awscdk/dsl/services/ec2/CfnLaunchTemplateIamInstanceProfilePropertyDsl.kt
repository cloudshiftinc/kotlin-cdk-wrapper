@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies an IAM instance profile, which is a container for an IAM role for your instance.
 *
 * You can use an IAM role to distribute your AWS credentials to your instances.
 *
 * If you are creating the launch template for use with an Amazon EC2 Auto Scaling group, you can
 * specify either the name or the ARN of the instance profile, but not both.
 *
 * `IamInstanceProfile` is a property of [AWS::EC2::LaunchTemplate
 * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * IamInstanceProfileProperty iamInstanceProfileProperty = IamInstanceProfileProperty.builder()
 * .arn("arn")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-iaminstanceprofile.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateIamInstanceProfilePropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.IamInstanceProfileProperty.Builder =
      CfnLaunchTemplate.IamInstanceProfileProperty.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the instance profile.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param name The name of the instance profile.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnLaunchTemplate.IamInstanceProfileProperty = cdkBuilder.build()
}
