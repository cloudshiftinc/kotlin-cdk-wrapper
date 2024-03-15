@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UserPoolIdentityProviderAmazonProps : UserPoolIdentityProviderProps {
  public fun clientId(): String

  public fun clientSecret(): String

  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("614fd90621e9b51dffb3a5e2e2c1a38a5527fca8dd7c10f320f1d94838c77294")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: String)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps.builder()

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("614fd90621e9b51dffb3a5e2e2c1a38a5527fca8dd7c10f320f1d94838c77294")
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

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderAmazonProps {
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    override fun clientId(): String = unwrap(this).getClientId()

    override fun clientSecret(): String = unwrap(this).getClientSecret()

    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolIdentityProviderAmazonProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps):
        UserPoolIdentityProviderAmazonProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderAmazonProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
  }
}
