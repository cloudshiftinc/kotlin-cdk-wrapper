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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
import software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup
import software.amazon.awscdk.services.codedeploy.IEcsApplication
import software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig
import software.amazon.awscdk.services.ecs.IBaseService
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EcsDeploymentGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: EcsDeploymentGroup.Builder = EcsDeploymentGroup.Builder.create(scope, id)

    private val _alarms: MutableList<IAlarm> = mutableListOf()

    public fun alarms(vararg alarms: IAlarm) {
        _alarms.addAll(listOf(*alarms))
    }

    public fun alarms(alarms: Collection<IAlarm>) {
        _alarms.addAll(alarms)
    }

    public fun application(application: IEcsApplication) {
        cdkBuilder.application(application)
    }

    public fun autoRollback(block: AutoRollbackConfigDsl.() -> Unit = {}) {
        val builder = AutoRollbackConfigDsl()
        builder.apply(block)
        cdkBuilder.autoRollback(builder.build())
    }

    public fun autoRollback(autoRollback: AutoRollbackConfig) {
        cdkBuilder.autoRollback(autoRollback)
    }

    public fun blueGreenDeploymentConfig(block: EcsBlueGreenDeploymentConfigDsl.() -> Unit = {}) {
        val builder = EcsBlueGreenDeploymentConfigDsl()
        builder.apply(block)
        cdkBuilder.blueGreenDeploymentConfig(builder.build())
    }

    public fun blueGreenDeploymentConfig(blueGreenDeploymentConfig: EcsBlueGreenDeploymentConfig) {
        cdkBuilder.blueGreenDeploymentConfig(blueGreenDeploymentConfig)
    }

    public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    public fun deploymentGroupName(deploymentGroupName: String) {
        cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
        cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun service(service: IBaseService) {
        cdkBuilder.service(service)
    }

    public fun build(): EcsDeploymentGroup {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        return cdkBuilder.build()
    }
}
