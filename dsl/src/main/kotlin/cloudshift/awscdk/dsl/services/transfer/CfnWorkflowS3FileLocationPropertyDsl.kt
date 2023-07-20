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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow

@CdkDslMarker
public class CfnWorkflowS3FileLocationPropertyDsl {
    private val cdkBuilder: CfnWorkflow.S3FileLocationProperty.Builder =
        CfnWorkflow.S3FileLocationProperty.builder()

    public fun s3FileLocation(s3FileLocation: IResolvable) {
        cdkBuilder.s3FileLocation(s3FileLocation)
    }

    public fun s3FileLocation(s3FileLocation: CfnWorkflow.S3InputFileLocationProperty) {
        cdkBuilder.s3FileLocation(s3FileLocation)
    }

    public fun build(): CfnWorkflow.S3FileLocationProperty = cdkBuilder.build()
}
