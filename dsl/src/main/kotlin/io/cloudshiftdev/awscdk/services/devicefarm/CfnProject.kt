package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.devicefarm.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun defaultJobTimeoutMinutes(): Number? = unwrap(this).getDefaultJobTimeoutMinutes()

  public open fun defaultJobTimeoutMinutes(`value`: Number) {
    unwrap(this).setDefaultJobTimeoutMinutes(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("742f01f1226fb776154a55aafd23dc35e7722802117fcf6601195ae9399fe80b")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  public interface Builder {
    public fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b286c38a5590437dc62b1c077d69224e8e28cd6e527b3cec99b1dc07a67499f3")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnProject.Builder =
        software.amazon.awscdk.services.devicefarm.CfnProject.Builder.create(scope, id)

    override fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number) {
      cdkBuilder.defaultJobTimeoutMinutes(defaultJobTimeoutMinutes)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b286c38a5590437dc62b1c077d69224e8e28cd6e527b3cec99b1dc07a67499f3")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnProject = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnProject): CfnProject
        = CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.devicefarm.CfnProject
        = wrapped.cdkObject
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnetIds(): List<String>

    public fun vpcId(): String

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun subnetIds(subnetIds: List<String>)

      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty,
    ) : VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      override fun vpcId(): String = unwrap(this).getVpcId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.devicefarm.CfnProject.VpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
