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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

/**
 * Describes the codes to use when checking for a successful response from a target for health
 * checks.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * MatcherProperty matcherProperty = MatcherProperty.builder()
 * .httpCode("httpCode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-matcher.html)
 */
@CdkDslMarker
public class CfnTargetGroupMatcherPropertyDsl {
    private val cdkBuilder: CfnTargetGroup.MatcherProperty.Builder =
        CfnTargetGroup.MatcherProperty.builder()

    /**
     * @param httpCode The HTTP code to use when checking for a successful response from a target.
     */
    public fun httpCode(httpCode: String) {
        cdkBuilder.httpCode(httpCode)
    }

    public fun build(): CfnTargetGroup.MatcherProperty = cdkBuilder.build()
}
