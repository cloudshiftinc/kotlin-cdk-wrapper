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
import software.amazon.awscdk.services.eks.KubectlProviderAttributes
import software.amazon.awscdk.services.iam.IRole

/**
 * Kubectl Provider Attributes.
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
public class KubectlProviderAttributesDsl {
    private val cdkBuilder: KubectlProviderAttributes.Builder = KubectlProviderAttributes.builder()

    /** @param functionArn The custom resource provider's service token. */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param handlerRole The IAM execution role of the handler. This role must be able to assume
     *   kubectlRoleArn
     */
    public fun handlerRole(handlerRole: IRole) {
        cdkBuilder.handlerRole(handlerRole)
    }

    /**
     * @param kubectlRoleArn The IAM role to assume in order to perform kubectl operations against
     *   this cluster.
     */
    public fun kubectlRoleArn(kubectlRoleArn: String) {
        cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    public fun build(): KubectlProviderAttributes = cdkBuilder.build()
}
