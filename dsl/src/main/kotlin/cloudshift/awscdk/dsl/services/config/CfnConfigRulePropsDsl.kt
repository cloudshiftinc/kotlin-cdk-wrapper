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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigRuleProps
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnConfigRulePropsDsl {
    private val cdkBuilder: CfnConfigRuleProps.Builder = CfnConfigRuleProps.builder()

    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun inputParameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.inputParameters(builder.map)
    }

    public fun inputParameters(inputParameters: Any) {
        cdkBuilder.inputParameters(inputParameters)
    }

    public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    public fun scope(scope: IResolvable) {
        cdkBuilder.scope(scope)
    }

    public fun scope(scope: CfnConfigRule.ScopeProperty) {
        cdkBuilder.scope(scope)
    }

    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    public fun source(source: CfnConfigRule.SourceProperty) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnConfigRuleProps = cdkBuilder.build()
}
