package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderApple internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  public override fun providerName(): String = unwrap(this).getProviderName()

  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("612ecef2cc73e507e37d4eabc619e5df491a30563d64e6198a8d14825310f52a")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun clientId(clientId: String)

    public fun keyId(keyId: String)

    public fun privateKey(privateKey: String)

    public fun scopes(scopes: List<String>)

    public fun teamId(teamId: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple.Builder.create(scope,
        id)

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("612ecef2cc73e507e37d4eabc619e5df491a30563d64e6198a8d14825310f52a")
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

    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderApple {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderApple(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple):
        UserPoolIdentityProviderApple = UserPoolIdentityProviderApple(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderApple):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple = wrapped.cdkObject
  }
}
