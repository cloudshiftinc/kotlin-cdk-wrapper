@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.CfnNodegroup

@CdkDslMarker
public class CfnNodegroupTaintPropertyDsl {
  private val cdkBuilder: CfnNodegroup.TaintProperty.Builder = CfnNodegroup.TaintProperty.builder()

  public fun effect(effect: String) {
    cdkBuilder.effect(effect)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnNodegroup.TaintProperty = cdkBuilder.build()
}
