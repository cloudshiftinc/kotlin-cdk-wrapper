@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An Event Stream resource of Amazon Connect Customer Profiles.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnEventStream cfnEventStream = CfnEventStream.Builder.create(this, "MyCfnEventStream")
 * .domainName("domainName")
 * .eventStreamName("eventStreamName")
 * .uri("uri")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html)
 */
public open class CfnEventStream(
  cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStream,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventStreamProps,
  ) :
      this(software.amazon.awscdk.services.customerprofiles.CfnEventStream(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventStreamProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventStreamProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventStreamProps(props)
  )

  /**
   * The timestamp of when the export was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Details regarding the Kinesis stream.
   */
  public open fun attrDestinationDetails(): IResolvable =
      unwrap(this).getAttrDestinationDetails().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrDestinationDetailsStatus(): String =
      unwrap(this).getAttrDestinationDetailsStatus()

  /**
   *
   */
  public open fun attrDestinationDetailsUri(): String = unwrap(this).getAttrDestinationDetailsUri()

  /**
   * A unique identifier for the event stream.
   */
  public open fun attrEventStreamArn(): String = unwrap(this).getAttrEventStreamArn()

  /**
   * The operational state of destination stream for export.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The unique name of the domain.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The unique name of the domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The name of the event stream.
   */
  public open fun eventStreamName(): String = unwrap(this).getEventStreamName()

  /**
   * The name of the event stream.
   */
  public open fun eventStreamName(`value`: String) {
    unwrap(this).setEventStreamName(`value`)
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
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The StreamARN of the destination to deliver profile events to.
   */
  public open fun uri(): String = unwrap(this).getUri()

  /**
   * The StreamARN of the destination to deliver profile events to.
   */
  public open fun uri(`value`: String) {
    unwrap(this).setUri(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.customerprofiles.CfnEventStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-domainname)
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The name of the event stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-eventstreamname)
     * @param eventStreamName The name of the event stream. 
     */
    public fun eventStreamName(eventStreamName: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The StreamARN of the destination to deliver profile events to.
     *
     * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-uri)
     * @param uri The StreamARN of the destination to deliver profile events to. 
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnEventStream.Builder
        = software.amazon.awscdk.services.customerprofiles.CfnEventStream.Builder.create(scope, id)

    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-domainname)
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The name of the event stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-eventstreamname)
     * @param eventStreamName The name of the event stream. 
     */
    override fun eventStreamName(eventStreamName: String) {
      cdkBuilder.eventStreamName(eventStreamName)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The StreamARN of the destination to deliver profile events to.
     *
     * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-uri)
     * @param uri The StreamARN of the destination to deliver profile events to. 
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnEventStream =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.customerprofiles.CfnEventStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStream):
        CfnEventStream = CfnEventStream(cdkObject)

    internal fun unwrap(wrapped: CfnEventStream):
        software.amazon.awscdk.services.customerprofiles.CfnEventStream = wrapped.cdkObject as
        software.amazon.awscdk.services.customerprofiles.CfnEventStream
  }

  /**
   * Details regarding the Kinesis stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
   * DestinationDetailsProperty destinationDetailsProperty = DestinationDetailsProperty.builder()
   * .status("status")
   * .uri("uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventstream-destinationdetails.html)
   */
  public interface DestinationDetailsProperty {
    /**
     * The status of enabling the Kinesis stream as a destination for export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventstream-destinationdetails.html#cfn-customerprofiles-eventstream-destinationdetails-status)
     */
    public fun status(): String

    /**
     * The StreamARN of the destination to deliver profile events to.
     *
     * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventstream-destinationdetails.html#cfn-customerprofiles-eventstream-destinationdetails-uri)
     */
    public fun uri(): String

    /**
     * A builder for [DestinationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status The status of enabling the Kinesis stream as a destination for export. 
       */
      public fun status(status: String)

      /**
       * @param uri The StreamARN of the destination to deliver profile events to. 
       * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty.builder()

      /**
       * @param status The status of enabling the Kinesis stream as a destination for export. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param uri The StreamARN of the destination to deliver profile events to. 
       * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty,
    ) : CdkObject(cdkObject), DestinationDetailsProperty {
      /**
       * The status of enabling the Kinesis stream as a destination for export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventstream-destinationdetails.html#cfn-customerprofiles-eventstream-destinationdetails-status)
       */
      override fun status(): String = unwrap(this).getStatus()

      /**
       * The StreamARN of the destination to deliver profile events to.
       *
       * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-eventstream-destinationdetails.html#cfn-customerprofiles-eventstream-destinationdetails-uri)
       */
      override fun uri(): String = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty):
          DestinationDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationDetailsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.customerprofiles.CfnEventStream.DestinationDetailsProperty
    }
  }
}
