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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.AlarmBehavior
import software.amazon.awscdk.services.ecs.DeploymentAlarmConfig
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class DeploymentAlarmConfigDsl {
    private val cdkBuilder: DeploymentAlarmConfig.Builder = DeploymentAlarmConfig.builder()

    private val _alarmNames: MutableList<String> = mutableListOf()

    public fun alarmNames(vararg alarmNames: String) {
        _alarmNames.addAll(listOf(*alarmNames))
    }

    public fun alarmNames(alarmNames: Collection<String>) {
        _alarmNames.addAll(alarmNames)
    }

    public fun behavior(behavior: AlarmBehavior) {
        cdkBuilder.behavior(behavior)
    }

    public fun build(): DeploymentAlarmConfig {
        if (_alarmNames.isNotEmpty()) cdkBuilder.alarmNames(_alarmNames)
        return cdkBuilder.build()
    }
}
