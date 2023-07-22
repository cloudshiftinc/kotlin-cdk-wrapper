@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

/**
 * The configuration for the cluster of resources used to run the processing job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .volumeSizeInGb(123)
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelqualityjobdefinition-clusterconfig.html)
 */
@CdkDslMarker
public class CfnModelQualityJobDefinitionClusterConfigPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.ClusterConfigProperty.Builder =
      CfnModelQualityJobDefinition.ClusterConfigProperty.builder()

  /**
   * @param instanceCount The number of ML compute instances to use in the model monitoring job. 
   * For distributed processing jobs, specify a value greater than 1. The default value is 1.
   */
  public fun instanceCount(instanceCount: Number) {
    cdkBuilder.instanceCount(instanceCount)
  }

  /**
   * @param instanceType The ML compute instance type for the processing job. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param volumeKmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses
   * to encrypt data on the storage volume attached to the ML compute instance(s) that run the model
   * monitoring job.
   */
  public fun volumeKmsKeyId(volumeKmsKeyId: String) {
    cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
  }

  /**
   * @param volumeSizeInGb The size of the ML storage volume, in gigabytes, that you want to
   * provision. 
   * You must specify sufficient ML storage for your scenario.
   */
  public fun volumeSizeInGb(volumeSizeInGb: Number) {
    cdkBuilder.volumeSizeInGb(volumeSizeInGb)
  }

  public fun build(): CfnModelQualityJobDefinition.ClusterConfigProperty = cdkBuilder.build()
}
