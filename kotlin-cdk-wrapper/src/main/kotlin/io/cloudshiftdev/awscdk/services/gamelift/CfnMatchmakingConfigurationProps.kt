@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMatchmakingConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
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
 * .creationTime("creationTime")
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
 * .ruleSetArn("ruleSetArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html)
 */
public interface CfnMatchmakingConfigurationProps {
  /**
   * A flag that determines whether a match that was created with this configuration must be
   * accepted by the matched players.
   *
   * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
   * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
   * acceptance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired)
   */
  public fun acceptanceRequired(): Any

  /**
   * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance
   * is required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancetimeoutseconds)
   */
  public fun acceptanceTimeoutSeconds(): Number? = unwrap(this).getAcceptanceTimeoutSeconds()

  /**
   * The number of player slots in a match to keep open for future players.
   *
   * For example, if the configuration's rule set specifies a match for a single 10-person team, and
   * the additional player count is set to 2, 10 players will be selected for the match and 2 more
   * player slots will be open for future players. This parameter is not used if `FlexMatchMode` is set
   * to `STANDALONE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-additionalplayercount)
   */
  public fun additionalPlayerCount(): Number? = unwrap(this).getAdditionalPlayerCount()

  /**
   * The method used to backfill game sessions that are created with this matchmaking configuration.
   *
   * Specify `MANUAL` when your game manages backfill requests manually or does not use the match
   * backfill feature. Specify `AUTOMATIC` to have GameLift create a `StartMatchBackfill` request
   * whenever a game session has one or more open slots. Learn more about manual and automatic backfill
   * in [Backfill Existing Games with
   * FlexMatch](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-backfill.html) .
   * Automatic backfill is not available when `FlexMatchMode` is set to `STANDALONE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-backfillmode)
   */
  public fun backfillMode(): String? = unwrap(this).getBackfillMode()

  /**
   * A time stamp indicating when this data object was created.
   *
   * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-creationtime)
   */
  public fun creationTime(): String? = unwrap(this).getCreationTime()

  /**
   * Information to add to all events related to the matchmaking configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-customeventdata)
   */
  public fun customEventData(): String? = unwrap(this).getCustomEventData()

  /**
   * A description for the matchmaking configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Indicates whether this matchmaking configuration is being used with Amazon GameLift hosting or
   * as a standalone matchmaking solution.
   *
   * * *STANDALONE* - FlexMatch forms matches and returns match information, including players and
   * team assignments, in a
   * [MatchmakingSucceeded](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html#match-events-matchmakingsucceeded)
   * event.
   * * *WITH_QUEUE* - FlexMatch forms matches and uses the specified Amazon GameLift queue to start
   * a game session for the match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-flexmatchmode)
   */
  public fun flexMatchMode(): String? = unwrap(this).getFlexMatchMode()

  /**
   * A set of custom properties for a game session, formatted as key-value pairs.
   *
   * These properties are passed to a game server process with a request to start a new game
   * session. See [Start a Game
   * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
   * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties)
   */
  public fun gameProperties(): Any? = unwrap(this).getGameProperties()

  /**
   * A set of custom game session properties, formatted as a single string value.
   *
   * This data is passed to a game server process with a request to start a new game session. See
   * [Start a Game
   * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
   * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessiondata)
   */
  public fun gameSessionData(): String? = unwrap(this).getGameSessionData()

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to a
   * Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across all
   * Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` . Queues
   * can be located in any Region. Queues are used to start new Amazon GameLift-hosted game sessions
   * for matches that are created with this matchmaking configuration. If `FlexMatchMode` is set to
   * `STANDALONE` , do not set this parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessionqueuearns)
   */
  public fun gameSessionQueueArns(): List<String> = unwrap(this).getGameSessionQueueArns() ?:
      emptyList()

  /**
   * A unique identifier for the matchmaking configuration.
   *
   * This name is used to identify the configuration associated with a matchmaking request or
   * ticket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-name)
   */
  public fun name(): String

  /**
   * An SNS topic ARN that is set up to receive matchmaking notifications.
   *
   * See [Setting up notifications for
   * matchmaking](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html)
   * for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-notificationtarget)
   */
  public fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

  /**
   * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing
   * out.
   *
   * Requests that fail due to timing out can be resubmitted as needed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-requesttimeoutseconds)
   */
  public fun requestTimeoutSeconds(): Number

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
   * GameLift matchmaking rule set resource that this configuration uses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetarn)
   */
  public fun ruleSetArn(): String? = unwrap(this).getRuleSetArn()

  /**
   * A unique identifier for the matchmaking rule set to use with this configuration.
   *
   * You can use either the rule set name or ARN value. A matchmaking configuration can only use
   * rule sets that are defined in the same Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetname)
   */
  public fun ruleSetName(): String

  /**
   * A list of labels to assign to the new matchmaking configuration resource.
   *
   * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
   * management, access management and cost allocation. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
   * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated.
   * See the AWS General Reference for actual tagging limits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMatchmakingConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     * configuration must be accepted by the matched players. 
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     */
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    /**
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     * configuration must be accepted by the matched players. 
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     */
    public fun acceptanceRequired(acceptanceRequired: IResolvable)

    /**
     * @param acceptanceTimeoutSeconds The length of time (in seconds) to wait for players to accept
     * a proposed match, if acceptance is required.
     */
    public fun acceptanceTimeoutSeconds(acceptanceTimeoutSeconds: Number)

    /**
     * @param additionalPlayerCount The number of player slots in a match to keep open for future
     * players.
     * For example, if the configuration's rule set specifies a match for a single 10-person team,
     * and the additional player count is set to 2, 10 players will be selected for the match and 2
     * more player slots will be open for future players. This parameter is not used if `FlexMatchMode`
     * is set to `STANDALONE` .
     */
    public fun additionalPlayerCount(additionalPlayerCount: Number)

    /**
     * @param backfillMode The method used to backfill game sessions that are created with this
     * matchmaking configuration.
     * Specify `MANUAL` when your game manages backfill requests manually or does not use the match
     * backfill feature. Specify `AUTOMATIC` to have GameLift create a `StartMatchBackfill` request
     * whenever a game session has one or more open slots. Learn more about manual and automatic
     * backfill in [Backfill Existing Games with
     * FlexMatch](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-backfill.html) .
     * Automatic backfill is not available when `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun backfillMode(backfillMode: String)

    /**
     * @param creationTime A time stamp indicating when this data object was created.
     * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
     */
    public fun creationTime(creationTime: String)

    /**
     * @param customEventData Information to add to all events related to the matchmaking
     * configuration.
     */
    public fun customEventData(customEventData: String)

    /**
     * @param description A description for the matchmaking configuration.
     */
    public fun description(description: String)

    /**
     * @param flexMatchMode Indicates whether this matchmaking configuration is being used with
     * Amazon GameLift hosting or as a standalone matchmaking solution.
     * * *STANDALONE* - FlexMatch forms matches and returns match information, including players and
     * team assignments, in a
     * [MatchmakingSucceeded](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html#match-events-matchmakingsucceeded)
     * event.
     * * *WITH_QUEUE* - FlexMatch forms matches and uses the specified Amazon GameLift queue to
     * start a game session for the match.
     */
    public fun flexMatchMode(flexMatchMode: String)

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs.
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun gameProperties(gameProperties: IResolvable)

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs.
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun gameProperties(gameProperties: List<Any>)

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs.
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun gameProperties(vararg gameProperties: Any)

    /**
     * @param gameSessionData A set of custom game session properties, formatted as a single string
     * value.
     * This data is passed to a game server process with a request to start a new game session. See
     * [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    public fun gameSessionData(gameSessionData: String)

    /**
     * @param gameSessionQueueArns The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
     * a Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across
     * all Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` .
     * Queues can be located in any Region. Queues are used to start new Amazon GameLift-hosted game
     * sessions for matches that are created with this matchmaking configuration. If `FlexMatchMode` is
     * set to `STANDALONE` , do not set this parameter.
     */
    public fun gameSessionQueueArns(gameSessionQueueArns: List<String>)

    /**
     * @param gameSessionQueueArns The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
     * a Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across
     * all Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` .
     * Queues can be located in any Region. Queues are used to start new Amazon GameLift-hosted game
     * sessions for matches that are created with this matchmaking configuration. If `FlexMatchMode` is
     * set to `STANDALONE` , do not set this parameter.
     */
    public fun gameSessionQueueArns(vararg gameSessionQueueArns: String)

    /**
     * @param name A unique identifier for the matchmaking configuration. 
     * This name is used to identify the configuration associated with a matchmaking request or
     * ticket.
     */
    public fun name(name: String)

    /**
     * @param notificationTarget An SNS topic ARN that is set up to receive matchmaking
     * notifications.
     * See [Setting up notifications for
     * matchmaking](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html)
     * for more information.
     */
    public fun notificationTarget(notificationTarget: String)

    /**
     * @param requestTimeoutSeconds The maximum duration, in seconds, that a matchmaking ticket can
     * remain in process before timing out. 
     * Requests that fail due to timing out can be resubmitted as needed.
     */
    public fun requestTimeoutSeconds(requestTimeoutSeconds: Number)

    /**
     * @param ruleSetArn The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
     * GameLift matchmaking rule set resource that this configuration uses.
     */
    public fun ruleSetArn(ruleSetArn: String)

    /**
     * @param ruleSetName A unique identifier for the matchmaking rule set to use with this
     * configuration. 
     * You can use either the rule set name or ARN value. A matchmaking configuration can only use
     * rule sets that are defined in the same Region.
     */
    public fun ruleSetName(ruleSetName: String)

    /**
     * @param tags A list of labels to assign to the new matchmaking configuration resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of labels to assign to the new matchmaking configuration resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps.builder()

    /**
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     * configuration must be accepted by the matched players. 
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     */
    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     * configuration must be accepted by the matched players. 
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     */
    override fun acceptanceRequired(acceptanceRequired: IResolvable) {
      cdkBuilder.acceptanceRequired(acceptanceRequired.let(IResolvable::unwrap))
    }

    /**
     * @param acceptanceTimeoutSeconds The length of time (in seconds) to wait for players to accept
     * a proposed match, if acceptance is required.
     */
    override fun acceptanceTimeoutSeconds(acceptanceTimeoutSeconds: Number) {
      cdkBuilder.acceptanceTimeoutSeconds(acceptanceTimeoutSeconds)
    }

    /**
     * @param additionalPlayerCount The number of player slots in a match to keep open for future
     * players.
     * For example, if the configuration's rule set specifies a match for a single 10-person team,
     * and the additional player count is set to 2, 10 players will be selected for the match and 2
     * more player slots will be open for future players. This parameter is not used if `FlexMatchMode`
     * is set to `STANDALONE` .
     */
    override fun additionalPlayerCount(additionalPlayerCount: Number) {
      cdkBuilder.additionalPlayerCount(additionalPlayerCount)
    }

    /**
     * @param backfillMode The method used to backfill game sessions that are created with this
     * matchmaking configuration.
     * Specify `MANUAL` when your game manages backfill requests manually or does not use the match
     * backfill feature. Specify `AUTOMATIC` to have GameLift create a `StartMatchBackfill` request
     * whenever a game session has one or more open slots. Learn more about manual and automatic
     * backfill in [Backfill Existing Games with
     * FlexMatch](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-backfill.html) .
     * Automatic backfill is not available when `FlexMatchMode` is set to `STANDALONE` .
     */
    override fun backfillMode(backfillMode: String) {
      cdkBuilder.backfillMode(backfillMode)
    }

    /**
     * @param creationTime A time stamp indicating when this data object was created.
     * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
     */
    override fun creationTime(creationTime: String) {
      cdkBuilder.creationTime(creationTime)
    }

    /**
     * @param customEventData Information to add to all events related to the matchmaking
     * configuration.
     */
    override fun customEventData(customEventData: String) {
      cdkBuilder.customEventData(customEventData)
    }

    /**
     * @param description A description for the matchmaking configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param flexMatchMode Indicates whether this matchmaking configuration is being used with
     * Amazon GameLift hosting or as a standalone matchmaking solution.
     * * *STANDALONE* - FlexMatch forms matches and returns match information, including players and
     * team assignments, in a
     * [MatchmakingSucceeded](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html#match-events-matchmakingsucceeded)
     * event.
     * * *WITH_QUEUE* - FlexMatch forms matches and uses the specified Amazon GameLift queue to
     * start a game session for the match.
     */
    override fun flexMatchMode(flexMatchMode: String) {
      cdkBuilder.flexMatchMode(flexMatchMode)
    }

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs.
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    override fun gameProperties(gameProperties: IResolvable) {
      cdkBuilder.gameProperties(gameProperties.let(IResolvable::unwrap))
    }

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs.
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    override fun gameProperties(gameProperties: List<Any>) {
      cdkBuilder.gameProperties(gameProperties)
    }

    /**
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs.
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    override fun gameProperties(vararg gameProperties: Any): Unit =
        gameProperties(gameProperties.toList())

    /**
     * @param gameSessionData A set of custom game session properties, formatted as a single string
     * value.
     * This data is passed to a game server process with a request to start a new game session. See
     * [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     */
    override fun gameSessionData(gameSessionData: String) {
      cdkBuilder.gameSessionData(gameSessionData)
    }

    /**
     * @param gameSessionQueueArns The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
     * a Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across
     * all Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` .
     * Queues can be located in any Region. Queues are used to start new Amazon GameLift-hosted game
     * sessions for matches that are created with this matchmaking configuration. If `FlexMatchMode` is
     * set to `STANDALONE` , do not set this parameter.
     */
    override fun gameSessionQueueArns(gameSessionQueueArns: List<String>) {
      cdkBuilder.gameSessionQueueArns(gameSessionQueueArns)
    }

    /**
     * @param gameSessionQueueArns The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
     * a Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across
     * all Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` .
     * Queues can be located in any Region. Queues are used to start new Amazon GameLift-hosted game
     * sessions for matches that are created with this matchmaking configuration. If `FlexMatchMode` is
     * set to `STANDALONE` , do not set this parameter.
     */
    override fun gameSessionQueueArns(vararg gameSessionQueueArns: String): Unit =
        gameSessionQueueArns(gameSessionQueueArns.toList())

    /**
     * @param name A unique identifier for the matchmaking configuration. 
     * This name is used to identify the configuration associated with a matchmaking request or
     * ticket.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param notificationTarget An SNS topic ARN that is set up to receive matchmaking
     * notifications.
     * See [Setting up notifications for
     * matchmaking](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html)
     * for more information.
     */
    override fun notificationTarget(notificationTarget: String) {
      cdkBuilder.notificationTarget(notificationTarget)
    }

    /**
     * @param requestTimeoutSeconds The maximum duration, in seconds, that a matchmaking ticket can
     * remain in process before timing out. 
     * Requests that fail due to timing out can be resubmitted as needed.
     */
    override fun requestTimeoutSeconds(requestTimeoutSeconds: Number) {
      cdkBuilder.requestTimeoutSeconds(requestTimeoutSeconds)
    }

    /**
     * @param ruleSetArn The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
     * GameLift matchmaking rule set resource that this configuration uses.
     */
    override fun ruleSetArn(ruleSetArn: String) {
      cdkBuilder.ruleSetArn(ruleSetArn)
    }

    /**
     * @param ruleSetName A unique identifier for the matchmaking rule set to use with this
     * configuration. 
     * You can use either the rule set name or ARN value. A matchmaking configuration can only use
     * rule sets that are defined in the same Region.
     */
    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    /**
     * @param tags A list of labels to assign to the new matchmaking configuration resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of labels to assign to the new matchmaking configuration resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps,
  ) : CdkObject(cdkObject), CfnMatchmakingConfigurationProps {
    /**
     * A flag that determines whether a match that was created with this configuration must be
     * accepted by the matched players.
     *
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired)
     */
    override fun acceptanceRequired(): Any = unwrap(this).getAcceptanceRequired()

    /**
     * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancetimeoutseconds)
     */
    override fun acceptanceTimeoutSeconds(): Number? = unwrap(this).getAcceptanceTimeoutSeconds()

    /**
     * The number of player slots in a match to keep open for future players.
     *
     * For example, if the configuration's rule set specifies a match for a single 10-person team,
     * and the additional player count is set to 2, 10 players will be selected for the match and 2
     * more player slots will be open for future players. This parameter is not used if `FlexMatchMode`
     * is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-additionalplayercount)
     */
    override fun additionalPlayerCount(): Number? = unwrap(this).getAdditionalPlayerCount()

    /**
     * The method used to backfill game sessions that are created with this matchmaking
     * configuration.
     *
     * Specify `MANUAL` when your game manages backfill requests manually or does not use the match
     * backfill feature. Specify `AUTOMATIC` to have GameLift create a `StartMatchBackfill` request
     * whenever a game session has one or more open slots. Learn more about manual and automatic
     * backfill in [Backfill Existing Games with
     * FlexMatch](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-backfill.html) .
     * Automatic backfill is not available when `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-backfillmode)
     */
    override fun backfillMode(): String? = unwrap(this).getBackfillMode()

    /**
     * A time stamp indicating when this data object was created.
     *
     * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-creationtime)
     */
    override fun creationTime(): String? = unwrap(this).getCreationTime()

    /**
     * Information to add to all events related to the matchmaking configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-customeventdata)
     */
    override fun customEventData(): String? = unwrap(this).getCustomEventData()

    /**
     * A description for the matchmaking configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether this matchmaking configuration is being used with Amazon GameLift hosting
     * or as a standalone matchmaking solution.
     *
     * * *STANDALONE* - FlexMatch forms matches and returns match information, including players and
     * team assignments, in a
     * [MatchmakingSucceeded](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html#match-events-matchmakingsucceeded)
     * event.
     * * *WITH_QUEUE* - FlexMatch forms matches and uses the specified Amazon GameLift queue to
     * start a game session for the match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-flexmatchmode)
     */
    override fun flexMatchMode(): String? = unwrap(this).getFlexMatchMode()

    /**
     * A set of custom properties for a game session, formatted as key-value pairs.
     *
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties)
     */
    override fun gameProperties(): Any? = unwrap(this).getGameProperties()

    /**
     * A set of custom game session properties, formatted as a single string value.
     *
     * This data is passed to a game server process with a request to start a new game session. See
     * [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessiondata)
     */
    override fun gameSessionData(): String? = unwrap(this).getGameSessionData()

    /**
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
     * a Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across
     * all Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` .
     * Queues can be located in any Region. Queues are used to start new Amazon GameLift-hosted game
     * sessions for matches that are created with this matchmaking configuration. If `FlexMatchMode` is
     * set to `STANDALONE` , do not set this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessionqueuearns)
     */
    override fun gameSessionQueueArns(): List<String> = unwrap(this).getGameSessionQueueArns() ?:
        emptyList()

    /**
     * A unique identifier for the matchmaking configuration.
     *
     * This name is used to identify the configuration associated with a matchmaking request or
     * ticket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An SNS topic ARN that is set up to receive matchmaking notifications.
     *
     * See [Setting up notifications for
     * matchmaking](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html)
     * for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-notificationtarget)
     */
    override fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

    /**
     * The maximum duration, in seconds, that a matchmaking ticket can remain in process before
     * timing out.
     *
     * Requests that fail due to timing out can be resubmitted as needed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-requesttimeoutseconds)
     */
    override fun requestTimeoutSeconds(): Number = unwrap(this).getRequestTimeoutSeconds()

    /**
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
     * GameLift matchmaking rule set resource that this configuration uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetarn)
     */
    override fun ruleSetArn(): String? = unwrap(this).getRuleSetArn()

    /**
     * A unique identifier for the matchmaking rule set to use with this configuration.
     *
     * You can use either the rule set name or ARN value. A matchmaking configuration can only use
     * rule sets that are defined in the same Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetname)
     */
    override fun ruleSetName(): String = unwrap(this).getRuleSetName()

    /**
     * A list of labels to assign to the new matchmaking configuration resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMatchmakingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps):
        CfnMatchmakingConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMatchmakingConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMatchmakingConfigurationProps):
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps
  }
}
