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
import software.amazon.awscdk.services.ivschat.CfnRoom
import kotlin.Unit

public inline fun CfnLoggingConfiguration.setDestinationConfiguration(
    block: CfnLoggingConfigurationDestinationConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnLoggingConfigurationDestinationConfigurationPropertyDsl()
    builder.apply(block)
    return setDestinationConfiguration(builder.build())
}

public inline fun CfnRoom.setMessageReviewHandler(
    block: CfnRoomMessageReviewHandlerPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnRoomMessageReviewHandlerPropertyDsl()
    builder.apply(block)
    return setMessageReviewHandler(builder.build())
}
