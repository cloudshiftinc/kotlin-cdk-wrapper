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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetTriggerPropertyDsl {
    private val cdkBuilder: CfnDataset.TriggerProperty.Builder = CfnDataset.TriggerProperty.builder()

    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    public fun schedule(schedule: CfnDataset.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    public fun triggeringDataset(triggeringDataset: IResolvable) {
        cdkBuilder.triggeringDataset(triggeringDataset)
    }

    public fun triggeringDataset(triggeringDataset: CfnDataset.TriggeringDatasetProperty) {
        cdkBuilder.triggeringDataset(triggeringDataset)
    }

    public fun build(): CfnDataset.TriggerProperty = cdkBuilder.build()
}
