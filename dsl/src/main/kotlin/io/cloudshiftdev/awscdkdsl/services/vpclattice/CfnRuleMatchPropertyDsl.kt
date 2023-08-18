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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

/**
 * Describes a rule match.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * MatchProperty matchProperty = MatchProperty.builder()
 * .httpMatch(HttpMatchProperty.builder()
 * .headerMatches(List.of(HeaderMatchProperty.builder()
 * .match(HeaderMatchTypeProperty.builder()
 * .contains("contains")
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .caseSensitive(false)
 * .build()))
 * .method("method")
 * .pathMatch(PathMatchProperty.builder()
 * .match(PathMatchTypeProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .caseSensitive(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-match.html)
 */
@CdkDslMarker
public class CfnRuleMatchPropertyDsl {
    private val cdkBuilder: CfnRule.MatchProperty.Builder = CfnRule.MatchProperty.builder()

    /** @param httpMatch The HTTP criteria that a rule must match. */
    public fun httpMatch(httpMatch: IResolvable) {
        cdkBuilder.httpMatch(httpMatch)
    }

    /** @param httpMatch The HTTP criteria that a rule must match. */
    public fun httpMatch(httpMatch: CfnRule.HttpMatchProperty) {
        cdkBuilder.httpMatch(httpMatch)
    }

    public fun build(): CfnRule.MatchProperty = cdkBuilder.build()
}
