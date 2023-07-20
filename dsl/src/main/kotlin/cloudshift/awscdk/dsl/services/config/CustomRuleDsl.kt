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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CustomRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CustomRule.Builder = CustomRule.Builder.create(scope, id)

    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    public fun configurationChanges(configurationChanges: Boolean) {
        cdkBuilder.configurationChanges(configurationChanges)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun inputParameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.inputParameters(builder.map)
    }

    public fun inputParameters(inputParameters: Map<String, Any>) {
        cdkBuilder.inputParameters(inputParameters)
    }

    public fun lambdaFunction(lambdaFunction: IFunction) {
        cdkBuilder.lambdaFunction(lambdaFunction)
    }

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    public fun periodic(periodic: Boolean) {
        cdkBuilder.periodic(periodic)
    }

    public fun ruleScope(ruleScope: RuleScope) {
        cdkBuilder.ruleScope(ruleScope)
    }

    public fun build(): CustomRule = cdkBuilder.build()
}
