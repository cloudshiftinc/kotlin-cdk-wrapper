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

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration

@CdkDslMarker
public class CfnRecordingConfigurationDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnRecordingConfiguration.DestinationConfigurationProperty.Builder =
        CfnRecordingConfiguration.DestinationConfigurationProperty.builder()

    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    public fun s3(s3: CfnRecordingConfiguration.S3DestinationConfigurationProperty) {
        cdkBuilder.s3(s3)
    }

    public fun build(): CfnRecordingConfiguration.DestinationConfigurationProperty =
        cdkBuilder.build()
}
