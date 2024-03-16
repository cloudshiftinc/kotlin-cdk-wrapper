@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.IOpenIdConnectProvider
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * An EKS cluster.
 */
public interface ICluster : IResource, IConnectable {
  /**
   * Defines a CDK8s chart in this cluster.
   *
   * @return a `KubernetesManifest` construct representing the chart.
   * @param id logical id of this chart. 
   * @param chart the cdk8s chart. 
   * @param options
   */
  public fun addCdk8sChart(id: String, chart: Construct): KubernetesManifest

  /**
   * Defines a CDK8s chart in this cluster.
   *
   * @return a `KubernetesManifest` construct representing the chart.
   * @param id logical id of this chart. 
   * @param chart the cdk8s chart. 
   * @param options
   */
  public fun addCdk8sChart(
    id: String,
    chart: Construct,
    options: KubernetesManifestOptions,
  ): KubernetesManifest

  /**
   * Defines a CDK8s chart in this cluster.
   *
   * @return a `KubernetesManifest` construct representing the chart.
   * @param id logical id of this chart. 
   * @param chart the cdk8s chart. 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4aa4d5820d067ab42381b831bba59abb594ff3ec3fffee74d03c34cc3e2a1a91")
  public fun addCdk8sChart(
    id: String,
    chart: Construct,
    options: KubernetesManifestOptions.Builder.() -> Unit,
  ): KubernetesManifest

  /**
   * Defines a Helm chart in this cluster.
   *
   * @return a `HelmChart` construct
   * @param id logical id of this chart. 
   * @param options options of this chart. 
   */
  public fun addHelmChart(id: String, options: HelmChartOptions): HelmChart

  /**
   * Defines a Helm chart in this cluster.
   *
   * @return a `HelmChart` construct
   * @param id logical id of this chart. 
   * @param options options of this chart. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("390cea0e170c7ad005d57b32e1fc98aa144800a81fa525deaaaed667af0283fe")
  public fun addHelmChart(id: String, options: HelmChartOptions.Builder.() -> Unit): HelmChart

  /**
   * Defines a Kubernetes resource in this cluster.
   *
   * The manifest will be applied/deleted using kubectl as needed.
   *
   * @return a `KubernetesManifest` object.
   * @param id logical id of this manifest. 
   * @param manifest a list of Kubernetes resource specifications. 
   */
  public fun addManifest(id: String, manifest: Map<String, Any>): KubernetesManifest

  /**
   * Creates a new service account with corresponding IAM Role (IRSA).
   *
   * @param id logical id of service account. 
   * @param options service account options.
   */
  public fun addServiceAccount(id: String): ServiceAccount

  /**
   * Creates a new service account with corresponding IAM Role (IRSA).
   *
   * @param id logical id of service account. 
   * @param options service account options.
   */
  public fun addServiceAccount(id: String, options: ServiceAccountOptions): ServiceAccount

  /**
   * Creates a new service account with corresponding IAM Role (IRSA).
   *
   * @param id logical id of service account. 
   * @param options service account options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1c04bf62363d27f7f1fcd0ee00a0a93e786f9d5a35ef2d9e35f27368f469899")
  public fun addServiceAccount(id: String, options: ServiceAccountOptions.Builder.() -> Unit):
      ServiceAccount

  /**
   * An AWS Lambda layer that contains the `aws` CLI.
   *
   * If not defined, a default layer will be used containing the AWS CLI 1.x.
   */
  public fun awscliLayer(): ILayerVersion? = unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

  /**
   * The unique ARN assigned to the service by AWS in the form of arn:aws:eks:.
   */
  public fun clusterArn(): String

  /**
   * The certificate-authority-data for your cluster.
   */
  public fun clusterCertificateAuthorityData(): String

  /**
   * Amazon Resource Name (ARN) or alias of the customer master key (CMK).
   */
  public fun clusterEncryptionConfigKeyArn(): String

  /**
   * The API Server endpoint URL.
   */
  public fun clusterEndpoint(): String

  /**
   * A security group to associate with the Cluster Handler's Lambdas.
   *
   * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
   *
   * Requires `placeClusterHandlerInVpc` to be set to true.
   *
   * Default: - No security group.
   */
  public fun clusterHandlerSecurityGroup(): ISecurityGroup? =
      unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * The physical name of the Cluster.
   */
  public fun clusterName(): String

  /**
   * The cluster security group that was created by Amazon EKS for the cluster.
   */
  public fun clusterSecurityGroup(): ISecurityGroup

  /**
   * The id of the cluster security group that was created by Amazon EKS for the cluster.
   */
  public fun clusterSecurityGroupId(): String

  /**
   * Connect capacity in the form of an existing AutoScalingGroup to the EKS cluster.
   *
   * The AutoScalingGroup must be running an EKS-optimized AMI containing the
   * /etc/eks/bootstrap.sh script. This method will configure Security Groups,
   * add the right policies to the instance role, apply the right tags, and add
   * the required user data to the instance's launch configuration.
   *
   * Spot instances will be labeled `lifecycle=Ec2Spot` and tainted with `PreferNoSchedule`.
   * If kubectl is enabled, the
   * [spot interrupt
   * handler](https://github.com/awslabs/ec2-spot-labs/tree/master/ec2-spot-eks-solution/spot-termination-handler)
   * daemon will be installed on all spot instances to handle
   * [EC2 Spot Instance Termination
   * Notices](https://aws.amazon.com/blogs/aws/new-ec2-spot-instance-termination-notices/).
   *
   * Prefer to use `addAutoScalingGroupCapacity` if possible.
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html)
   * @param autoScalingGroup [disable-awslint:ref-via-interface]. 
   * @param options options for adding auto scaling groups, like customizing the bootstrap script. 
   */
  public fun connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
      options: AutoScalingGroupOptions)

  /**
   * Connect capacity in the form of an existing AutoScalingGroup to the EKS cluster.
   *
   * The AutoScalingGroup must be running an EKS-optimized AMI containing the
   * /etc/eks/bootstrap.sh script. This method will configure Security Groups,
   * add the right policies to the instance role, apply the right tags, and add
   * the required user data to the instance's launch configuration.
   *
   * Spot instances will be labeled `lifecycle=Ec2Spot` and tainted with `PreferNoSchedule`.
   * If kubectl is enabled, the
   * [spot interrupt
   * handler](https://github.com/awslabs/ec2-spot-labs/tree/master/ec2-spot-eks-solution/spot-termination-handler)
   * daemon will be installed on all spot instances to handle
   * [EC2 Spot Instance Termination
   * Notices](https://aws.amazon.com/blogs/aws/new-ec2-spot-instance-termination-notices/).
   *
   * Prefer to use `addAutoScalingGroupCapacity` if possible.
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html)
   * @param autoScalingGroup [disable-awslint:ref-via-interface]. 
   * @param options options for adding auto scaling groups, like customizing the bootstrap script. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("14775e4c3ffbed9dd29c98a40fe0f205fa9aac6c3d18b1d2bf8d6614dd76554c")
  public fun connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
      options: AutoScalingGroupOptions.Builder.() -> Unit)

  /**
   * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
   *
   * Default: - IpFamily.IP_V4
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
   */
  public fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

  /**
   * Custom environment variables when running `kubectl` against this cluster.
   */
  public fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
      emptyMap()

  /**
   * An IAM role that can perform kubectl operations against this cluster.
   *
   * The role should be mapped to the `system:masters` Kubernetes RBAC role.
   *
   * This role is directly passed to the lambda handler that sends Kube Ctl commands to the cluster.
   */
  public fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

  /**
   * An AWS Lambda layer that includes `kubectl` and `helm`.
   *
   * If not defined, a default layer will be used containing Kubectl 1.20 and Helm 3.8
   */
  public fun kubectlLayer(): ILayerVersion? =
      unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

  /**
   * Amount of memory to allocate to the provider's lambda function.
   */
  public fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

  /**
   * Subnets to host the `kubectl` compute resources.
   *
   * If this is undefined, the k8s endpoint is expected to be accessible
   * publicly.
   */
  public fun kubectlPrivateSubnets(): List<ISubnet> =
      unwrap(this).getKubectlPrivateSubnets()?.map(ISubnet::wrap) ?: emptyList()

  /**
   * Kubectl Provider for issuing kubectl commands against it.
   *
   * If not defined, a default provider will be used
   */
  public fun kubectlProvider(): IKubectlProvider? =
      unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

  /**
   * An IAM role that can perform kubectl operations against this cluster.
   *
   * The role should be mapped to the `system:masters` Kubernetes RBAC role.
   */
  public fun kubectlRole(): IRole? = unwrap(this).getKubectlRole()?.let(IRole::wrap)

  /**
   * A security group to use for `kubectl` execution.
   *
   * If this is undefined, the k8s endpoint is expected to be accessible
   * publicly.
   */
  public fun kubectlSecurityGroup(): ISecurityGroup? =
      unwrap(this).getKubectlSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * An AWS Lambda layer that includes the NPM dependency `proxy-agent`.
   *
   * If not defined, a default layer will be used.
   */
  public fun onEventLayer(): ILayerVersion? =
      unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

  /**
   * The Open ID Connect Provider of the cluster used to configure Service Accounts.
   */
  public fun openIdConnectProvider(): IOpenIdConnectProvider

  /**
   * Indicates whether Kubernetes resources can be automatically pruned.
   *
   * When
   * this is enabled (default), prune labels will be allocated and injected to
   * each resource. These labels will then be used when issuing the `kubectl apply` operation with
   * the `--prune` switch.
   */
  public fun prune(): Boolean

  /**
   * The VPC in which this Cluster was created.
   */
  public fun vpc(): IVpc

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ICluster): ICluster =
        CdkObjectWrappers.wrap(cdkObject) as ICluster

    internal fun unwrap(wrapped: ICluster): software.amazon.awscdk.services.eks.ICluster = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.eks.ICluster
  }
}
