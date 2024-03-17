@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEventStream`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.customerprofiles.*;
 * CfnEventStreamProps cfnEventStreamProps = CfnEventStreamProps.builder()
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
public interface CfnEventStreamProps {
  /**
   * The unique name of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-domainname)
   */
  public fun domainName(): String

  /**
   * The name of the event stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-eventstreamname)
   */
  public fun eventStreamName(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The StreamARN of the destination to deliver profile events to.
   *
   * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-uri)
   */
  public fun uri(): String

  /**
   * A builder for [CfnEventStreamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName The unique name of the domain. 
     */
    public fun domainName(domainName: String)

    /**
     * @param eventStreamName The name of the event stream. 
     */
    public fun eventStreamName(eventStreamName: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param uri The StreamARN of the destination to deliver profile events to. 
     * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps.builder()

    /**
     * @param domainName The unique name of the domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param eventStreamName The name of the event stream. 
     */
    override fun eventStreamName(eventStreamName: String) {
      cdkBuilder.eventStreamName(eventStreamName)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param uri The StreamARN of the destination to deliver profile events to. 
     * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps,
  ) : CdkObject(cdkObject), CfnEventStreamProps {
    /**
     * The unique name of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The name of the event stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-eventstreamname)
     */
    override fun eventStreamName(): String = unwrap(this).getEventStreamName()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The StreamARN of the destination to deliver profile events to.
     *
     * For example, arn:aws:kinesis:region:account-id:stream/stream-name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-customerprofiles-eventstream.html#cfn-customerprofiles-eventstream-uri)
     */
    override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps):
        CfnEventStreamProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventStreamProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventStreamProps):
        software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.customerprofiles.CfnEventStreamProps
  }
}
