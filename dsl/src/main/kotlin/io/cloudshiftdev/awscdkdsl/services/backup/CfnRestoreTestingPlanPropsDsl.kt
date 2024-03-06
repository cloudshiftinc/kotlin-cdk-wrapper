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
import software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps

/**
 * Properties for defining a `CfnRestoreTestingPlan`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
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
public class CfnRestoreTestingPlanPropsDsl {
    private val cdkBuilder: CfnRestoreTestingPlanProps.Builder =
        CfnRestoreTestingPlanProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     *   recovery point types or backup vaults.
     */
    public fun recoveryPointSelection(recoveryPointSelection: IResolvable) {
        cdkBuilder.recoveryPointSelection(recoveryPointSelection)
    }

    /**
     * @param recoveryPointSelection The specified criteria to assign a set of resources, such as
     *   recovery point types or backup vaults.
     */
    public fun recoveryPointSelection(
        recoveryPointSelection: CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty
    ) {
        cdkBuilder.recoveryPointSelection(recoveryPointSelection)
    }

    /** @param restoreTestingPlanName This is the restore testing plan name. */
    public fun restoreTestingPlanName(restoreTestingPlanName: String) {
        cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    /**
     * @param scheduleExpression A CRON expression in specified timezone when a restore testing plan
     *   is executed.
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param scheduleExpressionTimezone Optional. This is the timezone in which the schedule
     *   expression is set. By default, ScheduleExpressions are in UTC. You can modify this to a
     *   specified timezone.
     */
    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
        cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    /**
     * @param startWindowHours Defaults to 24 hours. A value in hours after a restore test is
     *   scheduled before a job will be canceled if it doesn't start successfully. This value is
     *   optional. If this value is included, this parameter has a maximum value of 168 hours (one
     *   week).
     */
    public fun startWindowHours(startWindowHours: Number) {
        cdkBuilder.startWindowHours(startWindowHours)
    }

    /** @param tags the value to be set. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags the value to be set. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRestoreTestingPlanProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
