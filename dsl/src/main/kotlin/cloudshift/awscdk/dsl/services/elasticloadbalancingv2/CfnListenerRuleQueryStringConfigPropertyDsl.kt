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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information about a query string condition.
 *
 * The query string component of a URI starts after the first '?' character and is terminated by
 * either a '#' character or the end of the URI. A typical query string contains key/value pairs
 * separated by '&amp;' characters. The allowed characters are specified by RFC 3986. Any character
 * can be percentage encoded.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * QueryStringConfigProperty queryStringConfigProperty = QueryStringConfigProperty.builder()
 * .values(List.of(QueryStringKeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringconfig.html)
 */
@CdkDslMarker
public class CfnListenerRuleQueryStringConfigPropertyDsl {
    private val cdkBuilder: CfnListenerRule.QueryStringConfigProperty.Builder =
        CfnListenerRule.QueryStringConfigProperty.builder()

    private val _values: MutableList<Any> = mutableListOf()

    /**
     * @param values The key/value pairs or values to find in the query string. The maximum size of
     *   each string is 128 characters. The comparison is case insensitive. The following wildcard
     *   characters are supported: * (matches 0 or more characters) and ? (matches exactly 1
     *   character). To search for a literal '*' or '?' character in a query string, you must escape
     *   these characters in `Values` using a '' character.
     *
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them
     * is found in the query string.
     */
    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The key/value pairs or values to find in the query string. The maximum size of
     *   each string is 128 characters. The comparison is case insensitive. The following wildcard
     *   characters are supported: * (matches 0 or more characters) and ? (matches exactly 1
     *   character). To search for a literal '*' or '?' character in a query string, you must escape
     *   these characters in `Values` using a '' character.
     *
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them
     * is found in the query string.
     */
    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    /**
     * @param values The key/value pairs or values to find in the query string. The maximum size of
     *   each string is 128 characters. The comparison is case insensitive. The following wildcard
     *   characters are supported: * (matches 0 or more characters) and ? (matches exactly 1
     *   character). To search for a literal '*' or '?' character in a query string, you must escape
     *   these characters in `Values` using a '' character.
     *
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them
     * is found in the query string.
     */
    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnListenerRule.QueryStringConfigProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
