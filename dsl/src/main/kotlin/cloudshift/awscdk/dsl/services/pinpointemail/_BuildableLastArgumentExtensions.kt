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

package cloudshift.awscdk.dsl.services.pinpointemail

import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import kotlin.Unit

public inline fun CfnConfigurationSetEventDestination.setEventDestination(
    block: CfnConfigurationSetEventDestinationEventDestinationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnConfigurationSetEventDestinationEventDestinationPropertyDsl()
    builder.apply(block)
    return setEventDestination(builder.build())
}

public inline fun CfnIdentity.setMailFromAttributes(
    block: CfnIdentityMailFromAttributesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnIdentityMailFromAttributesPropertyDsl()
    builder.apply(block)
    return setMailFromAttributes(builder.build())
}

public inline fun CfnConfigurationSet.setDeliveryOptions(
    block: CfnConfigurationSetDeliveryOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnConfigurationSetDeliveryOptionsPropertyDsl()
    builder.apply(block)
    return setDeliveryOptions(builder.build())
}

public inline fun CfnConfigurationSet.setReputationOptions(
    block: CfnConfigurationSetReputationOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnConfigurationSetReputationOptionsPropertyDsl()
    builder.apply(block)
    return setReputationOptions(builder.build())
}

public inline fun CfnConfigurationSet.setSendingOptions(
    block: CfnConfigurationSetSendingOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnConfigurationSetSendingOptionsPropertyDsl()
    builder.apply(block)
    return setSendingOptions(builder.build())
}

public inline fun CfnConfigurationSet.setTrackingOptions(
    block: CfnConfigurationSetTrackingOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnConfigurationSetTrackingOptionsPropertyDsl()
    builder.apply(block)
    return setTrackingOptions(builder.build())
}
