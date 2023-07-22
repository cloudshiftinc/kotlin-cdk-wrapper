@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnWarmPool

@CdkDslMarker
public class CfnWarmPoolInstanceReusePolicyPropertyDsl {
  private val cdkBuilder: CfnWarmPool.InstanceReusePolicyProperty.Builder =
      CfnWarmPool.InstanceReusePolicyProperty.builder()

  /**
   * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned to
   * the warm pool on scale in.
   */
  public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
    cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
  }

  /**
   * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned to
   * the warm pool on scale in.
   */
  public fun reuseOnScaleIn(reuseOnScaleIn: IResolvable) {
    cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
  }

  public fun build(): CfnWarmPool.InstanceReusePolicyProperty = cdkBuilder.build()
}
