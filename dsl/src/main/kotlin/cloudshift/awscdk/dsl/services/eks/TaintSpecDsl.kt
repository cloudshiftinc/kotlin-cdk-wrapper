@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.TaintEffect
import software.amazon.awscdk.services.eks.TaintSpec

@CdkDslMarker
public class TaintSpecDsl {
  private val cdkBuilder: TaintSpec.Builder = TaintSpec.builder()

  /**
   * @param effect Effect type.
   */
  public fun effect(effect: TaintEffect) {
    cdkBuilder.effect(effect)
  }

  /**
   * @param key Taint key.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value Taint value.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): TaintSpec = cdkBuilder.build()
}
