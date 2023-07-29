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
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information about a key/value pair.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * QueryStringKeyValueProperty queryStringKeyValueProperty = QueryStringKeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringkeyvalue.html)
 */
@CdkDslMarker
public class CfnListenerRuleQueryStringKeyValuePropertyDsl {
    private val cdkBuilder: CfnListenerRule.QueryStringKeyValueProperty.Builder =
        CfnListenerRule.QueryStringKeyValueProperty.builder()

    /** @param key The key. You can omit the key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnListenerRule.QueryStringKeyValueProperty = cdkBuilder.build()
}
