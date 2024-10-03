@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a BackupPlan.
 *
 * Example:
 *
 * ```
 * BackupPlan plan = BackupPlan.Builder.create(this, "Plan")
 * .windowsVss(true)
 * .build();
 * ```
 */
public interface BackupPlanProps {
  /**
   * The display name of the backup plan.
   *
   * Default: - A CDK generated name
   */
  public fun backupPlanName(): String? = unwrap(this).getBackupPlanName()

  /**
   * Rules for the backup plan.
   *
   * Use `addRule()` to add rules after
   * instantiation.
   *
   * Default: - use `addRule()` to add rules
   */
  public fun backupPlanRules(): List<BackupPlanRule> =
      unwrap(this).getBackupPlanRules()?.map(BackupPlanRule::wrap) ?: emptyList()

  /**
   * The backup vault where backups are stored.
   *
   * Default: - use the vault defined at the rule level. If not defined a new
   * common vault for the plan will be created
   */
  public fun backupVault(): IBackupVault? = unwrap(this).getBackupVault()?.let(IBackupVault::wrap)

  /**
   * Enable Windows VSS backup.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html)
   */
  public fun windowsVss(): Boolean? = unwrap(this).getWindowsVss()

  /**
   * A builder for [BackupPlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupPlanName The display name of the backup plan.
     */
    public fun backupPlanName(backupPlanName: String)

    /**
     * @param backupPlanRules Rules for the backup plan.
     * Use `addRule()` to add rules after
     * instantiation.
     */
    public fun backupPlanRules(backupPlanRules: List<BackupPlanRule>)

    /**
     * @param backupPlanRules Rules for the backup plan.
     * Use `addRule()` to add rules after
     * instantiation.
     */
    public fun backupPlanRules(vararg backupPlanRules: BackupPlanRule)

    /**
     * @param backupVault The backup vault where backups are stored.
     */
    public fun backupVault(backupVault: IBackupVault)

    /**
     * @param windowsVss Enable Windows VSS backup.
     */
    public fun windowsVss(windowsVss: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlanProps.Builder =
        software.amazon.awscdk.services.backup.BackupPlanProps.builder()

    /**
     * @param backupPlanName The display name of the backup plan.
     */
    override fun backupPlanName(backupPlanName: String) {
      cdkBuilder.backupPlanName(backupPlanName)
    }

    /**
     * @param backupPlanRules Rules for the backup plan.
     * Use `addRule()` to add rules after
     * instantiation.
     */
    override fun backupPlanRules(backupPlanRules: List<BackupPlanRule>) {
      cdkBuilder.backupPlanRules(backupPlanRules.map(BackupPlanRule.Companion::unwrap))
    }

    /**
     * @param backupPlanRules Rules for the backup plan.
     * Use `addRule()` to add rules after
     * instantiation.
     */
    override fun backupPlanRules(vararg backupPlanRules: BackupPlanRule): Unit =
        backupPlanRules(backupPlanRules.toList())

    /**
     * @param backupVault The backup vault where backups are stored.
     */
    override fun backupVault(backupVault: IBackupVault) {
      cdkBuilder.backupVault(backupVault.let(IBackupVault.Companion::unwrap))
    }

    /**
     * @param windowsVss Enable Windows VSS backup.
     */
    override fun windowsVss(windowsVss: Boolean) {
      cdkBuilder.windowsVss(windowsVss)
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlanProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.BackupPlanProps,
  ) : CdkObject(cdkObject),
      BackupPlanProps {
    /**
     * The display name of the backup plan.
     *
     * Default: - A CDK generated name
     */
    override fun backupPlanName(): String? = unwrap(this).getBackupPlanName()

    /**
     * Rules for the backup plan.
     *
     * Use `addRule()` to add rules after
     * instantiation.
     *
     * Default: - use `addRule()` to add rules
     */
    override fun backupPlanRules(): List<BackupPlanRule> =
        unwrap(this).getBackupPlanRules()?.map(BackupPlanRule::wrap) ?: emptyList()

    /**
     * The backup vault where backups are stored.
     *
     * Default: - use the vault defined at the rule level. If not defined a new
     * common vault for the plan will be created
     */
    override fun backupVault(): IBackupVault? =
        unwrap(this).getBackupVault()?.let(IBackupVault::wrap)

    /**
     * Enable Windows VSS backup.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html)
     */
    override fun windowsVss(): Boolean? = unwrap(this).getWindowsVss()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlanProps):
        BackupPlanProps = CdkObjectWrappers.wrap(cdkObject) as? BackupPlanProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupPlanProps):
        software.amazon.awscdk.services.backup.BackupPlanProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.backup.BackupPlanProps
  }
}
