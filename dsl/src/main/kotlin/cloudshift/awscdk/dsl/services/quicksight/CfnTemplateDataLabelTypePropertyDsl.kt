@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataLabelTypePropertyDsl {
  private val cdkBuilder: CfnTemplate.DataLabelTypeProperty.Builder =
      CfnTemplate.DataLabelTypeProperty.builder()

  public fun dataPathLabelType(dataPathLabelType: IResolvable) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  public fun dataPathLabelType(dataPathLabelType: CfnTemplate.DataPathLabelTypeProperty) {
    cdkBuilder.dataPathLabelType(dataPathLabelType)
  }

  public fun fieldLabelType(fieldLabelType: IResolvable) {
    cdkBuilder.fieldLabelType(fieldLabelType)
  }

  public fun fieldLabelType(fieldLabelType: CfnTemplate.FieldLabelTypeProperty) {
    cdkBuilder.fieldLabelType(fieldLabelType)
  }

  public fun maximumLabelType(maximumLabelType: IResolvable) {
    cdkBuilder.maximumLabelType(maximumLabelType)
  }

  public fun maximumLabelType(maximumLabelType: CfnTemplate.MaximumLabelTypeProperty) {
    cdkBuilder.maximumLabelType(maximumLabelType)
  }

  public fun minimumLabelType(minimumLabelType: IResolvable) {
    cdkBuilder.minimumLabelType(minimumLabelType)
  }

  public fun minimumLabelType(minimumLabelType: CfnTemplate.MinimumLabelTypeProperty) {
    cdkBuilder.minimumLabelType(minimumLabelType)
  }

  public fun rangeEndsLabelType(rangeEndsLabelType: IResolvable) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  public fun rangeEndsLabelType(rangeEndsLabelType: CfnTemplate.RangeEndsLabelTypeProperty) {
    cdkBuilder.rangeEndsLabelType(rangeEndsLabelType)
  }

  public fun build(): CfnTemplate.DataLabelTypeProperty = cdkBuilder.build()
}
