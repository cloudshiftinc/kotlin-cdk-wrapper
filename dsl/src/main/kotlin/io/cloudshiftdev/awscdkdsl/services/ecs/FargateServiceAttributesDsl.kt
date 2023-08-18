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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.FargateServiceAttributes
import software.amazon.awscdk.services.ecs.ICluster

/**
 * The properties to import from the service using the Fargate launch type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * Cluster cluster;
 * FargateServiceAttributes fargateServiceAttributes = FargateServiceAttributes.builder()
 * .cluster(cluster)
 * // the properties below are optional
 * .serviceArn("serviceArn")
 * .serviceName("serviceName")
 * .build();
 * ```
 */
@CdkDslMarker
public class FargateServiceAttributesDsl {
    private val cdkBuilder: FargateServiceAttributes.Builder = FargateServiceAttributes.builder()

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

    public fun build(): FargateServiceAttributes = cdkBuilder.build()
}
