@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@CdkDslMarker
public class CfnDomainOffPeakWindowOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.OffPeakWindowOptionsProperty.Builder =
      CfnDomain.OffPeakWindowOptionsProperty.builder()

  /**
   * @param enabled Specifies whether off-peak window settings are enabled for the domain.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether off-peak window settings are enabled for the domain.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param offPeakWindow Off-peak window settings for the domain.
   */
  public fun offPeakWindow(offPeakWindow: IResolvable) {
    cdkBuilder.offPeakWindow(offPeakWindow)
  }

  /**
   * @param offPeakWindow Off-peak window settings for the domain.
   */
  public fun offPeakWindow(offPeakWindow: CfnDomain.OffPeakWindowProperty) {
    cdkBuilder.offPeakWindow(offPeakWindow)
  }

  public fun build(): CfnDomain.OffPeakWindowOptionsProperty = cdkBuilder.build()
}
