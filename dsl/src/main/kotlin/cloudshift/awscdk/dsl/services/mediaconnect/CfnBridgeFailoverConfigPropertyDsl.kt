@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeFailoverConfigPropertyDsl {
  private val cdkBuilder: CfnBridge.FailoverConfigProperty.Builder =
      CfnBridge.FailoverConfigProperty.builder()

  public fun failoverMode(failoverMode: String) {
    cdkBuilder.failoverMode(failoverMode)
  }

  public fun sourcePriority(sourcePriority: IResolvable) {
    cdkBuilder.sourcePriority(sourcePriority)
  }

  public fun sourcePriority(sourcePriority: CfnBridge.SourcePriorityProperty) {
    cdkBuilder.sourcePriority(sourcePriority)
  }

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnBridge.FailoverConfigProperty = cdkBuilder.build()
}
