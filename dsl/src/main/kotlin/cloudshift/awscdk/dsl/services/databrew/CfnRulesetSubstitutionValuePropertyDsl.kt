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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRuleset

/**
 * A key-value pair to associate an expression's substitution variable names with their values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * SubstitutionValueProperty substitutionValueProperty = SubstitutionValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-substitutionvalue.html)
 */
@CdkDslMarker
public class CfnRulesetSubstitutionValuePropertyDsl {
    private val cdkBuilder: CfnRuleset.SubstitutionValueProperty.Builder =
        CfnRuleset.SubstitutionValueProperty.builder()

    /** @param value Value or column name. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    /** @param valueReference Variable name. */
    public fun valueReference(valueReference: String) {
        cdkBuilder.valueReference(valueReference)
    }

    public fun build(): CfnRuleset.SubstitutionValueProperty = cdkBuilder.build()
}
