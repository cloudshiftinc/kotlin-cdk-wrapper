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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnCluster

/**
 * Describes a connection endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * EndpointProperty endpointProperty = EndpointProperty.builder()
 * .address("address")
 * .port("port")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-endpoint.html)
 */
@CdkDslMarker
public class CfnClusterEndpointPropertyDsl {
    private val cdkBuilder: CfnCluster.EndpointProperty.Builder =
        CfnCluster.EndpointProperty.builder()

    /** @param address The DNS address of the cluster. This property is read only. */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /**
     * @param port The port that the database engine is listening on. This property is read only.
     */
    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnCluster.EndpointProperty = cdkBuilder.build()
}
