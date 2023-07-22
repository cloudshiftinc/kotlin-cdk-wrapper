@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionResourceDataContainerPropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.ResourceDataContainerProperty.Builder =
      CfnResourceDefinition.ResourceDataContainerProperty.builder()

  /**
   * @param localDeviceResourceData Settings for a local device resource.
   */
  public fun localDeviceResourceData(localDeviceResourceData: IResolvable) {
    cdkBuilder.localDeviceResourceData(localDeviceResourceData)
  }

  /**
   * @param localDeviceResourceData Settings for a local device resource.
   */
  public
      fun localDeviceResourceData(localDeviceResourceData: CfnResourceDefinition.LocalDeviceResourceDataProperty) {
    cdkBuilder.localDeviceResourceData(localDeviceResourceData)
  }

  /**
   * @param localVolumeResourceData Settings for a local volume resource.
   */
  public fun localVolumeResourceData(localVolumeResourceData: IResolvable) {
    cdkBuilder.localVolumeResourceData(localVolumeResourceData)
  }

  /**
   * @param localVolumeResourceData Settings for a local volume resource.
   */
  public
      fun localVolumeResourceData(localVolumeResourceData: CfnResourceDefinition.LocalVolumeResourceDataProperty) {
    cdkBuilder.localVolumeResourceData(localVolumeResourceData)
  }

  /**
   * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored in
   * Amazon S3 .
   */
  public fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable) {
    cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData)
  }

  /**
   * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored in
   * Amazon S3 .
   */
  public
      fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: CfnResourceDefinition.S3MachineLearningModelResourceDataProperty) {
    cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData)
  }

  /**
   * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource saved
   * as an SageMaker training job.
   */
  public
      fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: IResolvable) {
    cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData)
  }

  /**
   * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource saved
   * as an SageMaker training job.
   */
  public
      fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty) {
    cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData)
  }

  /**
   * @param secretsManagerSecretResourceData Settings for a secret resource.
   */
  public fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable) {
    cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData)
  }

  /**
   * @param secretsManagerSecretResourceData Settings for a secret resource.
   */
  public
      fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: CfnResourceDefinition.SecretsManagerSecretResourceDataProperty) {
    cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData)
  }

  public fun build(): CfnResourceDefinition.ResourceDataContainerProperty = cdkBuilder.build()
}
