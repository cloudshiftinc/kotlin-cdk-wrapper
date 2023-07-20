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
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule
import kotlin.String

@CdkDslMarker
public class CfnMonitoringScheduleStatisticsResourcePropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.StatisticsResourceProperty.Builder =
        CfnMonitoringSchedule.StatisticsResourceProperty.builder()

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnMonitoringSchedule.StatisticsResourceProperty = cdkBuilder.build()
}
