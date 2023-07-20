@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnWorkflow
import kotlin.String

@CdkDslMarker
public class CfnWorkflowS3TagPropertyDsl {
    private val cdkBuilder: CfnWorkflow.S3TagProperty.Builder = CfnWorkflow.S3TagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnWorkflow.S3TagProperty = cdkBuilder.build()
}
