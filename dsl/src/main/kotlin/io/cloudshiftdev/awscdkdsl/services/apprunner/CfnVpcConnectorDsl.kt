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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.apprunner.CfnVpcConnector
import software.constructs.Construct

/**
 * Specify an AWS App Runner VPC connector by using the `AWS::AppRunner::VpcConnector` resource in
 * an AWS CloudFormation template.
 *
 * The `AWS::AppRunner::VpcConnector` resource is an AWS App Runner resource type that specifies an
 * App Runner VPC connector.
 *
 * App Runner requires this resource when you want to associate your App Runner service to a custom
 * Amazon Virtual Private Cloud ( Amazon VPC ).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CfnVpcConnector cfnVpcConnector = CfnVpcConnector.Builder.create(this, "MyCfnVpcConnector")
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .securityGroups(List.of("securityGroups"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConnectorName("vpcConnectorName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html)
 */
@CdkDslMarker
public class CfnVpcConnectorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVpcConnector.Builder = CfnVpcConnector.Builder.create(scope, id)

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of IDs of security groups that App Runner should use for access to AWS resources under
     * the specified subnets.
     *
     * If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-securitygroups)
     *
     * @param securityGroups A list of IDs of security groups that App Runner should use for access
     *   to AWS resources under the specified subnets.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * A list of IDs of security groups that App Runner should use for access to AWS resources under
     * the specified subnets.
     *
     * If not specified, App Runner uses the default security group of the Amazon VPC. The default
     * security group allows all outbound traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-securitygroups)
     *
     * @param securityGroups A list of IDs of security groups that App Runner should use for access
     *   to AWS resources under the specified subnets.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * A list of IDs of subnets that App Runner should use when it associates your service with a
     * custom Amazon VPC.
     *
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the
     * subnets you specify.
     *
     * App Runner currently only provides support for IPv4.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-subnets)
     *
     * @param subnets A list of IDs of subnets that App Runner should use when it associates your
     *   service with a custom Amazon VPC.
     */
    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    /**
     * A list of IDs of subnets that App Runner should use when it associates your service with a
     * custom Amazon VPC.
     *
     * Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the
     * subnets you specify.
     *
     * App Runner currently only provides support for IPv4.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-subnets)
     *
     * @param subnets A list of IDs of subnets that App Runner should use when it associates your
     *   service with a custom Amazon VPC.
     */
    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    /**
     * A list of metadata items that you can associate with your VPC connector resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-tags)
     *
     * @param tags A list of metadata items that you can associate with your VPC connector resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of metadata items that you can associate with your VPC connector resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-tags)
     *
     * @param tags A list of metadata items that you can associate with your VPC connector resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A name for the VPC connector.
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your VPC connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcconnector.html#cfn-apprunner-vpcconnector-vpcconnectorname)
     *
     * @param vpcConnectorName A name for the VPC connector.
     */
    public fun vpcConnectorName(vpcConnectorName: String) {
        cdkBuilder.vpcConnectorName(vpcConnectorName)
    }

    public fun build(): CfnVpcConnector {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
