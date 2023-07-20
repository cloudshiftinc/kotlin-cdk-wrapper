@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataLabelTypePropertyDsl {
  private val cdkBuilder: CfnDashboard.DataLabelTypeProperty.Builder =
      CfnDashboard.DataLabelTypeProperty.builder()

  public fun dataPathLabelType(dataPathLabelType: IResolvable) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  public fun dataPathLabelType(dataPathLabelType: CfnDashboard.DataPathLabelTypeProperty) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  public fun fieldLabelType(fieldLabelType: IResolvable) {
    cdkBuilder.fieldLabelType(fieldLabelType)
  }

  public fun fieldLabelType(fieldLabelType: CfnDashboard.FieldLabelTypeProperty) {
    cdkBuilder.fieldLabelType(fieldLabelType)
  }

  public fun maximumLabelType(maximumLabelType: IResolvable) {
    cdkBuilder.maximumLabelType(maximumLabelType)
  }

  public fun maximumLabelType(maximumLabelType: CfnDashboard.MaximumLabelTypeProperty) {
    cdkBuilder.maximumLabelType(maximumLabelType)
  }

  public fun minimumLabelType(minimumLabelType: IResolvable) {
    cdkBuilder.minimumLabelType(minimumLabelType)
  }

  public fun minimumLabelType(minimumLabelType: CfnDashboard.MinimumLabelTypeProperty) {
    cdkBuilder.minimumLabelType(minimumLabelType)
  }

  public fun rangeEndsLabelType(rangeEndsLabelType: IResolvable) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  public fun rangeEndsLabelType(rangeEndsLabelType: CfnDashboard.RangeEndsLabelTypeProperty) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  public fun build(): CfnDashboard.DataLabelTypeProperty = cdkBuilder.build()
}
