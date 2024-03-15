@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderGoogle internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  public override fun providerName(): String = unwrap(this).getProviderName()

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b299248357b6ace644c21afff62e9dcb1eba6fe23e8a4f4d91ce66316ccf9d0a")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun clientId(clientId: String)

    @Deprecated(message = "deprecated in CDK")
    public fun clientSecret(clientSecret: String)

    public fun clientSecretValue(clientSecretValue: SecretValue)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle.Builder.create(scope,
        id)

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b299248357b6ace644c21afff62e9dcb1eba6fe23e8a4f4d91ce66316ccf9d0a")
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

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderGoogle {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderGoogle(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle):
        UserPoolIdentityProviderGoogle = UserPoolIdentityProviderGoogle(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderGoogle):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle = wrapped.cdkObject
  }
}
