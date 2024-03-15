@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UserPoolIdentityProviderAppleProps : UserPoolIdentityProviderProps {
  public fun clientId(): String

  public fun keyId(): String

  public fun privateKey(): String

  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  public fun teamId(): String

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b32a461d52c381bc55f41650195c5a648e29781b382a8fd612ae181b498ffd7f")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun clientId(clientId: String)

    public fun keyId(keyId: String)

    public fun privateKey(privateKey: String)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun teamId(teamId: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps.builder()

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b32a461d52c381bc55f41650195c5a648e29781b382a8fd612ae181b498ffd7f")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun keyId(keyId: String) {
      cdkBuilder.keyId(keyId)
    }

    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderAppleProps {
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    override fun clientId(): String = unwrap(this).getClientId()

    override fun keyId(): String = unwrap(this).getKeyId()

    override fun privateKey(): String = unwrap(this).getPrivateKey()

    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    override fun teamId(): String = unwrap(this).getTeamId()

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolIdentityProviderAppleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps):
        UserPoolIdentityProviderAppleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderAppleProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps
  }
}
