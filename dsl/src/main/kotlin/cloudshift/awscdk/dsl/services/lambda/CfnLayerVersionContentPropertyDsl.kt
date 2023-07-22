@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnLayerVersion

@CdkDslMarker
public class CfnLayerVersionContentPropertyDsl {
  private val cdkBuilder: CfnLayerVersion.ContentProperty.Builder =
      CfnLayerVersion.ContentProperty.builder()

  /**
   * @param s3Bucket The Amazon S3 bucket of the layer archive. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3Key The Amazon S3 key of the layer archive. 
   */
  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  /**
   * @param s3ObjectVersion For versioned objects, the version of the layer archive object to use.
   */
  public fun s3ObjectVersion(s3ObjectVersion: String) {
    cdkBuilder.s3ObjectVersion(s3ObjectVersion)
  }

  public fun build(): CfnLayerVersion.ContentProperty = cdkBuilder.build()
}
