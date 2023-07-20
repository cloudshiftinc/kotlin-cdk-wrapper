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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIntegrationFlowDefinitionPropertyDsl {
    private val cdkBuilder: CfnIntegration.FlowDefinitionProperty.Builder =
        CfnIntegration.FlowDefinitionProperty.builder()

    private val _tasks: MutableList<Any> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun flowName(flowName: String) {
        cdkBuilder.flowName(flowName)
    }

    public fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
    }

    public fun sourceFlowConfig(sourceFlowConfig: IResolvable) {
        cdkBuilder.sourceFlowConfig(sourceFlowConfig)
    }

    public fun sourceFlowConfig(sourceFlowConfig: CfnIntegration.SourceFlowConfigProperty) {
        cdkBuilder.sourceFlowConfig(sourceFlowConfig)
    }

    public fun tasks(vararg tasks: Any) {
        _tasks.addAll(listOf(*tasks))
    }

    public fun tasks(tasks: Collection<Any>) {
        _tasks.addAll(tasks)
    }

    public fun tasks(tasks: IResolvable) {
        cdkBuilder.tasks(tasks)
    }

    public fun triggerConfig(triggerConfig: IResolvable) {
        cdkBuilder.triggerConfig(triggerConfig)
    }

    public fun triggerConfig(triggerConfig: CfnIntegration.TriggerConfigProperty) {
        cdkBuilder.triggerConfig(triggerConfig)
    }

    public fun build(): CfnIntegration.FlowDefinitionProperty {
        if (_tasks.isNotEmpty()) cdkBuilder.tasks(_tasks)
        return cdkBuilder.build()
    }
}
