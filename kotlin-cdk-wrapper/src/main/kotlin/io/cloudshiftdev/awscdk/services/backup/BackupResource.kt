@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.dynamodb.ITable
import io.cloudshiftdev.awscdk.services.ec2.IInstance
import io.cloudshiftdev.awscdk.services.efs.IFileSystem
import io.cloudshiftdev.awscdk.services.rds.IDatabaseCluster
import io.cloudshiftdev.awscdk.services.rds.IDatabaseInstance
import io.cloudshiftdev.awscdk.services.rds.IServerlessCluster
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BackupResource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backup.BackupResource,
) : CdkObject(cdkObject) {
  public open fun construct(): CloudshiftdevConstructsConstruct? =
      unwrap(this).getConstruct()?.let(CloudshiftdevConstructsConstruct::wrap)

  public open fun resource(): String? = unwrap(this).getResource()

  public open fun tagCondition(): TagCondition? =
      unwrap(this).getTagCondition()?.let(TagCondition::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun key(key: String)

    public fun operation(operation: TagOperation)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    resource: String,
    construct: SoftwareConstructsConstruct,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupResource.Builder =
        software.amazon.awscdk.services.backup.BackupResource.Builder.create(resource, construct)

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun operation(operation: TagOperation) {
      cdkBuilder.operation(operation.let(TagOperation::unwrap))
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupResource = cdkBuilder.build()
  }

  public companion object {
    public fun fromArn(arn: String): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromArn(arn).let(BackupResource::wrap)

    public fun fromConstruct(construct: CloudshiftdevConstructsConstruct): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromConstruct(construct.let(CloudshiftdevConstructsConstruct::unwrap)).let(BackupResource::wrap)

    public fun fromDynamoDbTable(table: ITable): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromDynamoDbTable(table.let(ITable::unwrap)).let(BackupResource::wrap)

    public fun fromEc2Instance(instance: IInstance): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromEc2Instance(instance.let(IInstance::unwrap)).let(BackupResource::wrap)

    public fun fromEfsFileSystem(fileSystem: IFileSystem): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromEfsFileSystem(fileSystem.let(IFileSystem::unwrap)).let(BackupResource::wrap)

    public fun fromRdsDatabaseCluster(cluster: IDatabaseCluster): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromRdsDatabaseCluster(cluster.let(IDatabaseCluster::unwrap)).let(BackupResource::wrap)

    public fun fromRdsDatabaseInstance(instance: IDatabaseInstance): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromRdsDatabaseInstance(instance.let(IDatabaseInstance::unwrap)).let(BackupResource::wrap)

    public fun fromRdsServerlessCluster(cluster: IServerlessCluster): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromRdsServerlessCluster(cluster.let(IServerlessCluster::unwrap)).let(BackupResource::wrap)

    public fun fromTag(key: String, `value`: String): BackupResource =
        software.amazon.awscdk.services.backup.BackupResource.fromTag(key,
        `value`).let(BackupResource::wrap)

    public fun fromTag(
      key: String,
      `value`: String,
      operation: TagOperation,
    ): BackupResource = software.amazon.awscdk.services.backup.BackupResource.fromTag(key, `value`,
        operation.let(TagOperation::unwrap)).let(BackupResource::wrap)

    public operator fun invoke(
      resource: String,
      construct: CloudshiftdevConstructsConstruct,
      block: Builder.() -> Unit = {},
    ): BackupResource {
      val builderImpl = BuilderImpl(resource, CloudshiftdevConstructsConstruct.unwrap(construct))
      return BackupResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupResource):
        BackupResource = BackupResource(cdkObject)

    internal fun unwrap(wrapped: BackupResource):
        software.amazon.awscdk.services.backup.BackupResource = wrapped.cdkObject
  }
}
