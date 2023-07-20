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
public class CfnFlowUpsolverDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.UpsolverDestinationPropertiesProperty.Builder =
        CfnFlow.UpsolverDestinationPropertiesProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun s3OutputFormatConfig(s3OutputFormatConfig: IResolvable) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
    }

    public fun s3OutputFormatConfig(s3OutputFormatConfig: CfnFlow.UpsolverS3OutputFormatConfigProperty) {
        cdkBuilder.s3OutputFormatConfig(s3OutputFormatConfig)
    }

    public fun build(): CfnFlow.UpsolverDestinationPropertiesProperty = cdkBuilder.build()
}
