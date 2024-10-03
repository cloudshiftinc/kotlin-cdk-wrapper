@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::MediaLive::SignalMap Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnSignalMap cfnSignalMap = CfnSignalMap.Builder.create(this, "MyCfnSignalMap")
 * .discoveryEntryPointArn("discoveryEntryPointArn")
 * .name("name")
 * // the properties below are optional
 * .cloudWatchAlarmTemplateGroupIdentifiers(List.of("cloudWatchAlarmTemplateGroupIdentifiers"))
 * .description("description")
 * .eventBridgeRuleTemplateGroupIdentifiers(List.of("eventBridgeRuleTemplateGroupIdentifiers"))
 * .forceRediscovery(false)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html)
 */
public open class CfnSignalMap(
  cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSignalMapProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnSignalMap(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSignalMapProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSignalMapProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSignalMapProps(props)
  )

  /**
   * A signal map's ARN (Amazon Resource Name).
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An alarm template group's id.
   */
  public open fun attrCloudWatchAlarmTemplateGroupIds(): List<String> =
      unwrap(this).getAttrCloudWatchAlarmTemplateGroupIds()

  /**
   * The date and time of resource creation.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Error message associated with a failed creation or failed update attempt of a signal map.
   */
  public open fun attrErrorMessage(): String = unwrap(this).getAttrErrorMessage()

  /**
   * An eventbridge rule template group's id.
   */
  public open fun attrEventBridgeRuleTemplateGroupIds(): List<String> =
      unwrap(this).getAttrEventBridgeRuleTemplateGroupIds()

  /**
   * A map representing an incomplete AWS media workflow as a graph.
   */
  public open fun attrFailedMediaResourceMap(): IResolvable =
      unwrap(this).getAttrFailedMediaResourceMap().let(IResolvable::wrap)

  /**
   * A signal map's id.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   *
   */
  public open fun attrIdentifier(): String = unwrap(this).getAttrIdentifier()

  /**
   * The date and time of latest discovery.
   */
  public open fun attrLastDiscoveredAt(): String = unwrap(this).getAttrLastDiscoveredAt()

  /**
   * Represents the latest successful monitor deployment of a signal map.
   */
  public open fun attrLastSuccessfulMonitorDeployment(): IResolvable =
      unwrap(this).getAttrLastSuccessfulMonitorDeployment().let(IResolvable::wrap)

  /**
   * A map representing an AWS media workflow as a graph.
   */
  public open fun attrMediaResourceMap(): IResolvable =
      unwrap(this).getAttrMediaResourceMap().let(IResolvable::wrap)

  /**
   * The date and time of latest resource modification.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * If true, there are pending monitor changes for this signal map that can be deployed.
   */
  public open fun attrMonitorChangesPendingDeployment(): IResolvable =
      unwrap(this).getAttrMonitorChangesPendingDeployment().let(IResolvable::wrap)

  /**
   * Represents the latest monitor deployment of a signal map.
   */
  public open fun attrMonitorDeployment(): IResolvable =
      unwrap(this).getAttrMonitorDeployment().let(IResolvable::wrap)

  /**
   * A signal map's current status, which is dependent on its lifecycle actions or associated jobs.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A cloudwatch alarm template group's identifier.
   */
  public open fun cloudWatchAlarmTemplateGroupIdentifiers(): List<String> =
      unwrap(this).getCloudWatchAlarmTemplateGroupIdentifiers() ?: emptyList()

  /**
   * A cloudwatch alarm template group's identifier.
   */
  public open fun cloudWatchAlarmTemplateGroupIdentifiers(`value`: List<String>) {
    unwrap(this).setCloudWatchAlarmTemplateGroupIdentifiers(`value`)
  }

  /**
   * A cloudwatch alarm template group's identifier.
   */
  public open fun cloudWatchAlarmTemplateGroupIdentifiers(vararg `value`: String): Unit =
      cloudWatchAlarmTemplateGroupIdentifiers(`value`.toList())

  /**
   * A resource's optional description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A resource's optional description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * A top-level supported Amazon Web Services resource ARN to discover a signal map from.
   */
  public open fun discoveryEntryPointArn(): String = unwrap(this).getDiscoveryEntryPointArn()

  /**
   * A top-level supported Amazon Web Services resource ARN to discover a signal map from.
   */
  public open fun discoveryEntryPointArn(`value`: String) {
    unwrap(this).setDiscoveryEntryPointArn(`value`)
  }

  /**
   * An eventbridge rule template group's identifier.
   */
  public open fun eventBridgeRuleTemplateGroupIdentifiers(): List<String> =
      unwrap(this).getEventBridgeRuleTemplateGroupIdentifiers() ?: emptyList()

  /**
   * An eventbridge rule template group's identifier.
   */
  public open fun eventBridgeRuleTemplateGroupIdentifiers(`value`: List<String>) {
    unwrap(this).setEventBridgeRuleTemplateGroupIdentifiers(`value`)
  }

  /**
   * An eventbridge rule template group's identifier.
   */
  public open fun eventBridgeRuleTemplateGroupIdentifiers(vararg `value`: String): Unit =
      eventBridgeRuleTemplateGroupIdentifiers(`value`.toList())

  /**
   * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
   * provided.
   */
  public open fun forceRediscovery(): Any? = unwrap(this).getForceRediscovery()

  /**
   * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
   * provided.
   */
  public open fun forceRediscovery(`value`: Boolean) {
    unwrap(this).setForceRediscovery(`value`)
  }

  /**
   * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
   * provided.
   */
  public open fun forceRediscovery(`value`: IResolvable) {
    unwrap(this).setForceRediscovery(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A resource's name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A resource's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Represents the tags associated with a resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Represents the tags associated with a resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnSignalMap].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A cloudwatch alarm template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-cloudwatchalarmtemplategroupidentifiers)
     * @param cloudWatchAlarmTemplateGroupIdentifiers A cloudwatch alarm template group's
     * identifier. 
     */
    public
        fun cloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers: List<String>)

    /**
     * A cloudwatch alarm template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-cloudwatchalarmtemplategroupidentifiers)
     * @param cloudWatchAlarmTemplateGroupIdentifiers A cloudwatch alarm template group's
     * identifier. 
     */
    public fun cloudWatchAlarmTemplateGroupIdentifiers(vararg
        cloudWatchAlarmTemplateGroupIdentifiers: String)

    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-description)
     * @param description A resource's optional description. 
     */
    public fun description(description: String)

    /**
     * A top-level supported Amazon Web Services resource ARN to discover a signal map from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-discoveryentrypointarn)
     * @param discoveryEntryPointArn A top-level supported Amazon Web Services resource ARN to
     * discover a signal map from. 
     */
    public fun discoveryEntryPointArn(discoveryEntryPointArn: String)

    /**
     * An eventbridge rule template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-eventbridgeruletemplategroupidentifiers)
     * @param eventBridgeRuleTemplateGroupIdentifiers An eventbridge rule template group's
     * identifier. 
     */
    public
        fun eventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers: List<String>)

    /**
     * An eventbridge rule template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-eventbridgeruletemplategroupidentifiers)
     * @param eventBridgeRuleTemplateGroupIdentifiers An eventbridge rule template group's
     * identifier. 
     */
    public fun eventBridgeRuleTemplateGroupIdentifiers(vararg
        eventBridgeRuleTemplateGroupIdentifiers: String)

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
     * provided.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-forcerediscovery)
     * @param forceRediscovery If true, will force a rediscovery of a signal map if an unchanged
     * discoveryEntryPointArn is provided. 
     */
    public fun forceRediscovery(forceRediscovery: Boolean)

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
     * provided.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-forcerediscovery)
     * @param forceRediscovery If true, will force a rediscovery of a signal map if an unchanged
     * discoveryEntryPointArn is provided. 
     */
    public fun forceRediscovery(forceRediscovery: IResolvable)

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-name)
     * @param name A resource's name. 
     */
    public fun name(name: String)

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-tags)
     * @param tags Represents the tags associated with a resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnSignalMap.Builder =
        software.amazon.awscdk.services.medialive.CfnSignalMap.Builder.create(scope, id)

    /**
     * A cloudwatch alarm template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-cloudwatchalarmtemplategroupidentifiers)
     * @param cloudWatchAlarmTemplateGroupIdentifiers A cloudwatch alarm template group's
     * identifier. 
     */
    override
        fun cloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers: List<String>) {
      cdkBuilder.cloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers)
    }

    /**
     * A cloudwatch alarm template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-cloudwatchalarmtemplategroupidentifiers)
     * @param cloudWatchAlarmTemplateGroupIdentifiers A cloudwatch alarm template group's
     * identifier. 
     */
    override fun cloudWatchAlarmTemplateGroupIdentifiers(vararg
        cloudWatchAlarmTemplateGroupIdentifiers: String): Unit =
        cloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers.toList())

    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-description)
     * @param description A resource's optional description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A top-level supported Amazon Web Services resource ARN to discover a signal map from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-discoveryentrypointarn)
     * @param discoveryEntryPointArn A top-level supported Amazon Web Services resource ARN to
     * discover a signal map from. 
     */
    override fun discoveryEntryPointArn(discoveryEntryPointArn: String) {
      cdkBuilder.discoveryEntryPointArn(discoveryEntryPointArn)
    }

    /**
     * An eventbridge rule template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-eventbridgeruletemplategroupidentifiers)
     * @param eventBridgeRuleTemplateGroupIdentifiers An eventbridge rule template group's
     * identifier. 
     */
    override
        fun eventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers: List<String>) {
      cdkBuilder.eventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers)
    }

    /**
     * An eventbridge rule template group's identifier.
     *
     * Can be either be its id or current name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-eventbridgeruletemplategroupidentifiers)
     * @param eventBridgeRuleTemplateGroupIdentifiers An eventbridge rule template group's
     * identifier. 
     */
    override fun eventBridgeRuleTemplateGroupIdentifiers(vararg
        eventBridgeRuleTemplateGroupIdentifiers: String): Unit =
        eventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers.toList())

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
     * provided.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-forcerediscovery)
     * @param forceRediscovery If true, will force a rediscovery of a signal map if an unchanged
     * discoveryEntryPointArn is provided. 
     */
    override fun forceRediscovery(forceRediscovery: Boolean) {
      cdkBuilder.forceRediscovery(forceRediscovery)
    }

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is
     * provided.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-forcerediscovery)
     * @param forceRediscovery If true, will force a rediscovery of a signal map if an unchanged
     * discoveryEntryPointArn is provided. 
     */
    override fun forceRediscovery(forceRediscovery: IResolvable) {
      cdkBuilder.forceRediscovery(forceRediscovery.let(IResolvable.Companion::unwrap))
    }

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-name)
     * @param name A resource's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-signalmap.html#cfn-medialive-signalmap-tags)
     * @param tags Represents the tags associated with a resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnSignalMap = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnSignalMap.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSignalMap {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSignalMap(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap):
        CfnSignalMap = CfnSignalMap(cdkObject)

    internal fun unwrap(wrapped: CfnSignalMap):
        software.amazon.awscdk.services.medialive.CfnSignalMap = wrapped.cdkObject as
        software.amazon.awscdk.services.medialive.CfnSignalMap
  }

  /**
   * A direct source or destination neighbor to an Amazon Web Services media resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MediaResourceNeighborProperty mediaResourceNeighborProperty =
   * MediaResourceNeighborProperty.builder()
   * .arn("arn")
   * // the properties below are optional
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresourceneighbor.html)
   */
  public interface MediaResourceNeighborProperty {
    /**
     * The ARN of a resource used in Amazon Web Services media workflows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresourceneighbor.html#cfn-medialive-signalmap-mediaresourceneighbor-arn)
     */
    public fun arn(): String

    /**
     * The logical name of an Amazon Web Services media resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresourceneighbor.html#cfn-medialive-signalmap-mediaresourceneighbor-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [MediaResourceNeighborProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The ARN of a resource used in Amazon Web Services media workflows. 
       */
      public fun arn(arn: String)

      /**
       * @param name The logical name of an Amazon Web Services media resource.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceNeighborProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceNeighborProperty.builder()

      /**
       * @param arn The ARN of a resource used in Amazon Web Services media workflows. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param name The logical name of an Amazon Web Services media resource.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceNeighborProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceNeighborProperty,
    ) : CdkObject(cdkObject),
        MediaResourceNeighborProperty {
      /**
       * The ARN of a resource used in Amazon Web Services media workflows.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresourceneighbor.html#cfn-medialive-signalmap-mediaresourceneighbor-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * The logical name of an Amazon Web Services media resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresourceneighbor.html#cfn-medialive-signalmap-mediaresourceneighbor-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MediaResourceNeighborProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceNeighborProperty):
          MediaResourceNeighborProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MediaResourceNeighborProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaResourceNeighborProperty):
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceNeighborProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceNeighborProperty
    }
  }

  /**
   * An Amazon Web Services resource used in media workflows.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MediaResourceProperty mediaResourceProperty = MediaResourceProperty.builder()
   * .destinations(List.of(MediaResourceNeighborProperty.builder()
   * .arn("arn")
   * // the properties below are optional
   * .name("name")
   * .build()))
   * .name("name")
   * .sources(List.of(MediaResourceNeighborProperty.builder()
   * .arn("arn")
   * // the properties below are optional
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresource.html)
   */
  public interface MediaResourceProperty {
    /**
     * A direct destination neighbor to an Amazon Web Services media resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresource.html#cfn-medialive-signalmap-mediaresource-destinations)
     */
    public fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * The logical name of an Amazon Web Services media resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresource.html#cfn-medialive-signalmap-mediaresource-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A direct source neighbor to an Amazon Web Services media resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresource.html#cfn-medialive-signalmap-mediaresource-sources)
     */
    public fun sources(): Any? = unwrap(this).getSources()

    /**
     * A builder for [MediaResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinations A direct destination neighbor to an Amazon Web Services media resource.
       */
      public fun destinations(destinations: IResolvable)

      /**
       * @param destinations A direct destination neighbor to an Amazon Web Services media resource.
       */
      public fun destinations(destinations: List<Any>)

      /**
       * @param destinations A direct destination neighbor to an Amazon Web Services media resource.
       */
      public fun destinations(vararg destinations: Any)

      /**
       * @param name The logical name of an Amazon Web Services media resource.
       */
      public fun name(name: String)

      /**
       * @param sources A direct source neighbor to an Amazon Web Services media resource.
       */
      public fun sources(sources: IResolvable)

      /**
       * @param sources A direct source neighbor to an Amazon Web Services media resource.
       */
      public fun sources(sources: List<Any>)

      /**
       * @param sources A direct source neighbor to an Amazon Web Services media resource.
       */
      public fun sources(vararg sources: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceProperty.builder()

      /**
       * @param destinations A direct destination neighbor to an Amazon Web Services media resource.
       */
      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinations A direct destination neighbor to an Amazon Web Services media resource.
       */
      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinations A direct destination neighbor to an Amazon Web Services media resource.
       */
      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      /**
       * @param name The logical name of an Amazon Web Services media resource.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sources A direct source neighbor to an Amazon Web Services media resource.
       */
      override fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sources A direct source neighbor to an Amazon Web Services media resource.
       */
      override fun sources(sources: List<Any>) {
        cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sources A direct source neighbor to an Amazon Web Services media resource.
       */
      override fun sources(vararg sources: Any): Unit = sources(sources.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceProperty,
    ) : CdkObject(cdkObject),
        MediaResourceProperty {
      /**
       * A direct destination neighbor to an Amazon Web Services media resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresource.html#cfn-medialive-signalmap-mediaresource-destinations)
       */
      override fun destinations(): Any? = unwrap(this).getDestinations()

      /**
       * The logical name of an Amazon Web Services media resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresource.html#cfn-medialive-signalmap-mediaresource-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A direct source neighbor to an Amazon Web Services media resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-mediaresource.html#cfn-medialive-signalmap-mediaresource-sources)
       */
      override fun sources(): Any? = unwrap(this).getSources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MediaResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceProperty):
          MediaResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? MediaResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaResourceProperty):
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnSignalMap.MediaResourceProperty
    }
  }

  /**
   * Represents the latest monitor deployment of a signal map.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MonitorDeploymentProperty monitorDeploymentProperty = MonitorDeploymentProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .detailsUri("detailsUri")
   * .errorMessage("errorMessage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-monitordeployment.html)
   */
  public interface MonitorDeploymentProperty {
    /**
     * URI associated with a signal map's monitor deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-monitordeployment.html#cfn-medialive-signalmap-monitordeployment-detailsuri)
     */
    public fun detailsUri(): String? = unwrap(this).getDetailsUri()

    /**
     * Error message associated with a failed monitor deployment of a signal map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-monitordeployment.html#cfn-medialive-signalmap-monitordeployment-errormessage)
     */
    public fun errorMessage(): String? = unwrap(this).getErrorMessage()

    /**
     * The signal map monitor deployment status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-monitordeployment.html#cfn-medialive-signalmap-monitordeployment-status)
     */
    public fun status(): String

    /**
     * A builder for [MonitorDeploymentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param detailsUri URI associated with a signal map's monitor deployment.
       */
      public fun detailsUri(detailsUri: String)

      /**
       * @param errorMessage Error message associated with a failed monitor deployment of a signal
       * map.
       */
      public fun errorMessage(errorMessage: String)

      /**
       * @param status The signal map monitor deployment status. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnSignalMap.MonitorDeploymentProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnSignalMap.MonitorDeploymentProperty.builder()

      /**
       * @param detailsUri URI associated with a signal map's monitor deployment.
       */
      override fun detailsUri(detailsUri: String) {
        cdkBuilder.detailsUri(detailsUri)
      }

      /**
       * @param errorMessage Error message associated with a failed monitor deployment of a signal
       * map.
       */
      override fun errorMessage(errorMessage: String) {
        cdkBuilder.errorMessage(errorMessage)
      }

      /**
       * @param status The signal map monitor deployment status. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnSignalMap.MonitorDeploymentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap.MonitorDeploymentProperty,
    ) : CdkObject(cdkObject),
        MonitorDeploymentProperty {
      /**
       * URI associated with a signal map's monitor deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-monitordeployment.html#cfn-medialive-signalmap-monitordeployment-detailsuri)
       */
      override fun detailsUri(): String? = unwrap(this).getDetailsUri()

      /**
       * Error message associated with a failed monitor deployment of a signal map.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-monitordeployment.html#cfn-medialive-signalmap-monitordeployment-errormessage)
       */
      override fun errorMessage(): String? = unwrap(this).getErrorMessage()

      /**
       * The signal map monitor deployment status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-monitordeployment.html#cfn-medialive-signalmap-monitordeployment-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MonitorDeploymentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap.MonitorDeploymentProperty):
          MonitorDeploymentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MonitorDeploymentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitorDeploymentProperty):
          software.amazon.awscdk.services.medialive.CfnSignalMap.MonitorDeploymentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnSignalMap.MonitorDeploymentProperty
    }
  }

  /**
   * Represents the latest successful monitor deployment of a signal map.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * SuccessfulMonitorDeploymentProperty successfulMonitorDeploymentProperty =
   * SuccessfulMonitorDeploymentProperty.builder()
   * .detailsUri("detailsUri")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-successfulmonitordeployment.html)
   */
  public interface SuccessfulMonitorDeploymentProperty {
    /**
     * URI associated with a signal map's monitor deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-successfulmonitordeployment.html#cfn-medialive-signalmap-successfulmonitordeployment-detailsuri)
     */
    public fun detailsUri(): String

    /**
     * A signal map's monitor deployment status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-successfulmonitordeployment.html#cfn-medialive-signalmap-successfulmonitordeployment-status)
     */
    public fun status(): String

    /**
     * A builder for [SuccessfulMonitorDeploymentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param detailsUri URI associated with a signal map's monitor deployment. 
       */
      public fun detailsUri(detailsUri: String)

      /**
       * @param status A signal map's monitor deployment status. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnSignalMap.SuccessfulMonitorDeploymentProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnSignalMap.SuccessfulMonitorDeploymentProperty.builder()

      /**
       * @param detailsUri URI associated with a signal map's monitor deployment. 
       */
      override fun detailsUri(detailsUri: String) {
        cdkBuilder.detailsUri(detailsUri)
      }

      /**
       * @param status A signal map's monitor deployment status. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnSignalMap.SuccessfulMonitorDeploymentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap.SuccessfulMonitorDeploymentProperty,
    ) : CdkObject(cdkObject),
        SuccessfulMonitorDeploymentProperty {
      /**
       * URI associated with a signal map's monitor deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-successfulmonitordeployment.html#cfn-medialive-signalmap-successfulmonitordeployment-detailsuri)
       */
      override fun detailsUri(): String = unwrap(this).getDetailsUri()

      /**
       * A signal map's monitor deployment status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-signalmap-successfulmonitordeployment.html#cfn-medialive-signalmap-successfulmonitordeployment-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SuccessfulMonitorDeploymentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnSignalMap.SuccessfulMonitorDeploymentProperty):
          SuccessfulMonitorDeploymentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SuccessfulMonitorDeploymentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuccessfulMonitorDeploymentProperty):
          software.amazon.awscdk.services.medialive.CfnSignalMap.SuccessfulMonitorDeploymentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnSignalMap.SuccessfulMonitorDeploymentProperty
    }
  }
}
