@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPackagingConfigurationProps {
  public fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

  public fun dashPackage(): Any? = unwrap(this).getDashPackage()

  public fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

  public fun id(): String

  public fun mssPackage(): Any? = unwrap(this).getMssPackage()

  public fun packagingGroupId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun cmafPackage(cmafPackage: IResolvable)

    public fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d3e6a4589841a52e0bb9d08bd825fe085226d9e8bca21c24f3eaa6ca2072396")
    public
        fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty.Builder.() -> Unit)

    public fun dashPackage(dashPackage: IResolvable)

    public fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfe14f571c4ef05986e320515d3d5657d307b6cae8cea4de1d3a9ec52d520774")
    public
        fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty.Builder.() -> Unit)

    public fun hlsPackage(hlsPackage: IResolvable)

    public fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58da73184e79ed85b2fd3ab2d97831d8e40d833ab8b100dc7a1554ad4d925e6b")
    public
        fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty.Builder.() -> Unit)

    public fun id(id: String)

    public fun mssPackage(mssPackage: IResolvable)

    public fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a03b4b861f92c46fb1ce0883d5b0593143187a8a76d22ef0e9e22cda6170f409")
    public
        fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty.Builder.() -> Unit)

    public fun packagingGroupId(packagingGroupId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps.builder()

    override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    override fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CfnPackagingConfiguration.CmafPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d3e6a4589841a52e0bb9d08bd825fe085226d9e8bca21c24f3eaa6ca2072396")
    override
        fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty.Builder.() -> Unit):
        Unit = cmafPackage(CfnPackagingConfiguration.CmafPackageProperty(cmafPackage))

    override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    override fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(CfnPackagingConfiguration.DashPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfe14f571c4ef05986e320515d3d5657d307b6cae8cea4de1d3a9ec52d520774")
    override
        fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty.Builder.() -> Unit):
        Unit = dashPackage(CfnPackagingConfiguration.DashPackageProperty(dashPackage))

    override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    override fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(CfnPackagingConfiguration.HlsPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58da73184e79ed85b2fd3ab2d97831d8e40d833ab8b100dc7a1554ad4d925e6b")
    override
        fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty.Builder.() -> Unit):
        Unit = hlsPackage(CfnPackagingConfiguration.HlsPackageProperty(hlsPackage))

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    override fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(CfnPackagingConfiguration.MssPackageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a03b4b861f92c46fb1ce0883d5b0593143187a8a76d22ef0e9e22cda6170f409")
    override
        fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty.Builder.() -> Unit):
        Unit = mssPackage(CfnPackagingConfiguration.MssPackageProperty(mssPackage))

    override fun packagingGroupId(packagingGroupId: String) {
      cdkBuilder.packagingGroupId(packagingGroupId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps,
  ) : CdkObject(cdkObject), CfnPackagingConfigurationProps {
    override fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

    override fun dashPackage(): Any? = unwrap(this).getDashPackage()

    override fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

    override fun id(): String = unwrap(this).getId()

    override fun mssPackage(): Any? = unwrap(this).getMssPackage()

    override fun packagingGroupId(): String = unwrap(this).getPackagingGroupId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPackagingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps):
        CfnPackagingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPackagingConfigurationProps):
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps
  }
}
