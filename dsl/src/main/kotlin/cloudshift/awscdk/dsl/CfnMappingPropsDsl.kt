@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.CfnMappingProps

@CdkDslMarker
public class CfnMappingPropsDsl {
  private val cdkBuilder: CfnMappingProps.Builder = CfnMappingProps.builder()

  /**
   * @param lazy the value to be set.
   */
  public fun lazy(lazy: Boolean) {
    cdkBuilder.lazy(lazy)
  }

  /**
   * @param mapping Mapping of key to a set of corresponding set of named values.
   * The key identifies a map of name-value pairs and must be unique within the mapping.
   *
   * For example, if you want to set values based on a region, you can create a mapping
   * that uses the region name as a key and contains the values you want to specify for
   * each specific region.
   */
  public fun mapping(mapping: Map<String, Map<String, Any>>) {
    cdkBuilder.mapping(mapping)
  }

  public fun build(): CfnMappingProps = cdkBuilder.build()
}
