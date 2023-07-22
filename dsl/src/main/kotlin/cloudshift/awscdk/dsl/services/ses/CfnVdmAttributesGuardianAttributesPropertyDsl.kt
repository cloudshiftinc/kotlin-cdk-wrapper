@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnVdmAttributes

@CdkDslMarker
public class CfnVdmAttributesGuardianAttributesPropertyDsl {
  private val cdkBuilder: CfnVdmAttributes.GuardianAttributesProperty.Builder =
      CfnVdmAttributes.GuardianAttributesProperty.builder()

  /**
   * @param optimizedSharedDelivery Specifies the status of your VDM optimized shared delivery. Can
   * be one of the following:.
   * * `ENABLED` – Amazon SES enables optimized shared delivery for your account.
   * * `DISABLED` – Amazon SES disables optimized shared delivery for your account.
   */
  public fun optimizedSharedDelivery(optimizedSharedDelivery: String) {
    cdkBuilder.optimizedSharedDelivery(optimizedSharedDelivery)
  }

  public fun build(): CfnVdmAttributes.GuardianAttributesProperty = cdkBuilder.build()
}
