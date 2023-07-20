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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceDeploymentAlarmsPropertyDsl {
    private val cdkBuilder: CfnService.DeploymentAlarmsProperty.Builder =
        CfnService.DeploymentAlarmsProperty.builder()

    private val _alarmNames: MutableList<String> = mutableListOf()

    public fun alarmNames(vararg alarmNames: String) {
        _alarmNames.addAll(listOf(*alarmNames))
    }

    public fun alarmNames(alarmNames: Collection<String>) {
        _alarmNames.addAll(alarmNames)
    }

    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    public fun rollback(rollback: Boolean) {
        cdkBuilder.rollback(rollback)
    }

    public fun rollback(rollback: IResolvable) {
        cdkBuilder.rollback(rollback)
    }

    public fun build(): CfnService.DeploymentAlarmsProperty {
        if (_alarmNames.isNotEmpty()) cdkBuilder.alarmNames(_alarmNames)
        return cdkBuilder.build()
    }
}
