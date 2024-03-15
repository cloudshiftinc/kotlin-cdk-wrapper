@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UserPoolIdentityProviderGoogleProps : UserPoolIdentityProviderProps {
  public fun clientId(): String

  @Deprecated(message = "deprecated in CDK")
  public fun clientSecret(): String? = unwrap(this).getClientSecret()

  public fun clientSecretValue(): SecretValue? =
      unwrap(this).getClientSecretValue()?.let(SecretValue::wrap)

  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1da86c12f46872187c50110a014cb2a623c0499083e533242aac9e0daeb0373")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun clientId(clientId: String)

    @Deprecated(message = "deprecated in CDK")
    public fun clientSecret(clientSecret: String)

    public fun clientSecretValue(clientSecretValue: SecretValue)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps.builder()

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1da86c12f46872187c50110a014cb2a623c0499083e533242aac9e0daeb0373")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    override fun clientSecretValue(clientSecretValue: SecretValue) {
      cdkBuilder.clientSecretValue(clientSecretValue.let(SecretValue::unwrap))
    }

    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderGoogleProps {
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    override fun clientId(): String = unwrap(this).getClientId()

    @Deprecated(message = "deprecated in CDK")
    override fun clientSecret(): String? = unwrap(this).getClientSecret()

    override fun clientSecretValue(): SecretValue? =
        unwrap(this).getClientSecretValue()?.let(SecretValue::wrap)

    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolIdentityProviderGoogleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps):
        UserPoolIdentityProviderGoogleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderGoogleProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps
  }
}
