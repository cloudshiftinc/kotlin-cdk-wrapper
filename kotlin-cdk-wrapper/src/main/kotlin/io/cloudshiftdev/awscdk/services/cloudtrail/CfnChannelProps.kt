@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
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
public interface CfnChannelProps {
  /**
   * One or more event data stores to which events arriving through a channel will be logged.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-destinations)
   */
  public fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * The name of the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The name of the partner or external event source.
   *
   * You cannot change this name after you create the channel. A maximum of one channel is allowed
   * per source.
   *
   * A source can be either `Custom` for all valid non- AWS events, or the name of a partner event
   * source. For information about the source names for available partners, see [Additional information
   * about integration
   * partners](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information)
   * in the CloudTrail User Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-source)
   */
  public fun source(): String? = unwrap(this).getSource()

  /**
   * A list of tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged.
     */
    public fun destinations(destinations: IResolvable)

    /**
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged.
     */
    public fun destinations(destinations: List<Any>)

    /**
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged.
     */
    public fun destinations(vararg destinations: Any)

    /**
     * @param name The name of the channel.
     */
    public fun name(name: String)

    /**
     * @param source The name of the partner or external event source.
     * You cannot change this name after you create the channel. A maximum of one channel is allowed
     * per source.
     *
     * A source can be either `Custom` for all valid non- AWS events, or the name of a partner event
     * source. For information about the source names for available partners, see [Additional
     * information about integration
     * partners](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information)
     * in the CloudTrail User Guide.
     */
    public fun source(source: String)

    /**
     * @param tags A list of tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnChannelProps.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnChannelProps.builder()

    /**
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged.
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    /**
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged.
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    /**
     * @param destinations One or more event data stores to which events arriving through a channel
     * will be logged.
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * @param name The name of the channel.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param source The name of the partner or external event source.
     * You cannot change this name after you create the channel. A maximum of one channel is allowed
     * per source.
     *
     * A source can be either `Custom` for all valid non- AWS events, or the name of a partner event
     * source. For information about the source names for available partners, see [Additional
     * information about integration
     * partners](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information)
     * in the CloudTrail User Guide.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param tags A list of tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    /**
     * One or more event data stores to which events arriving through a channel will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-destinations)
     */
    override fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-name)
     */
    override fun name(): String? = unwrap(this).getName()

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
     */
    override fun source(): String? = unwrap(this).getSource()

    /**
     * A list of tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-channel.html#cfn-cloudtrail-channel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannelProps):
        CfnChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.cloudtrail.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.CfnChannelProps
  }
}
