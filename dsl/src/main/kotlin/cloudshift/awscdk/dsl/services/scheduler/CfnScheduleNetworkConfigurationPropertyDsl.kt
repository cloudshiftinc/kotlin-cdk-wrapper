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

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleNetworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnSchedule.NetworkConfigurationProperty.Builder =
        CfnSchedule.NetworkConfigurationProperty.builder()

    public fun awsvpcConfiguration(awsvpcConfiguration: IResolvable) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
    }

    public fun awsvpcConfiguration(awsvpcConfiguration: CfnSchedule.AwsVpcConfigurationProperty) {
        cdkBuilder.awsvpcConfiguration(awsvpcConfiguration)
    }

    public fun build(): CfnSchedule.NetworkConfigurationProperty = cdkBuilder.build()
}
