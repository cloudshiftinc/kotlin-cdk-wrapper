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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

@CdkDslMarker
public class CfnInfrastructureConfigurationLoggingPropertyDsl {
    private val cdkBuilder: CfnInfrastructureConfiguration.LoggingProperty.Builder =
        CfnInfrastructureConfiguration.LoggingProperty.builder()

    public fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs)
    }

    public fun s3Logs(s3Logs: CfnInfrastructureConfiguration.S3LogsProperty) {
        cdkBuilder.s3Logs(s3Logs)
    }

    public fun build(): CfnInfrastructureConfiguration.LoggingProperty = cdkBuilder.build()
}
