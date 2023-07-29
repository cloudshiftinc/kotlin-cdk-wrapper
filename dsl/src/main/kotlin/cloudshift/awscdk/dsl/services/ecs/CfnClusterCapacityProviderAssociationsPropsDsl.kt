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
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps

/**
 * Properties for defining a `CfnClusterCapacityProviderAssociations`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CfnClusterCapacityProviderAssociationsProps cfnClusterCapacityProviderAssociationsProps =
 * CfnClusterCapacityProviderAssociationsProps.builder()
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
public class CfnClusterCapacityProviderAssociationsPropsDsl {
    private val cdkBuilder: CfnClusterCapacityProviderAssociationsProps.Builder =
        CfnClusterCapacityProviderAssociationsProps.builder()

    private val _capacityProviders: MutableList<String> = mutableListOf()

    private val _defaultCapacityProviderStrategy: MutableList<Any> = mutableListOf()

    /** @param capacityProviders The capacity providers to associate with the cluster. */
    public fun capacityProviders(vararg capacityProviders: String) {
        _capacityProviders.addAll(listOf(*capacityProviders))
    }

    /** @param capacityProviders The capacity providers to associate with the cluster. */
    public fun capacityProviders(capacityProviders: Collection<String>) {
        _capacityProviders.addAll(capacityProviders)
    }

    /** @param cluster The cluster the capacity provider association is the target of. */
    public fun cluster(cluster: String) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     *   with the cluster.
     */
    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any) {
        _defaultCapacityProviderStrategy.addAll(listOf(*defaultCapacityProviderStrategy))
    }

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     *   with the cluster.
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: Collection<Any>) {
        _defaultCapacityProviderStrategy.addAll(defaultCapacityProviderStrategy)
    }

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     *   with the cluster.
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
        cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    public fun build(): CfnClusterCapacityProviderAssociationsProps {
        if (_capacityProviders.isNotEmpty()) cdkBuilder.capacityProviders(_capacityProviders)
        if (_defaultCapacityProviderStrategy.isNotEmpty())
            cdkBuilder.defaultCapacityProviderStrategy(_defaultCapacityProviderStrategy)
        return cdkBuilder.build()
    }
}
