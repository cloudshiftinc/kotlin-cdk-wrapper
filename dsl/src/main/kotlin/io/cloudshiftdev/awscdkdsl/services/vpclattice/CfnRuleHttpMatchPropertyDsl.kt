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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

/**
 * Describes criteria that can be applied to incoming requests.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * HttpMatchProperty httpMatchProperty = HttpMatchProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-rule-httpmatch.html)
 */
@CdkDslMarker
public class CfnRuleHttpMatchPropertyDsl {
    private val cdkBuilder: CfnRule.HttpMatchProperty.Builder = CfnRule.HttpMatchProperty.builder()

    private val _headerMatches: MutableList<Any> = mutableListOf()

    /**
     * @param headerMatches The header matches. Matches incoming requests with rule based on request
     *   header value before applying rule action.
     */
    public fun headerMatches(vararg headerMatches: Any) {
        _headerMatches.addAll(listOf(*headerMatches))
    }

    /**
     * @param headerMatches The header matches. Matches incoming requests with rule based on request
     *   header value before applying rule action.
     */
    public fun headerMatches(headerMatches: Collection<Any>) {
        _headerMatches.addAll(headerMatches)
    }

    /**
     * @param headerMatches The header matches. Matches incoming requests with rule based on request
     *   header value before applying rule action.
     */
    public fun headerMatches(headerMatches: IResolvable) {
        cdkBuilder.headerMatches(headerMatches)
    }

    /** @param method The HTTP method type. */
    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    /** @param pathMatch The path match. */
    public fun pathMatch(pathMatch: IResolvable) {
        cdkBuilder.pathMatch(pathMatch)
    }

    /** @param pathMatch The path match. */
    public fun pathMatch(pathMatch: CfnRule.PathMatchProperty) {
        cdkBuilder.pathMatch(pathMatch)
    }

    public fun build(): CfnRule.HttpMatchProperty {
        if (_headerMatches.isNotEmpty()) cdkBuilder.headerMatches(_headerMatches)
        return cdkBuilder.build()
    }
}
