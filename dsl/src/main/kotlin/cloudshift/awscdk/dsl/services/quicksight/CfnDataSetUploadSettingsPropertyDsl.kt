@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetUploadSettingsPropertyDsl {
  private val cdkBuilder: CfnDataSet.UploadSettingsProperty.Builder =
      CfnDataSet.UploadSettingsProperty.builder()

  /**
   * @param containsHeader Whether the file has a header row, or the files each have a header row.
   */
  public fun containsHeader(containsHeader: Boolean) {
    cdkBuilder.containsHeader(containsHeader)
  }

  /**
   * @param containsHeader Whether the file has a header row, or the files each have a header row.
   */
  public fun containsHeader(containsHeader: IResolvable) {
    cdkBuilder.containsHeader(containsHeader)
  }

  /**
   * @param delimiter The delimiter between values in the file.
   */
  public fun delimiter(delimiter: String) {
    cdkBuilder.delimiter(delimiter)
  }

  /**
   * @param format File format.
   */
  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  /**
   * @param startFromRow A row number to start reading data from.
   */
  public fun startFromRow(startFromRow: Number) {
    cdkBuilder.startFromRow(startFromRow)
  }

  /**
   * @param textQualifier Text qualifier.
   */
  public fun textQualifier(textQualifier: String) {
    cdkBuilder.textQualifier(textQualifier)
  }

  public fun build(): CfnDataSet.UploadSettingsProperty = cdkBuilder.build()
}
