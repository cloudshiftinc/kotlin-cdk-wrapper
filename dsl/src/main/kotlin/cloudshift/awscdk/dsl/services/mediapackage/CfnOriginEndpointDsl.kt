@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import software.constructs.Construct

@CdkDslMarker
public class CfnOriginEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnOriginEndpoint.Builder = CfnOriginEndpoint.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _whitelist: MutableList<String> = mutableListOf()

  /**
   * Parameters for CDN authorization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
   * @param authorization Parameters for CDN authorization. 
   */
  public fun authorization(authorization: IResolvable) {
    cdkBuilder.authorization(authorization)
  }

  /**
   * Parameters for CDN authorization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-authorization)
   * @param authorization Parameters for CDN authorization. 
   */
  public fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty) {
    cdkBuilder.authorization(authorization)
  }

  /**
   * The ID of the channel associated with this endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-channelid)
   * @param channelId The ID of the channel associated with this endpoint. 
   */
  public fun channelId(channelId: String) {
    cdkBuilder.channelId(channelId)
  }

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
   * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging. 
   */
  public fun cmafPackage(cmafPackage: IResolvable) {
    cdkBuilder.cmafPackage(cmafPackage)
  }

  /**
   * Parameters for Common Media Application Format (CMAF) packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-cmafpackage)
   * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging. 
   */
  public fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty) {
    cdkBuilder.cmafPackage(cmafPackage)
  }

  /**
   * Parameters for DASH packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
   * @param dashPackage Parameters for DASH packaging. 
   */
  public fun dashPackage(dashPackage: IResolvable) {
    cdkBuilder.dashPackage(dashPackage)
  }

  /**
   * Parameters for DASH packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-dashpackage)
   * @param dashPackage Parameters for DASH packaging. 
   */
  public fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty) {
    cdkBuilder.dashPackage(dashPackage)
  }

  /**
   * Any descriptive information that you want to add to the endpoint for future identification
   * purposes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-description)
   * @param description Any descriptive information that you want to add to the endpoint for future
   * identification purposes. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Parameters for Apple HLS packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
   * @param hlsPackage Parameters for Apple HLS packaging. 
   */
  public fun hlsPackage(hlsPackage: IResolvable) {
    cdkBuilder.hlsPackage(hlsPackage)
  }

  /**
   * Parameters for Apple HLS packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-hlspackage)
   * @param hlsPackage Parameters for Apple HLS packaging. 
   */
  public fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty) {
    cdkBuilder.hlsPackage(hlsPackage)
  }

  /**
   * The manifest ID is required and must be unique within the OriginEndpoint.
   *
   * The ID can't be changed after the endpoint is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-id)
   * @param id The manifest ID is required and must be unique within the OriginEndpoint. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * A short string that's appended to the end of the endpoint URL to create a unique path to this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-manifestname)
   * @param manifestName A short string that's appended to the end of the endpoint URL to create a
   * unique path to this endpoint. 
   */
  public fun manifestName(manifestName: String) {
    cdkBuilder.manifestName(manifestName)
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
   * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
   */
  public fun mssPackage(mssPackage: IResolvable) {
    cdkBuilder.mssPackage(mssPackage)
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-msspackage)
   * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
   */
  public fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty) {
    cdkBuilder.mssPackage(mssPackage)
  }

  /**
   * Controls video origination from this endpoint.
   *
   * Valid values:
   *
   * * `ALLOW` - enables this endpoint to serve content to requesting devices.
   * * `DENY` - prevents this endpoint from serving content. Denying origination is helpful for
   * harvesting live-to-VOD assets. For more information about harvesting and origination, see
   * [Live-to-VOD Requirements](https://docs.aws.amazon.com/mediapackage/latest/ug/ltov-reqmts.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-origination)
   * @param origination Controls video origination from this endpoint. 
   */
  public fun origination(origination: String) {
    cdkBuilder.origination(origination)
  }

  /**
   * Maximum duration (seconds) of content to retain for startover playback.
   *
   * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-startoverwindowseconds)
   * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover
   * playback. 
   */
  public fun startoverWindowSeconds(startoverWindowSeconds: Number) {
    cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
  }

  /**
   * The tags to assign to the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
   * @param tags The tags to assign to the endpoint. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to assign to the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-tags)
   * @param tags The tags to assign to the endpoint. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Minimum duration (seconds) of delay to enforce on the playback of live content.
   *
   * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
   * endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-timedelayseconds)
   * @param timeDelaySeconds Minimum duration (seconds) of delay to enforce on the playback of live
   * content. 
   */
  public fun timeDelaySeconds(timeDelaySeconds: Number) {
    cdkBuilder.timeDelaySeconds(timeDelaySeconds)
  }

  /**
   * The IP addresses that can access this endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
   * @param whitelist The IP addresses that can access this endpoint. 
   */
  public fun whitelist(vararg whitelist: String) {
    _whitelist.addAll(listOf(*whitelist))
  }

  /**
   * The IP addresses that can access this endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-originendpoint.html#cfn-mediapackage-originendpoint-whitelist)
   * @param whitelist The IP addresses that can access this endpoint. 
   */
  public fun whitelist(whitelist: Collection<String>) {
    _whitelist.addAll(whitelist)
  }

  public fun build(): CfnOriginEndpoint {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_whitelist.isNotEmpty()) cdkBuilder.whitelist(_whitelist)
    return cdkBuilder.build()
  }
}
