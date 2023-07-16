@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnPartition

@CdkDslMarker
public class CfnPartitionSerdeInfoPropertyDsl {
  private val cdkBuilder: CfnPartition.SerdeInfoProperty.Builder =
      CfnPartition.SerdeInfoProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun parameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.parameters(builder.map)
  }

  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  public fun serializationLibrary(serializationLibrary: String) {
    cdkBuilder.serializationLibrary(serializationLibrary)
  }

  public fun build(): CfnPartition.SerdeInfoProperty = cdkBuilder.build()
}
