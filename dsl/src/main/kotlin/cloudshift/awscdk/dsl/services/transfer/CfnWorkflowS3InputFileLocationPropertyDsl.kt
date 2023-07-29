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
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * Specifies the details for the Amazon S3 location for an input file to a workflow.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * S3InputFileLocationProperty s3InputFileLocationProperty = S3InputFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3inputfilelocation.html)
 */
@CdkDslMarker
public class CfnWorkflowS3InputFileLocationPropertyDsl {
    private val cdkBuilder: CfnWorkflow.S3InputFileLocationProperty.Builder =
        CfnWorkflow.S3InputFileLocationProperty.builder()

    /** @param bucket Specifies the S3 bucket for the customer input file. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param key The name assigned to the file when it was created in Amazon S3. You use the object
     *   key to retrieve the object.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnWorkflow.S3InputFileLocationProperty = cdkBuilder.build()
}
