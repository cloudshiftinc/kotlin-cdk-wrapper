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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.vpclattice.CfnRule
import kotlin.Number

@CdkDslMarker
public class CfnRuleFixedResponsePropertyDsl {
    private val cdkBuilder: CfnRule.FixedResponseProperty.Builder =
        CfnRule.FixedResponseProperty.builder()

    public fun statusCode(statusCode: Number) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnRule.FixedResponseProperty = cdkBuilder.build()
}
