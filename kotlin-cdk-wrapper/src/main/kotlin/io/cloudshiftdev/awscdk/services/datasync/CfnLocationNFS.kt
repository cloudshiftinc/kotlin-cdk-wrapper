@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLocationNFS internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFS,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mountOptions(): Any? = unwrap(this).getMountOptions()

  public open fun mountOptions(`value`: IResolvable) {
    unwrap(this).setMountOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun mountOptions(`value`: MountOptionsProperty) {
    unwrap(this).setMountOptions(`value`.let(MountOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9b22858853b8359d646bd681ee53e427c6af8dcb5d72845a37b747060760769")
  public open fun mountOptions(`value`: MountOptionsProperty.Builder.() -> Unit): Unit =
      mountOptions(MountOptionsProperty(`value`))

  public open fun onPremConfig(): Any = unwrap(this).getOnPremConfig()

  public open fun onPremConfig(`value`: IResolvable) {
    unwrap(this).setOnPremConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun onPremConfig(`value`: OnPremConfigProperty) {
    unwrap(this).setOnPremConfig(`value`.let(OnPremConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f328cb85a4520771a5c3249f99e0e412aa4de6fe0af00582df57c9ea64185a75")
  public open fun onPremConfig(`value`: OnPremConfigProperty.Builder.() -> Unit): Unit =
      onPremConfig(OnPremConfigProperty(`value`))

  public open fun serverHostname(): String? = unwrap(this).getServerHostname()

  public open fun serverHostname(`value`: String) {
    unwrap(this).setServerHostname(`value`)
  }

  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun mountOptions(mountOptions: IResolvable)

    public fun mountOptions(mountOptions: MountOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25a432ce7f1c75dc7f0fe7de40701517a3b87f70b0202663b66a2091262a75ad")
    public fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit)

    public fun onPremConfig(onPremConfig: IResolvable)

    public fun onPremConfig(onPremConfig: OnPremConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cd9f0ae144cf14221414b6db7af184a49d45996e7a95573bd995075ba3c701f")
    public fun onPremConfig(onPremConfig: OnPremConfigProperty.Builder.() -> Unit)

    public fun serverHostname(serverHostname: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationNFS.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationNFS.Builder.create(scope, id)

    override fun mountOptions(mountOptions: IResolvable) {
      cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
    }

    override fun mountOptions(mountOptions: MountOptionsProperty) {
      cdkBuilder.mountOptions(mountOptions.let(MountOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25a432ce7f1c75dc7f0fe7de40701517a3b87f70b0202663b66a2091262a75ad")
    override fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit): Unit =
        mountOptions(MountOptionsProperty(mountOptions))

    override fun onPremConfig(onPremConfig: IResolvable) {
      cdkBuilder.onPremConfig(onPremConfig.let(IResolvable::unwrap))
    }

    override fun onPremConfig(onPremConfig: OnPremConfigProperty) {
      cdkBuilder.onPremConfig(onPremConfig.let(OnPremConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cd9f0ae144cf14221414b6db7af184a49d45996e7a95573bd995075ba3c701f")
    override fun onPremConfig(onPremConfig: OnPremConfigProperty.Builder.() -> Unit): Unit =
        onPremConfig(OnPremConfigProperty(onPremConfig))

    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationNFS = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationNFS.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationNFS {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationNFS(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFS):
        CfnLocationNFS = CfnLocationNFS(cdkObject)

    internal fun unwrap(wrapped: CfnLocationNFS):
        software.amazon.awscdk.services.datasync.CfnLocationNFS = wrapped.cdkObject
  }

  public interface OnPremConfigProperty {
    public fun agentArns(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun agentArns(agentArns: List<String>)

      public fun agentArns(vararg agentArns: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty.builder()

      override fun agentArns(agentArns: List<String>) {
        cdkBuilder.agentArns(agentArns)
      }

      override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty,
    ) : CdkObject(cdkObject), OnPremConfigProperty {
      override fun agentArns(): List<String> = unwrap(this).getAgentArns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnPremConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty):
          OnPremConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnPremConfigProperty):
          software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty
    }
  }

  public interface MountOptionsProperty {
    public fun version(): String? = unwrap(this).getVersion()

    @CdkDslMarker
    public interface Builder {
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty.builder()

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty,
    ) : CdkObject(cdkObject), MountOptionsProperty {
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MountOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty):
          MountOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationNFS.MountOptionsProperty
    }
  }
}
