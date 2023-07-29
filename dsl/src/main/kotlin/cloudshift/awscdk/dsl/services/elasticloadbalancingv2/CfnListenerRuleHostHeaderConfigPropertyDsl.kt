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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information about a host header condition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * HostHeaderConfigProperty hostHeaderConfigProperty = HostHeaderConfigProperty.builder()
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-hostheaderconfig.html)
 */
@CdkDslMarker
public class CfnListenerRuleHostHeaderConfigPropertyDsl {
    private val cdkBuilder: CfnListenerRule.HostHeaderConfigProperty.Builder =
        CfnListenerRule.HostHeaderConfigProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param values The host names. The maximum size of each name is 128 characters. The comparison
     *   is case insensitive. The following wildcard characters are supported: * (matches 0 or more
     *   characters) and ? (matches exactly 1 character).
     *
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the
     * host name.
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The host names. The maximum size of each name is 128 characters. The comparison
     *   is case insensitive. The following wildcard characters are supported: * (matches 0 or more
     *   characters) and ? (matches exactly 1 character).
     *
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the
     * host name.
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnListenerRule.HostHeaderConfigProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
