@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnImageBuilder internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  public open fun accessEndpoints(`value`: IResolvable) {
    unwrap(this).setAccessEndpoints(`value`.let(IResolvable::unwrap))
  }

  public open fun accessEndpoints(__idx_ac66f0: List<Any>) {
    unwrap(this).setAccessEndpoints(__idx_ac66f0)
  }

  public open fun accessEndpoints(vararg __idx_ac66f0: Any): Unit =
      accessEndpoints(__idx_ac66f0.toList())

  public open fun appstreamAgentVersion(): String? = unwrap(this).getAppstreamAgentVersion()

  public open fun appstreamAgentVersion(`value`: String) {
    unwrap(this).setAppstreamAgentVersion(`value`)
  }

  public open fun attrStreamingUrl(): String = unwrap(this).getAttrStreamingUrl()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public open fun domainJoinInfo(): Any? = unwrap(this).getDomainJoinInfo()

  public open fun domainJoinInfo(`value`: IResolvable) {
    unwrap(this).setDomainJoinInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun domainJoinInfo(`value`: DomainJoinInfoProperty) {
    unwrap(this).setDomainJoinInfo(`value`.let(DomainJoinInfoProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1761aebbd503c31d87dc05b49cd9a315a2affd8f8f2ca4d0038f8cb66ff6d1e")
  public open fun domainJoinInfo(`value`: DomainJoinInfoProperty.Builder.() -> Unit): Unit =
      domainJoinInfo(DomainJoinInfoProperty(`value`))

  public open fun enableDefaultInternetAccess(): Any? =
      unwrap(this).getEnableDefaultInternetAccess()

  public open fun enableDefaultInternetAccess(`value`: Boolean) {
    unwrap(this).setEnableDefaultInternetAccess(`value`)
  }

  public open fun enableDefaultInternetAccess(`value`: IResolvable) {
    unwrap(this).setEnableDefaultInternetAccess(`value`.let(IResolvable::unwrap))
  }

  public open fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  public open fun imageArn(): String? = unwrap(this).getImageArn()

  public open fun imageArn(`value`: String) {
    unwrap(this).setImageArn(`value`)
  }

  public open fun imageName(): String? = unwrap(this).getImageName()

  public open fun imageName(`value`: String) {
    unwrap(this).setImageName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f759e25573b6eac7914e20e5e521ef864be481f1d6f689fd7246298ef1cc760c")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun accessEndpoints(accessEndpoints: IResolvable)

    public fun accessEndpoints(accessEndpoints: List<Any>)

    public fun accessEndpoints(vararg accessEndpoints: Any)

    public fun appstreamAgentVersion(appstreamAgentVersion: String)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun domainJoinInfo(domainJoinInfo: IResolvable)

    public fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("892d21893f8c8149e1f2dca8b0912cf523bbfd26d9a9398ea22035f82b3dfb53")
    public fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty.Builder.() -> Unit)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    public fun iamRoleArn(iamRoleArn: String)

    public fun imageArn(imageArn: String)

    public fun imageName(imageName: String)

    public fun instanceType(instanceType: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eaa48dba7fd3c1831dd408ef33113cddb0e123a7059af0a186c78dd5bc1531a")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnImageBuilder.Builder =
        software.amazon.awscdk.services.appstream.CfnImageBuilder.Builder.create(scope, id)

    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    override fun appstreamAgentVersion(appstreamAgentVersion: String) {
      cdkBuilder.appstreamAgentVersion(appstreamAgentVersion)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun domainJoinInfo(domainJoinInfo: IResolvable) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(IResolvable::unwrap))
    }

    override fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty) {
      cdkBuilder.domainJoinInfo(domainJoinInfo.let(DomainJoinInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("892d21893f8c8149e1f2dca8b0912cf523bbfd26d9a9398ea22035f82b3dfb53")
    override fun domainJoinInfo(domainJoinInfo: DomainJoinInfoProperty.Builder.() -> Unit): Unit =
        domainJoinInfo(DomainJoinInfoProperty(domainJoinInfo))

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun imageArn(imageArn: String) {
      cdkBuilder.imageArn(imageArn)
    }

    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eaa48dba7fd3c1831dd408ef33113cddb0e123a7059af0a186c78dd5bc1531a")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnImageBuilder =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnImageBuilder.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImageBuilder {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImageBuilder(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder):
        CfnImageBuilder = CfnImageBuilder(cdkObject)

    internal fun unwrap(wrapped: CfnImageBuilder):
        software.amazon.awscdk.services.appstream.CfnImageBuilder = wrapped.cdkObject
  }

  public interface DomainJoinInfoProperty {
    public fun directoryName(): String? = unwrap(this).getDirectoryName()

    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    @CdkDslMarker
    public interface Builder {
      public fun directoryName(directoryName: String)

      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty.builder()

      override fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
      }

      override
          fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty,
    ) : CdkObject(cdkObject), DomainJoinInfoProperty {
      override fun directoryName(): String? = unwrap(this).getDirectoryName()

      override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainJoinInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty):
          DomainJoinInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainJoinInfoProperty):
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty
    }
  }

  public interface AccessEndpointProperty {
    public fun endpointType(): String

    public fun vpceId(): String

    @CdkDslMarker
    public interface Builder {
      public fun endpointType(endpointType: String)

      public fun vpceId(vpceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty.builder()

      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      override fun vpceId(vpceId: String) {
        cdkBuilder.vpceId(vpceId)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty,
    ) : CdkObject(cdkObject), AccessEndpointProperty {
      override fun endpointType(): String = unwrap(this).getEndpointType()

      override fun vpceId(): String = unwrap(this).getVpceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty):
          AccessEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessEndpointProperty):
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnImageBuilder.AccessEndpointProperty
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty
    }
  }
}
