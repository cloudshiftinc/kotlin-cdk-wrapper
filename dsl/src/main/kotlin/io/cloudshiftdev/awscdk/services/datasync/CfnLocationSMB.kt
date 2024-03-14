package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLocationSMB internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMB,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public open fun domain(): String? = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

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

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca7f91908099c1d5940cc748ba4707d29f11745e27afd1697a2b4e306575d864")
  public open fun mountOptions(`value`: MountOptionsProperty.Builder.() -> Unit): Unit =
      mountOptions(MountOptionsProperty(`value`))

  public open fun password(): String? = unwrap(this).getPassword()

  public open fun password(`value`: String) {
    unwrap(this).setPassword(`value`)
  }

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

  public open fun user(): String = unwrap(this).getUser()

  public open fun user(`value`: String) {
    unwrap(this).setUser(`value`)
  }

  public interface Builder {
    public fun agentArns(agentArns: List<String>)

    public fun agentArns(vararg agentArns: String)

    public fun domain(domain: String)

    public fun mountOptions(mountOptions: IResolvable)

    public fun mountOptions(mountOptions: MountOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51930ce9ee3cf3fe5eb351c76bcc50e4ab9e856db9e41ba2273cffed3ca556d5")
    public fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit)

    public fun password(password: String)

    public fun serverHostname(serverHostname: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun user(user: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationSMB.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationSMB.Builder.create(scope, id)

    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun mountOptions(mountOptions: IResolvable) {
      cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
    }

    override fun mountOptions(mountOptions: MountOptionsProperty) {
      cdkBuilder.mountOptions(mountOptions.let(MountOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51930ce9ee3cf3fe5eb351c76bcc50e4ab9e856db9e41ba2273cffed3ca556d5")
    override fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit): Unit =
        mountOptions(MountOptionsProperty(mountOptions))

    override fun password(password: String) {
      cdkBuilder.password(password)
    }

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

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationSMB = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationSMB {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationSMB(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMB):
        CfnLocationSMB = CfnLocationSMB(cdkObject)

    internal fun unwrap(wrapped: CfnLocationSMB):
        software.amazon.awscdk.services.datasync.CfnLocationSMB = wrapped.cdkObject
  }

  public interface MountOptionsProperty {
    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty.builder()

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty,
    ) : MountOptionsProperty {
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MountOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty):
          MountOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
