package io.cloudshiftdev.awscdk.services.neptune

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

public open class CfnDBCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.neptune.CfnDBCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  public open fun associatedRoles(`value`: IResolvable) {
    unwrap(this).setAssociatedRoles(`value`.let(IResolvable::unwrap))
  }

  public open fun associatedRoles(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssociatedRoles(__idx_ac66f0)
  }

  public open fun attrClusterResourceId(): String = unwrap(this).getAttrClusterResourceId()

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrPort(): String = unwrap(this).getAttrPort()

  public open fun attrReadEndpoint(): String = unwrap(this).getAttrReadEndpoint()

  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  public open fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  public open fun backupRetentionPeriod(`value`: Number) {
    unwrap(this).setBackupRetentionPeriod(`value`)
  }

  public open fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  public open fun copyTagsToSnapshot(`value`: Boolean) {
    unwrap(this).setCopyTagsToSnapshot(`value`)
  }

  public open fun copyTagsToSnapshot(`value`: IResolvable) {
    unwrap(this).setCopyTagsToSnapshot(`value`.let(IResolvable::unwrap))
  }

  public open fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  public open fun dbClusterParameterGroupName(): String? =
      unwrap(this).getDbClusterParameterGroupName()

  public open fun dbClusterParameterGroupName(`value`: String) {
    unwrap(this).setDbClusterParameterGroupName(`value`)
  }

  public open fun dbInstanceParameterGroupName(): String? =
      unwrap(this).getDbInstanceParameterGroupName()

  public open fun dbInstanceParameterGroupName(`value`: String) {
    unwrap(this).setDbInstanceParameterGroupName(`value`)
  }

  public open fun dbPort(): Number? = unwrap(this).getDbPort()

  public open fun dbPort(`value`: Number) {
    unwrap(this).setDbPort(`value`)
  }

  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  public open fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  public open fun enableCloudwatchLogsExports(`value`: List<String>) {
    unwrap(this).setEnableCloudwatchLogsExports(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public open fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

  public open fun iamAuthEnabled(`value`: Boolean) {
    unwrap(this).setIamAuthEnabled(`value`)
  }

  public open fun iamAuthEnabled(`value`: IResolvable) {
    unwrap(this).setIamAuthEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  public open fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  public open fun restoreToTime(`value`: String) {
    unwrap(this).setRestoreToTime(`value`)
  }

  public open fun restoreType(): String? = unwrap(this).getRestoreType()

  public open fun restoreType(`value`: String) {
    unwrap(this).setRestoreType(`value`)
  }

  public open fun serverlessScalingConfiguration(): Any? =
      unwrap(this).getServerlessScalingConfiguration()

  public open fun serverlessScalingConfiguration(`value`: IResolvable) {
    unwrap(this).setServerlessScalingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun serverlessScalingConfiguration(`value`: ServerlessScalingConfigurationProperty) {
    unwrap(this).setServerlessScalingConfiguration(`value`.let(ServerlessScalingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d43d13bdda8d7f79719335581a679872630140759c0103d4461a7c248ad47c02")
  public open
      fun serverlessScalingConfiguration(`value`: ServerlessScalingConfigurationProperty.Builder.() -> Unit):
      Unit = serverlessScalingConfiguration(ServerlessScalingConfigurationProperty(`value`))

  public open fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  public open fun snapshotIdentifier(`value`: String) {
    unwrap(this).setSnapshotIdentifier(`value`)
  }

  public open fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  public open fun sourceDbClusterIdentifier(`value`: String) {
    unwrap(this).setSourceDbClusterIdentifier(`value`)
  }

  public open fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  public open fun storageEncrypted(`value`: Boolean) {
    unwrap(this).setStorageEncrypted(`value`)
  }

  public open fun storageEncrypted(`value`: IResolvable) {
    unwrap(this).setStorageEncrypted(`value`.let(IResolvable::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  public open fun useLatestRestorableTime(`value`: Boolean) {
    unwrap(this).setUseLatestRestorableTime(`value`)
  }

  public open fun useLatestRestorableTime(`value`: IResolvable) {
    unwrap(this).setUseLatestRestorableTime(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public interface Builder {
    public fun associatedRoles(associatedRoles: IResolvable) {
    }

    public fun associatedRoles(associatedRoles: List<Any>) {
    }

    public fun availabilityZones(availabilityZones: List<String>) {
    }

    public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
    }

    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    }

    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    }

    public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
    }

    public fun dbPort(dbPort: Number) {
    }

    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    }

    public fun deletionProtection(deletionProtection: Boolean) {
    }

    public fun deletionProtection(deletionProtection: IResolvable) {
    }

    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun iamAuthEnabled(iamAuthEnabled: Boolean) {
    }

    public fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun preferredBackupWindow(preferredBackupWindow: String) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun restoreToTime(restoreToTime: String) {
    }

    public fun restoreType(restoreType: String) {
    }

    public fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable) {
    }

    public
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: ServerlessScalingConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dffaf2a7c8b4f9100c6045e32963db334bc3c1c23fe7e457d220ec2d45621d09")
    public
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: ServerlessScalingConfigurationProperty.Builder.() -> Unit) {
    }

    public fun snapshotIdentifier(snapshotIdentifier: String) {
    }

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    }

    public fun storageEncrypted(storageEncrypted: Boolean) {
    }

    public fun storageEncrypted(storageEncrypted: IResolvable) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
    }

    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
    }

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBCluster.Builder =
        software.amazon.awscdk.services.neptune.CfnDBCluster.Builder.create(scope, id)

    public override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    public override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    public override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    public override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    public override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    public override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    public override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    public override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    public override fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
      cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
    }

    public override fun dbPort(dbPort: Number) {
      cdkBuilder.dbPort(dbPort)
    }

    public override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    public override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    public override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun iamAuthEnabled(iamAuthEnabled: Boolean) {
      cdkBuilder.iamAuthEnabled(iamAuthEnabled)
    }

    public override fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
      cdkBuilder.iamAuthEnabled(iamAuthEnabled.let(IResolvable::unwrap))
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun restoreToTime(restoreToTime: String) {
      cdkBuilder.restoreToTime(restoreToTime)
    }

    public override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    public override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: ServerlessScalingConfigurationProperty) {
      cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration.let(ServerlessScalingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dffaf2a7c8b4f9100c6045e32963db334bc3c1c23fe7e457d220ec2d45621d09")
    public override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: ServerlessScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessScalingConfiguration(ServerlessScalingConfigurationProperty(serverlessScalingConfiguration))

    public override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    public override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    public override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    public override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    public override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    public override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBCluster): CfnDBCluster
        = CfnDBCluster(cdkObject)

    internal fun unwrap(wrapped: CfnDBCluster): software.amazon.awscdk.services.neptune.CfnDBCluster
        = wrapped.cdkObject
  }

  public interface DBClusterRoleProperty {
    public fun featureName(): String? = unwrap(this).getFeatureName()

    public fun roleArn(): String

    public interface Builder {
      public fun featureName(featureName: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty.Builder =
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty.builder()

      public override fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty,
    ) : DBClusterRoleProperty {
      public override fun featureName(): String? = unwrap(this).getFeatureName()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DBClusterRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty):
          DBClusterRoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DBClusterRoleProperty):
          software.amazon.awscdk.services.neptune.CfnDBCluster.DBClusterRoleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ServerlessScalingConfigurationProperty {
    public fun maxCapacity(): Number

    public fun minCapacity(): Number

    public interface Builder {
      public fun maxCapacity(maxCapacity: Number) {
      }

      public fun minCapacity(minCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty.builder()

      public override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      public override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty,
    ) : ServerlessScalingConfigurationProperty {
      public override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      public override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerlessScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty):
          ServerlessScalingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerlessScalingConfigurationProperty):
          software.amazon.awscdk.services.neptune.CfnDBCluster.ServerlessScalingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
