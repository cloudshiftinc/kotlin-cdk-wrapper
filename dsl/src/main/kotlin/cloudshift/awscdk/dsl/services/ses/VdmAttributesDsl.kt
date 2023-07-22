@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ses.VdmAttributes
import software.constructs.Construct

@CdkDslMarker
public class VdmAttributesDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: VdmAttributes.Builder = VdmAttributes.Builder.create(scope, id)

  /**
   * Whether engagement metrics are enabled for your account.
   *
   * Default: true
   *
   * @param engagementMetrics Whether engagement metrics are enabled for your account. 
   */
  public fun engagementMetrics(engagementMetrics: Boolean) {
    cdkBuilder.engagementMetrics(engagementMetrics)
  }

  /**
   * Whether optimized shared delivery is enabled for your account.
   *
   * Default: true
   *
   * @param optimizedSharedDelivery Whether optimized shared delivery is enabled for your account. 
   */
  public fun optimizedSharedDelivery(optimizedSharedDelivery: Boolean) {
    cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
  }

  public fun build(): VdmAttributes = cdkBuilder.build()
}
