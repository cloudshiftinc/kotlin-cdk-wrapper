package io.cloudshiftdev.awscdk.services.fsx

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

public open class CfnStorageVirtualMachine internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun activeDirectoryConfiguration(): Any? =
      unwrap(this).getActiveDirectoryConfiguration()

  public open fun activeDirectoryConfiguration(`value`: IResolvable) {
    unwrap(this).setActiveDirectoryConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun activeDirectoryConfiguration(`value`: ActiveDirectoryConfigurationProperty) {
    unwrap(this).setActiveDirectoryConfiguration(`value`.let(ActiveDirectoryConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f2b9c5ae86be2ef8d38f86ebc83e423b54a06b9e75ad1c879ecab55e71da02b")
  public open
      fun activeDirectoryConfiguration(`value`: ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
      Unit = activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty(`value`))

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun attrStorageVirtualMachineId(): String =
      unwrap(this).getAttrStorageVirtualMachineId()

  public open fun attrUuid(): String = unwrap(this).getAttrUuid()

  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun rootVolumeSecurityStyle(): String? = unwrap(this).getRootVolumeSecurityStyle()

  public open fun rootVolumeSecurityStyle(`value`: String) {
    unwrap(this).setRootVolumeSecurityStyle(`value`)
  }

  public open fun svmAdminPassword(): String? = unwrap(this).getSvmAdminPassword()

  public open fun svmAdminPassword(`value`: String) {
    unwrap(this).setSvmAdminPassword(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
    }

    public
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3777fa4b33efd2030c60cd94751de6b23d72c20d6e39ab9e701f492a1b0b42ee")
    public
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit) {
    }

    public fun fileSystemId(fileSystemId: String) {
    }

    public fun name(name: String) {
    }

    public fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String) {
    }

    public fun svmAdminPassword(svmAdminPassword: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.Builder =
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.Builder.create(scope, id)

    public override fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
      cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty) {
      cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(ActiveDirectoryConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3777fa4b33efd2030c60cd94751de6b23d72c20d6e39ab9e701f492a1b0b42ee")
    public override
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
        Unit =
        activeDirectoryConfiguration(ActiveDirectoryConfigurationProperty(activeDirectoryConfiguration))

    public override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String) {
      cdkBuilder.rootVolumeSecurityStyle(rootVolumeSecurityStyle)
    }

    public override fun svmAdminPassword(svmAdminPassword: String) {
      cdkBuilder.svmAdminPassword(svmAdminPassword)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStorageVirtualMachine {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStorageVirtualMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine):
        CfnStorageVirtualMachine = CfnStorageVirtualMachine(cdkObject)

    internal fun unwrap(wrapped: CfnStorageVirtualMachine):
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine = wrapped.cdkObject
  }

  public interface SelfManagedActiveDirectoryConfigurationProperty {
    public fun dnsIps(): List<String> = unwrap(this).getDnsIps() ?: emptyList()

    public fun domainName(): String? = unwrap(this).getDomainName()

    public fun fileSystemAdministratorsGroup(): String? =
        unwrap(this).getFileSystemAdministratorsGroup()

    public fun organizationalUnitDistinguishedName(): String? =
        unwrap(this).getOrganizationalUnitDistinguishedName()

    public fun password(): String? = unwrap(this).getPassword()

    public fun userName(): String? = unwrap(this).getUserName()

    public interface Builder {
      public fun dnsIps(dnsIps: List<String>) {
      }

      public fun domainName(domainName: String) {
      }

      public fun fileSystemAdministratorsGroup(fileSystemAdministratorsGroup: String) {
      }

      public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
      }

      public fun password(password: String) {
      }

      public fun userName(userName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty.builder()

      public override fun dnsIps(dnsIps: List<String>) {
        cdkBuilder.dnsIps(dnsIps)
      }

      public override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      public override fun fileSystemAdministratorsGroup(fileSystemAdministratorsGroup: String) {
        cdkBuilder.fileSystemAdministratorsGroup(fileSystemAdministratorsGroup)
      }

      public override
          fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
      }

      public override fun password(password: String) {
        cdkBuilder.password(password)
      }

      public override fun userName(userName: String) {
        cdkBuilder.userName(userName)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty,
    ) : SelfManagedActiveDirectoryConfigurationProperty {
      public override fun dnsIps(): List<String> = unwrap(this).getDnsIps() ?: emptyList()

      public override fun domainName(): String? = unwrap(this).getDomainName()

      public override fun fileSystemAdministratorsGroup(): String? =
          unwrap(this).getFileSystemAdministratorsGroup()

      public override fun organizationalUnitDistinguishedName(): String? =
          unwrap(this).getOrganizationalUnitDistinguishedName()

      public override fun password(): String? = unwrap(this).getPassword()

      public override fun userName(): String? = unwrap(this).getUserName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedActiveDirectoryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty):
          SelfManagedActiveDirectoryConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedActiveDirectoryConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActiveDirectoryConfigurationProperty {
    public fun netBiosName(): String? = unwrap(this).getNetBiosName()

    public fun selfManagedActiveDirectoryConfiguration(): Any? =
        unwrap(this).getSelfManagedActiveDirectoryConfiguration()

    public interface Builder {
      public fun netBiosName(netBiosName: String) {
      }

      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable) {
      }

      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53a4f8685f10a7d60d886f79d56103df35a2c2d5e8958ac5a7ffa5d607a746a1")
      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.builder()

      public override fun netBiosName(netBiosName: String) {
        cdkBuilder.netBiosName(netBiosName)
      }

      public override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty) {
        cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration.let(SelfManagedActiveDirectoryConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53a4f8685f10a7d60d886f79d56103df35a2c2d5e8958ac5a7ffa5d607a746a1")
      public override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty.Builder.() -> Unit):
          Unit =
          selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty(selfManagedActiveDirectoryConfiguration))

      public fun build():
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty,
    ) : ActiveDirectoryConfigurationProperty {
      public override fun netBiosName(): String? = unwrap(this).getNetBiosName()

      public override fun selfManagedActiveDirectoryConfiguration(): Any? =
          unwrap(this).getSelfManagedActiveDirectoryConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ActiveDirectoryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty):
          ActiveDirectoryConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActiveDirectoryConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
