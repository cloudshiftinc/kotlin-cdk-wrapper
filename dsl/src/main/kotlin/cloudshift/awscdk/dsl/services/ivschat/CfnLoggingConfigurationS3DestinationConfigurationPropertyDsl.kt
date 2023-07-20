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

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import kotlin.String

@CdkDslMarker
public class CfnLoggingConfigurationS3DestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.S3DestinationConfigurationProperty.Builder =
        CfnLoggingConfiguration.S3DestinationConfigurationProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun build(): CfnLoggingConfiguration.S3DestinationConfigurationProperty =
        cdkBuilder.build()
}
