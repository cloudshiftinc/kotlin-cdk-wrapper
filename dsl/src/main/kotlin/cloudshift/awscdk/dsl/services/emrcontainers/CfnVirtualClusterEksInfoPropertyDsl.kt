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

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

/**
 * The information about the Amazon EKS cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrcontainers.*;
 * EksInfoProperty eksInfoProperty = EksInfoProperty.builder()
 * .namespace("namespace")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-eksinfo.html)
 */
@CdkDslMarker
public class CfnVirtualClusterEksInfoPropertyDsl {
    private val cdkBuilder: CfnVirtualCluster.EksInfoProperty.Builder =
        CfnVirtualCluster.EksInfoProperty.builder()

    /**
     * @param namespace The namespaces of the EKS cluster. *Minimum* : 1
     *
     * *Maximum* : 63
     *
     * *Pattern* : `[a-z0-9]([-a-z0-9]*[a-z0-9])?`
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnVirtualCluster.EksInfoProperty = cdkBuilder.build()
}
