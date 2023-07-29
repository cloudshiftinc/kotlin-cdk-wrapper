@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ivschat

import kotlin.Unit
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import software.amazon.awscdk.services.ivschat.CfnRoom

/**
 * The DestinationConfiguration is a complex type that contains information about where chat content
 * will be logged.
 */
public inline fun CfnLoggingConfiguration.setDestinationConfiguration(
    block: CfnLoggingConfigurationDestinationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLoggingConfigurationDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setDestinationConfiguration(builder.build())
}

/** Configuration information for optional review of messages. */
public inline fun CfnRoom.setMessageReviewHandler(
    block: CfnRoomMessageReviewHandlerPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRoomMessageReviewHandlerPropertyDsl()
    builder.apply(block)
    return setMessageReviewHandler(builder.build())
}
