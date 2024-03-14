package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPoolClient internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient,
) : CfnResource(cdkObject), IInspectable {
  public open fun accessTokenValidity(): Number? = unwrap(this).getAccessTokenValidity()

  public open fun accessTokenValidity(`value`: Number) {
    unwrap(this).setAccessTokenValidity(`value`)
  }

  public open fun allowedOAuthFlows(): List<String> = unwrap(this).getAllowedOAuthFlows() ?:
      emptyList()

  public open fun allowedOAuthFlows(`value`: List<String>) {
    unwrap(this).setAllowedOAuthFlows(`value`)
  }

  public open fun allowedOAuthFlowsUserPoolClient(): Any? =
      unwrap(this).getAllowedOAuthFlowsUserPoolClient()

  public open fun allowedOAuthFlowsUserPoolClient(`value`: Boolean) {
    unwrap(this).setAllowedOAuthFlowsUserPoolClient(`value`)
  }

  public open fun allowedOAuthFlowsUserPoolClient(`value`: IResolvable) {
    unwrap(this).setAllowedOAuthFlowsUserPoolClient(`value`.let(IResolvable::unwrap))
  }

  public open fun allowedOAuthScopes(): List<String> = unwrap(this).getAllowedOAuthScopes() ?:
      emptyList()

  public open fun allowedOAuthScopes(`value`: List<String>) {
    unwrap(this).setAllowedOAuthScopes(`value`)
  }

  public open fun analyticsConfiguration(): Any? = unwrap(this).getAnalyticsConfiguration()

  public open fun analyticsConfiguration(`value`: IResolvable) {
    unwrap(this).setAnalyticsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun analyticsConfiguration(`value`: AnalyticsConfigurationProperty) {
    unwrap(this).setAnalyticsConfiguration(`value`.let(AnalyticsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("102bf21851c48d7b0174d4fcb25dd8027756a52a18ce95604a9a1847aa912e6c")
  public open
      fun analyticsConfiguration(`value`: AnalyticsConfigurationProperty.Builder.() -> Unit): Unit =
      analyticsConfiguration(AnalyticsConfigurationProperty(`value`))

  public open fun attrClientId(): String = unwrap(this).getAttrClientId()

  public open fun attrClientSecret(): String = unwrap(this).getAttrClientSecret()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun authSessionValidity(): Number? = unwrap(this).getAuthSessionValidity()

  public open fun authSessionValidity(`value`: Number) {
    unwrap(this).setAuthSessionValidity(`value`)
  }

  public open fun callbackUrLs(): List<String> = unwrap(this).getCallbackUrLs() ?: emptyList()

  public open fun callbackUrLs(`value`: List<String>) {
    unwrap(this).setCallbackUrLs(`value`)
  }

  public open fun clientName(): String? = unwrap(this).getClientName()

  public open fun clientName(`value`: String) {
    unwrap(this).setClientName(`value`)
  }

  public open fun defaultRedirectUri(): String? = unwrap(this).getDefaultRedirectUri()

  public open fun defaultRedirectUri(`value`: String) {
    unwrap(this).setDefaultRedirectUri(`value`)
  }

  public open fun enablePropagateAdditionalUserContextData(): Any? =
      unwrap(this).getEnablePropagateAdditionalUserContextData()

  public open fun enablePropagateAdditionalUserContextData(`value`: Boolean) {
    unwrap(this).setEnablePropagateAdditionalUserContextData(`value`)
  }

  public open fun enablePropagateAdditionalUserContextData(`value`: IResolvable) {
    unwrap(this).setEnablePropagateAdditionalUserContextData(`value`.let(IResolvable::unwrap))
  }

  public open fun enableTokenRevocation(): Any? = unwrap(this).getEnableTokenRevocation()

  public open fun enableTokenRevocation(`value`: Boolean) {
    unwrap(this).setEnableTokenRevocation(`value`)
  }

  public open fun enableTokenRevocation(`value`: IResolvable) {
    unwrap(this).setEnableTokenRevocation(`value`.let(IResolvable::unwrap))
  }

  public open fun explicitAuthFlows(): List<String> = unwrap(this).getExplicitAuthFlows() ?:
      emptyList()

  public open fun explicitAuthFlows(`value`: List<String>) {
    unwrap(this).setExplicitAuthFlows(`value`)
  }

  public open fun generateSecret(): Any? = unwrap(this).getGenerateSecret()

  public open fun generateSecret(`value`: Boolean) {
    unwrap(this).setGenerateSecret(`value`)
  }

  public open fun generateSecret(`value`: IResolvable) {
    unwrap(this).setGenerateSecret(`value`.let(IResolvable::unwrap))
  }

  public open fun idTokenValidity(): Number? = unwrap(this).getIdTokenValidity()

  public open fun idTokenValidity(`value`: Number) {
    unwrap(this).setIdTokenValidity(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logoutUrLs(): List<String> = unwrap(this).getLogoutUrLs() ?: emptyList()

  public open fun logoutUrLs(`value`: List<String>) {
    unwrap(this).setLogoutUrLs(`value`)
  }

  public open fun preventUserExistenceErrors(): String? =
      unwrap(this).getPreventUserExistenceErrors()

  public open fun preventUserExistenceErrors(`value`: String) {
    unwrap(this).setPreventUserExistenceErrors(`value`)
  }

  public open fun readAttributes(): List<String> = unwrap(this).getReadAttributes() ?: emptyList()

  public open fun readAttributes(`value`: List<String>) {
    unwrap(this).setReadAttributes(`value`)
  }

  public open fun refreshTokenValidity(): Number? = unwrap(this).getRefreshTokenValidity()

  public open fun refreshTokenValidity(`value`: Number) {
    unwrap(this).setRefreshTokenValidity(`value`)
  }

  public open fun supportedIdentityProviders(): List<String> =
      unwrap(this).getSupportedIdentityProviders() ?: emptyList()

  public open fun supportedIdentityProviders(`value`: List<String>) {
    unwrap(this).setSupportedIdentityProviders(`value`)
  }

  public open fun tokenValidityUnits(): Any? = unwrap(this).getTokenValidityUnits()

  public open fun tokenValidityUnits(`value`: IResolvable) {
    unwrap(this).setTokenValidityUnits(`value`.let(IResolvable::unwrap))
  }

  public open fun tokenValidityUnits(`value`: TokenValidityUnitsProperty) {
    unwrap(this).setTokenValidityUnits(`value`.let(TokenValidityUnitsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("413ff2cb02d2613d782abf027a2d67ebe8e35dfbb363a27a330d747431aed8bb")
  public open fun tokenValidityUnits(`value`: TokenValidityUnitsProperty.Builder.() -> Unit): Unit =
      tokenValidityUnits(TokenValidityUnitsProperty(`value`))

  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  public open fun writeAttributes(): List<String> = unwrap(this).getWriteAttributes() ?: emptyList()

  public open fun writeAttributes(`value`: List<String>) {
    unwrap(this).setWriteAttributes(`value`)
  }

  public interface Builder {
    public fun accessTokenValidity(accessTokenValidity: Number) {
    }

    public fun allowedOAuthFlows(allowedOAuthFlows: List<String>) {
    }

    public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean) {
    }

    public fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable) {
    }

    public fun allowedOAuthScopes(allowedOAuthScopes: List<String>) {
    }

    public fun analyticsConfiguration(analyticsConfiguration: IResolvable) {
    }

    public fun analyticsConfiguration(analyticsConfiguration: AnalyticsConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48cae7ce2dc592da94fa21c75ec0358a510ee6100105ad2c0c70cb8f3838fdba")
    public
        fun analyticsConfiguration(analyticsConfiguration: AnalyticsConfigurationProperty.Builder.() -> Unit) {
    }

    public fun authSessionValidity(authSessionValidity: Number) {
    }

    public fun callbackUrLs(callbackUrLs: List<String>) {
    }

    public fun clientName(clientName: String) {
    }

    public fun defaultRedirectUri(defaultRedirectUri: String) {
    }

    public
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean) {
    }

    public
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable) {
    }

    public fun enableTokenRevocation(enableTokenRevocation: Boolean) {
    }

    public fun enableTokenRevocation(enableTokenRevocation: IResolvable) {
    }

    public fun explicitAuthFlows(explicitAuthFlows: List<String>) {
    }

    public fun generateSecret(generateSecret: Boolean) {
    }

    public fun generateSecret(generateSecret: IResolvable) {
    }

    public fun idTokenValidity(idTokenValidity: Number) {
    }

    public fun logoutUrLs(logoutUrLs: List<String>) {
    }

    public fun preventUserExistenceErrors(preventUserExistenceErrors: String) {
    }

    public fun readAttributes(readAttributes: List<String>) {
    }

    public fun refreshTokenValidity(refreshTokenValidity: Number) {
    }

    public fun supportedIdentityProviders(supportedIdentityProviders: List<String>) {
    }

    public fun tokenValidityUnits(tokenValidityUnits: IResolvable) {
    }

    public fun tokenValidityUnits(tokenValidityUnits: TokenValidityUnitsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("443f031b846120e488d68c74c4d139304198bea73f85c4e88d462430a8525142")
    public
        fun tokenValidityUnits(tokenValidityUnits: TokenValidityUnitsProperty.Builder.() -> Unit) {
    }

    public fun userPoolId(userPoolId: String) {
    }

    public fun writeAttributes(writeAttributes: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnUserPoolClient.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolClient.Builder.create(scope, id)

    public override fun accessTokenValidity(accessTokenValidity: Number) {
      cdkBuilder.accessTokenValidity(accessTokenValidity)
    }

    public override fun allowedOAuthFlows(allowedOAuthFlows: List<String>) {
      cdkBuilder.allowedOAuthFlows(allowedOAuthFlows)
    }

    public override fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: Boolean) {
      cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient)
    }

    public override
        fun allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient: IResolvable) {
      cdkBuilder.allowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient.let(IResolvable::unwrap))
    }

    public override fun allowedOAuthScopes(allowedOAuthScopes: List<String>) {
      cdkBuilder.allowedOAuthScopes(allowedOAuthScopes)
    }

    public override fun analyticsConfiguration(analyticsConfiguration: IResolvable) {
      cdkBuilder.analyticsConfiguration(analyticsConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun analyticsConfiguration(analyticsConfiguration: AnalyticsConfigurationProperty) {
      cdkBuilder.analyticsConfiguration(analyticsConfiguration.let(AnalyticsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48cae7ce2dc592da94fa21c75ec0358a510ee6100105ad2c0c70cb8f3838fdba")
    public override
        fun analyticsConfiguration(analyticsConfiguration: AnalyticsConfigurationProperty.Builder.() -> Unit):
        Unit = analyticsConfiguration(AnalyticsConfigurationProperty(analyticsConfiguration))

    public override fun authSessionValidity(authSessionValidity: Number) {
      cdkBuilder.authSessionValidity(authSessionValidity)
    }

    public override fun callbackUrLs(callbackUrLs: List<String>) {
      cdkBuilder.callbackUrLs(callbackUrLs)
    }

    public override fun clientName(clientName: String) {
      cdkBuilder.clientName(clientName)
    }

    public override fun defaultRedirectUri(defaultRedirectUri: String) {
      cdkBuilder.defaultRedirectUri(defaultRedirectUri)
    }

    public override
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: Boolean) {
      cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData)
    }

    public override
        fun enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData: IResolvable) {
      cdkBuilder.enablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData.let(IResolvable::unwrap))
    }

    public override fun enableTokenRevocation(enableTokenRevocation: Boolean) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    public override fun enableTokenRevocation(enableTokenRevocation: IResolvable) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation.let(IResolvable::unwrap))
    }

    public override fun explicitAuthFlows(explicitAuthFlows: List<String>) {
      cdkBuilder.explicitAuthFlows(explicitAuthFlows)
    }

    public override fun generateSecret(generateSecret: Boolean) {
      cdkBuilder.generateSecret(generateSecret)
    }

    public override fun generateSecret(generateSecret: IResolvable) {
      cdkBuilder.generateSecret(generateSecret.let(IResolvable::unwrap))
    }

    public override fun idTokenValidity(idTokenValidity: Number) {
      cdkBuilder.idTokenValidity(idTokenValidity)
    }

    public override fun logoutUrLs(logoutUrLs: List<String>) {
      cdkBuilder.logoutUrLs(logoutUrLs)
    }

    public override fun preventUserExistenceErrors(preventUserExistenceErrors: String) {
      cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

    public override fun readAttributes(readAttributes: List<String>) {
      cdkBuilder.readAttributes(readAttributes)
    }

    public override fun refreshTokenValidity(refreshTokenValidity: Number) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity)
    }

    public override fun supportedIdentityProviders(supportedIdentityProviders: List<String>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders)
    }

    public override fun tokenValidityUnits(tokenValidityUnits: IResolvable) {
      cdkBuilder.tokenValidityUnits(tokenValidityUnits.let(IResolvable::unwrap))
    }

    public override fun tokenValidityUnits(tokenValidityUnits: TokenValidityUnitsProperty) {
      cdkBuilder.tokenValidityUnits(tokenValidityUnits.let(TokenValidityUnitsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("443f031b846120e488d68c74c4d139304198bea73f85c4e88d462430a8525142")
    public override
        fun tokenValidityUnits(tokenValidityUnits: TokenValidityUnitsProperty.Builder.() -> Unit):
        Unit = tokenValidityUnits(TokenValidityUnitsProperty(tokenValidityUnits))

    public override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public override fun writeAttributes(writeAttributes: List<String>) {
      cdkBuilder.writeAttributes(writeAttributes)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolClient =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolClient {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolClient(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient):
        CfnUserPoolClient = CfnUserPoolClient(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolClient):
        software.amazon.awscdk.services.cognito.CfnUserPoolClient = wrapped.cdkObject
  }

  public interface TokenValidityUnitsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun idToken(): String? = unwrap(this).getIdToken()

    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    public interface Builder {
      public fun accessToken(accessToken: String) {
      }

      public fun idToken(idToken: String) {
      }

      public fun refreshToken(refreshToken: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty.builder()

      public override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      public override fun idToken(idToken: String) {
        cdkBuilder.idToken(idToken)
      }

      public override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty,
    ) : TokenValidityUnitsProperty {
      public override fun accessToken(): String? = unwrap(this).getAccessToken()

      public override fun idToken(): String? = unwrap(this).getIdToken()

      public override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TokenValidityUnitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty):
          TokenValidityUnitsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TokenValidityUnitsProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.TokenValidityUnitsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AnalyticsConfigurationProperty {
    public fun applicationArn(): String? = unwrap(this).getApplicationArn()

    public fun applicationId(): String? = unwrap(this).getApplicationId()

    public fun externalId(): String? = unwrap(this).getExternalId()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun userDataShared(): Any? = unwrap(this).getUserDataShared()

    public interface Builder {
      public fun applicationArn(applicationArn: String) {
      }

      public fun applicationId(applicationId: String) {
      }

      public fun externalId(externalId: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun userDataShared(userDataShared: Boolean) {
      }

      public fun userDataShared(userDataShared: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty.builder()

      public override fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
      }

      public override fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
      }

      public override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun userDataShared(userDataShared: Boolean) {
        cdkBuilder.userDataShared(userDataShared)
      }

      public override fun userDataShared(userDataShared: IResolvable) {
        cdkBuilder.userDataShared(userDataShared.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty,
    ) : AnalyticsConfigurationProperty {
      public override fun applicationArn(): String? = unwrap(this).getApplicationArn()

      public override fun applicationId(): String? = unwrap(this).getApplicationId()

      public override fun externalId(): String? = unwrap(this).getExternalId()

      public override fun roleArn(): String? = unwrap(this).getRoleArn()

      public override fun userDataShared(): Any? = unwrap(this).getUserDataShared()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AnalyticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty):
          AnalyticsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalyticsConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolClient.AnalyticsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
