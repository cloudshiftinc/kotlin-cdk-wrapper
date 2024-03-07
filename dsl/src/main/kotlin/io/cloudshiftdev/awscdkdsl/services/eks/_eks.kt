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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AlbControllerOptions
import software.amazon.awscdk.services.eks.AlbControllerProps
import software.amazon.awscdk.services.eks.AutoScalingGroupCapacityOptions
import software.amazon.awscdk.services.eks.AutoScalingGroupOptions
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.AwsAuthMapping
import software.amazon.awscdk.services.eks.AwsAuthProps
import software.amazon.awscdk.services.eks.BootstrapOptions
import software.amazon.awscdk.services.eks.CfnAccessEntry
import software.amazon.awscdk.services.eks.CfnAccessEntryProps
import software.amazon.awscdk.services.eks.CfnAddon
import software.amazon.awscdk.services.eks.CfnAddonProps
import software.amazon.awscdk.services.eks.CfnCluster
import software.amazon.awscdk.services.eks.CfnClusterProps
import software.amazon.awscdk.services.eks.CfnFargateProfile
import software.amazon.awscdk.services.eks.CfnFargateProfileProps
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps
import software.amazon.awscdk.services.eks.CfnNodegroup
import software.amazon.awscdk.services.eks.CfnNodegroupProps
import software.amazon.awscdk.services.eks.CfnPodIdentityAssociation
import software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps
import software.amazon.awscdk.services.eks.ClusterAttributes
import software.amazon.awscdk.services.eks.ClusterOptions
import software.amazon.awscdk.services.eks.ClusterProps
import software.amazon.awscdk.services.eks.CommonClusterOptions
import software.amazon.awscdk.services.eks.EksOptimizedImage
import software.amazon.awscdk.services.eks.EksOptimizedImageProps
import software.amazon.awscdk.services.eks.FargateCluster
import software.amazon.awscdk.services.eks.FargateClusterProps
import software.amazon.awscdk.services.eks.FargateProfile
import software.amazon.awscdk.services.eks.FargateProfileOptions
import software.amazon.awscdk.services.eks.FargateProfileProps
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.HelmChartOptions
import software.amazon.awscdk.services.eks.HelmChartProps
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.IKubectlProvider
import software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions
import software.amazon.awscdk.services.eks.KubectlProviderAttributes
import software.amazon.awscdk.services.eks.KubectlProviderProps
import software.amazon.awscdk.services.eks.KubernetesManifest
import software.amazon.awscdk.services.eks.KubernetesManifestOptions
import software.amazon.awscdk.services.eks.KubernetesManifestProps
import software.amazon.awscdk.services.eks.KubernetesObjectValue
import software.amazon.awscdk.services.eks.KubernetesObjectValueProps
import software.amazon.awscdk.services.eks.KubernetesPatch
import software.amazon.awscdk.services.eks.KubernetesPatchProps
import software.amazon.awscdk.services.eks.LaunchTemplateSpec
import software.amazon.awscdk.services.eks.Nodegroup
import software.amazon.awscdk.services.eks.NodegroupOptions
import software.amazon.awscdk.services.eks.NodegroupProps
import software.amazon.awscdk.services.eks.NodegroupRemoteAccess
import software.amazon.awscdk.services.eks.OpenIdConnectProvider
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps
import software.amazon.awscdk.services.eks.Selector
import software.amazon.awscdk.services.eks.ServiceAccount
import software.amazon.awscdk.services.eks.ServiceAccountOptions
import software.amazon.awscdk.services.eks.ServiceAccountProps
import software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions
import software.amazon.awscdk.services.eks.TaintSpec
import software.constructs.Construct

public object eks {
    /**
     * Construct for installing the AWS ALB Contoller on EKS clusters.
     *
     * Use the factory functions `get` and `getOrCreate` to obtain/create instances of this
     * controller.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * AlbControllerVersion albControllerVersion;
     * Cluster cluster;
     * Object policy;
     * AlbController albController = AlbController.Builder.create(this, "MyAlbController")
     * .cluster(cluster)
     * .version(albControllerVersion)
     * // the properties below are optional
     * .policy(policy)
     * .repository("repository")
     * .build();
     * ```
     *
     * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
     */
    public inline fun albController(
        scope: Construct,
        id: String,
        block: AlbControllerDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.eks.AlbController {
        val builder = AlbControllerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `AlbController`.
     *
     * Example:
     * ```
     * Cluster.Builder.create(this, "HelloEKS")
     * .version(KubernetesVersion.V1_29)
     * .albController(AlbControllerOptions.builder()
     * .version(AlbControllerVersion.V2_6_2)
     * .build())
     * .build();
     * ```
     */
    public inline fun albControllerOptions(
        block: AlbControllerOptionsDsl.() -> Unit = {}
    ): AlbControllerOptions {
        val builder = AlbControllerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for `AlbController`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * AlbControllerVersion albControllerVersion;
     * Cluster cluster;
     * Object policy;
     * AlbControllerProps albControllerProps = AlbControllerProps.builder()
     * .cluster(cluster)
     * .version(albControllerVersion)
     * // the properties below are optional
     * .policy(policy)
     * .repository("repository")
     * .build();
     * ```
     */
    public inline fun albControllerProps(
        block: AlbControllerPropsDsl.() -> Unit = {}
    ): AlbControllerProps {
        val builder = AlbControllerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for adding worker nodes.
     *
     * Example:
     * ```
     * Cluster cluster;
     * cluster.addAutoScalingGroupCapacity("BottlerocketNodes",
     * AutoScalingGroupCapacityOptions.builder()
     * .instanceType(new InstanceType("t3.small"))
     * .minCapacity(2)
     * .machineImageType(MachineImageType.BOTTLEROCKET)
     * .build());
     * ```
     */
    public inline fun autoScalingGroupCapacityOptions(
        block: AutoScalingGroupCapacityOptionsDsl.() -> Unit = {}
    ): AutoScalingGroupCapacityOptions {
        val builder = AutoScalingGroupCapacityOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for adding an AutoScalingGroup as capacity.
     *
     * Example:
     * ```
     * Cluster cluster;
     * AutoScalingGroup asg;
     * cluster.connectAutoScalingGroupCapacity(asg, AutoScalingGroupOptions.builder().build());
     * ```
     */
    public inline fun autoScalingGroupOptions(
        block: AutoScalingGroupOptionsDsl.() -> Unit = {}
    ): AutoScalingGroupOptions {
        val builder = AutoScalingGroupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun awsAuth(
        scope: Construct,
        id: String,
        block: AwsAuthDsl.() -> Unit = {},
    ): AwsAuth {
        val builder = AwsAuthDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * AwsAuth mapping.
     *
     * Example:
     * ```
     * Cluster cluster;
     * User adminUser = new User(this, "Admin");
     * cluster.awsAuth.addUserMapping(adminUser,
     * AwsAuthMapping.builder().groups(List.of("system:masters")).build());
     * ```
     */
    public inline fun awsAuthMapping(block: AwsAuthMappingDsl.() -> Unit = {}): AwsAuthMapping {
        val builder = AwsAuthMappingDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun awsAuthProps(block: AwsAuthPropsDsl.() -> Unit = {}): AwsAuthProps {
        val builder = AwsAuthPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * EKS node bootstrapping options.
     *
     * Example:
     * ```
     * Cluster cluster;
     * cluster.addAutoScalingGroupCapacity("spot", AutoScalingGroupCapacityOptions.builder()
     * .instanceType(new InstanceType("t3.large"))
     * .minCapacity(2)
     * .bootstrapOptions(BootstrapOptions.builder()
     * .kubeletExtraArgs("--node-labels foo=bar,goo=far")
     * .awsApiRetryAttempts(5)
     * .build())
     * .build());
     * ```
     */
    public inline fun bootstrapOptions(
        block: BootstrapOptionsDsl.() -> Unit = {}
    ): BootstrapOptions {
        val builder = BootstrapOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an access entry.
     *
     * An access entry allows an IAM principal to access your cluster. Access entries can replace
     * the need to maintain entries in the `aws-auth` `ConfigMap` for authentication. You have the
     * following options for authorizing an IAM principal to access Kubernetes objects on your
     * cluster: Kubernetes role-based access control (RBAC), Amazon EKS, or both. Kubernetes RBAC
     * authorization requires you to create and manage Kubernetes `Role` , `ClusterRole` ,
     * `RoleBinding` , and `ClusterRoleBinding` objects, in addition to managing access entries. If
     * you use Amazon EKS authorization exclusively, you don't need to create and manage Kubernetes
     * `Role` , `ClusterRole` , `RoleBinding` , and `ClusterRoleBinding` objects.
     *
     * For more information about access entries, see
     * [Access entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html) in the
     * *Amazon EKS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnAccessEntry cfnAccessEntry = CfnAccessEntry.Builder.create(this, "MyCfnAccessEntry")
     * .clusterName("clusterName")
     * .principalArn("principalArn")
     * // the properties below are optional
     * .accessPolicies(List.of(AccessPolicyProperty.builder()
     * .accessScope(AccessScopeProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .namespaces(List.of("namespaces"))
     * .build())
     * .policyArn("policyArn")
     * .build()))
     * .kubernetesGroups(List.of("kubernetesGroups"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html)
     */
    public inline fun cfnAccessEntry(
        scope: Construct,
        id: String,
        block: CfnAccessEntryDsl.() -> Unit = {},
    ): CfnAccessEntry {
        val builder = CfnAccessEntryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An access policy includes permissions that allow Amazon EKS to authorize an IAM principal to
     * work with Kubernetes objects on your cluster.
     *
     * The policies are managed by Amazon EKS, but they're not IAM policies. You can't view the
     * permissions in the policies using the API. The permissions for many of the policies are
     * similar to the Kubernetes `cluster-admin` , `admin` , `edit` , and `view` cluster roles. For
     * more information about these cluster roles, see
     * [User-facing roles](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles)
     * in the Kubernetes documentation. To view the contents of the policies, see
     * [Access policy permissions](https://docs.aws.amazon.com/eks/latest/userguide/access-policies.html#access-policy-permissions)
     * in the *Amazon EKS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * AccessPolicyProperty accessPolicyProperty = AccessPolicyProperty.builder()
     * .accessScope(AccessScopeProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .namespaces(List.of("namespaces"))
     * .build())
     * .policyArn("policyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accesspolicy.html)
     */
    public inline fun cfnAccessEntryAccessPolicyProperty(
        block: CfnAccessEntryAccessPolicyPropertyDsl.() -> Unit = {}
    ): CfnAccessEntry.AccessPolicyProperty {
        val builder = CfnAccessEntryAccessPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The scope of an `AccessPolicy` that's associated to an `AccessEntry` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * AccessScopeProperty accessScopeProperty = AccessScopeProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .namespaces(List.of("namespaces"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accessscope.html)
     */
    public inline fun cfnAccessEntryAccessScopeProperty(
        block: CfnAccessEntryAccessScopePropertyDsl.() -> Unit = {}
    ): CfnAccessEntry.AccessScopeProperty {
        val builder = CfnAccessEntryAccessScopePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessEntry`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnAccessEntryProps cfnAccessEntryProps = CfnAccessEntryProps.builder()
     * .clusterName("clusterName")
     * .principalArn("principalArn")
     * // the properties below are optional
     * .accessPolicies(List.of(AccessPolicyProperty.builder()
     * .accessScope(AccessScopeProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .namespaces(List.of("namespaces"))
     * .build())
     * .policyArn("policyArn")
     * .build()))
     * .kubernetesGroups(List.of("kubernetesGroups"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html)
     */
    public inline fun cfnAccessEntryProps(
        block: CfnAccessEntryPropsDsl.() -> Unit = {}
    ): CfnAccessEntryProps {
        val builder = CfnAccessEntryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an Amazon EKS add-on.
     *
     * Amazon EKS add-ons help to automate the provisioning and lifecycle management of common
     * operational software for Amazon EKS clusters. For more information, see
     * [Amazon EKS add-ons](https://docs.aws.amazon.com/eks/latest/userguide/eks-add-ons.html) in
     * the *Amazon EKS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnAddon cfnAddon = CfnAddon.Builder.create(this, "MyCfnAddon")
     * .addonName("addonName")
     * .clusterName("clusterName")
     * // the properties below are optional
     * .addonVersion("addonVersion")
     * .configurationValues("configurationValues")
     * .preserveOnDelete(false)
     * .resolveConflicts("resolveConflicts")
     * .serviceAccountRoleArn("serviceAccountRoleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html)
     */
    public inline fun cfnAddon(
        scope: Construct,
        id: String,
        block: CfnAddonDsl.() -> Unit = {},
    ): CfnAddon {
        val builder = CfnAddonDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAddon`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnAddonProps cfnAddonProps = CfnAddonProps.builder()
     * .addonName("addonName")
     * .clusterName("clusterName")
     * // the properties below are optional
     * .addonVersion("addonVersion")
     * .configurationValues("configurationValues")
     * .preserveOnDelete(false)
     * .resolveConflicts("resolveConflicts")
     * .serviceAccountRoleArn("serviceAccountRoleArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html)
     */
    public inline fun cfnAddonProps(block: CfnAddonPropsDsl.() -> Unit = {}): CfnAddonProps {
        val builder = CfnAddonPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an Amazon EKS control plane.
     *
     * The Amazon EKS control plane consists of control plane instances that run the Kubernetes
     * software, such as `etcd` and the API server. The control plane runs in an account managed by
     * AWS , and the Kubernetes API is exposed by the Amazon EKS API server endpoint. Each Amazon
     * EKS cluster control plane is single tenant and unique. It runs on its own set of Amazon EC2
     * instances.
     *
     * The cluster control plane is provisioned across multiple Availability Zones and fronted by an
     * Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network
     * interfaces in your VPC subnets to provide connectivity from the control plane instances to
     * the nodes (for example, to support `kubectl exec` , `logs` , and `proxy` data flows).
     *
     * Amazon EKS nodes run in your AWS account and connect to your cluster's control plane over the
     * Kubernetes API server endpoint and a certificate file that is created for your cluster.
     *
     * You can use the `endpointPublicAccess` and `endpointPrivateAccess` parameters to enable or
     * disable public and private access to your cluster's Kubernetes API server endpoint. By
     * default, public access is enabled, and private access is disabled. For more information, see
     * [Amazon EKS Cluster Endpoint Access Control](https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html)
     * in the **Amazon EKS User Guide** .
     *
     * You can use the `logging` parameter to enable or disable exporting the Kubernetes control
     * plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't
     * exported to CloudWatch Logs. For more information, see
     * [Amazon EKS Cluster Control Plane Logs](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
     * in the **Amazon EKS User Guide** .
     *
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control
     * plane logs. For more information, see
     * [CloudWatch Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
     *
     * In most cases, it takes several minutes to create a cluster. After you create an Amazon EKS
     * cluster, you must configure your Kubernetes tooling to communicate with the API server and
     * launch nodes into your cluster. For more information, see
     * [Allowing users to access your cluster](https://docs.aws.amazon.com/eks/latest/userguide/cluster-auth.html)
     * and
     * [Launching Amazon EKS nodes](https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html)
     * in the *Amazon EKS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
     * .resourcesVpcConfig(ResourcesVpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .endpointPrivateAccess(false)
     * .endpointPublicAccess(false)
     * .publicAccessCidrs(List.of("publicAccessCidrs"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .accessConfig(AccessConfigProperty.builder()
     * .authenticationMode("authenticationMode")
     * .bootstrapClusterCreatorAdminPermissions(false)
     * .build())
     * .encryptionConfig(List.of(EncryptionConfigProperty.builder()
     * .provider(ProviderProperty.builder()
     * .keyArn("keyArn")
     * .build())
     * .resources(List.of("resources"))
     * .build()))
     * .kubernetesNetworkConfig(KubernetesNetworkConfigProperty.builder()
     * .ipFamily("ipFamily")
     * .serviceIpv4Cidr("serviceIpv4Cidr")
     * .serviceIpv6Cidr("serviceIpv6Cidr")
     * .build())
     * .logging(LoggingProperty.builder()
     * .clusterLogging(ClusterLoggingProperty.builder()
     * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
     * .type("type")
     * .build()))
     * .build())
     * .build())
     * .name("name")
     * .outpostConfig(OutpostConfigProperty.builder()
     * .controlPlaneInstanceType("controlPlaneInstanceType")
     * .outpostArns(List.of("outpostArns"))
     * // the properties below are optional
     * .controlPlanePlacement(ControlPlanePlacementProperty.builder()
     * .groupName("groupName")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html)
     */
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The access configuration for the cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * AccessConfigProperty accessConfigProperty = AccessConfigProperty.builder()
     * .authenticationMode("authenticationMode")
     * .bootstrapClusterCreatorAdminPermissions(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-accessconfig.html)
     */
    public inline fun cfnClusterAccessConfigProperty(
        block: CfnClusterAccessConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.AccessConfigProperty {
        val builder = CfnClusterAccessConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The cluster control plane logging configuration for your cluster.
     *
     * When updating a resource, you must include this `ClusterLogging` property if the previous
     * CloudFormation template of the resource had it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * ClusterLoggingProperty clusterLoggingProperty = ClusterLoggingProperty.builder()
     * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
     * .type("type")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-clusterlogging.html)
     */
    public inline fun cfnClusterClusterLoggingProperty(
        block: CfnClusterClusterLoggingPropertyDsl.() -> Unit = {}
    ): CfnCluster.ClusterLoggingProperty {
        val builder = CfnClusterClusterLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The placement configuration for all the control plane instances of your local Amazon EKS
     * cluster on an AWS Outpost.
     *
     * For more information, see
     * [Capacity considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
     * in the Amazon EKS User Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * ControlPlanePlacementProperty controlPlanePlacementProperty =
     * ControlPlanePlacementProperty.builder()
     * .groupName("groupName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-controlplaneplacement.html)
     */
    public inline fun cfnClusterControlPlanePlacementProperty(
        block: CfnClusterControlPlanePlacementPropertyDsl.() -> Unit = {}
    ): CfnCluster.ControlPlanePlacementProperty {
        val builder = CfnClusterControlPlanePlacementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The encryption configuration for the cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * EncryptionConfigProperty encryptionConfigProperty = EncryptionConfigProperty.builder()
     * .provider(ProviderProperty.builder()
     * .keyArn("keyArn")
     * .build())
     * .resources(List.of("resources"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-encryptionconfig.html)
     */
    public inline fun cfnClusterEncryptionConfigProperty(
        block: CfnClusterEncryptionConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.EncryptionConfigProperty {
        val builder = CfnClusterEncryptionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Kubernetes network configuration for the cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * KubernetesNetworkConfigProperty kubernetesNetworkConfigProperty =
     * KubernetesNetworkConfigProperty.builder()
     * .ipFamily("ipFamily")
     * .serviceIpv4Cidr("serviceIpv4Cidr")
     * .serviceIpv6Cidr("serviceIpv6Cidr")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-kubernetesnetworkconfig.html)
     */
    public inline fun cfnClusterKubernetesNetworkConfigProperty(
        block: CfnClusterKubernetesNetworkConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.KubernetesNetworkConfigProperty {
        val builder = CfnClusterKubernetesNetworkConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch
     * Logs.
     *
     * By default, cluster control plane logs aren't exported to CloudWatch Logs. For more
     * information, see
     * [Amazon EKS Cluster control plane logs](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html)
     * in the **Amazon EKS User Guide** .
     *
     * When updating a resource, you must include this `Logging` property if the previous
     * CloudFormation template of the resource had it. &gt; CloudWatch Logs ingestion, archive
     * storage, and data scanning rates apply to exported control plane logs. For more information,
     * see [CloudWatch Pricing](https://docs.aws.amazon.com/cloudwatch/pricing/) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * LoggingProperty loggingProperty = LoggingProperty.builder()
     * .clusterLogging(ClusterLoggingProperty.builder()
     * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
     * .type("type")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-logging.html)
     */
    public inline fun cfnClusterLoggingProperty(
        block: CfnClusterLoggingPropertyDsl.() -> Unit = {}
    ): CfnCluster.LoggingProperty {
        val builder = CfnClusterLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The enabled logging type.
     *
     * For a list of the valid logging types, see the
     * [`types` property of `LogSetup`](https://docs.aws.amazon.com/eks/latest/APIReference/API_LogSetup.html#AmazonEKS-Type-LogSetup-types)
     * in the *Amazon EKS API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * LoggingTypeConfigProperty loggingTypeConfigProperty = LoggingTypeConfigProperty.builder()
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-loggingtypeconfig.html)
     */
    public inline fun cfnClusterLoggingTypeConfigProperty(
        block: CfnClusterLoggingTypeConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.LoggingTypeConfigProperty {
        val builder = CfnClusterLoggingTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration of your local Amazon EKS cluster on an AWS Outpost.
     *
     * Before creating a cluster on an Outpost, review
     * [Creating a local cluster on an Outpost](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-local-cluster-create.html)
     * in the *Amazon EKS User Guide* . This API isn't available for Amazon EKS clusters on the AWS
     * cloud.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * OutpostConfigProperty outpostConfigProperty = OutpostConfigProperty.builder()
     * .controlPlaneInstanceType("controlPlaneInstanceType")
     * .outpostArns(List.of("outpostArns"))
     * // the properties below are optional
     * .controlPlanePlacement(ControlPlanePlacementProperty.builder()
     * .groupName("groupName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html)
     */
    public inline fun cfnClusterOutpostConfigProperty(
        block: CfnClusterOutpostConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.OutpostConfigProperty {
        val builder = CfnClusterOutpostConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
     * .resourcesVpcConfig(ResourcesVpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .endpointPrivateAccess(false)
     * .endpointPublicAccess(false)
     * .publicAccessCidrs(List.of("publicAccessCidrs"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build())
     * .roleArn("roleArn")
     * // the properties below are optional
     * .accessConfig(AccessConfigProperty.builder()
     * .authenticationMode("authenticationMode")
     * .bootstrapClusterCreatorAdminPermissions(false)
     * .build())
     * .encryptionConfig(List.of(EncryptionConfigProperty.builder()
     * .provider(ProviderProperty.builder()
     * .keyArn("keyArn")
     * .build())
     * .resources(List.of("resources"))
     * .build()))
     * .kubernetesNetworkConfig(KubernetesNetworkConfigProperty.builder()
     * .ipFamily("ipFamily")
     * .serviceIpv4Cidr("serviceIpv4Cidr")
     * .serviceIpv6Cidr("serviceIpv6Cidr")
     * .build())
     * .logging(LoggingProperty.builder()
     * .clusterLogging(ClusterLoggingProperty.builder()
     * .enabledTypes(List.of(LoggingTypeConfigProperty.builder()
     * .type("type")
     * .build()))
     * .build())
     * .build())
     * .name("name")
     * .outpostConfig(OutpostConfigProperty.builder()
     * .controlPlaneInstanceType("controlPlaneInstanceType")
     * .outpostArns(List.of("outpostArns"))
     * // the properties below are optional
     * .controlPlanePlacement(ControlPlanePlacementProperty.builder()
     * .groupName("groupName")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-cluster.html)
     */
    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifies the AWS Key Management Service ( AWS KMS ) key used to encrypt the secrets.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * ProviderProperty providerProperty = ProviderProperty.builder()
     * .keyArn("keyArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-provider.html)
     */
    public inline fun cfnClusterProviderProperty(
        block: CfnClusterProviderPropertyDsl.() -> Unit = {}
    ): CfnCluster.ProviderProperty {
        val builder = CfnClusterProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the VPC configuration to use for an Amazon EKS cluster.
     *
     * When updating a resource, you must include these properties if the previous CloudFormation
     * template of the resource had them:
     * * `EndpointPublicAccess`
     * * `EndpointPrivateAccess`
     * * `PublicAccessCidrs`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * ResourcesVpcConfigProperty resourcesVpcConfigProperty = ResourcesVpcConfigProperty.builder()
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .endpointPrivateAccess(false)
     * .endpointPublicAccess(false)
     * .publicAccessCidrs(List.of("publicAccessCidrs"))
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-resourcesvpcconfig.html)
     */
    public inline fun cfnClusterResourcesVpcConfigProperty(
        block: CfnClusterResourcesVpcConfigPropertyDsl.() -> Unit = {}
    ): CfnCluster.ResourcesVpcConfigProperty {
        val builder = CfnClusterResourcesVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an AWS Fargate profile for your Amazon EKS cluster.
     *
     * You must have at least one Fargate profile in a cluster to be able to run pods on Fargate.
     *
     * The Fargate profile allows an administrator to declare which pods run on Fargate and specify
     * which pods run on which Fargate profile. This declaration is done through the profile’s
     * selectors. Each profile can have up to five selectors that contain a namespace and labels. A
     * namespace is required for every selector. The label field consists of multiple optional
     * key-value pairs. Pods that match the selectors are scheduled on Fargate. If a to-be-scheduled
     * pod matches any of the selectors in the Fargate profile, then that pod is run on Fargate.
     *
     * When you create a Fargate profile, you must specify a pod execution role to use with the pods
     * that are scheduled with the profile. This role is added to the cluster's Kubernetes
     * [Role Based Access Control](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * (RBAC) for authorization so that the `kubelet` that is running on the Fargate infrastructure
     * can register with your Amazon EKS cluster so that it can appear in your cluster as a node.
     * The pod execution role also provides IAM permissions to the Fargate infrastructure to allow
     * read access to Amazon ECR image repositories. For more information, see
     * [Pod Execution Role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     * in the *Amazon EKS User Guide* .
     *
     * Fargate profiles are immutable. However, you can create a new updated profile to replace an
     * existing profile and then delete the original after the updated profile has finished
     * creating.
     *
     * If any Fargate profiles in a cluster are in the `DELETING` status, you must wait for that
     * Fargate profile to finish deleting before you can create any other profiles in that cluster.
     *
     * For more information, see
     * [AWS Fargate profile](https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html)
     * in the *Amazon EKS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnFargateProfile cfnFargateProfile = CfnFargateProfile.Builder.create(this,
     * "MyCfnFargateProfile")
     * .clusterName("clusterName")
     * .podExecutionRoleArn("podExecutionRoleArn")
     * .selectors(List.of(SelectorProperty.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .labels(List.of(LabelProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * // the properties below are optional
     * .fargateProfileName("fargateProfileName")
     * .subnets(List.of("subnets"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html)
     */
    public inline fun cfnFargateProfile(
        scope: Construct,
        id: String,
        block: CfnFargateProfileDsl.() -> Unit = {},
    ): CfnFargateProfile {
        val builder = CfnFargateProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * LabelProperty labelProperty = LabelProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-label.html)
     */
    public inline fun cfnFargateProfileLabelProperty(
        block: CfnFargateProfileLabelPropertyDsl.() -> Unit = {}
    ): CfnFargateProfile.LabelProperty {
        val builder = CfnFargateProfileLabelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFargateProfile`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnFargateProfileProps cfnFargateProfileProps = CfnFargateProfileProps.builder()
     * .clusterName("clusterName")
     * .podExecutionRoleArn("podExecutionRoleArn")
     * .selectors(List.of(SelectorProperty.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .labels(List.of(LabelProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build()))
     * // the properties below are optional
     * .fargateProfileName("fargateProfileName")
     * .subnets(List.of("subnets"))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html)
     */
    public inline fun cfnFargateProfileProps(
        block: CfnFargateProfilePropsDsl.() -> Unit = {}
    ): CfnFargateProfileProps {
        val builder = CfnFargateProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing an AWS Fargate profile selector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * SelectorProperty selectorProperty = SelectorProperty.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .labels(List.of(LabelProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-fargateprofile-selector.html)
     */
    public inline fun cfnFargateProfileSelectorProperty(
        block: CfnFargateProfileSelectorPropertyDsl.() -> Unit = {}
    ): CfnFargateProfile.SelectorProperty {
        val builder = CfnFargateProfileSelectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates an identity provider configuration to a cluster.
     *
     * If you want to authenticate identities using an identity provider, you can create an identity
     * provider configuration and associate it to your cluster. After configuring authentication to
     * your cluster you can create Kubernetes `Role` and `ClusterRole` objects, assign permissions
     * to them, and then bind them to the identities using Kubernetes `RoleBinding` and
     * `ClusterRoleBinding` objects. For more information see
     * [Using RBAC Authorization](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * in the Kubernetes documentation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnIdentityProviderConfig cfnIdentityProviderConfig =
     * CfnIdentityProviderConfig.Builder.create(this, "MyCfnIdentityProviderConfig")
     * .clusterName("clusterName")
     * .type("type")
     * // the properties below are optional
     * .identityProviderConfigName("identityProviderConfigName")
     * .oidc(OidcIdentityProviderConfigProperty.builder()
     * .clientId("clientId")
     * .issuerUrl("issuerUrl")
     * // the properties below are optional
     * .groupsClaim("groupsClaim")
     * .groupsPrefix("groupsPrefix")
     * .requiredClaims(List.of(RequiredClaimProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .usernameClaim("usernameClaim")
     * .usernamePrefix("usernamePrefix")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html)
     */
    public inline fun cfnIdentityProviderConfig(
        scope: Construct,
        id: String,
        block: CfnIdentityProviderConfigDsl.() -> Unit = {},
    ): CfnIdentityProviderConfig {
        val builder = CfnIdentityProviderConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the configuration for an OpenID Connect (OIDC) identity provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * OidcIdentityProviderConfigProperty oidcIdentityProviderConfigProperty =
     * OidcIdentityProviderConfigProperty.builder()
     * .clientId("clientId")
     * .issuerUrl("issuerUrl")
     * // the properties below are optional
     * .groupsClaim("groupsClaim")
     * .groupsPrefix("groupsPrefix")
     * .requiredClaims(List.of(RequiredClaimProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .usernameClaim("usernameClaim")
     * .usernamePrefix("usernamePrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-oidcidentityproviderconfig.html)
     */
    public inline fun cfnIdentityProviderConfigOidcIdentityProviderConfigProperty(
        block: CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl.() -> Unit = {}
    ): CfnIdentityProviderConfig.OidcIdentityProviderConfigProperty {
        val builder = CfnIdentityProviderConfigOidcIdentityProviderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIdentityProviderConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnIdentityProviderConfigProps cfnIdentityProviderConfigProps =
     * CfnIdentityProviderConfigProps.builder()
     * .clusterName("clusterName")
     * .type("type")
     * // the properties below are optional
     * .identityProviderConfigName("identityProviderConfigName")
     * .oidc(OidcIdentityProviderConfigProperty.builder()
     * .clientId("clientId")
     * .issuerUrl("issuerUrl")
     * // the properties below are optional
     * .groupsClaim("groupsClaim")
     * .groupsPrefix("groupsPrefix")
     * .requiredClaims(List.of(RequiredClaimProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .usernameClaim("usernameClaim")
     * .usernamePrefix("usernamePrefix")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-identityproviderconfig.html)
     */
    public inline fun cfnIdentityProviderConfigProps(
        block: CfnIdentityProviderConfigPropsDsl.() -> Unit = {}
    ): CfnIdentityProviderConfigProps {
        val builder = CfnIdentityProviderConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key-value pair that describes a required claim in the identity token.
     *
     * If set, each claim is verified to be present in the token with a matching value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * RequiredClaimProperty requiredClaimProperty = RequiredClaimProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-identityproviderconfig-requiredclaim.html)
     */
    public inline fun cfnIdentityProviderConfigRequiredClaimProperty(
        block: CfnIdentityProviderConfigRequiredClaimPropertyDsl.() -> Unit = {}
    ): CfnIdentityProviderConfig.RequiredClaimProperty {
        val builder = CfnIdentityProviderConfigRequiredClaimPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a managed node group for an Amazon EKS cluster.
     *
     * You can only create a node group for your cluster that is equal to the current Kubernetes
     * version for the cluster. All node groups are created with the latest AMI release version for
     * the respective minor Kubernetes version of the cluster, unless you deploy a custom AMI using
     * a launch template. For more information about using launch templates, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * .
     *
     * An Amazon EKS managed node group is an Amazon EC2 Auto Scaling group and associated Amazon
     * EC2 instances that are managed by AWS for an Amazon EKS cluster. For more information, see
     * [Managed node groups](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html)
     * in the *Amazon EKS User Guide* .
     *
     * Windows AMI types are only supported for commercial AWS Regions that support Windows on
     * Amazon EKS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnNodegroup cfnNodegroup = CfnNodegroup.Builder.create(this, "MyCfnNodegroup")
     * .clusterName("clusterName")
     * .nodeRole("nodeRole")
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .amiType("amiType")
     * .capacityType("capacityType")
     * .diskSize(123)
     * .forceUpdateEnabled(false)
     * .instanceTypes(List.of("instanceTypes"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
     * .id("id")
     * .name("name")
     * .version("version")
     * .build())
     * .nodegroupName("nodegroupName")
     * .releaseVersion("releaseVersion")
     * .remoteAccess(RemoteAccessProperty.builder()
     * .ec2SshKey("ec2SshKey")
     * // the properties below are optional
     * .sourceSecurityGroups(List.of("sourceSecurityGroups"))
     * .build())
     * .scalingConfig(ScalingConfigProperty.builder()
     * .desiredSize(123)
     * .maxSize(123)
     * .minSize(123)
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .taints(List.of(TaintProperty.builder()
     * .effect("effect")
     * .key("key")
     * .value("value")
     * .build()))
     * .updateConfig(UpdateConfigProperty.builder()
     * .maxUnavailable(123)
     * .maxUnavailablePercentage(123)
     * .build())
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html)
     */
    public inline fun cfnNodegroup(
        scope: Construct,
        id: String,
        block: CfnNodegroupDsl.() -> Unit = {},
    ): CfnNodegroup {
        val builder = CfnNodegroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing a node group launch template specification.
     *
     * The launch template can't include
     * [`SubnetId`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html)
     * ,
     * [`IamInstanceProfile`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html)
     * ,
     * [`RequestSpotInstances`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html)
     * ,
     * [`HibernationOptions`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_HibernationOptionsRequest.html)
     * , or
     * [`TerminateInstances`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_TerminateInstances.html)
     * , or the node group deployment or update will fail. For more information about launch
     * templates, see
     * [`CreateLaunchTemplate`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateLaunchTemplate.html)
     * in the Amazon EC2 API Reference. For more information about using launch templates with
     * Amazon EKS, see
     * [Launch template support](https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html)
     * in the *Amazon EKS User Guide* .
     *
     * You must specify either the launch template ID or the launch template name in the request,
     * but not both.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * LaunchTemplateSpecificationProperty launchTemplateSpecificationProperty =
     * LaunchTemplateSpecificationProperty.builder()
     * .id("id")
     * .name("name")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-launchtemplatespecification.html)
     */
    public inline fun cfnNodegroupLaunchTemplateSpecificationProperty(
        block: CfnNodegroupLaunchTemplateSpecificationPropertyDsl.() -> Unit = {}
    ): CfnNodegroup.LaunchTemplateSpecificationProperty {
        val builder = CfnNodegroupLaunchTemplateSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNodegroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnNodegroupProps cfnNodegroupProps = CfnNodegroupProps.builder()
     * .clusterName("clusterName")
     * .nodeRole("nodeRole")
     * .subnets(List.of("subnets"))
     * // the properties below are optional
     * .amiType("amiType")
     * .capacityType("capacityType")
     * .diskSize(123)
     * .forceUpdateEnabled(false)
     * .instanceTypes(List.of("instanceTypes"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
     * .id("id")
     * .name("name")
     * .version("version")
     * .build())
     * .nodegroupName("nodegroupName")
     * .releaseVersion("releaseVersion")
     * .remoteAccess(RemoteAccessProperty.builder()
     * .ec2SshKey("ec2SshKey")
     * // the properties below are optional
     * .sourceSecurityGroups(List.of("sourceSecurityGroups"))
     * .build())
     * .scalingConfig(ScalingConfigProperty.builder()
     * .desiredSize(123)
     * .maxSize(123)
     * .minSize(123)
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .taints(List.of(TaintProperty.builder()
     * .effect("effect")
     * .key("key")
     * .value("value")
     * .build()))
     * .updateConfig(UpdateConfigProperty.builder()
     * .maxUnavailable(123)
     * .maxUnavailablePercentage(123)
     * .build())
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-nodegroup.html)
     */
    public inline fun cfnNodegroupProps(
        block: CfnNodegroupPropsDsl.() -> Unit = {}
    ): CfnNodegroupProps {
        val builder = CfnNodegroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the remote access configuration for the managed node group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * RemoteAccessProperty remoteAccessProperty = RemoteAccessProperty.builder()
     * .ec2SshKey("ec2SshKey")
     * // the properties below are optional
     * .sourceSecurityGroups(List.of("sourceSecurityGroups"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html)
     */
    public inline fun cfnNodegroupRemoteAccessProperty(
        block: CfnNodegroupRemoteAccessPropertyDsl.() -> Unit = {}
    ): CfnNodegroup.RemoteAccessProperty {
        val builder = CfnNodegroupRemoteAccessPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object representing the scaling configuration details for the Auto Scaling group that is
     * associated with your node group.
     *
     * When creating a node group, you must specify all or none of the properties. When updating a
     * node group, you can specify any or none of the properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * ScalingConfigProperty scalingConfigProperty = ScalingConfigProperty.builder()
     * .desiredSize(123)
     * .maxSize(123)
     * .minSize(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-scalingconfig.html)
     */
    public inline fun cfnNodegroupScalingConfigProperty(
        block: CfnNodegroupScalingConfigPropertyDsl.() -> Unit = {}
    ): CfnNodegroup.ScalingConfigProperty {
        val builder = CfnNodegroupScalingConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A property that allows a node to repel a `Pod` .
     *
     * For more information, see
     * [Node taints on managed node groups](https://docs.aws.amazon.com/eks/latest/userguide/node-taints-managed-node-groups.html)
     * in the *Amazon EKS User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * TaintProperty taintProperty = TaintProperty.builder()
     * .effect("effect")
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-taint.html)
     */
    public inline fun cfnNodegroupTaintProperty(
        block: CfnNodegroupTaintPropertyDsl.() -> Unit = {}
    ): CfnNodegroup.TaintProperty {
        val builder = CfnNodegroupTaintPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The update configuration for the node group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * UpdateConfigProperty updateConfigProperty = UpdateConfigProperty.builder()
     * .maxUnavailable(123)
     * .maxUnavailablePercentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-updateconfig.html)
     */
    public inline fun cfnNodegroupUpdateConfigProperty(
        block: CfnNodegroupUpdateConfigPropertyDsl.() -> Unit = {}
    ): CfnNodegroup.UpdateConfigProperty {
        val builder = CfnNodegroupUpdateConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon EKS Pod Identity associations provide the ability to manage credentials for your
     * applications, similar to the way that Amazon EC2 instance profiles provide credentials to
     * Amazon EC2 instances.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnPodIdentityAssociation cfnPodIdentityAssociation =
     * CfnPodIdentityAssociation.Builder.create(this, "MyCfnPodIdentityAssociation")
     * .clusterName("clusterName")
     * .namespace("namespace")
     * .roleArn("roleArn")
     * .serviceAccount("serviceAccount")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html)
     */
    public inline fun cfnPodIdentityAssociation(
        scope: Construct,
        id: String,
        block: CfnPodIdentityAssociationDsl.() -> Unit = {},
    ): CfnPodIdentityAssociation {
        val builder = CfnPodIdentityAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPodIdentityAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * CfnPodIdentityAssociationProps cfnPodIdentityAssociationProps =
     * CfnPodIdentityAssociationProps.builder()
     * .clusterName("clusterName")
     * .namespace("namespace")
     * .roleArn("roleArn")
     * .serviceAccount("serviceAccount")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html)
     */
    public inline fun cfnPodIdentityAssociationProps(
        block: CfnPodIdentityAssociationPropsDsl.() -> Unit = {}
    ): CfnPodIdentityAssociationProps {
        val builder = CfnPodIdentityAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Cluster represents a managed Kubernetes Service (EKS).
     *
     * This is a fully managed cluster of API Servers (control-plane) The user is still required to
     * create the worker nodes.
     *
     * Example:
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
    public inline fun cluster(
        scope: Construct,
        id: String,
        block: ClusterDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.eks.Cluster {
        val builder = ClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
     * importedCluster.connectAutoScalingGroupCapacity(asg,
     * AutoScalingGroupOptions.builder().build());
     * ```
     */
    public inline fun clusterAttributes(
        block: ClusterAttributesDsl.() -> Unit = {}
    ): ClusterAttributes {
        val builder = ClusterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for EKS clusters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.eks.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.kms.*;
     * import software.amazon.awscdk.services.lambda.*;
     * AlbControllerVersion albControllerVersion;
     * EndpointAccess endpointAccess;
     * Key key;
     * KubernetesVersion kubernetesVersion;
     * LayerVersion layerVersion;
     * Object policy;
     * Role role;
     * SecurityGroup securityGroup;
     * Size size;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * ClusterOptions clusterOptions = ClusterOptions.builder()
     * .version(kubernetesVersion)
     * // the properties below are optional
     * .albController(AlbControllerOptions.builder()
     * .version(albControllerVersion)
     * // the properties below are optional
     * .policy(policy)
     * .repository("repository")
     * .build())
     * .awscliLayer(layerVersion)
     * .clusterHandlerEnvironment(Map.of(
     * "clusterHandlerEnvironmentKey", "clusterHandlerEnvironment"))
     * .clusterHandlerSecurityGroup(securityGroup)
     * .clusterLogging(List.of(ClusterLoggingTypes.API))
     * .clusterName("clusterName")
     * .coreDnsComputeType(CoreDnsComputeType.EC2)
     * .endpointAccess(endpointAccess)
     * .ipFamily(IpFamily.IP_V4)
     * .kubectlEnvironment(Map.of(
     * "kubectlEnvironmentKey", "kubectlEnvironment"))
     * .kubectlLayer(layerVersion)
     * .kubectlMemory(size)
     * .mastersRole(role)
     * .onEventLayer(layerVersion)
     * .outputClusterName(false)
     * .outputConfigCommand(false)
     * .outputMastersRoleArn(false)
     * .placeClusterHandlerInVpc(false)
     * .prune(false)
     * .role(role)
     * .secretsEncryptionKey(key)
     * .securityGroup(securityGroup)
     * .serviceIpv4Cidr("serviceIpv4Cidr")
     * .vpc(vpc)
     * .vpcSubnets(List.of(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     */
    public inline fun clusterOptions(block: ClusterOptionsDsl.() -> Unit = {}): ClusterOptions {
        val builder = ClusterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Common configuration props for EKS clusters.
     *
     * Example:
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
    public inline fun clusterProps(block: ClusterPropsDsl.() -> Unit = {}): ClusterProps {
        val builder = ClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring an EKS cluster.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.eks.*;
     * import software.amazon.awscdk.services.iam.*;
     * KubernetesVersion kubernetesVersion;
     * Role role;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Vpc vpc;
     * CommonClusterOptions commonClusterOptions = CommonClusterOptions.builder()
     * .version(kubernetesVersion)
     * // the properties below are optional
     * .clusterName("clusterName")
     * .outputClusterName(false)
     * .outputConfigCommand(false)
     * .role(role)
     * .securityGroup(securityGroup)
     * .vpc(vpc)
     * .vpcSubnets(List.of(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build()))
     * .build();
     * ```
     */
    public inline fun commonClusterOptions(
        block: CommonClusterOptionsDsl.() -> Unit = {}
    ): CommonClusterOptions {
        val builder = CommonClusterOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construct an Amazon Linux 2 image from the latest EKS Optimized AMI published in SSM.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * EksOptimizedImage eksOptimizedImage = EksOptimizedImage.Builder.create()
     * .cpuArch(CpuArch.ARM_64)
     * .kubernetesVersion("kubernetesVersion")
     * .nodeType(NodeType.STANDARD)
     * .build();
     * ```
     */
    public inline fun eksOptimizedImage(
        block: EksOptimizedImageDsl.() -> Unit = {}
    ): EksOptimizedImage {
        val builder = EksOptimizedImageDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for EksOptimizedImage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * EksOptimizedImageProps eksOptimizedImageProps = EksOptimizedImageProps.builder()
     * .cpuArch(CpuArch.ARM_64)
     * .kubernetesVersion("kubernetesVersion")
     * .nodeType(NodeType.STANDARD)
     * .build();
     * ```
     */
    public inline fun eksOptimizedImageProps(
        block: EksOptimizedImagePropsDsl.() -> Unit = {}
    ): EksOptimizedImageProps {
        val builder = EksOptimizedImagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an EKS cluster that runs entirely on AWS Fargate.
     *
     * The cluster is created with a default Fargate Profile that matches the "default" and
     * "kube-system" namespaces. You can add additional profiles using `addFargateProfile`.
     *
     * Example:
     * ```
     * FargateCluster cluster = FargateCluster.Builder.create(this, "MyCluster")
     * .version(KubernetesVersion.V1_29)
     * .build();
     * ```
     */
    public inline fun fargateCluster(
        scope: Construct,
        id: String,
        block: FargateClusterDsl.() -> Unit = {},
    ): FargateCluster {
        val builder = FargateClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration props for EKS Fargate.
     *
     * Example:
     * ```
     * FargateCluster cluster = FargateCluster.Builder.create(this, "MyCluster")
     * .version(KubernetesVersion.V1_29)
     * .build();
     * ```
     */
    public inline fun fargateClusterProps(
        block: FargateClusterPropsDsl.() -> Unit = {}
    ): FargateClusterProps {
        val builder = FargateClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Fargate profiles allows an administrator to declare which pods run on Fargate.
     *
     * This declaration is done through the profile’s selectors. Each profile can have up to five
     * selectors that contain a namespace and optional labels. You must define a namespace for every
     * selector. The label field consists of multiple optional key-value pairs. Pods that match a
     * selector (by matching a namespace for the selector and all of the labels specified in the
     * selector) are scheduled on Fargate. If a namespace selector is defined without any labels,
     * Amazon EKS will attempt to schedule all pods that run in that namespace onto Fargate using
     * the profile. If a to-be-scheduled pod matches any of the selectors in the Fargate profile,
     * then that pod is scheduled on Fargate.
     *
     * If a pod matches multiple Fargate profiles, Amazon EKS picks one of the matches at random. In
     * this case, you can specify which profile a pod should use by adding the following Kubernetes
     * label to the pod specification: eks.amazonaws.com/fargate-profile: profile_name. However, the
     * pod must still match a selector in that profile in order to be scheduled onto Fargate.
     *
     * Example:
     * ```
     * Cluster cluster;
     * FargateProfile.Builder.create(this, "MyProfile")
     * .cluster(cluster)
     * .selectors(List.of(Selector.builder().namespace("default").build()))
     * .build();
     * ```
     */
    public inline fun fargateProfile(
        scope: Construct,
        id: String,
        block: FargateProfileDsl.() -> Unit = {},
    ): FargateProfile {
        val builder = FargateProfileDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for defining EKS Fargate Profiles.
     *
     * Example:
     * ```
     * Cluster cluster;
     * cluster.addFargateProfile("MyProfile", FargateProfileOptions.builder()
     * .selectors(List.of(Selector.builder().namespace("default").build()))
     * .build());
     * ```
     */
    public inline fun fargateProfileOptions(
        block: FargateProfileOptionsDsl.() -> Unit = {}
    ): FargateProfileOptions {
        val builder = FargateProfileOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration props for EKS Fargate Profiles.
     *
     * Example:
     * ```
     * Cluster cluster;
     * FargateProfile.Builder.create(this, "MyProfile")
     * .cluster(cluster)
     * .selectors(List.of(Selector.builder().namespace("default").build()))
     * .build();
     * ```
     */
    public inline fun fargateProfileProps(
        block: FargateProfilePropsDsl.() -> Unit = {}
    ): FargateProfileProps {
        val builder = FargateProfilePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a helm chart within the Kubernetes system.
     *
     * Applies/deletes the resources using `kubectl` in sync with the resource.
     *
     * Example:
     * ```
     * Cluster cluster;
     * // option 1: use a construct
     * // option 1: use a construct
     * HelmChart.Builder.create(this, "MyOCIChart")
     * .cluster(cluster)
     * .chart("some-chart")
     * .repository("oci://${ACCOUNT_ID}.dkr.ecr.${ACCOUNT_REGION}.amazonaws.com/${REPO_NAME}")
     * .namespace("oci")
     * .version("0.0.1")
     * .build();
     * ```
     */
    public inline fun helmChart(
        scope: Construct,
        id: String,
        block: HelmChartDsl.() -> Unit = {},
    ): HelmChart {
        val builder = HelmChartDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Helm Chart options.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.assets.*;
     * Cluster cluster;
     * Asset chartAsset = Asset.Builder.create(this, "ChartAsset")
     * .path("/path/to/asset")
     * .build();
     * cluster.addHelmChart("test-chart", HelmChartOptions.builder()
     * .chartAsset(chartAsset)
     * .build());
     * ```
     */
    public inline fun helmChartOptions(
        block: HelmChartOptionsDsl.() -> Unit = {}
    ): HelmChartOptions {
        val builder = HelmChartOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Helm Chart properties.
     *
     * Example:
     * ```
     * Cluster cluster;
     * // option 1: use a construct
     * // option 1: use a construct
     * HelmChart.Builder.create(this, "MyOCIChart")
     * .cluster(cluster)
     * .chart("some-chart")
     * .repository("oci://${ACCOUNT_ID}.dkr.ecr.${ACCOUNT_REGION}.amazonaws.com/${REPO_NAME}")
     * .namespace("oci")
     * .version("0.0.1")
     * .build();
     * ```
     */
    public inline fun helmChartProps(block: HelmChartPropsDsl.() -> Unit = {}): HelmChartProps {
        val builder = HelmChartPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for fetching an IngressLoadBalancerAddress.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.eks.*;
     * IngressLoadBalancerAddressOptions ingressLoadBalancerAddressOptions =
     * IngressLoadBalancerAddressOptions.builder()
     * .namespace("namespace")
     * .timeout(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun ingressLoadBalancerAddressOptions(
        block: IngressLoadBalancerAddressOptionsDsl.() -> Unit = {}
    ): IngressLoadBalancerAddressOptions {
        val builder = IngressLoadBalancerAddressOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun kubectlProvider(
        scope: Construct,
        id: String,
        block: KubectlProviderDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.eks.KubectlProvider {
        val builder = KubectlProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun kubectlProviderAttributes(
        block: KubectlProviderAttributesDsl.() -> Unit = {}
    ): KubectlProviderAttributes {
        val builder = KubectlProviderAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a KubectlProvider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * Cluster cluster;
     * KubectlProviderProps kubectlProviderProps = KubectlProviderProps.builder()
     * .cluster(cluster)
     * .build();
     * ```
     */
    public inline fun kubectlProviderProps(
        block: KubectlProviderPropsDsl.() -> Unit = {}
    ): KubectlProviderProps {
        val builder = KubectlProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a manifest within the Kubernetes system.
     *
     * Alternatively, you can use `cluster.addManifest(resource[, resource, ...])` to define
     * resources on this cluster.
     *
     * Applies/deletes the manifest using `kubectl`.
     *
     * Example:
     * ```
     * Cluster cluster;
     * KubernetesManifest namespace = cluster.addManifest("my-namespace", Map.of(
     * "apiVersion", "v1",
     * "kind", "Namespace",
     * "metadata", Map.of("name", "my-app")));
     * KubernetesManifest service = cluster.addManifest("my-service", Map.of(
     * "metadata", Map.of(
     * "name", "myservice",
     * "namespace", "my-app"),
     * "spec", Map.of()));
     * service.node.addDependency(namespace);
     * ```
     */
    public inline fun kubernetesManifest(
        scope: Construct,
        id: String,
        block: KubernetesManifestDsl.() -> Unit = {},
    ): KubernetesManifest {
        val builder = KubernetesManifestDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `KubernetesManifest`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * KubernetesManifestOptions kubernetesManifestOptions = KubernetesManifestOptions.builder()
     * .ingressAlb(false)
     * .ingressAlbScheme(AlbScheme.INTERNAL)
     * .prune(false)
     * .skipValidation(false)
     * .build();
     * ```
     */
    public inline fun kubernetesManifestOptions(
        block: KubernetesManifestOptionsDsl.() -> Unit = {}
    ): KubernetesManifestOptions {
        val builder = KubernetesManifestOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for KubernetesManifest.
     *
     * Example:
     * ```
     * Cluster cluster;
     * Map&lt;String, String&gt; appLabel = Map.of("app", "hello-kubernetes");
     * Map&lt;String, Object&gt; deployment = Map.of(
     * "apiVersion", "apps/v1",
     * "kind", "Deployment",
     * "metadata", Map.of("name", "hello-kubernetes"),
     * "spec", Map.of(
     * "replicas", 3,
     * "selector", Map.of("matchLabels", appLabel),
     * "template", Map.of(
     * "metadata", Map.of("labels", appLabel),
     * "spec", Map.of(
     * "containers", List.of(Map.of(
     * "name", "hello-kubernetes",
     * "image", "paulbouwer/hello-kubernetes:1.5",
     * "ports", List.of(Map.of("containerPort", 8080))))))));
     * Map&lt;String, Object&gt; service = Map.of(
     * "apiVersion", "v1",
     * "kind", "Service",
     * "metadata", Map.of("name", "hello-kubernetes"),
     * "spec", Map.of(
     * "type", "LoadBalancer",
     * "ports", List.of(Map.of("port", 80, "targetPort", 8080)),
     * "selector", appLabel));
     * // option 1: use a construct
     * // option 1: use a construct
     * KubernetesManifest.Builder.create(this, "hello-kub")
     * .cluster(cluster)
     * .manifest(List.of(deployment, service))
     * .build();
     * // or, option2: use `addManifest`
     * cluster.addManifest("hello-kub", service, deployment);
     * ```
     */
    public inline fun kubernetesManifestProps(
        block: KubernetesManifestPropsDsl.() -> Unit = {}
    ): KubernetesManifestProps {
        val builder = KubernetesManifestPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a value of a specific object deployed in the cluster.
     *
     * Use this to fetch any information available by the `kubectl get` command.
     *
     * Example:
     * ```
     * Cluster cluster;
     * // query the load balancer address
     * KubernetesObjectValue myServiceAddress = KubernetesObjectValue.Builder.create(this,
     * "LoadBalancerAttribute")
     * .cluster(cluster)
     * .objectType("service")
     * .objectName("my-service")
     * .jsonPath(".status.loadBalancer.ingress[0].hostname")
     * .build();
     * // pass the address to a lambda function
     * Function proxyFunction = Function.Builder.create(this, "ProxyFunction")
     * .handler("index.handler")
     * .code(Code.fromInline("my-code"))
     * .runtime(Runtime.NODEJS_LATEST)
     * .environment(Map.of(
     * "myServiceAddress", myServiceAddress.getValue()))
     * .build();
     * ```
     */
    public inline fun kubernetesObjectValue(
        scope: Construct,
        id: String,
        block: KubernetesObjectValueDsl.() -> Unit = {},
    ): KubernetesObjectValue {
        val builder = KubernetesObjectValueDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for KubernetesObjectValue.
     *
     * Example:
     * ```
     * Cluster cluster;
     * // query the load balancer address
     * KubernetesObjectValue myServiceAddress = KubernetesObjectValue.Builder.create(this,
     * "LoadBalancerAttribute")
     * .cluster(cluster)
     * .objectType("service")
     * .objectName("my-service")
     * .jsonPath(".status.loadBalancer.ingress[0].hostname")
     * .build();
     * // pass the address to a lambda function
     * Function proxyFunction = Function.Builder.create(this, "ProxyFunction")
     * .handler("index.handler")
     * .code(Code.fromInline("my-code"))
     * .runtime(Runtime.NODEJS_LATEST)
     * .environment(Map.of(
     * "myServiceAddress", myServiceAddress.getValue()))
     * .build();
     * ```
     */
    public inline fun kubernetesObjectValueProps(
        block: KubernetesObjectValuePropsDsl.() -> Unit = {}
    ): KubernetesObjectValueProps {
        val builder = KubernetesObjectValuePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CloudFormation resource which applies/restores a JSON patch into a Kubernetes resource.
     *
     * Example:
     * ```
     * Cluster cluster;
     * KubernetesPatch.Builder.create(this, "hello-kub-deployment-label")
     * .cluster(cluster)
     * .resourceName("deployment/hello-kubernetes")
     * .applyPatch(Map.of("spec", Map.of("replicas", 5)))
     * .restorePatch(Map.of("spec", Map.of("replicas", 3)))
     * .build();
     * ```
     *
     * [Documentation](https://kubernetes.io/docs/tasks/run-application/update-api-object-kubectl-patch/)
     */
    public inline fun kubernetesPatch(
        scope: Construct,
        id: String,
        block: KubernetesPatchDsl.() -> Unit = {},
    ): KubernetesPatch {
        val builder = KubernetesPatchDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for KubernetesPatch.
     *
     * Example:
     * ```
     * Cluster cluster;
     * KubernetesPatch.Builder.create(this, "hello-kub-deployment-label")
     * .cluster(cluster)
     * .resourceName("deployment/hello-kubernetes")
     * .applyPatch(Map.of("spec", Map.of("replicas", 5)))
     * .restorePatch(Map.of("spec", Map.of("replicas", 3)))
     * .build();
     * ```
     */
    public inline fun kubernetesPatchProps(
        block: KubernetesPatchPropsDsl.() -> Unit = {}
    ): KubernetesPatchProps {
        val builder = KubernetesPatchPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Launch template property specification.
     *
     * Example:
     * ```
     * Cluster cluster;
     * String userData = "MIME-Version: 1.0\nContent-Type: multipart/mixed;
     * boundary=\"==MYBOUNDARY==\"\n\n--==MYBOUNDARY==\nContent-Type: text/x-shellscript;
     * charset=\"us-ascii\"\n\n#!/bin/bash\necho \"Running custom user data
     * script\"\n\n--==MYBOUNDARY==--\\\n";
     * CfnLaunchTemplate lt = CfnLaunchTemplate.Builder.create(this, "LaunchTemplate")
     * .launchTemplateData(LaunchTemplateDataProperty.builder()
     * .instanceType("t3.small")
     * .userData(Fn.base64(userData))
     * .build())
     * .build();
     * cluster.addNodegroupCapacity("extra-ng", NodegroupOptions.builder()
     * .launchTemplateSpec(LaunchTemplateSpec.builder()
     * .id(lt.getRef())
     * .version(lt.getAttrLatestVersionNumber())
     * .build())
     * .build());
     * ```
     */
    public inline fun launchTemplateSpec(
        block: LaunchTemplateSpecDsl.() -> Unit = {}
    ): LaunchTemplateSpec {
        val builder = LaunchTemplateSpecDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Nodegroup resource class.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.eks.*;
     * import software.amazon.awscdk.services.iam.*;
     * Cluster cluster;
     * InstanceType instanceType;
     * Role role;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Nodegroup nodegroup = Nodegroup.Builder.create(this, "MyNodegroup")
     * .cluster(cluster)
     * // the properties below are optional
     * .amiType(NodegroupAmiType.AL2_X86_64)
     * .capacityType(CapacityType.SPOT)
     * .desiredSize(123)
     * .diskSize(123)
     * .forceUpdate(false)
     * .instanceTypes(List.of(instanceType))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .launchTemplateSpec(LaunchTemplateSpec.builder()
     * .id("id")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .maxSize(123)
     * .maxUnavailable(123)
     * .maxUnavailablePercentage(123)
     * .minSize(123)
     * .nodegroupName("nodegroupName")
     * .nodeRole(role)
     * .releaseVersion("releaseVersion")
     * .remoteAccess(NodegroupRemoteAccess.builder()
     * .sshKeyName("sshKeyName")
     * // the properties below are optional
     * .sourceSecurityGroups(List.of(securityGroup))
     * .build())
     * .subnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .taints(List.of(TaintSpec.builder()
     * .effect(TaintEffect.NO_SCHEDULE)
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     */
    public inline fun nodegroup(
        scope: Construct,
        id: String,
        block: NodegroupDsl.() -> Unit = {},
    ): Nodegroup {
        val builder = NodegroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Nodegroup Options for addNodeGroup() method.
     *
     * Example:
     * ```
     * Cluster cluster;
     * cluster.addNodegroupCapacity("extra-ng-spot", NodegroupOptions.builder()
     * .instanceTypes(List.of(
     * new InstanceType("c5.large"),
     * new InstanceType("c5a.large"),
     * new InstanceType("c5d.large")))
     * .minSize(3)
     * .capacityType(CapacityType.SPOT)
     * .build());
     * ```
     */
    public inline fun nodegroupOptions(
        block: NodegroupOptionsDsl.() -> Unit = {}
    ): NodegroupOptions {
        val builder = NodegroupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * NodeGroup properties interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.eks.*;
     * import software.amazon.awscdk.services.iam.*;
     * Cluster cluster;
     * InstanceType instanceType;
     * Role role;
     * SecurityGroup securityGroup;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * NodegroupProps nodegroupProps = NodegroupProps.builder()
     * .cluster(cluster)
     * // the properties below are optional
     * .amiType(NodegroupAmiType.AL2_X86_64)
     * .capacityType(CapacityType.SPOT)
     * .desiredSize(123)
     * .diskSize(123)
     * .forceUpdate(false)
     * .instanceTypes(List.of(instanceType))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .launchTemplateSpec(LaunchTemplateSpec.builder()
     * .id("id")
     * // the properties below are optional
     * .version("version")
     * .build())
     * .maxSize(123)
     * .maxUnavailable(123)
     * .maxUnavailablePercentage(123)
     * .minSize(123)
     * .nodegroupName("nodegroupName")
     * .nodeRole(role)
     * .releaseVersion("releaseVersion")
     * .remoteAccess(NodegroupRemoteAccess.builder()
     * .sshKeyName("sshKeyName")
     * // the properties below are optional
     * .sourceSecurityGroups(List.of(securityGroup))
     * .build())
     * .subnets(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .taints(List.of(TaintSpec.builder()
     * .effect(TaintEffect.NO_SCHEDULE)
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     */
    public inline fun nodegroupProps(block: NodegroupPropsDsl.() -> Unit = {}): NodegroupProps {
        val builder = NodegroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The remote access (SSH) configuration to use with your node group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.eks.*;
     * SecurityGroup securityGroup;
     * NodegroupRemoteAccess nodegroupRemoteAccess = NodegroupRemoteAccess.builder()
     * .sshKeyName("sshKeyName")
     * // the properties below are optional
     * .sourceSecurityGroups(List.of(securityGroup))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-nodegroup-remoteaccess.html)
     */
    public inline fun nodegroupRemoteAccess(
        block: NodegroupRemoteAccessDsl.() -> Unit = {}
    ): NodegroupRemoteAccess {
        val builder = NodegroupRemoteAccessDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * IAM OIDC identity providers are entities in IAM that describe an external identity provider
     * (IdP) service that supports the OpenID Connect (OIDC) standard, such as Google or Salesforce.
     *
     * You use an IAM OIDC identity provider when you want to establish trust between an
     * OIDC-compatible IdP and your AWS account.
     *
     * This implementation has default values for thumbprints and clientIds props that will be
     * compatible with the eks cluster
     *
     * Example:
     * ```
     * // or create a new one using an existing issuer url
     * String issuerUrl;
     * // you can import an existing provider
     * IOpenIdConnectProvider provider = OpenIdConnectProvider.fromOpenIdConnectProviderArn(this,
     * "Provider", "arn:aws:iam::123456:oidc-provider/oidc.eks.eu-west-1.amazonaws.com/id/AB123456ABC");
     * OpenIdConnectProvider provider2 = OpenIdConnectProvider.Builder.create(this, "Provider")
     * .url(issuerUrl)
     * .build();
     * ICluster cluster = Cluster.fromClusterAttributes(this, "MyCluster", ClusterAttributes.builder()
     * .clusterName("Cluster")
     * .openIdConnectProvider(provider)
     * .kubectlRoleArn("arn:aws:iam::123456:role/service-role/k8sservicerole")
     * .build());
     * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
     * Bucket bucket = new Bucket(this, "Bucket");
     * bucket.grantReadWrite(serviceAccount);
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html)
     */
    public inline fun openIdConnectProvider(
        scope: Construct,
        id: String,
        block: OpenIdConnectProviderDsl.() -> Unit = {},
    ): OpenIdConnectProvider {
        val builder = OpenIdConnectProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Initialization properties for `OpenIdConnectProvider`.
     *
     * Example:
     * ```
     * // or create a new one using an existing issuer url
     * String issuerUrl;
     * // you can import an existing provider
     * IOpenIdConnectProvider provider = OpenIdConnectProvider.fromOpenIdConnectProviderArn(this,
     * "Provider", "arn:aws:iam::123456:oidc-provider/oidc.eks.eu-west-1.amazonaws.com/id/AB123456ABC");
     * OpenIdConnectProvider provider2 = OpenIdConnectProvider.Builder.create(this, "Provider")
     * .url(issuerUrl)
     * .build();
     * ICluster cluster = Cluster.fromClusterAttributes(this, "MyCluster", ClusterAttributes.builder()
     * .clusterName("Cluster")
     * .openIdConnectProvider(provider)
     * .kubectlRoleArn("arn:aws:iam::123456:role/service-role/k8sservicerole")
     * .build());
     * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
     * Bucket bucket = new Bucket(this, "Bucket");
     * bucket.grantReadWrite(serviceAccount);
     * ```
     */
    public inline fun openIdConnectProviderProps(
        block: OpenIdConnectProviderPropsDsl.() -> Unit = {}
    ): OpenIdConnectProviderProps {
        val builder = OpenIdConnectProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Fargate profile selector.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * Selector selector = Selector.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .build();
     * ```
     */
    public inline fun selector(block: SelectorDsl.() -> Unit = {}): Selector {
        val builder = SelectorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Service Account.
     *
     * Example:
     * ```
     * // or create a new one using an existing issuer url
     * String issuerUrl;
     * // you can import an existing provider
     * IOpenIdConnectProvider provider = OpenIdConnectProvider.fromOpenIdConnectProviderArn(this,
     * "Provider", "arn:aws:iam::123456:oidc-provider/oidc.eks.eu-west-1.amazonaws.com/id/AB123456ABC");
     * OpenIdConnectProvider provider2 = OpenIdConnectProvider.Builder.create(this, "Provider")
     * .url(issuerUrl)
     * .build();
     * ICluster cluster = Cluster.fromClusterAttributes(this, "MyCluster", ClusterAttributes.builder()
     * .clusterName("Cluster")
     * .openIdConnectProvider(provider)
     * .kubectlRoleArn("arn:aws:iam::123456:role/service-role/k8sservicerole")
     * .build());
     * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
     * Bucket bucket = new Bucket(this, "Bucket");
     * bucket.grantReadWrite(serviceAccount);
     * ```
     */
    public inline fun serviceAccount(
        scope: Construct,
        id: String,
        block: ServiceAccountDsl.() -> Unit = {},
    ): ServiceAccount {
        val builder = ServiceAccountDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for `ServiceAccount`.
     *
     * Example:
     * ```
     * Cluster cluster;
     * // add service account with annotations and labels
     * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount",
     * ServiceAccountOptions.builder()
     * .annotations(Map.of(
     * "eks.amazonaws.com/sts-regional-endpoints", "false"))
     * .labels(Map.of(
     * "some-label", "with-some-value"))
     * .build());
     * ```
     */
    public inline fun serviceAccountOptions(
        block: ServiceAccountOptionsDsl.() -> Unit = {}
    ): ServiceAccountOptions {
        val builder = ServiceAccountOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining service accounts.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * Cluster cluster;
     * ServiceAccountProps serviceAccountProps = ServiceAccountProps.builder()
     * .cluster(cluster)
     * // the properties below are optional
     * .annotations(Map.of(
     * "annotationsKey", "annotations"))
     * .labels(Map.of(
     * "labelsKey", "labels"))
     * .name("name")
     * .namespace("namespace")
     * .build();
     * ```
     */
    public inline fun serviceAccountProps(
        block: ServiceAccountPropsDsl.() -> Unit = {}
    ): ServiceAccountProps {
        val builder = ServiceAccountPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for fetching a ServiceLoadBalancerAddress.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.eks.*;
     * ServiceLoadBalancerAddressOptions serviceLoadBalancerAddressOptions =
     * ServiceLoadBalancerAddressOptions.builder()
     * .namespace("namespace")
     * .timeout(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun serviceLoadBalancerAddressOptions(
        block: ServiceLoadBalancerAddressOptionsDsl.() -> Unit = {}
    ): ServiceLoadBalancerAddressOptions {
        val builder = ServiceLoadBalancerAddressOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Taint interface.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.eks.*;
     * TaintSpec taintSpec = TaintSpec.builder()
     * .effect(TaintEffect.NO_SCHEDULE)
     * .key("key")
     * .value("value")
     * .build();
     * ```
     */
    public inline fun taintSpec(block: TaintSpecDsl.() -> Unit = {}): TaintSpec {
        val builder = TaintSpecDsl()
        builder.apply(block)
        return builder.build()
    }

    public object AlbController {
        public fun create(
            scope: Construct,
            block: AlbControllerPropsDsl.() -> Unit = {}
        ): software.amazon.awscdk.services.eks.AlbController {
            val builder = AlbControllerPropsDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.eks.AlbController.create(scope, builder.build())
        }
    }

    public object Cluster {
        public fun fromClusterAttributes(
            scope: Construct,
            id: String,
            block: ClusterAttributesDsl.() -> Unit = {},
        ): ICluster {
            val builder = ClusterAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.eks.Cluster.fromClusterAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object KubectlProvider {
        public fun fromKubectlProviderAttributes(
            scope: Construct,
            id: String,
            block: KubectlProviderAttributesDsl.() -> Unit = {},
        ): IKubectlProvider {
            val builder = KubectlProviderAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.eks.KubectlProvider
                .fromKubectlProviderAttributes(scope, id, builder.build())
        }
    }
}
