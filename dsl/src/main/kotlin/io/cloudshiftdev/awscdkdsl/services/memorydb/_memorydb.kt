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

package io.cloudshiftdev.awscdkdsl.services.memorydb

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnACL
import software.amazon.awscdk.services.memorydb.CfnACLProps
import software.amazon.awscdk.services.memorydb.CfnCluster
import software.amazon.awscdk.services.memorydb.CfnClusterProps
import software.amazon.awscdk.services.memorydb.CfnParameterGroup
import software.amazon.awscdk.services.memorydb.CfnParameterGroupProps
import software.amazon.awscdk.services.memorydb.CfnSubnetGroup
import software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps
import software.amazon.awscdk.services.memorydb.CfnUser
import software.amazon.awscdk.services.memorydb.CfnUserProps
import software.constructs.Construct

public object memorydb {
    /**
     * Specifies an Access Control List.
     *
     * For more information, see
     * [Authenticating users with Access Contol Lists (ACLs)](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * CfnACL cfnACL = CfnACL.Builder.create(this, "MyCfnACL")
     * .aclName("aclName")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userNames(List.of("userNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html)
     */
    public inline fun cfnACL(
        scope: Construct,
        id: String,
        block: CfnACLDsl.() -> Unit = {},
    ): CfnACL {
        val builder = CfnACLDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnACL`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * CfnACLProps cfnACLProps = CfnACLProps.builder()
     * .aclName("aclName")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .userNames(List.of("userNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html)
     */
    public inline fun cfnACLProps(block: CfnACLPropsDsl.() -> Unit = {}): CfnACLProps {
        val builder = CfnACLPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a cluster .
     *
     * All nodes in the cluster run the same protocol-compliant engine software.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
     * .aclName("aclName")
     * .clusterName("clusterName")
     * .nodeType("nodeType")
     * // the properties below are optional
     * .autoMinorVersionUpgrade(false)
     * .clusterEndpoint(EndpointProperty.builder()
     * .address("address")
     * .port(123)
     * .build())
     * .dataTiering("dataTiering")
     * .description("description")
     * .engineVersion("engineVersion")
     * .finalSnapshotName("finalSnapshotName")
     * .kmsKeyId("kmsKeyId")
     * .maintenanceWindow("maintenanceWindow")
     * .numReplicasPerShard(123)
     * .numShards(123)
     * .parameterGroupName("parameterGroupName")
     * .port(123)
     * .securityGroupIds(List.of("securityGroupIds"))
     * .snapshotArns(List.of("snapshotArns"))
     * .snapshotName("snapshotName")
     * .snapshotRetentionLimit(123)
     * .snapshotWindow("snapshotWindow")
     * .snsTopicArn("snsTopicArn")
     * .snsTopicStatus("snsTopicStatus")
     * .subnetGroupName("subnetGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tlsEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html)
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
     * Represents the information required for client programs to connect to the cluster and its
     * nodes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * EndpointProperty endpointProperty = EndpointProperty.builder()
     * .address("address")
     * .port(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-cluster-endpoint.html)
     */
    public inline fun cfnClusterEndpointProperty(
        block: CfnClusterEndpointPropertyDsl.() -> Unit = {}
    ): CfnCluster.EndpointProperty {
        val builder = CfnClusterEndpointPropertyDsl()
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
     * import software.amazon.awscdk.services.memorydb.*;
     * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
     * .aclName("aclName")
     * .clusterName("clusterName")
     * .nodeType("nodeType")
     * // the properties below are optional
     * .autoMinorVersionUpgrade(false)
     * .clusterEndpoint(EndpointProperty.builder()
     * .address("address")
     * .port(123)
     * .build())
     * .dataTiering("dataTiering")
     * .description("description")
     * .engineVersion("engineVersion")
     * .finalSnapshotName("finalSnapshotName")
     * .kmsKeyId("kmsKeyId")
     * .maintenanceWindow("maintenanceWindow")
     * .numReplicasPerShard(123)
     * .numShards(123)
     * .parameterGroupName("parameterGroupName")
     * .port(123)
     * .securityGroupIds(List.of("securityGroupIds"))
     * .snapshotArns(List.of("snapshotArns"))
     * .snapshotName("snapshotName")
     * .snapshotRetentionLimit(123)
     * .snapshotWindow("snapshotWindow")
     * .snsTopicArn("snsTopicArn")
     * .snsTopicStatus("snsTopicStatus")
     * .subnetGroupName("subnetGroupName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tlsEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-cluster.html)
     */
    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a new MemoryDB parameter group.
     *
     * A parameter group is a collection of parameters and their values that are applied to all of
     * the nodes in any cluster . For more information, see
     * [Configuring engine parameters using parameter groups](https://docs.aws.amazon.com/memorydb/latest/devguide/parametergroups.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * Object parameters;
     * CfnParameterGroup cfnParameterGroup = CfnParameterGroup.Builder.create(this,
     * "MyCfnParameterGroup")
     * .family("family")
     * .parameterGroupName("parameterGroupName")
     * // the properties below are optional
     * .description("description")
     * .parameters(parameters)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html)
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * Object parameters;
     * CfnParameterGroupProps cfnParameterGroupProps = CfnParameterGroupProps.builder()
     * .family("family")
     * .parameterGroupName("parameterGroupName")
     * // the properties below are optional
     * .description("description")
     * .parameters(parameters)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html)
     */
    public inline fun cfnParameterGroupProps(
        block: CfnParameterGroupPropsDsl.() -> Unit = {}
    ): CfnParameterGroupProps {
        val builder = CfnParameterGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a subnet group.
     *
     * A subnet group is a collection of subnets (typically private) that you can designate for your
     * cluster s running in an Amazon Virtual Private Cloud (VPC) environment. When you create a
     * cluster in an Amazon VPC , you must specify a subnet group. MemoryDB uses that subnet group
     * to choose a subnet and IP addresses within that subnet to associate with your nodes. For more
     * information, see
     * [Subnets and subnet groups](https://docs.aws.amazon.com/memorydb/latest/devguide/subnetgroups.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * CfnSubnetGroup cfnSubnetGroup = CfnSubnetGroup.Builder.create(this, "MyCfnSubnetGroup")
     * .subnetGroupName("subnetGroupName")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html)
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
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * CfnSubnetGroupProps cfnSubnetGroupProps = CfnSubnetGroupProps.builder()
     * .subnetGroupName("subnetGroupName")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html)
     */
    public inline fun cfnSubnetGroupProps(
        block: CfnSubnetGroupPropsDsl.() -> Unit = {}
    ): CfnSubnetGroupProps {
        val builder = CfnSubnetGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a MemoryDB user.
     *
     * For more information, see
     * [Authenticating users with Access Contol Lists (ACLs)](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * Object authenticationMode;
     * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
     * .userName("userName")
     * // the properties below are optional
     * .accessString("accessString")
     * .authenticationMode(authenticationMode)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html)
     */
    public inline fun cfnUser(
        scope: Construct,
        id: String,
        block: CfnUserDsl.() -> Unit = {},
    ): CfnUser {
        val builder = CfnUserDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Denotes the user's authentication properties, such as whether it requires a password to
     * authenticate.
     *
     * Used in output responses.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * AuthenticationModeProperty authenticationModeProperty = AuthenticationModeProperty.builder()
     * .passwords(List.of("passwords"))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-memorydb-user-authenticationmode.html)
     */
    public inline fun cfnUserAuthenticationModeProperty(
        block: CfnUserAuthenticationModePropertyDsl.() -> Unit = {}
    ): CfnUser.AuthenticationModeProperty {
        val builder = CfnUserAuthenticationModePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUser`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.memorydb.*;
     * Object authenticationMode;
     * CfnUserProps cfnUserProps = CfnUserProps.builder()
     * .userName("userName")
     * // the properties below are optional
     * .accessString("accessString")
     * .authenticationMode(authenticationMode)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-user.html)
     */
    public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
        val builder = CfnUserPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
