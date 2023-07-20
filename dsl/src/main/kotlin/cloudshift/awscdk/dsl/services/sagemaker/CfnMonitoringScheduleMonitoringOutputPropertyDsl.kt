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

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringOutputPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.MonitoringOutputProperty.Builder =
        CfnMonitoringSchedule.MonitoringOutputProperty.builder()

    public fun s3Output(s3Output: IResolvable) {
        cdkBuilder.s3Output(s3Output)
    }

    public fun s3Output(s3Output: CfnMonitoringSchedule.S3OutputProperty) {
        cdkBuilder.s3Output(s3Output)
    }

    public fun build(): CfnMonitoringSchedule.MonitoringOutputProperty = cdkBuilder.build()
}
