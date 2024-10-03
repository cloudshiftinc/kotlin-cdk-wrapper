@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Contains information about a returned CloudTrail channel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
 * .destinations(List.of(DestinationProperty.builder()
 * .location("location")
 * .type("type")
 * .build()))
 * .name("name")
 * .source("source")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html)
 */
public open class CfnChannel(
  cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannel,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudtrail.CfnChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps,
  ) :
      this(software.amazon.awscdk.services.cloudtrail.CfnChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelProps(props)
  )

  /**
   * `Ref` returns the ARN of the CloudTrail channel, such as
   * `arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890` .
   */
  public open fun attrChannelArn(): String = unwrap(this).getAttrChannelArn()

  /**
   * One or more event data stores to which events arriving through a channel will be logged.
   */
  public open fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * One or more event data stores to which events arriving through a channel will be logged.
   */
  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * One or more event data stores to which events arriving through a channel will be logged.
   */
  public open fun destinations(`value`: List<Any>) {
    unwrap(this).setDestinations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * One or more event data stores to which events arriving through a channel will be logged.
   */
  public open fun destinations(vararg `value`: Any): Unit = destinations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the channel.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the channel.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The name of the partner or external event source.
   */
  public open fun source(): String? = unwrap(this).getSource()

  /**
   * The name of the partner or external event source.
   */
  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudtrail.CfnChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * One or more event data stores to which events arriving through a channel will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-destinations)
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged. 
     */
    public fun destinations(destinations: IResolvable)

    /**
     * One or more event data stores to which events arriving through a channel will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-destinations)
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged. 
     */
    public fun destinations(destinations: List<Any>)

    /**
     * One or more event data stores to which events arriving through a channel will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-destinations)
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged. 
     */
    public fun destinations(vararg destinations: Any)

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-name)
     * @param name The name of the channel. 
     */
    public fun name(name: String)

    /**
     * The name of the partner or external event source.
     *
     * You cannot change this name after you create the channel. A maximum of one channel is allowed
     * per source.
     *
     * A source can be either `Custom` for all valid non- AWS events, or the name of a partner event
     * source. For information about the source names for available partners, see [Additional
     * information about integration
     * partners](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-source)
     * @param source The name of the partner or external event source. 
     */
    public fun source(source: String)

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-tags)
     * @param tags A list of tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-tags)
     * @param tags A list of tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnChannel.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnChannel.Builder.create(scope, id)

    /**
     * One or more event data stores to which events arriving through a channel will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-destinations)
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged. 
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable.Companion::unwrap))
    }

    /**
     * One or more event data stores to which events arriving through a channel will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-destinations)
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged. 
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * One or more event data stores to which events arriving through a channel will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-destinations)
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged. 
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-name)
     * @param name The name of the channel. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The name of the partner or external event source.
     *
     * You cannot change this name after you create the channel. A maximum of one channel is allowed
     * per source.
     *
     * A source can be either `Custom` for all valid non- AWS events, or the name of a partner event
     * source. For information about the source names for available partners, see [Additional
     * information about integration
     * partners](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information)
     * in the CloudTrail User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-source)
     * @param source The name of the partner or external event source. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-tags)
     * @param tags A list of tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-tags)
     * @param tags A list of tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudtrail.CfnChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannel): CfnChannel
        = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel): software.amazon.awscdk.services.cloudtrail.CfnChannel
        = wrapped.cdkObject as software.amazon.awscdk.services.cloudtrail.CfnChannel
  }

  /**
   * Contains information about the destination receiving events.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
   * DestinationProperty destinationProperty = DestinationProperty.builder()
   * .location("location")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-channel-destination.html)
   */
  public interface DestinationProperty {
    /**
     * For channels used for a CloudTrail Lake integration, the location is the ARN of an event data
     * store that receives events from a channel.
     *
     * For service-linked channels, the location is the name of the AWS service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-channel-destination.html#cfn-cloudtrail-channel-destination-location)
     */
    public fun location(): String

    /**
     * The type of destination for events arriving from a channel.
     *
     * For channels used for a CloudTrail Lake integration, the value is `EVENT_DATA_STORE` . For
     * service-linked channels, the value is `AWS_SERVICE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-channel-destination.html#cfn-cloudtrail-channel-destination-type)
     */
    public fun type(): String

    /**
     * A builder for [DestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param location For channels used for a CloudTrail Lake integration, the location is the
       * ARN of an event data store that receives events from a channel. 
       * For service-linked channels, the location is the name of the AWS service.
       */
      public fun location(location: String)

      /**
       * @param type The type of destination for events arriving from a channel. 
       * For channels used for a CloudTrail Lake integration, the value is `EVENT_DATA_STORE` . For
       * service-linked channels, the value is `AWS_SERVICE` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty.builder()

      /**
       * @param location For channels used for a CloudTrail Lake integration, the location is the
       * ARN of an event data store that receives events from a channel. 
       * For service-linked channels, the location is the name of the AWS service.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param type The type of destination for events arriving from a channel. 
       * For channels used for a CloudTrail Lake integration, the value is `EVENT_DATA_STORE` . For
       * service-linked channels, the value is `AWS_SERVICE` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty,
    ) : CdkObject(cdkObject),
        DestinationProperty {
      /**
       * For channels used for a CloudTrail Lake integration, the location is the ARN of an event
       * data store that receives events from a channel.
       *
       * For service-linked channels, the location is the name of the AWS service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-channel-destination.html#cfn-cloudtrail-channel-destination-location)
       */
      override fun location(): String = unwrap(this).getLocation()

      /**
       * The type of destination for events arriving from a channel.
       *
       * For channels used for a CloudTrail Lake integration, the value is `EVENT_DATA_STORE` . For
       * service-linked channels, the value is `AWS_SERVICE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-channel-destination.html#cfn-cloudtrail-channel-destination-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty):
          DestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? DestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty
    }
  }
}
