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
