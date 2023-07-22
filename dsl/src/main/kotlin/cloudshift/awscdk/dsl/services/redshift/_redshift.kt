@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnCluster
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
import software.amazon.awscdk.services.redshift.CfnClusterProps
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps
import software.amazon.awscdk.services.redshift.CfnEndpointAccess
import software.amazon.awscdk.services.redshift.CfnEndpointAccessProps
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorization
import software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps
import software.amazon.awscdk.services.redshift.CfnEventSubscription
import software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps
import software.amazon.awscdk.services.redshift.CfnScheduledAction
import software.amazon.awscdk.services.redshift.CfnScheduledActionProps
import software.constructs.Construct

public object redshift {
  /**
   * Specifies a cluster. A *cluster* is a fully managed data warehouse that consists of a set of
   * compute nodes.
   *
   * To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group
   * name. The cluster subnet group identifies the subnets of your VPC that Amazon Redshift uses when
   * creating the cluster. For more information about managing clusters, go to [Amazon Redshift
   * Clusters](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html) in the
   * *Amazon Redshift Cluster Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
   * .clusterType("clusterType")
   * .dbName("dbName")
   * .masterUsername("masterUsername")
   * .masterUserPassword("masterUserPassword")
   * .nodeType("nodeType")
   * // the properties below are optional
   * .allowVersionUpgrade(false)
   * .aquaConfigurationStatus("aquaConfigurationStatus")
   * .automatedSnapshotRetentionPeriod(123)
   * .availabilityZone("availabilityZone")
   * .availabilityZoneRelocation(false)
   * .availabilityZoneRelocationStatus("availabilityZoneRelocationStatus")
   * .classic(false)
   * .clusterIdentifier("clusterIdentifier")
   * .clusterParameterGroupName("clusterParameterGroupName")
   * .clusterSecurityGroups(List.of("clusterSecurityGroups"))
   * .clusterSubnetGroupName("clusterSubnetGroupName")
   * .clusterVersion("clusterVersion")
   * .deferMaintenance(false)
   * .deferMaintenanceDuration(123)
   * .deferMaintenanceEndTime("deferMaintenanceEndTime")
   * .deferMaintenanceStartTime("deferMaintenanceStartTime")
   * .destinationRegion("destinationRegion")
   * .elasticIp("elasticIp")
   * .encrypted(false)
   * .endpoint(EndpointProperty.builder()
   * .address("address")
   * .port("port")
   * .build())
   * .enhancedVpcRouting(false)
   * .hsmClientCertificateIdentifier("hsmClientCertificateIdentifier")
   * .hsmConfigurationIdentifier("hsmConfigurationIdentifier")
   * .iamRoles(List.of("iamRoles"))
   * .kmsKeyId("kmsKeyId")
   * .loggingProperties(LoggingPropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .s3KeyPrefix("s3KeyPrefix")
   * .build())
   * .maintenanceTrackName("maintenanceTrackName")
   * .manualSnapshotRetentionPeriod(123)
   * .numberOfNodes(123)
   * .ownerAccount("ownerAccount")
   * .port(123)
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .publiclyAccessible(false)
   * .resourceAction("resourceAction")
   * .revisionTarget("revisionTarget")
   * .rotateEncryptionKey(false)
   * .snapshotClusterIdentifier("snapshotClusterIdentifier")
   * .snapshotCopyGrantName("snapshotCopyGrantName")
   * .snapshotCopyManual(false)
   * .snapshotCopyRetentionPeriod(123)
   * .snapshotIdentifier("snapshotIdentifier")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html)
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
   * Describes a connection endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * EndpointProperty endpointProperty = EndpointProperty.builder()
   * .address("address")
   * .port("port")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-endpoint.html)
   */
  public inline fun cfnClusterEndpointProperty(block: CfnClusterEndpointPropertyDsl.() -> Unit =
      {}): CfnCluster.EndpointProperty {
    val builder = CfnClusterEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies logging information, such as queries and connection attempts, for the specified
   * Amazon Redshift cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * LoggingPropertiesProperty loggingPropertiesProperty = LoggingPropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .s3KeyPrefix("s3KeyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html)
   */
  public inline
      fun cfnClusterLoggingPropertiesProperty(block: CfnClusterLoggingPropertiesPropertyDsl.() -> Unit
      = {}): CfnCluster.LoggingPropertiesProperty {
    val builder = CfnClusterLoggingPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a parameter group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterParameterGroup cfnClusterParameterGroup =
   * CfnClusterParameterGroup.Builder.create(this, "MyCfnClusterParameterGroup")
   * .description("description")
   * .parameterGroupFamily("parameterGroupFamily")
   * // the properties below are optional
   * .parameterGroupName("parameterGroupName")
   * .parameters(List.of(ParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html)
   */
  public inline fun cfnClusterParameterGroup(
    scope: Construct,
    id: String,
    block: CfnClusterParameterGroupDsl.() -> Unit = {},
  ): CfnClusterParameterGroup {
    val builder = CfnClusterParameterGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a parameter in a cluster parameter group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * ParameterProperty parameterProperty = ParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-clusterparametergroup-parameter.html)
   */
  public inline
      fun cfnClusterParameterGroupParameterProperty(block: CfnClusterParameterGroupParameterPropertyDsl.() -> Unit
      = {}): CfnClusterParameterGroup.ParameterProperty {
    val builder = CfnClusterParameterGroupParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnClusterParameterGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterParameterGroupProps cfnClusterParameterGroupProps =
   * CfnClusterParameterGroupProps.builder()
   * .description("description")
   * .parameterGroupFamily("parameterGroupFamily")
   * // the properties below are optional
   * .parameterGroupName("parameterGroupName")
   * .parameters(List.of(ParameterProperty.builder()
   * .parameterName("parameterName")
   * .parameterValue("parameterValue")
   * .build()))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html)
   */
  public inline fun cfnClusterParameterGroupProps(block: CfnClusterParameterGroupPropsDsl.() -> Unit
      = {}): CfnClusterParameterGroupProps {
    val builder = CfnClusterParameterGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnCluster`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
   * .clusterType("clusterType")
   * .dbName("dbName")
   * .masterUsername("masterUsername")
   * .masterUserPassword("masterUserPassword")
   * .nodeType("nodeType")
   * // the properties below are optional
   * .allowVersionUpgrade(false)
   * .aquaConfigurationStatus("aquaConfigurationStatus")
   * .automatedSnapshotRetentionPeriod(123)
   * .availabilityZone("availabilityZone")
   * .availabilityZoneRelocation(false)
   * .availabilityZoneRelocationStatus("availabilityZoneRelocationStatus")
   * .classic(false)
   * .clusterIdentifier("clusterIdentifier")
   * .clusterParameterGroupName("clusterParameterGroupName")
   * .clusterSecurityGroups(List.of("clusterSecurityGroups"))
   * .clusterSubnetGroupName("clusterSubnetGroupName")
   * .clusterVersion("clusterVersion")
   * .deferMaintenance(false)
   * .deferMaintenanceDuration(123)
   * .deferMaintenanceEndTime("deferMaintenanceEndTime")
   * .deferMaintenanceStartTime("deferMaintenanceStartTime")
   * .destinationRegion("destinationRegion")
   * .elasticIp("elasticIp")
   * .encrypted(false)
   * .endpoint(EndpointProperty.builder()
   * .address("address")
   * .port("port")
   * .build())
   * .enhancedVpcRouting(false)
   * .hsmClientCertificateIdentifier("hsmClientCertificateIdentifier")
   * .hsmConfigurationIdentifier("hsmConfigurationIdentifier")
   * .iamRoles(List.of("iamRoles"))
   * .kmsKeyId("kmsKeyId")
   * .loggingProperties(LoggingPropertiesProperty.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .s3KeyPrefix("s3KeyPrefix")
   * .build())
   * .maintenanceTrackName("maintenanceTrackName")
   * .manualSnapshotRetentionPeriod(123)
   * .numberOfNodes(123)
   * .ownerAccount("ownerAccount")
   * .port(123)
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .publiclyAccessible(false)
   * .resourceAction("resourceAction")
   * .revisionTarget("revisionTarget")
   * .rotateEncryptionKey(false)
   * .snapshotClusterIdentifier("snapshotClusterIdentifier")
   * .snapshotCopyGrantName("snapshotCopyGrantName")
   * .snapshotCopyManual(false)
   * .snapshotCopyRetentionPeriod(123)
   * .snapshotIdentifier("snapshotIdentifier")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-cluster.html)
   */
  public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
    val builder = CfnClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies a new Amazon Redshift security group. You use security groups to control access to
   * non-VPC clusters.
   *
   * For information about managing security groups, go to [Amazon Redshift Cluster Security
   * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html) in the
   * *Amazon Redshift Cluster Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterSecurityGroup cfnClusterSecurityGroup = CfnClusterSecurityGroup.Builder.create(this,
   * "MyCfnClusterSecurityGroup")
   * .description("description")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html)
   */
  public inline fun cfnClusterSecurityGroup(
    scope: Construct,
    id: String,
    block: CfnClusterSecurityGroupDsl.() -> Unit = {},
  ): CfnClusterSecurityGroup {
    val builder = CfnClusterSecurityGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Adds an inbound (ingress) rule to an Amazon Redshift security group.
   *
   * Depending on whether the application accessing your cluster is running on the Internet or an
   * Amazon EC2 instance, you can authorize inbound access to either a Classless Interdomain Routing
   * (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group. You can add as many as 20
   * ingress rules to an Amazon Redshift security group.
   *
   * If you authorize access to an Amazon EC2 security group, specify *EC2SecurityGroupName* and
   * *EC2SecurityGroupOwnerId* . The Amazon EC2 security group and Amazon Redshift cluster must be in
   * the same AWS Region .
   *
   * If you authorize access to a CIDR/IP address range, specify *CIDRIP* . For an overview of CIDR
   * blocks, see the Wikipedia article on [Classless Inter-Domain
   * Routing](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * .
   *
   * You must also associate the security group with a cluster so that clients running on these IP
   * addresses or the EC2 instance are authorized to connect to the cluster. For information about
   * managing security groups, go to [Working with Security
   * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html) in the
   * *Amazon Redshift Cluster Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterSecurityGroupIngress cfnClusterSecurityGroupIngress =
   * CfnClusterSecurityGroupIngress.Builder.create(this, "MyCfnClusterSecurityGroupIngress")
   * .clusterSecurityGroupName("clusterSecurityGroupName")
   * // the properties below are optional
   * .cidrip("cidrip")
   * .ec2SecurityGroupName("ec2SecurityGroupName")
   * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html)
   */
  public inline fun cfnClusterSecurityGroupIngress(
    scope: Construct,
    id: String,
    block: CfnClusterSecurityGroupIngressDsl.() -> Unit = {},
  ): CfnClusterSecurityGroupIngress {
    val builder = CfnClusterSecurityGroupIngressDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnClusterSecurityGroupIngress`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterSecurityGroupIngressProps cfnClusterSecurityGroupIngressProps =
   * CfnClusterSecurityGroupIngressProps.builder()
   * .clusterSecurityGroupName("clusterSecurityGroupName")
   * // the properties below are optional
   * .cidrip("cidrip")
   * .ec2SecurityGroupName("ec2SecurityGroupName")
   * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html)
   */
  public inline
      fun cfnClusterSecurityGroupIngressProps(block: CfnClusterSecurityGroupIngressPropsDsl.() -> Unit
      = {}): CfnClusterSecurityGroupIngressProps {
    val builder = CfnClusterSecurityGroupIngressPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnClusterSecurityGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterSecurityGroupProps cfnClusterSecurityGroupProps =
   * CfnClusterSecurityGroupProps.builder()
   * .description("description")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html)
   */
  public inline fun cfnClusterSecurityGroupProps(block: CfnClusterSecurityGroupPropsDsl.() -> Unit =
      {}): CfnClusterSecurityGroupProps {
    val builder = CfnClusterSecurityGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies an Amazon Redshift subnet group.
   *
   * You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (
   * Amazon VPC ) when creating Amazon Redshift subnet group.
   *
   * For information about subnet groups, go to [Amazon Redshift Cluster Subnet
   * Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html)
   * in the *Amazon Redshift Cluster Management Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterSubnetGroup cfnClusterSubnetGroup = CfnClusterSubnetGroup.Builder.create(this,
   * "MyCfnClusterSubnetGroup")
   * .description("description")
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html)
   */
  public inline fun cfnClusterSubnetGroup(
    scope: Construct,
    id: String,
    block: CfnClusterSubnetGroupDsl.() -> Unit = {},
  ): CfnClusterSubnetGroup {
    val builder = CfnClusterSubnetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnClusterSubnetGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnClusterSubnetGroupProps cfnClusterSubnetGroupProps = CfnClusterSubnetGroupProps.builder()
   * .description("description")
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html)
   */
  public inline fun cfnClusterSubnetGroupProps(block: CfnClusterSubnetGroupPropsDsl.() -> Unit =
      {}): CfnClusterSubnetGroupProps {
    val builder = CfnClusterSubnetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a Redshift-managed VPC endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnEndpointAccess cfnEndpointAccess = CfnEndpointAccess.Builder.create(this,
   * "MyCfnEndpointAccess")
   * .clusterIdentifier("clusterIdentifier")
   * .endpointName("endpointName")
   * .subnetGroupName("subnetGroupName")
   * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
   * // the properties below are optional
   * .resourceOwner("resourceOwner")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html)
   */
  public inline fun cfnEndpointAccess(
    scope: Construct,
    id: String,
    block: CfnEndpointAccessDsl.() -> Unit = {},
  ): CfnEndpointAccess {
    val builder = CfnEndpointAccessDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a network interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html)
   */
  public inline
      fun cfnEndpointAccessNetworkInterfaceProperty(block: CfnEndpointAccessNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnEndpointAccess.NetworkInterfaceProperty {
    val builder = CfnEndpointAccessNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEndpointAccess`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnEndpointAccessProps cfnEndpointAccessProps = CfnEndpointAccessProps.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .endpointName("endpointName")
   * .subnetGroupName("subnetGroupName")
   * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
   * // the properties below are optional
   * .resourceOwner("resourceOwner")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html)
   */
  public inline fun cfnEndpointAccessProps(block: CfnEndpointAccessPropsDsl.() -> Unit = {}):
      CfnEndpointAccessProps {
    val builder = CfnEndpointAccessPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connection endpoint for connecting to an Amazon Redshift cluster through the proxy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * VpcEndpointProperty vpcEndpointProperty = VpcEndpointProperty.builder()
   * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build()))
   * .vpcEndpointId("vpcEndpointId")
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html)
   */
  public inline
      fun cfnEndpointAccessVpcEndpointProperty(block: CfnEndpointAccessVpcEndpointPropertyDsl.() -> Unit
      = {}): CfnEndpointAccess.VpcEndpointProperty {
    val builder = CfnEndpointAccessVpcEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The security groups associated with the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * VpcSecurityGroupProperty vpcSecurityGroupProperty = VpcSecurityGroupProperty.builder()
   * .status("status")
   * .vpcSecurityGroupId("vpcSecurityGroupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcsecuritygroup.html)
   */
  public inline
      fun cfnEndpointAccessVpcSecurityGroupProperty(block: CfnEndpointAccessVpcSecurityGroupPropertyDsl.() -> Unit
      = {}): CfnEndpointAccess.VpcSecurityGroupProperty {
    val builder = CfnEndpointAccessVpcSecurityGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes an endpoint authorization for authorizing Redshift-managed VPC endpoint access to a
   * cluster across AWS accounts .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnEndpointAuthorization cfnEndpointAuthorization =
   * CfnEndpointAuthorization.Builder.create(this, "MyCfnEndpointAuthorization")
   * .account("account")
   * .clusterIdentifier("clusterIdentifier")
   * // the properties below are optional
   * .force(false)
   * .vpcIds(List.of("vpcIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html)
   */
  public inline fun cfnEndpointAuthorization(
    scope: Construct,
    id: String,
    block: CfnEndpointAuthorizationDsl.() -> Unit = {},
  ): CfnEndpointAuthorization {
    val builder = CfnEndpointAuthorizationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEndpointAuthorization`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnEndpointAuthorizationProps cfnEndpointAuthorizationProps =
   * CfnEndpointAuthorizationProps.builder()
   * .account("account")
   * .clusterIdentifier("clusterIdentifier")
   * // the properties below are optional
   * .force(false)
   * .vpcIds(List.of("vpcIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointauthorization.html)
   */
  public inline fun cfnEndpointAuthorizationProps(block: CfnEndpointAuthorizationPropsDsl.() -> Unit
      = {}): CfnEndpointAuthorizationProps {
    val builder = CfnEndpointAuthorizationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Redshift::EventSubscription` resource creates an Amazon Redshift Event Subscription.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnEventSubscription cfnEventSubscription = CfnEventSubscription.Builder.create(this,
   * "MyCfnEventSubscription")
   * .subscriptionName("subscriptionName")
   * // the properties below are optional
   * .enabled(false)
   * .eventCategories(List.of("eventCategories"))
   * .severity("severity")
   * .snsTopicArn("snsTopicArn")
   * .sourceIds(List.of("sourceIds"))
   * .sourceType("sourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html)
   */
  public inline fun cfnEventSubscription(
    scope: Construct,
    id: String,
    block: CfnEventSubscriptionDsl.() -> Unit = {},
  ): CfnEventSubscription {
    val builder = CfnEventSubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEventSubscription`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnEventSubscriptionProps cfnEventSubscriptionProps = CfnEventSubscriptionProps.builder()
   * .subscriptionName("subscriptionName")
   * // the properties below are optional
   * .enabled(false)
   * .eventCategories(List.of("eventCategories"))
   * .severity("severity")
   * .snsTopicArn("snsTopicArn")
   * .sourceIds(List.of("sourceIds"))
   * .sourceType("sourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html)
   */
  public inline fun cfnEventSubscriptionProps(block: CfnEventSubscriptionPropsDsl.() -> Unit = {}):
      CfnEventSubscriptionProps {
    val builder = CfnEventSubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a scheduled action.
   *
   * A scheduled action contains a schedule and an Amazon Redshift API action. For example, you can
   * create a schedule of when to run the `ResizeCluster` API operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnScheduledAction cfnScheduledAction = CfnScheduledAction.Builder.create(this,
   * "MyCfnScheduledAction")
   * .scheduledActionName("scheduledActionName")
   * // the properties below are optional
   * .enable(false)
   * .endTime("endTime")
   * .iamRole("iamRole")
   * .schedule("schedule")
   * .scheduledActionDescription("scheduledActionDescription")
   * .startTime("startTime")
   * .targetAction(ScheduledActionTypeProperty.builder()
   * .pauseCluster(PauseClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .resizeCluster(ResizeClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * // the properties below are optional
   * .classic(false)
   * .clusterType("clusterType")
   * .nodeType("nodeType")
   * .numberOfNodes(123)
   * .build())
   * .resumeCluster(ResumeClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html)
   */
  public inline fun cfnScheduledAction(
    scope: Construct,
    id: String,
    block: CfnScheduledActionDsl.() -> Unit = {},
  ): CfnScheduledAction {
    val builder = CfnScheduledActionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a pause cluster operation.
   *
   * For example, a scheduled action to run the `PauseCluster` API operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * PauseClusterMessageProperty pauseClusterMessageProperty = PauseClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-pauseclustermessage.html)
   */
  public inline
      fun cfnScheduledActionPauseClusterMessageProperty(block: CfnScheduledActionPauseClusterMessagePropertyDsl.() -> Unit
      = {}): CfnScheduledAction.PauseClusterMessageProperty {
    val builder = CfnScheduledActionPauseClusterMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnScheduledAction`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * CfnScheduledActionProps cfnScheduledActionProps = CfnScheduledActionProps.builder()
   * .scheduledActionName("scheduledActionName")
   * // the properties below are optional
   * .enable(false)
   * .endTime("endTime")
   * .iamRole("iamRole")
   * .schedule("schedule")
   * .scheduledActionDescription("scheduledActionDescription")
   * .startTime("startTime")
   * .targetAction(ScheduledActionTypeProperty.builder()
   * .pauseCluster(PauseClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .resizeCluster(ResizeClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * // the properties below are optional
   * .classic(false)
   * .clusterType("clusterType")
   * .nodeType("nodeType")
   * .numberOfNodes(123)
   * .build())
   * .resumeCluster(ResumeClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html)
   */
  public inline fun cfnScheduledActionProps(block: CfnScheduledActionPropsDsl.() -> Unit = {}):
      CfnScheduledActionProps {
    val builder = CfnScheduledActionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a resize cluster operation.
   *
   * For example, a scheduled action to run the `ResizeCluster` API operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * ResizeClusterMessageProperty resizeClusterMessageProperty =
   * ResizeClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * // the properties below are optional
   * .classic(false)
   * .clusterType("clusterType")
   * .nodeType("nodeType")
   * .numberOfNodes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resizeclustermessage.html)
   */
  public inline
      fun cfnScheduledActionResizeClusterMessageProperty(block: CfnScheduledActionResizeClusterMessagePropertyDsl.() -> Unit
      = {}): CfnScheduledAction.ResizeClusterMessageProperty {
    val builder = CfnScheduledActionResizeClusterMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes a resume cluster operation.
   *
   * For example, a scheduled action to run the `ResumeCluster` API operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * ResumeClusterMessageProperty resumeClusterMessageProperty =
   * ResumeClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-resumeclustermessage.html)
   */
  public inline
      fun cfnScheduledActionResumeClusterMessageProperty(block: CfnScheduledActionResumeClusterMessagePropertyDsl.() -> Unit
      = {}): CfnScheduledAction.ResumeClusterMessageProperty {
    val builder = CfnScheduledActionResumeClusterMessagePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The action type that specifies an Amazon Redshift API operation that is supported by the Amazon
   * Redshift scheduler.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshift.*;
   * ScheduledActionTypeProperty scheduledActionTypeProperty = ScheduledActionTypeProperty.builder()
   * .pauseCluster(PauseClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .resizeCluster(ResizeClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * // the properties below are optional
   * .classic(false)
   * .clusterType("clusterType")
   * .nodeType("nodeType")
   * .numberOfNodes(123)
   * .build())
   * .resumeCluster(ResumeClusterMessageProperty.builder()
   * .clusterIdentifier("clusterIdentifier")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-scheduledaction-scheduledactiontype.html)
   */
  public inline
      fun cfnScheduledActionScheduledActionTypeProperty(block: CfnScheduledActionScheduledActionTypePropertyDsl.() -> Unit
      = {}): CfnScheduledAction.ScheduledActionTypeProperty {
    val builder = CfnScheduledActionScheduledActionTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
