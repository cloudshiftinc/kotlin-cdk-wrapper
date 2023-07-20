@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

@CdkDslMarker
public class CfnListenerTargetGroupStickinessConfigPropertyDsl {
  private val cdkBuilder: CfnListener.TargetGroupStickinessConfigProperty.Builder =
      CfnListener.TargetGroupStickinessConfigProperty.builder()

  public fun durationSeconds(durationSeconds: Number) {
    cdkBuilder.durationSeconds(durationSeconds)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnListener.TargetGroupStickinessConfigProperty = cdkBuilder.build()
}
