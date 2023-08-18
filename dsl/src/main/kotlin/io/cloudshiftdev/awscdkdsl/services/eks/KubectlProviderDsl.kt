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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubectlProvider
import software.constructs.Construct

/**
 * Implementation of Kubectl Lambda.
 *
 * Example:
 * ```
 * IRole handlerRole = Role.fromRoleArn(this, "HandlerRole",
 * "arn:aws:iam::123456789012:role/lambda-role");
 * // get the serivceToken from the custom resource provider
 * String functionArn = Function.fromFunctionName(this, "ProviderOnEventFunc",
 * "ProviderframeworkonEvent-XXX").getFunctionArn();
 * IKubectlProvider kubectlProvider = KubectlProvider.fromKubectlProviderAttributes(this,
 * "KubectlProvider", KubectlProviderAttributes.builder()
 * .functionArn(functionArn)
 * .kubectlRoleArn("arn:aws:iam::123456789012:role/kubectl-role")
 * .handlerRole(handlerRole)
 * .build());
 * ICluster cluster = Cluster.fromClusterAttributes(this, "Cluster", ClusterAttributes.builder()
 * .clusterName("cluster")
 * .kubectlProvider(kubectlProvider)
 * .build());
 * ```
 */
@CdkDslMarker
public class KubectlProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: KubectlProvider.Builder = KubectlProvider.Builder.create(scope, id)

    /**
     * The cluster to control.
     *
     * @param cluster The cluster to control.
     */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun build(): KubectlProvider = cdkBuilder.build()
}
