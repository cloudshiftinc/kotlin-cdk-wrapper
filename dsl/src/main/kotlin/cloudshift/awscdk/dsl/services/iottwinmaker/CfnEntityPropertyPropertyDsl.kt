@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityPropertyPropertyDsl {
  private val cdkBuilder: CfnEntity.PropertyProperty.Builder = CfnEntity.PropertyProperty.builder()

  /**
   * @param definition An object that specifies information about a property.
   */
  public fun definition(definition: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(definition)
    cdkBuilder.definition(builder.map)
  }

  /**
   * @param definition An object that specifies information about a property.
   */
  public fun definition(definition: Any) {
    cdkBuilder.definition(definition)
  }

  /**
   * @param value An object that contains information about a value for a time series property.
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value An object that contains information about a value for a time series property.
   */
  public fun `value`(`value`: CfnEntity.DataValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEntity.PropertyProperty = cdkBuilder.build()
}
