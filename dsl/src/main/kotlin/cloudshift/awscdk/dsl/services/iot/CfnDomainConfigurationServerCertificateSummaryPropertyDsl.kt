@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnDomainConfiguration

@CdkDslMarker
public class CfnDomainConfigurationServerCertificateSummaryPropertyDsl {
  private val cdkBuilder: CfnDomainConfiguration.ServerCertificateSummaryProperty.Builder =
      CfnDomainConfiguration.ServerCertificateSummaryProperty.builder()

  /**
   * @param serverCertificateArn The ARN of the server certificate.
   */
  public fun serverCertificateArn(serverCertificateArn: String) {
    cdkBuilder.serverCertificateArn(serverCertificateArn)
  }

  /**
   * @param serverCertificateStatus The status of the server certificate.
   */
  public fun serverCertificateStatus(serverCertificateStatus: String) {
    cdkBuilder.serverCertificateStatus(serverCertificateStatus)
  }

  /**
   * @param serverCertificateStatusDetail Details that explain the status of the server certificate.
   */
  public fun serverCertificateStatusDetail(serverCertificateStatusDetail: String) {
    cdkBuilder.serverCertificateStatusDetail(serverCertificateStatusDetail)
  }

  public fun build(): CfnDomainConfiguration.ServerCertificateSummaryProperty = cdkBuilder.build()
}
