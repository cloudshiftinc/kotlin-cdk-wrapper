@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnRestoreTestingPlan
import software.constructs.Construct

/**
 * This is the first of two steps to create a restore testing plan;
 *
 * once this request is successful, finish the procedure with request CreateRestoreTestingSelection.
 *
 * You must include the parameter RestoreTestingPlan. You may optionally include CreatorRequestId
 * and Tags.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * CfnRestoreTestingPlan cfnRestoreTestingPlan = CfnRestoreTestingPlan.Builder.create(this,
 * "MyCfnRestoreTestingPlan")
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
@CdkDslMarker
public class CfnRestoreTestingPlanDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRestoreTestingPlan.Builder =
        CfnRestoreTestingPlan.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     *
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     *   recovery point types or backup vaults.
     */
    public fun recoveryPointSelection(recoveryPointSelection: IResolvable) {
        cdkBuilder.recoveryPointSelection(recoveryPointSelection)
    }

    /**
     * The specified criteria to assign a set of resources, such as recovery point types or backup
     * vaults.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-recoverypointselection)
     *
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     *   recovery point types or backup vaults.
     */
    public fun recoveryPointSelection(
        recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty
    ) {
        cdkBuilder.recoveryPointSelection(recoveryPointSelection)
    }

    /**
     * This is the restore testing plan name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-restoretestingplanname)
     *
     * @param restoreTestingPlanName This is the restore testing plan name.
     */
    public fun restoreTestingPlanName(restoreTestingPlanName: String) {
        cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    /**
     * A CRON expression in specified timezone when a restore testing plan is executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpression)
     *
     * @param scheduleExpression A CRON expression in specified timezone when a restore testing plan
     *   is executed.
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * Optional.
     *
     * This is the timezone in which the schedule expression is set. By default, ScheduleExpressions
     * are in UTC. You can modify this to a specified timezone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-scheduleexpressiontimezone)
     *
     * @param scheduleExpressionTimezone Optional.
     */
    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
        cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    /**
     * Defaults to 24 hours.
     *
     * A value in hours after a restore test is scheduled before a job will be canceled if it
     * doesn't start successfully. This value is optional. If this value is included, this parameter
     * has a maximum value of 168 hours (one week).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-startwindowhours)
     *
     * @param startWindowHours Defaults to 24 hours.
     */
    public fun startWindowHours(startWindowHours: Number) {
        cdkBuilder.startWindowHours(startWindowHours)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-tags)
     *
     * @param tags
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-restoretestingplan.html#cfn-backup-restoretestingplan-tags)
     *
     * @param tags
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRestoreTestingPlan {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
