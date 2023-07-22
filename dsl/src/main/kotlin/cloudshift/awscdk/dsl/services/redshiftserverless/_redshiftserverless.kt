@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshiftserverless.CfnNamespace
import software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps
import software.constructs.Construct

public object redshiftserverless {
  /**
   * A collection of database objects and users.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * CfnNamespace cfnNamespace = CfnNamespace.Builder.create(this, "MyCfnNamespace")
   * .namespaceName("namespaceName")
   * // the properties below are optional
   * .adminUsername("adminUsername")
   * .adminUserPassword("adminUserPassword")
   * .dbName("dbName")
   * .defaultIamRoleArn("defaultIamRoleArn")
   * .finalSnapshotName("finalSnapshotName")
   * .finalSnapshotRetentionPeriod(123)
   * .iamRoles(List.of("iamRoles"))
   * .kmsKeyId("kmsKeyId")
   * .logExports(List.of("logExports"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html)
   */
  public inline fun cfnNamespace(
    scope: Construct,
    id: String,
    block: CfnNamespaceDsl.() -> Unit = {},
  ): CfnNamespace {
    val builder = CfnNamespaceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * A collection of database objects and users.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * NamespaceProperty namespaceProperty = NamespaceProperty.builder()
   * .adminUsername("adminUsername")
   * .creationDate("creationDate")
   * .dbName("dbName")
   * .defaultIamRoleArn("defaultIamRoleArn")
   * .iamRoles(List.of("iamRoles"))
   * .kmsKeyId("kmsKeyId")
   * .logExports(List.of("logExports"))
   * .namespaceArn("namespaceArn")
   * .namespaceId("namespaceId")
   * .namespaceName("namespaceName")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-namespace-namespace.html)
   */
  public inline fun cfnNamespaceNamespaceProperty(block: CfnNamespaceNamespacePropertyDsl.() -> Unit
      = {}): CfnNamespace.NamespaceProperty {
    val builder = CfnNamespaceNamespacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnNamespace`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * CfnNamespaceProps cfnNamespaceProps = CfnNamespaceProps.builder()
   * .namespaceName("namespaceName")
   * // the properties below are optional
   * .adminUsername("adminUsername")
   * .adminUserPassword("adminUserPassword")
   * .dbName("dbName")
   * .defaultIamRoleArn("defaultIamRoleArn")
   * .finalSnapshotName("finalSnapshotName")
   * .finalSnapshotRetentionPeriod(123)
   * .iamRoles(List.of("iamRoles"))
   * .kmsKeyId("kmsKeyId")
   * .logExports(List.of("logExports"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-namespace.html)
   */
  public inline fun cfnNamespaceProps(block: CfnNamespacePropsDsl.() -> Unit = {}):
      CfnNamespaceProps {
    val builder = CfnNamespacePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The collection of compute resources in Amazon Redshift Serverless.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * CfnWorkgroup cfnWorkgroup = CfnWorkgroup.Builder.create(this, "MyCfnWorkgroup")
   * .workgroupName("workgroupName")
   * // the properties below are optional
   * .baseCapacity(123)
   * .configParameters(List.of(ConfigParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build()))
   * .enhancedVpcRouting(false)
   * .namespaceName("namespaceName")
   * .port(123)
   * .publiclyAccessible(false)
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html)
   */
  public inline fun cfnWorkgroup(
    scope: Construct,
    id: String,
    block: CfnWorkgroupDsl.() -> Unit = {},
  ): CfnWorkgroup {
    val builder = CfnWorkgroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * A array of parameters to set for more control over a serverless database.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * ConfigParameterProperty configParameterProperty = ConfigParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-configparameter.html)
   */
  public inline
      fun cfnWorkgroupConfigParameterProperty(block: CfnWorkgroupConfigParameterPropertyDsl.() -> Unit
      = {}): CfnWorkgroup.ConfigParameterProperty {
    val builder = CfnWorkgroupConfigParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The VPC endpoint object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * EndpointProperty endpointProperty = EndpointProperty.builder()
   * .address("address")
   * .port(123)
   * .vpcEndpoints(List.of(VpcEndpointProperty.builder()
   * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build()))
   * .vpcEndpointId("vpcEndpointId")
   * .vpcId("vpcId")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html)
   */
  public inline fun cfnWorkgroupEndpointProperty(block: CfnWorkgroupEndpointPropertyDsl.() -> Unit =
      {}): CfnWorkgroup.EndpointProperty {
    val builder = CfnWorkgroupEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about a network interface in an Amazon Redshift Serverless managed VPC
   * endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html)
   */
  public inline
      fun cfnWorkgroupNetworkInterfaceProperty(block: CfnWorkgroupNetworkInterfacePropertyDsl.() -> Unit
      = {}): CfnWorkgroup.NetworkInterfaceProperty {
    val builder = CfnWorkgroupNetworkInterfacePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnWorkgroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * CfnWorkgroupProps cfnWorkgroupProps = CfnWorkgroupProps.builder()
   * .workgroupName("workgroupName")
   * // the properties below are optional
   * .baseCapacity(123)
   * .configParameters(List.of(ConfigParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build()))
   * .enhancedVpcRouting(false)
   * .namespaceName("namespaceName")
   * .port(123)
   * .publiclyAccessible(false)
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html)
   */
  public inline fun cfnWorkgroupProps(block: CfnWorkgroupPropsDsl.() -> Unit = {}):
      CfnWorkgroupProps {
    val builder = CfnWorkgroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The connection endpoint for connecting to Amazon Redshift Serverless through the proxy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html)
   */
  public inline
      fun cfnWorkgroupVpcEndpointProperty(block: CfnWorkgroupVpcEndpointPropertyDsl.() -> Unit =
      {}): CfnWorkgroup.VpcEndpointProperty {
    val builder = CfnWorkgroupVpcEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The collection of computing resources from which an endpoint is created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.redshiftserverless.*;
   * WorkgroupProperty workgroupProperty = WorkgroupProperty.builder()
   * .baseCapacity(123)
   * .configParameters(List.of(ConfigParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build()))
   * .creationDate("creationDate")
   * .endpoint(EndpointProperty.builder()
   * .address("address")
   * .port(123)
   * .vpcEndpoints(List.of(VpcEndpointProperty.builder()
   * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build()))
   * .vpcEndpointId("vpcEndpointId")
   * .vpcId("vpcId")
   * .build()))
   * .build())
   * .enhancedVpcRouting(false)
   * .namespaceName("namespaceName")
   * .publiclyAccessible(false)
   * .securityGroupIds(List.of("securityGroupIds"))
   * .status("status")
   * .subnetIds(List.of("subnetIds"))
   * .workgroupArn("workgroupArn")
   * .workgroupId("workgroupId")
   * .workgroupName("workgroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html)
   */
  public inline fun cfnWorkgroupWorkgroupProperty(block: CfnWorkgroupWorkgroupPropertyDsl.() -> Unit
      = {}): CfnWorkgroup.WorkgroupProperty {
    val builder = CfnWorkgroupWorkgroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
