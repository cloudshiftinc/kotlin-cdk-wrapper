@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageModelPackageStatusItemPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ModelPackageStatusItemProperty.Builder =
      CfnModelPackage.ModelPackageStatusItemProperty.builder()

  public fun failureReason(failureReason: String) {
    cdkBuilder.failureReason(failureReason)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnModelPackage.ModelPackageStatusItemProperty = cdkBuilder.build()
}
