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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringJobDefinitionPropertyDsl {
    private val cdkBuilder: CfnMonitoringSchedule.MonitoringJobDefinitionProperty.Builder =
        CfnMonitoringSchedule.MonitoringJobDefinitionProperty.builder()

    private val _monitoringInputs: MutableList<Any> = mutableListOf()

    public fun baselineConfig(baselineConfig: IResolvable) {
        cdkBuilder.baselineConfig(baselineConfig)
    }

    public fun baselineConfig(baselineConfig: CfnMonitoringSchedule.BaselineConfigProperty) {
        cdkBuilder.baselineConfig(baselineConfig)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    public fun monitoringAppSpecification(monitoringAppSpecification: IResolvable) {
        cdkBuilder.monitoringAppSpecification(monitoringAppSpecification)
    }

    public fun monitoringAppSpecification(monitoringAppSpecification: CfnMonitoringSchedule.MonitoringAppSpecificationProperty) {
        cdkBuilder.monitoringAppSpecification(monitoringAppSpecification)
    }

    public fun monitoringInputs(vararg monitoringInputs: Any) {
        _monitoringInputs.addAll(listOf(*monitoringInputs))
    }

    public fun monitoringInputs(monitoringInputs: Collection<Any>) {
        _monitoringInputs.addAll(monitoringInputs)
    }

    public fun monitoringInputs(monitoringInputs: IResolvable) {
        cdkBuilder.monitoringInputs(monitoringInputs)
    }

    public fun monitoringOutputConfig(monitoringOutputConfig: IResolvable) {
        cdkBuilder.monitoringOutputConfig(monitoringOutputConfig)
    }

    public fun monitoringOutputConfig(monitoringOutputConfig: CfnMonitoringSchedule.MonitoringOutputConfigProperty) {
        cdkBuilder.monitoringOutputConfig(monitoringOutputConfig)
    }

    public fun monitoringResources(monitoringResources: IResolvable) {
        cdkBuilder.monitoringResources(monitoringResources)
    }

    public fun monitoringResources(monitoringResources: CfnMonitoringSchedule.MonitoringResourcesProperty) {
        cdkBuilder.monitoringResources(monitoringResources)
    }

    public fun networkConfig(networkConfig: IResolvable) {
        cdkBuilder.networkConfig(networkConfig)
    }

    public fun networkConfig(networkConfig: CfnMonitoringSchedule.NetworkConfigProperty) {
        cdkBuilder.networkConfig(networkConfig)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun stoppingCondition(stoppingCondition: IResolvable) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    public fun stoppingCondition(stoppingCondition: CfnMonitoringSchedule.StoppingConditionProperty) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    public fun build(): CfnMonitoringSchedule.MonitoringJobDefinitionProperty {
        if (_monitoringInputs.isNotEmpty()) cdkBuilder.monitoringInputs(_monitoringInputs)
        return cdkBuilder.build()
    }
}
