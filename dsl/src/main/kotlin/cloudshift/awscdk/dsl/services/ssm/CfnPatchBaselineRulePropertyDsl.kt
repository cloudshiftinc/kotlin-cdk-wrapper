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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnPatchBaseline
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnPatchBaselineRulePropertyDsl {
    private val cdkBuilder: CfnPatchBaseline.RuleProperty.Builder =
        CfnPatchBaseline.RuleProperty.builder()

    public fun approveAfterDays(approveAfterDays: Number) {
        cdkBuilder.approveAfterDays(approveAfterDays)
    }

    public fun approveUntilDate(approveUntilDate: String) {
        cdkBuilder.approveUntilDate(approveUntilDate)
    }

    public fun complianceLevel(complianceLevel: String) {
        cdkBuilder.complianceLevel(complianceLevel)
    }

    public fun enableNonSecurity(enableNonSecurity: Boolean) {
        cdkBuilder.enableNonSecurity(enableNonSecurity)
    }

    public fun enableNonSecurity(enableNonSecurity: IResolvable) {
        cdkBuilder.enableNonSecurity(enableNonSecurity)
    }

    public fun patchFilterGroup(patchFilterGroup: IResolvable) {
        cdkBuilder.patchFilterGroup(patchFilterGroup)
    }

    public fun patchFilterGroup(patchFilterGroup: CfnPatchBaseline.PatchFilterGroupProperty) {
        cdkBuilder.patchFilterGroup(patchFilterGroup)
    }

    public fun build(): CfnPatchBaseline.RuleProperty = cdkBuilder.build()
}
