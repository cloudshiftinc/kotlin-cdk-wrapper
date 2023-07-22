@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.CfnJsonProps

@CdkDslMarker
public class CfnJsonPropsDsl {
  private val cdkBuilder: CfnJsonProps.Builder = CfnJsonProps.builder()

  /**
   * @param value The value to resolve. 
   * Can be any JavaScript object, including tokens and
   * references in keys or values.
   */
  public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(`value`)
    cdkBuilder.`value`(builder.map)
  }

  /**
   * @param value The value to resolve. 
   * Can be any JavaScript object, including tokens and
   * references in keys or values.
   */
  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnJsonProps = cdkBuilder.build()
}
