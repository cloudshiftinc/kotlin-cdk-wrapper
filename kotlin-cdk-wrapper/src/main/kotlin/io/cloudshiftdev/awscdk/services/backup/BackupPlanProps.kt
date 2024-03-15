@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface BackupPlanProps {
  public fun backupPlanName(): String? = unwrap(this).getBackupPlanName()

  public fun backupPlanRules(): List<BackupPlanRule> =
      unwrap(this).getBackupPlanRules()?.map(BackupPlanRule::wrap) ?: emptyList()

  public fun backupVault(): IBackupVault? = unwrap(this).getBackupVault()?.let(IBackupVault::wrap)

  public fun windowsVss(): Boolean? = unwrap(this).getWindowsVss()

  @CdkDslMarker
  public interface Builder {
    public fun backupPlanName(backupPlanName: String)

    public fun backupPlanRules(backupPlanRules: List<BackupPlanRule>)

    public fun backupPlanRules(vararg backupPlanRules: BackupPlanRule)

    public fun backupVault(backupVault: IBackupVault)

    public fun windowsVss(windowsVss: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlanProps.Builder =
        software.amazon.awscdk.services.backup.BackupPlanProps.builder()

    override fun backupPlanName(backupPlanName: String) {
      cdkBuilder.backupPlanName(backupPlanName)
    }

    override fun backupPlanRules(backupPlanRules: List<BackupPlanRule>) {
      cdkBuilder.backupPlanRules(backupPlanRules.map(BackupPlanRule::unwrap))
    }

    override fun backupPlanRules(vararg backupPlanRules: BackupPlanRule): Unit =
        backupPlanRules(backupPlanRules.toList())

    override fun backupVault(backupVault: IBackupVault) {
      cdkBuilder.backupVault(backupVault.let(IBackupVault::unwrap))
    }

    override fun windowsVss(windowsVss: Boolean) {
      cdkBuilder.windowsVss(windowsVss)
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlanProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.BackupPlanProps,
  ) : CdkObject(cdkObject), BackupPlanProps {
    override fun backupPlanName(): String? = unwrap(this).getBackupPlanName()

    override fun backupPlanRules(): List<BackupPlanRule> =
        unwrap(this).getBackupPlanRules()?.map(BackupPlanRule::wrap) ?: emptyList()

    override fun backupVault(): IBackupVault? =
        unwrap(this).getBackupVault()?.let(IBackupVault::wrap)

    override fun windowsVss(): Boolean? = unwrap(this).getWindowsVss()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlanProps):
        BackupPlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupPlanProps):
        software.amazon.awscdk.services.backup.BackupPlanProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.backup.BackupPlanProps
  }
}
