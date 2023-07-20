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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import kotlin.Boolean

@CdkDslMarker
public class CfnMonitoringScheduleDatasetFormatPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.DatasetFormatProperty.Builder =
        CfnMonitoringSchedule.DatasetFormatProperty.builder()

    public fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv)
    }

    public fun csv(csv: CfnMonitoringSchedule.CsvProperty) {
        cdkBuilder.csv(csv)
    }

    public fun json(json: IResolvable) {
        cdkBuilder.json(json)
    }

    public fun json(json: CfnMonitoringSchedule.JsonProperty) {
        cdkBuilder.json(json)
    }

    public fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
    }

    public fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet)
    }

    public fun build(): CfnMonitoringSchedule.DatasetFormatProperty = cdkBuilder.build()
}
