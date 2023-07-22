@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageModelPackageStatusDetailsPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ModelPackageStatusDetailsProperty.Builder =
      CfnModelPackage.ModelPackageStatusDetailsProperty.builder()

  private val _validationStatuses: MutableList<Any> = mutableListOf()

  /**
   * @param validationStatuses The validation status of the model package.
   */
  public fun validationStatuses(vararg validationStatuses: Any) {
    _validationStatuses.addAll(listOf(*validationStatuses))
  }

  /**
   * @param validationStatuses The validation status of the model package.
   */
  public fun validationStatuses(validationStatuses: Collection<Any>) {
    _validationStatuses.addAll(validationStatuses)
  }

  /**
   * @param validationStatuses The validation status of the model package.
   */
  public fun validationStatuses(validationStatuses: IResolvable) {
    cdkBuilder.validationStatuses(validationStatuses)
  }

  public fun build(): CfnModelPackage.ModelPackageStatusDetailsProperty {
    if(_validationStatuses.isNotEmpty()) cdkBuilder.validationStatuses(_validationStatuses)
    return cdkBuilder.build()
  }
}
