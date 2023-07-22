@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.forecast.CfnDataset

@CdkDslMarker
public class CfnDatasetSchemaPropertyDsl {
  private val cdkBuilder: CfnDataset.SchemaProperty.Builder = CfnDataset.SchemaProperty.builder()

  private val _attributes: MutableList<Any> = mutableListOf()

  /**
   * @param attributes An array of attributes specifying the name and type of each field in a
   * dataset.
   */
  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  /**
   * @param attributes An array of attributes specifying the name and type of each field in a
   * dataset.
   */
  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  /**
   * @param attributes An array of attributes specifying the name and type of each field in a
   * dataset.
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun build(): CfnDataset.SchemaProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
