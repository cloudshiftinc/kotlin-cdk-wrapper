@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IOpenIdConnectProvider
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.Role
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.ILayerVersion
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Cluster represents a managed Kubernetes Service (EKS).
 *
 * This is a fully managed cluster of API Servers (control-plane)
 * The user is still required to create the worker nodes.
 *
 * Example:
 *
 * ```
 * Cluster cluster = Cluster.Builder.create(this, "HelloEKS")
 * .version(KubernetesVersion.V1_29)
 * .defaultCapacity(0)
 * .build();
 * cluster.addNodegroupCapacity("custom-node-group", NodegroupOptions.builder()
 * .instanceTypes(List.of(new InstanceType("m5.large")))
 * .minSize(4)
 * .diskSize(100)
 * .amiType(NodegroupAmiType.AL2_X86_64_GPU)
 * .build());
 * ```
 */
public open class Cluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.Cluster,
) : Resource(cdkObject), ICluster {
  /**
   * Add nodes to this EKS cluster.
   *
   * The nodes will automatically be configured with the right VPC and AMI
   * for the instance type and Kubernetes version.
   *
   * Note that if you specify `updateType: RollingUpdate` or `updateType: ReplacingUpdate`, your
   * nodes might be replaced at deploy
   * time without notice in case the recommended AMI for your machine image type has been updated by
   * AWS.
   * The default behavior for `updateType` is `None`, which means only new instances will be
   * launched using the new AMI.
   *
   * Spot instances will be labeled `lifecycle=Ec2Spot` and tainted with `PreferNoSchedule`.
   * In addition, the [spot interrupt
   * handler](https://github.com/awslabs/ec2-spot-labs/tree/master/ec2-spot-eks-solution/spot-termination-handler)
   * daemon will be installed on all spot instances to handle
   * [EC2 Spot Instance Termination
   * Notices](https://aws.amazon.com/blogs/aws/new-ec2-spot-instance-termination-notices/).
   *
   * @param id 
   * @param options 
   */
  public open fun addAutoScalingGroupCapacity(id: String, options: AutoScalingGroupCapacityOptions):
      AutoScalingGroup = unwrap(this).addAutoScalingGroupCapacity(id,
      options.let(AutoScalingGroupCapacityOptions::unwrap)).let(AutoScalingGroup::wrap)

  /**
   * Add nodes to this EKS cluster.
   *
   * The nodes will automatically be configured with the right VPC and AMI
   * for the instance type and Kubernetes version.
   *
   * Note that if you specify `updateType: RollingUpdate` or `updateType: ReplacingUpdate`, your
   * nodes might be replaced at deploy
   * time without notice in case the recommended AMI for your machine image type has been updated by
   * AWS.
   * The default behavior for `updateType` is `None`, which means only new instances will be
   * launched using the new AMI.
   *
   * Spot instances will be labeled `lifecycle=Ec2Spot` and tainted with `PreferNoSchedule`.
   * In addition, the [spot interrupt
   * handler](https://github.com/awslabs/ec2-spot-labs/tree/master/ec2-spot-eks-solution/spot-termination-handler)
   * daemon will be installed on all spot instances to handle
   * [EC2 Spot Instance Termination
   * Notices](https://aws.amazon.com/blogs/aws/new-ec2-spot-instance-termination-notices/).
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1a5d349d842f3a08a9233762265229179388ab103e877c400676db8cd89075df")
  public open fun addAutoScalingGroupCapacity(id: String,
      options: AutoScalingGroupCapacityOptions.Builder.() -> Unit): AutoScalingGroup =
      addAutoScalingGroupCapacity(id, AutoScalingGroupCapacityOptions(options))

  /**
   * Defines a CDK8s chart in this cluster.
   *
   * @return a `KubernetesManifest` construct representing the chart.
   * @param id logical id of this chart. 
   * @param chart the cdk8s chart. 
   * @param options
   */
  public override fun addCdk8sChart(id: String, chart: CloudshiftdevConstructsConstruct):
      KubernetesManifest = unwrap(this).addCdk8sChart(id,
      chart.let(CloudshiftdevConstructsConstruct::unwrap)).let(KubernetesManifest::wrap)

  /**
   * Defines a CDK8s chart in this cluster.
   *
   * @return a `KubernetesManifest` construct representing the chart.
   * @param id logical id of this chart. 
   * @param chart the cdk8s chart. 
   * @param options
   */
  public override fun addCdk8sChart(
    id: String,
    chart: CloudshiftdevConstructsConstruct,
    options: KubernetesManifestOptions,
  ): KubernetesManifest = unwrap(this).addCdk8sChart(id,
      chart.let(CloudshiftdevConstructsConstruct::unwrap),
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
  public override fun addCdk8sChart(
    id: String,
    chart: CloudshiftdevConstructsConstruct,
    options: KubernetesManifestOptions.Builder.() -> Unit,
  ): KubernetesManifest = addCdk8sChart(id, chart, KubernetesManifestOptions(options))

  /**
   * Adds a Fargate profile to this cluster.
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html)
   * @param id the id of this profile. 
   * @param options profile options. 
   */
  public open fun addFargateProfile(id: String, options: FargateProfileOptions): FargateProfile =
      unwrap(this).addFargateProfile(id,
      options.let(FargateProfileOptions::unwrap)).let(FargateProfile::wrap)

  /**
   * Adds a Fargate profile to this cluster.
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html)
   * @param id the id of this profile. 
   * @param options profile options. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5f1c4f3c83b7b737b1b89b4b6e71821d514b522cbbde457db0787383654f5aa5")
  public open fun addFargateProfile(id: String, options: FargateProfileOptions.Builder.() -> Unit):
      FargateProfile = addFargateProfile(id, FargateProfileOptions(options))

  /**
   * Defines a Helm chart in this cluster.
   *
   * @return a `HelmChart` construct
   * @param id logical id of this chart. 
   * @param options options of this chart. 
   */
  public override fun addHelmChart(id: String, options: HelmChartOptions): HelmChart =
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
  public override fun addHelmChart(id: String, options: HelmChartOptions.Builder.() -> Unit):
      HelmChart = addHelmChart(id, HelmChartOptions(options))

  /**
   * Defines a Kubernetes resource in this cluster.
   *
   * The manifest will be applied/deleted using kubectl as needed.
   *
   * @return a `KubernetesResource` object.
   * @param id logical id of this manifest. 
   * @param manifest a list of Kubernetes resource specifications. 
   */
  public override fun addManifest(id: String, vararg manifest: Map<String, Any>): KubernetesManifest
      = unwrap(this).addManifest(id, *manifest).let(KubernetesManifest::wrap)

  /**
   * Add managed nodegroup to this Amazon EKS cluster.
   *
   * This method will create a new managed nodegroup and add into the capacity.
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html)
   * @param id The ID of the nodegroup. 
   * @param options options for creating a new nodegroup.
   */
  public open fun addNodegroupCapacity(id: String): Nodegroup =
      unwrap(this).addNodegroupCapacity(id).let(Nodegroup::wrap)

  /**
   * Add managed nodegroup to this Amazon EKS cluster.
   *
   * This method will create a new managed nodegroup and add into the capacity.
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html)
   * @param id The ID of the nodegroup. 
   * @param options options for creating a new nodegroup.
   */
  public open fun addNodegroupCapacity(id: String, options: NodegroupOptions): Nodegroup =
      unwrap(this).addNodegroupCapacity(id,
      options.let(NodegroupOptions::unwrap)).let(Nodegroup::wrap)

  /**
   * Add managed nodegroup to this Amazon EKS cluster.
   *
   * This method will create a new managed nodegroup and add into the capacity.
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html)
   * @param id The ID of the nodegroup. 
   * @param options options for creating a new nodegroup.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("81cc765289b6d8db6c417efadcd4f7dbc248d9f38bdbe2c86bfdf7c74bdb529b")
  public open fun addNodegroupCapacity(id: String, options: NodegroupOptions.Builder.() -> Unit):
      Nodegroup = addNodegroupCapacity(id, NodegroupOptions(options))

  /**
   * Creates a new service account with corresponding IAM Role (IRSA).
   *
   * @param id 
   * @param options
   */
  public override fun addServiceAccount(id: String): ServiceAccount =
      unwrap(this).addServiceAccount(id).let(ServiceAccount::wrap)

  /**
   * Creates a new service account with corresponding IAM Role (IRSA).
   *
   * @param id 
   * @param options
   */
  public override fun addServiceAccount(id: String, options: ServiceAccountOptions): ServiceAccount
      = unwrap(this).addServiceAccount(id,
      options.let(ServiceAccountOptions::unwrap)).let(ServiceAccount::wrap)

  /**
   * Creates a new service account with corresponding IAM Role (IRSA).
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1c04bf62363d27f7f1fcd0ee00a0a93e786f9d5a35ef2d9e35f27368f469899")
  public override fun addServiceAccount(id: String,
      options: ServiceAccountOptions.Builder.() -> Unit): ServiceAccount = addServiceAccount(id,
      ServiceAccountOptions(options))

  /**
   * An IAM role with administrative permissions to create or update the cluster.
   *
   * This role also has `systems:master` permissions.
   */
  public open fun adminRole(): Role = unwrap(this).getAdminRole().let(Role::wrap)

  /**
   * The ALB Controller construct defined for this cluster.
   *
   * Will be undefined if `albController` wasn't configured.
   */
  public open fun albController(): AlbController? =
      unwrap(this).getAlbController()?.let(AlbController::wrap)

  /**
   * Lazily creates the AwsAuth resource, which manages AWS authentication mapping.
   */
  public open fun awsAuth(): AwsAuth = unwrap(this).getAwsAuth().let(AwsAuth::wrap)

  /**
   * An AWS Lambda layer that contains the `aws` CLI.
   *
   * If not defined, a default layer will be used containing the AWS CLI 1.x.
   */
  public override fun awscliLayer(): ILayerVersion? =
      unwrap(this).getAwscliLayer()?.let(ILayerVersion::wrap)

  /**
   * The AWS generated ARN for the Cluster resource.
   *
   * For example, `arn:aws:eks:us-west-2:666666666666:cluster/prod`
   */
  public override fun clusterArn(): String = unwrap(this).getClusterArn()

  /**
   * The certificate-authority-data for your cluster.
   */
  public override fun clusterCertificateAuthorityData(): String =
      unwrap(this).getClusterCertificateAuthorityData()

  /**
   * Amazon Resource Name (ARN) or alias of the customer master key (CMK).
   */
  public override fun clusterEncryptionConfigKeyArn(): String =
      unwrap(this).getClusterEncryptionConfigKeyArn()

  /**
   * The endpoint URL for the Cluster.
   *
   * This is the URL inside the kubeconfig file to use with kubectl
   *
   * For example, `https://5E1D0CEXAMPLEA591B746AFC5AB30262.yl4.us-west-2.eks.amazonaws.com`
   */
  public override fun clusterEndpoint(): String = unwrap(this).getClusterEndpoint()

  /**
   * A security group to associate with the Cluster Handler's Lambdas.
   *
   * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
   *
   * Requires `placeClusterHandlerInVpc` to be set to true.
   *
   * Default: - No security group.
   */
  public override fun clusterHandlerSecurityGroup(): ISecurityGroup? =
      unwrap(this).getClusterHandlerSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * The Name of the created EKS Cluster.
   */
  public override fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * If this cluster is kubectl-enabled, returns the OpenID Connect issuer.
   *
   * This is because the values is only be retrieved by the API and not exposed
   * by CloudFormation. If this cluster is not kubectl-enabled (i.e. uses the
   * stock `CfnCluster`), this is `undefined`.
   */
  public open fun clusterOpenIdConnectIssuer(): String =
      unwrap(this).getClusterOpenIdConnectIssuer()

  /**
   * If this cluster is kubectl-enabled, returns the OpenID Connect issuer url.
   *
   * This is because the values is only be retrieved by the API and not exposed
   * by CloudFormation. If this cluster is not kubectl-enabled (i.e. uses the
   * stock `CfnCluster`), this is `undefined`.
   */
  public open fun clusterOpenIdConnectIssuerUrl(): String =
      unwrap(this).getClusterOpenIdConnectIssuerUrl()

  /**
   * The cluster security group that was created by Amazon EKS for the cluster.
   */
  public override fun clusterSecurityGroup(): ISecurityGroup =
      unwrap(this).getClusterSecurityGroup().let(ISecurityGroup::wrap)

  /**
   * The id of the cluster security group that was created by Amazon EKS for the cluster.
   */
  public override fun clusterSecurityGroupId(): String = unwrap(this).getClusterSecurityGroupId()

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
  public override fun connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
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
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("14775e4c3ffbed9dd29c98a40fe0f205fa9aac6c3d18b1d2bf8d6614dd76554c")
  public override fun connectAutoScalingGroupCapacity(autoScalingGroup: AutoScalingGroup,
      options: AutoScalingGroupOptions.Builder.() -> Unit): Unit =
      connectAutoScalingGroupCapacity(autoScalingGroup, AutoScalingGroupOptions(options))

  /**
   * Manages connection rules (Security Group Rules) for the cluster.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The auto scaling group that hosts the default capacity for this cluster.
   *
   * This will be `undefined` if the `defaultCapacityType` is not `EC2` or
   * `defaultCapacityType` is `EC2` but default capacity is set to 0.
   */
  public open fun defaultCapacity(): AutoScalingGroup? =
      unwrap(this).getDefaultCapacity()?.let(AutoScalingGroup::wrap)

  /**
   * The node group that hosts the default capacity for this cluster.
   *
   * This will be `undefined` if the `defaultCapacityType` is `EC2` or
   * `defaultCapacityType` is `NODEGROUP` but default capacity is set to 0.
   */
  public open fun defaultNodegroup(): Nodegroup? =
      unwrap(this).getDefaultNodegroup()?.let(Nodegroup::wrap)

  /**
   * Fetch the load balancer address of an ingress backed by a load balancer.
   *
   * @param ingressName The name of the ingress. 
   * @param options Additional operation options.
   */
  public open fun ingressLoadBalancerAddress(ingressName: String): String =
      unwrap(this).getIngressLoadBalancerAddress(ingressName)

  /**
   * Fetch the load balancer address of an ingress backed by a load balancer.
   *
   * @param ingressName The name of the ingress. 
   * @param options Additional operation options.
   */
  public open fun ingressLoadBalancerAddress(ingressName: String,
      options: IngressLoadBalancerAddressOptions): String =
      unwrap(this).getIngressLoadBalancerAddress(ingressName,
      options.let(IngressLoadBalancerAddressOptions::unwrap))

  /**
   * Fetch the load balancer address of an ingress backed by a load balancer.
   *
   * @param ingressName The name of the ingress. 
   * @param options Additional operation options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e9e71598624d0a7f3b023683e3add88cf6bbbb113ae03c0b2b9b80a288b321c")
  public open fun ingressLoadBalancerAddress(ingressName: String,
      options: IngressLoadBalancerAddressOptions.Builder.() -> Unit): String =
      ingressLoadBalancerAddress(ingressName, IngressLoadBalancerAddressOptions(options))

  /**
   * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
   *
   * Default: - IpFamily.IP_V4
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
   */
  public override fun ipFamily(): IpFamily? = unwrap(this).getIpFamily()?.let(IpFamily::wrap)

  /**
   * Custom environment variables when running `kubectl` against this cluster.
   */
  public override fun kubectlEnvironment(): Map<String, String> =
      unwrap(this).getKubectlEnvironment() ?: emptyMap()

  /**
   * An IAM role that can perform kubectl operations against this cluster.
   *
   * The role should be mapped to the `system:masters` Kubernetes RBAC role.
   *
   * This role is directly passed to the lambda handler that sends Kube Ctl commands to the cluster.
   *
   * Default: - if not specified, the default role created by a lambda function will
   * be used.
   */
  public override fun kubectlLambdaRole(): IRole? =
      unwrap(this).getKubectlLambdaRole()?.let(IRole::wrap)

  /**
   * An AWS Lambda layer that includes `kubectl` and `helm`.
   *
   * If not defined, a default layer will be used containing Kubectl 1.20 and Helm 3.8
   */
  public override fun kubectlLayer(): ILayerVersion? =
      unwrap(this).getKubectlLayer()?.let(ILayerVersion::wrap)

  /**
   * The amount of memory allocated to the kubectl provider's lambda function.
   */
  public override fun kubectlMemory(): Size? = unwrap(this).getKubectlMemory()?.let(Size::wrap)

  /**
   * Subnets to host the `kubectl` compute resources.
   *
   * Default: - If not specified, the k8s endpoint is expected to be accessible
   * publicly.
   */
  public override fun kubectlPrivateSubnets(): List<ISubnet> =
      unwrap(this).getKubectlPrivateSubnets()?.map(ISubnet::wrap) ?: emptyList()

  /**
   * An IAM role that can perform kubectl operations against this cluster.
   *
   * The role should be mapped to the `system:masters` Kubernetes RBAC role.
   */
  public override fun kubectlRole(): IRole? = unwrap(this).getKubectlRole()?.let(IRole::wrap)

  /**
   * A security group to use for `kubectl` execution.
   *
   * Default: - If not specified, the k8s endpoint is expected to be accessible
   * publicly.
   */
  public override fun kubectlSecurityGroup(): ISecurityGroup? =
      unwrap(this).getKubectlSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * The AWS Lambda layer that contains the NPM dependency `proxy-agent`.
   *
   * If
   * undefined, a SAR app that contains this layer will be used.
   */
  public override fun onEventLayer(): ILayerVersion? =
      unwrap(this).getOnEventLayer()?.let(ILayerVersion::wrap)

  /**
   * An `OpenIdConnectProvider` resource associated with this cluster, and which can be used to link
   * this cluster to AWS IAM.
   *
   * A provider will only be defined if this property is accessed (lazy initialization).
   */
  public override fun openIdConnectProvider(): IOpenIdConnectProvider =
      unwrap(this).getOpenIdConnectProvider().let(IOpenIdConnectProvider::wrap)

  /**
   * Determines if Kubernetes resources can be pruned automatically.
   */
  public override fun prune(): Boolean = unwrap(this).getPrune()

  /**
   * IAM role assumed by the EKS Control Plane.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * Fetch the load balancer address of a service of type 'LoadBalancer'.
   *
   * @param serviceName The name of the service. 
   * @param options Additional operation options.
   */
  public open fun serviceLoadBalancerAddress(serviceName: String): String =
      unwrap(this).getServiceLoadBalancerAddress(serviceName)

  /**
   * Fetch the load balancer address of a service of type 'LoadBalancer'.
   *
   * @param serviceName The name of the service. 
   * @param options Additional operation options.
   */
  public open fun serviceLoadBalancerAddress(serviceName: String,
      options: ServiceLoadBalancerAddressOptions): String =
      unwrap(this).getServiceLoadBalancerAddress(serviceName,
      options.let(ServiceLoadBalancerAddressOptions::unwrap))

  /**
   * Fetch the load balancer address of a service of type 'LoadBalancer'.
   *
   * @param serviceName The name of the service. 
   * @param options Additional operation options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f2df9c9afaea6399ae5a301560a0d9fdabc2ff5123a1482b5da3b99a043a51e7")
  public open fun serviceLoadBalancerAddress(serviceName: String,
      options: ServiceLoadBalancerAddressOptions.Builder.() -> Unit): String =
      serviceLoadBalancerAddress(serviceName, ServiceLoadBalancerAddressOptions(options))

  /**
   * The VPC in which this Cluster was created.
   */
  public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.Cluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     * @param albController Install the AWS Load Balancer Controller onto the cluster. 
     */
    public fun albController(albController: AlbControllerOptions)

    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     * @param albController Install the AWS Load Balancer Controller onto the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbe068c46270cace75364fb602b5c014effada559e8728ea8145d8012378d9d")
    public fun albController(albController: AlbControllerOptions.Builder.() -> Unit)

    /**
     * An AWS Lambda layer that contains the `aws` CLI.
     *
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/awscli/aws
     * ```
     *
     * Default: - a default layer with the AWS CLI 1.x
     *
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI. 
     */
    public fun awscliLayer(awscliLayer: ILayerVersion)

    /**
     * Custom environment variables when interacting with the EKS endpoint to manage the cluster
     * lifecycle.
     *
     * Default: - No environment variables.
     *
     * @param clusterHandlerEnvironment Custom environment variables when interacting with the EKS
     * endpoint to manage the cluster lifecycle. 
     */
    public fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>)

    /**
     * A security group to associate with the Cluster Handler's Lambdas.
     *
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Requires `placeClusterHandlerInVpc` to be set to true.
     *
     * Default: - No security group.
     *
     * @param clusterHandlerSecurityGroup A security group to associate with the Cluster Handler's
     * Lambdas. 
     */
    public fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup)

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable. 
     */
    public fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>)

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable. 
     */
    public fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes)

    /**
     * Name for the cluster.
     *
     * Default: - Automatically generated name
     *
     * @param clusterName Name for the cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * Controls the "eks.amazonaws.com/compute-type" annotation in the CoreDNS configuration on your
     * cluster to determine which compute type to use for CoreDNS.
     *
     * Default: CoreDnsComputeType.EC2 (for `FargateCluster` the default is FARGATE)
     *
     * @param coreDnsComputeType Controls the "eks.amazonaws.com/compute-type" annotation in the
     * CoreDNS configuration on your cluster to determine which compute type to use for CoreDNS. 
     */
    public fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType)

    /**
     * Number of instances to allocate as an initial capacity for this cluster.
     *
     * Instance type can be configured through `defaultCapacityInstanceType`,
     * which defaults to `m5.large`.
     *
     * Use `cluster.addAutoScalingGroupCapacity` to add additional customized capacity. Set this
     * to `0` is you wish to avoid the initial capacity allocation.
     *
     * Default: 2
     *
     * @param defaultCapacity Number of instances to allocate as an initial capacity for this
     * cluster. 
     */
    public fun defaultCapacity(defaultCapacity: Number)

    /**
     * The instance type to use for the default capacity.
     *
     * This will only be taken
     * into account if `defaultCapacity` is &gt; 0.
     *
     * Default: m5.large
     *
     * @param defaultCapacityInstance The instance type to use for the default capacity. 
     */
    public fun defaultCapacityInstance(defaultCapacityInstance: InstanceType)

    /**
     * The default capacity type for the cluster.
     *
     * Default: NODEGROUP
     *
     * @param defaultCapacityType The default capacity type for the cluster. 
     */
    public fun defaultCapacityType(defaultCapacityType: DefaultCapacityType)

    /**
     * Configure access to the Kubernetes API server endpoint..
     *
     * Default: EndpointAccess.PUBLIC_AND_PRIVATE
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
     * @param endpointAccess Configure access to the Kubernetes API server endpoint.. 
     */
    public fun endpointAccess(endpointAccess: EndpointAccess)

    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * Default: - IpFamily.IP_V4
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     * addresses. 
     */
    public fun ipFamily(ipFamily: IpFamily)

    /**
     * Environment variables for the kubectl execution.
     *
     * Only relevant for kubectl enabled clusters.
     *
     * Default: - No environment variables.
     *
     * @param kubectlEnvironment Environment variables for the kubectl execution. 
     */
    public fun kubectlEnvironment(kubectlEnvironment: Map<String, String>)

    /**
     * The IAM role to pass to the Kubectl Lambda Handler.
     *
     * Default: - Default Lambda IAM Execution Role
     *
     * @param kubectlLambdaRole The IAM role to pass to the Kubectl Lambda Handler. 
     */
    public fun kubectlLambdaRole(kubectlLambdaRole: IRole)

    /**
     * An AWS Lambda Layer which includes `kubectl` and Helm.
     *
     * This layer is used by the kubectl handler to apply manifests and install
     * helm charts. You must pick an appropriate releases of one of the
     * `&#64;aws-cdk/layer-kubectl-vXX` packages, that works with the version of
     * Kubernetes you have chosen. If you don't supply this value `kubectl`
     * 1.20 will be used, but that version is most likely too old.
     *
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/helm/helm
     * /opt/kubectl/kubectl
     * ```
     *
     * Default: - a default layer with Kubectl 1.20.
     *
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm. 
     */
    public fun kubectlLayer(kubectlLayer: ILayerVersion)

    /**
     * Amount of memory to allocate to the provider's lambda function.
     *
     * Default: Size.gibibytes(1)
     *
     * @param kubectlMemory Amount of memory to allocate to the provider's lambda function. 
     */
    public fun kubectlMemory(kubectlMemory: Size)

    /**
     * An IAM role that will be added to the `system:masters` Kubernetes RBAC group.
     *
     * Default: - no masters role.
     *
     * [Documentation](https://kubernetes.io/docs/reference/access-authn-authz/rbac/#default-roles-and-role-bindings)
     * @param mastersRole An IAM role that will be added to the `system:masters` Kubernetes RBAC
     * group. 
     */
    public fun mastersRole(mastersRole: IRole)

    /**
     * An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     *
     * This layer
     * is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * By default, the provider will use the layer included in the
     * "aws-lambda-layer-node-proxy-agent" SAR application which is available in all
     * commercial regions.
     *
     * To deploy the layer locally define it in your app as follows:
     *
     * ```
     * LayerVersion layer = LayerVersion.Builder.create(this, "proxy-agent-layer")
     * .code(Code.fromAsset(String.format("%s/layer.zip", __dirname)))
     * .compatibleRuntimes(List.of(Runtime.NODEJS_LATEST))
     * .build();
     * ```
     *
     * Default: - a layer bundled with this module.
     *
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`. 
     */
    public fun onEventLayer(onEventLayer: ILayerVersion)

    /**
     * Determines whether a CloudFormation output with the name of the cluster will be synthesized.
     *
     * Default: false
     *
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     * cluster will be synthesized. 
     */
    public fun outputClusterName(outputClusterName: Boolean)

    /**
     * Determines whether a CloudFormation output with the `aws eks update-kubeconfig` command will
     * be synthesized.
     *
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     *
     * Default: true
     *
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     * update-kubeconfig` command will be synthesized. 
     */
    public fun outputConfigCommand(outputConfigCommand: Boolean)

    /**
     * Determines whether a CloudFormation output with the ARN of the "masters" IAM role will be
     * synthesized (if `mastersRole` is specified).
     *
     * Default: false
     *
     * @param outputMastersRoleArn Determines whether a CloudFormation output with the ARN of the
     * "masters" IAM role will be synthesized (if `mastersRole` is specified). 
     */
    public fun outputMastersRoleArn(outputMastersRoleArn: Boolean)

    /**
     * If set to true, the cluster handler functions will be placed in the private subnets of the
     * cluster vpc, subject to the `vpcSubnets` selection strategy.
     *
     * Default: false
     *
     * @param placeClusterHandlerInVpc If set to true, the cluster handler functions will be placed
     * in the private subnets of the cluster vpc, subject to the `vpcSubnets` selection strategy. 
     */
    public fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean)

    /**
     * Indicates whether Kubernetes resources added through `addManifest()` can be automatically
     * pruned.
     *
     * When this is enabled (default), prune labels will be
     * allocated and injected to each resource. These labels will then be used
     * when issuing the `kubectl apply` operation with the `--prune` switch.
     *
     * Default: true
     *
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     * automatically pruned. 
     */
    public fun prune(prune: Boolean)

    /**
     * Role that provides permissions for the Kubernetes control plane to make calls to AWS API
     * operations on your behalf.
     *
     * Default: - A role is automatically created for you
     *
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     * AWS API operations on your behalf. 
     */
    public fun role(role: IRole)

    /**
     * KMS secret for envelope encryption for Kubernetes secrets.
     *
     * Default: - By default, Kubernetes stores all secret object data within etcd and
     * all etcd volumes used by Amazon EKS are encrypted at the disk-level
     * using AWS-Managed encryption keys.
     *
     * @param secretsEncryptionKey KMS secret for envelope encryption for Kubernetes secrets. 
     */
    public fun secretsEncryptionKey(secretsEncryptionKey: IKey)

    /**
     * Security Group to use for Control Plane ENIs.
     *
     * Default: - A security group is automatically created
     *
     * @param securityGroup Security Group to use for Control Plane ENIs. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     *
     * Default: - Kubernetes assigns addresses from either the
     * 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-serviceIpv4Cidr)
     * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from. 
     */
    public fun serviceIpv4Cidr(serviceIpv4Cidr: String)

    /**
     * The tags assigned to the EKS cluster.
     *
     * Default: - none
     *
     * @param tags The tags assigned to the EKS cluster. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The Kubernetes version to run in the cluster.
     *
     * @param version The Kubernetes version to run in the cluster. 
     */
    public fun version(version: KubernetesVersion)

    /**
     * The VPC in which to create the Cluster.
     *
     * Default: - a VPC with default configuration will be created and can be accessed through
     * `cluster.vpc`.
     *
     * @param vpc The VPC in which to create the Cluster. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Where to place EKS Control Plane ENIs.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     *
     * Default: - All public and private subnets
     *
     * @param vpcSubnets Where to place EKS Control Plane ENIs. 
     */
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    /**
     * Where to place EKS Control Plane ENIs.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     *
     * Default: - All public and private subnets
     *
     * @param vpcSubnets Where to place EKS Control Plane ENIs. 
     */
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.Cluster.Builder =
        software.amazon.awscdk.services.eks.Cluster.Builder.create(scope, id)

    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     * @param albController Install the AWS Load Balancer Controller onto the cluster. 
     */
    override fun albController(albController: AlbControllerOptions) {
      cdkBuilder.albController(albController.let(AlbControllerOptions::unwrap))
    }

    /**
     * Install the AWS Load Balancer Controller onto the cluster.
     *
     * Default: - The controller is not installed.
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     * @param albController Install the AWS Load Balancer Controller onto the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbe068c46270cace75364fb602b5c014effada559e8728ea8145d8012378d9d")
    override fun albController(albController: AlbControllerOptions.Builder.() -> Unit): Unit =
        albController(AlbControllerOptions(albController))

    /**
     * An AWS Lambda layer that contains the `aws` CLI.
     *
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/awscli/aws
     * ```
     *
     * Default: - a default layer with the AWS CLI 1.x
     *
     * @param awscliLayer An AWS Lambda layer that contains the `aws` CLI. 
     */
    override fun awscliLayer(awscliLayer: ILayerVersion) {
      cdkBuilder.awscliLayer(awscliLayer.let(ILayerVersion::unwrap))
    }

    /**
     * Custom environment variables when interacting with the EKS endpoint to manage the cluster
     * lifecycle.
     *
     * Default: - No environment variables.
     *
     * @param clusterHandlerEnvironment Custom environment variables when interacting with the EKS
     * endpoint to manage the cluster lifecycle. 
     */
    override fun clusterHandlerEnvironment(clusterHandlerEnvironment: Map<String, String>) {
      cdkBuilder.clusterHandlerEnvironment(clusterHandlerEnvironment)
    }

    /**
     * A security group to associate with the Cluster Handler's Lambdas.
     *
     * The Cluster Handler's Lambdas are responsible for calling AWS's EKS API.
     *
     * Requires `placeClusterHandlerInVpc` to be set to true.
     *
     * Default: - No security group.
     *
     * @param clusterHandlerSecurityGroup A security group to associate with the Cluster Handler's
     * Lambdas. 
     */
    override fun clusterHandlerSecurityGroup(clusterHandlerSecurityGroup: ISecurityGroup) {
      cdkBuilder.clusterHandlerSecurityGroup(clusterHandlerSecurityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable. 
     */
    override fun clusterLogging(clusterLogging: List<ClusterLoggingTypes>) {
      cdkBuilder.clusterLogging(clusterLogging.map(ClusterLoggingTypes::unwrap))
    }

    /**
     * The cluster log types which you want to enable.
     *
     * Default: - none
     *
     * @param clusterLogging The cluster log types which you want to enable. 
     */
    override fun clusterLogging(vararg clusterLogging: ClusterLoggingTypes): Unit =
        clusterLogging(clusterLogging.toList())

    /**
     * Name for the cluster.
     *
     * Default: - Automatically generated name
     *
     * @param clusterName Name for the cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * Controls the "eks.amazonaws.com/compute-type" annotation in the CoreDNS configuration on your
     * cluster to determine which compute type to use for CoreDNS.
     *
     * Default: CoreDnsComputeType.EC2 (for `FargateCluster` the default is FARGATE)
     *
     * @param coreDnsComputeType Controls the "eks.amazonaws.com/compute-type" annotation in the
     * CoreDNS configuration on your cluster to determine which compute type to use for CoreDNS. 
     */
    override fun coreDnsComputeType(coreDnsComputeType: CoreDnsComputeType) {
      cdkBuilder.coreDnsComputeType(coreDnsComputeType.let(CoreDnsComputeType::unwrap))
    }

    /**
     * Number of instances to allocate as an initial capacity for this cluster.
     *
     * Instance type can be configured through `defaultCapacityInstanceType`,
     * which defaults to `m5.large`.
     *
     * Use `cluster.addAutoScalingGroupCapacity` to add additional customized capacity. Set this
     * to `0` is you wish to avoid the initial capacity allocation.
     *
     * Default: 2
     *
     * @param defaultCapacity Number of instances to allocate as an initial capacity for this
     * cluster. 
     */
    override fun defaultCapacity(defaultCapacity: Number) {
      cdkBuilder.defaultCapacity(defaultCapacity)
    }

    /**
     * The instance type to use for the default capacity.
     *
     * This will only be taken
     * into account if `defaultCapacity` is &gt; 0.
     *
     * Default: m5.large
     *
     * @param defaultCapacityInstance The instance type to use for the default capacity. 
     */
    override fun defaultCapacityInstance(defaultCapacityInstance: InstanceType) {
      cdkBuilder.defaultCapacityInstance(defaultCapacityInstance.let(InstanceType::unwrap))
    }

    /**
     * The default capacity type for the cluster.
     *
     * Default: NODEGROUP
     *
     * @param defaultCapacityType The default capacity type for the cluster. 
     */
    override fun defaultCapacityType(defaultCapacityType: DefaultCapacityType) {
      cdkBuilder.defaultCapacityType(defaultCapacityType.let(DefaultCapacityType::unwrap))
    }

    /**
     * Configure access to the Kubernetes API server endpoint..
     *
     * Default: EndpointAccess.PUBLIC_AND_PRIVATE
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
     * @param endpointAccess Configure access to the Kubernetes API server endpoint.. 
     */
    override fun endpointAccess(endpointAccess: EndpointAccess) {
      cdkBuilder.endpointAccess(endpointAccess.let(EndpointAccess::unwrap))
    }

    /**
     * Specify which IP family is used to assign Kubernetes pod and service IP addresses.
     *
     * Default: - IpFamily.IP_V4
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-ipFamily)
     * @param ipFamily Specify which IP family is used to assign Kubernetes pod and service IP
     * addresses. 
     */
    override fun ipFamily(ipFamily: IpFamily) {
      cdkBuilder.ipFamily(ipFamily.let(IpFamily::unwrap))
    }

    /**
     * Environment variables for the kubectl execution.
     *
     * Only relevant for kubectl enabled clusters.
     *
     * Default: - No environment variables.
     *
     * @param kubectlEnvironment Environment variables for the kubectl execution. 
     */
    override fun kubectlEnvironment(kubectlEnvironment: Map<String, String>) {
      cdkBuilder.kubectlEnvironment(kubectlEnvironment)
    }

    /**
     * The IAM role to pass to the Kubectl Lambda Handler.
     *
     * Default: - Default Lambda IAM Execution Role
     *
     * @param kubectlLambdaRole The IAM role to pass to the Kubectl Lambda Handler. 
     */
    override fun kubectlLambdaRole(kubectlLambdaRole: IRole) {
      cdkBuilder.kubectlLambdaRole(kubectlLambdaRole.let(IRole::unwrap))
    }

    /**
     * An AWS Lambda Layer which includes `kubectl` and Helm.
     *
     * This layer is used by the kubectl handler to apply manifests and install
     * helm charts. You must pick an appropriate releases of one of the
     * `&#64;aws-cdk/layer-kubectl-vXX` packages, that works with the version of
     * Kubernetes you have chosen. If you don't supply this value `kubectl`
     * 1.20 will be used, but that version is most likely too old.
     *
     * The handler expects the layer to include the following executables:
     *
     * ```
     * /opt/helm/helm
     * /opt/kubectl/kubectl
     * ```
     *
     * Default: - a default layer with Kubectl 1.20.
     *
     * @param kubectlLayer An AWS Lambda Layer which includes `kubectl` and Helm. 
     */
    override fun kubectlLayer(kubectlLayer: ILayerVersion) {
      cdkBuilder.kubectlLayer(kubectlLayer.let(ILayerVersion::unwrap))
    }

    /**
     * Amount of memory to allocate to the provider's lambda function.
     *
     * Default: Size.gibibytes(1)
     *
     * @param kubectlMemory Amount of memory to allocate to the provider's lambda function. 
     */
    override fun kubectlMemory(kubectlMemory: Size) {
      cdkBuilder.kubectlMemory(kubectlMemory.let(Size::unwrap))
    }

    /**
     * An IAM role that will be added to the `system:masters` Kubernetes RBAC group.
     *
     * Default: - no masters role.
     *
     * [Documentation](https://kubernetes.io/docs/reference/access-authn-authz/rbac/#default-roles-and-role-bindings)
     * @param mastersRole An IAM role that will be added to the `system:masters` Kubernetes RBAC
     * group. 
     */
    override fun mastersRole(mastersRole: IRole) {
      cdkBuilder.mastersRole(mastersRole.let(IRole::unwrap))
    }

    /**
     * An AWS Lambda Layer which includes the NPM dependency `proxy-agent`.
     *
     * This layer
     * is used by the onEvent handler to route AWS SDK requests through a proxy.
     *
     * By default, the provider will use the layer included in the
     * "aws-lambda-layer-node-proxy-agent" SAR application which is available in all
     * commercial regions.
     *
     * To deploy the layer locally define it in your app as follows:
     *
     * ```
     * LayerVersion layer = LayerVersion.Builder.create(this, "proxy-agent-layer")
     * .code(Code.fromAsset(String.format("%s/layer.zip", __dirname)))
     * .compatibleRuntimes(List.of(Runtime.NODEJS_LATEST))
     * .build();
     * ```
     *
     * Default: - a layer bundled with this module.
     *
     * @param onEventLayer An AWS Lambda Layer which includes the NPM dependency `proxy-agent`. 
     */
    override fun onEventLayer(onEventLayer: ILayerVersion) {
      cdkBuilder.onEventLayer(onEventLayer.let(ILayerVersion::unwrap))
    }

    /**
     * Determines whether a CloudFormation output with the name of the cluster will be synthesized.
     *
     * Default: false
     *
     * @param outputClusterName Determines whether a CloudFormation output with the name of the
     * cluster will be synthesized. 
     */
    override fun outputClusterName(outputClusterName: Boolean) {
      cdkBuilder.outputClusterName(outputClusterName)
    }

    /**
     * Determines whether a CloudFormation output with the `aws eks update-kubeconfig` command will
     * be synthesized.
     *
     * This command will include
     * the cluster name and, if applicable, the ARN of the masters IAM role.
     *
     * Default: true
     *
     * @param outputConfigCommand Determines whether a CloudFormation output with the `aws eks
     * update-kubeconfig` command will be synthesized. 
     */
    override fun outputConfigCommand(outputConfigCommand: Boolean) {
      cdkBuilder.outputConfigCommand(outputConfigCommand)
    }

    /**
     * Determines whether a CloudFormation output with the ARN of the "masters" IAM role will be
     * synthesized (if `mastersRole` is specified).
     *
     * Default: false
     *
     * @param outputMastersRoleArn Determines whether a CloudFormation output with the ARN of the
     * "masters" IAM role will be synthesized (if `mastersRole` is specified). 
     */
    override fun outputMastersRoleArn(outputMastersRoleArn: Boolean) {
      cdkBuilder.outputMastersRoleArn(outputMastersRoleArn)
    }

    /**
     * If set to true, the cluster handler functions will be placed in the private subnets of the
     * cluster vpc, subject to the `vpcSubnets` selection strategy.
     *
     * Default: false
     *
     * @param placeClusterHandlerInVpc If set to true, the cluster handler functions will be placed
     * in the private subnets of the cluster vpc, subject to the `vpcSubnets` selection strategy. 
     */
    override fun placeClusterHandlerInVpc(placeClusterHandlerInVpc: Boolean) {
      cdkBuilder.placeClusterHandlerInVpc(placeClusterHandlerInVpc)
    }

    /**
     * Indicates whether Kubernetes resources added through `addManifest()` can be automatically
     * pruned.
     *
     * When this is enabled (default), prune labels will be
     * allocated and injected to each resource. These labels will then be used
     * when issuing the `kubectl apply` operation with the `--prune` switch.
     *
     * Default: true
     *
     * @param prune Indicates whether Kubernetes resources added through `addManifest()` can be
     * automatically pruned. 
     */
    override fun prune(prune: Boolean) {
      cdkBuilder.prune(prune)
    }

    /**
     * Role that provides permissions for the Kubernetes control plane to make calls to AWS API
     * operations on your behalf.
     *
     * Default: - A role is automatically created for you
     *
     * @param role Role that provides permissions for the Kubernetes control plane to make calls to
     * AWS API operations on your behalf. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * KMS secret for envelope encryption for Kubernetes secrets.
     *
     * Default: - By default, Kubernetes stores all secret object data within etcd and
     * all etcd volumes used by Amazon EKS are encrypted at the disk-level
     * using AWS-Managed encryption keys.
     *
     * @param secretsEncryptionKey KMS secret for envelope encryption for Kubernetes secrets. 
     */
    override fun secretsEncryptionKey(secretsEncryptionKey: IKey) {
      cdkBuilder.secretsEncryptionKey(secretsEncryptionKey.let(IKey::unwrap))
    }

    /**
     * Security Group to use for Control Plane ENIs.
     *
     * Default: - A security group is automatically created
     *
     * @param securityGroup Security Group to use for Control Plane ENIs. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * The CIDR block to assign Kubernetes service IP addresses from.
     *
     * Default: - Kubernetes assigns addresses from either the
     * 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_KubernetesNetworkConfigRequest.html#AmazonEKS-Type-KubernetesNetworkConfigRequest-serviceIpv4Cidr)
     * @param serviceIpv4Cidr The CIDR block to assign Kubernetes service IP addresses from. 
     */
    override fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
      cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
    }

    /**
     * The tags assigned to the EKS cluster.
     *
     * Default: - none
     *
     * @param tags The tags assigned to the EKS cluster. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The Kubernetes version to run in the cluster.
     *
     * @param version The Kubernetes version to run in the cluster. 
     */
    override fun version(version: KubernetesVersion) {
      cdkBuilder.version(version.let(KubernetesVersion::unwrap))
    }

    /**
     * The VPC in which to create the Cluster.
     *
     * Default: - a VPC with default configuration will be created and can be accessed through
     * `cluster.vpc`.
     *
     * @param vpc The VPC in which to create the Cluster. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Where to place EKS Control Plane ENIs.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     *
     * Default: - All public and private subnets
     *
     * @param vpcSubnets Where to place EKS Control Plane ENIs. 
     */
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    /**
     * Where to place EKS Control Plane ENIs.
     *
     * For example, to only select private subnets, supply the following:
     *
     * `vpcSubnets: [{ subnetType: ec2.SubnetType.PRIVATE_WITH_EGRESS }]`
     *
     * Default: - All public and private subnets
     *
     * @param vpcSubnets Where to place EKS Control Plane ENIs. 
     */
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.eks.Cluster = cdkBuilder.build()
  }

  public companion object {
    public fun fromClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClusterAttributes,
    ): ICluster =
        software.amazon.awscdk.services.eks.Cluster.fromClusterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ClusterAttributes::unwrap)).let(ICluster::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f9f698ebef13011b7bab8c610cfa73efb97bee56308d6cafa66534ab5f42b49")
    public fun fromClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClusterAttributes.Builder.() -> Unit,
    ): ICluster = fromClusterAttributes(scope, id, ClusterAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Cluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Cluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.Cluster): Cluster =
        Cluster(cdkObject)

    internal fun unwrap(wrapped: Cluster): software.amazon.awscdk.services.eks.Cluster =
        wrapped.cdkObject
  }
}
