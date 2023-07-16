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

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun offPeakWindow(offPeakWindow: IResolvable) {
    cdkBuilder.offPeakWindow(offPeakWindow)
  }

  public fun offPeakWindow(offPeakWindow: CfnDomain.OffPeakWindowProperty) {
    cdkBuilder.offPeakWindow(offPeakWindow)
  }

  public fun build(): CfnDomain.OffPeakWindowOptionsProperty = cdkBuilder.build()
}
