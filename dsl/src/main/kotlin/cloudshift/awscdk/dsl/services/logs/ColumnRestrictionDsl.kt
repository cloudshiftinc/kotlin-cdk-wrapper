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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.logs.ColumnRestriction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * ColumnRestriction columnRestriction = ColumnRestriction.builder()
 * .comparison("comparison")
 * // the properties below are optional
 * .numberValue(123)
 * .stringValue("stringValue")
 * .build();
 * ```
 */
@CdkDslMarker
public class ColumnRestrictionDsl {
    private val cdkBuilder: ColumnRestriction.Builder = ColumnRestriction.builder()

    /** @param comparison Comparison operator to use. */
    public fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
    }

    /**
     * @param numberValue Number value to compare to. Exactly one of 'stringValue' and 'numberValue'
     *   must be set.
     */
    public fun numberValue(numberValue: Number) {
        cdkBuilder.numberValue(numberValue)
    }

    /**
     * @param stringValue String value to compare to. Exactly one of 'stringValue' and 'numberValue'
     *   must be set.
     */
    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun build(): ColumnRestriction = cdkBuilder.build()
}
