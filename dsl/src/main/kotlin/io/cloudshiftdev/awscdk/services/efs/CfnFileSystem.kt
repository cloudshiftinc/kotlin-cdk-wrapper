package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CfnResource
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
  private val cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrFileSystemId(): String = unwrap(this).getAttrFileSystemId()

  public open fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

  public open fun availabilityZoneName(`value`: String) {
    unwrap(this).setAvailabilityZoneName(`value`)
  }

  public open fun backupPolicy(): Any? = unwrap(this).getBackupPolicy()

  public open fun backupPolicy(`value`: IResolvable) {
    unwrap(this).setBackupPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun backupPolicy(`value`: BackupPolicyProperty) {
    unwrap(this).setBackupPolicy(`value`.let(BackupPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3d2c3dd1ca9e563238d455e0ec9754a469a9e690d82358c513e778dd2a23082d")
  public open fun backupPolicy(`value`: BackupPolicyProperty.Builder.() -> Unit): Unit =
      backupPolicy(BackupPolicyProperty(`value`))

  public open fun bypassPolicyLockoutSafetyCheck(): Any? =
      unwrap(this).getBypassPolicyLockoutSafetyCheck()

  public open fun bypassPolicyLockoutSafetyCheck(`value`: Boolean) {
    unwrap(this).setBypassPolicyLockoutSafetyCheck(`value`)
  }

  public open fun bypassPolicyLockoutSafetyCheck(`value`: IResolvable) {
    unwrap(this).setBypassPolicyLockoutSafetyCheck(`value`.let(IResolvable::unwrap))
  }

  public open fun encrypted(): Any? = unwrap(this).getEncrypted()

  public open fun encrypted(`value`: Boolean) {
    unwrap(this).setEncrypted(`value`)
  }

  public open fun encrypted(`value`: IResolvable) {
    unwrap(this).setEncrypted(`value`.let(IResolvable::unwrap))
  }

  public open fun fileSystemPolicy(): Any? = unwrap(this).getFileSystemPolicy()

  public open fun fileSystemPolicy(`value`: Any) {
    unwrap(this).setFileSystemPolicy(`value`)
  }

  public open fun fileSystemProtection(): Any? = unwrap(this).getFileSystemProtection()

  public open fun fileSystemProtection(`value`: IResolvable) {
    unwrap(this).setFileSystemProtection(`value`.let(IResolvable::unwrap))
  }

  public open fun fileSystemProtection(`value`: FileSystemProtectionProperty) {
    unwrap(this).setFileSystemProtection(`value`.let(FileSystemProtectionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bba4271920499492bfb5cc6086044de81a9a6455147b2f555d3636c0e86eab2")
  public open fun fileSystemProtection(`value`: FileSystemProtectionProperty.Builder.() -> Unit):
      Unit = fileSystemProtection(FileSystemProtectionProperty(`value`))

  public open fun fileSystemTagsRaw(): List<ElasticFileSystemTagProperty> =
      unwrap(this).getFileSystemTagsRaw()?.map(ElasticFileSystemTagProperty::wrap) ?: emptyList()

  public open fun fileSystemTagsRaw(`value`: List<ElasticFileSystemTagProperty>) {
    unwrap(this).setFileSystemTagsRaw(`value`.map(ElasticFileSystemTagProperty::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun lifecyclePolicies(): Any? = unwrap(this).getLifecyclePolicies()

  public open fun lifecyclePolicies(`value`: IResolvable) {
    unwrap(this).setLifecyclePolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun lifecyclePolicies(__idx_ac66f0: List<Any>) {
    unwrap(this).setLifecyclePolicies(__idx_ac66f0)
  }

  public open fun performanceMode(): String? = unwrap(this).getPerformanceMode()

  public open fun performanceMode(`value`: String) {
    unwrap(this).setPerformanceMode(`value`)
  }

  public open fun provisionedThroughputInMibps(): Number? =
      unwrap(this).getProvisionedThroughputInMibps()

  public open fun provisionedThroughputInMibps(`value`: Number) {
    unwrap(this).setProvisionedThroughputInMibps(`value`)
  }

  public open fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  public open fun replicationConfiguration(`value`: IResolvable) {
    unwrap(this).setReplicationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationConfiguration(`value`: ReplicationConfigurationProperty) {
    unwrap(this).setReplicationConfiguration(`value`.let(ReplicationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4fcd7a8bd99b774e253bb097b989d8b37cbf5b89e9825d10288a1c7dee0bdb6d")
  public open
      fun replicationConfiguration(`value`: ReplicationConfigurationProperty.Builder.() -> Unit):
      Unit = replicationConfiguration(ReplicationConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun throughputMode(): String? = unwrap(this).getThroughputMode()

  public open fun throughputMode(`value`: String) {
    unwrap(this).setThroughputMode(`value`)
  }

  public interface Builder {
    public fun availabilityZoneName(availabilityZoneName: String)

    public fun backupPolicy(backupPolicy: IResolvable)

    public fun backupPolicy(backupPolicy: BackupPolicyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75c2068fea33f46f0b81ec9b3167482f1b33d2850483e2128410e2ec3c6e5797")
    public fun backupPolicy(backupPolicy: BackupPolicyProperty.Builder.() -> Unit)

    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean)

    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable)

    public fun encrypted(encrypted: Boolean)

    public fun encrypted(encrypted: IResolvable)

    public fun fileSystemPolicy(fileSystemPolicy: Any)

    public fun fileSystemProtection(fileSystemProtection: IResolvable)

    public fun fileSystemProtection(fileSystemProtection: FileSystemProtectionProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe219d089f6ecb2b40f3cf37e0616ea4fb81907fb8a89fd945425744d7e1c922")
    public
        fun fileSystemProtection(fileSystemProtection: FileSystemProtectionProperty.Builder.() -> Unit)

    public fun fileSystemTags(fileSystemTags: List<ElasticFileSystemTagProperty>)

    public fun kmsKeyId(kmsKeyId: String)

    public fun lifecyclePolicies(lifecyclePolicies: IResolvable)

    public fun lifecyclePolicies(lifecyclePolicies: List<Any>)

    public fun performanceMode(performanceMode: String)

    public fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number)

    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    public fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a98676449aff2b6dc6f8e4f8d8b593e443b3e6102fe0793e2d7f90a4427d8cd8")
    public
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit)

    public fun throughputMode(throughputMode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnFileSystem.Builder =
        software.amazon.awscdk.services.efs.CfnFileSystem.Builder.create(scope, id)

    override fun availabilityZoneName(availabilityZoneName: String) {
      cdkBuilder.availabilityZoneName(availabilityZoneName)
    }

    override fun backupPolicy(backupPolicy: IResolvable) {
      cdkBuilder.backupPolicy(backupPolicy.let(IResolvable::unwrap))
    }

    override fun backupPolicy(backupPolicy: BackupPolicyProperty) {
      cdkBuilder.backupPolicy(backupPolicy.let(BackupPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75c2068fea33f46f0b81ec9b3167482f1b33d2850483e2128410e2ec3c6e5797")
    override fun backupPolicy(backupPolicy: BackupPolicyProperty.Builder.() -> Unit): Unit =
        backupPolicy(BackupPolicyProperty(backupPolicy))

    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck.let(IResolvable::unwrap))
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
    }

    override fun fileSystemPolicy(fileSystemPolicy: Any) {
      cdkBuilder.fileSystemPolicy(fileSystemPolicy)
    }

    override fun fileSystemProtection(fileSystemProtection: IResolvable) {
      cdkBuilder.fileSystemProtection(fileSystemProtection.let(IResolvable::unwrap))
    }

    override fun fileSystemProtection(fileSystemProtection: FileSystemProtectionProperty) {
      cdkBuilder.fileSystemProtection(fileSystemProtection.let(FileSystemProtectionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe219d089f6ecb2b40f3cf37e0616ea4fb81907fb8a89fd945425744d7e1c922")
    override
        fun fileSystemProtection(fileSystemProtection: FileSystemProtectionProperty.Builder.() -> Unit):
        Unit = fileSystemProtection(FileSystemProtectionProperty(fileSystemProtection))

    override fun fileSystemTags(fileSystemTags: List<ElasticFileSystemTagProperty>) {
      cdkBuilder.fileSystemTags(fileSystemTags.map(ElasticFileSystemTagProperty::unwrap))
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun lifecyclePolicies(lifecyclePolicies: IResolvable) {
      cdkBuilder.lifecyclePolicies(lifecyclePolicies.let(IResolvable::unwrap))
    }

    override fun lifecyclePolicies(lifecyclePolicies: List<Any>) {
      cdkBuilder.lifecyclePolicies(lifecyclePolicies)
    }

    override fun performanceMode(performanceMode: String) {
      cdkBuilder.performanceMode(performanceMode)
    }

    override fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number) {
      cdkBuilder.provisionedThroughputInMibps(provisionedThroughputInMibps)
    }

    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(ReplicationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a98676449aff2b6dc6f8e4f8d8b593e443b3e6102fe0793e2d7f90a4427d8cd8")
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit = replicationConfiguration(ReplicationConfigurationProperty(replicationConfiguration))

    override fun throughputMode(throughputMode: String) {
      cdkBuilder.throughputMode(throughputMode)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnFileSystem = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem): CfnFileSystem =
        CfnFileSystem(cdkObject)

    internal fun unwrap(wrapped: CfnFileSystem): software.amazon.awscdk.services.efs.CfnFileSystem =
        wrapped.cdkObject
  }

  public interface FileSystemProtectionProperty {
    public fun replicationOverwriteProtection(): String? =
        unwrap(this).getReplicationOverwriteProtection()

    public interface Builder {
      public fun replicationOverwriteProtection(replicationOverwriteProtection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty.builder()

      override fun replicationOverwriteProtection(replicationOverwriteProtection: String) {
        cdkBuilder.replicationOverwriteProtection(replicationOverwriteProtection)
      }

      public fun build():
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty,
    ) : FileSystemProtectionProperty {
      override fun replicationOverwriteProtection(): String? =
          unwrap(this).getReplicationOverwriteProtection()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemProtectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty):
          FileSystemProtectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemProtectionProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ElasticFileSystemTagProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty,
    ) : ElasticFileSystemTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticFileSystemTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty):
          ElasticFileSystemTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticFileSystemTagProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ReplicationDestinationProperty {
    public fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

    public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun region(): String? = unwrap(this).getRegion()

    public interface Builder {
      public fun availabilityZoneName(availabilityZoneName: String)

      public fun fileSystemId(fileSystemId: String)

      public fun kmsKeyId(kmsKeyId: String)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty.builder()

      override fun availabilityZoneName(availabilityZoneName: String) {
        cdkBuilder.availabilityZoneName(availabilityZoneName)
      }

      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty,
    ) : ReplicationDestinationProperty {
      override fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

      override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty):
          ReplicationDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationDestinationProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LifecyclePolicyProperty {
    public fun transitionToArchive(): String? = unwrap(this).getTransitionToArchive()

    public fun transitionToIa(): String? = unwrap(this).getTransitionToIa()

    public fun transitionToPrimaryStorageClass(): String? =
        unwrap(this).getTransitionToPrimaryStorageClass()

    public interface Builder {
      public fun transitionToArchive(transitionToArchive: String)

      public fun transitionToIa(transitionToIa: String)

      public fun transitionToPrimaryStorageClass(transitionToPrimaryStorageClass: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty.builder()

      override fun transitionToArchive(transitionToArchive: String) {
        cdkBuilder.transitionToArchive(transitionToArchive)
      }

      override fun transitionToIa(transitionToIa: String) {
        cdkBuilder.transitionToIa(transitionToIa)
      }

      override fun transitionToPrimaryStorageClass(transitionToPrimaryStorageClass: String) {
        cdkBuilder.transitionToPrimaryStorageClass(transitionToPrimaryStorageClass)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty,
    ) : LifecyclePolicyProperty {
      override fun transitionToArchive(): String? = unwrap(this).getTransitionToArchive()

      override fun transitionToIa(): String? = unwrap(this).getTransitionToIa()

      override fun transitionToPrimaryStorageClass(): String? =
          unwrap(this).getTransitionToPrimaryStorageClass()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LifecyclePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty):
          LifecyclePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecyclePolicyProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ReplicationConfigurationProperty {
    public fun destinations(): Any? = unwrap(this).getDestinations()

    public interface Builder {
      public fun destinations(destinations: IResolvable)

      public fun destinations(destinations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty.builder()

      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      public fun build():
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty,
    ) : ReplicationConfigurationProperty {
      override fun destinations(): Any? = unwrap(this).getDestinations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty):
          ReplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationConfigurationProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BackupPolicyProperty {
    public fun status(): String

    public interface Builder {
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty.builder()

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty,
    ) : BackupPolicyProperty {
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BackupPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty):
          BackupPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupPolicyProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
