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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnIdentityPoolProps

/**
 * Properties for defining a `CfnIdentityPool`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cognito.*;
 * OpenIdConnectProvider myProvider;
 * CfnIdentityPool.Builder.create(this, "IdentityPool")
 * .openIdConnectProviderArns(List.of(myProvider.getOpenIdConnectProviderArn()))
 * // And the other properties for your identity pool
 * .allowUnauthenticatedIdentities(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
 */
@CdkDslMarker
public class CfnIdentityPoolPropsDsl {
    private val cdkBuilder: CfnIdentityPoolProps.Builder = CfnIdentityPoolProps.builder()

    private val _cognitoIdentityProviders: MutableList<Any> = mutableListOf()

    private val _openIdConnectProviderArns: MutableList<String> = mutableListOf()

    private val _samlProviderArns: MutableList<String> = mutableListOf()

    /** @param allowClassicFlow Enables the Basic (Classic) authentication flow. */
    public fun allowClassicFlow(allowClassicFlow: Boolean) {
        cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    /** @param allowClassicFlow Enables the Basic (Classic) authentication flow. */
    public fun allowClassicFlow(allowClassicFlow: IResolvable) {
        cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    /**
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     *   unauthenticated logins.
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
        cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    /**
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     *   unauthenticated logins.
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable) {
        cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    /** @param cognitoEvents The events to configure. */
    public fun cognitoEvents(cognitoEvents: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(cognitoEvents)
        cdkBuilder.cognitoEvents(builder.map)
    }

    /** @param cognitoEvents The events to configure. */
    public fun cognitoEvents(cognitoEvents: Any) {
        cdkBuilder.cognitoEvents(cognitoEvents)
    }

    /** @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. */
    public fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any) {
        _cognitoIdentityProviders.addAll(listOf(*cognitoIdentityProviders))
    }

    /** @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. */
    public fun cognitoIdentityProviders(cognitoIdentityProviders: Collection<Any>) {
        _cognitoIdentityProviders.addAll(cognitoIdentityProviders)
    }

    /** @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. */
    public fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable) {
        cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders)
    }

    /** @param cognitoStreams Configuration options for configuring Amazon Cognito streams. */
    public fun cognitoStreams(cognitoStreams: IResolvable) {
        cdkBuilder.cognitoStreams(cognitoStreams)
    }

    /** @param cognitoStreams Configuration options for configuring Amazon Cognito streams. */
    public fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty) {
        cdkBuilder.cognitoStreams(cognitoStreams)
    }

    /**
     * @param developerProviderName The "domain" Amazon Cognito uses when referencing your users.
     *   This name acts as a placeholder that allows your backend and the Amazon Cognito service to
     *   communicate about the developer provider. For the `DeveloperProviderName` , you can use
     *   letters and periods (.), underscores (_), and dashes (-).
     *
     * *Minimum length* : 1
     *
     * *Maximum length* : 100
     */
    public fun developerProviderName(developerProviderName: String) {
        cdkBuilder.developerProviderName(developerProviderName)
    }

    /**
     * @param identityPoolName The name of your Amazon Cognito identity pool. *Minimum length* : 1
     *
     * *Maximum length* : 128
     *
     * *Pattern* : `[\w\s+=,.&#64;-]+`
     */
    public fun identityPoolName(identityPoolName: String) {
        cdkBuilder.identityPoolName(identityPoolName)
    }

    /**
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     *   providers.
     */
    public fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String) {
        _openIdConnectProviderArns.addAll(listOf(*openIdConnectProviderArns))
    }

    /**
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     *   providers.
     */
    public fun openIdConnectProviderArns(openIdConnectProviderArns: Collection<String>) {
        _openIdConnectProviderArns.addAll(openIdConnectProviderArns)
    }

    /** @param pushSync The configuration options to be applied to the identity pool. */
    public fun pushSync(pushSync: IResolvable) {
        cdkBuilder.pushSync(pushSync)
    }

    /** @param pushSync The configuration options to be applied to the identity pool. */
    public fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty) {
        cdkBuilder.pushSync(pushSync)
    }

    /**
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     *   Language (SAML) providers.
     */
    public fun samlProviderArns(vararg samlProviderArns: String) {
        _samlProviderArns.addAll(listOf(*samlProviderArns))
    }

    /**
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     *   Language (SAML) providers.
     */
    public fun samlProviderArns(samlProviderArns: Collection<String>) {
        _samlProviderArns.addAll(samlProviderArns)
    }

    /**
     * @param supportedLoginProviders Key-value pairs that map provider names to provider app IDs.
     */
    public fun supportedLoginProviders(supportedLoginProviders: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(supportedLoginProviders)
        cdkBuilder.supportedLoginProviders(builder.map)
    }

    /**
     * @param supportedLoginProviders Key-value pairs that map provider names to provider app IDs.
     */
    public fun supportedLoginProviders(supportedLoginProviders: Any) {
        cdkBuilder.supportedLoginProviders(supportedLoginProviders)
    }

    public fun build(): CfnIdentityPoolProps {
        if (_cognitoIdentityProviders.isNotEmpty())
            cdkBuilder.cognitoIdentityProviders(_cognitoIdentityProviders)
        if (_openIdConnectProviderArns.isNotEmpty())
            cdkBuilder.openIdConnectProviderArns(_openIdConnectProviderArns)
        if (_samlProviderArns.isNotEmpty()) cdkBuilder.samlProviderArns(_samlProviderArns)
        return cdkBuilder.build()
    }
}
