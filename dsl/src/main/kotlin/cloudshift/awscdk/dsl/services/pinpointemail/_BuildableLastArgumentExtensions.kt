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

package cloudshift.awscdk.dsl.services.pinpointemail

import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.pinpointemail.CfnIdentity

/** An object that defines the event destination. */
public inline fun CfnConfigurationSetEventDestination.setEventDestination(
    block: CfnConfigurationSetEventDestinationEventDestinationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetEventDestinationEventDestinationPropertyDsl()
    builder.apply(block)
    return setEventDestination(builder.build())
}

/** Used to enable or disable the custom Mail-From domain configuration for an email identity. */
public inline fun CfnIdentity.setMailFromAttributes(
    block: CfnIdentityMailFromAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIdentityMailFromAttributesPropertyDsl()
    builder.apply(block)
    return setMailFromAttributes(builder.build())
}

/**
 * An object that defines the dedicated IP pool that is used to send emails that you send using the
 * configuration set.
 */
public inline fun CfnConfigurationSet.setDeliveryOptions(
    block: CfnConfigurationSetDeliveryOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetDeliveryOptionsPropertyDsl()
    builder.apply(block)
    return setDeliveryOptions(builder.build())
}

/**
 * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails
 * that you send that use the configuration set.
 */
public inline fun CfnConfigurationSet.setReputationOptions(
    block: CfnConfigurationSetReputationOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetReputationOptionsPropertyDsl()
    builder.apply(block)
    return setReputationOptions(builder.build())
}

/**
 * An object that defines whether or not Amazon Pinpoint can send email that you send using the
 * configuration set.
 */
public inline fun CfnConfigurationSet.setSendingOptions(
    block: CfnConfigurationSetSendingOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetSendingOptionsPropertyDsl()
    builder.apply(block)
    return setSendingOptions(builder.build())
}

/**
 * An object that defines the open and click tracking options for emails that you send using the
 * configuration set.
 */
public inline fun CfnConfigurationSet.setTrackingOptions(
    block: CfnConfigurationSetTrackingOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetTrackingOptionsPropertyDsl()
    builder.apply(block)
    return setTrackingOptions(builder.build())
}
