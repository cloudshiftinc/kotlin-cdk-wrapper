@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowS3FileLocationPropertyDsl {
  private val cdkBuilder: CfnWorkflow.S3FileLocationProperty.Builder =
      CfnWorkflow.S3FileLocationProperty.builder()

  /**
   * @param s3FileLocation Specifies the details for the file location for the file that's being
   * used in the workflow.
   * Only applicable if you are using Amazon S3 storage.
   */
  public fun s3FileLocation(s3FileLocation: IResolvable) {
    cdkBuilder.s3FileLocation(s3FileLocation)
  }

  /**
   * @param s3FileLocation Specifies the details for the file location for the file that's being
   * used in the workflow.
   * Only applicable if you are using Amazon S3 storage.
   */
  public fun s3FileLocation(s3FileLocation: CfnWorkflow.S3InputFileLocationProperty) {
    cdkBuilder.s3FileLocation(s3FileLocation)
  }

  public fun build(): CfnWorkflow.S3FileLocationProperty = cdkBuilder.build()
}
