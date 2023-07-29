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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * A list of IP addresses and address ranges, in CIDR notation.
 *
 * This is part of a `RuleGroup.RuleVariables` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * IPSetProperty iPSetProperty = Map.of(
 * "definition", List.of("definition"));
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipset.html)
 */
@CdkDslMarker
public class CfnRuleGroupIPSetPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.IPSetProperty.Builder =
        CfnRuleGroup.IPSetProperty.builder()

    private val _definition: MutableList<String> = mutableListOf()

    /** @param definition The list of IP addresses and address ranges, in CIDR notation. */
    public fun definition(vararg definition: String) {
        _definition.addAll(listOf(*definition))
    }

    /** @param definition The list of IP addresses and address ranges, in CIDR notation. */
    public fun definition(definition: Collection<String>) {
        _definition.addAll(definition)
    }

    public fun build(): CfnRuleGroup.IPSetProperty {
        if (_definition.isNotEmpty()) cdkBuilder.definition(_definition)
        return cdkBuilder.build()
    }
}
