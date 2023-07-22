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
import software.constructs.Construct

@CdkDslMarker
public class CfnChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnChannel.Builder = CfnChannel.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Any descriptive information that you want to add to the channel for future identification
   * purposes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-description)
   * @param description Any descriptive information that you want to add to the channel for future
   * identification purposes. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Configures egress access logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
   * @param egressAccessLogs Configures egress access logs. 
   */
  public fun egressAccessLogs(egressAccessLogs: IResolvable) {
    cdkBuilder.egressAccessLogs(egressAccessLogs)
  }

  /**
   * Configures egress access logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
   * @param egressAccessLogs Configures egress access logs. 
   */
  public fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty) {
    cdkBuilder.egressAccessLogs(egressAccessLogs)
  }

  /**
   * The input URL where the source stream should be sent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
   * @param hlsIngest The input URL where the source stream should be sent. 
   */
  public fun hlsIngest(hlsIngest: IResolvable) {
    cdkBuilder.hlsIngest(hlsIngest)
  }

  /**
   * The input URL where the source stream should be sent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
   * @param hlsIngest The input URL where the source stream should be sent. 
   */
  public fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty) {
    cdkBuilder.hlsIngest(hlsIngest)
  }

  /**
   * Unique identifier that you assign to the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-id)
   * @param id Unique identifier that you assign to the channel. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * Configures ingress access logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
   * @param ingressAccessLogs Configures ingress access logs. 
   */
  public fun ingressAccessLogs(ingressAccessLogs: IResolvable) {
    cdkBuilder.ingressAccessLogs(ingressAccessLogs)
  }

  /**
   * Configures ingress access logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
   * @param ingressAccessLogs Configures ingress access logs. 
   */
  public fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty) {
    cdkBuilder.ingressAccessLogs(ingressAccessLogs)
  }

  /**
   * The tags to assign to the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-tags)
   * @param tags The tags to assign to the channel. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to assign to the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-tags)
   * @param tags The tags to assign to the channel. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnChannel {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
