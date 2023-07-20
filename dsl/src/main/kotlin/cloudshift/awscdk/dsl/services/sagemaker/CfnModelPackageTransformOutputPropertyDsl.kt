@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageTransformOutputPropertyDsl {
  private val cdkBuilder: CfnModelPackage.TransformOutputProperty.Builder =
      CfnModelPackage.TransformOutputProperty.builder()

  public fun accept(accept: String) {
    cdkBuilder.accept(accept)
  }

  public fun assembleWith(assembleWith: String) {
    cdkBuilder.assembleWith(assembleWith)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun s3OutputPath(s3OutputPath: String) {
    cdkBuilder.s3OutputPath(s3OutputPath)
  }

  public fun build(): CfnModelPackage.TransformOutputProperty = cdkBuilder.build()
}
