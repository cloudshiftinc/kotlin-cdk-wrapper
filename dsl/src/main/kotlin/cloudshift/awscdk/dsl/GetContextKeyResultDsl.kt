@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.GetContextKeyResult

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * Object props;
 * GetContextKeyResult getContextKeyResult = GetContextKeyResult.builder()
 * .key("key")
 * .props(Map.of(
 * "propsKey", props))
 * .build();
 * ```
 */
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
