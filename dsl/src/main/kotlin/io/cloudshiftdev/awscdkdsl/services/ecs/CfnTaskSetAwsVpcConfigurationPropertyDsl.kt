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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CfnTaskSet

/**
 * An object representing the networking details for a task or service.
 *
 * For example `awsvpcConfiguration={subnets=["subnet-12344321"],securityGroups=["sg-12344321"]}`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * AwsVpcConfigurationProperty awsVpcConfigurationProperty = AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html)
 */
@CdkDslMarker
public class CfnTaskSetAwsVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnTaskSet.AwsVpcConfigurationProperty.Builder =
        CfnTaskSet.AwsVpcConfigurationProperty.builder()

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    /**
     * @param assignPublicIp Whether the task's elastic network interface receives a public IP
     *   address. The default value is `DISABLED` .
     */
    public fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
    }

    /**
     * @param securityGroups The IDs of the security groups associated with the task or service. If
     *   you don't specify a security group, the default security group for the VPC is used. There's
     *   a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
     *
     * All specified security groups must be from the same VPC.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The IDs of the security groups associated with the task or service. If
     *   you don't specify a security group, the default security group for the VPC is used. There's
     *   a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
     *
     * All specified security groups must be from the same VPC.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param subnets The IDs of the subnets associated with the task or service. There's a limit of
     *   16 subnets that can be specified per `AwsVpcConfiguration` .
     *
     * All specified subnets must be from the same VPC.
     */
    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    /**
     * @param subnets The IDs of the subnets associated with the task or service. There's a limit of
     *   16 subnets that can be specified per `AwsVpcConfiguration` .
     *
     * All specified subnets must be from the same VPC.
     */
    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    public fun build(): CfnTaskSet.AwsVpcConfigurationProperty {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
