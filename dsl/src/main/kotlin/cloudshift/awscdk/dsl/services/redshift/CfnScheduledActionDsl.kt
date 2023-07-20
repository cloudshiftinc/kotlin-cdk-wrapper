@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnScheduledAction
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnScheduledActionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnScheduledAction.Builder = CfnScheduledAction.Builder.create(scope, id)

    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    public fun iamRole(iamRole: String) {
        cdkBuilder.iamRole(iamRole)
    }

    public fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
    }

    public fun scheduledActionDescription(scheduledActionDescription: String) {
        cdkBuilder.scheduledActionDescription(scheduledActionDescription)
    }

    public fun scheduledActionName(scheduledActionName: String) {
        cdkBuilder.scheduledActionName(scheduledActionName)
    }

    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun targetAction(targetAction: IResolvable) {
        cdkBuilder.targetAction(targetAction)
    }

    public fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty) {
        cdkBuilder.targetAction(targetAction)
    }

    public fun build(): CfnScheduledAction = cdkBuilder.build()
}
