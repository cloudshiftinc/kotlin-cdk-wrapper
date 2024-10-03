@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRestoreTestingPlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.backup.*;
 * CfnRestoreTestingPlanProps cfnRestoreTestingPlanProps = CfnRestoreTestingPlanProps.builder()
 * .recoveryPointSelection(RestoreTestingRecoveryPointSelectionProperty.builder()
 * .algorithm("algorithm")
 * .includeVaults(List.of("includeVaults"))
 * .recoveryPointTypes(List.of("recoveryPointTypes"))
 * // the properties below are optional
 * .excludeVaults(List.of("excludeVaults"))
 * .selectionWindowDays(123)
 * .build())
 * .restoreTestingPlanName("restoreTestingPlanName")
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .scheduleExpressionTimezone("scheduleExpressionTimezone")
 * .scheduleStatus("scheduleStatus")
 * .startWindowHours(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html)
 */
public interface CfnRestoreTestingPlanProps {
  /**
   * The specified criteria to assign a set of resources, such as recovery point types or backup
   * vaults.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
   */
  public fun recoveryPointSelection(): Any

  /**
   * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
   *
   * This cannot be changed after creation, and it must consist of only alphanumeric characters and
   * underscores.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-restoretestingplanname)
   */
  public fun restoreTestingPlanName(): String

  /**
   * A CRON expression in specified timezone when a restore testing plan is executed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpression)
   */
  public fun scheduleExpression(): String

  /**
   * Optional.
   *
   * This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
   * are in UTC. You can modify this to a specified timezone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpressiontimezone)
   */
  public fun scheduleExpressionTimezone(): String? = unwrap(this).getScheduleExpressionTimezone()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-schedulestatus)
   */
  public fun scheduleStatus(): String? = unwrap(this).getScheduleStatus()

  /**
   * Defaults to 24 hours.
   *
   * A value in hours after a restore test is scheduled before a job will be canceled if it doesn't
   * start successfully. This value is optional. If this value is included, this parameter has a
   * maximum value of 168 hours (one week).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-startwindowhours)
   */
  public fun startWindowHours(): Number? = unwrap(this).getStartWindowHours()

  /**
   * Optional tags to include.
   *
   * A tag is a key-value pair you can use to manage, filter, and search for your resources. Allowed
   * characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = . _ : /.`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRestoreTestingPlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    public fun recoveryPointSelection(recoveryPointSelection: IResolvable)

    /**
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    public
        fun recoveryPointSelection(recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty)

    /**
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9dfacce4f113115aecc49d0f94c42403daeef0c7c18e63ee5fb771523a009c8a")
    public
        fun recoveryPointSelection(recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit)

    /**
     * @param restoreTestingPlanName The RestoreTestingPlanName is a unique string that is the name
     * of the restore testing plan. 
     * This cannot be changed after creation, and it must consist of only alphanumeric characters
     * and underscores.
     */
    public fun restoreTestingPlanName(restoreTestingPlanName: String)

    /**
     * @param scheduleExpression A CRON expression in specified timezone when a restore testing plan
     * is executed. 
     */
    public fun scheduleExpression(scheduleExpression: String)

    /**
     * @param scheduleExpressionTimezone Optional.
     * This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     * are in UTC. You can modify this to a specified timezone.
     */
    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

    /**
     * @param scheduleStatus the value to be set.
     */
    public fun scheduleStatus(scheduleStatus: String)

    /**
     * @param startWindowHours Defaults to 24 hours.
     * A value in hours after a restore test is scheduled before a job will be canceled if it
     * doesn't start successfully. This value is optional. If this value is included, this parameter
     * has a maximum value of 168 hours (one week).
     */
    public fun startWindowHours(startWindowHours: Number)

    /**
     * @param tags Optional tags to include.
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional tags to include.
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps.Builder =
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps.builder()

    /**
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    override fun recoveryPointSelection(recoveryPointSelection: IResolvable) {
      cdkBuilder.recoveryPointSelection(recoveryPointSelection.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    override
        fun recoveryPointSelection(recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty) {
      cdkBuilder.recoveryPointSelection(recoveryPointSelection.let(CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.Companion::unwrap))
    }

    /**
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     * recovery point types or backup vaults. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9dfacce4f113115aecc49d0f94c42403daeef0c7c18e63ee5fb771523a009c8a")
    override
        fun recoveryPointSelection(recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit):
        Unit =
        recoveryPointSelection(CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty(recoveryPointSelection))

    /**
     * @param restoreTestingPlanName The RestoreTestingPlanName is a unique string that is the name
     * of the restore testing plan. 
     * This cannot be changed after creation, and it must consist of only alphanumeric characters
     * and underscores.
     */
    override fun restoreTestingPlanName(restoreTestingPlanName: String) {
      cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    /**
     * @param scheduleExpression A CRON expression in specified timezone when a restore testing plan
     * is executed. 
     */
    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param scheduleExpressionTimezone Optional.
     * This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     * are in UTC. You can modify this to a specified timezone.
     */
    override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
      cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    /**
     * @param scheduleStatus the value to be set.
     */
    override fun scheduleStatus(scheduleStatus: String) {
      cdkBuilder.scheduleStatus(scheduleStatus)
    }

    /**
     * @param startWindowHours Defaults to 24 hours.
     * A value in hours after a restore test is scheduled before a job will be canceled if it
     * doesn't start successfully. This value is optional. If this value is included, this parameter
     * has a maximum value of 168 hours (one week).
     */
    override fun startWindowHours(startWindowHours: Number) {
      cdkBuilder.startWindowHours(startWindowHours)
    }

    /**
     * @param tags Optional tags to include.
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Optional tags to include.
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps,
  ) : CdkObject(cdkObject),
      CfnRestoreTestingPlanProps {
    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     */
    override fun recoveryPointSelection(): Any = unwrap(this).getRecoveryPointSelection()

    /**
     * The RestoreTestingPlanName is a unique string that is the name of the restore testing plan.
     *
     * This cannot be changed after creation, and it must consist of only alphanumeric characters
     * and underscores.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-restoretestingplanname)
     */
    override fun restoreTestingPlanName(): String = unwrap(this).getRestoreTestingPlanName()

    /**
     * A CRON expression in specified timezone when a restore testing plan is executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpression)
     */
    override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

    /**
     * Optional.
     *
     * This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     * are in UTC. You can modify this to a specified timezone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpressiontimezone)
     */
    override fun scheduleExpressionTimezone(): String? =
        unwrap(this).getScheduleExpressionTimezone()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-schedulestatus)
     */
    override fun scheduleStatus(): String? = unwrap(this).getScheduleStatus()

    /**
     * Defaults to 24 hours.
     *
     * A value in hours after a restore test is scheduled before a job will be canceled if it
     * doesn't start successfully. This value is optional. If this value is included, this parameter
     * has a maximum value of 168 hours (one week).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-startwindowhours)
     */
    override fun startWindowHours(): Number? = unwrap(this).getStartWindowHours()

    /**
     * Optional tags to include.
     *
     * A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters,numbers, spaces, and the following characters: `+ - = .
     * _ : /.`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRestoreTestingPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps):
        CfnRestoreTestingPlanProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRestoreTestingPlanProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRestoreTestingPlanProps):
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps
  }
}
