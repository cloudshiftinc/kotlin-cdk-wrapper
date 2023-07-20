@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageFileSourcePropertyDsl {
  private val cdkBuilder: CfnModelPackage.FileSourceProperty.Builder =
      CfnModelPackage.FileSourceProperty.builder()

  public fun contentDigest(contentDigest: String) {
    cdkBuilder.contentDigest(contentDigest)
  }

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnModelPackage.FileSourceProperty = cdkBuilder.build()
}
