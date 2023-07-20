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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowS3InputFormatConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.S3InputFormatConfigProperty.Builder =
        CfnFlow.S3InputFormatConfigProperty.builder()

    public fun s3InputFileType(s3InputFileType: String) {
        cdkBuilder.s3InputFileType(s3InputFileType)
    }

    public fun build(): CfnFlow.S3InputFormatConfigProperty = cdkBuilder.build()
}
