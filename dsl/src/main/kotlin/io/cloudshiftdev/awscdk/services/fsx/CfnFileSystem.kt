package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFileSystem internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLustreMountName(): String = unwrap(this).getAttrLustreMountName()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun attrRootVolumeId(): String = unwrap(this).getAttrRootVolumeId()

  public open fun backupId(): String? = unwrap(this).getBackupId()

  public open fun backupId(`value`: String) {
    unwrap(this).setBackupId(`value`)
  }

  public open fun fileSystemType(): String = unwrap(this).getFileSystemType()

  public open fun fileSystemType(`value`: String) {
    unwrap(this).setFileSystemType(`value`)
  }

  public open fun fileSystemTypeVersion(): String? = unwrap(this).getFileSystemTypeVersion()

  public open fun fileSystemTypeVersion(`value`: String) {
    unwrap(this).setFileSystemTypeVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun lustreConfiguration(): Any? = unwrap(this).getLustreConfiguration()

  public open fun lustreConfiguration(`value`: IResolvable) {
    unwrap(this).setLustreConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun lustreConfiguration(`value`: LustreConfigurationProperty) {
    unwrap(this).setLustreConfiguration(`value`.let(LustreConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3674dc04634b3a0bb3f33c1b76d7fc75e14b409710628bdbc9dd07fc02c6950")
  public open fun lustreConfiguration(`value`: LustreConfigurationProperty.Builder.() -> Unit): Unit
      = lustreConfiguration(LustreConfigurationProperty(`value`))

  public open fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

  public open fun ontapConfiguration(`value`: IResolvable) {
    unwrap(this).setOntapConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun ontapConfiguration(`value`: OntapConfigurationProperty) {
    unwrap(this).setOntapConfiguration(`value`.let(OntapConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96cdd10e0272dc9887ba907d5b421058290f17fb59ac25532dbb50dee66a83e7")
  public open fun ontapConfiguration(`value`: OntapConfigurationProperty.Builder.() -> Unit): Unit =
      ontapConfiguration(OntapConfigurationProperty(`value`))

  public open fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

  public open fun openZfsConfiguration(`value`: IResolvable) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty) {
    unwrap(this).setOpenZfsConfiguration(`value`.let(OpenZFSConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016365e3cb81303ddfc696920962edad0f979025ec1ab854e0a0e0a7bd61cda9")
  public open fun openZfsConfiguration(`value`: OpenZFSConfigurationProperty.Builder.() -> Unit):
      Unit = openZfsConfiguration(OpenZFSConfigurationProperty(`value`))

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  public open fun storageCapacity(`value`: Number) {
    unwrap(this).setStorageCapacity(`value`)
  }

  public open fun storageType(): String? = unwrap(this).getStorageType()

  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun windowsConfiguration(): Any? = unwrap(this).getWindowsConfiguration()

  public open fun windowsConfiguration(`value`: IResolvable) {
    unwrap(this).setWindowsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun windowsConfiguration(`value`: WindowsConfigurationProperty) {
    unwrap(this).setWindowsConfiguration(`value`.let(WindowsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("17ceb7592c7412f1800f62afd4f1d12cdfe3200011aedfb7d1ea9cd242161ca4")
  public open fun windowsConfiguration(`value`: WindowsConfigurationProperty.Builder.() -> Unit):
      Unit = windowsConfiguration(WindowsConfigurationProperty(`value`))

  public interface Builder {
    public fun backupId(backupId: String) {
    }

    public fun fileSystemType(fileSystemType: String) {
    }

    public fun fileSystemTypeVersion(fileSystemTypeVersion: String) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun lustreConfiguration(lustreConfiguration: IResolvable) {
    }

    public fun lustreConfiguration(lustreConfiguration: LustreConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ffb1848ab6306452bcbd16ffcb6ba2d5894d86e5251b5e929bf9e7aa0e10b9e")
    public
        fun lustreConfiguration(lustreConfiguration: LustreConfigurationProperty.Builder.() -> Unit) {
    }

    public fun ontapConfiguration(ontapConfiguration: IResolvable) {
    }

    public fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf84fd5c58c0ed36bb428bdaaa93c4e6ffeeb9e94edd4d4f2a34c8b0124b7068")
    public
        fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit) {
    }

    public fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
    }

    public fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d2a7f63461a36538cf88a3b8eaaacef125133a8bdbc5b8ac360598430d7a99b")
    public
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit) {
    }

    public fun securityGroupIds(securityGroupIds: List<String>) {
    }

    public fun storageCapacity(storageCapacity: Number) {
    }

    public fun storageType(storageType: String) {
    }

    public fun subnetIds(subnetIds: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun windowsConfiguration(windowsConfiguration: IResolvable) {
    }

    public fun windowsConfiguration(windowsConfiguration: WindowsConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed77315dad931a284e8c8b5ebfa01303758a2f360f000b6381c2cf38716af285")
    public
        fun windowsConfiguration(windowsConfiguration: WindowsConfigurationProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnFileSystem.Builder =
        software.amazon.awscdk.services.fsx.CfnFileSystem.Builder.create(scope, id)

    public override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    public override fun fileSystemType(fileSystemType: String) {
      cdkBuilder.fileSystemType(fileSystemType)
    }

    public override fun fileSystemTypeVersion(fileSystemTypeVersion: String) {
      cdkBuilder.fileSystemTypeVersion(fileSystemTypeVersion)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun lustreConfiguration(lustreConfiguration: IResolvable) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(IResolvable::unwrap))
    }

    public override fun lustreConfiguration(lustreConfiguration: LustreConfigurationProperty) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(LustreConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ffb1848ab6306452bcbd16ffcb6ba2d5894d86e5251b5e929bf9e7aa0e10b9e")
    public override
        fun lustreConfiguration(lustreConfiguration: LustreConfigurationProperty.Builder.() -> Unit):
        Unit = lustreConfiguration(LustreConfigurationProperty(lustreConfiguration))

    public override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable::unwrap))
    }

    public override fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(OntapConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf84fd5c58c0ed36bb428bdaaa93c4e6ffeeb9e94edd4d4f2a34c8b0124b7068")
    public override
        fun ontapConfiguration(ontapConfiguration: OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(OntapConfigurationProperty(ontapConfiguration))

    public override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable::unwrap))
    }

    public override fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(OpenZFSConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d2a7f63461a36538cf88a3b8eaaacef125133a8bdbc5b8ac360598430d7a99b")
    public override
        fun openZfsConfiguration(openZfsConfiguration: OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit = openZfsConfiguration(OpenZFSConfigurationProperty(openZfsConfiguration))

    public override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    public override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    public override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    public override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun windowsConfiguration(windowsConfiguration: IResolvable) {
      cdkBuilder.windowsConfiguration(windowsConfiguration.let(IResolvable::unwrap))
    }

    public override fun windowsConfiguration(windowsConfiguration: WindowsConfigurationProperty) {
      cdkBuilder.windowsConfiguration(windowsConfiguration.let(WindowsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed77315dad931a284e8c8b5ebfa01303758a2f360f000b6381c2cf38716af285")
    public override
        fun windowsConfiguration(windowsConfiguration: WindowsConfigurationProperty.Builder.() -> Unit):
        Unit = windowsConfiguration(WindowsConfigurationProperty(windowsConfiguration))

    public fun build(): software.amazon.awscdk.services.fsx.CfnFileSystem = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFileSystem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFileSystem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem): CfnFileSystem =
        CfnFileSystem(cdkObject)

    internal fun unwrap(wrapped: CfnFileSystem): software.amazon.awscdk.services.fsx.CfnFileSystem =
        wrapped.cdkObject
  }

  public interface WindowsConfigurationProperty {
    public fun activeDirectoryId(): String? = unwrap(this).getActiveDirectoryId()

    public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    public fun auditLogConfiguration(): Any? = unwrap(this).getAuditLogConfiguration()

    public fun automaticBackupRetentionDays(): Number? =
        unwrap(this).getAutomaticBackupRetentionDays()

    public fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

    public fun dailyAutomaticBackupStartTime(): String? =
        unwrap(this).getDailyAutomaticBackupStartTime()

    public fun deploymentType(): String? = unwrap(this).getDeploymentType()

    public fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

    public fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

    public fun selfManagedActiveDirectoryConfiguration(): Any? =
        unwrap(this).getSelfManagedActiveDirectoryConfiguration()

    public fun throughputCapacity(): Number

    public fun weeklyMaintenanceStartTime(): String? = unwrap(this).getWeeklyMaintenanceStartTime()

    public interface Builder {
      public fun activeDirectoryId(activeDirectoryId: String) {
      }

      public fun aliases(aliases: List<String>) {
      }

      public fun auditLogConfiguration(auditLogConfiguration: IResolvable) {
      }

      public fun auditLogConfiguration(auditLogConfiguration: AuditLogConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3607c85da94b03db39fd8d5195dc2332a907b139d68ddcb6e4bfb47fe033a4f")
      public
          fun auditLogConfiguration(auditLogConfiguration: AuditLogConfigurationProperty.Builder.() -> Unit) {
      }

      public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
      }

      public fun copyTagsToBackups(copyTagsToBackups: Boolean) {
      }

      public fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
      }

      public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
      }

      public fun deploymentType(deploymentType: String) {
      }

      public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
      }

      public fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("629a73cb1184c8d8e6e1aeee2e1a17222f7701a575244823c03d524616c7c576")
      public
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit) {
      }

      public fun preferredSubnetId(preferredSubnetId: String) {
      }

      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable) {
      }

      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bfc424b18d560f4ccb1d00ec2edf493cf56bd33b079c038bcdeeb7e29a499969")
      public
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty.Builder.() -> Unit) {
      }

      public fun throughputCapacity(throughputCapacity: Number) {
      }

      public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.builder()

      public override fun activeDirectoryId(activeDirectoryId: String) {
        cdkBuilder.activeDirectoryId(activeDirectoryId)
      }

      public override fun aliases(aliases: List<String>) {
        cdkBuilder.aliases(aliases)
      }

      public override fun auditLogConfiguration(auditLogConfiguration: IResolvable) {
        cdkBuilder.auditLogConfiguration(auditLogConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun auditLogConfiguration(auditLogConfiguration: AuditLogConfigurationProperty) {
        cdkBuilder.auditLogConfiguration(auditLogConfiguration.let(AuditLogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3607c85da94b03db39fd8d5195dc2332a907b139d68ddcb6e4bfb47fe033a4f")
      public override
          fun auditLogConfiguration(auditLogConfiguration: AuditLogConfigurationProperty.Builder.() -> Unit):
          Unit = auditLogConfiguration(AuditLogConfigurationProperty(auditLogConfiguration))

      public override fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
      }

      public override fun copyTagsToBackups(copyTagsToBackups: Boolean) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      public override fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups.let(IResolvable::unwrap))
      }

      public override fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
      }

      public override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      public override fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(DiskIopsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("629a73cb1184c8d8e6e1aeee2e1a17222f7701a575244823c03d524616c7c576")
      public override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit):
          Unit = diskIopsConfiguration(DiskIopsConfigurationProperty(diskIopsConfiguration))

      public override fun preferredSubnetId(preferredSubnetId: String) {
        cdkBuilder.preferredSubnetId(preferredSubnetId)
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
      @JvmName("bfc424b18d560f4ccb1d00ec2edf493cf56bd33b079c038bcdeeb7e29a499969")
      public override
          fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationProperty.Builder.() -> Unit):
          Unit =
          selfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationProperty(selfManagedActiveDirectoryConfiguration))

      public override fun throughputCapacity(throughputCapacity: Number) {
        cdkBuilder.throughputCapacity(throughputCapacity)
      }

      public override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty,
    ) : WindowsConfigurationProperty {
      public override fun activeDirectoryId(): String? = unwrap(this).getActiveDirectoryId()

      public override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

      public override fun auditLogConfiguration(): Any? = unwrap(this).getAuditLogConfiguration()

      public override fun automaticBackupRetentionDays(): Number? =
          unwrap(this).getAutomaticBackupRetentionDays()

      public override fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

      public override fun dailyAutomaticBackupStartTime(): String? =
          unwrap(this).getDailyAutomaticBackupStartTime()

      public override fun deploymentType(): String? = unwrap(this).getDeploymentType()

      public override fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

      public override fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

      public override fun selfManagedActiveDirectoryConfiguration(): Any? =
          unwrap(this).getSelfManagedActiveDirectoryConfiguration()

      public override fun throughputCapacity(): Number = unwrap(this).getThroughputCapacity()

      public override fun weeklyMaintenanceStartTime(): String? =
          unwrap(this).getWeeklyMaintenanceStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WindowsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty):
          WindowsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WindowsConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface LustreConfigurationProperty {
    public fun autoImportPolicy(): String? = unwrap(this).getAutoImportPolicy()

    public fun automaticBackupRetentionDays(): Number? =
        unwrap(this).getAutomaticBackupRetentionDays()

    public fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

    public fun dailyAutomaticBackupStartTime(): String? =
        unwrap(this).getDailyAutomaticBackupStartTime()

    public fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

    public fun deploymentType(): String? = unwrap(this).getDeploymentType()

    public fun driveCacheType(): String? = unwrap(this).getDriveCacheType()

    public fun exportPath(): String? = unwrap(this).getExportPath()

    public fun importPath(): String? = unwrap(this).getImportPath()

    public fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

    public fun perUnitStorageThroughput(): Number? = unwrap(this).getPerUnitStorageThroughput()

    public fun weeklyMaintenanceStartTime(): String? = unwrap(this).getWeeklyMaintenanceStartTime()

    public interface Builder {
      public fun autoImportPolicy(autoImportPolicy: String) {
      }

      public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
      }

      public fun copyTagsToBackups(copyTagsToBackups: Boolean) {
      }

      public fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
      }

      public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
      }

      public fun dataCompressionType(dataCompressionType: String) {
      }

      public fun deploymentType(deploymentType: String) {
      }

      public fun driveCacheType(driveCacheType: String) {
      }

      public fun exportPath(exportPath: String) {
      }

      public fun importPath(importPath: String) {
      }

      public fun importedFileChunkSize(importedFileChunkSize: Number) {
      }

      public fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
      }

      public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.builder()

      public override fun autoImportPolicy(autoImportPolicy: String) {
        cdkBuilder.autoImportPolicy(autoImportPolicy)
      }

      public override fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
      }

      public override fun copyTagsToBackups(copyTagsToBackups: Boolean) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      public override fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups.let(IResolvable::unwrap))
      }

      public override fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
      }

      public override fun dataCompressionType(dataCompressionType: String) {
        cdkBuilder.dataCompressionType(dataCompressionType)
      }

      public override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      public override fun driveCacheType(driveCacheType: String) {
        cdkBuilder.driveCacheType(driveCacheType)
      }

      public override fun exportPath(exportPath: String) {
        cdkBuilder.exportPath(exportPath)
      }

      public override fun importPath(importPath: String) {
        cdkBuilder.importPath(importPath)
      }

      public override fun importedFileChunkSize(importedFileChunkSize: Number) {
        cdkBuilder.importedFileChunkSize(importedFileChunkSize)
      }

      public override fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
        cdkBuilder.perUnitStorageThroughput(perUnitStorageThroughput)
      }

      public override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty,
    ) : LustreConfigurationProperty {
      public override fun autoImportPolicy(): String? = unwrap(this).getAutoImportPolicy()

      public override fun automaticBackupRetentionDays(): Number? =
          unwrap(this).getAutomaticBackupRetentionDays()

      public override fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

      public override fun dailyAutomaticBackupStartTime(): String? =
          unwrap(this).getDailyAutomaticBackupStartTime()

      public override fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

      public override fun deploymentType(): String? = unwrap(this).getDeploymentType()

      public override fun driveCacheType(): String? = unwrap(this).getDriveCacheType()

      public override fun exportPath(): String? = unwrap(this).getExportPath()

      public override fun importPath(): String? = unwrap(this).getImportPath()

      public override fun importedFileChunkSize(): Number? = unwrap(this).getImportedFileChunkSize()

      public override fun perUnitStorageThroughput(): Number? =
          unwrap(this).getPerUnitStorageThroughput()

      public override fun weeklyMaintenanceStartTime(): String? =
          unwrap(this).getWeeklyMaintenanceStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LustreConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty):
          LustreConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LustreConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AuditLogConfigurationProperty {
    public fun auditLogDestination(): String? = unwrap(this).getAuditLogDestination()

    public fun fileAccessAuditLogLevel(): String

    public fun fileShareAccessAuditLogLevel(): String

    public interface Builder {
      public fun auditLogDestination(auditLogDestination: String) {
      }

      public fun fileAccessAuditLogLevel(fileAccessAuditLogLevel: String) {
      }

      public fun fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty.builder()

      public override fun auditLogDestination(auditLogDestination: String) {
        cdkBuilder.auditLogDestination(auditLogDestination)
      }

      public override fun fileAccessAuditLogLevel(fileAccessAuditLogLevel: String) {
        cdkBuilder.fileAccessAuditLogLevel(fileAccessAuditLogLevel)
      }

      public override fun fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel: String) {
        cdkBuilder.fileShareAccessAuditLogLevel(fileShareAccessAuditLogLevel)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty,
    ) : AuditLogConfigurationProperty {
      public override fun auditLogDestination(): String? = unwrap(this).getAuditLogDestination()

      public override fun fileAccessAuditLogLevel(): String =
          unwrap(this).getFileAccessAuditLogLevel()

      public override fun fileShareAccessAuditLogLevel(): String =
          unwrap(this).getFileShareAccessAuditLogLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuditLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty):
          AuditLogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuditLogConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ClientConfigurationsProperty {
    public fun clients(): String? = unwrap(this).getClients()

    public fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

    public interface Builder {
      public fun clients(clients: String) {
      }

      public fun options(options: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty.builder()

      public override fun clients(clients: String) {
        cdkBuilder.clients(clients)
      }

      public override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty,
    ) : ClientConfigurationsProperty {
      public override fun clients(): String? = unwrap(this).getClients()

      public override fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty):
          ClientConfigurationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientConfigurationsProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.ClientConfigurationsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OntapConfigurationProperty {
    public fun automaticBackupRetentionDays(): Number? =
        unwrap(this).getAutomaticBackupRetentionDays()

    public fun dailyAutomaticBackupStartTime(): String? =
        unwrap(this).getDailyAutomaticBackupStartTime()

    public fun deploymentType(): String

    public fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

    public fun endpointIpAddressRange(): String? = unwrap(this).getEndpointIpAddressRange()

    public fun fsxAdminPassword(): String? = unwrap(this).getFsxAdminPassword()

    public fun haPairs(): Number? = unwrap(this).getHaPairs()

    public fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

    public fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

    public fun throughputCapacity(): Number? = unwrap(this).getThroughputCapacity()

    public fun throughputCapacityPerHaPair(): Number? =
        unwrap(this).getThroughputCapacityPerHaPair()

    public fun weeklyMaintenanceStartTime(): String? = unwrap(this).getWeeklyMaintenanceStartTime()

    public interface Builder {
      public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
      }

      public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
      }

      public fun deploymentType(deploymentType: String) {
      }

      public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
      }

      public fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa848444d8fe815186bb9a42535c50f3de4891f0bb7fd7cc4082410a54d93baa")
      public
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit) {
      }

      public fun endpointIpAddressRange(endpointIpAddressRange: String) {
      }

      public fun fsxAdminPassword(fsxAdminPassword: String) {
      }

      public fun haPairs(haPairs: Number) {
      }

      public fun preferredSubnetId(preferredSubnetId: String) {
      }

      public fun routeTableIds(routeTableIds: List<String>) {
      }

      public fun throughputCapacity(throughputCapacity: Number) {
      }

      public fun throughputCapacityPerHaPair(throughputCapacityPerHaPair: Number) {
      }

      public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty.builder()

      public override fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
      }

      public override fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
      }

      public override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      public override fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(DiskIopsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa848444d8fe815186bb9a42535c50f3de4891f0bb7fd7cc4082410a54d93baa")
      public override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit):
          Unit = diskIopsConfiguration(DiskIopsConfigurationProperty(diskIopsConfiguration))

      public override fun endpointIpAddressRange(endpointIpAddressRange: String) {
        cdkBuilder.endpointIpAddressRange(endpointIpAddressRange)
      }

      public override fun fsxAdminPassword(fsxAdminPassword: String) {
        cdkBuilder.fsxAdminPassword(fsxAdminPassword)
      }

      public override fun haPairs(haPairs: Number) {
        cdkBuilder.haPairs(haPairs)
      }

      public override fun preferredSubnetId(preferredSubnetId: String) {
        cdkBuilder.preferredSubnetId(preferredSubnetId)
      }

      public override fun routeTableIds(routeTableIds: List<String>) {
        cdkBuilder.routeTableIds(routeTableIds)
      }

      public override fun throughputCapacity(throughputCapacity: Number) {
        cdkBuilder.throughputCapacity(throughputCapacity)
      }

      public override fun throughputCapacityPerHaPair(throughputCapacityPerHaPair: Number) {
        cdkBuilder.throughputCapacityPerHaPair(throughputCapacityPerHaPair)
      }

      public override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty,
    ) : OntapConfigurationProperty {
      public override fun automaticBackupRetentionDays(): Number? =
          unwrap(this).getAutomaticBackupRetentionDays()

      public override fun dailyAutomaticBackupStartTime(): String? =
          unwrap(this).getDailyAutomaticBackupStartTime()

      public override fun deploymentType(): String = unwrap(this).getDeploymentType()

      public override fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

      public override fun endpointIpAddressRange(): String? =
          unwrap(this).getEndpointIpAddressRange()

      public override fun fsxAdminPassword(): String? = unwrap(this).getFsxAdminPassword()

      public override fun haPairs(): Number? = unwrap(this).getHaPairs()

      public override fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

      public override fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?:
          emptyList()

      public override fun throughputCapacity(): Number? = unwrap(this).getThroughputCapacity()

      public override fun throughputCapacityPerHaPair(): Number? =
          unwrap(this).getThroughputCapacityPerHaPair()

      public override fun weeklyMaintenanceStartTime(): String? =
          unwrap(this).getWeeklyMaintenanceStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OntapConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty):
          OntapConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OntapConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NfsExportsProperty {
    public fun clientConfigurations(): Any? = unwrap(this).getClientConfigurations()

    public interface Builder {
      public fun clientConfigurations(clientConfigurations: IResolvable) {
      }

      public fun clientConfigurations(clientConfigurations: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty.builder()

      public override fun clientConfigurations(clientConfigurations: IResolvable) {
        cdkBuilder.clientConfigurations(clientConfigurations.let(IResolvable::unwrap))
      }

      public override fun clientConfigurations(clientConfigurations: List<Any>) {
        cdkBuilder.clientConfigurations(clientConfigurations)
      }

      public fun build(): software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty,
    ) : NfsExportsProperty {
      public override fun clientConfigurations(): Any? = unwrap(this).getClientConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NfsExportsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty):
          NfsExportsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NfsExportsProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.NfsExportsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OpenZFSConfigurationProperty {
    public fun automaticBackupRetentionDays(): Number? =
        unwrap(this).getAutomaticBackupRetentionDays()

    public fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

    public fun copyTagsToVolumes(): Any? = unwrap(this).getCopyTagsToVolumes()

    public fun dailyAutomaticBackupStartTime(): String? =
        unwrap(this).getDailyAutomaticBackupStartTime()

    public fun deploymentType(): String

    public fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

    public fun endpointIpAddressRange(): String? = unwrap(this).getEndpointIpAddressRange()

    public fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

    public fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

    public fun rootVolumeConfiguration(): Any? = unwrap(this).getRootVolumeConfiguration()

    public fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

    public fun throughputCapacity(): Number? = unwrap(this).getThroughputCapacity()

    public fun weeklyMaintenanceStartTime(): String? = unwrap(this).getWeeklyMaintenanceStartTime()

    public interface Builder {
      public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
      }

      public fun copyTagsToBackups(copyTagsToBackups: Boolean) {
      }

      public fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
      }

      public fun copyTagsToVolumes(copyTagsToVolumes: Boolean) {
      }

      public fun copyTagsToVolumes(copyTagsToVolumes: IResolvable) {
      }

      public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
      }

      public fun deploymentType(deploymentType: String) {
      }

      public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
      }

      public fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6599b9fa97fd21cf4a69f3d1ffebe3a6f1a1656042284dec261c2076d2c3e0fe")
      public
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit) {
      }

      public fun endpointIpAddressRange(endpointIpAddressRange: String) {
      }

      public fun options(options: List<String>) {
      }

      public fun preferredSubnetId(preferredSubnetId: String) {
      }

      public fun rootVolumeConfiguration(rootVolumeConfiguration: IResolvable) {
      }

      public fun rootVolumeConfiguration(rootVolumeConfiguration: RootVolumeConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2698595964bd241ea977ee8dbad20601300443dc3fe31b8a47932a577ea24b76")
      public
          fun rootVolumeConfiguration(rootVolumeConfiguration: RootVolumeConfigurationProperty.Builder.() -> Unit) {
      }

      public fun routeTableIds(routeTableIds: List<String>) {
      }

      public fun throughputCapacity(throughputCapacity: Number) {
      }

      public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty.builder()

      public override fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
        cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
      }

      public override fun copyTagsToBackups(copyTagsToBackups: Boolean) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups)
      }

      public override fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
        cdkBuilder.copyTagsToBackups(copyTagsToBackups.let(IResolvable::unwrap))
      }

      public override fun copyTagsToVolumes(copyTagsToVolumes: Boolean) {
        cdkBuilder.copyTagsToVolumes(copyTagsToVolumes)
      }

      public override fun copyTagsToVolumes(copyTagsToVolumes: IResolvable) {
        cdkBuilder.copyTagsToVolumes(copyTagsToVolumes.let(IResolvable::unwrap))
      }

      public override fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
        cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
      }

      public override fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
      }

      public override fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty) {
        cdkBuilder.diskIopsConfiguration(diskIopsConfiguration.let(DiskIopsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6599b9fa97fd21cf4a69f3d1ffebe3a6f1a1656042284dec261c2076d2c3e0fe")
      public override
          fun diskIopsConfiguration(diskIopsConfiguration: DiskIopsConfigurationProperty.Builder.() -> Unit):
          Unit = diskIopsConfiguration(DiskIopsConfigurationProperty(diskIopsConfiguration))

      public override fun endpointIpAddressRange(endpointIpAddressRange: String) {
        cdkBuilder.endpointIpAddressRange(endpointIpAddressRange)
      }

      public override fun options(options: List<String>) {
        cdkBuilder.options(options)
      }

      public override fun preferredSubnetId(preferredSubnetId: String) {
        cdkBuilder.preferredSubnetId(preferredSubnetId)
      }

      public override fun rootVolumeConfiguration(rootVolumeConfiguration: IResolvable) {
        cdkBuilder.rootVolumeConfiguration(rootVolumeConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun rootVolumeConfiguration(rootVolumeConfiguration: RootVolumeConfigurationProperty) {
        cdkBuilder.rootVolumeConfiguration(rootVolumeConfiguration.let(RootVolumeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2698595964bd241ea977ee8dbad20601300443dc3fe31b8a47932a577ea24b76")
      public override
          fun rootVolumeConfiguration(rootVolumeConfiguration: RootVolumeConfigurationProperty.Builder.() -> Unit):
          Unit = rootVolumeConfiguration(RootVolumeConfigurationProperty(rootVolumeConfiguration))

      public override fun routeTableIds(routeTableIds: List<String>) {
        cdkBuilder.routeTableIds(routeTableIds)
      }

      public override fun throughputCapacity(throughputCapacity: Number) {
        cdkBuilder.throughputCapacity(throughputCapacity)
      }

      public override fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
        cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty,
    ) : OpenZFSConfigurationProperty {
      public override fun automaticBackupRetentionDays(): Number? =
          unwrap(this).getAutomaticBackupRetentionDays()

      public override fun copyTagsToBackups(): Any? = unwrap(this).getCopyTagsToBackups()

      public override fun copyTagsToVolumes(): Any? = unwrap(this).getCopyTagsToVolumes()

      public override fun dailyAutomaticBackupStartTime(): String? =
          unwrap(this).getDailyAutomaticBackupStartTime()

      public override fun deploymentType(): String = unwrap(this).getDeploymentType()

      public override fun diskIopsConfiguration(): Any? = unwrap(this).getDiskIopsConfiguration()

      public override fun endpointIpAddressRange(): String? =
          unwrap(this).getEndpointIpAddressRange()

      public override fun options(): List<String> = unwrap(this).getOptions() ?: emptyList()

      public override fun preferredSubnetId(): String? = unwrap(this).getPreferredSubnetId()

      public override fun rootVolumeConfiguration(): Any? =
          unwrap(this).getRootVolumeConfiguration()

      public override fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?:
          emptyList()

      public override fun throughputCapacity(): Number? = unwrap(this).getThroughputCapacity()

      public override fun weeklyMaintenanceStartTime(): String? =
          unwrap(this).getWeeklyMaintenanceStartTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OpenZFSConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty):
          OpenZFSConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenZFSConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.OpenZFSConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RootVolumeConfigurationProperty {
    public fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

    public fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

    public fun nfsExports(): Any? = unwrap(this).getNfsExports()

    public fun readOnly(): Any? = unwrap(this).getReadOnly()

    public fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

    public fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()

    public interface Builder {
      public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
      }

      public fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
      }

      public fun dataCompressionType(dataCompressionType: String) {
      }

      public fun nfsExports(nfsExports: IResolvable) {
      }

      public fun nfsExports(nfsExports: List<Any>) {
      }

      public fun readOnly(readOnly: Boolean) {
      }

      public fun readOnly(readOnly: IResolvable) {
      }

      public fun recordSizeKiB(recordSizeKiB: Number) {
      }

      public fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
      }

      public fun userAndGroupQuotas(userAndGroupQuotas: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty.builder()

      public override fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
      }

      public override fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots.let(IResolvable::unwrap))
      }

      public override fun dataCompressionType(dataCompressionType: String) {
        cdkBuilder.dataCompressionType(dataCompressionType)
      }

      public override fun nfsExports(nfsExports: IResolvable) {
        cdkBuilder.nfsExports(nfsExports.let(IResolvable::unwrap))
      }

      public override fun nfsExports(nfsExports: List<Any>) {
        cdkBuilder.nfsExports(nfsExports)
      }

      public override fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
      }

      public override fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly.let(IResolvable::unwrap))
      }

      public override fun recordSizeKiB(recordSizeKiB: Number) {
        cdkBuilder.recordSizeKiB(recordSizeKiB)
      }

      public override fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas.let(IResolvable::unwrap))
      }

      public override fun userAndGroupQuotas(userAndGroupQuotas: List<Any>) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty,
    ) : RootVolumeConfigurationProperty {
      public override fun copyTagsToSnapshots(): Any? = unwrap(this).getCopyTagsToSnapshots()

      public override fun dataCompressionType(): String? = unwrap(this).getDataCompressionType()

      public override fun nfsExports(): Any? = unwrap(this).getNfsExports()

      public override fun readOnly(): Any? = unwrap(this).getReadOnly()

      public override fun recordSizeKiB(): Number? = unwrap(this).getRecordSizeKiB()

      public override fun userAndGroupQuotas(): Any? = unwrap(this).getUserAndGroupQuotas()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RootVolumeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty):
          RootVolumeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RootVolumeConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.RootVolumeConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DiskIopsConfigurationProperty {
    public fun iops(): Number? = unwrap(this).getIops()

    public fun mode(): String? = unwrap(this).getMode()

    public interface Builder {
      public fun iops(iops: Number) {
      }

      public fun mode(mode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty.builder()

      public override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      public override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty,
    ) : DiskIopsConfigurationProperty {
      public override fun iops(): Number? = unwrap(this).getIops()

      public override fun mode(): String? = unwrap(this).getMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DiskIopsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty):
          DiskIopsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DiskIopsConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface UserAndGroupQuotasProperty {
    public fun id(): Number? = unwrap(this).getId()

    public fun storageCapacityQuotaGiB(): Number? = unwrap(this).getStorageCapacityQuotaGiB()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun id(id: Number) {
      }

      public fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty.Builder =
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty.builder()

      public override fun id(id: Number) {
        cdkBuilder.id(id)
      }

      public override fun storageCapacityQuotaGiB(storageCapacityQuotaGiB: Number) {
        cdkBuilder.storageCapacityQuotaGiB(storageCapacityQuotaGiB)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty,
    ) : UserAndGroupQuotasProperty {
      public override fun id(): Number? = unwrap(this).getId()

      public override fun storageCapacityQuotaGiB(): Number? =
          unwrap(this).getStorageCapacityQuotaGiB()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserAndGroupQuotasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty):
          UserAndGroupQuotasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserAndGroupQuotasProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.UserAndGroupQuotasProperty = (wrapped as
          Wrapper).cdkObject
    }
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
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty.builder()

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
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty):
          SelfManagedActiveDirectoryConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedActiveDirectoryConfigurationProperty):
          software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
