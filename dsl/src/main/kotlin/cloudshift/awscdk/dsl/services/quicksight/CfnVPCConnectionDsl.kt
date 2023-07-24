@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.quicksight.CfnVPCConnection
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Creates a new VPC connection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CfnVPCConnection cfnVPCConnection = CfnVPCConnection.Builder.create(this, "MyCfnVPCConnection")
 * .availabilityStatus("availabilityStatus")
 * .awsAccountId("awsAccountId")
 * .dnsResolvers(List.of("dnsResolvers"))
 * .name("name")
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConnectionId("vpcConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html)
 */
@CdkDslMarker
public class CfnVPCConnectionDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnVPCConnection.Builder = CfnVPCConnection.Builder.create(scope, id)

    private val _dnsResolvers: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The availability status of the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-availabilitystatus)
     * @param availabilityStatus The availability status of the VPC connection.
     */
    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    /**
     * The AWS account ID of the account where you want to create a new VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-awsaccountid)
     * @param awsAccountId The AWS account ID of the account where you want to create a new VPC
     * connection.
     */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-dnsresolvers)
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
     */
    public fun dnsResolvers(vararg dnsResolvers: String) {
        _dnsResolvers.addAll(listOf(*dnsResolvers))
    }

    /**
     * A list of IP addresses of DNS resolver endpoints for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-dnsresolvers)
     * @param dnsResolvers A list of IP addresses of DNS resolver endpoints for the VPC connection.
     */
    public fun dnsResolvers(dnsResolvers: Collection<String>) {
        _dnsResolvers.addAll(dnsResolvers)
    }

    /**
     * The display name for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-name)
     * @param name The display name for the VPC connection.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The ARN of the IAM role associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-rolearn)
     * @param roleArn The ARN of the IAM role associated with the VPC connection.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The Amazon EC2 security group IDs associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-securitygroupids)
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * The Amazon EC2 security group IDs associated with the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-securitygroupids)
     * @param securityGroupIds The Amazon EC2 security group IDs associated with the VPC connection.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * A list of subnet IDs for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-subnetids)
     * @param subnetIds A list of subnet IDs for the VPC connection.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * A list of subnet IDs for the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-subnetids)
     * @param subnetIds A list of subnet IDs for the VPC connection.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A map of the key-value pairs for the resource tag or tags assigned to the VPC connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-tags)
     * @param tags A map of the key-value pairs for the resource tag or tags assigned to the VPC
     * connection.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the VPC connection that you're creating.
     *
     * This ID is a unique identifier for each AWS Region in an AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-vpcconnection.html#cfn-quicksight-vpcconnection-vpcconnectionid)
     * @param vpcConnectionId The ID of the VPC connection that you're creating.
     */
    public fun vpcConnectionId(vpcConnectionId: String) {
        cdkBuilder.vpcConnectionId(vpcConnectionId)
    }

    public fun build(): CfnVPCConnection {
        if (_dnsResolvers.isNotEmpty()) cdkBuilder.dnsResolvers(_dnsResolvers)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
