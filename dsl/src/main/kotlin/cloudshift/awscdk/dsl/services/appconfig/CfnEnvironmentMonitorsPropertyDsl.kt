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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import kotlin.String

@CdkDslMarker
public class CfnEnvironmentMonitorsPropertyDsl {
    private val cdkBuilder: CfnEnvironment.MonitorsProperty.Builder =
        CfnEnvironment.MonitorsProperty.builder()

    public fun alarmArn(alarmArn: String) {
        cdkBuilder.alarmArn(alarmArn)
    }

    public fun alarmRoleArn(alarmRoleArn: String) {
        cdkBuilder.alarmRoleArn(alarmRoleArn)
    }

    public fun build(): CfnEnvironment.MonitorsProperty = cdkBuilder.build()
}
