@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnUserPoolClientProps {
  public fun accessTokenValidity(): Number? = unwrap(this).getAccessTokenValidity()

  public fun allowedOAuthFlows(): List<String> = unwrap(this).getAllowedOAuthFlows() ?: emptyList()

  public fun allowedOAuthFlowsUserPoolClient(): Any? =
      unwrap(this).getAllowedOAuthFlowsUserPoolClient()

  public fun allowedOAuthScopes(): List<String> = unwrap(this).getAllowedOAuthScopes() ?:
      emptyList()

  public fun analyticsConfiguration(): Any? = unwrap(this).getAnalyticsConfiguration()

  public fun authSessionValidity(): Number? = unwrap(this).getAuthSessionValidity()

  public fun callbackUrLs(): List<String> = unwrap(this).getCallbackUrLs() ?: emptyList()

  public fun clientName(): String? = unwrap(this).getClientName()

  public fun defaultRedirectUri(): String? = unwrap(this).getDefaultRedirectUri()

  public fun enablePropagateAdditionalUserContextData(): Any? =
      unwrap(this).getEnablePropagateAdditionalUserContextData()

  public fun enableTokenRevocation(): Any? = unwrap(this).getEnableTokenRevocation()

  public fun explicitAuthFlows(): List<String> = unwrap(this).getExplicitAuthFlows() ?: emptyList()

  public fun generateSecret(): Any? = unwrap(this).getGenerateSecret()

  public fun idTokenValidity(): Number? = unwrap(this).getIdTokenValidity()

  public fun logoutUrLs(): List<String> = unwrap(this).getLogoutUrLs() ?: emptyList()

  public fun preventUserExistenceErrors(): String? = unwrap(this).getPreventUserExistenceErrors()

  public fun readAttributes(): List<String> = unwrap(this).getReadAttributes() ?: emptyList()

  public fun refreshTokenValidity(): Number? = unwrap(this).getRefreshTokenValidity()

  public fun supportedIdentityProviders(): List<String> =
      unwrap(this).getSupportedIdentityProviders() ?: emptyList()

  public fun tokenValidityUnits(): Any? = unwrap(this).getTokenValidityUnits()

  public fun userPoolId(): String

  public fun writeAttributes(): List<String> = unwrap(this).getWriteAttributes() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessTokenValidity(accessTokenValidity: Number)

    public fun allowedOAuthFlows(allowedOAuthFlows: List<String>)

    public fun allowedOAuthFlows(vararg allowedOAuthFlows: String)

    public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean)

    public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable)

    public fun allowedOAuthScopes(allowedOAuthScopes: List<String>)

    public fun allowedOAuthScopes(vararg allowedOAuthScopes: String)

    public fun analyticsConfiguration(analyticsConfiguration: IResolvable)

    public
        fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c18567dee94105c1859d6ab6b5fae6ab35e46a673e0c037496e3dc5a4fdac6f")
    public
        fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty.Builder.() -> Unit)

    public fun authSessionValidity(authSessionValidity: Number)

    public fun callbackUrLs(callbackUrLs: List<String>)

    public fun callbackUrLs(vararg callbackUrLs: String)

    public fun clientName(clientName: String)

    public fun defaultRedirectUri(defaultRedirectUri: String)

    public
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean)

    public
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable)

    public fun enableTokenRevocation(enableTokenRevocation: Boolean)

    public fun enableTokenRevocation(enableTokenRevocation: IResolvable)

    public fun explicitAuthFlows(explicitAuthFlows: List<String>)

    public fun explicitAuthFlows(vararg explicitAuthFlows: String)

    public fun generateSecret(generateSecret: Boolean)

    public fun generateSecret(generateSecret: IResolvable)

    public fun idTokenValidity(idTokenValidity: Number)

    public fun logoutUrLs(logoutUrLs: List<String>)

    public fun logoutUrLs(vararg logoutUrLs: String)

    public fun preventUserExistenceErrors(preventUserExistenceErrors: String)

    public fun readAttributes(readAttributes: List<String>)

    public fun readAttributes(vararg readAttributes: String)

    public fun refreshTokenValidity(refreshTokenValidity: Number)

    public fun supportedIdentityProviders(supportedIdentityProviders: List<String>)

    public fun supportedIdentityProviders(vararg supportedIdentityProviders: String)

    public fun tokenValidityUnits(tokenValidityUnits: IResolvable)

    public fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("248a3283135b66da6637a87c29187fd71a9f2c552a98e42a23c03dc3c4f13557")
    public
        fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty.Builder.() -> Unit)

    public fun userPoolId(userPoolId: String)

    public fun writeAttributes(writeAttributes: List<String>)

    public fun writeAttributes(vararg writeAttributes: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolClientProps.builder()

    override fun accessTokenValidity(accessTokenValidity: Number) {
      cdkBuilder.accessTokenValidity(accessTokenValidity)
    }

    override fun allowedOAuthFlows(allowedOAuthFlows: List<String>) {
      cdkBuilder.allowedOAuthFlows(allowedOAuthFlows)
    }

    override fun allowedOAuthFlows(vararg allowedOAuthFlows: String): Unit =
        allowedOAuthFlows(allowedOAuthFlows.toList())

    override fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean) {
      cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient)
    }

    override fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable) {
      cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient.let(IResolvable::unwrap))
    }

    override fun allowedOAuthScopes(allowedOAuthScopes: List<String>) {
      cdkBuilder.allowedOAuthScopes(allowedOAuthScopes)
    }

    override fun allowedOAuthScopes(vararg allowedOAuthScopes: String): Unit =
        allowedOAuthScopes(allowedOAuthScopes.toList())

    override fun analyticsConfiguration(analyticsConfiguration: IResolvable) {
      cdkBuilder.analyticsConfiguration(analyticsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty) {
      cdkBuilder.analyticsConfiguration(analyticsConfiguration.let(CfnUserPoolClient.AnalyticsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c18567dee94105c1859d6ab6b5fae6ab35e46a673e0c037496e3dc5a4fdac6f")
    override
        fun analyticsConfiguration(analyticsConfiguration: CfnUserPoolClient.AnalyticsConfigurationProperty.Builder.() -> Unit):
        Unit =
        analyticsConfiguration(CfnUserPoolClient.AnalyticsConfigurationProperty(analyticsConfiguration))

    override fun authSessionValidity(authSessionValidity: Number) {
      cdkBuilder.authSessionValidity(authSessionValidity)
    }

    override fun callbackUrLs(callbackUrLs: List<String>) {
      cdkBuilder.callbackUrLs(callbackUrLs)
    }

    override fun callbackUrLs(vararg callbackUrLs: String): Unit =
        callbackUrLs(callbackUrLs.toList())

    override fun clientName(clientName: String) {
      cdkBuilder.clientName(clientName)
    }

    override fun defaultRedirectUri(defaultRedirectUri: String) {
      cdkBuilder.defaultRedirectUri(defaultRedirectUri)
    }

    override
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean) {
      cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData)
    }

    override
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable) {
      cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData.let(IResolvable::unwrap))
    }

    override fun enableTokenRevocation(enableTokenRevocation: Boolean) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    override fun enableTokenRevocation(enableTokenRevocation: IResolvable) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation.let(IResolvable::unwrap))
    }

    override fun explicitAuthFlows(explicitAuthFlows: List<String>) {
      cdkBuilder.explicitAuthFlows(explicitAuthFlows)
    }

    override fun explicitAuthFlows(vararg explicitAuthFlows: String): Unit =
        explicitAuthFlows(explicitAuthFlows.toList())

    override fun generateSecret(generateSecret: Boolean) {
      cdkBuilder.generateSecret(generateSecret)
    }

    override fun generateSecret(generateSecret: IResolvable) {
      cdkBuilder.generateSecret(generateSecret.let(IResolvable::unwrap))
    }

    override fun idTokenValidity(idTokenValidity: Number) {
      cdkBuilder.idTokenValidity(idTokenValidity)
    }

    override fun logoutUrLs(logoutUrLs: List<String>) {
      cdkBuilder.logoutUrLs(logoutUrLs)
    }

    override fun logoutUrLs(vararg logoutUrLs: String): Unit = logoutUrLs(logoutUrLs.toList())

    override fun preventUserExistenceErrors(preventUserExistenceErrors: String) {
      cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

    override fun readAttributes(readAttributes: List<String>) {
      cdkBuilder.readAttributes(readAttributes)
    }

    override fun readAttributes(vararg readAttributes: String): Unit =
        readAttributes(readAttributes.toList())

    override fun refreshTokenValidity(refreshTokenValidity: Number) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity)
    }

    override fun supportedIdentityProviders(supportedIdentityProviders: List<String>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders)
    }

    override fun supportedIdentityProviders(vararg supportedIdentityProviders: String): Unit =
        supportedIdentityProviders(supportedIdentityProviders.toList())

    override fun tokenValidityUnits(tokenValidityUnits: IResolvable) {
      cdkBuilder.tokenValidityUnits(tokenValidityUnits.let(IResolvable::unwrap))
    }

    override
        fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty) {
      cdkBuilder.tokenValidityUnits(tokenValidityUnits.let(CfnUserPoolClient.TokenValidityUnitsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("248a3283135b66da6637a87c29187fd71a9f2c552a98e42a23c03dc3c4f13557")
    override
        fun tokenValidityUnits(tokenValidityUnits: CfnUserPoolClient.TokenValidityUnitsProperty.Builder.() -> Unit):
        Unit = tokenValidityUnits(CfnUserPoolClient.TokenValidityUnitsProperty(tokenValidityUnits))

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    override fun writeAttributes(writeAttributes: List<String>) {
      cdkBuilder.writeAttributes(writeAttributes)
    }

    override fun writeAttributes(vararg writeAttributes: String): Unit =
        writeAttributes(writeAttributes.toList())

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolClientProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClientProps,
  ) : CdkObject(cdkObject), CfnUserPoolClientProps {
    override fun accessTokenValidity(): Number? = unwrap(this).getAccessTokenValidity()

    override fun allowedOAuthFlows(): List<String> = unwrap(this).getAllowedOAuthFlows() ?:
        emptyList()

    override fun allowedOAuthFlowsUserPoolClient(): Any? =
        unwrap(this).getAllowedOAuthFlowsUserPoolClient()

    override fun allowedOAuthScopes(): List<String> = unwrap(this).getAllowedOAuthScopes() ?:
        emptyList()

    override fun analyticsConfiguration(): Any? = unwrap(this).getAnalyticsConfiguration()

    override fun authSessionValidity(): Number? = unwrap(this).getAuthSessionValidity()

    override fun callbackUrLs(): List<String> = unwrap(this).getCallbackUrLs() ?: emptyList()

    override fun clientName(): String? = unwrap(this).getClientName()

    override fun defaultRedirectUri(): String? = unwrap(this).getDefaultRedirectUri()

    override fun enablePropagateAdditionalUserContextData(): Any? =
        unwrap(this).getEnablePropagateAdditionalUserContextData()

    override fun enableTokenRevocation(): Any? = unwrap(this).getEnableTokenRevocation()

    override fun explicitAuthFlows(): List<String> = unwrap(this).getExplicitAuthFlows() ?:
        emptyList()

    override fun generateSecret(): Any? = unwrap(this).getGenerateSecret()

    override fun idTokenValidity(): Number? = unwrap(this).getIdTokenValidity()

    override fun logoutUrLs(): List<String> = unwrap(this).getLogoutUrLs() ?: emptyList()

    override fun preventUserExistenceErrors(): String? =
        unwrap(this).getPreventUserExistenceErrors()

    override fun readAttributes(): List<String> = unwrap(this).getReadAttributes() ?: emptyList()

    override fun refreshTokenValidity(): Number? = unwrap(this).getRefreshTokenValidity()

    override fun supportedIdentityProviders(): List<String> =
        unwrap(this).getSupportedIdentityProviders() ?: emptyList()

    override fun tokenValidityUnits(): Any? = unwrap(this).getTokenValidityUnits()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()

    override fun writeAttributes(): List<String> = unwrap(this).getWriteAttributes() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolClientProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClientProps):
        CfnUserPoolClientProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolClientProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolClientProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnUserPoolClientProps
  }
}
