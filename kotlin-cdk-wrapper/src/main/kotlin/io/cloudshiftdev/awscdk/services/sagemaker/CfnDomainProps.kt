@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDomainProps {
  public fun appNetworkAccessType(): String? = unwrap(this).getAppNetworkAccessType()

  public fun appSecurityGroupManagement(): String? = unwrap(this).getAppSecurityGroupManagement()

  public fun authMode(): String

  public fun defaultSpaceSettings(): Any? = unwrap(this).getDefaultSpaceSettings()

  public fun defaultUserSettings(): Any

  public fun domainName(): String

  public fun domainSettings(): Any? = unwrap(this).getDomainSettings()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun subnetIds(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun appNetworkAccessType(appNetworkAccessType: String)

    public fun appSecurityGroupManagement(appSecurityGroupManagement: String)

    public fun authMode(authMode: String)

    public fun defaultSpaceSettings(defaultSpaceSettings: IResolvable)

    public fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d001173177c9a371c53315f8f6c05f9bce841b1b38b146f07a05bd93b5ec8891")
    public
        fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty.Builder.() -> Unit)

    public fun defaultUserSettings(defaultUserSettings: IResolvable)

    public fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b216688dd1e1dcf9052febb0a78ff55b62f044e2f227b44a92ad15b96e79c599")
    public
        fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun domainSettings(domainSettings: IResolvable)

    public fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78f87138cd1dc31667ff8090dec708a85e3fccce8bb950d9fd159432af8678e3")
    public fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDomainProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDomainProps.builder()

    override fun appNetworkAccessType(appNetworkAccessType: String) {
      cdkBuilder.appNetworkAccessType(appNetworkAccessType)
    }

    override fun appSecurityGroupManagement(appSecurityGroupManagement: String) {
      cdkBuilder.appSecurityGroupManagement(appSecurityGroupManagement)
    }

    override fun authMode(authMode: String) {
      cdkBuilder.authMode(authMode)
    }

    override fun defaultSpaceSettings(defaultSpaceSettings: IResolvable) {
      cdkBuilder.defaultSpaceSettings(defaultSpaceSettings.let(IResolvable::unwrap))
    }

    override
        fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty) {
      cdkBuilder.defaultSpaceSettings(defaultSpaceSettings.let(CfnDomain.DefaultSpaceSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d001173177c9a371c53315f8f6c05f9bce841b1b38b146f07a05bd93b5ec8891")
    override
        fun defaultSpaceSettings(defaultSpaceSettings: CfnDomain.DefaultSpaceSettingsProperty.Builder.() -> Unit):
        Unit = defaultSpaceSettings(CfnDomain.DefaultSpaceSettingsProperty(defaultSpaceSettings))

    override fun defaultUserSettings(defaultUserSettings: IResolvable) {
      cdkBuilder.defaultUserSettings(defaultUserSettings.let(IResolvable::unwrap))
    }

    override fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty) {
      cdkBuilder.defaultUserSettings(defaultUserSettings.let(CfnDomain.UserSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b216688dd1e1dcf9052febb0a78ff55b62f044e2f227b44a92ad15b96e79c599")
    override
        fun defaultUserSettings(defaultUserSettings: CfnDomain.UserSettingsProperty.Builder.() -> Unit):
        Unit = defaultUserSettings(CfnDomain.UserSettingsProperty(defaultUserSettings))

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainSettings(domainSettings: IResolvable) {
      cdkBuilder.domainSettings(domainSettings.let(IResolvable::unwrap))
    }

    override fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty) {
      cdkBuilder.domainSettings(domainSettings.let(CfnDomain.DomainSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78f87138cd1dc31667ff8090dec708a85e3fccce8bb950d9fd159432af8678e3")
    override
        fun domainSettings(domainSettings: CfnDomain.DomainSettingsProperty.Builder.() -> Unit):
        Unit = domainSettings(CfnDomain.DomainSettingsProperty(domainSettings))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    override fun appNetworkAccessType(): String? = unwrap(this).getAppNetworkAccessType()

    override fun appSecurityGroupManagement(): String? =
        unwrap(this).getAppSecurityGroupManagement()

    override fun authMode(): String = unwrap(this).getAuthMode()

    override fun defaultSpaceSettings(): Any? = unwrap(this).getDefaultSpaceSettings()

    override fun defaultUserSettings(): Any = unwrap(this).getDefaultUserSettings()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun domainSettings(): Any? = unwrap(this).getDomainSettings()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDomainProps):
        CfnDomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.sagemaker.CfnDomainProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnDomainProps
  }
}
