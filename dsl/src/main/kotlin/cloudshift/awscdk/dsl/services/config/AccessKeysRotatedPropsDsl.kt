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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class AccessKeysRotatedPropsDsl {
    private val cdkBuilder: AccessKeysRotatedProps.Builder = AccessKeysRotatedProps.builder()

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

    public fun inputParameters(inputParameters: Map<String, Any>) {
        cdkBuilder.inputParameters(inputParameters)
    }

    public fun maxAge(maxAge: Duration) {
        cdkBuilder.maxAge(maxAge)
    }

    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    public fun ruleScope(ruleScope: RuleScope) {
        cdkBuilder.ruleScope(ruleScope)
    }

    public fun build(): AccessKeysRotatedProps = cdkBuilder.build()
}
