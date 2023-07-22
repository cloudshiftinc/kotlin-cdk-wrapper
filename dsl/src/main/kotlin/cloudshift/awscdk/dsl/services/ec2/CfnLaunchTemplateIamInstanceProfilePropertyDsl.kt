@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

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
