@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UserPoolIdentityProviderFacebookProps : UserPoolIdentityProviderProps {
  public fun apiVersion(): String? = unwrap(this).getApiVersion()

  public fun clientId(): String

  public fun clientSecret(): String

  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun apiVersion(apiVersion: String)

    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4dc76dff7b9004e248a5d779d2272bc82b692f8b8607ec389924d44c11904d4")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: String)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps.builder()

    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4dc76dff7b9004e248a5d779d2272bc82b692f8b8607ec389924d44c11904d4")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderFacebookProps {
    override fun apiVersion(): String? = unwrap(this).getApiVersion()

    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    override fun clientId(): String = unwrap(this).getClientId()

    override fun clientSecret(): String = unwrap(this).getClientSecret()

    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolIdentityProviderFacebookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps):
        UserPoolIdentityProviderFacebookProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderFacebookProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps
  }
}
