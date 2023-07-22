@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@CdkDslMarker
public class CfnResourceDefinitionVersionResourceInstancePropertyDsl {
  private val cdkBuilder: CfnResourceDefinitionVersion.ResourceInstanceProperty.Builder =
      CfnResourceDefinitionVersion.ResourceInstanceProperty.builder()

  /**
   * @param id A descriptive or arbitrary ID for the resource. 
   * This value must be unique within the resource definition version. Maximum length is 128
   * characters with pattern `[a-zA-Z0-9:_-]+` .
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param name The descriptive resource name, which is displayed on the AWS IoT Greengrass
   * console. 
   * Maximum length 128 characters with pattern [a-zA-Z0-9:_-]+. This must be unique within a
   * Greengrass group.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param resourceDataContainer A container for resource data. 
   * The container takes only one of the following supported resource data types:
   * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
   * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
   * `SecretsManagerSecretResourceData` .
   *
   *
   * Only one resource type can be defined for a `ResourceDataContainer` instance.
   */
  public fun resourceDataContainer(resourceDataContainer: IResolvable) {
    cdkBuilder.resourceDataContainer(resourceDataContainer)
  }

  /**
   * @param resourceDataContainer A container for resource data. 
   * The container takes only one of the following supported resource data types:
   * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
   * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
   * `SecretsManagerSecretResourceData` .
   *
   *
   * Only one resource type can be defined for a `ResourceDataContainer` instance.
   */
  public
      fun resourceDataContainer(resourceDataContainer: CfnResourceDefinitionVersion.ResourceDataContainerProperty) {
    cdkBuilder.resourceDataContainer(resourceDataContainer)
  }

  public fun build(): CfnResourceDefinitionVersion.ResourceInstanceProperty = cdkBuilder.build()
}
