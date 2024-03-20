@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new routing profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnRoutingProfile cfnRoutingProfile = CfnRoutingProfile.Builder.create(this,
 * "MyCfnRoutingProfile")
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
public open class CfnRoutingProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRoutingProfileProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnRoutingProfile(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRoutingProfileProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRoutingProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRoutingProfileProps(props)
  )

  /**
   * Whether agents with this routing profile will have their routing order calculated based on
   * *time since their last inbound contact* or *longest idle time* .
   */
  public open fun agentAvailabilityTimer(): String? = unwrap(this).getAgentAvailabilityTimer()

  /**
   * Whether agents with this routing profile will have their routing order calculated based on
   * *time since their last inbound contact* or *longest idle time* .
   */
  public open fun agentAvailabilityTimer(`value`: String) {
    unwrap(this).setAgentAvailabilityTimer(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the routing profile.
   */
  public open fun attrRoutingProfileArn(): String = unwrap(this).getAttrRoutingProfileArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the default outbound queue for the routing profile.
   */
  public open fun defaultOutboundQueueArn(): String = unwrap(this).getDefaultOutboundQueueArn()

  /**
   * The Amazon Resource Name (ARN) of the default outbound queue for the routing profile.
   */
  public open fun defaultOutboundQueueArn(`value`: String) {
    unwrap(this).setDefaultOutboundQueueArn(`value`)
  }

  /**
   * The description of the routing profile.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description of the routing profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
   */
  public open fun mediaConcurrencies(): Any = unwrap(this).getMediaConcurrencies()

  /**
   * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
   */
  public open fun mediaConcurrencies(`value`: IResolvable) {
    unwrap(this).setMediaConcurrencies(`value`.let(IResolvable::unwrap))
  }

  /**
   * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
   */
  public open fun mediaConcurrencies(`value`: List<Any>) {
    unwrap(this).setMediaConcurrencies(`value`)
  }

  /**
   * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
   */
  public open fun mediaConcurrencies(vararg `value`: Any): Unit =
      mediaConcurrencies(`value`.toList())

  /**
   * The name of the routing profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the routing profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The inbound queues associated with the routing profile.
   */
  public open fun queueConfigs(): Any? = unwrap(this).getQueueConfigs()

  /**
   * The inbound queues associated with the routing profile.
   */
  public open fun queueConfigs(`value`: IResolvable) {
    unwrap(this).setQueueConfigs(`value`.let(IResolvable::unwrap))
  }

  /**
   * The inbound queues associated with the routing profile.
   */
  public open fun queueConfigs(`value`: List<Any>) {
    unwrap(this).setQueueConfigs(`value`)
  }

  /**
   * The inbound queues associated with the routing profile.
   */
  public open fun queueConfigs(vararg `value`: Any): Unit = queueConfigs(`value`.toList())

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnRoutingProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether agents with this routing profile will have their routing order calculated based on
     * *time since their last inbound contact* or *longest idle time* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-agentavailabilitytimer)
     * @param agentAvailabilityTimer Whether agents with this routing profile will have their
     * routing order calculated based on *time since their last inbound contact* or *longest idle time*
     * . 
     */
    public fun agentAvailabilityTimer(agentAvailabilityTimer: String)

    /**
     * The Amazon Resource Name (ARN) of the default outbound queue for the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-defaultoutboundqueuearn)
     * @param defaultOutboundQueueArn The Amazon Resource Name (ARN) of the default outbound queue
     * for the routing profile. 
     */
    public fun defaultOutboundQueueArn(defaultOutboundQueueArn: String)

    /**
     * The description of the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-description)
     * @param description The description of the routing profile. 
     */
    public fun description(description: String)

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    public fun mediaConcurrencies(mediaConcurrencies: IResolvable)

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    public fun mediaConcurrencies(mediaConcurrencies: List<Any>)

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    public fun mediaConcurrencies(vararg mediaConcurrencies: Any)

    /**
     * The name of the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-name)
     * @param name The name of the routing profile. 
     */
    public fun name(name: String)

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     * @param queueConfigs The inbound queues associated with the routing profile. 
     */
    public fun queueConfigs(queueConfigs: IResolvable)

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     * @param queueConfigs The inbound queues associated with the routing profile. 
     */
    public fun queueConfigs(queueConfigs: List<Any>)

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     * @param queueConfigs The inbound queues associated with the routing profile. 
     */
    public fun queueConfigs(vararg queueConfigs: Any)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnRoutingProfile.Builder =
        software.amazon.awscdk.services.connect.CfnRoutingProfile.Builder.create(scope, id)

    /**
     * Whether agents with this routing profile will have their routing order calculated based on
     * *time since their last inbound contact* or *longest idle time* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-agentavailabilitytimer)
     * @param agentAvailabilityTimer Whether agents with this routing profile will have their
     * routing order calculated based on *time since their last inbound contact* or *longest idle time*
     * . 
     */
    override fun agentAvailabilityTimer(agentAvailabilityTimer: String) {
      cdkBuilder.agentAvailabilityTimer(agentAvailabilityTimer)
    }

    /**
     * The Amazon Resource Name (ARN) of the default outbound queue for the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-defaultoutboundqueuearn)
     * @param defaultOutboundQueueArn The Amazon Resource Name (ARN) of the default outbound queue
     * for the routing profile. 
     */
    override fun defaultOutboundQueueArn(defaultOutboundQueueArn: String) {
      cdkBuilder.defaultOutboundQueueArn(defaultOutboundQueueArn)
    }

    /**
     * The description of the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-description)
     * @param description The description of the routing profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    override fun mediaConcurrencies(mediaConcurrencies: IResolvable) {
      cdkBuilder.mediaConcurrencies(mediaConcurrencies.let(IResolvable::unwrap))
    }

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    override fun mediaConcurrencies(mediaConcurrencies: List<Any>) {
      cdkBuilder.mediaConcurrencies(mediaConcurrencies)
    }

    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-mediaconcurrencies)
     * @param mediaConcurrencies The channels agents can handle in the Contact Control Panel (CCP)
     * for this routing profile. 
     */
    override fun mediaConcurrencies(vararg mediaConcurrencies: Any): Unit =
        mediaConcurrencies(mediaConcurrencies.toList())

    /**
     * The name of the routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-name)
     * @param name The name of the routing profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     * @param queueConfigs The inbound queues associated with the routing profile. 
     */
    override fun queueConfigs(queueConfigs: IResolvable) {
      cdkBuilder.queueConfigs(queueConfigs.let(IResolvable::unwrap))
    }

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     * @param queueConfigs The inbound queues associated with the routing profile. 
     */
    override fun queueConfigs(queueConfigs: List<Any>) {
      cdkBuilder.queueConfigs(queueConfigs)
    }

    /**
     * The inbound queues associated with the routing profile.
     *
     * If no queue is added, the agent can make only outbound calls.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-queueconfigs)
     * @param queueConfigs The inbound queues associated with the routing profile. 
     */
    override fun queueConfigs(vararg queueConfigs: Any): Unit = queueConfigs(queueConfigs.toList())

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-routingprofile.html#cfn-connect-routingprofile-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnRoutingProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnRoutingProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoutingProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoutingProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile):
        CfnRoutingProfile = CfnRoutingProfile(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingProfile):
        software.amazon.awscdk.services.connect.CfnRoutingProfile = wrapped.cdkObject
  }

  /**
   * Defines the cross-channel routing behavior that allows an agent working on a contact in one
   * channel to be offered a contact from a different channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * CrossChannelBehaviorProperty crossChannelBehaviorProperty =
   * CrossChannelBehaviorProperty.builder()
   * .behaviorType("behaviorType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-crosschannelbehavior.html)
   */
  public interface CrossChannelBehaviorProperty {
    /**
     * Specifies the other channels that can be routed to an agent handling their current channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-crosschannelbehavior.html#cfn-connect-routingprofile-crosschannelbehavior-behaviortype)
     */
    public fun behaviorType(): String

    /**
     * A builder for [CrossChannelBehaviorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param behaviorType Specifies the other channels that can be routed to an agent handling
       * their current channel. 
       */
      public fun behaviorType(behaviorType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty.builder()

      /**
       * @param behaviorType Specifies the other channels that can be routed to an agent handling
       * their current channel. 
       */
      override fun behaviorType(behaviorType: String) {
        cdkBuilder.behaviorType(behaviorType)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty,
    ) : CdkObject(cdkObject), CrossChannelBehaviorProperty {
      /**
       * Specifies the other channels that can be routed to an agent handling their current channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-crosschannelbehavior.html#cfn-connect-routingprofile-crosschannelbehavior-behaviortype)
       */
      override fun behaviorType(): String = unwrap(this).getBehaviorType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CrossChannelBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty):
          CrossChannelBehaviorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CrossChannelBehaviorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossChannelBehaviorProperty):
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRoutingProfile.CrossChannelBehaviorProperty
    }
  }

  /**
   * Contains information about which channels are supported, and how many contacts an agent can
   * have on a channel simultaneously.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * MediaConcurrencyProperty mediaConcurrencyProperty = MediaConcurrencyProperty.builder()
   * .channel("channel")
   * .concurrency(123)
   * // the properties below are optional
   * .crossChannelBehavior(CrossChannelBehaviorProperty.builder()
   * .behaviorType("behaviorType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-mediaconcurrency.html)
   */
  public interface MediaConcurrencyProperty {
    /**
     * The channels that agents can handle in the Contact Control Panel (CCP).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-mediaconcurrency.html#cfn-connect-routingprofile-mediaconcurrency-channel)
     */
    public fun channel(): String

    /**
     * The number of contacts an agent can have on a channel simultaneously.
     *
     * Valid Range for `VOICE` : Minimum value of 1. Maximum value of 1.
     *
     * Valid Range for `CHAT` : Minimum value of 1. Maximum value of 10.
     *
     * Valid Range for `TASK` : Minimum value of 1. Maximum value of 10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-mediaconcurrency.html#cfn-connect-routingprofile-mediaconcurrency-concurrency)
     */
    public fun concurrency(): Number

    /**
     * Defines the cross-channel routing behavior for each channel that is enabled for this Routing
     * Profile.
     *
     * For example, this allows you to offer an agent a different contact from another channel when
     * they are currently working with a contact from a Voice channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-mediaconcurrency.html#cfn-connect-routingprofile-mediaconcurrency-crosschannelbehavior)
     */
    public fun crossChannelBehavior(): Any? = unwrap(this).getCrossChannelBehavior()

    /**
     * A builder for [MediaConcurrencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param channel The channels that agents can handle in the Contact Control Panel (CCP). 
       */
      public fun channel(channel: String)

      /**
       * @param concurrency The number of contacts an agent can have on a channel simultaneously. 
       * Valid Range for `VOICE` : Minimum value of 1. Maximum value of 1.
       *
       * Valid Range for `CHAT` : Minimum value of 1. Maximum value of 10.
       *
       * Valid Range for `TASK` : Minimum value of 1. Maximum value of 10.
       */
      public fun concurrency(concurrency: Number)

      /**
       * @param crossChannelBehavior Defines the cross-channel routing behavior for each channel
       * that is enabled for this Routing Profile.
       * For example, this allows you to offer an agent a different contact from another channel
       * when they are currently working with a contact from a Voice channel.
       */
      public fun crossChannelBehavior(crossChannelBehavior: IResolvable)

      /**
       * @param crossChannelBehavior Defines the cross-channel routing behavior for each channel
       * that is enabled for this Routing Profile.
       * For example, this allows you to offer an agent a different contact from another channel
       * when they are currently working with a contact from a Voice channel.
       */
      public fun crossChannelBehavior(crossChannelBehavior: CrossChannelBehaviorProperty)

      /**
       * @param crossChannelBehavior Defines the cross-channel routing behavior for each channel
       * that is enabled for this Routing Profile.
       * For example, this allows you to offer an agent a different contact from another channel
       * when they are currently working with a contact from a Voice channel.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfcde8aa362d223ee3c2ab2d6377b352befebe3fface34711f13a5df2121a4ab")
      public
          fun crossChannelBehavior(crossChannelBehavior: CrossChannelBehaviorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty.builder()

      /**
       * @param channel The channels that agents can handle in the Contact Control Panel (CCP). 
       */
      override fun channel(channel: String) {
        cdkBuilder.channel(channel)
      }

      /**
       * @param concurrency The number of contacts an agent can have on a channel simultaneously. 
       * Valid Range for `VOICE` : Minimum value of 1. Maximum value of 1.
       *
       * Valid Range for `CHAT` : Minimum value of 1. Maximum value of 10.
       *
       * Valid Range for `TASK` : Minimum value of 1. Maximum value of 10.
       */
      override fun concurrency(concurrency: Number) {
        cdkBuilder.concurrency(concurrency)
      }

      /**
       * @param crossChannelBehavior Defines the cross-channel routing behavior for each channel
       * that is enabled for this Routing Profile.
       * For example, this allows you to offer an agent a different contact from another channel
       * when they are currently working with a contact from a Voice channel.
       */
      override fun crossChannelBehavior(crossChannelBehavior: IResolvable) {
        cdkBuilder.crossChannelBehavior(crossChannelBehavior.let(IResolvable::unwrap))
      }

      /**
       * @param crossChannelBehavior Defines the cross-channel routing behavior for each channel
       * that is enabled for this Routing Profile.
       * For example, this allows you to offer an agent a different contact from another channel
       * when they are currently working with a contact from a Voice channel.
       */
      override fun crossChannelBehavior(crossChannelBehavior: CrossChannelBehaviorProperty) {
        cdkBuilder.crossChannelBehavior(crossChannelBehavior.let(CrossChannelBehaviorProperty::unwrap))
      }

      /**
       * @param crossChannelBehavior Defines the cross-channel routing behavior for each channel
       * that is enabled for this Routing Profile.
       * For example, this allows you to offer an agent a different contact from another channel
       * when they are currently working with a contact from a Voice channel.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cfcde8aa362d223ee3c2ab2d6377b352befebe3fface34711f13a5df2121a4ab")
      override
          fun crossChannelBehavior(crossChannelBehavior: CrossChannelBehaviorProperty.Builder.() -> Unit):
          Unit = crossChannelBehavior(CrossChannelBehaviorProperty(crossChannelBehavior))

      public fun build():
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty,
    ) : CdkObject(cdkObject), MediaConcurrencyProperty {
      /**
       * The channels that agents can handle in the Contact Control Panel (CCP).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-mediaconcurrency.html#cfn-connect-routingprofile-mediaconcurrency-channel)
       */
      override fun channel(): String = unwrap(this).getChannel()

      /**
       * The number of contacts an agent can have on a channel simultaneously.
       *
       * Valid Range for `VOICE` : Minimum value of 1. Maximum value of 1.
       *
       * Valid Range for `CHAT` : Minimum value of 1. Maximum value of 10.
       *
       * Valid Range for `TASK` : Minimum value of 1. Maximum value of 10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-mediaconcurrency.html#cfn-connect-routingprofile-mediaconcurrency-concurrency)
       */
      override fun concurrency(): Number = unwrap(this).getConcurrency()

      /**
       * Defines the cross-channel routing behavior for each channel that is enabled for this
       * Routing Profile.
       *
       * For example, this allows you to offer an agent a different contact from another channel
       * when they are currently working with a contact from a Voice channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-mediaconcurrency.html#cfn-connect-routingprofile-mediaconcurrency-crosschannelbehavior)
       */
      override fun crossChannelBehavior(): Any? = unwrap(this).getCrossChannelBehavior()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MediaConcurrencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty):
          MediaConcurrencyProperty = CdkObjectWrappers.wrap(cdkObject) as? MediaConcurrencyProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaConcurrencyProperty):
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRoutingProfile.MediaConcurrencyProperty
    }
  }

  /**
   * Contains information about the queue and channel for which priority and delay can be set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * RoutingProfileQueueConfigProperty routingProfileQueueConfigProperty =
   * RoutingProfileQueueConfigProperty.builder()
   * .delay(123)
   * .priority(123)
   * .queueReference(RoutingProfileQueueReferenceProperty.builder()
   * .channel("channel")
   * .queueArn("queueArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeueconfig.html)
   */
  public interface RoutingProfileQueueConfigProperty {
    /**
     * The delay, in seconds, a contact should be in the queue before they are routed to an
     * available agent.
     *
     * For more information, see [Queues: priority and
     * delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
     * in the *Amazon Connect Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeueconfig.html#cfn-connect-routingprofile-routingprofilequeueconfig-delay)
     */
    public fun delay(): Number

    /**
     * The order in which contacts are to be handled for the queue.
     *
     * For more information, see [Queues: priority and
     * delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeueconfig.html#cfn-connect-routingprofile-routingprofilequeueconfig-priority)
     */
    public fun priority(): Number

    /**
     * Contains information about a queue resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeueconfig.html#cfn-connect-routingprofile-routingprofilequeueconfig-queuereference)
     */
    public fun queueReference(): Any

    /**
     * A builder for [RoutingProfileQueueConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param delay The delay, in seconds, a contact should be in the queue before they are routed
       * to an available agent. 
       * For more information, see [Queues: priority and
       * delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
       * in the *Amazon Connect Administrator Guide* .
       */
      public fun delay(delay: Number)

      /**
       * @param priority The order in which contacts are to be handled for the queue. 
       * For more information, see [Queues: priority and
       * delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
       * .
       */
      public fun priority(priority: Number)

      /**
       * @param queueReference Contains information about a queue resource. 
       */
      public fun queueReference(queueReference: IResolvable)

      /**
       * @param queueReference Contains information about a queue resource. 
       */
      public fun queueReference(queueReference: RoutingProfileQueueReferenceProperty)

      /**
       * @param queueReference Contains information about a queue resource. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cddc030719541bcfcb2fe6a3158c8c91e398771a27ed58cebda8879e7b5a6947")
      public
          fun queueReference(queueReference: RoutingProfileQueueReferenceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty.builder()

      /**
       * @param delay The delay, in seconds, a contact should be in the queue before they are routed
       * to an available agent. 
       * For more information, see [Queues: priority and
       * delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
       * in the *Amazon Connect Administrator Guide* .
       */
      override fun delay(delay: Number) {
        cdkBuilder.delay(delay)
      }

      /**
       * @param priority The order in which contacts are to be handled for the queue. 
       * For more information, see [Queues: priority and
       * delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
       * .
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param queueReference Contains information about a queue resource. 
       */
      override fun queueReference(queueReference: IResolvable) {
        cdkBuilder.queueReference(queueReference.let(IResolvable::unwrap))
      }

      /**
       * @param queueReference Contains information about a queue resource. 
       */
      override fun queueReference(queueReference: RoutingProfileQueueReferenceProperty) {
        cdkBuilder.queueReference(queueReference.let(RoutingProfileQueueReferenceProperty::unwrap))
      }

      /**
       * @param queueReference Contains information about a queue resource. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cddc030719541bcfcb2fe6a3158c8c91e398771a27ed58cebda8879e7b5a6947")
      override
          fun queueReference(queueReference: RoutingProfileQueueReferenceProperty.Builder.() -> Unit):
          Unit = queueReference(RoutingProfileQueueReferenceProperty(queueReference))

      public fun build():
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty,
    ) : CdkObject(cdkObject), RoutingProfileQueueConfigProperty {
      /**
       * The delay, in seconds, a contact should be in the queue before they are routed to an
       * available agent.
       *
       * For more information, see [Queues: priority and
       * delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
       * in the *Amazon Connect Administrator Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeueconfig.html#cfn-connect-routingprofile-routingprofilequeueconfig-delay)
       */
      override fun delay(): Number = unwrap(this).getDelay()

      /**
       * The order in which contacts are to be handled for the queue.
       *
       * For more information, see [Queues: priority and
       * delay](https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing-profiles-priority.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeueconfig.html#cfn-connect-routingprofile-routingprofilequeueconfig-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * Contains information about a queue resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeueconfig.html#cfn-connect-routingprofile-routingprofilequeueconfig-queuereference)
       */
      override fun queueReference(): Any = unwrap(this).getQueueReference()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RoutingProfileQueueConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty):
          RoutingProfileQueueConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RoutingProfileQueueConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingProfileQueueConfigProperty):
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueConfigProperty
    }
  }

  /**
   * Contains the channel and queue identifier for a routing profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * RoutingProfileQueueReferenceProperty routingProfileQueueReferenceProperty =
   * RoutingProfileQueueReferenceProperty.builder()
   * .channel("channel")
   * .queueArn("queueArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeuereference.html)
   */
  public interface RoutingProfileQueueReferenceProperty {
    /**
     * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeuereference.html#cfn-connect-routingprofile-routingprofilequeuereference-channel)
     */
    public fun channel(): String

    /**
     * The Amazon Resource Name (ARN) of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeuereference.html#cfn-connect-routingprofile-routingprofilequeuereference-queuearn)
     */
    public fun queueArn(): String

    /**
     * A builder for [RoutingProfileQueueReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param channel The channels agents can handle in the Contact Control Panel (CCP) for this
       * routing profile. 
       */
      public fun channel(channel: String)

      /**
       * @param queueArn The Amazon Resource Name (ARN) of the queue. 
       */
      public fun queueArn(queueArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty.builder()

      /**
       * @param channel The channels agents can handle in the Contact Control Panel (CCP) for this
       * routing profile. 
       */
      override fun channel(channel: String) {
        cdkBuilder.channel(channel)
      }

      /**
       * @param queueArn The Amazon Resource Name (ARN) of the queue. 
       */
      override fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty,
    ) : CdkObject(cdkObject), RoutingProfileQueueReferenceProperty {
      /**
       * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeuereference.html#cfn-connect-routingprofile-routingprofilequeuereference-channel)
       */
      override fun channel(): String = unwrap(this).getChannel()

      /**
       * The Amazon Resource Name (ARN) of the queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-routingprofile-routingprofilequeuereference.html#cfn-connect-routingprofile-routingprofilequeuereference-queuearn)
       */
      override fun queueArn(): String = unwrap(this).getQueueArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RoutingProfileQueueReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty):
          RoutingProfileQueueReferenceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RoutingProfileQueueReferenceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingProfileQueueReferenceProperty):
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnRoutingProfile.RoutingProfileQueueReferenceProperty
    }
  }
}
