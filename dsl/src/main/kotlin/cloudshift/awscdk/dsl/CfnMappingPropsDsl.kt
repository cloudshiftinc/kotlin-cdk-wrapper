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

  public fun lazy(lazy: Boolean) {
    cdkBuilder.lazy(lazy)
  }

  public fun mapping(mapping: Map<String, Map<String, Any>>) {
    cdkBuilder.mapping(mapping)
  }

  public fun build(): CfnMappingProps = cdkBuilder.build()
}
