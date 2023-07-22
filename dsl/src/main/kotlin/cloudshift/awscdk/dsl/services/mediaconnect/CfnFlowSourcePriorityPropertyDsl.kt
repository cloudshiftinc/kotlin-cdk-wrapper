@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnFlow

@CdkDslMarker
public class CfnFlowSourcePriorityPropertyDsl {
  private val cdkBuilder: CfnFlow.SourcePriorityProperty.Builder =
      CfnFlow.SourcePriorityProperty.builder()

  /**
   * @param primarySource The name of the source you choose as the primary source for this flow. 
   */
  public fun primarySource(primarySource: String) {
    cdkBuilder.primarySource(primarySource)
  }

  public fun build(): CfnFlow.SourcePriorityProperty = cdkBuilder.build()
}
