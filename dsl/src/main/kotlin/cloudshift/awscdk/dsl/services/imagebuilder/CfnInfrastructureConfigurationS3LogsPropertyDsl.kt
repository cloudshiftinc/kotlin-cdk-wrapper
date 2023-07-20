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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
import kotlin.String

@CdkDslMarker
public class CfnInfrastructureConfigurationS3LogsPropertyDsl {
    private val cdkBuilder: CfnInfrastructureConfiguration.S3LogsProperty.Builder =
        CfnInfrastructureConfiguration.S3LogsProperty.builder()

    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): CfnInfrastructureConfiguration.S3LogsProperty = cdkBuilder.build()
}
