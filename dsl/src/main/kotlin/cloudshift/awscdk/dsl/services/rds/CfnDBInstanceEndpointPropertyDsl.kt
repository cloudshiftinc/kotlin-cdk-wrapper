@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBInstance

/**
 * This data type represents the information you need to connect to an Amazon RDS DB instance.
 *
 * This data type is used as a response element in the following actions:
 *
 * * `CreateDBInstance`
 * * `DescribeDBInstances`
 * * `DeleteDBInstance`
 *
 * For the data structure that represents Amazon Aurora DB cluster endpoints, see
 * `DBClusterEndpoint` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * EndpointProperty endpointProperty = EndpointProperty.builder()
 * .address("address")
 * .hostedZoneId("hostedZoneId")
 * .port("port")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-endpoint.html)
 */
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
