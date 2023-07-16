@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableInputFormatOptionsPropertyDsl {
  private val cdkBuilder: CfnTable.InputFormatOptionsProperty.Builder =
      CfnTable.InputFormatOptionsProperty.builder()

  public fun csv(csv: IResolvable) {
    cdkBuilder.csv(csv)
  }

  public fun csv(csv: CfnTable.CsvProperty) {
    cdkBuilder.csv(csv)
  }

  public fun build(): CfnTable.InputFormatOptionsProperty = cdkBuilder.build()
}
