@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionResourceDataContainerPropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.ResourceDataContainerProperty.Builder =
      CfnResourceDefinition.ResourceDataContainerProperty.builder()

  public fun localDeviceResourceData(localDeviceResourceData: IResolvable) {
    cdkBuilder.localDeviceResourceData(localDeviceResourceData)
  }

  public
      fun localDeviceResourceData(localDeviceResourceData: CfnResourceDefinition.LocalDeviceResourceDataProperty) {
    cdkBuilder.localDeviceResourceData(localDeviceResourceData)
  }

  public fun localVolumeResourceData(localVolumeResourceData: IResolvable) {
    cdkBuilder.localVolumeResourceData(localVolumeResourceData)
  }

  public
      fun localVolumeResourceData(localVolumeResourceData: CfnResourceDefinition.LocalVolumeResourceDataProperty) {
    cdkBuilder.localVolumeResourceData(localVolumeResourceData)
  }

  public fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable) {
    cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData)
  }

  public
      fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: CfnResourceDefinition.S3MachineLearningModelResourceDataProperty) {
    cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData)
  }

  public
      fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: IResolvable) {
    cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData)
  }

  public
      fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty) {
    cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData)
  }

  public fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable) {
    cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData)
  }

  public
      fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: CfnResourceDefinition.SecretsManagerSecretResourceDataProperty) {
    cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData)
  }

  public fun build(): CfnResourceDefinition.ResourceDataContainerProperty = cdkBuilder.build()
}
