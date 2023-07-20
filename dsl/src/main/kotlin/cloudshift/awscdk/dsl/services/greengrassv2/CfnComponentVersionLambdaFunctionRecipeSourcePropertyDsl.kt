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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnComponentVersionLambdaFunctionRecipeSourcePropertyDsl {
    private val cdkBuilder: CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder =
        CfnComponentVersion.LambdaFunctionRecipeSourceProperty.builder()

    private val _componentPlatforms: MutableList<Any> = mutableListOf()

    public fun componentDependencies(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.componentDependencies(builder.map)
    }

    public fun componentDependencies(componentDependencies: Map<String, Any>) {
        cdkBuilder.componentDependencies(componentDependencies)
    }

    public fun componentDependencies(componentDependencies: IResolvable) {
        cdkBuilder.componentDependencies(componentDependencies)
    }

    public fun componentLambdaParameters(componentLambdaParameters: IResolvable) {
        cdkBuilder.componentLambdaParameters(componentLambdaParameters)
    }

    public fun componentLambdaParameters(componentLambdaParameters: CfnComponentVersion.LambdaExecutionParametersProperty) {
        cdkBuilder.componentLambdaParameters(componentLambdaParameters)
    }

    public fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
    }

    public fun componentPlatforms(vararg componentPlatforms: Any) {
        _componentPlatforms.addAll(listOf(*componentPlatforms))
    }

    public fun componentPlatforms(componentPlatforms: Collection<Any>) {
        _componentPlatforms.addAll(componentPlatforms)
    }

    public fun componentPlatforms(componentPlatforms: IResolvable) {
        cdkBuilder.componentPlatforms(componentPlatforms)
    }

    public fun componentVersion(componentVersion: String) {
        cdkBuilder.componentVersion(componentVersion)
    }

    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    public fun build(): CfnComponentVersion.LambdaFunctionRecipeSourceProperty {
        if (_componentPlatforms.isNotEmpty()) cdkBuilder.componentPlatforms(_componentPlatforms)
        return cdkBuilder.build()
    }
}
