@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.GetContextValueResult

@CdkDslMarker
public class GetContextValueResultDsl {
  private val cdkBuilder: GetContextValueResult.Builder = GetContextValueResult.builder()

  /**
   * @param value the value to be set.
   */
  public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(`value`)
    cdkBuilder.`value`(builder.map)
  }

  /**
   * @param value the value to be set.
   */
  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): GetContextValueResult = cdkBuilder.build()
}
