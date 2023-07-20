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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMaintenanceWindowTaskPropsDsl {
    private val cdkBuilder: CfnMaintenanceWindowTaskProps.Builder =
        CfnMaintenanceWindowTaskProps.builder()

    private val _targets: MutableList<Any> = mutableListOf()

    public fun cutoffBehavior(cutoffBehavior: String) {
        cdkBuilder.cutoffBehavior(cutoffBehavior)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun loggingInfo(loggingInfo: IResolvable) {
        cdkBuilder.loggingInfo(loggingInfo)
    }

    public fun loggingInfo(loggingInfo: CfnMaintenanceWindowTask.LoggingInfoProperty) {
        cdkBuilder.loggingInfo(loggingInfo)
    }

    public fun maxConcurrency(maxConcurrency: String) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    public fun maxErrors(maxErrors: String) {
        cdkBuilder.maxErrors(maxErrors)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun serviceRoleArn(serviceRoleArn: String) {
        cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    public fun targets(vararg targets: Any) {
        _targets.addAll(listOf(*targets))
    }

    public fun targets(targets: Collection<Any>) {
        _targets.addAll(targets)
    }

    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    public fun taskArn(taskArn: String) {
        cdkBuilder.taskArn(taskArn)
    }

    public fun taskInvocationParameters(taskInvocationParameters: IResolvable) {
        cdkBuilder.taskInvocationParameters(taskInvocationParameters)
    }

    public fun taskInvocationParameters(taskInvocationParameters: CfnMaintenanceWindowTask.TaskInvocationParametersProperty) {
        cdkBuilder.taskInvocationParameters(taskInvocationParameters)
    }

    public fun taskParameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.taskParameters(builder.map)
    }

    public fun taskParameters(taskParameters: Any) {
        cdkBuilder.taskParameters(taskParameters)
    }

    public fun taskType(taskType: String) {
        cdkBuilder.taskType(taskType)
    }

    public fun windowId(windowId: String) {
        cdkBuilder.windowId(windowId)
    }

    public fun build(): CfnMaintenanceWindowTaskProps {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
