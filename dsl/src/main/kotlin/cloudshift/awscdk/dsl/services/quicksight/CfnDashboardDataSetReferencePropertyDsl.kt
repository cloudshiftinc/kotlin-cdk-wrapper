@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataSetReferencePropertyDsl {
  private val cdkBuilder: CfnDashboard.DataSetReferenceProperty.Builder =
      CfnDashboard.DataSetReferenceProperty.builder()

  public fun dataSetArn(dataSetArn: String) {
    cdkBuilder.dataSetArn(dataSetArn)
  }

  public fun dataSetPlaceholder(dataSetPlaceholder: String) {
    cdkBuilder.dataSetPlaceholder(dataSetPlaceholder)
  }

  public fun build(): CfnDashboard.DataSetReferenceProperty = cdkBuilder.build()
}
