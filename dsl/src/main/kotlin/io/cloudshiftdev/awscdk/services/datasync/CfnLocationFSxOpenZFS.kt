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

public open class CfnLocationFSxOpenZFS internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public open fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  public open fun fsxFilesystemArn(`value`: String) {
    unwrap(this).setFsxFilesystemArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun protocol(): Any = unwrap(this).getProtocol()

  public open fun protocol(`value`: IResolvable) {
    unwrap(this).setProtocol(`value`.let(IResolvable::unwrap))
  }

  public open fun protocol(`value`: ProtocolProperty) {
    unwrap(this).setProtocol(`value`.let(ProtocolProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45dae59154aeb2bf120faf735fa67ed63a1aef5cc8ce0eb3b670a30c962e0f5e")
  public open fun protocol(`value`: ProtocolProperty.Builder.() -> Unit): Unit =
      protocol(ProtocolProperty(`value`))

  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?:
      emptyList()

  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
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

  public interface Builder {
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    public fun protocol(protocol: IResolvable)

    public fun protocol(protocol: ProtocolProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca2396111d82e0f56f870246bb6151ae72c1c9ad7f89902c5572bc5c0b637af9")
    public fun protocol(protocol: ProtocolProperty.Builder.() -> Unit)

    public fun securityGroupArns(securityGroupArns: List<String>)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.Builder.create(scope, id)

    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    override fun protocol(protocol: IResolvable) {
      cdkBuilder.protocol(protocol.let(IResolvable::unwrap))
    }

    override fun protocol(protocol: ProtocolProperty) {
      cdkBuilder.protocol(protocol.let(ProtocolProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca2396111d82e0f56f870246bb6151ae72c1c9ad7f89902c5572bc5c0b637af9")
    override fun protocol(protocol: ProtocolProperty.Builder.() -> Unit): Unit =
        protocol(ProtocolProperty(protocol))

    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationFSxOpenZFS {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationFSxOpenZFS(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS):
        CfnLocationFSxOpenZFS = CfnLocationFSxOpenZFS(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxOpenZFS):
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS = wrapped.cdkObject
  }

  public interface MountOptionsProperty {
    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty.builder()

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty):
          MountOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.MountOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProtocolProperty {
    public fun nfs(): Any? = unwrap(this).getNfs()

    public interface Builder {
      public fun nfs(nfs: IResolvable)

      public fun nfs(nfs: NFSProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95fc6ba73f6163e17969e0763e3c24480654ace62c9055b8e8b9ba4eb0fc261a")
      public fun nfs(nfs: NFSProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty.builder()

      override fun nfs(nfs: IResolvable) {
        cdkBuilder.nfs(nfs.let(IResolvable::unwrap))
      }

      override fun nfs(nfs: NFSProperty) {
        cdkBuilder.nfs(nfs.let(NFSProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("95fc6ba73f6163e17969e0763e3c24480654ace62c9055b8e8b9ba4eb0fc261a")
      override fun nfs(nfs: NFSProperty.Builder.() -> Unit): Unit = nfs(NFSProperty(nfs))

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty,
    ) : ProtocolProperty {
      override fun nfs(): Any? = unwrap(this).getNfs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProtocolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty):
          ProtocolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtocolProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.ProtocolProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NFSProperty {
    public fun mountOptions(): Any

    public interface Builder {
      public fun mountOptions(mountOptions: IResolvable)

      public fun mountOptions(mountOptions: MountOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87b84a95a8857f96d24ce753066896f675992aaf5cec72080ff786cd7ebb64ce")
      public fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty.builder()

      override fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
      }

      override fun mountOptions(mountOptions: MountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions.let(MountOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87b84a95a8857f96d24ce753066896f675992aaf5cec72080ff786cd7ebb64ce")
      override fun mountOptions(mountOptions: MountOptionsProperty.Builder.() -> Unit): Unit =
          mountOptions(MountOptionsProperty(mountOptions))

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty,
    ) : NFSProperty {
      override fun mountOptions(): Any = unwrap(this).getMountOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NFSProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty):
          NFSProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NFSProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS.NFSProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
