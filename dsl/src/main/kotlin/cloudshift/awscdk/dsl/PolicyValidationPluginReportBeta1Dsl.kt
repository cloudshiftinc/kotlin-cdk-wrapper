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
import software.amazon.awscdk.PolicyValidationPluginReportBeta1
import software.amazon.awscdk.PolicyViolationBeta1
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class PolicyValidationPluginReportBeta1Dsl {
    private val cdkBuilder: PolicyValidationPluginReportBeta1.Builder =
        PolicyValidationPluginReportBeta1.builder()

    private val _violations: MutableList<PolicyViolationBeta1> = mutableListOf()

    public fun metadata(metadata: Map<String, String>) {
        cdkBuilder.metadata(metadata)
    }

    public fun pluginVersion(pluginVersion: String) {
        cdkBuilder.pluginVersion(pluginVersion)
    }

    public fun success(success: Boolean) {
        cdkBuilder.success(success)
    }

    public fun violations(violations: PolicyViolationBeta1Dsl.() -> Unit) {
        _violations.add(PolicyViolationBeta1Dsl().apply(violations).build())
    }

    public fun violations(violations: Collection<PolicyViolationBeta1>) {
        _violations.addAll(violations)
    }

    public fun build(): PolicyValidationPluginReportBeta1 {
        if (_violations.isNotEmpty()) cdkBuilder.violations(_violations)
        return cdkBuilder.build()
    }
}
