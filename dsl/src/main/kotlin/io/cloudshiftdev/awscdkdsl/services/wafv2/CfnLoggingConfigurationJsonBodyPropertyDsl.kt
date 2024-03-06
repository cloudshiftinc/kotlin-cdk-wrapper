@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object all;
 * JsonBodyProperty jsonBodyProperty = JsonBodyProperty.builder()
 * .matchPattern(MatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationJsonBodyPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.JsonBodyProperty.Builder =
        CfnLoggingConfiguration.JsonBodyProperty.builder()

    /** @param invalidFallbackBehavior the value to be set. */
    public fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
        cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
    }

    /** @param matchPattern the value to be set. */
    public fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern)
    }

    /** @param matchPattern the value to be set. */
    public fun matchPattern(matchPattern: CfnLoggingConfiguration.MatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern)
    }

    /** @param matchScope the value to be set. */
    public fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
    }

    public fun build(): CfnLoggingConfiguration.JsonBodyProperty = cdkBuilder.build()
}
