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

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSafetyRuleAssertionRulePropertyDsl {
    private val cdkBuilder: CfnSafetyRule.AssertionRuleProperty.Builder =
        CfnSafetyRule.AssertionRuleProperty.builder()

    private val _assertedControls: MutableList<String> = mutableListOf()

    public fun assertedControls(vararg assertedControls: String) {
        _assertedControls.addAll(listOf(*assertedControls))
    }

    public fun assertedControls(assertedControls: Collection<String>) {
        _assertedControls.addAll(assertedControls)
    }

    public fun waitPeriodMs(waitPeriodMs: Number) {
        cdkBuilder.waitPeriodMs(waitPeriodMs)
    }

    public fun build(): CfnSafetyRule.AssertionRuleProperty {
        if (_assertedControls.isNotEmpty()) cdkBuilder.assertedControls(_assertedControls)
        return cdkBuilder.build()
    }
}
