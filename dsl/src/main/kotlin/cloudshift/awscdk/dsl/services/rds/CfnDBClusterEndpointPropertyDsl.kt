@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBCluster

/**
 * The `Endpoint` return value specifies the connection endpoint for the primary instance of the DB
 * cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * EndpointProperty endpointProperty = EndpointProperty.builder()
 * .address("address")
 * .port("port")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-endpoint.html)
 */
@CdkDslMarker
public class CfnDBClusterEndpointPropertyDsl {
    private val cdkBuilder: CfnDBCluster.EndpointProperty.Builder =
        CfnDBCluster.EndpointProperty.builder()

    /**
     * @param address Specifies the connection endpoint for the primary instance of the DB cluster.
     */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /** @param port Specifies the port that the database engine is listening on. */
    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDBCluster.EndpointProperty = cdkBuilder.build()
}
