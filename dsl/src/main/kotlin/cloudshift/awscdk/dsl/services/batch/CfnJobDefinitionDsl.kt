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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnJobDefinition.Builder = CfnJobDefinition.Builder.create(scope, id)

    private val _platformCapabilities: MutableList<String> = mutableListOf()

    public fun containerProperties(containerProperties: IResolvable) {
        cdkBuilder.containerProperties(containerProperties)
    }

    public fun containerProperties(containerProperties: CfnJobDefinition.ContainerPropertiesProperty) {
        cdkBuilder.containerProperties(containerProperties)
    }

    public fun eksProperties(eksProperties: IResolvable) {
        cdkBuilder.eksProperties(eksProperties)
    }

    public fun eksProperties(eksProperties: CfnJobDefinition.EksPropertiesProperty) {
        cdkBuilder.eksProperties(eksProperties)
    }

    public fun jobDefinitionName(jobDefinitionName: String) {
        cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    public fun nodeProperties(nodeProperties: IResolvable) {
        cdkBuilder.nodeProperties(nodeProperties)
    }

    public fun nodeProperties(nodeProperties: CfnJobDefinition.NodePropertiesProperty) {
        cdkBuilder.nodeProperties(nodeProperties)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun platformCapabilities(vararg platformCapabilities: String) {
        _platformCapabilities.addAll(listOf(*platformCapabilities))
    }

    public fun platformCapabilities(platformCapabilities: Collection<String>) {
        _platformCapabilities.addAll(platformCapabilities)
    }

    public fun propagateTags(propagateTags: Boolean) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun propagateTags(propagateTags: IResolvable) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun retryStrategy(retryStrategy: IResolvable) {
        cdkBuilder.retryStrategy(retryStrategy)
    }

    public fun retryStrategy(retryStrategy: CfnJobDefinition.RetryStrategyProperty) {
        cdkBuilder.retryStrategy(retryStrategy)
    }

    public fun schedulingPriority(schedulingPriority: Number) {
        cdkBuilder.schedulingPriority(schedulingPriority)
    }

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout)
    }

    public fun timeout(timeout: CfnJobDefinition.TimeoutProperty) {
        cdkBuilder.timeout(timeout)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnJobDefinition {
        if (_platformCapabilities.isNotEmpty()) cdkBuilder.platformCapabilities(_platformCapabilities)
        return cdkBuilder.build()
    }
}
