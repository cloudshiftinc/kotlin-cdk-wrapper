@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnChannelProps

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
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
@CdkDslMarker
public class CfnChannelPropsDsl {
  private val cdkBuilder: CfnChannelProps.Builder = CfnChannelProps.builder()

  private val _destinations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param destinations One or more event data stores to which events arriving through a channel
   * will be logged.
   */
  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  /**
   * @param destinations One or more event data stores to which events arriving through a channel
   * will be logged.
   */
  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  /**
   * @param destinations One or more event data stores to which events arriving through a channel
   * will be logged.
   */
  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * @param name The name of the channel.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param source The name of the partner or external event source.
   * You cannot change this name after you create the channel. A maximum of one channel is allowed
   * per source.
   *
   * A source can be either `Custom` for all valid non- AWS events, or the name of a partner event
   * source. For information about the source names for available partners, see [Additional information
   * about integration
   * partners](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store-integration.html#cloudtrail-lake-partner-information)
   * in the CloudTrail User Guide.
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * @param tags A list of tags.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of tags.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnChannelProps {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
