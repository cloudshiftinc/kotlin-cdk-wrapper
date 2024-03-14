package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderFacebook internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  public override fun providerName(): String = unwrap(this).getProviderName()

  public interface Builder {
    public fun apiVersion(apiVersion: String)

    public fun attributeMapping(attributeMapping: AttributeMapping)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66e55b7353157a9afdcd364ce341a60e452b3f85ed3419f60defad4c4fb3042a")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: String)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook.Builder.create(scope,
        id)

    override fun apiVersion(apiVersion: String) {
      cdkBuilder.apiVersion(apiVersion)
    }

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66e55b7353157a9afdcd364ce341a60e452b3f85ed3419f60defad4c4fb3042a")
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

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderFacebook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderFacebook(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook):
        UserPoolIdentityProviderFacebook = UserPoolIdentityProviderFacebook(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderFacebook):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook = wrapped.cdkObject
  }
}
