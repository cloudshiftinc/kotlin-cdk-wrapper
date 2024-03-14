package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BackupPlan internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backup.BackupPlan,
) : Resource(cdkObject), IBackupPlan {
  /**
   * Adds a rule to a plan.
   *
   * @param rule the rule to add. 
   */
  public open fun addRule(rule: BackupPlanRule) {
    unwrap(this).addRule(rule.let(BackupPlanRule::unwrap))
  }

  /**
   * Adds a rule to a plan.
   *
   * @param rule the rule to add. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c354ff819768ecabe537b12fda4ef307f79765659c6aae1dd84f9fff2e13303f")
  public open fun addRule(rule: BackupPlanRule.Builder.() -> Unit): Unit =
      addRule(BackupPlanRule(rule))

  /**
   * Adds a selection to this plan.
   *
   * @param id 
   * @param options 
   */
  public open fun addSelection(id: String, options: BackupSelectionOptions): BackupSelection =
      unwrap(this).addSelection(id,
      options.let(BackupSelectionOptions::unwrap)).let(BackupSelection::wrap)

  /**
   * Adds a selection to this plan.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("761dd5018d2791efcf16aed3c704577639e35f4f46b7e64524b11092bab5b5cf")
  public open fun addSelection(id: String, options: BackupSelectionOptions.Builder.() -> Unit):
      BackupSelection = addSelection(id, BackupSelectionOptions(options))

  /**
   * The ARN of the backup plan.
   */
  public open fun backupPlanArn(): String = unwrap(this).getBackupPlanArn()

  /**
   * The identifier of the backup plan.
   */
  public override fun backupPlanId(): String = unwrap(this).getBackupPlanId()

  /**
   * The backup vault where backups are stored if not defined at the rule level.
   */
  public open fun backupVault(): IBackupVault =
      unwrap(this).getBackupVault().let(IBackupVault::wrap)

  /**
   * Version Id.
   */
  public open fun versionId(): String = unwrap(this).getVersionId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.BackupPlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The display name of the backup plan.
     *
     * Default: - A CDK generated name
     *
     * @param backupPlanName The display name of the backup plan. 
     */
    public fun backupPlanName(backupPlanName: String)

    /**
     * Rules for the backup plan.
     *
     * Use `addRule()` to add rules after
     * instantiation.
     *
     * Default: - use `addRule()` to add rules
     *
     * @param backupPlanRules Rules for the backup plan. 
     */
    public fun backupPlanRules(backupPlanRules: List<BackupPlanRule>)

    /**
     * Rules for the backup plan.
     *
     * Use `addRule()` to add rules after
     * instantiation.
     *
     * Default: - use `addRule()` to add rules
     *
     * @param backupPlanRules Rules for the backup plan. 
     */
    public fun backupPlanRules(vararg backupPlanRules: BackupPlanRule)

    /**
     * The backup vault where backups are stored.
     *
     * Default: - use the vault defined at the rule level. If not defined a new
     * common vault for the plan will be created
     *
     * @param backupVault The backup vault where backups are stored. 
     */
    public fun backupVault(backupVault: IBackupVault)

    /**
     * Enable Windows VSS backup.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html)
     * @param windowsVss Enable Windows VSS backup. 
     */
    public fun windowsVss(windowsVss: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlan.Builder =
        software.amazon.awscdk.services.backup.BackupPlan.Builder.create(scope, id)

    /**
     * The display name of the backup plan.
     *
     * Default: - A CDK generated name
     *
     * @param backupPlanName The display name of the backup plan. 
     */
    override fun backupPlanName(backupPlanName: String) {
      cdkBuilder.backupPlanName(backupPlanName)
    }

    /**
     * Rules for the backup plan.
     *
     * Use `addRule()` to add rules after
     * instantiation.
     *
     * Default: - use `addRule()` to add rules
     *
     * @param backupPlanRules Rules for the backup plan. 
     */
    override fun backupPlanRules(backupPlanRules: List<BackupPlanRule>) {
      cdkBuilder.backupPlanRules(backupPlanRules.map(BackupPlanRule::unwrap))
    }

    /**
     * Rules for the backup plan.
     *
     * Use `addRule()` to add rules after
     * instantiation.
     *
     * Default: - use `addRule()` to add rules
     *
     * @param backupPlanRules Rules for the backup plan. 
     */
    override fun backupPlanRules(vararg backupPlanRules: BackupPlanRule): Unit =
        backupPlanRules(backupPlanRules.toList())

    /**
     * The backup vault where backups are stored.
     *
     * Default: - use the vault defined at the rule level. If not defined a new
     * common vault for the plan will be created
     *
     * @param backupVault The backup vault where backups are stored. 
     */
    override fun backupVault(backupVault: IBackupVault) {
      cdkBuilder.backupVault(backupVault.let(IBackupVault::unwrap))
    }

    /**
     * Enable Windows VSS backup.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/aws-backup/latest/devguide/windows-backups.html)
     * @param windowsVss Enable Windows VSS backup. 
     */
    override fun windowsVss(windowsVss: Boolean) {
      cdkBuilder.windowsVss(windowsVss)
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlan = cdkBuilder.build()
  }

  public companion object {
    public fun daily35DayRetention(scope: CloudshiftdevConstructsConstruct, id: String): BackupPlan
        =
        software.amazon.awscdk.services.backup.BackupPlan.daily35DayRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(BackupPlan::wrap)

    public fun daily35DayRetention(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVault: IBackupVault,
    ): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.daily35DayRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVault.let(IBackupVault::unwrap)).let(BackupPlan::wrap)

    public fun dailyMonthly1YearRetention(scope: CloudshiftdevConstructsConstruct, id: String):
        BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyMonthly1YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(BackupPlan::wrap)

    public fun dailyMonthly1YearRetention(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVault: IBackupVault,
    ): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyMonthly1YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVault.let(IBackupVault::unwrap)).let(BackupPlan::wrap)

    public fun dailyWeeklyMonthly5YearRetention(scope: CloudshiftdevConstructsConstruct,
        id: String): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyWeeklyMonthly5YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(BackupPlan::wrap)

    public fun dailyWeeklyMonthly5YearRetention(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVault: IBackupVault,
    ): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyWeeklyMonthly5YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVault.let(IBackupVault::unwrap)).let(BackupPlan::wrap)

    public fun dailyWeeklyMonthly7YearRetention(scope: CloudshiftdevConstructsConstruct,
        id: String): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyWeeklyMonthly7YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(BackupPlan::wrap)

    public fun dailyWeeklyMonthly7YearRetention(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVault: IBackupVault,
    ): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyWeeklyMonthly7YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVault.let(IBackupVault::unwrap)).let(BackupPlan::wrap)

    public fun fromBackupPlanId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupPlanId: String,
    ): IBackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.fromBackupPlanId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupPlanId).let(IBackupPlan::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BackupPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BackupPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlan): BackupPlan =
        BackupPlan(cdkObject)

    internal fun unwrap(wrapped: BackupPlan): software.amazon.awscdk.services.backup.BackupPlan =
        wrapped.cdkObject
  }
}
