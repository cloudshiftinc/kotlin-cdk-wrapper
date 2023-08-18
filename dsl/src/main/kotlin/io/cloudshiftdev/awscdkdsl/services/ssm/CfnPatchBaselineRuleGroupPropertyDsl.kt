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

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

/**
 * The `RuleGroup` property type specifies a set of rules that define the approval rules for an AWS
 * Systems Manager patch baseline.
 *
 * `RuleGroup` is the property type for the `ApprovalRules` property of the
 * [AWS::SSM::PatchBaseline](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * RuleGroupProperty ruleGroupProperty = RuleGroupProperty.builder()
 * .patchRules(List.of(RuleProperty.builder()
 * .approveAfterDays(123)
 * .approveUntilDate("approveUntilDate")
 * .complianceLevel("complianceLevel")
 * .enableNonSecurity(false)
 * .patchFilterGroup(PatchFilterGroupProperty.builder()
 * .patchFilters(List.of(PatchFilterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html)
 */
@CdkDslMarker
public class CfnPatchBaselineRuleGroupPropertyDsl {
    private val cdkBuilder: CfnPatchBaseline.RuleGroupProperty.Builder =
        CfnPatchBaseline.RuleGroupProperty.builder()

    private val _patchRules: MutableList<Any> = mutableListOf()

    /** @param patchRules The rules that make up the rule group. */
    public fun patchRules(vararg patchRules: Any) {
        _patchRules.addAll(listOf(*patchRules))
    }

    /** @param patchRules The rules that make up the rule group. */
    public fun patchRules(patchRules: Collection<Any>) {
        _patchRules.addAll(patchRules)
    }

    /** @param patchRules The rules that make up the rule group. */
    public fun patchRules(patchRules: IResolvable) {
        cdkBuilder.patchRules(patchRules)
    }

    public fun build(): CfnPatchBaseline.RuleGroupProperty {
        if (_patchRules.isNotEmpty()) cdkBuilder.patchRules(_patchRules)
        return cdkBuilder.build()
    }
}
