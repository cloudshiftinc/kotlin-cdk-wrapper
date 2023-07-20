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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTopicDisplayFormatOptionsPropertyDsl {
    private val cdkBuilder: CfnTopic.DisplayFormatOptionsProperty.Builder =
        CfnTopic.DisplayFormatOptionsProperty.builder()

    public fun blankCellFormat(blankCellFormat: String) {
        cdkBuilder.blankCellFormat(blankCellFormat)
    }

    public fun currencySymbol(currencySymbol: String) {
        cdkBuilder.currencySymbol(currencySymbol)
    }

    public fun dateFormat(dateFormat: String) {
        cdkBuilder.dateFormat(dateFormat)
    }

    public fun decimalSeparator(decimalSeparator: String) {
        cdkBuilder.decimalSeparator(decimalSeparator)
    }

    public fun fractionDigits(fractionDigits: Number) {
        cdkBuilder.fractionDigits(fractionDigits)
    }

    public fun groupingSeparator(groupingSeparator: String) {
        cdkBuilder.groupingSeparator(groupingSeparator)
    }

    public fun negativeFormat(negativeFormat: IResolvable) {
        cdkBuilder.negativeFormat(negativeFormat)
    }

    public fun negativeFormat(negativeFormat: CfnTopic.NegativeFormatProperty) {
        cdkBuilder.negativeFormat(negativeFormat)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
    }

    public fun unitScaler(unitScaler: String) {
        cdkBuilder.unitScaler(unitScaler)
    }

    public fun useBlankCellFormat(useBlankCellFormat: Boolean) {
        cdkBuilder.useBlankCellFormat(useBlankCellFormat)
    }

    public fun useBlankCellFormat(useBlankCellFormat: IResolvable) {
        cdkBuilder.useBlankCellFormat(useBlankCellFormat)
    }

    public fun useGrouping(useGrouping: Boolean) {
        cdkBuilder.useGrouping(useGrouping)
    }

    public fun useGrouping(useGrouping: IResolvable) {
        cdkBuilder.useGrouping(useGrouping)
    }

    public fun build(): CfnTopic.DisplayFormatOptionsProperty = cdkBuilder.build()
}
