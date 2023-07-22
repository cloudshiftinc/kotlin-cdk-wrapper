@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBInstance

@CdkDslMarker
public class CfnDBInstanceEndpointPropertyDsl {
  private val cdkBuilder: CfnDBInstance.EndpointProperty.Builder =
      CfnDBInstance.EndpointProperty.builder()

  /**
   * @param address Specifies the DNS address of the DB instance.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param hostedZoneId Specifies the ID that Amazon Route 53 assigns when you create a hosted
   * zone.
   */
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  /**
   * @param port Specifies the port that the database engine is listening on.
   */
  public fun port(port: String) {
    cdkBuilder.port(port)
  }

  public fun build(): CfnDBInstance.EndpointProperty = cdkBuilder.build()
}
