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
import kotlin.Boolean

@CdkDslMarker
public class CfnAlarmModelInitializationConfigurationPropertyDsl {
    private val cdkBuilder: CfnAlarmModel.InitializationConfigurationProperty.Builder =
        CfnAlarmModel.InitializationConfigurationProperty.builder()

    public fun disabledOnInitialization(disabledOnInitialization: Boolean) {
        cdkBuilder.disabledOnInitialization(disabledOnInitialization)
    }

    public fun disabledOnInitialization(disabledOnInitialization: IResolvable) {
        cdkBuilder.disabledOnInitialization(disabledOnInitialization)
    }

    public fun build(): CfnAlarmModel.InitializationConfigurationProperty = cdkBuilder.build()
}
