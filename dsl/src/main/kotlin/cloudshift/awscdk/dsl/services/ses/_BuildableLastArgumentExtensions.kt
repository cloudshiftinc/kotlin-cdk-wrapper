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

package cloudshift.awscdk.dsl.services.ses

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.amazon.awscdk.services.ses.CfnReceiptFilter
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.ConfigurationSet
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.IReceiptRuleSet
import software.amazon.awscdk.services.ses.ReceiptRule
import software.amazon.awscdk.services.ses.ReceiptRuleSet

/** Specifies additional settings for your VDM configuration as applicable to the Dashboard. */
public inline fun CfnVdmAttributes.setDashboardAttributes(
    block: CfnVdmAttributesDashboardAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVdmAttributesDashboardAttributesPropertyDsl()
    builder.apply(block)
    return setDashboardAttributes(builder.build())
}

/** Specifies additional settings for your VDM configuration as applicable to the Guardian. */
public inline fun CfnVdmAttributes.setGuardianAttributes(
    block: CfnVdmAttributesGuardianAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVdmAttributesGuardianAttributesPropertyDsl()
    builder.apply(block)
    return setGuardianAttributes(builder.build())
}

/** The event destination object. */
public inline fun CfnConfigurationSetEventDestination.setEventDestination(
    block: CfnConfigurationSetEventDestinationEventDestinationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetEventDestinationEventDestinationPropertyDsl()
    builder.apply(block)
    return setEventDestination(builder.build())
}

/**
 * Adds an event destination to this configuration set.
 *
 * @param id
 * @param options
 */
public inline fun ConfigurationSet.addEventDestination(
    id: String,
    block: ConfigurationSetEventDestinationOptionsDsl.() -> Unit = {}
): ConfigurationSetEventDestination {
    val builder = ConfigurationSetEventDestinationOptionsDsl()
    builder.apply(block)
    return addEventDestination(id, builder.build())
}

/**
 * Adds a new receipt rule in this rule set.
 *
 * The new rule is added after the last added rule unless `after` is specified.
 *
 * @param id
 * @param options
 */
public inline fun ReceiptRuleSet.addRule(
    id: String,
    block: ReceiptRuleOptionsDsl.() -> Unit = {}
): ReceiptRule {
    val builder = ReceiptRuleOptionsDsl()
    builder.apply(block)
    return addRule(id, builder.build())
}

/**
 * A data structure that describes the IP address filter to create, which consists of a name, an IP
 * address range, and whether to allow or block mail from it.
 */
public inline fun CfnReceiptFilter.setFilter(
    block: CfnReceiptFilterFilterPropertyDsl.() -> Unit = {}
) {
    val builder = CfnReceiptFilterFilterPropertyDsl()
    builder.apply(block)
    return setFilter(builder.build())
}

/**
 * The content of the email, composed of a subject line and either an HTML part or a text-only part.
 */
public inline fun CfnTemplate.setTemplate(block: CfnTemplateTemplatePropertyDsl.() -> Unit = {}) {
    val builder = CfnTemplateTemplatePropertyDsl()
    builder.apply(block)
    return setTemplate(builder.build())
}

/** Used to associate a configuration set with an email identity. */
public inline fun CfnEmailIdentity.setConfigurationSetAttributes(
    block: CfnEmailIdentityConfigurationSetAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEmailIdentityConfigurationSetAttributesPropertyDsl()
    builder.apply(block)
    return setConfigurationSetAttributes(builder.build())
}

/** An object that contains information about the DKIM attributes for the identity. */
public inline fun CfnEmailIdentity.setDkimAttributes(
    block: CfnEmailIdentityDkimAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEmailIdentityDkimAttributesPropertyDsl()
    builder.apply(block)
    return setDkimAttributes(builder.build())
}

/**
 * If your request includes this object, Amazon SES configures the identity to use Bring Your Own
 * DKIM (BYODKIM) for DKIM authentication purposes, or, configures the key length to be used for
 * [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html) .
 */
public inline fun CfnEmailIdentity.setDkimSigningAttributes(
    block: CfnEmailIdentityDkimSigningAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEmailIdentityDkimSigningAttributesPropertyDsl()
    builder.apply(block)
    return setDkimSigningAttributes(builder.build())
}

/** Used to enable or disable feedback forwarding for an identity. */
public inline fun CfnEmailIdentity.setFeedbackAttributes(
    block: CfnEmailIdentityFeedbackAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEmailIdentityFeedbackAttributesPropertyDsl()
    builder.apply(block)
    return setFeedbackAttributes(builder.build())
}

/** Used to enable or disable the custom Mail-From domain configuration for an email identity. */
public inline fun CfnEmailIdentity.setMailFromAttributes(
    block: CfnEmailIdentityMailFromAttributesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnEmailIdentityMailFromAttributesPropertyDsl()
    builder.apply(block)
    return setMailFromAttributes(builder.build())
}

/**
 * Adds a new receipt rule in this rule set.
 *
 * The new rule is added after the last added rule unless `after` is specified.
 *
 * @param id
 * @param options
 */
public inline fun IReceiptRuleSet.addRule(
    arg0: String,
    block: ReceiptRuleOptionsDsl.() -> Unit = {}
): ReceiptRule {
    val builder = ReceiptRuleOptionsDsl()
    builder.apply(block)
    return addRule(arg0, builder.build())
}

/**
 * A data structure that contains the specified rule's name, actions, recipients, domains, enabled
 * status, scan status, and TLS policy.
 */
public inline fun CfnReceiptRule.setRule(block: CfnReceiptRuleRulePropertyDsl.() -> Unit = {}) {
    val builder = CfnReceiptRuleRulePropertyDsl()
    builder.apply(block)
    return setRule(builder.build())
}

/**
 * Specifies whether messages that use the configuration set are required to use Transport Layer
 * Security (TLS).
 */
public inline fun CfnConfigurationSet.setDeliveryOptions(
    block: CfnConfigurationSetDeliveryOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetDeliveryOptionsPropertyDsl()
    builder.apply(block)
    return setDeliveryOptions(builder.build())
}

/** An object that represents the reputation settings for the configuration set. */
public inline fun CfnConfigurationSet.setReputationOptions(
    block: CfnConfigurationSetReputationOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetReputationOptionsPropertyDsl()
    builder.apply(block)
    return setReputationOptions(builder.build())
}

/**
 * An object that defines whether or not Amazon SES can send email that you send using the
 * configuration set.
 */
public inline fun CfnConfigurationSet.setSendingOptions(
    block: CfnConfigurationSetSendingOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetSendingOptionsPropertyDsl()
    builder.apply(block)
    return setSendingOptions(builder.build())
}

/** An object that contains information about the suppression list preferences for your account. */
public inline fun CfnConfigurationSet.setSuppressionOptions(
    block: CfnConfigurationSetSuppressionOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetSuppressionOptionsPropertyDsl()
    builder.apply(block)
    return setSuppressionOptions(builder.build())
}

/** The name of the custom open and click tracking domain associated with the configuration set. */
public inline fun CfnConfigurationSet.setTrackingOptions(
    block: CfnConfigurationSetTrackingOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetTrackingOptionsPropertyDsl()
    builder.apply(block)
    return setTrackingOptions(builder.build())
}

/** The Virtual Deliverability Manager (VDM) options that apply to the configuration set. */
public inline fun CfnConfigurationSet.setVdmOptions(
    block: CfnConfigurationSetVdmOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationSetVdmOptionsPropertyDsl()
    builder.apply(block)
    return setVdmOptions(builder.build())
}
