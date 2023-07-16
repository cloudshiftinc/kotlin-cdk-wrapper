@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ses.VdmAttributesProps

@CdkDslMarker
public class VdmAttributesPropsDsl {
  private val cdkBuilder: VdmAttributesProps.Builder = VdmAttributesProps.builder()

  public fun engagementMetrics(engagementMetrics: Boolean) {
    cdkBuilder.engagementMetrics(engagementMetrics)
  }

  public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
    cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
  }

  public fun build(): VdmAttributesProps = cdkBuilder.build()
}
