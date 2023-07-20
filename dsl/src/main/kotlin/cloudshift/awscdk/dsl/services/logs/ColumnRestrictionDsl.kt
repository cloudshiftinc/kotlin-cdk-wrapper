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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.ColumnRestriction
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class ColumnRestrictionDsl {
    private val cdkBuilder: ColumnRestriction.Builder = ColumnRestriction.builder()

    public fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
    }

    public fun numberValue(numberValue: Number) {
        cdkBuilder.numberValue(numberValue)
    }

    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun build(): ColumnRestriction = cdkBuilder.build()
}
