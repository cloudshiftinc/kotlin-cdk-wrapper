@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionResourcesPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.ResourcesProperty.Builder =
      CfnJobDefinition.ResourcesProperty.builder()

  /**
   * @param limits the value to be set.
   */
  public fun limits(limits: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(limits)
    cdkBuilder.limits(builder.map)
  }

  /**
   * @param limits the value to be set.
   */
  public fun limits(limits: Any) {
    cdkBuilder.limits(limits)
  }

  /**
   * @param requests the value to be set.
   */
  public fun requests(requests: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(requests)
    cdkBuilder.requests(builder.map)
  }

  /**
   * @param requests the value to be set.
   */
  public fun requests(requests: Any) {
    cdkBuilder.requests(requests)
  }

  public fun build(): CfnJobDefinition.ResourcesProperty = cdkBuilder.build()
}
