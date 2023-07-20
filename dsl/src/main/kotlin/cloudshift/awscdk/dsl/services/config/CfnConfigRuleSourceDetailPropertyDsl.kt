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
import software.amazon.awscdk.services.config.CfnConfigRule
import kotlin.String

@CdkDslMarker
public class CfnConfigRuleSourceDetailPropertyDsl {
    private val cdkBuilder: CfnConfigRule.SourceDetailProperty.Builder =
        CfnConfigRule.SourceDetailProperty.builder()

    public fun eventSource(eventSource: String) {
        cdkBuilder.eventSource(eventSource)
    }

    public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    public fun messageType(messageType: String) {
        cdkBuilder.messageType(messageType)
    }

    public fun build(): CfnConfigRule.SourceDetailProperty = cdkBuilder.build()
}
