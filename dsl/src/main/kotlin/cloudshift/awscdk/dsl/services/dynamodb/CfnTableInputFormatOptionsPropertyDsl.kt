@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableInputFormatOptionsPropertyDsl {
  private val cdkBuilder: CfnTable.InputFormatOptionsProperty.Builder =
      CfnTable.InputFormatOptionsProperty.builder()

  /**
   * @param csv The options for imported source files in CSV format.
   * The values are Delimiter and HeaderList.
   */
  public fun csv(csv: IResolvable) {
    cdkBuilder.csv(csv)
  }

  /**
   * @param csv The options for imported source files in CSV format.
   * The values are Delimiter and HeaderList.
   */
  public fun csv(csv: CfnTable.CsvProperty) {
    cdkBuilder.csv(csv)
  }

  public fun build(): CfnTable.InputFormatOptionsProperty = cdkBuilder.build()
}
