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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The details of a capacity provider strategy.
 *
 * To learn more, see
 * [CapacityProviderStrategyItem](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CapacityProviderStrategyItem.html)
 * in the Amazon ECS API Reference.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * CapacityProviderStrategyItemProperty capacityProviderStrategyItemProperty =
 * CapacityProviderStrategyItemProperty.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-capacityproviderstrategyitem.html)
 */
@CdkDslMarker
public class CfnPipeCapacityProviderStrategyItemPropertyDsl {
    private val cdkBuilder: CfnPipe.CapacityProviderStrategyItemProperty.Builder =
        CfnPipe.CapacityProviderStrategyItemProperty.builder()

    /**
     * @param base The base value designates how many tasks, at a minimum, to run on the specified
     *   capacity provider. Only one capacity provider in a capacity provider strategy can have a
     *   base defined. If no value is specified, the default value of 0 is used.
     */
    public fun base(base: Number) {
        cdkBuilder.base(base)
    }

    /** @param capacityProvider The short name of the capacity provider. */
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

    public fun build(): CfnPipe.CapacityProviderStrategyItemProperty = cdkBuilder.build()
}
