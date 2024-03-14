package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGameSessionQueue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The unique Amazon Resource Name (ARN) for the `GameSessionQueue` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A descriptive label that is associated with a game session queue.
   *
   * Names are unique within each Region.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * Information to be added to all events that are related to this game session queue.
   */
  public open fun customEventData(): String? = unwrap(this).getCustomEventData()

  /**
   * Information to be added to all events that are related to this game session queue.
   */
  public open fun customEventData(`value`: String) {
    unwrap(this).setCustomEventData(`value`)
  }

  /**
   * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
   * requests in the queue.
   */
  public open fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
   * requests in the queue.
   */
  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
   * requests in the queue.
   */
  public open fun destinations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDestinations(__idx_ac66f0)
  }

  /**
   * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
   * requests in the queue.
   */
  public open fun destinations(vararg __idx_ac66f0: Any): Unit = destinations(__idx_ac66f0.toList())

  /**
   * A list of locations where a queue is allowed to place new game sessions.
   */
  public open fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

  /**
   * A list of locations where a queue is allowed to place new game sessions.
   */
  public open fun filterConfiguration(`value`: IResolvable) {
    unwrap(this).setFilterConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of locations where a queue is allowed to place new game sessions.
   */
  public open fun filterConfiguration(`value`: FilterConfigurationProperty) {
    unwrap(this).setFilterConfiguration(`value`.let(FilterConfigurationProperty::unwrap))
  }

  /**
   * A list of locations where a queue is allowed to place new game sessions.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("204b2efaf1bd7eea2f0f012001883b66c4d8a2dac69fa996de9c68c877aeb4bf")
  public open fun filterConfiguration(`value`: FilterConfigurationProperty.Builder.() -> Unit): Unit
      = filterConfiguration(FilterConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A descriptive label that is associated with game session queue.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A descriptive label that is associated with game session queue.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An SNS topic ARN that is set up to receive game session placement notifications.
   */
  public open fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

  /**
   * An SNS topic ARN that is set up to receive game session placement notifications.
   */
  public open fun notificationTarget(`value`: String) {
    unwrap(this).setNotificationTarget(`value`)
  }

  /**
   * A set of policies that act as a sliding cap on player latency.
   */
  public open fun playerLatencyPolicies(): Any? = unwrap(this).getPlayerLatencyPolicies()

  /**
   * A set of policies that act as a sliding cap on player latency.
   */
  public open fun playerLatencyPolicies(`value`: IResolvable) {
    unwrap(this).setPlayerLatencyPolicies(`value`.let(IResolvable::unwrap))
  }

  /**
   * A set of policies that act as a sliding cap on player latency.
   */
  public open fun playerLatencyPolicies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPlayerLatencyPolicies(__idx_ac66f0)
  }

  /**
   * A set of policies that act as a sliding cap on player latency.
   */
  public open fun playerLatencyPolicies(vararg __idx_ac66f0: Any): Unit =
      playerLatencyPolicies(__idx_ac66f0.toList())

  /**
   * Custom settings to use when prioritizing destinations and locations for game session
   * placements.
   */
  public open fun priorityConfiguration(): Any? = unwrap(this).getPriorityConfiguration()

  /**
   * Custom settings to use when prioritizing destinations and locations for game session
   * placements.
   */
  public open fun priorityConfiguration(`value`: IResolvable) {
    unwrap(this).setPriorityConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Custom settings to use when prioritizing destinations and locations for game session
   * placements.
   */
  public open fun priorityConfiguration(`value`: PriorityConfigurationProperty) {
    unwrap(this).setPriorityConfiguration(`value`.let(PriorityConfigurationProperty::unwrap))
  }

  /**
   * Custom settings to use when prioritizing destinations and locations for game session
   * placements.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3462340d66fa05af70cf735631e6378419bbdc3d8440fa54dab6b48cbb54e7f3")
  public open fun priorityConfiguration(`value`: PriorityConfigurationProperty.Builder.() -> Unit):
      Unit = priorityConfiguration(PriorityConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of labels to assign to the new game session queue resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of labels to assign to the new game session queue resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of labels to assign to the new game session queue resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The maximum time, in seconds, that a new game session placement request remains in the queue.
   */
  public open fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

  /**
   * The maximum time, in seconds, that a new game session placement request remains in the queue.
   */
  public open fun timeoutInSeconds(`value`: Number) {
    unwrap(this).setTimeoutInSeconds(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnGameSessionQueue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information to be added to all events that are related to this game session queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-customeventdata)
     * @param customEventData Information to be added to all events that are related to this game
     * session queue. 
     */
    public fun customEventData(customEventData: String)

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue. 
     */
    public fun destinations(destinations: IResolvable)

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue. 
     */
    public fun destinations(destinations: List<Any>)

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue. 
     */
    public fun destinations(vararg destinations: Any)

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions. 
     */
    public fun filterConfiguration(filterConfiguration: IResolvable)

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions. 
     */
    public fun filterConfiguration(filterConfiguration: FilterConfigurationProperty)

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4717dd2c850e96d586fa6e1e0676b2e373d9cb31137318484e8a75790af3a5aa")
    public
        fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit)

    /**
     * A descriptive label that is associated with game session queue.
     *
     * Queue names must be unique within each Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name)
     * @param name A descriptive label that is associated with game session queue. 
     */
    public fun name(name: String)

    /**
     * An SNS topic ARN that is set up to receive game session placement notifications.
     *
     * See [Setting up notifications for game session
     * placement](https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-notificationtarget)
     * @param notificationTarget An SNS topic ARN that is set up to receive game session placement
     * notifications. 
     */
    public fun notificationTarget(notificationTarget: String)

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency. 
     */
    public fun playerLatencyPolicies(playerLatencyPolicies: IResolvable)

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency. 
     */
    public fun playerLatencyPolicies(playerLatencyPolicies: List<Any>)

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency. 
     */
    public fun playerLatencyPolicies(vararg playerLatencyPolicies: Any)

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements. 
     */
    public fun priorityConfiguration(priorityConfiguration: IResolvable)

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements. 
     */
    public fun priorityConfiguration(priorityConfiguration: PriorityConfigurationProperty)

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c59baed8336d52c5e8b8ad2a6ba6539415b0e2244a21170289c872eadd1474fd")
    public
        fun priorityConfiguration(priorityConfiguration: PriorityConfigurationProperty.Builder.() -> Unit)

    /**
     * A list of labels to assign to the new game session queue resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-tags)
     * @param tags A list of labels to assign to the new game session queue resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of labels to assign to the new game session queue resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-tags)
     * @param tags A list of labels to assign to the new game session queue resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The maximum time, in seconds, that a new game session placement request remains in the queue.
     *
     * When a request exceeds this time, the game session placement changes to a `TIMED_OUT` status.
     * By default, this property is set to `600` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds)
     * @param timeoutInSeconds The maximum time, in seconds, that a new game session placement
     * request remains in the queue. 
     */
    public fun timeoutInSeconds(timeoutInSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.Builder =
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.Builder.create(scope, id)

    /**
     * Information to be added to all events that are related to this game session queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-customeventdata)
     * @param customEventData Information to be added to all events that are related to this game
     * session queue. 
     */
    override fun customEventData(customEventData: String) {
      cdkBuilder.customEventData(customEventData)
    }

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue. 
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue. 
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue. 
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions. 
     */
    override fun filterConfiguration(filterConfiguration: IResolvable) {
      cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions. 
     */
    override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
      cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty::unwrap))
    }

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4717dd2c850e96d586fa6e1e0676b2e373d9cb31137318484e8a75790af3a5aa")
    override
        fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit):
        Unit = filterConfiguration(FilterConfigurationProperty(filterConfiguration))

    /**
     * A descriptive label that is associated with game session queue.
     *
     * Queue names must be unique within each Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name)
     * @param name A descriptive label that is associated with game session queue. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An SNS topic ARN that is set up to receive game session placement notifications.
     *
     * See [Setting up notifications for game session
     * placement](https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-notificationtarget)
     * @param notificationTarget An SNS topic ARN that is set up to receive game session placement
     * notifications. 
     */
    override fun notificationTarget(notificationTarget: String) {
      cdkBuilder.notificationTarget(notificationTarget)
    }

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency. 
     */
    override fun playerLatencyPolicies(playerLatencyPolicies: IResolvable) {
      cdkBuilder.playerLatencyPolicies(playerLatencyPolicies.let(IResolvable::unwrap))
    }

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency. 
     */
    override fun playerLatencyPolicies(playerLatencyPolicies: List<Any>) {
      cdkBuilder.playerLatencyPolicies(playerLatencyPolicies)
    }

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency. 
     */
    override fun playerLatencyPolicies(vararg playerLatencyPolicies: Any): Unit =
        playerLatencyPolicies(playerLatencyPolicies.toList())

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements. 
     */
    override fun priorityConfiguration(priorityConfiguration: IResolvable) {
      cdkBuilder.priorityConfiguration(priorityConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements. 
     */
    override fun priorityConfiguration(priorityConfiguration: PriorityConfigurationProperty) {
      cdkBuilder.priorityConfiguration(priorityConfiguration.let(PriorityConfigurationProperty::unwrap))
    }

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c59baed8336d52c5e8b8ad2a6ba6539415b0e2244a21170289c872eadd1474fd")
    override
        fun priorityConfiguration(priorityConfiguration: PriorityConfigurationProperty.Builder.() -> Unit):
        Unit = priorityConfiguration(PriorityConfigurationProperty(priorityConfiguration))

    /**
     * A list of labels to assign to the new game session queue resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-tags)
     * @param tags A list of labels to assign to the new game session queue resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of labels to assign to the new game session queue resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-tags)
     * @param tags A list of labels to assign to the new game session queue resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The maximum time, in seconds, that a new game session placement request remains in the queue.
     *
     * When a request exceeds this time, the game session placement changes to a `TIMED_OUT` status.
     * By default, this property is set to `600` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds)
     * @param timeoutInSeconds The maximum time, in seconds, that a new game session placement
     * request remains in the queue. 
     */
    override fun timeoutInSeconds(timeoutInSeconds: Number) {
      cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnGameSessionQueue =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGameSessionQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGameSessionQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue):
        CfnGameSessionQueue = CfnGameSessionQueue(cdkObject)

    internal fun unwrap(wrapped: CfnGameSessionQueue):
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueue = wrapped.cdkObject
  }

  public interface PriorityConfigurationProperty {
    /**
     * The prioritization order to use for fleet locations, when the `PriorityOrder` property
     * includes `LOCATION` .
     *
     * Locations are identified by AWS Region codes such as `us-west-2` . Each location can only be
     * listed once.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-priorityconfiguration.html#cfn-gamelift-gamesessionqueue-priorityconfiguration-locationorder)
     */
    public fun locationOrder(): List<String> = unwrap(this).getLocationOrder() ?: emptyList()

    /**
     * The recommended sequence to use when prioritizing where to place new game sessions.
     *
     * Each type can only be listed once.
     *
     * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in
     * each game session request) is lowest.
     * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
     * evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
     * destination in the queue.
     * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in the
     * queue configuration.
     * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
     * `LocationOrder` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-priorityconfiguration.html#cfn-gamelift-gamesessionqueue-priorityconfiguration-priorityorder)
     */
    public fun priorityOrder(): List<String> = unwrap(this).getPriorityOrder() ?: emptyList()

    /**
     * A builder for [PriorityConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param locationOrder The prioritization order to use for fleet locations, when the
       * `PriorityOrder` property includes `LOCATION` .
       * Locations are identified by AWS Region codes such as `us-west-2` . Each location can only
       * be listed once.
       */
      public fun locationOrder(locationOrder: List<String>)

      /**
       * @param locationOrder The prioritization order to use for fleet locations, when the
       * `PriorityOrder` property includes `LOCATION` .
       * Locations are identified by AWS Region codes such as `us-west-2` . Each location can only
       * be listed once.
       */
      public fun locationOrder(vararg locationOrder: String)

      /**
       * @param priorityOrder The recommended sequence to use when prioritizing where to place new
       * game sessions.
       * Each type can only be listed once.
       *
       * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in
       * each game session request) is lowest.
       * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
       * evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
       * destination in the queue.
       * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in
       * the queue configuration.
       * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
       * `LocationOrder` .
       */
      public fun priorityOrder(priorityOrder: List<String>)

      /**
       * @param priorityOrder The recommended sequence to use when prioritizing where to place new
       * game sessions.
       * Each type can only be listed once.
       *
       * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in
       * each game session request) is lowest.
       * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
       * evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
       * destination in the queue.
       * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in
       * the queue configuration.
       * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
       * `LocationOrder` .
       */
      public fun priorityOrder(vararg priorityOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty.builder()

      /**
       * @param locationOrder The prioritization order to use for fleet locations, when the
       * `PriorityOrder` property includes `LOCATION` .
       * Locations are identified by AWS Region codes such as `us-west-2` . Each location can only
       * be listed once.
       */
      override fun locationOrder(locationOrder: List<String>) {
        cdkBuilder.locationOrder(locationOrder)
      }

      /**
       * @param locationOrder The prioritization order to use for fleet locations, when the
       * `PriorityOrder` property includes `LOCATION` .
       * Locations are identified by AWS Region codes such as `us-west-2` . Each location can only
       * be listed once.
       */
      override fun locationOrder(vararg locationOrder: String): Unit =
          locationOrder(locationOrder.toList())

      /**
       * @param priorityOrder The recommended sequence to use when prioritizing where to place new
       * game sessions.
       * Each type can only be listed once.
       *
       * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in
       * each game session request) is lowest.
       * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
       * evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
       * destination in the queue.
       * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in
       * the queue configuration.
       * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
       * `LocationOrder` .
       */
      override fun priorityOrder(priorityOrder: List<String>) {
        cdkBuilder.priorityOrder(priorityOrder)
      }

      /**
       * @param priorityOrder The recommended sequence to use when prioritizing where to place new
       * game sessions.
       * Each type can only be listed once.
       *
       * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in
       * each game session request) is lowest.
       * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
       * evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
       * destination in the queue.
       * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in
       * the queue configuration.
       * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
       * `LocationOrder` .
       */
      override fun priorityOrder(vararg priorityOrder: String): Unit =
          priorityOrder(priorityOrder.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty,
    ) : CdkObject(cdkObject), PriorityConfigurationProperty {
      /**
       * The prioritization order to use for fleet locations, when the `PriorityOrder` property
       * includes `LOCATION` .
       *
       * Locations are identified by AWS Region codes such as `us-west-2` . Each location can only
       * be listed once.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-priorityconfiguration.html#cfn-gamelift-gamesessionqueue-priorityconfiguration-locationorder)
       */
      override fun locationOrder(): List<String> = unwrap(this).getLocationOrder() ?: emptyList()

      /**
       * The recommended sequence to use when prioritizing where to place new game sessions.
       *
       * Each type can only be listed once.
       *
       * * `LATENCY` -- FleetIQ prioritizes locations where the average player latency (provided in
       * each game session request) is lowest.
       * * `COST` -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
       * evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each
       * destination in the queue.
       * * `DESTINATION` -- FleetIQ prioritizes based on the order that destinations are listed in
       * the queue configuration.
       * * `LOCATION` -- FleetIQ prioritizes based on the provided order of locations, as defined in
       * `LocationOrder` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-priorityconfiguration.html#cfn-gamelift-gamesessionqueue-priorityconfiguration-priorityorder)
       */
      override fun priorityOrder(): List<String> = unwrap(this).getPriorityOrder() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PriorityConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty):
          PriorityConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PriorityConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PriorityConfigurationProperty
    }
  }

  public interface DestinationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html#cfn-gamelift-gamesessionqueue-destination-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * A builder for [DestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationArn the value to be set.
       */
      public fun destinationArn(destinationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty.builder()

      /**
       * @param destinationArn the value to be set.
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty,
    ) : CdkObject(cdkObject), DestinationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html#cfn-gamelift-gamesessionqueue-destination-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty):
          DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty
    }
  }

  public interface PlayerLatencyPolicyProperty {
    /**
     * The maximum latency value that is allowed for any player, in milliseconds.
     *
     * All policies must have a value set for this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-maximumindividualplayerlatencymilliseconds)
     */
    public fun maximumIndividualPlayerLatencyMilliseconds(): Number? =
        unwrap(this).getMaximumIndividualPlayerLatencyMilliseconds()

    /**
     * The length of time, in seconds, that the policy is enforced while placing a new game session.
     *
     * A null value for this property means that the policy is enforced until the queue times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-policydurationseconds)
     */
    public fun policyDurationSeconds(): Number? = unwrap(this).getPolicyDurationSeconds()

    /**
     * A builder for [PlayerLatencyPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumIndividualPlayerLatencyMilliseconds The maximum latency value that is allowed
       * for any player, in milliseconds.
       * All policies must have a value set for this property.
       */
      public
          fun maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds: Number)

      /**
       * @param policyDurationSeconds The length of time, in seconds, that the policy is enforced
       * while placing a new game session.
       * A null value for this property means that the policy is enforced until the queue times out.
       */
      public fun policyDurationSeconds(policyDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty.builder()

      /**
       * @param maximumIndividualPlayerLatencyMilliseconds The maximum latency value that is allowed
       * for any player, in milliseconds.
       * All policies must have a value set for this property.
       */
      override
          fun maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds: Number) {
        cdkBuilder.maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds)
      }

      /**
       * @param policyDurationSeconds The length of time, in seconds, that the policy is enforced
       * while placing a new game session.
       * A null value for this property means that the policy is enforced until the queue times out.
       */
      override fun policyDurationSeconds(policyDurationSeconds: Number) {
        cdkBuilder.policyDurationSeconds(policyDurationSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty,
    ) : CdkObject(cdkObject), PlayerLatencyPolicyProperty {
      /**
       * The maximum latency value that is allowed for any player, in milliseconds.
       *
       * All policies must have a value set for this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-maximumindividualplayerlatencymilliseconds)
       */
      override fun maximumIndividualPlayerLatencyMilliseconds(): Number? =
          unwrap(this).getMaximumIndividualPlayerLatencyMilliseconds()

      /**
       * The length of time, in seconds, that the policy is enforced while placing a new game
       * session.
       *
       * A null value for this property means that the policy is enforced until the queue times out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-policydurationseconds)
       */
      override fun policyDurationSeconds(): Number? = unwrap(this).getPolicyDurationSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlayerLatencyPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty):
          PlayerLatencyPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlayerLatencyPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty
    }
  }

  public interface FilterConfigurationProperty {
    /**
     * A list of locations to allow game session placement in, in the form of AWS Region codes such
     * as `us-west-2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-filterconfiguration.html#cfn-gamelift-gamesessionqueue-filterconfiguration-allowedlocations)
     */
    public fun allowedLocations(): List<String> = unwrap(this).getAllowedLocations() ?: emptyList()

    /**
     * A builder for [FilterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedLocations A list of locations to allow game session placement in, in the form
       * of AWS Region codes such as `us-west-2` .
       */
      public fun allowedLocations(allowedLocations: List<String>)

      /**
       * @param allowedLocations A list of locations to allow game session placement in, in the form
       * of AWS Region codes such as `us-west-2` .
       */
      public fun allowedLocations(vararg allowedLocations: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty.builder()

      /**
       * @param allowedLocations A list of locations to allow game session placement in, in the form
       * of AWS Region codes such as `us-west-2` .
       */
      override fun allowedLocations(allowedLocations: List<String>) {
        cdkBuilder.allowedLocations(allowedLocations)
      }

      /**
       * @param allowedLocations A list of locations to allow game session placement in, in the form
       * of AWS Region codes such as `us-west-2` .
       */
      override fun allowedLocations(vararg allowedLocations: String): Unit =
          allowedLocations(allowedLocations.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty,
    ) : CdkObject(cdkObject), FilterConfigurationProperty {
      /**
       * A list of locations to allow game session placement in, in the form of AWS Region codes
       * such as `us-west-2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-filterconfiguration.html#cfn-gamelift-gamesessionqueue-filterconfiguration-allowedlocations)
       */
      override fun allowedLocations(): List<String> = unwrap(this).getAllowedLocations() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty):
          FilterConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty
    }
  }

  public interface GameSessionQueueDestinationProperty {
    /**
     * The Amazon Resource Name (ARN) that is assigned to fleet or fleet alias.
     *
     * ARNs, which include a fleet ID or alias ID and a Region name, provide a unique identifier
     * across all Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-gamesessionqueuedestination.html#cfn-gamelift-gamesessionqueue-gamesessionqueuedestination-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * A builder for [GameSessionQueueDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationArn The Amazon Resource Name (ARN) that is assigned to fleet or fleet
       * alias.
       * ARNs, which include a fleet ID or alias ID and a Region name, provide a unique identifier
       * across all Regions.
       */
      public fun destinationArn(destinationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty.builder()

      /**
       * @param destinationArn The Amazon Resource Name (ARN) that is assigned to fleet or fleet
       * alias.
       * ARNs, which include a fleet ID or alias ID and a Region name, provide a unique identifier
       * across all Regions.
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty,
    ) : CdkObject(cdkObject), GameSessionQueueDestinationProperty {
      /**
       * The Amazon Resource Name (ARN) that is assigned to fleet or fleet alias.
       *
       * ARNs, which include a fleet ID or alias ID and a Region name, provide a unique identifier
       * across all Regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-gamesessionqueuedestination.html#cfn-gamelift-gamesessionqueue-gamesessionqueuedestination-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GameSessionQueueDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty):
          GameSessionQueueDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GameSessionQueueDestinationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.GameSessionQueueDestinationProperty
    }
  }
}
