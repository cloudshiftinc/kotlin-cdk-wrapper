package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAppBlockBuilder internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  public open fun accessEndpoints(`value`: IResolvable) {
    unwrap(this).setAccessEndpoints(`value`.let(IResolvable::unwrap))
  }

  public open fun accessEndpoints(__idx_ac66f0: List<Any>) {
    unwrap(this).setAccessEndpoints(__idx_ac66f0)
  }

  public open fun accessEndpoints(vararg __idx_ac66f0: Any): Unit =
      accessEndpoints(__idx_ac66f0.toList())

  public open fun appBlockArns(): List<String> = unwrap(this).getAppBlockArns() ?: emptyList()

  public open fun appBlockArns(`value`: List<String>) {
    unwrap(this).setAppBlockArns(`value`)
  }

  public open fun appBlockArns(vararg `value`: String): Unit = appBlockArns(`value`.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

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

  public open fun platform(): String = unwrap(this).getPlatform()

  public open fun platform(`value`: String) {
    unwrap(this).setPlatform(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun vpcConfig(): Any = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a3edff5b63846cfdd4bbb131d81bc92960619d49a19823a471887dc498760655")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  public interface Builder {
    public fun accessEndpoints(accessEndpoints: IResolvable)

    public fun accessEndpoints(accessEndpoints: List<Any>)

    public fun accessEndpoints(vararg accessEndpoints: Any)

    public fun appBlockArns(appBlockArns: List<String>)

    public fun appBlockArns(vararg appBlockArns: String)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    public fun iamRoleArn(iamRoleArn: String)

    public fun instanceType(instanceType: String)

    public fun name(name: String)

    public fun platform(platform: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cfc0a6de75123b3c9c88168a415957bc3f8003b7dee385825c191b78bff81ef")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.Builder =
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.Builder.create(scope, id)

    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    override fun appBlockArns(appBlockArns: List<String>) {
      cdkBuilder.appBlockArns(appBlockArns)
    }

    override fun appBlockArns(vararg appBlockArns: String): Unit =
        appBlockArns(appBlockArns.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cfc0a6de75123b3c9c88168a415957bc3f8003b7dee385825c191b78bff81ef")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlockBuilder =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAppBlockBuilder {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAppBlockBuilder(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder):
        CfnAppBlockBuilder = CfnAppBlockBuilder(cdkObject)

    internal fun unwrap(wrapped: CfnAppBlockBuilder):
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilder = wrapped.cdkObject
  }

  public interface AccessEndpointProperty {
    public fun endpointType(): String

    public fun vpceId(): String

    public interface Builder {
      public fun endpointType(endpointType: String)

      public fun vpceId(vpceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty.Builder
          =
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty.builder()

      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      override fun vpceId(vpceId: String) {
        cdkBuilder.vpceId(vpceId)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty,
    ) : AccessEndpointProperty {
      override fun endpointType(): String = unwrap(this).getEndpointType()

      override fun vpceId(): String = unwrap(this).getVpceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty):
          AccessEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessEndpointProperty):
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty.builder()

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
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
