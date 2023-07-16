@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDataLabelTypePropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataLabelTypeProperty.Builder =
      CfnAnalysis.DataLabelTypeProperty.builder()

  public fun dataPathLabelType(dataPathLabelType: IResolvable) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  public fun dataPathLabelType(dataPathLabelType: CfnAnalysis.DataPathLabelTypeProperty) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  public fun fieldLabelType(fieldLabelType: IResolvable) {
    cdkBuilder.fieldLabelType(fieldLabelType)
  }

  public fun fieldLabelType(fieldLabelType: CfnAnalysis.FieldLabelTypeProperty) {
    cdkBuilder.fieldLabelType(fieldLabelType)
  }

  public fun maximumLabelType(maximumLabelType: IResolvable) {
    cdkBuilder.maximumLabelType(maximumLabelType)
  }

  public fun maximumLabelType(maximumLabelType: CfnAnalysis.MaximumLabelTypeProperty) {
    cdkBuilder.maximumLabelType(maximumLabelType)
  }

  public fun minimumLabelType(minimumLabelType: IResolvable) {
    cdkBuilder.minimumLabelType(minimumLabelType)
  }

  public fun minimumLabelType(minimumLabelType: CfnAnalysis.MinimumLabelTypeProperty) {
    cdkBuilder.minimumLabelType(minimumLabelType)
  }

  public fun rangeEndsLabelType(rangeEndsLabelType: IResolvable) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  public fun rangeEndsLabelType(rangeEndsLabelType: CfnAnalysis.RangeEndsLabelTypeProperty) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  public fun build(): CfnAnalysis.DataLabelTypeProperty = cdkBuilder.build()
}
