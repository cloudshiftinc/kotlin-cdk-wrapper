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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.datasync.CfnAgentProps

/**
 * Properties for defining a `CfnAgent`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * CfnAgentProps cfnAgentProps = CfnAgentProps.builder()
 * .activationKey("activationKey")
 * .agentName("agentName")
 * .securityGroupArns(List.of("securityGroupArns"))
 * .subnetArns(List.of("subnetArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcEndpointId("vpcEndpointId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html)
 */
@CdkDslMarker
public class CfnAgentPropsDsl {
    private val cdkBuilder: CfnAgentProps.Builder = CfnAgentProps.builder()

    private val _securityGroupArns: MutableList<String> = mutableListOf()

    private val _subnetArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param activationKey Specifies your DataSync agent's activation key. If you don't have an
     *   activation key, see
     *   [Activate your agent](https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html)
     *   .
     */
    public fun activationKey(activationKey: String) {
        cdkBuilder.activationKey(activationKey)
    }

    /**
     * @param agentName Specifies a name for your agent. You can see this name in the DataSync
     *   console.
     */
    public fun agentName(agentName: String) {
        cdkBuilder.agentName(agentName)
    }

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     *   protect your data transfer task subnets. See
     *   [SecurityGroupArns](https://docs.aws.amazon.com/datasync/latest/userguide/API_Ec2Config.html#DataSync-Type-Ec2Config-SecurityGroupArns)
     *   .
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     */
    public fun securityGroupArns(vararg securityGroupArns: String) {
        _securityGroupArns.addAll(listOf(*securityGroupArns))
    }

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     *   protect your data transfer task subnets. See
     *   [SecurityGroupArns](https://docs.aws.amazon.com/datasync/latest/userguide/API_Ec2Config.html#DataSync-Type-Ec2Config-SecurityGroupArns)
     *   .
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     */
    public fun securityGroupArns(securityGroupArns: Collection<String>) {
        _securityGroupArns.addAll(securityGroupArns)
    }

    /**
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     *   when using a VPC endpoint. This is the subnet where DataSync creates and manages the
     *   [network interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     *   for your transfer. You can only specify one ARN.
     */
    public fun subnetArns(vararg subnetArns: String) {
        _subnetArns.addAll(listOf(*subnetArns))
    }

    /**
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     *   when using a VPC endpoint. This is the subnet where DataSync creates and manages the
     *   [network interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     *   for your transfer. You can only specify one ARN.
     */
    public fun subnetArns(subnetArns: Collection<String>) {
        _subnetArns.addAll(subnetArns)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources. We recommend creating at least one tag for your agent.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     *   resources. We recommend creating at least one tag for your agent.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcEndpointId The ID of the virtual private cloud (VPC) endpoint that the agent has
     *   access to. This is the client-side VPC endpoint, powered by AWS PrivateLink . If you don't
     *   have an AWS PrivateLink VPC endpoint, see
     *   [AWS PrivateLink and VPC endpoints](https://docs.aws.amazon.com//vpc/latest/userguide/endpoint-services-overview.html)
     *   in the *Amazon VPC User Guide* .
     *
     * For more information about activating your agent in a private network based on a VPC, see
     * [Using AWS DataSync in a Virtual Private Cloud](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-in-vpc.html)
     * in the *AWS DataSync User Guide.*
     *
     * A VPC endpoint ID looks like this: `vpce-01234d5aff67890e1` .
     */
    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): CfnAgentProps {
        if (_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
        if (_subnetArns.isNotEmpty()) cdkBuilder.subnetArns(_subnetArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
