@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface BackupSelectionProps : BackupSelectionOptions {
  public fun backupPlan(): IBackupPlan

  @CdkDslMarker
  public interface Builder {
    public fun allowRestores(allowRestores: Boolean)

    public fun backupPlan(backupPlan: IBackupPlan)

    public fun backupSelectionName(backupSelectionName: String)

    public fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean)

    public fun resources(resources: List<BackupResource>)

    public fun resources(vararg resources: BackupResource)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupSelectionProps.Builder =
        software.amazon.awscdk.services.backup.BackupSelectionProps.builder()

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

    override fun resources(vararg resources: BackupResource): Unit = resources(resources.toList())

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupSelectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.BackupSelectionProps,
  ) : CdkObject(cdkObject), BackupSelectionProps {
    override fun allowRestores(): Boolean? = unwrap(this).getAllowRestores()

    override fun backupPlan(): IBackupPlan = unwrap(this).getBackupPlan().let(IBackupPlan::wrap)

    override fun backupSelectionName(): String? = unwrap(this).getBackupSelectionName()

    override fun disableDefaultBackupPolicy(): Boolean? =
        unwrap(this).getDisableDefaultBackupPolicy()

    override fun resources(): List<BackupResource> =
        unwrap(this).getResources().map(BackupResource::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupSelectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupSelectionProps):
        BackupSelectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupSelectionProps):
        software.amazon.awscdk.services.backup.BackupSelectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.BackupSelectionProps
  }
}
