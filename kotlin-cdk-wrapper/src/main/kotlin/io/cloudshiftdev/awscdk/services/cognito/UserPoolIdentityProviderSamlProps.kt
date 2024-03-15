@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UserPoolIdentityProviderSamlProps : UserPoolIdentityProviderProps {
  public fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

  public fun idpSignout(): Boolean? = unwrap(this).getIdpSignout()

  public fun metadata(): UserPoolIdentityProviderSamlMetadata

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f249519be5b5218935deb62a01e70e9328388781333df34109754790e1f63c43")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun identifiers(identifiers: List<String>)

    public fun identifiers(vararg identifiers: String)

    public fun idpSignout(idpSignout: Boolean)

    public fun metadata(metadata: UserPoolIdentityProviderSamlMetadata)

    public fun name(name: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps.builder()

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f249519be5b5218935deb62a01e70e9328388781333df34109754790e1f63c43")
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

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderSamlProps {
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    override fun identifiers(): List<String> = unwrap(this).getIdentifiers() ?: emptyList()

    override fun idpSignout(): Boolean? = unwrap(this).getIdpSignout()

    override fun metadata(): UserPoolIdentityProviderSamlMetadata =
        unwrap(this).getMetadata().let(UserPoolIdentityProviderSamlMetadata::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolIdentityProviderSamlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps):
        UserPoolIdentityProviderSamlProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderSamlProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps
  }
}
