package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderSaml internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  public override fun providerName(): String = unwrap(this).getProviderName()

  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3771ad72297d21014e17d52c30c5f392224535d2f3ee940dc37713e13e6ce65")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun identifiers(identifiers: List<String>)

    public fun identifiers(vararg identifiers: String)

    public fun idpSignout(idpSignout: Boolean)

    public fun metadata(metadata: UserPoolIdentityProviderSamlMetadata)

    public fun name(name: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml.Builder.create(scope,
        id)

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3771ad72297d21014e17d52c30c5f392224535d2f3ee940dc37713e13e6ce65")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    override fun identifiers(identifiers: List<String>) {
      cdkBuilder.identifiers(identifiers)
    }

    override fun identifiers(vararg identifiers: String): Unit = identifiers(identifiers.toList())

    override fun idpSignout(idpSignout: Boolean) {
      cdkBuilder.idpSignout(idpSignout)
    }

    override fun metadata(metadata: UserPoolIdentityProviderSamlMetadata) {
      cdkBuilder.metadata(metadata.let(UserPoolIdentityProviderSamlMetadata::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderSaml {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderSaml(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml):
        UserPoolIdentityProviderSaml = UserPoolIdentityProviderSaml(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderSaml):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml = wrapped.cdkObject
  }
}
