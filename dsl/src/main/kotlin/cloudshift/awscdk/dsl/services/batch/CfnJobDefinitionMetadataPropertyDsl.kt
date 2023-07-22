@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionMetadataPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.MetadataProperty.Builder =
      CfnJobDefinition.MetadataProperty.builder()

  /**
   * @param labels the value to be set.
   */
  public fun labels(labels: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(labels)
    cdkBuilder.labels(builder.map)
  }

  /**
   * @param labels the value to be set.
   */
  public fun labels(labels: Any) {
    cdkBuilder.labels(labels)
  }

  public fun build(): CfnJobDefinition.MetadataProperty = cdkBuilder.build()
}
