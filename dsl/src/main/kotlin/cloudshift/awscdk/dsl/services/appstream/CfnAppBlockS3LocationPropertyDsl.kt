@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnAppBlock

@CdkDslMarker
public class CfnAppBlockS3LocationPropertyDsl {
  private val cdkBuilder: CfnAppBlock.S3LocationProperty.Builder =
      CfnAppBlock.S3LocationProperty.builder()

  /**
   * @param s3Bucket The S3 bucket of the app block. 
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3Key The S3 key of the S3 object of the virtual hard disk.
   * This is required when it's used by `SetupScriptDetails` and `PostSetupScriptDetails` .
   */
  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  public fun build(): CfnAppBlock.S3LocationProperty = cdkBuilder.build()
}
