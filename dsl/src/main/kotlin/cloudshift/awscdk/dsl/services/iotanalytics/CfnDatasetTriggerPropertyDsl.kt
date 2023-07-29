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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * The "DatasetTrigger" that specifies when the data set is automatically updated.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * TriggerProperty triggerProperty = TriggerProperty.builder()
 * .schedule(ScheduleProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * .build())
 * .triggeringDataset(TriggeringDatasetProperty.builder()
 * .datasetName("datasetName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-trigger.html)
 */
@CdkDslMarker
public class CfnDatasetTriggerPropertyDsl {
    private val cdkBuilder: CfnDataset.TriggerProperty.Builder =
        CfnDataset.TriggerProperty.builder()

    /** @param schedule The "Schedule" when the trigger is initiated. */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /** @param schedule The "Schedule" when the trigger is initiated. */
    public fun schedule(schedule: CfnDataset.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param triggeringDataset Information about the data set whose content generation triggers the
     *   new data set content generation.
     */
    public fun triggeringDataset(triggeringDataset: IResolvable) {
        cdkBuilder.triggeringDataset(triggeringDataset)
    }

    /**
     * @param triggeringDataset Information about the data set whose content generation triggers the
     *   new data set content generation.
     */
    public fun triggeringDataset(triggeringDataset: CfnDataset.TriggeringDatasetProperty) {
        cdkBuilder.triggeringDataset(triggeringDataset)
    }

    public fun build(): CfnDataset.TriggerProperty = cdkBuilder.build()
}
