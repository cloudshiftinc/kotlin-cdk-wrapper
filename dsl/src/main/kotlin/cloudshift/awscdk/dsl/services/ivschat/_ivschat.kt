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

import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import software.amazon.awscdk.services.ivschat.CfnLoggingConfigurationProps
import software.amazon.awscdk.services.ivschat.CfnRoom
import software.amazon.awscdk.services.ivschat.CfnRoomProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object ivschat {
    public inline fun cfnLoggingConfiguration(
        scope: Construct,
        id: String,
        block: CfnLoggingConfigurationDsl.() -> Unit = {},
    ): CfnLoggingConfiguration {
        val builder = CfnLoggingConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoggingConfigurationCloudWatchLogsDestinationConfigurationProperty(
        block: CfnLoggingConfigurationCloudWatchLogsDestinationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty {
        val builder = CfnLoggingConfigurationCloudWatchLogsDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoggingConfigurationDestinationConfigurationProperty(
        block: CfnLoggingConfigurationDestinationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnLoggingConfiguration.DestinationConfigurationProperty {
        val builder = CfnLoggingConfigurationDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoggingConfigurationFirehoseDestinationConfigurationProperty(
        block: CfnLoggingConfigurationFirehoseDestinationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty {
        val builder = CfnLoggingConfigurationFirehoseDestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoggingConfigurationProps(
        block: CfnLoggingConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnLoggingConfigurationProps {
        val builder = CfnLoggingConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLoggingConfigurationS3DestinationConfigurationProperty(
        block: CfnLoggingConfigurationS3DestinationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnLoggingConfiguration.S3DestinationConfigurationProperty {
        val builder = CfnLoggingConfigurationS3DestinationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRoom(
        scope: Construct,
        id: String,
        block: CfnRoomDsl.() -> Unit = {},
    ): CfnRoom {
        val builder = CfnRoomDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRoomMessageReviewHandlerProperty(
        block: CfnRoomMessageReviewHandlerPropertyDsl.() -> Unit =
            {},
    ): CfnRoom.MessageReviewHandlerProperty {
        val builder = CfnRoomMessageReviewHandlerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRoomProps(block: CfnRoomPropsDsl.() -> Unit = {}): CfnRoomProps {
        val builder = CfnRoomPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
