@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGameServerGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGameServerGroup.Builder = CfnGameServerGroup.Builder.create(scope, id)

    private val _instanceDefinitions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpcSubnets: MutableList<String> = mutableListOf()

    public fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    public fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    public fun balancingStrategy(balancingStrategy: String) {
        cdkBuilder.balancingStrategy(balancingStrategy)
    }

    public fun deleteOption(deleteOption: String) {
        cdkBuilder.deleteOption(deleteOption)
    }

    public fun gameServerGroupName(gameServerGroupName: String) {
        cdkBuilder.gameServerGroupName(gameServerGroupName)
    }

    public fun gameServerProtectionPolicy(gameServerProtectionPolicy: String) {
        cdkBuilder.gameServerProtectionPolicy(gameServerProtectionPolicy)
    }

    public fun instanceDefinitions(vararg instanceDefinitions: Any) {
        _instanceDefinitions.addAll(listOf(*instanceDefinitions))
    }

    public fun instanceDefinitions(instanceDefinitions: Collection<Any>) {
        _instanceDefinitions.addAll(instanceDefinitions)
    }

    public fun instanceDefinitions(instanceDefinitions: IResolvable) {
        cdkBuilder.instanceDefinitions(instanceDefinitions)
    }

    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
    }

    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpcSubnets(vararg vpcSubnets: String) {
        _vpcSubnets.addAll(listOf(*vpcSubnets))
    }

    public fun vpcSubnets(vpcSubnets: Collection<String>) {
        _vpcSubnets.addAll(vpcSubnets)
    }

    public fun build(): CfnGameServerGroup {
        if (_instanceDefinitions.isNotEmpty()) cdkBuilder.instanceDefinitions(_instanceDefinitions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
        return cdkBuilder.build()
    }
}
