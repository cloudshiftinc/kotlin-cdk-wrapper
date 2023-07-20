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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import kotlin.String

@CdkDslMarker
public class CfnLoggingConfigurationJsonBodyPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.JsonBodyProperty.Builder =
        CfnLoggingConfiguration.JsonBodyProperty.builder()

    public fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
        cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
    }

    public fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern)
    }

    public fun matchPattern(matchPattern: CfnLoggingConfiguration.MatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern)
    }

    public fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
    }

    public fun build(): CfnLoggingConfiguration.JsonBodyProperty = cdkBuilder.build()
}
