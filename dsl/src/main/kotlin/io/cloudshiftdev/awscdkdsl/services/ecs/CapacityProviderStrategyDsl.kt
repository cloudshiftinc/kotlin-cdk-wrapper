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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy

/**
 * A Capacity Provider strategy to use for the service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CapacityProviderStrategy capacityProviderStrategy = CapacityProviderStrategy.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class CapacityProviderStrategyDsl {
    private val cdkBuilder: CapacityProviderStrategy.Builder = CapacityProviderStrategy.builder()

    /**
     * @param base The base value designates how many tasks, at a minimum, to run on the specified
     *   capacity provider. Only one capacity provider in a capacity provider strategy can have a
     *   base defined. If no value is specified, the default value of 0 is used.
     */
    public fun base(base: Number) {
        cdkBuilder.base(base)
    }

    /** @param capacityProvider The name of the capacity provider. */
    public fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
    }

    /**
     * @param weight The weight value designates the relative percentage of the total number of
     *   tasks launched that should use the specified capacity provider. The weight value is taken
     *   into consideration after the base value, if defined, is satisfied.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CapacityProviderStrategy = cdkBuilder.build()
}
