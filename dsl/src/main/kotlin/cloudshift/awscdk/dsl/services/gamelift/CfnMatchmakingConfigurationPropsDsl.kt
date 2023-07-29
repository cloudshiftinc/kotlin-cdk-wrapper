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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps

/**
 * Properties for defining a `CfnMatchmakingConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * CfnMatchmakingConfigurationProps cfnMatchmakingConfigurationProps =
 * CfnMatchmakingConfigurationProps.builder()
 * .acceptanceRequired(false)
 * .name("name")
 * .requestTimeoutSeconds(123)
 * .ruleSetName("ruleSetName")
 * // the properties below are optional
 * .acceptanceTimeoutSeconds(123)
 * .additionalPlayerCount(123)
 * .backfillMode("backfillMode")
 * .customEventData("customEventData")
 * .description("description")
 * .flexMatchMode("flexMatchMode")
 * .gameProperties(List.of(GamePropertyProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .gameSessionData("gameSessionData")
 * .gameSessionQueueArns(List.of("gameSessionQueueArns"))
 * .notificationTarget("notificationTarget")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html)
 */
@CdkDslMarker
public class CfnMatchmakingConfigurationPropsDsl {
    private val cdkBuilder: CfnMatchmakingConfigurationProps.Builder =
        CfnMatchmakingConfigurationProps.builder()

    private val _gameProperties: MutableList<Any> = mutableListOf()

    private val _gameSessionQueueArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     *   configuration must be accepted by the matched players. To require acceptance, set to `TRUE`
     *   . With this option enabled, matchmaking tickets use the status `REQUIRES_ACCEPTANCE` to
     *   indicate when a completed potential match is waiting for player acceptance.
     */
    public fun acceptanceRequired(acceptanceRequired: Boolean) {
        cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     *   configuration must be accepted by the matched players. To require acceptance, set to `TRUE`
     *   . With this option enabled, matchmaking tickets use the status `REQUIRES_ACCEPTANCE` to
     *   indicate when a completed potential match is waiting for player acceptance.
     */
    public fun acceptanceRequired(acceptanceRequired: IResolvable) {
        cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * @param acceptanceTimeoutSeconds The length of time (in seconds) to wait for players to accept
     *   a proposed match, if acceptance is required.
     */
    public fun acceptanceTimeoutSeconds(acceptanceTimeoutSeconds: Number) {
        cdkBuilder.acceptanceTimeoutSeconds(acceptanceTimeoutSeconds)
    }

    /**
     * @param additionalPlayerCount The number of player slots in a match to keep open for future
     *   players. For example, if the configuration's rule set specifies a match for a single
     *   10-person team, and the additional player count is set to 2, 10 players will be selected
     *   for the match and 2 more player slots will be open for future players. This parameter is
     *   not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun additionalPlayerCount(additionalPlayerCount: Number) {
        cdkBuilder.additionalPlayerCount(additionalPlayerCount)
    }

    /**
     * @param backfillMode The method used to backfill game sessions that are created with this
     *   matchmaking configuration. Specify `MANUAL` when your game manages backfill requests
     *   manually or does not use the match backfill feature. Specify `AUTOMATIC` to have GameLift
     *   create a `StartMatchBackfill` request whenever a game session has one or more open slots.
     *   Learn more about manual and automatic backfill in
     *   [Backfill Existing Games with FlexMatch](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-backfill.html)
     *   . Automatic backfill is not available when `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun backfillMode(backfillMode: String) {
        cdkBuilder.backfillMode(backfillMode)
    }

    /**
     * @param customEventData Information to add to all events related to the matchmaking
     *   configuration.
     */
    public fun customEventData(customEventData: String) {
        cdkBuilder.customEventData(customEventData)
    }

    /** @param description A description for the matchmaking configuration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param flexMatchMode Indicates whether this matchmaking configuration is being used with
     *   Amazon GameLift hosting or as a standalone matchmaking solution.
     * * *STANDALONE* - FlexMatch forms matches and returns match information, including players and
     *   team assignments, in a
     *   [MatchmakingSucceeded](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html#match-events-matchmakingsucceeded)
     *   event.
     * * *WITH_QUEUE* - FlexMatch forms matches and uses the specified Amazon GameLift queue to
     *   start a game session for the match.
     */
    public fun flexMatchMode(flexMatchMode: String) {
        cdkBuilder.flexMatchMode(flexMatchMode)
    }

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     *   pairs. These properties are passed to a game server process with a request to start a new
     *   game session. See
     *   [Start a Game Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     *   . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun gameProperties(vararg gameProperties: Any) {
        _gameProperties.addAll(listOf(*gameProperties))
    }

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     *   pairs. These properties are passed to a game server process with a request to start a new
     *   game session. See
     *   [Start a Game Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     *   . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun gameProperties(gameProperties: Collection<Any>) {
        _gameProperties.addAll(gameProperties)
    }

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     *   pairs. These properties are passed to a game server process with a request to start a new
     *   game session. See
     *   [Start a Game Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     *   . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun gameProperties(gameProperties: IResolvable) {
        cdkBuilder.gameProperties(gameProperties)
    }

    /**
     * @param gameSessionData A set of custom game session properties, formatted as a single string
     *   value. This data is passed to a game server process with a request to start a new game
     *   session. See
     *   [Start a Game Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     *   . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun gameSessionData(gameSessionData: String) {
        cdkBuilder.gameSessionData(gameSessionData)
    }

    /**
     * @param gameSessionQueueArns The Amazon Resource Name (
     *   [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is
     *   assigned to a Amazon GameLift game session queue resource and uniquely identifies it. ARNs
     *   are unique across all Regions. Format is
     *   `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` . Queues can be
     *   located in any Region. Queues are used to start new Amazon GameLift-hosted game sessions
     *   for matches that are created with this matchmaking configuration. If `FlexMatchMode` is set
     *   to `STANDALONE` , do not set this parameter.
     */
    public fun gameSessionQueueArns(vararg gameSessionQueueArns: String) {
        _gameSessionQueueArns.addAll(listOf(*gameSessionQueueArns))
    }

    /**
     * @param gameSessionQueueArns The Amazon Resource Name (
     *   [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is
     *   assigned to a Amazon GameLift game session queue resource and uniquely identifies it. ARNs
     *   are unique across all Regions. Format is
     *   `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` . Queues can be
     *   located in any Region. Queues are used to start new Amazon GameLift-hosted game sessions
     *   for matches that are created with this matchmaking configuration. If `FlexMatchMode` is set
     *   to `STANDALONE` , do not set this parameter.
     */
    public fun gameSessionQueueArns(gameSessionQueueArns: Collection<String>) {
        _gameSessionQueueArns.addAll(gameSessionQueueArns)
    }

    /**
     * @param name A unique identifier for the matchmaking configuration. This name is used to
     *   identify the configuration associated with a matchmaking request or ticket.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param notificationTarget An SNS topic ARN that is set up to receive matchmaking
     *   notifications. See
     *   [Setting up notifications for matchmaking](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html)
     *   for more information.
     */
    public fun notificationTarget(notificationTarget: String) {
        cdkBuilder.notificationTarget(notificationTarget)
    }

    /**
     * @param requestTimeoutSeconds The maximum duration, in seconds, that a matchmaking ticket can
     *   remain in process before timing out. Requests that fail due to timing out can be
     *   resubmitted as needed.
     */
    public fun requestTimeoutSeconds(requestTimeoutSeconds: Number) {
        cdkBuilder.requestTimeoutSeconds(requestTimeoutSeconds)
    }

    /**
     * @param ruleSetName A unique identifier for the matchmaking rule set to use with this
     *   configuration. You can use either the rule set name or ARN value. A matchmaking
     *   configuration can only use rule sets that are defined in the same Region.
     */
    public fun ruleSetName(ruleSetName: String) {
        cdkBuilder.ruleSetName(ruleSetName)
    }

    /**
     * @param tags A list of labels to assign to the new matchmaking configuration resource. Tags
     *   are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     *   management, access management and cost allocation. For more information, see
     *   [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Reference* . Once the resource is created, you can use TagResource,
     *   UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     *   may be lower than stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of labels to assign to the new matchmaking configuration resource. Tags
     *   are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     *   management, access management and cost allocation. For more information, see
     *   [Tagging AWS Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     *   the *AWS General Reference* . Once the resource is created, you can use TagResource,
     *   UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit
     *   may be lower than stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMatchmakingConfigurationProps {
        if (_gameProperties.isNotEmpty()) cdkBuilder.gameProperties(_gameProperties)
        if (_gameSessionQueueArns.isNotEmpty())
            cdkBuilder.gameSessionQueueArns(_gameSessionQueueArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
