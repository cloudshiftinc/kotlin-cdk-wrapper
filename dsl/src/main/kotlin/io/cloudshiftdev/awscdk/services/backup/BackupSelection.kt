package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BackupSelection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.BackupSelection,
) : Resource(cdkObject), IGrantable {
  public open fun backupPlanId(): String = unwrap(this).getBackupPlanId()

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun selectionId(): String = unwrap(this).getSelectionId()

  public interface Builder {
    public fun allowRestores(allowRestores: Boolean)

    public fun backupPlan(backupPlan: IBackupPlan)

    public fun backupSelectionName(backupSelectionName: String)

    public fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean)

    public fun resources(resources: List<BackupResource>)

    public fun role(role: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupSelection.Builder =
        software.amazon.awscdk.services.backup.BackupSelection.Builder.create(scope, id)

    override fun allowRestores(allowRestores: Boolean) {
      cdkBuilder.allowRestores(allowRestores)
    }

    override fun backupPlan(backupPlan: IBackupPlan) {
      cdkBuilder.backupPlan(backupPlan.let(IBackupPlan::unwrap))
    }

    override fun backupSelectionName(backupSelectionName: String) {
      cdkBuilder.backupSelectionName(backupSelectionName)
    }

    override fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean) {
      cdkBuilder.disableDefaultBackupPolicy(disableDefaultBackupPolicy)
    }

    override fun resources(resources: List<BackupResource>) {
      cdkBuilder.resources(resources.map(BackupResource::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupSelection = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BackupSelection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BackupSelection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupSelection):
        BackupSelection = BackupSelection(cdkObject)

    internal fun unwrap(wrapped: BackupSelection):
        software.amazon.awscdk.services.backup.BackupSelection = wrapped.cdkObject
  }
}
