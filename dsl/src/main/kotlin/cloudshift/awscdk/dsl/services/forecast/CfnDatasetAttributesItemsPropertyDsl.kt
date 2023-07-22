@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.forecast.CfnDataset

@CdkDslMarker
public class CfnDatasetAttributesItemsPropertyDsl {
  private val cdkBuilder: CfnDataset.AttributesItemsProperty.Builder =
      CfnDataset.AttributesItemsProperty.builder()

  /**
   * @param attributeName Name of the dataset field.
   */
  public fun attributeName(attributeName: String) {
    cdkBuilder.attributeName(attributeName)
  }

  /**
   * @param attributeType Data type of the field.
   */
  public fun attributeType(attributeType: String) {
    cdkBuilder.attributeType(attributeType)
  }

  public fun build(): CfnDataset.AttributesItemsProperty = cdkBuilder.build()
}
