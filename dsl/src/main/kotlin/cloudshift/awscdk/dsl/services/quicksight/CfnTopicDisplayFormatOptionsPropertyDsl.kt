@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicDisplayFormatOptionsPropertyDsl {
  private val cdkBuilder: CfnTopic.DisplayFormatOptionsProperty.Builder =
      CfnTopic.DisplayFormatOptionsProperty.builder()

  /**
   * @param blankCellFormat Determines the blank cell format.
   */
  public fun blankCellFormat(blankCellFormat: String) {
    cdkBuilder.blankCellFormat(blankCellFormat)
  }

  /**
   * @param currencySymbol The currency symbol, such as `USD` .
   */
  public fun currencySymbol(currencySymbol: String) {
    cdkBuilder.currencySymbol(currencySymbol)
  }

  /**
   * @param dateFormat Determines the `DateTime` format.
   */
  public fun dateFormat(dateFormat: String) {
    cdkBuilder.dateFormat(dateFormat)
  }

  /**
   * @param decimalSeparator Determines the decimal separator.
   */
  public fun decimalSeparator(decimalSeparator: String) {
    cdkBuilder.decimalSeparator(decimalSeparator)
  }

  /**
   * @param fractionDigits Determines the number of fraction digits.
   */
  public fun fractionDigits(fractionDigits: Number) {
    cdkBuilder.fractionDigits(fractionDigits)
  }

  /**
   * @param groupingSeparator Determines the grouping separator.
   */
  public fun groupingSeparator(groupingSeparator: String) {
    cdkBuilder.groupingSeparator(groupingSeparator)
  }

  /**
   * @param negativeFormat The negative format.
   */
  public fun negativeFormat(negativeFormat: IResolvable) {
    cdkBuilder.negativeFormat(negativeFormat)
  }

  /**
   * @param negativeFormat The negative format.
   */
  public fun negativeFormat(negativeFormat: CfnTopic.NegativeFormatProperty) {
    cdkBuilder.negativeFormat(negativeFormat)
  }

  /**
   * @param prefix The prefix value for a display format.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param suffix The suffix value for a display format.
   */
  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  /**
   * @param unitScaler The unit scaler.
   * Valid values for this structure are: `NONE` , `AUTO` , `THOUSANDS` , `MILLIONS` , `BILLIONS` ,
   * and `TRILLIONS` .
   */
  public fun unitScaler(unitScaler: String) {
    cdkBuilder.unitScaler(unitScaler)
  }

  /**
   * @param useBlankCellFormat A Boolean value that indicates whether to use blank cell format.
   */
  public fun useBlankCellFormat(useBlankCellFormat: Boolean) {
    cdkBuilder.useBlankCellFormat(useBlankCellFormat)
  }

  /**
   * @param useBlankCellFormat A Boolean value that indicates whether to use blank cell format.
   */
  public fun useBlankCellFormat(useBlankCellFormat: IResolvable) {
    cdkBuilder.useBlankCellFormat(useBlankCellFormat)
  }

  /**
   * @param useGrouping A Boolean value that indicates whether to use grouping.
   */
  public fun useGrouping(useGrouping: Boolean) {
    cdkBuilder.useGrouping(useGrouping)
  }

  /**
   * @param useGrouping A Boolean value that indicates whether to use grouping.
   */
  public fun useGrouping(useGrouping: IResolvable) {
    cdkBuilder.useGrouping(useGrouping)
  }

  public fun build(): CfnTopic.DisplayFormatOptionsProperty = cdkBuilder.build()
}
