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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.Ec2ServiceAttributes
import software.amazon.awscdk.services.ecs.ICluster

/**
 * The properties to import from the service using the EC2 launch type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * Cluster cluster;
 * Ec2ServiceAttributes ec2ServiceAttributes = Ec2ServiceAttributes.builder()
 * .cluster(cluster)
 * // the properties below are optional
 * .serviceArn("serviceArn")
 * .serviceName("serviceName")
 * .build();
 * ```
 */
@CdkDslMarker
public class Ec2ServiceAttributesDsl {
    private val cdkBuilder: Ec2ServiceAttributes.Builder = Ec2ServiceAttributes.builder()

    /** @param cluster The cluster that hosts the service. */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /** @param serviceArn The service ARN. */
    public fun serviceArn(serviceArn: String) {
        cdkBuilder.serviceArn(serviceArn)
    }

    /** @param serviceName The name of the service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): Ec2ServiceAttributes = cdkBuilder.build()
}
