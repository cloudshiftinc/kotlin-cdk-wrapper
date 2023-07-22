@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnChannel
import software.amazon.awscdk.services.mediapackage.CfnChannelProps

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
 * .id("id")
 * // the properties below are optional
 * .description("description")
 * .egressAccessLogs(LogConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .hlsIngest(HlsIngestProperty.builder()
 * .ingestEndpoints(List.of(IngestEndpointProperty.builder()
 * .id("id")
 * .password("password")
 * .url("url")
 * .username("username")
 * .build()))
 * .build())
 * .ingressAccessLogs(LogConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html)
 */
@CdkDslMarker
public class CfnChannelPropsDsl {
  private val cdkBuilder: CfnChannelProps.Builder = CfnChannelProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description Any descriptive information that you want to add to the channel for future
   * identification purposes.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param egressAccessLogs Configures egress access logs.
   */
  public fun egressAccessLogs(egressAccessLogs: IResolvable) {
    cdkBuilder.egressAccessLogs(egressAccessLogs)
  }

  /**
   * @param egressAccessLogs Configures egress access logs.
   */
  public fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty) {
    cdkBuilder.egressAccessLogs(egressAccessLogs)
  }

  /**
   * @param hlsIngest The input URL where the source stream should be sent.
   */
  public fun hlsIngest(hlsIngest: IResolvable) {
    cdkBuilder.hlsIngest(hlsIngest)
  }

  /**
   * @param hlsIngest The input URL where the source stream should be sent.
   */
  public fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty) {
    cdkBuilder.hlsIngest(hlsIngest)
  }

  /**
   * @param id Unique identifier that you assign to the channel. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param ingressAccessLogs Configures ingress access logs.
   */
  public fun ingressAccessLogs(ingressAccessLogs: IResolvable) {
    cdkBuilder.ingressAccessLogs(ingressAccessLogs)
  }

  /**
   * @param ingressAccessLogs Configures ingress access logs.
   */
  public fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty) {
    cdkBuilder.ingressAccessLogs(ingressAccessLogs)
  }

  /**
   * @param tags The tags to assign to the channel.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to assign to the channel.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnChannelProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
