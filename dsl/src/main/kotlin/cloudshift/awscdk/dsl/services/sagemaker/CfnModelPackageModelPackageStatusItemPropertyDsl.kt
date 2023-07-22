@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Represents the overall status of a model package.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelPackageStatusItemProperty modelPackageStatusItemProperty =
 * ModelPackageStatusItemProperty.builder()
 * .name("name")
 * .status("status")
 * // the properties below are optional
 * .failureReason("failureReason")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelpackagestatusitem.html)
 */
@CdkDslMarker
public class CfnModelPackageModelPackageStatusItemPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ModelPackageStatusItemProperty.Builder =
      CfnModelPackage.ModelPackageStatusItemProperty.builder()

  /**
   * @param failureReason if the overall status is `Failed` , the reason for the failure.
   */
  public fun failureReason(failureReason: String) {
    cdkBuilder.failureReason(failureReason)
  }

  /**
   * @param name The name of the model package for which the overall status is being reported. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param status The current status. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnModelPackage.ModelPackageStatusItemProperty = cdkBuilder.build()
}
