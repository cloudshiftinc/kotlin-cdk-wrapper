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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.constructs.Construct

/**
 * The `AWS::Cognito::IdentityPool` resource creates an Amazon Cognito identity pool.
 *
 * To avoid deleting the resource accidentally from AWS CloudFormation , use
 * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * and the
 * [UpdateReplacePolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
 * to retain the resource on deletion or replacement.
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
public class CfnIdentityPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIdentityPool.Builder = CfnIdentityPool.Builder.create(scope, id)

    private val _cognitoIdentityProviders: MutableList<Any> = mutableListOf()

    private val _openIdConnectProviderArns: MutableList<String> = mutableListOf()

    private val _samlProviderArns: MutableList<String> = mutableListOf()

    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowclassicflow)
     *
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow.
     */
    public fun allowClassicFlow(allowClassicFlow: Boolean) {
        cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowclassicflow)
     *
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow.
     */
    public fun allowClassicFlow(allowClassicFlow: IResolvable) {
        cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    /**
     * Specifies whether the identity pool supports unauthenticated logins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
     *
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     *   unauthenticated logins.
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
        cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    /**
     * Specifies whether the identity pool supports unauthenticated logins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
     *
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     *   unauthenticated logins.
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable) {
        cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    /**
     * The events to configure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
     *
     * @param cognitoEvents The events to configure.
     */
    public fun cognitoEvents(cognitoEvents: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(cognitoEvents)
        cdkBuilder.cognitoEvents(builder.map)
    }

    /**
     * The events to configure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
     *
     * @param cognitoEvents The events to configure.
     */
    public fun cognitoEvents(cognitoEvents: Any) {
        cdkBuilder.cognitoEvents(cognitoEvents)
    }

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     *
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    public fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any) {
        _cognitoIdentityProviders.addAll(listOf(*cognitoIdentityProviders))
    }

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     *
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    public fun cognitoIdentityProviders(cognitoIdentityProviders: Collection<Any>) {
        _cognitoIdentityProviders.addAll(cognitoIdentityProviders)
    }

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     *
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    public fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable) {
        cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders)
    }

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     *
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams.
     */
    public fun cognitoStreams(cognitoStreams: IResolvable) {
        cdkBuilder.cognitoStreams(cognitoStreams)
    }

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     *
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams.
     */
    public fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty) {
        cdkBuilder.cognitoStreams(cognitoStreams)
    }

    /**
     * The "domain" Amazon Cognito uses when referencing your users.
     *
     * This name acts as a placeholder that allows your backend and the Amazon Cognito service to
     * communicate about the developer provider. For the `DeveloperProviderName` , you can use
     * letters and periods (.), underscores (_), and dashes (-).
     *
     * *Minimum length* : 1
     *
     * *Maximum length* : 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername)
     *
     * @param developerProviderName The "domain" Amazon Cognito uses when referencing your users.
     */
    public fun developerProviderName(developerProviderName: String) {
        cdkBuilder.developerProviderName(developerProviderName)
    }

    /**
     * The name of your Amazon Cognito identity pool.
     *
     * *Minimum length* : 1
     *
     * *Maximum length* : 128
     *
     * *Pattern* : `[\w\s+=,.&#64;-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-identitypoolname)
     *
     * @param identityPoolName The name of your Amazon Cognito identity pool.
     */
    public fun identityPoolName(identityPoolName: String) {
        cdkBuilder.identityPoolName(identityPoolName)
    }

    /**
     * The Amazon Resource Names (ARNs) of the OpenID connect providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
     *
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     *   providers.
     */
    public fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String) {
        _openIdConnectProviderArns.addAll(listOf(*openIdConnectProviderArns))
    }

    /**
     * The Amazon Resource Names (ARNs) of the OpenID connect providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
     *
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     *   providers.
     */
    public fun openIdConnectProviderArns(openIdConnectProviderArns: Collection<String>) {
        _openIdConnectProviderArns.addAll(openIdConnectProviderArns)
    }

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     *
     * @param pushSync The configuration options to be applied to the identity pool.
     */
    public fun pushSync(pushSync: IResolvable) {
        cdkBuilder.pushSync(pushSync)
    }

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     *
     * @param pushSync The configuration options to be applied to the identity pool.
     */
    public fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty) {
        cdkBuilder.pushSync(pushSync)
    }

    /**
     * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
     *
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     *   Language (SAML) providers.
     */
    public fun samlProviderArns(vararg samlProviderArns: String) {
        _samlProviderArns.addAll(listOf(*samlProviderArns))
    }

    /**
     * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
     *
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     *   Language (SAML) providers.
     */
    public fun samlProviderArns(samlProviderArns: Collection<String>) {
        _samlProviderArns.addAll(samlProviderArns)
    }

    /**
     * Key-value pairs that map provider names to provider app IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
     *
     * @param supportedLoginProviders Key-value pairs that map provider names to provider app IDs.
     */
    public fun supportedLoginProviders(supportedLoginProviders: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(supportedLoginProviders)
        cdkBuilder.supportedLoginProviders(builder.map)
    }

    /**
     * Key-value pairs that map provider names to provider app IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
     *
     * @param supportedLoginProviders Key-value pairs that map provider names to provider app IDs.
     */
    public fun supportedLoginProviders(supportedLoginProviders: Any) {
        cdkBuilder.supportedLoginProviders(supportedLoginProviders)
    }

    public fun build(): CfnIdentityPool {
        if (_cognitoIdentityProviders.isNotEmpty())
            cdkBuilder.cognitoIdentityProviders(_cognitoIdentityProviders)
        if (_openIdConnectProviderArns.isNotEmpty())
            cdkBuilder.openIdConnectProviderArns(_openIdConnectProviderArns)
        if (_samlProviderArns.isNotEmpty()) cdkBuilder.samlProviderArns(_samlProviderArns)
        return cdkBuilder.build()
    }
}
