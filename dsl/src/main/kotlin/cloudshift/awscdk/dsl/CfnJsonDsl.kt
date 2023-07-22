@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnJson
import software.constructs.Construct

@CdkDslMarker
public class CfnJsonDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnJson.Builder = CfnJson.Builder.create(scope, id)

  /**
   * The value to resolve.
   *
   * Can be any JavaScript object, including tokens and
   * references in keys or values.
   *
   * @param value The value to resolve. 
   */
  public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(`value`)
    cdkBuilder.`value`(builder.map)
  }

  /**
   * The value to resolve.
   *
   * Can be any JavaScript object, including tokens and
   * references in keys or values.
   *
   * @param value The value to resolve. 
   */
  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnJson = cdkBuilder.build()
}
