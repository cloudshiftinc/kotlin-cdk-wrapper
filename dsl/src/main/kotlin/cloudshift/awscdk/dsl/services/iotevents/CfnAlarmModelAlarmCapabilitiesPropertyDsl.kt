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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAlarmCapabilitiesPropertyDsl {
    private val cdkBuilder: CfnAlarmModel.AlarmCapabilitiesProperty.Builder =
        CfnAlarmModel.AlarmCapabilitiesProperty.builder()

    public fun acknowledgeFlow(acknowledgeFlow: IResolvable) {
        cdkBuilder.acknowledgeFlow(acknowledgeFlow)
    }

    public fun acknowledgeFlow(acknowledgeFlow: CfnAlarmModel.AcknowledgeFlowProperty) {
        cdkBuilder.acknowledgeFlow(acknowledgeFlow)
    }

    public fun initializationConfiguration(initializationConfiguration: IResolvable) {
        cdkBuilder.initializationConfiguration(initializationConfiguration)
    }

    public fun initializationConfiguration(initializationConfiguration: CfnAlarmModel.InitializationConfigurationProperty) {
        cdkBuilder.initializationConfiguration(initializationConfiguration)
    }

    public fun build(): CfnAlarmModel.AlarmCapabilitiesProperty = cdkBuilder.build()
}
