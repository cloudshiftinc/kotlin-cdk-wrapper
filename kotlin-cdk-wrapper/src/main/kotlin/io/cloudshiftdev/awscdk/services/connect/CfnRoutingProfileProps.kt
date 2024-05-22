@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRoutingProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnRoutingProfileProps cfnRoutingProfileProps = CfnRoutingProfileProps.builder()
 * .defaultOutboundQueueArn("defaultOutboundQueueArn")
 * .description("description")
 * .instanceArn("instanceArn")
 * .mediaConcurrencies(List.of(MediaConcurrencyProperty.builder()
 * .channel("channel")
 * .concurrency(123)
 * // the properties below are optional
 * .crossChannelBehavior(CrossChannelBehaviorProperty.builder()
 * .behaviorType("behaviorType")
 * .build())
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .agentAvailabilityTimer("agentAvailabilityTimer")
 * .queueConfigs(List.of(RoutingProfileQueueConfigProperty.builder()
 * .delay(123)
 * .priority(123)
 * .queueReference(RoutingProfileQueueReferenceProperty.builder()
 * .channel("channel")
 * .queueArn("queueArn")
 * .build())
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html)
 */
public interface CfnRoutingProfileProps {
  /**
   * Whether agents with this routing profile will have their routing order calculated based on
   * *time since their last inbound contact* or *longest idle time* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-agentavailabilitytimer)
   */
  public fun agentAvailabilityTimer(): String? = unwrap(this).getAgentAvailabilityTimer()

  /**
   * The Amazon Resource Name (ARN) of the default outbound queue for the routing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-defaultoutboundqueuearn)
   */
  public fun defaultOutboundQueueArn(): String

  /**
   * The description of the routing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-description)
   */
  public fun description(): String

  /**
   * The identifier of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
   */
  public fun mediaConcurrencies(): Any

  /**
   * The name of the routing profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-name)
   */
  public fun name(): String

  /**
   * The inbound queues associated with the routing profile.
   *
   * If no queue is added, the agent can make only outbound calls.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
   */
  public fun queueConfigs(): Any? = unwrap(this).getQueueConfigs()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRoutingProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentAvailabilityTimer Whether agents with this routing profile will have their
     * routing order calculated based on *time since their last inbound contact* or *longest idle time*
     * .
     */
    public fun agentAvailabilityTimer(agentAvailabilityTimer: String)

    /**
     * @param defaultOutboundQueueArn The Amazon Resource Name (ARN) of the default outbound queue
     * for the routing profile. 
     */
    public fun defaultOutboundQueueArn(defaultOutboundQueueArn: String)

    /**
     * @param description The description of the routing profile. 
     */
    public fun description(description: String)

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    public fun mediaConcurrencies(mediaConcurrencies: IResolvable)

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    public fun mediaConcurrencies(mediaConcurrencies: List<Any>)

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    public fun mediaConcurrencies(vararg mediaConcurrencies: Any)

    /**
     * @param name The name of the routing profile. 
     */
    public fun name(name: String)

    /**
     * @param queueConfigs The inbound queues associated with the routing profile.
     * If no queue is added, the agent can make only outbound calls.
     */
    public fun queueConfigs(queueConfigs: IResolvable)

    /**
     * @param queueConfigs The inbound queues associated with the routing profile.
     * If no queue is added, the agent can make only outbound calls.
     */
    public fun queueConfigs(queueConfigs: List<Any>)

    /**
     * @param queueConfigs The inbound queues associated with the routing profile.
     * If no queue is added, the agent can make only outbound calls.
     */
    public fun queueConfigs(vararg queueConfigs: Any)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRoutingProfileProps.Builder =
        software.amazon.awscdk.services.connect.CfnRoutingProfileProps.builder()

    /**
     * @param agentAvailabilityTimer Whether agents with this routing profile will have their
     * routing order calculated based on *time since their last inbound contact* or *longest idle time*
     * .
     */
    override fun agentAvailabilityTimer(agentAvailabilityTimer: String) {
      cdkBuilder.agentAvailabilityTimer(agentAvailabilityTimer)
    }

    /**
     * @param defaultOutboundQueueArn The Amazon Resource Name (ARN) of the default outbound queue
     * for the routing profile. 
     */
    override fun defaultOutboundQueueArn(defaultOutboundQueueArn: String) {
      cdkBuilder.defaultOutboundQueueArn(defaultOutboundQueueArn)
    }

    /**
     * @param description The description of the routing profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    override fun mediaConcurrencies(mediaConcurrencies: IResolvable) {
      cdkBuilder.mediaConcurrencies(mediaConcurrencies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    override fun mediaConcurrencies(mediaConcurrencies: List<Any>) {
      cdkBuilder.mediaConcurrencies(mediaConcurrencies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    override fun mediaConcurrencies(vararg mediaConcurrencies: Any): Unit =
        mediaConcurrencies(mediaConcurrencies.toList())

    /**
     * @param name The name of the routing profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param queueConfigs The inbound queues associated with the routing profile.
     * If no queue is added, the agent can make only outbound calls.
     */
    override fun queueConfigs(queueConfigs: IResolvable) {
      cdkBuilder.queueConfigs(queueConfigs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param queueConfigs The inbound queues associated with the routing profile.
     * If no queue is added, the agent can make only outbound calls.
     */
    override fun queueConfigs(queueConfigs: List<Any>) {
      cdkBuilder.queueConfigs(queueConfigs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param queueConfigs The inbound queues associated with the routing profile.
     * If no queue is added, the agent can make only outbound calls.
     */
    override fun queueConfigs(vararg queueConfigs: Any): Unit = queueConfigs(queueConfigs.toList())

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnRoutingProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfileProps,
  ) : CdkObject(cdkObject), CfnRoutingProfileProps {
    /**
     * Whether agents with this routing profile will have their routing order calculated based on
     * *time since their last inbound contact* or *longest idle time* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-agentavailabilitytimer)
     */
    override fun agentAvailabilityTimer(): String? = unwrap(this).getAgentAvailabilityTimer()

    /**
     * The Amazon Resource Name (ARN) of the default outbound queue for the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-defaultoutboundqueuearn)
     */
    override fun defaultOutboundQueueArn(): String = unwrap(this).getDefaultOutboundQueueArn()

    /**
     * The description of the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     */
    override fun mediaConcurrencies(): Any = unwrap(this).getMediaConcurrencies()

    /**
     * The name of the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     */
    override fun queueConfigs(): Any? = unwrap(this).getQueueConfigs()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoutingProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfileProps):
        CfnRoutingProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRoutingProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingProfileProps):
        software.amazon.awscdk.services.connect.CfnRoutingProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnRoutingProfileProps
  }
}
