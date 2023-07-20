@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

@CdkDslMarker
public class CfnFleetCertificateConfigurationPropertyDsl {
  private val cdkBuilder: CfnFleet.CertificateConfigurationProperty.Builder =
      CfnFleet.CertificateConfigurationProperty.builder()

  public fun certificateType(certificateType: String) {
    cdkBuilder.certificateType(certificateType)
  }

  public fun build(): CfnFleet.CertificateConfigurationProperty = cdkBuilder.build()
}
