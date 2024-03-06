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
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration

/**
 * This key-value pair can store custom data about a game session.
 *
 * For example, you might use a `GameProperty` to track a game session's map, level of difficulty,
 * or remaining time. The difficulty level could be specified like this: `{"Key": "difficulty",
 * "Value":"Novice"}` .
 *
 * You can set game properties when creating a game session. You can also modify game properties of
 * an active game session. When searching for game sessions, you can filter on game property keys
 * and values. You can't delete game properties from a game session.
 *
 * For examples of working with game properties, see
 * [Create a game session with properties](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * GamePropertyProperty gamePropertyProperty = GamePropertyProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-matchmakingconfiguration-gameproperty.html)
 */
@CdkDslMarker
public class CfnMatchmakingConfigurationGamePropertyPropertyDsl {
    private val cdkBuilder: CfnMatchmakingConfiguration.GamePropertyProperty.Builder =
        CfnMatchmakingConfiguration.GamePropertyProperty.builder()

    /** @param key The game property identifier. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The game property value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnMatchmakingConfiguration.GamePropertyProperty = cdkBuilder.build()
}
