@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFileSystemProps {
  public fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

  public fun backupPolicy(): Any? = unwrap(this).getBackupPolicy()

  public fun bypassPolicyLockoutSafetyCheck(): Any? =
      unwrap(this).getBypassPolicyLockoutSafetyCheck()

  public fun encrypted(): Any? = unwrap(this).getEncrypted()

  public fun fileSystemPolicy(): Any? = unwrap(this).getFileSystemPolicy()

  public fun fileSystemProtection(): Any? = unwrap(this).getFileSystemProtection()

  public fun fileSystemTags(): List<CfnFileSystem.ElasticFileSystemTagProperty> =
      unwrap(this).getFileSystemTags()?.map(CfnFileSystem.ElasticFileSystemTagProperty::wrap) ?:
      emptyList()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun lifecyclePolicies(): Any? = unwrap(this).getLifecyclePolicies()

  public fun performanceMode(): String? = unwrap(this).getPerformanceMode()

  public fun provisionedThroughputInMibps(): Number? =
      unwrap(this).getProvisionedThroughputInMibps()

  public fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  public fun throughputMode(): String? = unwrap(this).getThroughputMode()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZoneName(availabilityZoneName: String)

    public fun backupPolicy(backupPolicy: IResolvable)

    public fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6efb74101984bc7eb369cde656c92cd0ac4415e831ab665ce514ee1f0f3e79d2")
    public fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty.Builder.() -> Unit)

    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean)

    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable)

    public fun encrypted(encrypted: Boolean)

    public fun encrypted(encrypted: IResolvable)

    public fun fileSystemPolicy(fileSystemPolicy: Any)

    public fun fileSystemProtection(fileSystemProtection: IResolvable)

    public
        fun fileSystemProtection(fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7c66a690737a4fe60a2de527a6a5e00cff2ecf9460cfe76d24fc5a82f78e769")
    public
        fun fileSystemProtection(fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty.Builder.() -> Unit)

    public fun fileSystemTags(fileSystemTags: List<CfnFileSystem.ElasticFileSystemTagProperty>)

    public fun fileSystemTags(vararg fileSystemTags: CfnFileSystem.ElasticFileSystemTagProperty)

    public fun kmsKeyId(kmsKeyId: String)

    public fun lifecyclePolicies(lifecyclePolicies: IResolvable)

    public fun lifecyclePolicies(lifecyclePolicies: List<Any>)

    public fun lifecyclePolicies(vararg lifecyclePolicies: Any)

    public fun performanceMode(performanceMode: String)

    public fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number)

    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    public
        fun replicationConfiguration(replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379c82bcd980fc741489ab1d49bd6dda92b721fe9c385ebf8ea4807985c1dce6")
    public
        fun replicationConfiguration(replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty.Builder.() -> Unit)

    public fun throughputMode(throughputMode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder =
        software.amazon.awscdk.services.efs.CfnFileSystemProps.builder()

    override fun availabilityZoneName(availabilityZoneName: String) {
      cdkBuilder.availabilityZoneName(availabilityZoneName)
    }

    override fun backupPolicy(backupPolicy: IResolvable) {
      cdkBuilder.backupPolicy(backupPolicy.let(IResolvable::unwrap))
    }

    override fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty) {
      cdkBuilder.backupPolicy(backupPolicy.let(CfnFileSystem.BackupPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6efb74101984bc7eb369cde656c92cd0ac4415e831ab665ce514ee1f0f3e79d2")
    override fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty.Builder.() -> Unit):
        Unit = backupPolicy(CfnFileSystem.BackupPolicyProperty(backupPolicy))

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

    override
        fun fileSystemProtection(fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty) {
      cdkBuilder.fileSystemProtection(fileSystemProtection.let(CfnFileSystem.FileSystemProtectionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7c66a690737a4fe60a2de527a6a5e00cff2ecf9460cfe76d24fc5a82f78e769")
    override
        fun fileSystemProtection(fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty.Builder.() -> Unit):
        Unit =
        fileSystemProtection(CfnFileSystem.FileSystemProtectionProperty(fileSystemProtection))

    override fun fileSystemTags(fileSystemTags: List<CfnFileSystem.ElasticFileSystemTagProperty>) {
      cdkBuilder.fileSystemTags(fileSystemTags.map(CfnFileSystem.ElasticFileSystemTagProperty::unwrap))
    }

    override fun fileSystemTags(vararg fileSystemTags: CfnFileSystem.ElasticFileSystemTagProperty):
        Unit = fileSystemTags(fileSystemTags.toList())

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun lifecyclePolicies(lifecyclePolicies: IResolvable) {
      cdkBuilder.lifecyclePolicies(lifecyclePolicies.let(IResolvable::unwrap))
    }

    override fun lifecyclePolicies(lifecyclePolicies: List<Any>) {
      cdkBuilder.lifecyclePolicies(lifecyclePolicies)
    }

    override fun lifecyclePolicies(vararg lifecyclePolicies: Any): Unit =
        lifecyclePolicies(lifecyclePolicies.toList())

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
        fun replicationConfiguration(replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(CfnFileSystem.ReplicationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379c82bcd980fc741489ab1d49bd6dda92b721fe9c385ebf8ea4807985c1dce6")
    override
        fun replicationConfiguration(replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        replicationConfiguration(CfnFileSystem.ReplicationConfigurationProperty(replicationConfiguration))

    override fun throughputMode(throughputMode: String) {
      cdkBuilder.throughputMode(throughputMode)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnFileSystemProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.CfnFileSystemProps,
  ) : CdkObject(cdkObject), CfnFileSystemProps {
    override fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

    override fun backupPolicy(): Any? = unwrap(this).getBackupPolicy()

    override fun bypassPolicyLockoutSafetyCheck(): Any? =
        unwrap(this).getBypassPolicyLockoutSafetyCheck()

    override fun encrypted(): Any? = unwrap(this).getEncrypted()

    override fun fileSystemPolicy(): Any? = unwrap(this).getFileSystemPolicy()

    override fun fileSystemProtection(): Any? = unwrap(this).getFileSystemProtection()

    override fun fileSystemTags(): List<CfnFileSystem.ElasticFileSystemTagProperty> =
        unwrap(this).getFileSystemTags()?.map(CfnFileSystem.ElasticFileSystemTagProperty::wrap) ?:
        emptyList()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun lifecyclePolicies(): Any? = unwrap(this).getLifecyclePolicies()

    override fun performanceMode(): String? = unwrap(this).getPerformanceMode()

    override fun provisionedThroughputInMibps(): Number? =
        unwrap(this).getProvisionedThroughputInMibps()

    override fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

    override fun throughputMode(): String? = unwrap(this).getThroughputMode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystemProps):
        CfnFileSystemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFileSystemProps):
        software.amazon.awscdk.services.efs.CfnFileSystemProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.efs.CfnFileSystemProps
  }
}
