@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GameLift::MatchmakingConfiguration` resource defines a new matchmaking configuration
 * for use with FlexMatch.
 *
 * Whether you're using FlexMatch with GameLift hosting or as a standalone matchmaking service, the
 * matchmaking configuration sets out rules for matching players and forming teams. If you're using
 * GameLift hosting, it also defines how to start game sessions for each match. Your matchmaking system
 * can use multiple configurations to handle different game scenarios. All matchmaking requests
 * identify the matchmaking configuration to use and provide player attributes that are consistent with
 * that configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnMatchmakingConfiguration cfnMatchmakingConfiguration =
 * CfnMatchmakingConfiguration.Builder.create(this, "MyCfnMatchmakingConfiguration")
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
public open class CfnMatchmakingConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A flag that determines whether a match that was created with this configuration must be
   * accepted by the matched players.
   */
  public open fun acceptanceRequired(): Any = unwrap(this).getAcceptanceRequired()

  /**
   * A flag that determines whether a match that was created with this configuration must be
   * accepted by the matched players.
   */
  public open fun acceptanceRequired(`value`: Boolean) {
    unwrap(this).setAcceptanceRequired(`value`)
  }

  /**
   * A flag that determines whether a match that was created with this configuration must be
   * accepted by the matched players.
   */
  public open fun acceptanceRequired(`value`: IResolvable) {
    unwrap(this).setAcceptanceRequired(`value`.let(IResolvable::unwrap))
  }

  /**
   * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance
   * is required.
   */
  public open fun acceptanceTimeoutSeconds(): Number? = unwrap(this).getAcceptanceTimeoutSeconds()

  /**
   * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance
   * is required.
   */
  public open fun acceptanceTimeoutSeconds(`value`: Number) {
    unwrap(this).setAcceptanceTimeoutSeconds(`value`)
  }

  /**
   * The number of player slots in a match to keep open for future players.
   */
  public open fun additionalPlayerCount(): Number? = unwrap(this).getAdditionalPlayerCount()

  /**
   * The number of player slots in a match to keep open for future players.
   */
  public open fun additionalPlayerCount(`value`: Number) {
    unwrap(this).setAdditionalPlayerCount(`value`)
  }

  /**
   * The unique Amazon Resource Name (ARN) for the `MatchmakingConfiguration` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The `MatchmakingConfiguration` name, which is unique.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The method used to backfill game sessions that are created with this matchmaking configuration.
   */
  public open fun backfillMode(): String? = unwrap(this).getBackfillMode()

  /**
   * The method used to backfill game sessions that are created with this matchmaking configuration.
   */
  public open fun backfillMode(`value`: String) {
    unwrap(this).setBackfillMode(`value`)
  }

  /**
   * A time stamp indicating when this data object was created.
   */
  public open fun creationTime(): String? = unwrap(this).getCreationTime()

  /**
   * A time stamp indicating when this data object was created.
   */
  public open fun creationTime(`value`: String) {
    unwrap(this).setCreationTime(`value`)
  }

  /**
   * Information to add to all events related to the matchmaking configuration.
   */
  public open fun customEventData(): String? = unwrap(this).getCustomEventData()

  /**
   * Information to add to all events related to the matchmaking configuration.
   */
  public open fun customEventData(`value`: String) {
    unwrap(this).setCustomEventData(`value`)
  }

  /**
   * A description for the matchmaking configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the matchmaking configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Indicates whether this matchmaking configuration is being used with Amazon GameLift hosting or
   * as a standalone matchmaking solution.
   */
  public open fun flexMatchMode(): String? = unwrap(this).getFlexMatchMode()

  /**
   * Indicates whether this matchmaking configuration is being used with Amazon GameLift hosting or
   * as a standalone matchmaking solution.
   */
  public open fun flexMatchMode(`value`: String) {
    unwrap(this).setFlexMatchMode(`value`)
  }

  /**
   * A set of custom properties for a game session, formatted as key-value pairs.
   */
  public open fun gameProperties(): Any? = unwrap(this).getGameProperties()

  /**
   * A set of custom properties for a game session, formatted as key-value pairs.
   */
  public open fun gameProperties(`value`: IResolvable) {
    unwrap(this).setGameProperties(`value`.let(IResolvable::unwrap))
  }

  /**
   * A set of custom properties for a game session, formatted as key-value pairs.
   */
  public open fun gameProperties(_idx_ac66f0: List<Any>) {
    unwrap(this).setGameProperties(_idx_ac66f0)
  }

  /**
   * A set of custom properties for a game session, formatted as key-value pairs.
   */
  public open fun gameProperties(vararg _idx_ac66f0: Any): Unit =
      gameProperties(_idx_ac66f0.toList())

  /**
   * A set of custom game session properties, formatted as a single string value.
   */
  public open fun gameSessionData(): String? = unwrap(this).getGameSessionData()

  /**
   * A set of custom game session properties, formatted as a single string value.
   */
  public open fun gameSessionData(`value`: String) {
    unwrap(this).setGameSessionData(`value`)
  }

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to a
   * Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across all
   * Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` . Queues
   * can be located in any Region. Queues are used to start new Amazon GameLift-hosted game sessions
   * for matches that are created with this matchmaking configuration. If `FlexMatchMode` is set to
   * `STANDALONE` , do not set this parameter.
   */
  public open fun gameSessionQueueArns(): List<String> = unwrap(this).getGameSessionQueueArns() ?:
      emptyList()

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to a
   * Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across all
   * Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` . Queues
   * can be located in any Region. Queues are used to start new Amazon GameLift-hosted game sessions
   * for matches that are created with this matchmaking configuration. If `FlexMatchMode` is set to
   * `STANDALONE` , do not set this parameter.
   */
  public open fun gameSessionQueueArns(`value`: List<String>) {
    unwrap(this).setGameSessionQueueArns(`value`)
  }

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to a
   * Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across all
   * Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` . Queues
   * can be located in any Region. Queues are used to start new Amazon GameLift-hosted game sessions
   * for matches that are created with this matchmaking configuration. If `FlexMatchMode` is set to
   * `STANDALONE` , do not set this parameter.
   */
  public open fun gameSessionQueueArns(vararg `value`: String): Unit =
      gameSessionQueueArns(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A unique identifier for the matchmaking configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A unique identifier for the matchmaking configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An SNS topic ARN that is set up to receive matchmaking notifications.
   */
  public open fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

  /**
   * An SNS topic ARN that is set up to receive matchmaking notifications.
   */
  public open fun notificationTarget(`value`: String) {
    unwrap(this).setNotificationTarget(`value`)
  }

  /**
   * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing
   * out.
   */
  public open fun requestTimeoutSeconds(): Number = unwrap(this).getRequestTimeoutSeconds()

  /**
   * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing
   * out.
   */
  public open fun requestTimeoutSeconds(`value`: Number) {
    unwrap(this).setRequestTimeoutSeconds(`value`)
  }

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
   * GameLift matchmaking rule set resource that this configuration uses.
   */
  public open fun ruleSetArn(): String? = unwrap(this).getRuleSetArn()

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
   * GameLift matchmaking rule set resource that this configuration uses.
   */
  public open fun ruleSetArn(`value`: String) {
    unwrap(this).setRuleSetArn(`value`)
  }

  /**
   * A unique identifier for the matchmaking rule set to use with this configuration.
   */
  public open fun ruleSetName(): String = unwrap(this).getRuleSetName()

  /**
   * A unique identifier for the matchmaking rule set to use with this configuration.
   */
  public open fun ruleSetName(`value`: String) {
    unwrap(this).setRuleSetName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of labels to assign to the new matchmaking configuration resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of labels to assign to the new matchmaking configuration resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of labels to assign to the new matchmaking configuration resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnMatchmakingConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A flag that determines whether a match that was created with this configuration must be
     * accepted by the matched players.
     *
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired)
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     * configuration must be accepted by the matched players. 
     */
    public fun acceptanceRequired(acceptanceRequired: Boolean)

    /**
     * A flag that determines whether a match that was created with this configuration must be
     * accepted by the matched players.
     *
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired)
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     * configuration must be accepted by the matched players. 
     */
    public fun acceptanceRequired(acceptanceRequired: IResolvable)

    /**
     * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancetimeoutseconds)
     * @param acceptanceTimeoutSeconds The length of time (in seconds) to wait for players to accept
     * a proposed match, if acceptance is required. 
     */
    public fun acceptanceTimeoutSeconds(acceptanceTimeoutSeconds: Number)

    /**
     * The number of player slots in a match to keep open for future players.
     *
     * For example, if the configuration's rule set specifies a match for a single 10-person team,
     * and the additional player count is set to 2, 10 players will be selected for the match and 2
     * more player slots will be open for future players. This parameter is not used if `FlexMatchMode`
     * is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-additionalplayercount)
     * @param additionalPlayerCount The number of player slots in a match to keep open for future
     * players. 
     */
    public fun additionalPlayerCount(additionalPlayerCount: Number)

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
     * @param backfillMode The method used to backfill game sessions that are created with this
     * matchmaking configuration. 
     */
    public fun backfillMode(backfillMode: String)

    /**
     * A time stamp indicating when this data object was created.
     *
     * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-creationtime)
     * @param creationTime A time stamp indicating when this data object was created. 
     */
    public fun creationTime(creationTime: String)

    /**
     * Information to add to all events related to the matchmaking configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-customeventdata)
     * @param customEventData Information to add to all events related to the matchmaking
     * configuration. 
     */
    public fun customEventData(customEventData: String)

    /**
     * A description for the matchmaking configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-description)
     * @param description A description for the matchmaking configuration. 
     */
    public fun description(description: String)

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
     * @param flexMatchMode Indicates whether this matchmaking configuration is being used with
     * Amazon GameLift hosting or as a standalone matchmaking solution. 
     */
    public fun flexMatchMode(flexMatchMode: String)

    /**
     * A set of custom properties for a game session, formatted as key-value pairs.
     *
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties)
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs. 
     */
    public fun gameProperties(gameProperties: IResolvable)

    /**
     * A set of custom properties for a game session, formatted as key-value pairs.
     *
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties)
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs. 
     */
    public fun gameProperties(gameProperties: List<Any>)

    /**
     * A set of custom properties for a game session, formatted as key-value pairs.
     *
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties)
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs. 
     */
    public fun gameProperties(vararg gameProperties: Any)

    /**
     * A set of custom game session properties, formatted as a single string value.
     *
     * This data is passed to a game server process with a request to start a new game session. See
     * [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessiondata)
     * @param gameSessionData A set of custom game session properties, formatted as a single string
     * value. 
     */
    public fun gameSessionData(gameSessionData: String)

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
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
     * a Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across
     * all Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` .
     * Queues can be located in any Region. Queues are used to start new Amazon GameLift-hosted game
     * sessions for matches that are created with this matchmaking configuration. If `FlexMatchMode` is
     * set to `STANDALONE` , do not set this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessionqueuearns)
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
     * A unique identifier for the matchmaking configuration.
     *
     * This name is used to identify the configuration associated with a matchmaking request or
     * ticket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-name)
     * @param name A unique identifier for the matchmaking configuration. 
     */
    public fun name(name: String)

    /**
     * An SNS topic ARN that is set up to receive matchmaking notifications.
     *
     * See [Setting up notifications for
     * matchmaking](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html)
     * for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-notificationtarget)
     * @param notificationTarget An SNS topic ARN that is set up to receive matchmaking
     * notifications. 
     */
    public fun notificationTarget(notificationTarget: String)

    /**
     * The maximum duration, in seconds, that a matchmaking ticket can remain in process before
     * timing out.
     *
     * Requests that fail due to timing out can be resubmitted as needed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-requesttimeoutseconds)
     * @param requestTimeoutSeconds The maximum duration, in seconds, that a matchmaking ticket can
     * remain in process before timing out. 
     */
    public fun requestTimeoutSeconds(requestTimeoutSeconds: Number)

    /**
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
     * GameLift matchmaking rule set resource that this configuration uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetarn)
     * @param ruleSetArn The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
     * GameLift matchmaking rule set resource that this configuration uses. 
     */
    public fun ruleSetArn(ruleSetArn: String)

    /**
     * A unique identifier for the matchmaking rule set to use with this configuration.
     *
     * You can use either the rule set name or ARN value. A matchmaking configuration can only use
     * rule sets that are defined in the same Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetname)
     * @param ruleSetName A unique identifier for the matchmaking rule set to use with this
     * configuration. 
     */
    public fun ruleSetName(ruleSetName: String)

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
     * @param tags A list of labels to assign to the new matchmaking configuration resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of labels to assign to the new matchmaking configuration resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.Builder =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.Builder.create(scope,
        id)

    /**
     * A flag that determines whether a match that was created with this configuration must be
     * accepted by the matched players.
     *
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired)
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     * configuration must be accepted by the matched players. 
     */
    override fun acceptanceRequired(acceptanceRequired: Boolean) {
      cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * A flag that determines whether a match that was created with this configuration must be
     * accepted by the matched players.
     *
     * To require acceptance, set to `TRUE` . With this option enabled, matchmaking tickets use the
     * status `REQUIRES_ACCEPTANCE` to indicate when a completed potential match is waiting for player
     * acceptance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired)
     * @param acceptanceRequired A flag that determines whether a match that was created with this
     * configuration must be accepted by the matched players. 
     */
    override fun acceptanceRequired(acceptanceRequired: IResolvable) {
      cdkBuilder.acceptanceRequired(acceptanceRequired.let(IResolvable::unwrap))
    }

    /**
     * The length of time (in seconds) to wait for players to accept a proposed match, if acceptance
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancetimeoutseconds)
     * @param acceptanceTimeoutSeconds The length of time (in seconds) to wait for players to accept
     * a proposed match, if acceptance is required. 
     */
    override fun acceptanceTimeoutSeconds(acceptanceTimeoutSeconds: Number) {
      cdkBuilder.acceptanceTimeoutSeconds(acceptanceTimeoutSeconds)
    }

    /**
     * The number of player slots in a match to keep open for future players.
     *
     * For example, if the configuration's rule set specifies a match for a single 10-person team,
     * and the additional player count is set to 2, 10 players will be selected for the match and 2
     * more player slots will be open for future players. This parameter is not used if `FlexMatchMode`
     * is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-additionalplayercount)
     * @param additionalPlayerCount The number of player slots in a match to keep open for future
     * players. 
     */
    override fun additionalPlayerCount(additionalPlayerCount: Number) {
      cdkBuilder.additionalPlayerCount(additionalPlayerCount)
    }

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
     * @param backfillMode The method used to backfill game sessions that are created with this
     * matchmaking configuration. 
     */
    override fun backfillMode(backfillMode: String) {
      cdkBuilder.backfillMode(backfillMode)
    }

    /**
     * A time stamp indicating when this data object was created.
     *
     * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-creationtime)
     * @param creationTime A time stamp indicating when this data object was created. 
     */
    override fun creationTime(creationTime: String) {
      cdkBuilder.creationTime(creationTime)
    }

    /**
     * Information to add to all events related to the matchmaking configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-customeventdata)
     * @param customEventData Information to add to all events related to the matchmaking
     * configuration. 
     */
    override fun customEventData(customEventData: String) {
      cdkBuilder.customEventData(customEventData)
    }

    /**
     * A description for the matchmaking configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-description)
     * @param description A description for the matchmaking configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param flexMatchMode Indicates whether this matchmaking configuration is being used with
     * Amazon GameLift hosting or as a standalone matchmaking solution. 
     */
    override fun flexMatchMode(flexMatchMode: String) {
      cdkBuilder.flexMatchMode(flexMatchMode)
    }

    /**
     * A set of custom properties for a game session, formatted as key-value pairs.
     *
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties)
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs. 
     */
    override fun gameProperties(gameProperties: IResolvable) {
      cdkBuilder.gameProperties(gameProperties.let(IResolvable::unwrap))
    }

    /**
     * A set of custom properties for a game session, formatted as key-value pairs.
     *
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties)
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs. 
     */
    override fun gameProperties(gameProperties: List<Any>) {
      cdkBuilder.gameProperties(gameProperties)
    }

    /**
     * A set of custom properties for a game session, formatted as key-value pairs.
     *
     * These properties are passed to a game server process with a request to start a new game
     * session. See [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties)
     * @param gameProperties A set of custom properties for a game session, formatted as key-value
     * pairs. 
     */
    override fun gameProperties(vararg gameProperties: Any): Unit =
        gameProperties(gameProperties.toList())

    /**
     * A set of custom game session properties, formatted as a single string value.
     *
     * This data is passed to a game server process with a request to start a new game session. See
     * [Start a Game
     * Session](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession)
     * . This parameter is not used if `FlexMatchMode` is set to `STANDALONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessiondata)
     * @param gameSessionData A set of custom game session properties, formatted as a single string
     * value. 
     */
    override fun gameSessionData(gameSessionData: String) {
      cdkBuilder.gameSessionData(gameSessionData)
    }

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
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
     * a Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across
     * all Regions. Format is `arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;` .
     * Queues can be located in any Region. Queues are used to start new Amazon GameLift-hosted game
     * sessions for matches that are created with this matchmaking configuration. If `FlexMatchMode` is
     * set to `STANDALONE` , do not set this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessionqueuearns)
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
     * A unique identifier for the matchmaking configuration.
     *
     * This name is used to identify the configuration associated with a matchmaking request or
     * ticket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-name)
     * @param name A unique identifier for the matchmaking configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An SNS topic ARN that is set up to receive matchmaking notifications.
     *
     * See [Setting up notifications for
     * matchmaking](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html)
     * for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-notificationtarget)
     * @param notificationTarget An SNS topic ARN that is set up to receive matchmaking
     * notifications. 
     */
    override fun notificationTarget(notificationTarget: String) {
      cdkBuilder.notificationTarget(notificationTarget)
    }

    /**
     * The maximum duration, in seconds, that a matchmaking ticket can remain in process before
     * timing out.
     *
     * Requests that fail due to timing out can be resubmitted as needed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-requesttimeoutseconds)
     * @param requestTimeoutSeconds The maximum duration, in seconds, that a matchmaking ticket can
     * remain in process before timing out. 
     */
    override fun requestTimeoutSeconds(requestTimeoutSeconds: Number) {
      cdkBuilder.requestTimeoutSeconds(requestTimeoutSeconds)
    }

    /**
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
     * GameLift matchmaking rule set resource that this configuration uses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetarn)
     * @param ruleSetArn The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) associated with the
     * GameLift matchmaking rule set resource that this configuration uses. 
     */
    override fun ruleSetArn(ruleSetArn: String) {
      cdkBuilder.ruleSetArn(ruleSetArn)
    }

    /**
     * A unique identifier for the matchmaking rule set to use with this configuration.
     *
     * You can use either the rule set name or ARN value. A matchmaking configuration can only use
     * rule sets that are defined in the same Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetname)
     * @param ruleSetName A unique identifier for the matchmaking rule set to use with this
     * configuration. 
     */
    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

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
     * @param tags A list of labels to assign to the new matchmaking configuration resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags A list of labels to assign to the new matchmaking configuration resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMatchmakingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMatchmakingConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration):
        CfnMatchmakingConfiguration = CfnMatchmakingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnMatchmakingConfiguration):
        software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration = wrapped.cdkObject
  }

  /**
   * This key-value pair can store custom data about a game session.
   *
   * For example, you might use a `GameProperty` to track a game session's map, level of difficulty,
   * or remaining time. The difficulty level could be specified like this: `{"Key": "difficulty",
   * "Value":"Novice"}` .
   *
   * You can set game properties when creating a game session. You can also modify game properties
   * of an active game session. When searching for game sessions, you can filter on game property keys
   * and values. You can't delete game properties from a game session.
   *
   * For examples of working with game properties, see [Create a game session with
   * properties](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * GamePropertyProperty gamePropertyProperty = GamePropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-matchmakingconfiguration-gameproperty.html)
   */
  public interface GamePropertyProperty {
    /**
     * The game property identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-matchmakingconfiguration-gameproperty.html#cfn-gamelift-matchmakingconfiguration-gameproperty-key)
     */
    public fun key(): String

    /**
     * The game property value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-matchmakingconfiguration-gameproperty.html#cfn-gamelift-matchmakingconfiguration-gameproperty-value)
     */
    public fun `value`(): String

    /**
     * A builder for [GamePropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The game property identifier. 
       */
      public fun key(key: String)

      /**
       * @param value The game property value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty.builder()

      /**
       * @param key The game property identifier. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The game property value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty,
    ) : CdkObject(cdkObject), GamePropertyProperty {
      /**
       * The game property identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-matchmakingconfiguration-gameproperty.html#cfn-gamelift-matchmakingconfiguration-gameproperty-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The game property value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-matchmakingconfiguration-gameproperty.html#cfn-gamelift-matchmakingconfiguration-gameproperty-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GamePropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty):
          GamePropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GamePropertyProperty):
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.GamePropertyProperty
    }
  }
}
