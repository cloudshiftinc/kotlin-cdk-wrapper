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
import software.amazon.awscdk.services.transfer.CfnWorkflow

/**
 * Specifies the key-value pair that are assigned to a file during the execution of a Tagging step.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * S3TagProperty s3TagProperty = S3TagProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3tag.html)
 */
@CdkDslMarker
public class CfnWorkflowS3TagPropertyDsl {
    private val cdkBuilder: CfnWorkflow.S3TagProperty.Builder = CfnWorkflow.S3TagProperty.builder()

    /** @param key The name assigned to the tag that you create. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value that corresponds to the key. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnWorkflow.S3TagProperty = cdkBuilder.build()
}
