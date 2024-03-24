@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGameSessionQueue`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnGameSessionQueueProps cfnGameSessionQueueProps = CfnGameSessionQueueProps.builder()
 * .name("name")
 * // the properties below are optional
 * .customEventData("customEventData")
 * .destinations(List.of(DestinationProperty.builder()
 * .destinationArn("destinationArn")
 * .build()))
 * .filterConfiguration(FilterConfigurationProperty.builder()
 * .allowedLocations(List.of("allowedLocations"))
 * .build())
 * .notificationTarget("notificationTarget")
 * .playerLatencyPolicies(List.of(PlayerLatencyPolicyProperty.builder()
 * .maximumIndividualPlayerLatencyMilliseconds(123)
 * .policyDurationSeconds(123)
 * .build()))
 * .priorityConfiguration(PriorityConfigurationProperty.builder()
 * .locationOrder(List.of("locationOrder"))
 * .priorityOrder(List.of("priorityOrder"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeoutInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html)
 */
public interface CfnGameSessionQueueProps {
  /**
   * Information to be added to all events that are related to this game session queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-customeventdata)
   */
  public fun customEventData(): String? = unwrap(this).getCustomEventData()

  /**
   * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
   * requests in the queue.
   *
   * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order
   * of placement preference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
   */
  public fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * A list of locations where a queue is allowed to place new game sessions.
   *
   * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
   * parameter is not set, game sessions can be placed in any queue location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
   */
  public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

  /**
   * A descriptive label that is associated with game session queue.
   *
   * Queue names must be unique within each Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name)
   */
  public fun name(): String

  /**
   * An SNS topic ARN that is set up to receive game session placement notifications.
   *
   * See [Setting up notifications for game session
   * placement](https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-notificationtarget)
   */
  public fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

  /**
   * A set of policies that act as a sliding cap on player latency.
   *
   * FleetIQ works to deliver low latency for most players in a game session. These policies ensure
   * that no individual player can be placed into a game with unreasonably high latency. Use multiple
   * policies to gradually relax latency requirements a step at a time. Multiple policies are applied
   * based on their maximum allowed latency, starting with the lowest value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
   */
  public fun playerLatencyPolicies(): Any? = unwrap(this).getPlayerLatencyPolicies()

  /**
   * Custom settings to use when prioritizing destinations and locations for game session
   * placements.
   *
   * This configuration replaces the FleetIQ default prioritization process. Priority types that are
   * not explicitly named will be automatically applied at the end of the prioritization process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
   */
  public fun priorityConfiguration(): Any? = unwrap(this).getPriorityConfiguration()

  /**
   * A list of labels to assign to the new game session queue resource.
   *
   * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
   * management, access management and cost allocation. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
   * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated.
   * See the AWS General Reference for actual tagging limits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The maximum time, in seconds, that a new game session placement request remains in the queue.
   *
   * When a request exceeds this time, the game session placement changes to a `TIMED_OUT` status.
   * By default, this property is set to `600` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds)
   */
  public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

  /**
   * A builder for [CfnGameSessionQueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customEventData Information to be added to all events that are related to this game
     * session queue.
     */
    public fun customEventData(customEventData: String)

    /**
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     */
    public fun destinations(destinations: IResolvable)

    /**
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     */
    public fun destinations(destinations: List<Any>)

    /**
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     */
    public fun destinations(vararg destinations: Any)

    /**
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions.
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     */
    public fun filterConfiguration(filterConfiguration: IResolvable)

    /**
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions.
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     */
    public
        fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty)

    /**
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions.
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee629f678dc10d378126b98cf23a19aec2e85b6dd1c79670aa81dfc33559e5e")
    public
        fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name A descriptive label that is associated with game session queue. 
     * Queue names must be unique within each Region.
     */
    public fun name(name: String)

    /**
     * @param notificationTarget An SNS topic ARN that is set up to receive game session placement
     * notifications.
     * See [Setting up notifications for game session
     * placement](https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html) .
     */
    public fun notificationTarget(notificationTarget: String)

    /**
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     */
    public fun playerLatencyPolicies(playerLatencyPolicies: IResolvable)

    /**
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     */
    public fun playerLatencyPolicies(playerLatencyPolicies: List<Any>)

    /**
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     */
    public fun playerLatencyPolicies(vararg playerLatencyPolicies: Any)

    /**
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements.
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     */
    public fun priorityConfiguration(priorityConfiguration: IResolvable)

    /**
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements.
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     */
    public
        fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty)

    /**
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements.
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54230d7209758eb9ffae19555357a8734a2df16adec9c256d744ecff7c0bef91")
    public
        fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags A list of labels to assign to the new game session queue resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of labels to assign to the new game session queue resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeoutInSeconds The maximum time, in seconds, that a new game session placement
     * request remains in the queue.
     * When a request exceeds this time, the game session placement changes to a `TIMED_OUT` status.
     * By default, this property is set to `600` .
     */
    public fun timeoutInSeconds(timeoutInSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps.builder()

    /**
     * @param customEventData Information to be added to all events that are related to this game
     * session queue.
     */
    override fun customEventData(customEventData: String) {
      cdkBuilder.customEventData(customEventData)
    }

    /**
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    /**
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param destinations A list of fleets and/or fleet aliases that can be used to fulfill game
     * session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions.
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     */
    override fun filterConfiguration(filterConfiguration: IResolvable) {
      cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions.
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     */
    override
        fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty) {
      cdkBuilder.filterConfiguration(filterConfiguration.let(CfnGameSessionQueue.FilterConfigurationProperty::unwrap))
    }

    /**
     * @param filterConfiguration A list of locations where a queue is allowed to place new game
     * sessions.
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee629f678dc10d378126b98cf23a19aec2e85b6dd1c79670aa81dfc33559e5e")
    override
        fun filterConfiguration(filterConfiguration: CfnGameSessionQueue.FilterConfigurationProperty.Builder.() -> Unit):
        Unit =
        filterConfiguration(CfnGameSessionQueue.FilterConfigurationProperty(filterConfiguration))

    /**
     * @param name A descriptive label that is associated with game session queue. 
     * Queue names must be unique within each Region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param notificationTarget An SNS topic ARN that is set up to receive game session placement
     * notifications.
     * See [Setting up notifications for game session
     * placement](https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html) .
     */
    override fun notificationTarget(notificationTarget: String) {
      cdkBuilder.notificationTarget(notificationTarget)
    }

    /**
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     */
    override fun playerLatencyPolicies(playerLatencyPolicies: IResolvable) {
      cdkBuilder.playerLatencyPolicies(playerLatencyPolicies.let(IResolvable::unwrap))
    }

    /**
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     */
    override fun playerLatencyPolicies(playerLatencyPolicies: List<Any>) {
      cdkBuilder.playerLatencyPolicies(playerLatencyPolicies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param playerLatencyPolicies A set of policies that act as a sliding cap on player latency.
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     */
    override fun playerLatencyPolicies(vararg playerLatencyPolicies: Any): Unit =
        playerLatencyPolicies(playerLatencyPolicies.toList())

    /**
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements.
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     */
    override fun priorityConfiguration(priorityConfiguration: IResolvable) {
      cdkBuilder.priorityConfiguration(priorityConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements.
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     */
    override
        fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty) {
      cdkBuilder.priorityConfiguration(priorityConfiguration.let(CfnGameSessionQueue.PriorityConfigurationProperty::unwrap))
    }

    /**
     * @param priorityConfiguration Custom settings to use when prioritizing destinations and
     * locations for game session placements.
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("54230d7209758eb9ffae19555357a8734a2df16adec9c256d744ecff7c0bef91")
    override
        fun priorityConfiguration(priorityConfiguration: CfnGameSessionQueue.PriorityConfigurationProperty.Builder.() -> Unit):
        Unit =
        priorityConfiguration(CfnGameSessionQueue.PriorityConfigurationProperty(priorityConfiguration))

    /**
     * @param tags A list of labels to assign to the new game session queue resource.
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
     * @param tags A list of labels to assign to the new game session queue resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than
     * stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeoutInSeconds The maximum time, in seconds, that a new game session placement
     * request remains in the queue.
     * When a request exceeds this time, the game session placement changes to a `TIMED_OUT` status.
     * By default, this property is set to `600` .
     */
    override fun timeoutInSeconds(timeoutInSeconds: Number) {
      cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps,
  ) : CdkObject(cdkObject), CfnGameSessionQueueProps {
    /**
     * Information to be added to all events that are related to this game session queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-customeventdata)
     */
    override fun customEventData(): String? = unwrap(this).getCustomEventData()

    /**
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement
     * requests in the queue.
     *
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in
     * order of placement preference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations)
     */
    override fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * A list of locations where a queue is allowed to place new game sessions.
     *
     * Locations are specified in the form of AWS Region codes, such as `us-west-2` . If this
     * parameter is not set, game sessions can be placed in any queue location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-filterconfiguration)
     */
    override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * A descriptive label that is associated with game session queue.
     *
     * Queue names must be unique within each Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An SNS topic ARN that is set up to receive game session placement notifications.
     *
     * See [Setting up notifications for game session
     * placement](https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-notificationtarget)
     */
    override fun notificationTarget(): String? = unwrap(this).getNotificationTarget()

    /**
     * A set of policies that act as a sliding cap on player latency.
     *
     * FleetIQ works to deliver low latency for most players in a game session. These policies
     * ensure that no individual player can be placed into a game with unreasonably high latency. Use
     * multiple policies to gradually relax latency requirements a step at a time. Multiple policies
     * are applied based on their maximum allowed latency, starting with the lowest value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies)
     */
    override fun playerLatencyPolicies(): Any? = unwrap(this).getPlayerLatencyPolicies()

    /**
     * Custom settings to use when prioritizing destinations and locations for game session
     * placements.
     *
     * This configuration replaces the FleetIQ default prioritization process. Priority types that
     * are not explicitly named will be automatically applied at the end of the prioritization process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-priorityconfiguration)
     */
    override fun priorityConfiguration(): Any? = unwrap(this).getPriorityConfiguration()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The maximum time, in seconds, that a new game session placement request remains in the queue.
     *
     * When a request exceeds this time, the game session placement changes to a `TIMED_OUT` status.
     * By default, this property is set to `600` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds)
     */
    override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGameSessionQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps):
        CfnGameSessionQueueProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGameSessionQueueProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGameSessionQueueProps):
        software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps
  }
}
