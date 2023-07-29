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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskSet

/**
 * The network configuration for a task or service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * NetworkConfigurationProperty networkConfigurationProperty =
 * NetworkConfigurationProperty.builder()
 * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html)
 */
@CdkDslMarker
public class CfnTaskSetNetworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnTaskSet.NetworkConfigurationProperty.Builder =
        CfnTaskSet.NetworkConfigurationProperty.builder()

    /**
     * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a
     *   task.
     *
     * All specified subnets and security groups must be from the same VPC.
     */
    public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration)
    }

    /**
     * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a
     *   task.
     *
     * All specified subnets and security groups must be from the same VPC.
     */
    public fun awsVpcConfiguration(awsVpcConfiguration: CfnTaskSet.AwsVpcConfigurationProperty) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration)
    }

    public fun build(): CfnTaskSet.NetworkConfigurationProperty = cdkBuilder.build()
}
