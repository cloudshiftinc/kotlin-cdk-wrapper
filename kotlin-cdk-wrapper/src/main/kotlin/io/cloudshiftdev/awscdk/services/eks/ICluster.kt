@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.IOpenIdConnectProvider
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
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
  public fun addManifest(id: String, vararg manifest: Map<String, Any>): KubernetesManifest

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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.ICluster,
  ) : CdkObject(cdkObject), ICluster {
    /**
     * Defines a CDK8s chart in this cluster.
     *
     * @return a `KubernetesManifest` construct representing the chart.
     * @param id logical id of this chart. 
     * @param chart the cdk8s chart. 
     * @param options
     */
    override fun addCdk8sChart(id: String, chart: Construct): KubernetesManifest =
        unwrap(this).addCdk8sChart(id, chart.let(Construct::unwrap)).let(KubernetesManifest::wrap)

    /**
     * Defines a CDK8s chart in this cluster.
     *
     * @return a `KubernetesManifest` construct representing the chart.
     * @param id logical id of this chart. 
     * @param chart the cdk8s chart. 
     * @param options
     */
    override fun addCdk8sChart(
      id: String,
      chart: Construct,
      options: KubernetesManifestOptions,
    ): KubernetesManifest = unwrap(this).addCdk8sChart(id, chart.let(Construct::unwrap),
        options.let(KubernetesManifestOptions::unwrap)).let(KubernetesManifest::wrap)

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
    override fun addCdk8sChart(
      id: String,
      chart: Construct,
      options: KubernetesManifestOptions.Builder.() -> Unit,
    ): KubernetesManifest = addCdk8sChart(id, chart, KubernetesManifestOptions(options))

    /**
     * Defines a Helm chart in this cluster.
     *
     * @return a `HelmChart` construct
     * @param id logical id of this chart. 
     * @param options options of this chart. 
     */
    override fun addHelmChart(id: String, options: HelmChartOptions): HelmChart =
        unwrap(this).addHelmChart(id, options.let(HelmChartOptions::unwrap)).let(HelmChart::wrap)

    /**
     * Defines a Helm chart in this cluster.
     *
     * @return a `HelmChart` construct
     * @param id logical id of this chart. 
     * @param options options of this chart. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("390cea0e170c7ad005d57b32e1fc98aa144800a81fa525deaaaed667af0283fe")
    override fun addHelmChart(id: String, options: HelmChartOptions.Builder.() -> Unit): HelmChart =
        addHelmChart(id, HelmChartOptions(options))

    /**
     * Defines a Kubernetes resource in this cluster.
     *
     * The manifest will be applied/deleted using kubectl as needed.
     *
     * @return a `KubernetesManifest` object.
     * @param id logical id of this manifest. 
     * @param manifest a list of Kubernetes resource specifications. 
     */
    override fun addManifest(id: String, vararg manifest: Map<String, Any>): KubernetesManifest =
        unwrap(this).addManifest(id, *manifest).let(KubernetesManifest::wrap)

    /**
     * Creates a new service account with corresponding IAM Role (IRSA).
     *
     * @param id logical id of service account. 
     * @param options service account options.
     */
    override fun addServiceAccount(id: String): ServiceAccount =
        unwrap(this).addServiceAccount(id).let(ServiceAccount::wrap)

    /**
     * Creates a new service account with corresponding IAM Role (IRSA).
     *
     * @param id logical id of service account. 
     * @param options service account options.
     */
    override fun addServiceAccount(id: String, options: ServiceAccountOptions): ServiceAccount =
        unwrap(this).addServiceAccount(id,
        options.let(ServiceAccountOptions::unwrap)).let(ServiceAccount::wrap)

    /**
     * Creates a new service account with corresponding IAM Role (IRSA).
     *
     * @param id logical id of service account. 
     * @param options service account options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1c04bf62363d27f7f1fcd0ee00a0a93e786f9d5a35ef2d9e35f27368f469899")
    override fun addServiceAccount(id: String, options: ServiceAccountOptions.Builder.() -> Unit):
        ServiceAccount = addServiceAccount(id, ServiceAccountOptions(options))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * An AWS Lambda layer that contains the `aws` CLI.
     *
     * If not defined, a default layer will be used containing the AWS CLI 1.x.
     */
    override fun awscliLayer(): ILayerVersion? =
        unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

    /**
     * The unique ARN assigned to the service by AWS in the form of arn:aws:eks:.
     */
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    /**
     * The certificate-authority-data for your cluster.
     */
    override fun clusterCertificateAuthorityData(): String =
        unwrap(this).getClusterCertificateAuthorityData()

    /**
     * Amazon Resource Name (ARN) or alias of the customer master key (CMK).
     */
    override fun clusterEncryptionConfigKeyArn(): String =
        unwrap(this).getClusterEncryptionConfigKeyArn()

    /**
     * The API Server endpoint URL.
     */
    override fun clusterEndpoint(): String = unwrap(this).getClusterEndpoint()

    /**
     * A security group to associate with the Cluster Handler's Lambdas.
     *
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Requires `placeClusterHandlerInVpc` to be set to true.
     *
     * Default: - No security group.
     */
    override fun clusterHandlerSecurityGroup(): ISecurityGroup? =
        unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The physical name of the Cluster.
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The cluster security group that was created by Amazon EKS for the cluster.
     */
    override fun clusterSecurityGroup(): ISecurityGroup =
        unwrap(this).getClusterSecurityGroup().let(ISecurityGroup::wrap)

    /**
     * The id of the cluster security group that was created by Amazon EKS for the cluster.
     */
    override fun clusterSecurityGroupId(): String = unwrap(this).getClusterSecurityGroupId()

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
     * 
     */
    override fun connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
        options: AutoScalingGroupOptions) {
      unwrap(this).connectAutoScalingGroupCapacity(autoScalingGroup.let(AutoScalingGroup::unwrap),
          options.let(AutoScalingGroupOptions::unwrap))
    }

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
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14775e4c3ffbed9dd29c98a40fe0f205fa9aac6c3d18b1d2bf8d6614dd76554c")
    override fun connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
        options: AutoScalingGroupOptions.Builder.() -> Unit): Unit =
        connectAutoScalingGroupCapacity(autoScalingGroup, AutoScalingGroupOptions(options))

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * Default: - IpFamily.IP_V4
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
     */
    override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

    /**
     * Custom environment variables when running `kubectl` against this cluster.
     */
    override fun kubectlEnvironment(): Map<String, String> = unwrap(this).getKubectlEnvironment() ?:
        emptyMap()

    /**
     * An IAM role that can perform kubectl operations against this cluster.
     *
     * The role should be mapped to the `system:masters` Kubernetes RBAC role.
     *
     * This role is directly passed to the lambda handler that sends Kube Ctl commands to the
     * cluster.
     */
    override fun kubectlLambdaRole(): IRole? = unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

    /**
     * An AWS Lambda layer that includes `kubectl` and `helm`.
     *
     * If not defined, a default layer will be used containing Kubectl 1.20 and Helm 3.8
     */
    override fun kubectlLayer(): ILayerVersion? =
        unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

    /**
     * Amount of memory to allocate to the provider's lambda function.
     */
    override fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

    /**
     * Subnets to host the `kubectl` compute resources.
     *
     * If this is undefined, the k8s endpoint is expected to be accessible
     * publicly.
     */
    override fun kubectlPrivateSubnets(): List<ISubnet> =
        unwrap(this).getKubectlPrivateSubnets()?.map(ISubnet::wrap) ?: emptyList()

    /**
     * Kubectl Provider for issuing kubectl commands against it.
     *
     * If not defined, a default provider will be used
     */
    override fun kubectlProvider(): IKubectlProvider? =
        unwrap(this).getKubectlProvider()?.let(IKubectlProvider::wrap)

    /**
     * An IAM role that can perform kubectl operations against this cluster.
     *
     * The role should be mapped to the `system:masters` Kubernetes RBAC role.
     */
    override fun kubectlRole(): IRole? = unwrap(this).getKubectlRole()?.let(IRole::wrap)

    /**
     * A security group to use for `kubectl` execution.
     *
     * If this is undefined, the k8s endpoint is expected to be accessible
     * publicly.
     */
    override fun kubectlSecurityGroup(): ISecurityGroup? =
        unwrap(this).getKubectlSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * An AWS Lambda layer that includes the NPM dependency `proxy-agent`.
     *
     * If not defined, a default layer will be used.
     */
    override fun onEventLayer(): ILayerVersion? =
        unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

    /**
     * The Open ID Connect Provider of the cluster used to configure Service Accounts.
     */
    override fun openIdConnectProvider(): IOpenIdConnectProvider =
        unwrap(this).getOpenIdConnectProvider().let(IOpenIdConnectProvider::wrap)

    /**
     * Indicates whether Kubernetes resources can be automatically pruned.
     *
     * When
     * this is enabled (default), prune labels will be allocated and injected to
     * each resource. These labels will then be used when issuing the `kubectl apply` operation with
     * the `--prune` switch.
     */
    override fun prune(): Boolean = unwrap(this).getPrune()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The VPC in which this Cluster was created.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ICluster): ICluster =
        CdkObjectWrappers.wrap(cdkObject) as? ICluster ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICluster): software.amazon.awscdk.services.eks.ICluster = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.eks.ICluster
  }
}
