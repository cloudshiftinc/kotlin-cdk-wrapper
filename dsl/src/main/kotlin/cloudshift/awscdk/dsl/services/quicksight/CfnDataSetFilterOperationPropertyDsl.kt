@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetFilterOperationPropertyDsl {
  private val cdkBuilder: CfnDataSet.FilterOperationProperty.Builder =
      CfnDataSet.FilterOperationProperty.builder()

  public fun conditionExpression(conditionExpression: String) {
    cdkBuilder.conditionExpression(conditionExpression)
  }

  public fun build(): CfnDataSet.FilterOperationProperty = cdkBuilder.build()
}
