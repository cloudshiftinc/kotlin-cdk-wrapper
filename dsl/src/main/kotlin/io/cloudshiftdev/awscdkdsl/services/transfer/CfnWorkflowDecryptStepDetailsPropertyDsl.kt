@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * Details for a step that decrypts an encrypted file.
 *
 * Consists of the following values:
 * * A descriptive name
 * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
 *   decrypt.
 * * An S3 or Amazon EFS location for the destination of the file decryption.
 * * A flag that indicates whether to overwrite an existing file of the same name. The default is
 *   `FALSE` .
 * * The type of encryption that's used. Currently, only PGP encryption is supported.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * DecryptStepDetailsProperty decryptStepDetailsProperty = DecryptStepDetailsProperty.builder()
 * .destinationFileLocation(InputFileLocationProperty.builder()
 * .efsFileLocation(EfsInputFileLocationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .path("path")
 * .build())
 * .s3FileLocation(S3InputFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build())
 * .name("name")
 * .overwriteExisting("overwriteExisting")
 * .sourceFileLocation("sourceFileLocation")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html)
 */
@CdkDslMarker
public class CfnWorkflowDecryptStepDetailsPropertyDsl {
    private val cdkBuilder: CfnWorkflow.DecryptStepDetailsProperty.Builder =
        CfnWorkflow.DecryptStepDetailsProperty.builder()

    /**
     * @param destinationFileLocation Specifies the location for the file being decrypted. Use
     *   `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
     *   destination prefix by username or uploaded date.
     * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
     *   files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user
     *   that uploaded the file.
     * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt uploaded
     *   files to an Amazon S3 bucket that is prefixed with the date of the upload.
     *
     * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
     * file is uploaded in UTC.
     */
    public fun destinationFileLocation(destinationFileLocation: IResolvable) {
        cdkBuilder.destinationFileLocation(destinationFileLocation)
    }

    /**
     * @param destinationFileLocation Specifies the location for the file being decrypted. Use
     *   `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
     *   destination prefix by username or uploaded date.
     * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
     *   files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user
     *   that uploaded the file.
     * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt uploaded
     *   files to an Amazon S3 bucket that is prefixed with the date of the upload.
     *
     * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
     * file is uploaded in UTC.
     */
    public fun destinationFileLocation(
        destinationFileLocation: CfnWorkflow.InputFileLocationProperty
    ) {
        cdkBuilder.destinationFileLocation(destinationFileLocation)
    }

    /** @param name The name of the step, used as an identifier. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param overwriteExisting A flag that indicates whether to overwrite an existing file of the
     *   same name. The default is `FALSE` . If the workflow is processing a file that has the same
     *   name as an existing file, the behavior is as follows:
     * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
     *   processed.
     * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
     */
    public fun overwriteExisting(overwriteExisting: String) {
        cdkBuilder.overwriteExisting(overwriteExisting)
    }

    /**
     * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
     *   the output from the previous step, or the originally uploaded file for the workflow.
     * * To use the previous file as the input, enter `${previous.file}` . In this case, this
     *   workflow step uses the output file from the previous workflow step as input. This is the
     *   default value.
     * * To use the originally uploaded file location as input for this step, enter
     *   `${original.file}` .
     */
    public fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
    }

    /** @param type The type of encryption used. Currently, this value must be `PGP` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnWorkflow.DecryptStepDetailsProperty = cdkBuilder.build()
}
