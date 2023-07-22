@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotS3LocationPropertyDsl {
  private val cdkBuilder: CfnBot.S3LocationProperty.Builder = CfnBot.S3LocationProperty.builder()

  /**
   * @param s3Bucket The S3 bucket name. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3ObjectKey The path and file name to the object in the S3 bucket. 
   */
  public fun s3ObjectKey(s3ObjectKey: String) {
    cdkBuilder.s3ObjectKey(s3ObjectKey)
  }

  /**
   * @param s3ObjectVersion The version of the object in the S3 bucket.
   */
  public fun s3ObjectVersion(s3ObjectVersion: String) {
    cdkBuilder.s3ObjectVersion(s3ObjectVersion)
  }

  public fun build(): CfnBot.S3LocationProperty = cdkBuilder.build()
}
