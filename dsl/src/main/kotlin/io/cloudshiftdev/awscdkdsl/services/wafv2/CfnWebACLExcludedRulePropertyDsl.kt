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
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies a single rule in a rule group whose action you want to override to `Count` .
 *
 * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
 * including `Count` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ExcludedRuleProperty excludedRuleProperty = ExcludedRuleProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-excludedrule.html)
 */
@CdkDslMarker
public class CfnWebACLExcludedRulePropertyDsl {
    private val cdkBuilder: CfnWebACL.ExcludedRuleProperty.Builder =
        CfnWebACL.ExcludedRuleProperty.builder()

    /** @param name The name of the rule whose action you want to override to `Count` . */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnWebACL.ExcludedRuleProperty = cdkBuilder.build()
}
