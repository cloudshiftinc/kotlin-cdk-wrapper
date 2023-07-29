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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.AwsAuthProps
import software.amazon.awscdk.services.eks.Cluster

/**
 * Configuration props for the AwsAuth construct.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * Cluster cluster;
 * AwsAuthProps awsAuthProps = AwsAuthProps.builder()
 * .cluster(cluster)
 * .build();
 * ```
 */
@CdkDslMarker
public class AwsAuthPropsDsl {
    private val cdkBuilder: AwsAuthProps.Builder = AwsAuthProps.builder()

    /**
     * @param cluster The EKS cluster to apply this configuration to.
     *   [disable-awslint:ref-via-interface]
     */
    public fun cluster(cluster: Cluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun build(): AwsAuthProps = cdkBuilder.build()
}
