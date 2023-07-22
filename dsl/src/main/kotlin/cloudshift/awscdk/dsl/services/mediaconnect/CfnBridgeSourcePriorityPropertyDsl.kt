@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeSourcePriorityPropertyDsl {
  private val cdkBuilder: CfnBridge.SourcePriorityProperty.Builder =
      CfnBridge.SourcePriorityProperty.builder()

  /**
   * @param primarySource The name of the source you choose as the primary source for this flow.
   */
  public fun primarySource(primarySource: String) {
    cdkBuilder.primarySource(primarySource)
  }

  public fun build(): CfnBridge.SourcePriorityProperty = cdkBuilder.build()
}
