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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps

/**
 * Properties for defining a `CfnGameServerGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CfnGameServerGroupProps cfnGameServerGroupProps = CfnGameServerGroupProps.builder()
 * .gameServerGroupName("gameServerGroupName")
 * .instanceDefinitions(List.of(InstanceDefinitionProperty.builder()
 * .instanceType("instanceType")
 * // the properties below are optional
 * .weightedCapacity("weightedCapacity")
 * .build()))
 * .roleArn("roleArn")
 * // the properties below are optional
 * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
 * .targetTrackingConfiguration(TargetTrackingConfigurationProperty.builder()
 * .targetValue(123)
 * .build())
 * // the properties below are optional
 * .estimatedInstanceWarmup(123)
 * .build())
 * .balancingStrategy("balancingStrategy")
 * .deleteOption("deleteOption")
 * .gameServerProtectionPolicy("gameServerProtectionPolicy")
 * .launchTemplate(LaunchTemplateProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .version("version")
 * .build())
 * .maxSize(123)
 * .minSize(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcSubnets(List.of("vpcSubnets"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html)
 */
@CdkDslMarker
public class CfnGameServerGroupPropsDsl {
    private val cdkBuilder: CfnGameServerGroupProps.Builder = CfnGameServerGroupProps.builder()

    private val _instanceDefinitions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpcSubnets: MutableList<String> = mutableListOf()

    /**
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     *   Scaling group that is optimized for game hosting. The scaling policy uses the metric
     *   `"PercentUtilizedGameServers"` to maintain a buffer of idle game servers that can
     *   immediately accommodate new games and players. After the Auto Scaling group is created,
     *   update this value directly in the Auto Scaling group using the AWS console or APIs.
     */
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    /**
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     *   Scaling group that is optimized for game hosting. The scaling policy uses the metric
     *   `"PercentUtilizedGameServers"` to maintain a buffer of idle game servers that can
     *   immediately accommodate new games and players. After the Auto Scaling group is created,
     *   update this value directly in the Auto Scaling group using the AWS console or APIs.
     */
    public fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    /**
     * @param balancingStrategy Indicates how Amazon GameLift FleetIQ balances the use of Spot
     *   Instances and On-Demand Instances in the game server group. Method options include the
     *   following:
     * * `SPOT_ONLY` - Only Spot Instances are used in the game server group. If Spot Instances are
     *   unavailable or not viable for game hosting, the game server group provides no hosting
     *   capacity until Spot Instances can again be used. Until then, no new instances are started,
     *   and the existing nonviable Spot Instances are terminated (after current gameplay ends) and
     *   are not replaced.
     * * `SPOT_PREFERRED` - (default value) Spot Instances are used whenever available in the game
     *   server group. If Spot Instances are unavailable, the game server group continues to provide
     *   hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances
     *   are terminated (after current gameplay ends) and are replaced with new On-Demand Instances.
     * * `ON_DEMAND_ONLY` - Only On-Demand Instances are used in the game server group. No Spot
     *   Instances are used, even when available, while this balancing strategy is in force.
     */
    public fun balancingStrategy(balancingStrategy: String) {
        cdkBuilder.balancingStrategy(balancingStrategy)
    }

    /**
     * @param deleteOption The type of delete to perform. To delete a game server group, specify the
     *   `DeleteOption` . Options include the following:
     * * `SAFE_DELETE` – (default) Terminates the game server group and Amazon EC2 Auto Scaling
     *   group only when it has no game servers that are in `UTILIZED` status.
     * * `FORCE_DELETE` – Terminates the game server group, including all active game servers
     *   regardless of their utilization status, and the Amazon EC2 Auto Scaling group.
     * * `RETAIN` – Does a safe delete of the game server group but retains the Amazon EC2 Auto
     *   Scaling group as is.
     */
    public fun deleteOption(deleteOption: String) {
        cdkBuilder.deleteOption(deleteOption)
    }

    /**
     * @param gameServerGroupName A developer-defined identifier for the game server group. The name
     *   is unique for each Region in each AWS account.
     */
    public fun gameServerGroupName(gameServerGroupName: String) {
        cdkBuilder.gameServerGroupName(gameServerGroupName)
    }

    /**
     * @param gameServerProtectionPolicy A flag that indicates whether instances in the game server
     *   group are protected from early termination. Unprotected instances that have active game
     *   servers running might be terminated during a scale-down event, causing players to be
     *   dropped from the game. Protected instances cannot be terminated while there are active game
     *   servers running except in the event of a forced game server group deletion (see ). An
     *   exception to this is with Spot Instances, which can be terminated by AWS regardless of
     *   protection status.
     */
    public fun gameServerProtectionPolicy(gameServerProtectionPolicy: String) {
        cdkBuilder.gameServerProtectionPolicy(gameServerProtectionPolicy)
    }

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     *   can use when balancing and automatically scaling instances in the corresponding Auto
     *   Scaling group.
     */
    public fun instanceDefinitions(vararg instanceDefinitions: Any) {
        _instanceDefinitions.addAll(listOf(*instanceDefinitions))
    }

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     *   can use when balancing and automatically scaling instances in the corresponding Auto
     *   Scaling group.
     */
    public fun instanceDefinitions(instanceDefinitions: Collection<Any>) {
        _instanceDefinitions.addAll(instanceDefinitions)
    }

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     *   can use when balancing and automatically scaling instances in the corresponding Auto
     *   Scaling group.
     */
    public fun instanceDefinitions(instanceDefinitions: IResolvable) {
        cdkBuilder.instanceDefinitions(instanceDefinitions)
    }

    /**
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     *   game server code to be deployed to all instances in the game server group. You can specify
     *   the template using either the template name or ID. For help with creating a launch
     *   template, see
     *   [Creating a Launch Template for an Auto Scaling Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html)
     *   in the *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling
     *   group is created, update this value directly in the Auto Scaling group using the AWS
     *   console or APIs.
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     */
    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     *   game server code to be deployed to all instances in the game server group. You can specify
     *   the template using either the template name or ID. For help with creating a launch
     *   template, see
     *   [Creating a Launch Template for an Auto Scaling Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html)
     *   in the *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling
     *   group is created, update this value directly in the Auto Scaling group using the AWS
     *   console or APIs.
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     */
    public fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * @param maxSize The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
     *   During automatic scaling events, Amazon GameLift FleetIQ and EC2 do not scale up the group
     *   above this maximum. After the Auto Scaling group is created, update this value directly in
     *   the Auto Scaling group using the AWS console or APIs.
     */
    public fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param minSize The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
     *   During automatic scaling events, Amazon GameLift FleetIQ and Amazon EC2 do not scale down
     *   the group below this minimum. In production, this value should be set to at least 1. After
     *   the Auto Scaling group is created, update this value directly in the Auto Scaling group
     *   using the AWS console or APIs.
     */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    /**
     * @param roleArn The Amazon Resource Name (
     *   [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role
     *   that allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags A list of labels to assign to the new game server group resource. Tags are
     *   developer-defined key-value pairs. Tagging AWS resources is useful for resource management,
     *   access management, and cost allocation. For more information, see
     *   [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Reference* . Once the resource is created, you can use TagResource,
     *   UntagResource, and ListTagsForResource to add, remove, and view tags, respectively. The
     *   maximum tag limit may be lower than stated. See the AWS General Reference for actual
     *   tagging limits.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of labels to assign to the new game server group resource. Tags are
     *   developer-defined key-value pairs. Tagging AWS resources is useful for resource management,
     *   access management, and cost allocation. For more information, see
     *   [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Reference* . Once the resource is created, you can use TagResource,
     *   UntagResource, and ListTagsForResource to add, remove, and view tags, respectively. The
     *   maximum tag limit may be lower than stated. See the AWS General Reference for actual
     *   tagging limits.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     *   game server group. By default, all Amazon GameLift FleetIQ-supported Availability Zones are
     *   used. You can use this parameter to specify VPCs that you've set up. This property cannot
     *   be updated after the game server group is created, and the corresponding Auto Scaling group
     *   will always use the property value that is set with this request, even if the Auto Scaling
     *   group is updated directly.
     */
    public fun vpcSubnets(vararg vpcSubnets: String) {
        _vpcSubnets.addAll(listOf(*vpcSubnets))
    }

    /**
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     *   game server group. By default, all Amazon GameLift FleetIQ-supported Availability Zones are
     *   used. You can use this parameter to specify VPCs that you've set up. This property cannot
     *   be updated after the game server group is created, and the corresponding Auto Scaling group
     *   will always use the property value that is set with this request, even if the Auto Scaling
     *   group is updated directly.
     */
    public fun vpcSubnets(vpcSubnets: Collection<String>) {
        _vpcSubnets.addAll(vpcSubnets)
    }

    public fun build(): CfnGameServerGroupProps {
        if (_instanceDefinitions.isNotEmpty()) cdkBuilder.instanceDefinitions(_instanceDefinitions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
        return cdkBuilder.build()
    }
}
