@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UserPoolIdentityProviderOidcProps : UserPoolIdentityProviderProps {
  public fun attributeRequestMethod(): OidcAttributeRequestMethod? =
      unwrap(this).getAttributeRequestMethod()?.let(OidcAttributeRequestMethod::wrap)

  public fun clientId(): String

  public fun clientSecret(): String

  public fun endpoints(): OidcEndpoints? = unwrap(this).getEndpoints()?.let(OidcEndpoints::wrap)

  public fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

  public fun issuerUrl(): String

  public fun name(): String? = unwrap(this).getName()

  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e89b7fefaa4ce1fbb91d0fdaba402251b851e019a720677c00946e095895bf")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: String)

    public fun endpoints(endpoints: OidcEndpoints)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00a796853f9e507218b68bee07f7a22e112a4867366616cfabb511165a47c5ee")
    public fun endpoints(endpoints: OidcEndpoints.Builder.() -> Unit)

    public fun identifiers(identifiers: List<String>)

    public fun identifiers(vararg identifiers: String)

    public fun issuerUrl(issuerUrl: String)

    public fun name(name: String)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps.builder()

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e89b7fefaa4ce1fbb91d0fdaba402251b851e019a720677c00946e095895bf")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    override fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod) {
      cdkBuilder.attributeRequestMethod(attributeRequestMethod.let(OidcAttributeRequestMethod::unwrap))
    }

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    override fun endpoints(endpoints: OidcEndpoints) {
      cdkBuilder.endpoints(endpoints.let(OidcEndpoints::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00a796853f9e507218b68bee07f7a22e112a4867366616cfabb511165a47c5ee")
    override fun endpoints(endpoints: OidcEndpoints.Builder.() -> Unit): Unit =
        endpoints(OidcEndpoints(endpoints))

    override fun identifiers(identifiers: List<String>) {
      cdkBuilder.identifiers(identifiers)
    }

    override fun identifiers(vararg identifiers: String): Unit = identifiers(identifiers.toList())

    override fun issuerUrl(issuerUrl: String) {
      cdkBuilder.issuerUrl(issuerUrl)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderOidcProps {
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    override fun attributeRequestMethod(): OidcAttributeRequestMethod? =
        unwrap(this).getAttributeRequestMethod()?.let(OidcAttributeRequestMethod::wrap)

    override fun clientId(): String = unwrap(this).getClientId()

    override fun clientSecret(): String = unwrap(this).getClientSecret()

    override fun endpoints(): OidcEndpoints? = unwrap(this).getEndpoints()?.let(OidcEndpoints::wrap)

    override fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

    override fun issuerUrl(): String = unwrap(this).getIssuerUrl()

    override fun name(): String? = unwrap(this).getName()

    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolIdentityProviderOidcProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps):
        UserPoolIdentityProviderOidcProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderOidcProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps
  }
}
