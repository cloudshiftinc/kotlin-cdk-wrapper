@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ses.VdmAttributesProps

@CdkDslMarker
public class VdmAttributesPropsDsl {
  private val cdkBuilder: VdmAttributesProps.Builder = VdmAttributesProps.builder()

  /**
   * @param engagementMetrics Whether engagement metrics are enabled for your account.
   */
  public fun engagementMetrics(engagementMetrics: Boolean) {
    cdkBuilder.engagementMetrics(engagementMetrics)
  }

  /**
   * @param optimizedSharedDelivery Whether optimized shared delivery is enabled for your account.
   */
  public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
    cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
  }

  public fun build(): VdmAttributesProps = cdkBuilder.build()
}
