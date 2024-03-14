package io.cloudshiftdev.awscdk.services.docdb

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
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.docdb.CfnDBCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrClusterResourceId(): String = unwrap(this).getAttrClusterResourceId()

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrId(): String = unwrap(this).getAttrId()

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

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public open fun masterUserPassword(`value`: String) {
    unwrap(this).setMasterUserPassword(`value`)
  }

  public open fun masterUsername(): String? = unwrap(this).getMasterUsername()

  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
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

  public open fun storageType(): String? = unwrap(this).getStorageType()

  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
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
    public fun availabilityZones(availabilityZones: List<String>)

    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    public fun engineVersion(engineVersion: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun masterUserPassword(masterUserPassword: String)

    public fun masterUsername(masterUsername: String)

    public fun port(port: Number)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun restoreToTime(restoreToTime: String)

    public fun restoreType(restoreType: String)

    public fun snapshotIdentifier(snapshotIdentifier: String)

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun storageEncrypted(storageEncrypted: IResolvable)

    public fun storageType(storageType: String)

    public fun tags(tags: List<CfnTag>)

    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBCluster.Builder =
        software.amazon.awscdk.services.docdb.CfnDBCluster.Builder.create(scope, id)

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun restoreToTime(restoreToTime: String) {
      cdkBuilder.restoreToTime(restoreToTime)
    }

    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBCluster = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBCluster): CfnDBCluster =
        CfnDBCluster(cdkObject)

    internal fun unwrap(wrapped: CfnDBCluster): software.amazon.awscdk.services.docdb.CfnDBCluster =
        wrapped.cdkObject
  }
}
