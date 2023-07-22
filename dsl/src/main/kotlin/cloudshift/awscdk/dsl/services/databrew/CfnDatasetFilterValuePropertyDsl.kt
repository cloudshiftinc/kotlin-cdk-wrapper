@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetFilterValuePropertyDsl {
  private val cdkBuilder: CfnDataset.FilterValueProperty.Builder =
      CfnDataset.FilterValueProperty.builder()

  /**
   * @param value The value to be associated with the substitution variable. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param valueReference The substitution variable reference. 
   */
  public fun valueReference(valueReference: String) {
    cdkBuilder.valueReference(valueReference)
  }

  public fun build(): CfnDataset.FilterValueProperty = cdkBuilder.build()
}
