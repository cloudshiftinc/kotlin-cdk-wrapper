@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::IdentityPool` resource creates an Amazon Cognito identity pool.
 *
 * To avoid deleting the resource accidentally from AWS CloudFormation , use [DeletionPolicy
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * and the [UpdateReplacePolicy
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
 * to retain the resource on deletion or replacement.
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
public open class CfnIdentityPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Enables the Basic (Classic) authentication flow.
   */
  public open fun allowClassicFlow(): Any? = unwrap(this).getAllowClassicFlow()

  /**
   * Enables the Basic (Classic) authentication flow.
   */
  public open fun allowClassicFlow(`value`: Boolean) {
    unwrap(this).setAllowClassicFlow(`value`)
  }

  /**
   * Enables the Basic (Classic) authentication flow.
   */
  public open fun allowClassicFlow(`value`: IResolvable) {
    unwrap(this).setAllowClassicFlow(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether the identity pool supports unauthenticated logins.
   */
  public open fun allowUnauthenticatedIdentities(): Any =
      unwrap(this).getAllowUnauthenticatedIdentities()

  /**
   * Specifies whether the identity pool supports unauthenticated logins.
   */
  public open fun allowUnauthenticatedIdentities(`value`: Boolean) {
    unwrap(this).setAllowUnauthenticatedIdentities(`value`)
  }

  /**
   * Specifies whether the identity pool supports unauthenticated logins.
   */
  public open fun allowUnauthenticatedIdentities(`value`: IResolvable) {
    unwrap(this).setAllowUnauthenticatedIdentities(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the Amazon Cognito identity pool, returned as a string.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The events to configure.
   */
  public open fun cognitoEvents(): Any? = unwrap(this).getCognitoEvents()

  /**
   * The events to configure.
   */
  public open fun cognitoEvents(`value`: Any) {
    unwrap(this).setCognitoEvents(`value`)
  }

  /**
   * The Amazon Cognito user pools and their client IDs.
   */
  public open fun cognitoIdentityProviders(): Any? = unwrap(this).getCognitoIdentityProviders()

  /**
   * The Amazon Cognito user pools and their client IDs.
   */
  public open fun cognitoIdentityProviders(`value`: IResolvable) {
    unwrap(this).setCognitoIdentityProviders(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Cognito user pools and their client IDs.
   */
  public open fun cognitoIdentityProviders(`value`: List<Any>) {
    unwrap(this).setCognitoIdentityProviders(`value`)
  }

  /**
   * The Amazon Cognito user pools and their client IDs.
   */
  public open fun cognitoIdentityProviders(vararg `value`: Any): Unit =
      cognitoIdentityProviders(`value`.toList())

  /**
   * Configuration options for configuring Amazon Cognito streams.
   */
  public open fun cognitoStreams(): Any? = unwrap(this).getCognitoStreams()

  /**
   * Configuration options for configuring Amazon Cognito streams.
   */
  public open fun cognitoStreams(`value`: IResolvable) {
    unwrap(this).setCognitoStreams(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration options for configuring Amazon Cognito streams.
   */
  public open fun cognitoStreams(`value`: CognitoStreamsProperty) {
    unwrap(this).setCognitoStreams(`value`.let(CognitoStreamsProperty::unwrap))
  }

  /**
   * Configuration options for configuring Amazon Cognito streams.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa885a07e4fb84c14e3c14025f3c030f9bea5bdd938707ae42c3801e043e7d4b")
  public open fun cognitoStreams(`value`: CognitoStreamsProperty.Builder.() -> Unit): Unit =
      cognitoStreams(CognitoStreamsProperty(`value`))

  /**
   * The "domain" Amazon Cognito uses when referencing your users.
   */
  public open fun developerProviderName(): String? = unwrap(this).getDeveloperProviderName()

  /**
   * The "domain" Amazon Cognito uses when referencing your users.
   */
  public open fun developerProviderName(`value`: String) {
    unwrap(this).setDeveloperProviderName(`value`)
  }

  /**
   * The name of your Amazon Cognito identity pool.
   */
  public open fun identityPoolName(): String? = unwrap(this).getIdentityPoolName()

  /**
   * The name of your Amazon Cognito identity pool.
   */
  public open fun identityPoolName(`value`: String) {
    unwrap(this).setIdentityPoolName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Names (ARNs) of the OpenID connect providers.
   */
  public open fun openIdConnectProviderArns(): List<String> =
      unwrap(this).getOpenIdConnectProviderArns() ?: emptyList()

  /**
   * The Amazon Resource Names (ARNs) of the OpenID connect providers.
   */
  public open fun openIdConnectProviderArns(`value`: List<String>) {
    unwrap(this).setOpenIdConnectProviderArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the OpenID connect providers.
   */
  public open fun openIdConnectProviderArns(vararg `value`: String): Unit =
      openIdConnectProviderArns(`value`.toList())

  /**
   * The configuration options to be applied to the identity pool.
   */
  public open fun pushSync(): Any? = unwrap(this).getPushSync()

  /**
   * The configuration options to be applied to the identity pool.
   */
  public open fun pushSync(`value`: IResolvable) {
    unwrap(this).setPushSync(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration options to be applied to the identity pool.
   */
  public open fun pushSync(`value`: PushSyncProperty) {
    unwrap(this).setPushSync(`value`.let(PushSyncProperty::unwrap))
  }

  /**
   * The configuration options to be applied to the identity pool.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("76cb3757a18be8045a8aa6ce599d12caa89a8c5a6adccada41f342c7ce868ce8")
  public open fun pushSync(`value`: PushSyncProperty.Builder.() -> Unit): Unit =
      pushSync(PushSyncProperty(`value`))

  /**
   * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
   */
  public open fun samlProviderArns(): List<String> = unwrap(this).getSamlProviderArns() ?:
      emptyList()

  /**
   * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
   */
  public open fun samlProviderArns(`value`: List<String>) {
    unwrap(this).setSamlProviderArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
   */
  public open fun samlProviderArns(vararg `value`: String): Unit =
      samlProviderArns(`value`.toList())

  /**
   * Key-value pairs that map provider names to provider app IDs.
   */
  public open fun supportedLoginProviders(): Any? = unwrap(this).getSupportedLoginProviders()

  /**
   * Key-value pairs that map provider names to provider app IDs.
   */
  public open fun supportedLoginProviders(`value`: Any) {
    unwrap(this).setSupportedLoginProviders(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnIdentityPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowclassicflow)
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow. 
     */
    public fun allowClassicFlow(allowClassicFlow: Boolean)

    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowclassicflow)
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow. 
     */
    public fun allowClassicFlow(allowClassicFlow: IResolvable)

    /**
     * Specifies whether the identity pool supports unauthenticated logins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     * unauthenticated logins. 
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean)

    /**
     * Specifies whether the identity pool supports unauthenticated logins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     * unauthenticated logins. 
     */
    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable)

    /**
     * The events to configure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
     * @param cognitoEvents The events to configure. 
     */
    public fun cognitoEvents(cognitoEvents: Any)

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. 
     */
    public fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable)

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. 
     */
    public fun cognitoIdentityProviders(cognitoIdentityProviders: List<Any>)

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. 
     */
    public fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any)

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams. 
     */
    public fun cognitoStreams(cognitoStreams: IResolvable)

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams. 
     */
    public fun cognitoStreams(cognitoStreams: CognitoStreamsProperty)

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7b28bad24809a271d41e21c713d6fad090f0b50d4de21405b2607e954d38d3")
    public fun cognitoStreams(cognitoStreams: CognitoStreamsProperty.Builder.() -> Unit)

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
     * @param developerProviderName The "domain" Amazon Cognito uses when referencing your users. 
     */
    public fun developerProviderName(developerProviderName: String)

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
     * @param identityPoolName The name of your Amazon Cognito identity pool. 
     */
    public fun identityPoolName(identityPoolName: String)

    /**
     * The Amazon Resource Names (ARNs) of the OpenID connect providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     * providers. 
     */
    public fun openIdConnectProviderArns(openIdConnectProviderArns: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of the OpenID connect providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     * providers. 
     */
    public fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String)

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     * @param pushSync The configuration options to be applied to the identity pool. 
     */
    public fun pushSync(pushSync: IResolvable)

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     * @param pushSync The configuration options to be applied to the identity pool. 
     */
    public fun pushSync(pushSync: PushSyncProperty)

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     * @param pushSync The configuration options to be applied to the identity pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab1604b65b10c62917c7a1248716a843ab7b22445c7854708a8209b63596cff1")
    public fun pushSync(pushSync: PushSyncProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     * Language (SAML) providers. 
     */
    public fun samlProviderArns(samlProviderArns: List<String>)

    /**
     * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     * Language (SAML) providers. 
     */
    public fun samlProviderArns(vararg samlProviderArns: String)

    /**
     * Key-value pairs that map provider names to provider app IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
     * @param supportedLoginProviders Key-value pairs that map provider names to provider app IDs. 
     */
    public fun supportedLoginProviders(supportedLoginProviders: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnIdentityPool.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPool.Builder.create(scope, id)

    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowclassicflow)
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow. 
     */
    override fun allowClassicFlow(allowClassicFlow: Boolean) {
      cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    /**
     * Enables the Basic (Classic) authentication flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowclassicflow)
     * @param allowClassicFlow Enables the Basic (Classic) authentication flow. 
     */
    override fun allowClassicFlow(allowClassicFlow: IResolvable) {
      cdkBuilder.allowClassicFlow(allowClassicFlow.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether the identity pool supports unauthenticated logins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     * unauthenticated logins. 
     */
    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    /**
     * Specifies whether the identity pool supports unauthenticated logins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-allowunauthenticatedidentities)
     * @param allowUnauthenticatedIdentities Specifies whether the identity pool supports
     * unauthenticated logins. 
     */
    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities.let(IResolvable::unwrap))
    }

    /**
     * The events to configure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoevents)
     * @param cognitoEvents The events to configure. 
     */
    override fun cognitoEvents(cognitoEvents: Any) {
      cdkBuilder.cognitoEvents(cognitoEvents)
    }

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. 
     */
    override fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable) {
      cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders.let(IResolvable::unwrap))
    }

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. 
     */
    override fun cognitoIdentityProviders(cognitoIdentityProviders: List<Any>) {
      cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders)
    }

    /**
     * The Amazon Cognito user pools and their client IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitoidentityproviders)
     * @param cognitoIdentityProviders The Amazon Cognito user pools and their client IDs. 
     */
    override fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any): Unit =
        cognitoIdentityProviders(cognitoIdentityProviders.toList())

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams. 
     */
    override fun cognitoStreams(cognitoStreams: IResolvable) {
      cdkBuilder.cognitoStreams(cognitoStreams.let(IResolvable::unwrap))
    }

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams. 
     */
    override fun cognitoStreams(cognitoStreams: CognitoStreamsProperty) {
      cdkBuilder.cognitoStreams(cognitoStreams.let(CognitoStreamsProperty::unwrap))
    }

    /**
     * Configuration options for configuring Amazon Cognito streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-cognitostreams)
     * @param cognitoStreams Configuration options for configuring Amazon Cognito streams. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb7b28bad24809a271d41e21c713d6fad090f0b50d4de21405b2607e954d38d3")
    override fun cognitoStreams(cognitoStreams: CognitoStreamsProperty.Builder.() -> Unit): Unit =
        cognitoStreams(CognitoStreamsProperty(cognitoStreams))

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
     * @param developerProviderName The "domain" Amazon Cognito uses when referencing your users. 
     */
    override fun developerProviderName(developerProviderName: String) {
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
     * @param identityPoolName The name of your Amazon Cognito identity pool. 
     */
    override fun identityPoolName(identityPoolName: String) {
      cdkBuilder.identityPoolName(identityPoolName)
    }

    /**
     * The Amazon Resource Names (ARNs) of the OpenID connect providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     * providers. 
     */
    override fun openIdConnectProviderArns(openIdConnectProviderArns: List<String>) {
      cdkBuilder.openIdConnectProviderArns(openIdConnectProviderArns)
    }

    /**
     * The Amazon Resource Names (ARNs) of the OpenID connect providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-openidconnectproviderarns)
     * @param openIdConnectProviderArns The Amazon Resource Names (ARNs) of the OpenID connect
     * providers. 
     */
    override fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String): Unit =
        openIdConnectProviderArns(openIdConnectProviderArns.toList())

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     * @param pushSync The configuration options to be applied to the identity pool. 
     */
    override fun pushSync(pushSync: IResolvable) {
      cdkBuilder.pushSync(pushSync.let(IResolvable::unwrap))
    }

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     * @param pushSync The configuration options to be applied to the identity pool. 
     */
    override fun pushSync(pushSync: PushSyncProperty) {
      cdkBuilder.pushSync(pushSync.let(PushSyncProperty::unwrap))
    }

    /**
     * The configuration options to be applied to the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-pushsync)
     * @param pushSync The configuration options to be applied to the identity pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab1604b65b10c62917c7a1248716a843ab7b22445c7854708a8209b63596cff1")
    override fun pushSync(pushSync: PushSyncProperty.Builder.() -> Unit): Unit =
        pushSync(PushSyncProperty(pushSync))

    /**
     * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     * Language (SAML) providers. 
     */
    override fun samlProviderArns(samlProviderArns: List<String>) {
      cdkBuilder.samlProviderArns(samlProviderArns)
    }

    /**
     * The Amazon Resource Names (ARNs) of the Security Assertion Markup Language (SAML) providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-samlproviderarns)
     * @param samlProviderArns The Amazon Resource Names (ARNs) of the Security Assertion Markup
     * Language (SAML) providers. 
     */
    override fun samlProviderArns(vararg samlProviderArns: String): Unit =
        samlProviderArns(samlProviderArns.toList())

    /**
     * Key-value pairs that map provider names to provider app IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html#cfn-cognito-identitypool-supportedloginproviders)
     * @param supportedLoginProviders Key-value pairs that map provider names to provider app IDs. 
     */
    override fun supportedLoginProviders(supportedLoginProviders: Any) {
      cdkBuilder.supportedLoginProviders(supportedLoginProviders)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPool = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnIdentityPool.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentityPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentityPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool):
        CfnIdentityPool = CfnIdentityPool(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPool):
        software.amazon.awscdk.services.cognito.CfnIdentityPool = wrapped.cdkObject
  }

  /**
   * `CognitoIdentityProvider` is a property of the
   * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
   * resource that represents an Amazon Cognito user pool and its client ID.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * CognitoIdentityProviderProperty cognitoIdentityProviderProperty =
   * CognitoIdentityProviderProperty.builder()
   * .clientId("clientId")
   * .providerName("providerName")
   * // the properties below are optional
   * .serverSideTokenCheck(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html)
   */
  public interface CognitoIdentityProviderProperty {
    /**
     * The client ID for the Amazon Cognito user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid)
     */
    public fun clientId(): String

    /**
     * The provider name for an Amazon Cognito user pool.
     *
     * For example: `cognito-idp.us-east-2.amazonaws.com/us-east-2_123456789` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername)
     */
    public fun providerName(): String

    /**
     * TRUE if server-side token validation is enabled for the identity provider’s token.
     *
     * After you set the `ServerSideTokenCheck` to TRUE for an identity pool, that identity pool
     * checks with the integrated user pools to make sure the user has not been globally signed out or
     * deleted before the identity pool provides an OIDC token or AWS credentials for the user.
     *
     * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck)
     */
    public fun serverSideTokenCheck(): Any? = unwrap(this).getServerSideTokenCheck()

    /**
     * A builder for [CognitoIdentityProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientId The client ID for the Amazon Cognito user pool. 
       */
      public fun clientId(clientId: String)

      /**
       * @param providerName The provider name for an Amazon Cognito user pool. 
       * For example: `cognito-idp.us-east-2.amazonaws.com/us-east-2_123456789` .
       */
      public fun providerName(providerName: String)

      /**
       * @param serverSideTokenCheck TRUE if server-side token validation is enabled for the
       * identity provider’s token.
       * After you set the `ServerSideTokenCheck` to TRUE for an identity pool, that identity pool
       * checks with the integrated user pools to make sure the user has not been globally signed out
       * or deleted before the identity pool provides an OIDC token or AWS credentials for the user.
       *
       * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
       */
      public fun serverSideTokenCheck(serverSideTokenCheck: Boolean)

      /**
       * @param serverSideTokenCheck TRUE if server-side token validation is enabled for the
       * identity provider’s token.
       * After you set the `ServerSideTokenCheck` to TRUE for an identity pool, that identity pool
       * checks with the integrated user pools to make sure the user has not been globally signed out
       * or deleted before the identity pool provides an OIDC token or AWS credentials for the user.
       *
       * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
       */
      public fun serverSideTokenCheck(serverSideTokenCheck: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty.builder()

      /**
       * @param clientId The client ID for the Amazon Cognito user pool. 
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param providerName The provider name for an Amazon Cognito user pool. 
       * For example: `cognito-idp.us-east-2.amazonaws.com/us-east-2_123456789` .
       */
      override fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
      }

      /**
       * @param serverSideTokenCheck TRUE if server-side token validation is enabled for the
       * identity provider’s token.
       * After you set the `ServerSideTokenCheck` to TRUE for an identity pool, that identity pool
       * checks with the integrated user pools to make sure the user has not been globally signed out
       * or deleted before the identity pool provides an OIDC token or AWS credentials for the user.
       *
       * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
       */
      override fun serverSideTokenCheck(serverSideTokenCheck: Boolean) {
        cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
      }

      /**
       * @param serverSideTokenCheck TRUE if server-side token validation is enabled for the
       * identity provider’s token.
       * After you set the `ServerSideTokenCheck` to TRUE for an identity pool, that identity pool
       * checks with the integrated user pools to make sure the user has not been globally signed out
       * or deleted before the identity pool provides an OIDC token or AWS credentials for the user.
       *
       * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
       */
      override fun serverSideTokenCheck(serverSideTokenCheck: IResolvable) {
        cdkBuilder.serverSideTokenCheck(serverSideTokenCheck.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty,
    ) : CdkObject(cdkObject), CognitoIdentityProviderProperty {
      /**
       * The client ID for the Amazon Cognito user pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * The provider name for an Amazon Cognito user pool.
       *
       * For example: `cognito-idp.us-east-2.amazonaws.com/us-east-2_123456789` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername)
       */
      override fun providerName(): String = unwrap(this).getProviderName()

      /**
       * TRUE if server-side token validation is enabled for the identity provider’s token.
       *
       * After you set the `ServerSideTokenCheck` to TRUE for an identity pool, that identity pool
       * checks with the integrated user pools to make sure the user has not been globally signed out
       * or deleted before the identity pool provides an OIDC token or AWS credentials for the user.
       *
       * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck)
       */
      override fun serverSideTokenCheck(): Any? = unwrap(this).getServerSideTokenCheck()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoIdentityProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty):
          CognitoIdentityProviderProperty = CdkObjectWrappers.wrap(cdkObject) as
          CognitoIdentityProviderProperty

      internal fun unwrap(wrapped: CognitoIdentityProviderProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoIdentityProviderProperty
    }
  }

  /**
   * `CognitoStreams` is a property of the
   * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
   * resource that defines configuration options for Amazon Cognito streams.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * CognitoStreamsProperty cognitoStreamsProperty = CognitoStreamsProperty.builder()
   * .roleArn("roleArn")
   * .streamingStatus("streamingStatus")
   * .streamName("streamName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html)
   */
  public interface CognitoStreamsProperty {
    /**
     * The Amazon Resource Name (ARN) of the role Amazon Cognito can assume to publish to the
     * stream.
     *
     * This role must grant access to Amazon Cognito (cognito-sync) to invoke `PutRecord` on your
     * Amazon Cognito stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The name of the Amazon Cognito stream to receive updates.
     *
     * This stream must be in the developer's account and in the same Region as the identity pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname)
     */
    public fun streamName(): String? = unwrap(this).getStreamName()

    /**
     * Status of the Amazon Cognito streams.
     *
     * Valid values are: `ENABLED` or `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus)
     */
    public fun streamingStatus(): String? = unwrap(this).getStreamingStatus()

    /**
     * A builder for [CognitoStreamsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role Amazon Cognito can assume to
       * publish to the stream.
       * This role must grant access to Amazon Cognito (cognito-sync) to invoke `PutRecord` on your
       * Amazon Cognito stream.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param streamName The name of the Amazon Cognito stream to receive updates.
       * This stream must be in the developer's account and in the same Region as the identity pool.
       */
      public fun streamName(streamName: String)

      /**
       * @param streamingStatus Status of the Amazon Cognito streams.
       * Valid values are: `ENABLED` or `DISABLED` .
       */
      public fun streamingStatus(streamingStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty.builder()

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role Amazon Cognito can assume to
       * publish to the stream.
       * This role must grant access to Amazon Cognito (cognito-sync) to invoke `PutRecord` on your
       * Amazon Cognito stream.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param streamName The name of the Amazon Cognito stream to receive updates.
       * This stream must be in the developer's account and in the same Region as the identity pool.
       */
      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      /**
       * @param streamingStatus Status of the Amazon Cognito streams.
       * Valid values are: `ENABLED` or `DISABLED` .
       */
      override fun streamingStatus(streamingStatus: String) {
        cdkBuilder.streamingStatus(streamingStatus)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty,
    ) : CdkObject(cdkObject), CognitoStreamsProperty {
      /**
       * The Amazon Resource Name (ARN) of the role Amazon Cognito can assume to publish to the
       * stream.
       *
       * This role must grant access to Amazon Cognito (cognito-sync) to invoke `PutRecord` on your
       * Amazon Cognito stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The name of the Amazon Cognito stream to receive updates.
       *
       * This stream must be in the developer's account and in the same Region as the identity pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamname)
       */
      override fun streamName(): String? = unwrap(this).getStreamName()

      /**
       * Status of the Amazon Cognito streams.
       *
       * Valid values are: `ENABLED` or `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html#cfn-cognito-identitypool-cognitostreams-streamingstatus)
       */
      override fun streamingStatus(): String? = unwrap(this).getStreamingStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoStreamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty):
          CognitoStreamsProperty = CdkObjectWrappers.wrap(cdkObject) as CognitoStreamsProperty

      internal fun unwrap(wrapped: CognitoStreamsProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnIdentityPool.CognitoStreamsProperty
    }
  }

  /**
   * `PushSync` is a property of the
   * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
   * resource that defines the configuration options to be applied to an Amazon Cognito identity pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * PushSyncProperty pushSyncProperty = PushSyncProperty.builder()
   * .applicationArns(List.of("applicationArns"))
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html)
   */
  public interface PushSyncProperty {
    /**
     * The ARNs of the Amazon SNS platform applications that could be used by clients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns)
     */
    public fun applicationArns(): List<String> = unwrap(this).getApplicationArns() ?: emptyList()

    /**
     * An IAM role configured to allow Amazon Cognito to call Amazon SNS on behalf of the developer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [PushSyncProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationArns The ARNs of the Amazon SNS platform applications that could be used
       * by clients.
       */
      public fun applicationArns(applicationArns: List<String>)

      /**
       * @param applicationArns The ARNs of the Amazon SNS platform applications that could be used
       * by clients.
       */
      public fun applicationArns(vararg applicationArns: String)

      /**
       * @param roleArn An IAM role configured to allow Amazon Cognito to call Amazon SNS on behalf
       * of the developer.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder =
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.builder()

      /**
       * @param applicationArns The ARNs of the Amazon SNS platform applications that could be used
       * by clients.
       */
      override fun applicationArns(applicationArns: List<String>) {
        cdkBuilder.applicationArns(applicationArns)
      }

      /**
       * @param applicationArns The ARNs of the Amazon SNS platform applications that could be used
       * by clients.
       */
      override fun applicationArns(vararg applicationArns: String): Unit =
          applicationArns(applicationArns.toList())

      /**
       * @param roleArn An IAM role configured to allow Amazon Cognito to call Amazon SNS on behalf
       * of the developer.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty,
    ) : CdkObject(cdkObject), PushSyncProperty {
      /**
       * The ARNs of the Amazon SNS platform applications that could be used by clients.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-applicationarns)
       */
      override fun applicationArns(): List<String> = unwrap(this).getApplicationArns() ?:
          emptyList()

      /**
       * An IAM role configured to allow Amazon Cognito to call Amazon SNS on behalf of the
       * developer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html#cfn-cognito-identitypool-pushsync-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PushSyncProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty):
          PushSyncProperty = CdkObjectWrappers.wrap(cdkObject) as PushSyncProperty

      internal fun unwrap(wrapped: PushSyncProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty
    }
  }
}
