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

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnSizeConstraintSet
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSizeConstraintSetSizeConstraintPropertyDsl {
    private val cdkBuilder: CfnSizeConstraintSet.SizeConstraintProperty.Builder =
        CfnSizeConstraintSet.SizeConstraintProperty.builder()

    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    public fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    public fun fieldToMatch(fieldToMatch: CfnSizeConstraintSet.FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch)
    }

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
    }

    public fun build(): CfnSizeConstraintSet.SizeConstraintProperty = cdkBuilder.build()
}
