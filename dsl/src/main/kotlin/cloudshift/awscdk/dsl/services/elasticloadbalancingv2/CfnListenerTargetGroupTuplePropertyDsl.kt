@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

@CdkDslMarker
public class CfnListenerTargetGroupTuplePropertyDsl {
  private val cdkBuilder: CfnListener.TargetGroupTupleProperty.Builder =
      CfnListener.TargetGroupTupleProperty.builder()

  public fun targetGroupArn(targetGroupArn: String) {
    cdkBuilder.targetGroupArn(targetGroupArn)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnListener.TargetGroupTupleProperty = cdkBuilder.build()
}
