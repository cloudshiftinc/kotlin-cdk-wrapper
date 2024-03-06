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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * Specifies how the rule-based matching process should match profiles.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * MatchingRuleProperty matchingRuleProperty = MatchingRuleProperty.builder()
 * .rule(List.of("rule"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matchingrule.html)
 */
@CdkDslMarker
public class CfnDomainMatchingRulePropertyDsl {
    private val cdkBuilder: CfnDomain.MatchingRuleProperty.Builder =
        CfnDomain.MatchingRuleProperty.builder()

    private val _rule: MutableList<String> = mutableListOf()

    /**
     * @param rule A single rule level of the `MatchRules` . Configures how the rule-based matching
     *   process should match profiles.
     */
    public fun rule(vararg rule: String) {
        _rule.addAll(listOf(*rule))
    }

    /**
     * @param rule A single rule level of the `MatchRules` . Configures how the rule-based matching
     *   process should match profiles.
     */
    public fun rule(rule: Collection<String>) {
        _rule.addAll(rule)
    }

    public fun build(): CfnDomain.MatchingRuleProperty {
        if (_rule.isNotEmpty()) cdkBuilder.rule(_rule)
        return cdkBuilder.build()
    }
}
