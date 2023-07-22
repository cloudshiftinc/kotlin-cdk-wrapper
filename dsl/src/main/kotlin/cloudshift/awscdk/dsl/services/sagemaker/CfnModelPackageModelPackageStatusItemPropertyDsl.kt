@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

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
