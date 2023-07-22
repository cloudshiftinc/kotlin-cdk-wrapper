@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dax

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnCluster
import software.amazon.awscdk.services.dax.CfnClusterProps
import software.amazon.awscdk.services.dax.CfnParameterGroup
import software.amazon.awscdk.services.dax.CfnParameterGroupProps
import software.amazon.awscdk.services.dax.CfnSubnetGroup
import software.amazon.awscdk.services.dax.CfnSubnetGroupProps
import software.constructs.Construct

public object dax {
  /**
   * Creates a DAX cluster.
   *
   * All nodes in the cluster run the same DAX caching software.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dax.*;
   * Object tags;
   * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
   * .iamRoleArn("iamRoleArn")
   * .nodeType("nodeType")
   * .replicationFactor(123)
   * // the properties below are optional
   * .availabilityZones(List.of("availabilityZones"))
   * .clusterEndpointEncryptionType("clusterEndpointEncryptionType")
   * .clusterName("clusterName")
   * .description("description")
   * .notificationTopicArn("notificationTopicArn")
   * .parameterGroupName("parameterGroupName")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .sseSpecification(SSESpecificationProperty.builder()
   * .sseEnabled(false)
   * .build())
   * .subnetGroupName("subnetGroupName")
   * .tags(tags)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html)
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
   * Properties for defining a `CfnCluster`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dax.*;
   * Object tags;
   * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
   * .iamRoleArn("iamRoleArn")
   * .nodeType("nodeType")
   * .replicationFactor(123)
   * // the properties below are optional
   * .availabilityZones(List.of("availabilityZones"))
   * .clusterEndpointEncryptionType("clusterEndpointEncryptionType")
   * .clusterName("clusterName")
   * .description("description")
   * .notificationTopicArn("notificationTopicArn")
   * .parameterGroupName("parameterGroupName")
   * .preferredMaintenanceWindow("preferredMaintenanceWindow")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .sseSpecification(SSESpecificationProperty.builder()
   * .sseEnabled(false)
   * .build())
   * .subnetGroupName("subnetGroupName")
   * .tags(tags)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-cluster.html)
   */
  public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
    val builder = CfnClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the settings used to enable server-side encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dax.*;
   * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
   * .sseEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dax-cluster-ssespecification.html)
   */
  public inline
      fun cfnClusterSSESpecificationProperty(block: CfnClusterSSESpecificationPropertyDsl.() -> Unit
      = {}): CfnCluster.SSESpecificationProperty {
    val builder = CfnClusterSSESpecificationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A named set of parameters that are applied to all of the nodes in a DAX cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dax.*;
   * Object parameterNameValues;
   * CfnParameterGroup cfnParameterGroup = CfnParameterGroup.Builder.create(this,
   * "MyCfnParameterGroup")
   * .description("description")
   * .parameterGroupName("parameterGroupName")
   * .parameterNameValues(parameterNameValues)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html)
   */
  public inline fun cfnParameterGroup(
    scope: Construct,
    id: String,
    block: CfnParameterGroupDsl.() -> Unit = {},
  ): CfnParameterGroup {
    val builder = CfnParameterGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnParameterGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dax.*;
   * Object parameterNameValues;
   * CfnParameterGroupProps cfnParameterGroupProps = CfnParameterGroupProps.builder()
   * .description("description")
   * .parameterGroupName("parameterGroupName")
   * .parameterNameValues(parameterNameValues)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html)
   */
  public inline fun cfnParameterGroupProps(block: CfnParameterGroupPropsDsl.() -> Unit = {}):
      CfnParameterGroupProps {
    val builder = CfnParameterGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a new subnet group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dax.*;
   * CfnSubnetGroup cfnSubnetGroup = CfnSubnetGroup.Builder.create(this, "MyCfnSubnetGroup")
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .description("description")
   * .subnetGroupName("subnetGroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html)
   */
  public inline fun cfnSubnetGroup(
    scope: Construct,
    id: String,
    block: CfnSubnetGroupDsl.() -> Unit = {},
  ): CfnSubnetGroup {
    val builder = CfnSubnetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSubnetGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.dax.*;
   * CfnSubnetGroupProps cfnSubnetGroupProps = CfnSubnetGroupProps.builder()
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .description("description")
   * .subnetGroupName("subnetGroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-subnetgroup.html)
   */
  public inline fun cfnSubnetGroupProps(block: CfnSubnetGroupPropsDsl.() -> Unit = {}):
      CfnSubnetGroupProps {
    val builder = CfnSubnetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
