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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations
import software.constructs.Construct

/**
 * The `AWS::ECS::ClusterCapacityProviderAssociations` resource associates one or more capacity
 * providers and a default capacity provider strategy with a cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CfnClusterCapacityProviderAssociations cfnClusterCapacityProviderAssociations =
 * CfnClusterCapacityProviderAssociations.Builder.create(this,
 * "MyCfnClusterCapacityProviderAssociations")
 * .capacityProviders(List.of("capacityProviders"))
 * .cluster("cluster")
 * .defaultCapacityProviderStrategy(List.of(CapacityProviderStrategyProperty.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html)
 */
@CdkDslMarker
public class CfnClusterCapacityProviderAssociationsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnClusterCapacityProviderAssociations.Builder =
        CfnClusterCapacityProviderAssociations.Builder.create(scope, id)

    private val _capacityProviders: MutableList<String> = mutableListOf()

    private val _defaultCapacityProviderStrategy: MutableList<Any> = mutableListOf()

    /**
     * The capacity providers to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-capacityproviders)
     *
     * @param capacityProviders The capacity providers to associate with the cluster.
     */
    public fun capacityProviders(vararg capacityProviders: String) {
        _capacityProviders.addAll(listOf(*capacityProviders))
    }

    /**
     * The capacity providers to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-capacityproviders)
     *
     * @param capacityProviders The capacity providers to associate with the cluster.
     */
    public fun capacityProviders(capacityProviders: Collection<String>) {
        _capacityProviders.addAll(capacityProviders)
    }

    /**
     * The cluster the capacity provider association is the target of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-cluster)
     *
     * @param cluster The cluster the capacity provider association is the target of.
     */
    public fun cluster(cluster: String) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     *
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     *   with the cluster.
     */
    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any) {
        _defaultCapacityProviderStrategy.addAll(listOf(*defaultCapacityProviderStrategy))
    }

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     *
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     *   with the cluster.
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: Collection<Any>) {
        _defaultCapacityProviderStrategy.addAll(defaultCapacityProviderStrategy)
    }

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     *
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     *   with the cluster.
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
        cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    public fun build(): CfnClusterCapacityProviderAssociations {
        if (_capacityProviders.isNotEmpty()) cdkBuilder.capacityProviders(_capacityProviders)
        if (_defaultCapacityProviderStrategy.isNotEmpty())
            cdkBuilder.defaultCapacityProviderStrategy(_defaultCapacityProviderStrategy)
        return cdkBuilder.build()
    }
}
