@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIdentityPool`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cognito.*;
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
public interface CfnIdentityPoolProps {
  /**
   * Enables the Basic (Classic) authentication flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowclassicflow)
   */
  public fun allowClassicFlow(): Any? = unwrap(this).getAllowClassicFlow()

  /**
   * Specifies whether the identity pool supports unauthenticated logins.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
   */
  public fun allowUnauthenticatedIdentities(): Any

  /**
   * The events to configure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
   */
  public fun cognitoEvents(): Any? = unwrap(this).getCognitoEvents()

  /**
   * The Amazon Cognito user pools and their client IDs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
   */
  public fun cognitoIdentityProviders(): Any? = unwrap(this).getCognitoIdentityProviders()

  /**
   * Configuration options for configuring Amazon Cognito streams.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
   */
  public fun cognitoStreams(): Any? = unwrap(this).getCognitoStreams()

  /**
   * The "domain" Amazon Cognito uses when referencing your users.
   *
   * This name acts as a placeholder that allows your backend and the Amazon Cognito service to
   * communicate about the developer provider. For the `DeveloperProviderName` , you can use letters
   * and periods (.), underscores (_), and dashes (-).
   *
   * *Minimum length* : 1
   *
   * *Maximum length* : 100
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername)
   */
  public fun developerProviderName(): String? = unwrap(this).getDeveloperProviderName()

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
   */
  public fun identityPoolName(): String? = unwrap(this).getIdentityPoolName()

  /**
   * The Amazon Resource Names (ARNs) of the OpenID connect providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
   */
  public fun openIdConnectProviderArns(): List<String> = unwrap(this).getOpenIdConnectProviderArns()
      ?: emptyList()

  /**
   * The configuration options to be applied to the identity pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
   */
  public fun pushSync(): Any? = unwrap(this).getPushSync()

  /**
   * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
   */
  public fun samlProviderArns(): List<String> = unwrap(this).getSamlProviderArns() ?: emptyList()

  /**
   * Key-value pairs that map provider names to provider app IDs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
   */
  public fun supportedLoginProviders(): Any? = unwrap(this).getSupportedLoginProviders()

  /**
   * A builder for [CfnIdentityPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow.
     */
    public fun allowClassicFlow(allowClassicFlow: Boolean)

    /**
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow.
     */
    public fun allowClassicFlow(allowClassicFlow: IResolvable)

    /**
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     * unauthenticated logins. 
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean)

    /**
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     * unauthenticated logins. 
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable)

    /**
     * @param cognitoEvents The events to configure.
     */
    public fun cognitoEvents(cognitoEvents: Any)

    /**
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    public fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable)

    /**
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    public fun cognitoIdentityProviders(cognitoIdentityProviders: List<Any>)

    /**
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    public fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any)

    /**
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams.
     */
    public fun cognitoStreams(cognitoStreams: IResolvable)

    /**
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams.
     */
    public fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty)

    /**
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b59e4a67df699881b03636f25fa112dd34b2c47382df6514c91e2793572f65b7")
    public
        fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty.Builder.() -> Unit)

    /**
     * @param developerProviderName The "domain" Amazon Cognito uses when referencing your users.
     * This name acts as a placeholder that allows your backend and the Amazon Cognito service to
     * communicate about the developer provider. For the `DeveloperProviderName` , you can use letters
     * and periods (.), underscores (_), and dashes (-).
     *
     * *Minimum length* : 1
     *
     * *Maximum length* : 100
     */
    public fun developerProviderName(developerProviderName: String)

    /**
     * @param identityPoolName The name of your Amazon Cognito identity pool.
     * *Minimum length* : 1
     *
     * *Maximum length* : 128
     *
     * *Pattern* : `[\w\s+=,.&#64;-]+`
     */
    public fun identityPoolName(identityPoolName: String)

    /**
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     * providers.
     */
    public fun openIdConnectProviderArns(openIdConnectProviderArns: List<String>)

    /**
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     * providers.
     */
    public fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String)

    /**
     * @param pushSync The configuration options to be applied to the identity pool.
     */
    public fun pushSync(pushSync: IResolvable)

    /**
     * @param pushSync The configuration options to be applied to the identity pool.
     */
    public fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty)

    /**
     * @param pushSync The configuration options to be applied to the identity pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18595faa47ae849212f83cf0b41293977e259ae07f849891bf7fad9121bf583d")
    public fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty.Builder.() -> Unit)

    /**
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     * Language (SAML) providers.
     */
    public fun samlProviderArns(samlProviderArns: List<String>)

    /**
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     * Language (SAML) providers.
     */
    public fun samlProviderArns(vararg samlProviderArns: String)

    /**
     * @param supportedLoginProviders Key-value pairs that map provider names to provider app IDs.
     */
    public fun supportedLoginProviders(supportedLoginProviders: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.builder()

    /**
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow.
     */
    override fun allowClassicFlow(allowClassicFlow: Boolean) {
      cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    /**
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow.
     */
    override fun allowClassicFlow(allowClassicFlow: IResolvable) {
      cdkBuilder.allowClassicFlow(allowClassicFlow.let(IResolvable::unwrap))
    }

    /**
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     * unauthenticated logins. 
     */
    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    /**
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     * unauthenticated logins. 
     */
    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities.let(IResolvable::unwrap))
    }

    /**
     * @param cognitoEvents The events to configure.
     */
    override fun cognitoEvents(cognitoEvents: Any) {
      cdkBuilder.cognitoEvents(cognitoEvents)
    }

    /**
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    override fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable) {
      cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders.let(IResolvable::unwrap))
    }

    /**
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    override fun cognitoIdentityProviders(cognitoIdentityProviders: List<Any>) {
      cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders)
    }

    /**
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs.
     */
    override fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any): Unit =
        cognitoIdentityProviders(cognitoIdentityProviders.toList())

    /**
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams.
     */
    override fun cognitoStreams(cognitoStreams: IResolvable) {
      cdkBuilder.cognitoStreams(cognitoStreams.let(IResolvable::unwrap))
    }

    /**
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams.
     */
    override fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty) {
      cdkBuilder.cognitoStreams(cognitoStreams.let(CfnIdentityPool.CognitoStreamsProperty::unwrap))
    }

    /**
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b59e4a67df699881b03636f25fa112dd34b2c47382df6514c91e2793572f65b7")
    override
        fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty.Builder.() -> Unit):
        Unit = cognitoStreams(CfnIdentityPool.CognitoStreamsProperty(cognitoStreams))

    /**
     * @param developerProviderName The "domain" Amazon Cognito uses when referencing your users.
     * This name acts as a placeholder that allows your backend and the Amazon Cognito service to
     * communicate about the developer provider. For the `DeveloperProviderName` , you can use letters
     * and periods (.), underscores (_), and dashes (-).
     *
     * *Minimum length* : 1
     *
     * *Maximum length* : 100
     */
    override fun developerProviderName(developerProviderName: String) {
      cdkBuilder.developerProviderName(developerProviderName)
    }

    /**
     * @param identityPoolName The name of your Amazon Cognito identity pool.
     * *Minimum length* : 1
     *
     * *Maximum length* : 128
     *
     * *Pattern* : `[\w\s+=,.&#64;-]+`
     */
    override fun identityPoolName(identityPoolName: String) {
      cdkBuilder.identityPoolName(identityPoolName)
    }

    /**
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     * providers.
     */
    override fun openIdConnectProviderArns(openIdConnectProviderArns: List<String>) {
      cdkBuilder.openIdConnectProviderArns(openIdConnectProviderArns)
    }

    /**
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     * providers.
     */
    override fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String): Unit =
        openIdConnectProviderArns(openIdConnectProviderArns.toList())

    /**
     * @param pushSync The configuration options to be applied to the identity pool.
     */
    override fun pushSync(pushSync: IResolvable) {
      cdkBuilder.pushSync(pushSync.let(IResolvable::unwrap))
    }

    /**
     * @param pushSync The configuration options to be applied to the identity pool.
     */
    override fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty) {
      cdkBuilder.pushSync(pushSync.let(CfnIdentityPool.PushSyncProperty::unwrap))
    }

    /**
     * @param pushSync The configuration options to be applied to the identity pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18595faa47ae849212f83cf0b41293977e259ae07f849891bf7fad9121bf583d")
    override fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty.Builder.() -> Unit): Unit =
        pushSync(CfnIdentityPool.PushSyncProperty(pushSync))

    /**
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     * Language (SAML) providers.
     */
    override fun samlProviderArns(samlProviderArns: List<String>) {
      cdkBuilder.samlProviderArns(samlProviderArns)
    }

    /**
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     * Language (SAML) providers.
     */
    override fun samlProviderArns(vararg samlProviderArns: String): Unit =
        samlProviderArns(samlProviderArns.toList())

    /**
     * @param supportedLoginProviders Key-value pairs that map provider names to provider app IDs.
     */
    override fun supportedLoginProviders(supportedLoginProviders: Any) {
      cdkBuilder.supportedLoginProviders(supportedLoginProviders)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolProps,
  ) : CdkObject(cdkObject), CfnIdentityPoolProps {
    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowclassicflow)
     */
    override fun allowClassicFlow(): Any? = unwrap(this).getAllowClassicFlow()

    /**
     * Specifies whether the identity pool supports unauthenticated logins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
     */
    override fun allowUnauthenticatedIdentities(): Any =
        unwrap(this).getAllowUnauthenticatedIdentities()

    /**
     * The events to configure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
     */
    override fun cognitoEvents(): Any? = unwrap(this).getCognitoEvents()

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     */
    override fun cognitoIdentityProviders(): Any? = unwrap(this).getCognitoIdentityProviders()

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     */
    override fun cognitoStreams(): Any? = unwrap(this).getCognitoStreams()

    /**
     * The "domain" Amazon Cognito uses when referencing your users.
     *
     * This name acts as a placeholder that allows your backend and the Amazon Cognito service to
     * communicate about the developer provider. For the `DeveloperProviderName` , you can use letters
     * and periods (.), underscores (_), and dashes (-).
     *
     * *Minimum length* : 1
     *
     * *Maximum length* : 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-developerprovidername)
     */
    override fun developerProviderName(): String? = unwrap(this).getDeveloperProviderName()

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
     */
    override fun identityPoolName(): String? = unwrap(this).getIdentityPoolName()

    /**
     * The Amazon Resource Names (ARNs) of the OpenID connect providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
     */
    override fun openIdConnectProviderArns(): List<String> =
        unwrap(this).getOpenIdConnectProviderArns() ?: emptyList()

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     */
    override fun pushSync(): Any? = unwrap(this).getPushSync()

    /**
     * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
     */
    override fun samlProviderArns(): List<String> = unwrap(this).getSamlProviderArns() ?:
        emptyList()

    /**
     * Key-value pairs that map provider names to provider app IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
     */
    override fun supportedLoginProviders(): Any? = unwrap(this).getSupportedLoginProviders()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolProps):
        CfnIdentityPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolProps):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
  }
}
