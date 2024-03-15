@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnIdentityProviderConfigProps {
  public fun clusterName(): String

  public fun identityProviderConfigName(): String? = unwrap(this).getIdentityProviderConfigName()

  public fun oidc(): Any? = unwrap(this).getOidc()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun clusterName(clusterName: String)

    public fun identityProviderConfigName(identityProviderConfigName: String)

    public fun oidc(oidc: IResolvable)

    public fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fe0215ed6d2c62a5e3d1d42d7a54af200fcabcd697a6f4c255e4395b5074dad")
    public
        fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps.Builder =
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps.builder()

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun identityProviderConfigName(identityProviderConfigName: String) {
      cdkBuilder.identityProviderConfigName(identityProviderConfigName)
    }

    override fun oidc(oidc: IResolvable) {
      cdkBuilder.oidc(oidc.let(IResolvable::unwrap))
    }

    override fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty) {
      cdkBuilder.oidc(oidc.let(CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fe0215ed6d2c62a5e3d1d42d7a54af200fcabcd697a6f4c255e4395b5074dad")
    override
        fun oidc(oidc: CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty.Builder.() -> Unit):
        Unit = oidc(CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty(oidc))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps,
  ) : CdkObject(cdkObject), CfnIdentityProviderConfigProps {
    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun identityProviderConfigName(): String? =
        unwrap(this).getIdentityProviderConfigName()

    override fun oidc(): Any? = unwrap(this).getOidc()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityProviderConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps):
        CfnIdentityProviderConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityProviderConfigProps):
        software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps
  }
}
