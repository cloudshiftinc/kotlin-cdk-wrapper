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

public open class CfnLocationFSxONTAP internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrFsxFilesystemArn(): String = unwrap(this).getAttrFsxFilesystemArn()

  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun protocol(): Any? = unwrap(this).getProtocol()

  public open fun protocol(`value`: IResolvable) {
    unwrap(this).setProtocol(`value`.let(IResolvable::unwrap))
  }

  public open fun protocol(`value`: ProtocolProperty) {
    unwrap(this).setProtocol(`value`.let(ProtocolProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f260a9de86d50f11be0ae0e4df7bc4c33bf62217c0efe05c324ad5b69932f747")
  public open fun protocol(`value`: ProtocolProperty.Builder.() -> Unit): Unit =
      protocol(ProtocolProperty(`value`))

  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?:
      emptyList()

  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
  }

  public open fun storageVirtualMachineArn(): String = unwrap(this).getStorageVirtualMachineArn()

  public open fun storageVirtualMachineArn(`value`: String) {
    unwrap(this).setStorageVirtualMachineArn(`value`)
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
    public fun protocol(protocol: IResolvable)

    public fun protocol(protocol: ProtocolProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7641b926322602b576aaffe49c086d0d25de6353417991882e2bb2c85ffb8dbd")
    public fun protocol(protocol: ProtocolProperty.Builder.() -> Unit)

    public fun securityGroupArns(securityGroupArns: List<String>)

    public fun storageVirtualMachineArn(storageVirtualMachineArn: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.Builder.create(scope, id)

    override fun protocol(protocol: IResolvable) {
      cdkBuilder.protocol(protocol.let(IResolvable::unwrap))
    }

    override fun protocol(protocol: ProtocolProperty) {
      cdkBuilder.protocol(protocol.let(ProtocolProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7641b926322602b576aaffe49c086d0d25de6353417991882e2bb2c85ffb8dbd")
    override fun protocol(protocol: ProtocolProperty.Builder.() -> Unit): Unit =
        protocol(ProtocolProperty(protocol))

    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    override fun storageVirtualMachineArn(storageVirtualMachineArn: String) {
      cdkBuilder.storageVirtualMachineArn(storageVirtualMachineArn)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationFSxONTAP {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationFSxONTAP(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP):
        CfnLocationFSxONTAP = CfnLocationFSxONTAP(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxONTAP):
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP = wrapped.cdkObject
  }

  public interface SmbMountOptionsProperty {
    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty.builder()

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty,
    ) : SmbMountOptionsProperty {
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SmbMountOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty):
          SmbMountOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SmbMountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SmbMountOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NFSProperty {
    public fun mountOptions(): Any

    public interface Builder {
      public fun mountOptions(mountOptions: IResolvable)

      public fun mountOptions(mountOptions: NfsMountOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("033f4be26885125e4eadaf1dd772bb9201c4c29cbcf806a8b9cc513bbf365fa7")
      public fun mountOptions(mountOptions: NfsMountOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty.builder()

      override fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
      }

      override fun mountOptions(mountOptions: NfsMountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions.let(NfsMountOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("033f4be26885125e4eadaf1dd772bb9201c4c29cbcf806a8b9cc513bbf365fa7")
      override fun mountOptions(mountOptions: NfsMountOptionsProperty.Builder.() -> Unit): Unit =
          mountOptions(NfsMountOptionsProperty(mountOptions))

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty):
          NFSProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NFSProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NFSProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NfsMountOptionsProperty {
    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty.builder()

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty,
    ) : NfsMountOptionsProperty {
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NfsMountOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty):
          NfsMountOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NfsMountOptionsProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.NfsMountOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProtocolProperty {
    public fun nfs(): Any? = unwrap(this).getNfs()

    public fun smb(): Any? = unwrap(this).getSmb()

    public interface Builder {
      public fun nfs(nfs: IResolvable)

      public fun nfs(nfs: NFSProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06b224cb9409b415fb5e24827f5dfcea7b3d9bf295bcef0b39a174100f85e1c6")
      public fun nfs(nfs: NFSProperty.Builder.() -> Unit)

      public fun smb(smb: IResolvable)

      public fun smb(smb: SMBProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f717d73cab6ad0a60e71361da9a2ab93603b509210d4c0deb60ee4cb1d98bbec")
      public fun smb(smb: SMBProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty.builder()

      override fun nfs(nfs: IResolvable) {
        cdkBuilder.nfs(nfs.let(IResolvable::unwrap))
      }

      override fun nfs(nfs: NFSProperty) {
        cdkBuilder.nfs(nfs.let(NFSProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06b224cb9409b415fb5e24827f5dfcea7b3d9bf295bcef0b39a174100f85e1c6")
      override fun nfs(nfs: NFSProperty.Builder.() -> Unit): Unit = nfs(NFSProperty(nfs))

      override fun smb(smb: IResolvable) {
        cdkBuilder.smb(smb.let(IResolvable::unwrap))
      }

      override fun smb(smb: SMBProperty) {
        cdkBuilder.smb(smb.let(SMBProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f717d73cab6ad0a60e71361da9a2ab93603b509210d4c0deb60ee4cb1d98bbec")
      override fun smb(smb: SMBProperty.Builder.() -> Unit): Unit = smb(SMBProperty(smb))

      public fun build():
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty,
    ) : ProtocolProperty {
      override fun nfs(): Any? = unwrap(this).getNfs()

      override fun smb(): Any? = unwrap(this).getSmb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProtocolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty):
          ProtocolProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtocolProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.ProtocolProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SMBProperty {
    public fun domain(): String? = unwrap(this).getDomain()

    public fun mountOptions(): Any

    public fun password(): String

    public fun user(): String

    public interface Builder {
      public fun domain(domain: String)

      public fun mountOptions(mountOptions: IResolvable)

      public fun mountOptions(mountOptions: SmbMountOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97d502a9fa55737f807ba05f319d7aeeaa18f7474c96932ae50515bbd8b0740c")
      public fun mountOptions(mountOptions: SmbMountOptionsProperty.Builder.() -> Unit)

      public fun password(password: String)

      public fun user(user: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty.builder()

      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      override fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
      }

      override fun mountOptions(mountOptions: SmbMountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions.let(SmbMountOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97d502a9fa55737f807ba05f319d7aeeaa18f7474c96932ae50515bbd8b0740c")
      override fun mountOptions(mountOptions: SmbMountOptionsProperty.Builder.() -> Unit): Unit =
          mountOptions(SmbMountOptionsProperty(mountOptions))

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun user(user: String) {
        cdkBuilder.user(user)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty,
    ) : SMBProperty {
      override fun domain(): String? = unwrap(this).getDomain()

      override fun mountOptions(): Any = unwrap(this).getMountOptions()

      override fun password(): String = unwrap(this).getPassword()

      override fun user(): String = unwrap(this).getUser()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SMBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty):
          SMBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SMBProperty):
          software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP.SMBProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
