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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.constructs.Construct

/**
 * The `AWS::GameLift::Alias` resource creates an alias for an Amazon GameLift (GameLift) fleet
 * destination.
 *
 * There are two types of routing strategies for aliases: simple and terminal. A simple alias points
 * to an active fleet. A terminal alias displays a message instead of routing players to an active
 * fleet. For example, a terminal alias might display a URL link that directs players to an upgrade
 * site. You can use aliases to define destinations in a game session queue or when requesting new
 * game sessions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CfnAlias cfnAlias = CfnAlias.Builder.create(this, "MyCfnAlias")
 * .name("name")
 * .routingStrategy(RoutingStrategyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .fleetId("fleetId")
 * .message("message")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html)
 */
@CdkDslMarker
public class CfnAliasDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAlias.Builder = CfnAlias.Builder.create(scope, id)

    /**
     * A human-readable description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description)
     *
     * @param description A human-readable description of the alias.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A descriptive label that is associated with an alias.
     *
     * Alias names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name)
     *
     * @param name A descriptive label that is associated with an alias.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     *
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     *   for the alias.
     */
    public fun routingStrategy(routingStrategy: IResolvable) {
        cdkBuilder.routingStrategy(routingStrategy)
    }

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     *
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     *   for the alias.
     */
    public fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty) {
        cdkBuilder.routingStrategy(routingStrategy)
    }

    public fun build(): CfnAlias = cdkBuilder.build()
}
