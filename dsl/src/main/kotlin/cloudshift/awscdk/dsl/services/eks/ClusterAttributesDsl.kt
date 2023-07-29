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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.eks.ClusterAttributes
import software.amazon.awscdk.services.eks.IKubectlProvider
import software.amazon.awscdk.services.eks.IpFamily
import software.amazon.awscdk.services.iam.IOpenIdConnectProvider
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.ILayerVersion

/**
 * Attributes for EKS clusters.
 *
 * Example:
 * ```
 * Cluster cluster;
 * AutoScalingGroup asg;
 * ICluster importedCluster = Cluster.fromClusterAttributes(this, "ImportedCluster",
 * ClusterAttributes.builder()
 * .clusterName(cluster.getClusterName())
 * .clusterSecurityGroupId(cluster.getClusterSecurityGroupId())
 * .build());
 * importedCluster.connectAutoScalingGroupCapacity(asg, AutoScalingGroupOptions.builder().build());
 * ```
 */
@CdkDslMarker
public class ClusterAttributesDsl {
    private val cdkBuilder: ClusterAttributes.Builder = ClusterAttributes.builder()

    private val _kubectlPrivateSubnetIds: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    /**
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI. The handler expects the
     *   layer to include the following executables:
     * ```
     * /opt/awscli/aws
     * ```
     */
    public fun awscliLayer(awscliLayer: ILayerVersion) {
        cdkBuilder.awscliLayer(awscliLayer)
    }

    /** @param clusterCertificateAuthorityData The certificate-authority-data for your cluster. */
    public fun clusterCertificateAuthorityData(clusterCertificateAuthorityData: String) {
        cdkBuilder.clusterCertificateAuthorityData(clusterCertificateAuthorityData)
    }

    /**
     * @param clusterEncryptionConfigKeyArn Amazon Resource Name (ARN) or alias of the customer
     *   master key (CMK).
     */
    public fun clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn: String) {
        cdkBuilder.clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn)
    }

    /** @param clusterEndpoint The API Server endpoint URL. */
    public fun clusterEndpoint(clusterEndpoint: String) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    /**
     * @param clusterHandlerSecurityGroupId A security group id to associate with the Cluster
     *   Handler's Lambdas. The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     */
    public fun clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId: String) {
        cdkBuilder.clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId)
    }

    /** @param clusterName The physical name of the Cluster. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param clusterSecurityGroupId The cluster security group that was created by Amazon EKS for
     *   the cluster.
     */
    public fun clusterSecurityGroupId(clusterSecurityGroupId: String) {
        cdkBuilder.clusterSecurityGroupId(clusterSecurityGroupId)
    }

    /**
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     *   addresses.
     */
    public fun ipFamily(ipFamily: IpFamily) {
        cdkBuilder.ipFamily(ipFamily)
    }

    /**
     * @param kubectlEnvironment Environment variables to use when running `kubectl` against this
     *   cluster.
     */
    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
        cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    /**
     * @param kubectlLambdaRole An IAM role that can perform kubectl operations against this
     *   cluster. The role should be mapped to the `system:masters` Kubernetes RBAC role.
     *
     * This role is directly passed to the lambda handler that sends Kube Ctl commands to the
     * cluster.
     */
    public fun kubectlLambdaRole(kubectlLambdaRole: IRole) {
        cdkBuilder.kubectlLambdaRole(kubectlLambdaRole)
    }

    /**
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm. This layer is used
     *   by the kubectl handler to apply manifests and install helm charts. You must pick an
     *   appropriate releases of one of the `&#64;aws-cdk/layer-kubectl-vXX` packages, that works
     *   with the version of Kubernetes you have chosen. If you don't supply this value `kubectl`
     *   1.20 will be used, but that version is most likely too old.
     *
     * The handler expects the layer to include the following executables:
     * ```
     * /opt/helm/helm
     * /opt/kubectl/kubectl
     * ```
     */
    public fun kubectlLayer(kubectlLayer: ILayerVersion) {
        cdkBuilder.kubectlLayer(kubectlLayer)
    }

    /** @param kubectlMemory Amount of memory to allocate to the provider's lambda function. */
    public fun kubectlMemory(kubectlMemory: Size) {
        cdkBuilder.kubectlMemory(kubectlMemory)
    }

    /**
     * @param kubectlPrivateSubnetIds Subnets to host the `kubectl` compute resources. If not
     *   specified, the k8s endpoint is expected to be accessible publicly.
     */
    public fun kubectlPrivateSubnetIds(vararg kubectlPrivateSubnetIds: String) {
        _kubectlPrivateSubnetIds.addAll(listOf(*kubectlPrivateSubnetIds))
    }

    /**
     * @param kubectlPrivateSubnetIds Subnets to host the `kubectl` compute resources. If not
     *   specified, the k8s endpoint is expected to be accessible publicly.
     */
    public fun kubectlPrivateSubnetIds(kubectlPrivateSubnetIds: Collection<String>) {
        _kubectlPrivateSubnetIds.addAll(kubectlPrivateSubnetIds)
    }

    /** @param kubectlProvider KubectlProvider for issuing kubectl commands. */
    public fun kubectlProvider(kubectlProvider: IKubectlProvider) {
        cdkBuilder.kubectlProvider(kubectlProvider)
    }

    /**
     * @param kubectlRoleArn An IAM role with cluster administrator and "system:masters"
     *   permissions.
     */
    public fun kubectlRoleArn(kubectlRoleArn: String) {
        cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    /**
     * @param kubectlSecurityGroupId A security group to use for `kubectl` execution. If not
     *   specified, the k8s endpoint is expected to be accessible publicly.
     */
    public fun kubectlSecurityGroupId(kubectlSecurityGroupId: String) {
        cdkBuilder.kubectlSecurityGroupId(kubectlSecurityGroupId)
    }

    /**
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`. This
     *   layer is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * The handler expects the layer to include the following node_modules:
     *
     * proxy-agent
     */
    public fun onEventLayer(onEventLayer: ILayerVersion) {
        cdkBuilder.onEventLayer(onEventLayer)
    }

    /**
     * @param openIdConnectProvider An Open ID Connect provider for this cluster that can be used to
     *   configure service accounts. You can either import an existing provider using
     *   `iam.OpenIdConnectProvider.fromProviderArn`, or create a new provider using `new
     *   eks.OpenIdConnectProvider`
     */
    public fun openIdConnectProvider(openIdConnectProvider: IOpenIdConnectProvider) {
        cdkBuilder.openIdConnectProvider(openIdConnectProvider)
    }

    /**
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     *   automatically pruned. When this is enabled (default), prune labels will be allocated and
     *   injected to each resource. These labels will then be used when issuing the `kubectl apply`
     *   operation with the `--prune` switch.
     */
    public fun prune(prune: Boolean) {
        cdkBuilder.prune(prune)
    }

    /** @param securityGroupIds Additional security groups associated with this cluster. */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /** @param securityGroupIds Additional security groups associated with this cluster. */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /** @param vpc The VPC in which this Cluster was created. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ClusterAttributes {
        if (_kubectlPrivateSubnetIds.isNotEmpty())
            cdkBuilder.kubectlPrivateSubnetIds(_kubectlPrivateSubnetIds)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
