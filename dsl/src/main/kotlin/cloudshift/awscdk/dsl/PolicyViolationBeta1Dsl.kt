@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.PolicyViolatingResourceBeta1
import software.amazon.awscdk.PolicyViolationBeta1
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class PolicyViolationBeta1Dsl {
    private val cdkBuilder: PolicyViolationBeta1.Builder = PolicyViolationBeta1.builder()

    private val _violatingResources: MutableList<PolicyViolatingResourceBeta1> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun fix(fix: String) {
        cdkBuilder.fix(fix)
    }

    public fun ruleMetadata(ruleMetadata: Map<String, String>) {
        cdkBuilder.ruleMetadata(ruleMetadata)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun severity(severity: String) {
        cdkBuilder.severity(severity)
    }

    public fun violatingResources(violatingResources: PolicyViolatingResourceBeta1Dsl.() -> Unit) {
        _violatingResources.add(PolicyViolatingResourceBeta1Dsl().apply(violatingResources).build())
    }

    public fun violatingResources(violatingResources: Collection<PolicyViolatingResourceBeta1>) {
        _violatingResources.addAll(violatingResources)
    }

    public fun build(): PolicyViolationBeta1 {
        if (_violatingResources.isNotEmpty()) cdkBuilder.violatingResources(_violatingResources)
        return cdkBuilder.build()
    }
}
