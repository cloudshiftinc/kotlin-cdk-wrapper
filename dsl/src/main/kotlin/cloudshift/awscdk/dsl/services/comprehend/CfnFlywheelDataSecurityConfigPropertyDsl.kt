@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnFlywheel

/**
 * Data security configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.comprehend.*;
 * DataSecurityConfigProperty dataSecurityConfigProperty = DataSecurityConfigProperty.builder()
 * .dataLakeKmsKeyId("dataLakeKmsKeyId")
 * .modelKmsKeyId("modelKmsKeyId")
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html)
 */
@CdkDslMarker
public class CfnFlywheelDataSecurityConfigPropertyDsl {
  private val cdkBuilder: CfnFlywheel.DataSecurityConfigProperty.Builder =
      CfnFlywheel.DataSecurityConfigProperty.builder()

  /**
   * @param dataLakeKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt the data
   * in the data lake.
   */
  public fun dataLakeKmsKeyId(dataLakeKmsKeyId: String) {
    cdkBuilder.dataLakeKmsKeyId(dataLakeKmsKeyId)
  }

  /**
   * @param modelKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained
   * custom models.
   * The ModelKmsKeyId can be either of the following formats:
   *
   * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
   * * Amazon Resource Name (ARN) of a KMS Key:
   * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
   */
  public fun modelKmsKeyId(modelKmsKeyId: String) {
    cdkBuilder.modelKmsKeyId(modelKmsKeyId)
  }

  /**
   * @param volumeKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt the volume.
   */
  public fun volumeKmsKeyId(volumeKmsKeyId: String) {
    cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
  }

  /**
   * @param vpcConfig Configuration parameters for an optional private Virtual Private Cloud (VPC)
   * containing the resources you are using for the job.
   * For more information, see [Amazon
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * @param vpcConfig Configuration parameters for an optional private Virtual Private Cloud (VPC)
   * containing the resources you are using for the job.
   * For more information, see [Amazon
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
   */
  public fun vpcConfig(vpcConfig: CfnFlywheel.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnFlywheel.DataSecurityConfigProperty = cdkBuilder.build()
}
