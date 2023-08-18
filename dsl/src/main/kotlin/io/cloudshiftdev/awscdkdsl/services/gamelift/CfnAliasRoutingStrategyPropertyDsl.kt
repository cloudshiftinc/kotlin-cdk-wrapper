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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnAlias

/**
 * The routing configuration for a fleet alias.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * RoutingStrategyProperty routingStrategyProperty = RoutingStrategyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .fleetId("fleetId")
 * .message("message")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html)
 */
@CdkDslMarker
public class CfnAliasRoutingStrategyPropertyDsl {
    private val cdkBuilder: CfnAlias.RoutingStrategyProperty.Builder =
        CfnAlias.RoutingStrategyProperty.builder()

    /**
     * @param fleetId A unique identifier for a fleet that the alias points to. If you specify
     *   `SIMPLE` for the `Type` property, you must specify this property.
     */
    public fun fleetId(fleetId: String) {
        cdkBuilder.fleetId(fleetId)
    }

    /**
     * @param message The message text to be used with a terminal routing strategy. If you specify
     *   `TERMINAL` for the `Type` property, you must specify this property.
     */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    /**
     * @param type A type of routing strategy. Possible routing types include the following:
     * * *SIMPLE* - The alias resolves to one specific fleet. Use this type when routing to active
     *   fleets.
     * * *TERMINAL* - The alias does not resolve to a fleet but instead can be used to display a
     *   message to the user. A terminal alias throws a `TerminalRoutingStrategyException` with the
     *   message that you specified in the `Message` property.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAlias.RoutingStrategyProperty = cdkBuilder.build()
}
