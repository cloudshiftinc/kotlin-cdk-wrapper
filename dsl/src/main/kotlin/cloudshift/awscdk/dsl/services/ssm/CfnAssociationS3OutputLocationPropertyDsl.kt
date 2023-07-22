@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnAssociation

@CdkDslMarker
public class CfnAssociationS3OutputLocationPropertyDsl {
  private val cdkBuilder: CfnAssociation.S3OutputLocationProperty.Builder =
      CfnAssociation.S3OutputLocationProperty.builder()

  /**
   * @param outputS3BucketName The name of the S3 bucket.
   */
  public fun outputS3BucketName(outputS3BucketName: String) {
    cdkBuilder.outputS3BucketName(outputS3BucketName)
  }

  /**
   * @param outputS3KeyPrefix The S3 bucket subfolder.
   */
  public fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
    cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
  }

  /**
   * @param outputS3Region The AWS Region of the S3 bucket.
   */
  public fun outputS3Region(outputS3Region: String) {
    cdkBuilder.outputS3Region(outputS3Region)
  }

  public fun build(): CfnAssociation.S3OutputLocationProperty = cdkBuilder.build()
}
