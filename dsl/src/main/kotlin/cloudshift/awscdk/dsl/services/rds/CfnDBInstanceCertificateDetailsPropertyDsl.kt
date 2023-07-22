@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBInstance

@CdkDslMarker
public class CfnDBInstanceCertificateDetailsPropertyDsl {
  private val cdkBuilder: CfnDBInstance.CertificateDetailsProperty.Builder =
      CfnDBInstance.CertificateDetailsProperty.builder()

  /**
   * @param caIdentifier The CA identifier of the CA certificate used for the DB instance's server
   * certificate.
   */
  public fun caIdentifier(caIdentifier: String) {
    cdkBuilder.caIdentifier(caIdentifier)
  }

  /**
   * @param validTill The expiration date of the DB instance’s server certificate.
   */
  public fun validTill(validTill: String) {
    cdkBuilder.validTill(validTill)
  }

  public fun build(): CfnDBInstance.CertificateDetailsProperty = cdkBuilder.build()
}
