@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowInputFileLocationPropertyDsl {
  private val cdkBuilder: CfnWorkflow.InputFileLocationProperty.Builder =
      CfnWorkflow.InputFileLocationProperty.builder()

  /**
   * @param efsFileLocation Specifies the details for the Amazon Elastic File System (Amazon EFS)
   * file that's being decrypted.
   */
  public fun efsFileLocation(efsFileLocation: IResolvable) {
    cdkBuilder.efsFileLocation(efsFileLocation)
  }

  /**
   * @param efsFileLocation Specifies the details for the Amazon Elastic File System (Amazon EFS)
   * file that's being decrypted.
   */
  public fun efsFileLocation(efsFileLocation: CfnWorkflow.EfsInputFileLocationProperty) {
    cdkBuilder.efsFileLocation(efsFileLocation)
  }

  /**
   * @param s3FileLocation Specifies the details for the Amazon S3 file that's being copied or
   * decrypted.
   */
  public fun s3FileLocation(s3FileLocation: IResolvable) {
    cdkBuilder.s3FileLocation(s3FileLocation)
  }

  /**
   * @param s3FileLocation Specifies the details for the Amazon S3 file that's being copied or
   * decrypted.
   */
  public fun s3FileLocation(s3FileLocation: CfnWorkflow.S3InputFileLocationProperty) {
    cdkBuilder.s3FileLocation(s3FileLocation)
  }

  public fun build(): CfnWorkflow.InputFileLocationProperty = cdkBuilder.build()
}
