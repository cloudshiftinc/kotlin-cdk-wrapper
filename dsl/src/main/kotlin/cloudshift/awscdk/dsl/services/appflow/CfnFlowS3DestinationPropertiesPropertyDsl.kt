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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowS3DestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.S3DestinationPropertiesProperty.Builder =
        CfnFlow.S3DestinationPropertiesProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
    }

    public fun s3OutputFormatConfig(s3OutputFormatConfig: CfnFlow.S3OutputFormatConfigProperty) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
    }

    public fun build(): CfnFlow.S3DestinationPropertiesProperty = cdkBuilder.build()
}
