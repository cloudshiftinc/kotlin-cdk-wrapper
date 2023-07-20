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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.DestinationConfigurationProperty.Builder =
        CfnLoggingConfiguration.DestinationConfigurationProperty.builder()

    public fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    public fun cloudWatchLogs(cloudWatchLogs: CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs)
    }

    public fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose)
    }

    public fun firehose(firehose: CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty) {
        cdkBuilder.firehose(firehose)
    }

    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    public fun s3(s3: CfnLoggingConfiguration.S3DestinationConfigurationProperty) {
        cdkBuilder.s3(s3)
    }

    public fun build(): CfnLoggingConfiguration.DestinationConfigurationProperty = cdkBuilder.build()
}
