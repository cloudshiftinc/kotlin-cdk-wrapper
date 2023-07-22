@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Specifies the validation and image scan statuses of the model package.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelPackageStatusDetailsProperty modelPackageStatusDetailsProperty =
 * ModelPackageStatusDetailsProperty.builder()
 * .validationStatuses(List.of(ModelPackageStatusItemProperty.builder()
 * .name("name")
 * .status("status")
 * // the properties below are optional
 * .failureReason("failureReason")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusdetails.html)
 */
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
