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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * The VPC security groups and subnets that are attached to a Lambda function.
 *
 * When you connect a function to a VPC, Lambda creates an elastic network interface for each
 * combination of security group and subnet in the function's VPC configuration. The function can
 * only access resources and the internet through that VPC. For more information, see
 * [VPC Settings](https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html) .
 *
 * When you delete a function, AWS CloudFormation monitors the state of its network interfaces and
 * waits for Lambda to delete them before proceeding. If the VPC is defined in the same stack, the
 * network interfaces need to be deleted by Lambda before AWS CloudFormation can delete the VPC's
 * resources.
 *
 * To monitor network interfaces, AWS CloudFormation needs the `ec2:DescribeNetworkInterfaces`
 * permission. It obtains this from the user or role that modifies the stack. If you don't provide
 * this permission, AWS CloudFormation does not wait for network interfaces to be deleted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html)
 */
@CdkDslMarker
public class CfnFunctionVpcConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.VpcConfigProperty.Builder =
        CfnFunction.VpcConfigProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /** @param securityGroupIds A list of VPC security group IDs. */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /** @param securityGroupIds A list of VPC security group IDs. */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /** @param subnetIds A list of VPC subnet IDs. */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /** @param subnetIds A list of VPC subnet IDs. */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    public fun build(): CfnFunction.VpcConfigProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
