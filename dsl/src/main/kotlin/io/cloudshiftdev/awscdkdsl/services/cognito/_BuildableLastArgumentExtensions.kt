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

package io.cloudshiftdev.awscdkdsl.services.cognito

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.ClientAttributes
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolDomain
import software.amazon.awscdk.services.cognito.UserPoolResourceServer

/** Configuration options for configuring Amazon Cognito streams. */
public inline fun CfnIdentityPool.setCognitoStreams(
    block: CfnIdentityPoolCognitoStreamsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIdentityPoolCognitoStreamsPropertyDsl()
    builder.apply(block)
    return setCognitoStreams(builder.build())
}

/** The configuration options to be applied to the identity pool. */
public inline fun CfnIdentityPool.setPushSync(
    block: CfnIdentityPoolPushSyncPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIdentityPoolPushSyncPropertyDsl()
    builder.apply(block)
    return setPushSync(builder.build())
}

/**
 * Use this setting to define which verified available method a user can use to recover their
 * password when they call `ForgotPassword` .
 */
public inline fun CfnUserPool.setAccountRecoverySetting(
    block: CfnUserPoolAccountRecoverySettingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolAccountRecoverySettingPropertyDsl()
    builder.apply(block)
    return setAccountRecoverySetting(builder.build())
}

/** The configuration for creating a new user profile. */
public inline fun CfnUserPool.setAdminCreateUserConfig(
    block: CfnUserPoolAdminCreateUserConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolAdminCreateUserConfigPropertyDsl()
    builder.apply(block)
    return setAdminCreateUserConfig(builder.build())
}

/** The device-remembering configuration for a user pool. */
public inline fun CfnUserPool.setDeviceConfiguration(
    block: CfnUserPoolDeviceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolDeviceConfigurationPropertyDsl()
    builder.apply(block)
    return setDeviceConfiguration(builder.build())
}

/** The email configuration of your user pool. */
public inline fun CfnUserPool.setEmailConfiguration(
    block: CfnUserPoolEmailConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolEmailConfigurationPropertyDsl()
    builder.apply(block)
    return setEmailConfiguration(builder.build())
}

/** The Lambda trigger configuration information for the new user pool. */
public inline fun CfnUserPool.setLambdaConfig(
    block: CfnUserPoolLambdaConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolLambdaConfigPropertyDsl()
    builder.apply(block)
    return setLambdaConfig(builder.build())
}

/** The policy associated with a user pool. */
public inline fun CfnUserPool.setPolicies(block: CfnUserPoolPoliciesPropertyDsl.() -> Unit = {}) {
    val builder = CfnUserPoolPoliciesPropertyDsl()
    builder.apply(block)
    return setPolicies(builder.build())
}

/**
 * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an
 * SMS message from your AWS account through Amazon Simple Notification Service.
 */
public inline fun CfnUserPool.setSmsConfiguration(
    block: CfnUserPoolSmsConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolSmsConfigurationPropertyDsl()
    builder.apply(block)
    return setSmsConfiguration(builder.build())
}

/** The settings for updates to user attributes. */
public inline fun CfnUserPool.setUserAttributeUpdateSettings(
    block: CfnUserPoolUserAttributeUpdateSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolUserAttributeUpdateSettingsPropertyDsl()
    builder.apply(block)
    return setUserAttributeUpdateSettings(builder.build())
}

/** User pool add-ons. */
public inline fun CfnUserPool.setUserPoolAddOns(
    block: CfnUserPoolUserPoolAddOnsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolUserPoolAddOnsPropertyDsl()
    builder.apply(block)
    return setUserPoolAddOns(builder.build())
}

/** You can choose to set case sensitivity on the username input for the selected sign-in option. */
public inline fun CfnUserPool.setUsernameConfiguration(
    block: CfnUserPoolUsernameConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolUsernameConfigurationPropertyDsl()
    builder.apply(block)
    return setUsernameConfiguration(builder.build())
}

/**
 * The template for the verification message that the user sees when the app requests permission to
 * access the user's information.
 */
public inline fun CfnUserPool.setVerificationMessageTemplate(
    block: CfnUserPoolVerificationMessageTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolVerificationMessageTemplatePropertyDsl()
    builder.apply(block)
    return setVerificationMessageTemplate(builder.build())
}

/**
 * The user pool analytics configuration for collecting metrics and sending them to your Amazon
 * Pinpoint campaign.
 */
public inline fun CfnUserPoolClient.setAnalyticsConfiguration(
    block: CfnUserPoolClientAnalyticsConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolClientAnalyticsConfigurationPropertyDsl()
    builder.apply(block)
    return setAnalyticsConfiguration(builder.build())
}

/** The units in which the validity times are represented. */
public inline fun CfnUserPoolClient.setTokenValidityUnits(
    block: CfnUserPoolClientTokenValidityUnitsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolClientTokenValidityUnitsPropertyDsl()
    builder.apply(block)
    return setTokenValidityUnits(builder.build())
}

/**
 * The configuration for a custom domain that hosts the sign-up and sign-in pages for your
 * application.
 */
public inline fun CfnUserPoolDomain.setCustomDomainConfig(
    block: CfnUserPoolDomainCustomDomainConfigTypePropertyDsl.() -> Unit = {}
) {
    val builder = CfnUserPoolDomainCustomDomainConfigTypePropertyDsl()
    builder.apply(block)
    return setCustomDomainConfig(builder.build())
}

/**
 * The account takeover risk configuration object, including the `NotifyConfiguration` object and
 * `Actions` to take if there is an account takeover.
 */
public inline fun CfnUserPoolRiskConfigurationAttachment.setAccountTakeoverRiskConfiguration(
    block:
        CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl.(
        ) -> Unit =
        {}
) {
    val builder =
        CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl()
    builder.apply(block)
    return setAccountTakeoverRiskConfiguration(builder.build())
}

/**
 * The compromised credentials risk configuration object, including the `EventFilter` and the
 * `EventAction` .
 */
public inline fun CfnUserPoolRiskConfigurationAttachment.setCompromisedCredentialsRiskConfiguration(
    block:
        CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl.(
        ) -> Unit =
        {}
) {
    val builder =
        CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl()
    builder.apply(block)
    return setCompromisedCredentialsRiskConfiguration(builder.build())
}

/** The configuration to override the risk decision. */
public inline fun CfnUserPoolRiskConfigurationAttachment.setRiskExceptionConfiguration(
    block:
        CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl.() -> Unit =
        {}
) {
    val builder = CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl()
    builder.apply(block)
    return setRiskExceptionConfiguration(builder.build())
}

/**
 * Creates a custom ClientAttributes with the specified attributes.
 *
 * @param attributes a list of standard attributes to add to the set.
 */
public inline fun ClientAttributes.withStandardAttributes(
    block: StandardAttributesMaskDsl.() -> Unit = {}
): ClientAttributes {
    val builder = StandardAttributesMaskDsl()
    builder.apply(block)
    return withStandardAttributes(builder.build())
}

/**
 * Add a new app client to this user pool.
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-client-apps.html)
 *
 * @param id
 * @param options
 */
public inline fun IUserPool.addClient(
    arg0: String,
    block: UserPoolClientOptionsDsl.() -> Unit = {}
): UserPoolClient {
    val builder = UserPoolClientOptionsDsl()
    builder.apply(block)
    return addClient(arg0, builder.build())
}

/**
 * Associate a domain to this user pool.
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain.html)
 *
 * @param id
 * @param options
 */
public inline fun IUserPool.addDomain(
    arg0: String,
    block: UserPoolDomainOptionsDsl.() -> Unit = {}
): UserPoolDomain {
    val builder = UserPoolDomainOptionsDsl()
    builder.apply(block)
    return addDomain(arg0, builder.build())
}

/**
 * Add a new resource server to this user pool.
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-resource-servers.html)
 *
 * @param id
 * @param options
 */
public inline fun IUserPool.addResourceServer(
    arg0: String,
    block: UserPoolResourceServerOptionsDsl.() -> Unit = {}
): UserPoolResourceServer {
    val builder = UserPoolResourceServerOptionsDsl()
    builder.apply(block)
    return addResourceServer(arg0, builder.build())
}

/**
 * Add a new app client to this user pool.
 *
 * @param id
 * @param options
 */
public inline fun UserPool.addClient(
    id: String,
    block: UserPoolClientOptionsDsl.() -> Unit = {}
): UserPoolClient {
    val builder = UserPoolClientOptionsDsl()
    builder.apply(block)
    return addClient(id, builder.build())
}

/**
 * Associate a domain to this user pool.
 *
 * @param id
 * @param options
 */
public inline fun UserPool.addDomain(
    id: String,
    block: UserPoolDomainOptionsDsl.() -> Unit = {}
): UserPoolDomain {
    val builder = UserPoolDomainOptionsDsl()
    builder.apply(block)
    return addDomain(id, builder.build())
}

/**
 * Add a new resource server to this user pool.
 *
 * @param id
 * @param options
 */
public inline fun UserPool.addResourceServer(
    id: String,
    block: UserPoolResourceServerOptionsDsl.() -> Unit = {}
): UserPoolResourceServer {
    val builder = UserPoolResourceServerOptionsDsl()
    builder.apply(block)
    return addResourceServer(id, builder.build())
}

/**
 * The URL to the hosted UI associated with this domain.
 *
 * @param options options to customize baseUrl.
 */
public inline fun UserPoolDomain.baseUrl(block: BaseUrlOptionsDsl.() -> Unit = {}): String {
    val builder = BaseUrlOptionsDsl()
    builder.apply(block)
    return baseUrl(builder.build())
}

/**
 * The URL to the sign in page in this domain using a specific UserPoolClient.
 *
 * @param client [disable-awslint:ref-via-interface] the user pool client that the UI will use to
 *   interact with the UserPool.
 * @param options options to customize signInUrl.
 */
public inline fun UserPoolDomain.signInUrl(
    client: UserPoolClient,
    block: SignInUrlOptionsDsl.() -> Unit = {}
): String {
    val builder = SignInUrlOptionsDsl()
    builder.apply(block)
    return signInUrl(client, builder.build())
}
