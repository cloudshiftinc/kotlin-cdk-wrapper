@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@CdkDslMarker
public class CfnResourceDefinitionVersionResourceDataContainerPropertyDsl {
  private val cdkBuilder: CfnResourceDefinitionVersion.ResourceDataContainerProperty.Builder =
      CfnResourceDefinitionVersion.ResourceDataContainerProperty.builder()

  public fun localDeviceResourceData(localDeviceResourceData: IResolvable) {
    cdkBuilder.localDeviceResourceData(localDeviceResourceData)
  }

  public
      fun localDeviceResourceData(localDeviceResourceData: CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty) {
    cdkBuilder.localDeviceResourceData(localDeviceResourceData)
  }

  public fun localVolumeResourceData(localVolumeResourceData: IResolvable) {
    cdkBuilder.localVolumeResourceData(localVolumeResourceData)
  }

  public
      fun localVolumeResourceData(localVolumeResourceData: CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty) {
    cdkBuilder.localVolumeResourceData(localVolumeResourceData)
  }

  public fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable) {
    cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData)
  }

  public
      fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty) {
    cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData)
  }

  public
      fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: IResolvable) {
    cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData)
  }

  public
      fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty) {
    cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData)
  }

  public fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable) {
    cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData)
  }

  public
      fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty) {
    cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData)
  }

  public fun build(): CfnResourceDefinitionVersion.ResourceDataContainerProperty =
      cdkBuilder.build()
}
