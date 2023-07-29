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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * The basic building block of a workflow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * Object copyStepDetails;
 * Object customStepDetails;
 * Object deleteStepDetails;
 * Object tagStepDetails;
 * WorkflowStepProperty workflowStepProperty = WorkflowStepProperty.builder()
 * .copyStepDetails(copyStepDetails)
 * .customStepDetails(customStepDetails)
 * .decryptStepDetails(DecryptStepDetailsProperty.builder()
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
 * .build())
 * .deleteStepDetails(deleteStepDetails)
 * .tagStepDetails(tagStepDetails)
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html)
 */
@CdkDslMarker
public class CfnWorkflowWorkflowStepPropertyDsl {
    private val cdkBuilder: CfnWorkflow.WorkflowStepProperty.Builder =
        CfnWorkflow.WorkflowStepProperty.builder()

    /**
     * @param copyStepDetails Details for a step that performs a file copy. Consists of the
     *   following values:
     * * A description
     * * An Amazon S3 location for the destination of the file copy.
     * * A flag that indicates whether to overwrite an existing file of the same name. The default
     *   is `FALSE` .
     */
    public fun copyStepDetails(copyStepDetails: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(copyStepDetails)
        cdkBuilder.copyStepDetails(builder.map)
    }

    /**
     * @param copyStepDetails Details for a step that performs a file copy. Consists of the
     *   following values:
     * * A description
     * * An Amazon S3 location for the destination of the file copy.
     * * A flag that indicates whether to overwrite an existing file of the same name. The default
     *   is `FALSE` .
     */
    public fun copyStepDetails(copyStepDetails: Any) {
        cdkBuilder.copyStepDetails(copyStepDetails)
    }

    /**
     * @param customStepDetails Details for a step that invokes an AWS Lambda function. Consists of
     *   the Lambda function's name, target, and timeout (in seconds).
     */
    public fun customStepDetails(customStepDetails: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customStepDetails)
        cdkBuilder.customStepDetails(builder.map)
    }

    /**
     * @param customStepDetails Details for a step that invokes an AWS Lambda function. Consists of
     *   the Lambda function's name, target, and timeout (in seconds).
     */
    public fun customStepDetails(customStepDetails: Any) {
        cdkBuilder.customStepDetails(customStepDetails)
    }

    /**
     * @param decryptStepDetails Details for a step that decrypts an encrypted file. Consists of the
     *   following values:
     * * A descriptive name
     * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
     *   decrypt.
     * * An S3 or Amazon EFS location for the destination of the file decryption.
     * * A flag that indicates whether to overwrite an existing file of the same name. The default
     *   is `FALSE` .
     * * The type of encryption that's used. Currently, only PGP encryption is supported.
     */
    public fun decryptStepDetails(decryptStepDetails: IResolvable) {
        cdkBuilder.decryptStepDetails(decryptStepDetails)
    }

    /**
     * @param decryptStepDetails Details for a step that decrypts an encrypted file. Consists of the
     *   following values:
     * * A descriptive name
     * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
     *   decrypt.
     * * An S3 or Amazon EFS location for the destination of the file decryption.
     * * A flag that indicates whether to overwrite an existing file of the same name. The default
     *   is `FALSE` .
     * * The type of encryption that's used. Currently, only PGP encryption is supported.
     */
    public fun decryptStepDetails(decryptStepDetails: CfnWorkflow.DecryptStepDetailsProperty) {
        cdkBuilder.decryptStepDetails(decryptStepDetails)
    }

    /** @param deleteStepDetails Details for a step that deletes the file. */
    public fun deleteStepDetails(deleteStepDetails: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(deleteStepDetails)
        cdkBuilder.deleteStepDetails(builder.map)
    }

    /** @param deleteStepDetails Details for a step that deletes the file. */
    public fun deleteStepDetails(deleteStepDetails: Any) {
        cdkBuilder.deleteStepDetails(deleteStepDetails)
    }

    /**
     * @param tagStepDetails Details for a step that creates one or more tags. You specify one or
     *   more tags. Each tag contains a key-value pair.
     */
    public fun tagStepDetails(tagStepDetails: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tagStepDetails)
        cdkBuilder.tagStepDetails(builder.map)
    }

    /**
     * @param tagStepDetails Details for a step that creates one or more tags. You specify one or
     *   more tags. Each tag contains a key-value pair.
     */
    public fun tagStepDetails(tagStepDetails: Any) {
        cdkBuilder.tagStepDetails(tagStepDetails)
    }

    /**
     * @param type Currently, the following step types are supported.
     * * *`COPY`* - Copy the file to another location.
     * * *`CUSTOM`* - Perform a custom step with an AWS Lambda function target.
     * * *`DECRYPT`* - Decrypt a file that was encrypted before it was uploaded.
     * * *`DELETE`* - Delete the file.
     * * *`TAG`* - Add a tag to the file.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnWorkflow.WorkflowStepProperty = cdkBuilder.build()
}
