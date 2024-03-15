@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserPoolIdentityProviderProps {
  public fun attributeMapping(): Any? = unwrap(this).getAttributeMapping()

  public fun idpIdentifiers(): List<String> = unwrap(this).getIdpIdentifiers() ?: emptyList()

  public fun providerDetails(): Any? = unwrap(this).getProviderDetails()

  public fun providerName(): String

  public fun providerType(): String

  public fun userPoolId(): String

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: Any)

    public fun idpIdentifiers(idpIdentifiers: List<String>)

    public fun idpIdentifiers(vararg idpIdentifiers: String)

    public fun providerDetails(providerDetails: Any)

    public fun providerName(providerName: String)

    public fun providerType(providerType: String)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps.builder()

    override fun attributeMapping(attributeMapping: Any) {
      cdkBuilder.attributeMapping(attributeMapping)
    }

    override fun idpIdentifiers(idpIdentifiers: List<String>) {
      cdkBuilder.idpIdentifiers(idpIdentifiers)
    }

    override fun idpIdentifiers(vararg idpIdentifiers: String): Unit =
        idpIdentifiers(idpIdentifiers.toList())

    override fun providerDetails(providerDetails: Any) {
      cdkBuilder.providerDetails(providerDetails)
    }

    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps,
  ) : CdkObject(cdkObject), CfnUserPoolIdentityProviderProps {
    override fun attributeMapping(): Any? = unwrap(this).getAttributeMapping()

    override fun idpIdentifiers(): List<String> = unwrap(this).getIdpIdentifiers() ?: emptyList()

    override fun providerDetails(): Any? = unwrap(this).getProviderDetails()

    override fun providerName(): String = unwrap(this).getProviderName()

    override fun providerType(): String = unwrap(this).getProviderType()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolIdentityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps):
        CfnUserPoolIdentityProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolIdentityProviderProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps
  }
}
