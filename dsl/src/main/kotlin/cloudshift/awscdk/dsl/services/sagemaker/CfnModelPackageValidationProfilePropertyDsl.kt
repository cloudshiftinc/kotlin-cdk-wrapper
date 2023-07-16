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

  public fun profileName(profileName: String) {
    cdkBuilder.profileName(profileName)
  }

  public fun transformJobDefinition(transformJobDefinition: IResolvable) {
    cdkBuilder.transformJobDefinition(transformJobDefinition)
  }

  public
      fun transformJobDefinition(transformJobDefinition: CfnModelPackage.TransformJobDefinitionProperty) {
    cdkBuilder.transformJobDefinition(transformJobDefinition)
  }

  public fun build(): CfnModelPackage.ValidationProfileProperty = cdkBuilder.build()
}
