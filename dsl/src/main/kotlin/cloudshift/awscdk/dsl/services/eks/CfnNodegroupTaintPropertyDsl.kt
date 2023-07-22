@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnNodegroup

@CdkDslMarker
public class CfnNodegroupTaintPropertyDsl {
  private val cdkBuilder: CfnNodegroup.TaintProperty.Builder = CfnNodegroup.TaintProperty.builder()

  /**
   * @param effect The effect of the taint.
   */
  public fun effect(effect: String) {
    cdkBuilder.effect(effect)
  }

  /**
   * @param key The key of the taint.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of the taint.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnNodegroup.TaintProperty = cdkBuilder.build()
}
