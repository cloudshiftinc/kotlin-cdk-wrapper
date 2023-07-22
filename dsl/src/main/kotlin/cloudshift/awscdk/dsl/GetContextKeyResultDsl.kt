@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.GetContextKeyResult

@CdkDslMarker
public class GetContextKeyResultDsl {
  private val cdkBuilder: GetContextKeyResult.Builder = GetContextKeyResult.builder()

  /**
   * @param key the value to be set. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param props the value to be set. 
   */
  public fun props(props: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(props)
    cdkBuilder.props(builder.map)
  }

  /**
   * @param props the value to be set. 
   */
  public fun props(props: Map<String, Any>) {
    cdkBuilder.props(props)
  }

  public fun build(): GetContextKeyResult = cdkBuilder.build()
}
