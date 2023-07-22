@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageValidationSpecificationPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ValidationSpecificationProperty.Builder =
      CfnModelPackage.ValidationSpecificationProperty.builder()

  private val _validationProfiles: MutableList<Any> = mutableListOf()

  /**
   * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of which
   * specifies a batch transform job that SageMaker runs to validate your model package. 
   */
  public fun validationProfiles(vararg validationProfiles: Any) {
    _validationProfiles.addAll(listOf(*validationProfiles))
  }

  /**
   * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of which
   * specifies a batch transform job that SageMaker runs to validate your model package. 
   */
  public fun validationProfiles(validationProfiles: Collection<Any>) {
    _validationProfiles.addAll(validationProfiles)
  }

  /**
   * @param validationProfiles An array of `ModelPackageValidationProfile` objects, each of which
   * specifies a batch transform job that SageMaker runs to validate your model package. 
   */
  public fun validationProfiles(validationProfiles: IResolvable) {
    cdkBuilder.validationProfiles(validationProfiles)
  }

  /**
   * @param validationRole The IAM roles to be used for the validation of the model package. 
   */
  public fun validationRole(validationRole: String) {
    cdkBuilder.validationRole(validationRole)
  }

  public fun build(): CfnModelPackage.ValidationSpecificationProperty {
    if(_validationProfiles.isNotEmpty()) cdkBuilder.validationProfiles(_validationProfiles)
    return cdkBuilder.build()
  }
}
