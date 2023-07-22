@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * Specifies the location for the file that's being processed.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * InputFileLocationProperty inputFileLocationProperty = InputFileLocationProperty.builder()
 * .efsFileLocation(EfsInputFileLocationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .path("path")
 * .build())
 * .s3FileLocation(S3InputFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-inputfilelocation.html)
 */
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
