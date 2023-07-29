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
import kotlin.String
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.Cluster
import software.constructs.Construct

/**
 * Manages mapping between IAM users and roles to Kubernetes RBAC configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * Cluster cluster;
 * AwsAuth awsAuth = AwsAuth.Builder.create(this, "MyAwsAuth")
 * .cluster(cluster)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/en_us/eks/latest/userguide/add-user-role.html)
 */
@CdkDslMarker
public class AwsAuthDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AwsAuth.Builder = AwsAuth.Builder.create(scope, id)

    /**
     * The EKS cluster to apply this configuration to.
     *
     * [disable-awslint:ref-via-interface]
     *
     * @param cluster The EKS cluster to apply this configuration to.
     */
    public fun cluster(cluster: Cluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun build(): AwsAuth = cdkBuilder.build()
}
