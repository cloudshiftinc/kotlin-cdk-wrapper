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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.databrew.CfnRuleset
import kotlin.String

@CdkDslMarker
public class CfnRulesetSubstitutionValuePropertyDsl {
    private val cdkBuilder: CfnRuleset.SubstitutionValueProperty.Builder =
        CfnRuleset.SubstitutionValueProperty.builder()

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun valueReference(valueReference: String) {
        cdkBuilder.valueReference(valueReference)
    }

    public fun build(): CfnRuleset.SubstitutionValueProperty = cdkBuilder.build()
}
