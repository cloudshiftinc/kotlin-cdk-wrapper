@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowCopyStepDetailsPropertyDsl {
  private val cdkBuilder: CfnWorkflow.CopyStepDetailsProperty.Builder =
      CfnWorkflow.CopyStepDetailsProperty.builder()

  /**
   * @param destinationFileLocation Specifies the location for the file being copied.
   * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
   * destination prefix by username or uploaded date.
   *
   * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded files
   * to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that uploaded
   * the file.
   * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded files
   * to an Amazon S3 bucket that is prefixed with the date of the upload.
   *
   *
   * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the file
   * is uploaded in UTC.
   */
  public fun destinationFileLocation(destinationFileLocation: IResolvable) {
    cdkBuilder.destinationFileLocation(destinationFileLocation)
  }

  /**
   * @param destinationFileLocation Specifies the location for the file being copied.
   * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
   * destination prefix by username or uploaded date.
   *
   * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded files
   * to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that uploaded
   * the file.
   * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded files
   * to an Amazon S3 bucket that is prefixed with the date of the upload.
   *
   *
   * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the file
   * is uploaded in UTC.
   */
  public fun destinationFileLocation(destinationFileLocation: CfnWorkflow.S3FileLocationProperty) {
    cdkBuilder.destinationFileLocation(destinationFileLocation)
  }

  /**
   * @param name The name of the step, used as an identifier.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param overwriteExisting A flag that indicates whether to overwrite an existing file of the
   * same name. The default is `FALSE` .
   * If the workflow is processing a file that has the same name as an existing file, the behavior
   * is as follows:
   *
   * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
   * processed.
   * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
   */
  public fun overwriteExisting(overwriteExisting: String) {
    cdkBuilder.overwriteExisting(overwriteExisting)
  }

  /**
   * @param sourceFileLocation Specifies which file to use as input to the workflow step: either the
   * output from the previous step, or the originally uploaded file for the workflow.
   * * To use the previous file as the input, enter `${previous.file}` . In this case, this workflow
   * step uses the output file from the previous workflow step as input. This is the default value.
   * * To use the originally uploaded file location as input for this step, enter `${original.file}`
   * .
   */
  public fun sourceFileLocation(sourceFileLocation: String) {
    cdkBuilder.sourceFileLocation(sourceFileLocation)
  }

  public fun build(): CfnWorkflow.CopyStepDetailsProperty = cdkBuilder.build()
}
