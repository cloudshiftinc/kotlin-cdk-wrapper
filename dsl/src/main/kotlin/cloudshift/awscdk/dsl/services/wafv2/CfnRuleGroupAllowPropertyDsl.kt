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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * Allow traffic towards application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * AllowProperty allowProperty = AllowProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-allow.html)
 */
@CdkDslMarker
public class CfnRuleGroupAllowPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.AllowProperty.Builder =
        CfnRuleGroup.AllowProperty.builder()

    /** @param customRequestHandling Custom request handling. */
    public fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling)
    }

    /** @param customRequestHandling Custom request handling. */
    public fun customRequestHandling(
        customRequestHandling: CfnRuleGroup.CustomRequestHandlingProperty
    ) {
        cdkBuilder.customRequestHandling(customRequestHandling)
    }

    public fun build(): CfnRuleGroup.AllowProperty = cdkBuilder.build()
}
