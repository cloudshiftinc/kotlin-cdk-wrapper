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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnRefreshScheduleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRefreshSchedule.Builder = CfnRefreshSchedule.Builder.create(scope, id)

    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    public fun dataSetId(dataSetId: String) {
        cdkBuilder.dataSetId(dataSetId)
    }

    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    public fun schedule(schedule: CfnRefreshSchedule.RefreshScheduleMapProperty) {
        cdkBuilder.schedule(schedule)
    }

    public fun build(): CfnRefreshSchedule = cdkBuilder.build()
}
