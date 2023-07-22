@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageValidationProfilePropertyDsl {
  private val cdkBuilder: CfnModelPackage.ValidationProfileProperty.Builder =
      CfnModelPackage.ValidationProfileProperty.builder()

  /**
   * @param profileName The name of the profile for the model package. 
   */
  public fun profileName(profileName: String) {
    cdkBuilder.profileName(profileName)
  }

  /**
   * @param transformJobDefinition The `TransformJobDefinition` object that describes the transform
   * job used for the validation of the model package. 
   */
  public fun transformJobDefinition(transformJobDefinition: IResolvable) {
    cdkBuilder.transformJobDefinition(transformJobDefinition)
  }

  /**
   * @param transformJobDefinition The `TransformJobDefinition` object that describes the transform
   * job used for the validation of the model package. 
   */
  public
      fun transformJobDefinition(transformJobDefinition: CfnModelPackage.TransformJobDefinitionProperty) {
    cdkBuilder.transformJobDefinition(transformJobDefinition)
  }

  public fun build(): CfnModelPackage.ValidationProfileProperty = cdkBuilder.build()
}
