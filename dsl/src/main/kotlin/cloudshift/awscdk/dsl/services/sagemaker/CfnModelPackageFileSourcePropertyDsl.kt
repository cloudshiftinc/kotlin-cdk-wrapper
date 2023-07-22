@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageFileSourcePropertyDsl {
  private val cdkBuilder: CfnModelPackage.FileSourceProperty.Builder =
      CfnModelPackage.FileSourceProperty.builder()

  /**
   * @param contentDigest The digest of the file source.
   */
  public fun contentDigest(contentDigest: String) {
    cdkBuilder.contentDigest(contentDigest)
  }

  /**
   * @param contentType The type of content stored in the file source.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param s3Uri The Amazon S3 URI for the file source. 
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnModelPackage.FileSourceProperty = cdkBuilder.build()
}
