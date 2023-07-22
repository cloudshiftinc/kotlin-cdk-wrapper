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
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps

@CdkDslMarker
public class CfnOriginEndpointPropsDsl {
  private val cdkBuilder: CfnOriginEndpointProps.Builder = CfnOriginEndpointProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _whitelist: MutableList<String> = mutableListOf()

  /**
   * @param authorization Parameters for CDN authorization.
   */
  public fun authorization(authorization: IResolvable) {
    cdkBuilder.authorization(authorization)
  }

  /**
   * @param authorization Parameters for CDN authorization.
   */
  public fun authorization(authorization: CfnOriginEndpoint.AuthorizationProperty) {
    cdkBuilder.authorization(authorization)
  }

  /**
   * @param channelId The ID of the channel associated with this endpoint. 
   */
  public fun channelId(channelId: String) {
    cdkBuilder.channelId(channelId)
  }

  /**
   * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
   */
  public fun cmafPackage(cmafPackage: IResolvable) {
    cdkBuilder.cmafPackage(cmafPackage)
  }

  /**
   * @param cmafPackage Parameters for Common Media Application Format (CMAF) packaging.
   */
  public fun cmafPackage(cmafPackage: CfnOriginEndpoint.CmafPackageProperty) {
    cdkBuilder.cmafPackage(cmafPackage)
  }

  /**
   * @param dashPackage Parameters for DASH packaging.
   */
  public fun dashPackage(dashPackage: IResolvable) {
    cdkBuilder.dashPackage(dashPackage)
  }

  /**
   * @param dashPackage Parameters for DASH packaging.
   */
  public fun dashPackage(dashPackage: CfnOriginEndpoint.DashPackageProperty) {
    cdkBuilder.dashPackage(dashPackage)
  }

  /**
   * @param description Any descriptive information that you want to add to the endpoint for future
   * identification purposes.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param hlsPackage Parameters for Apple HLS packaging.
   */
  public fun hlsPackage(hlsPackage: IResolvable) {
    cdkBuilder.hlsPackage(hlsPackage)
  }

  /**
   * @param hlsPackage Parameters for Apple HLS packaging.
   */
  public fun hlsPackage(hlsPackage: CfnOriginEndpoint.HlsPackageProperty) {
    cdkBuilder.hlsPackage(hlsPackage)
  }

  /**
   * @param id The manifest ID is required and must be unique within the OriginEndpoint. 
   * The ID can't be changed after the endpoint is created.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param manifestName A short string that's appended to the end of the endpoint URL to create a
   * unique path to this endpoint.
   */
  public fun manifestName(manifestName: String) {
    cdkBuilder.manifestName(manifestName)
  }

  /**
   * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
   */
  public fun mssPackage(mssPackage: IResolvable) {
    cdkBuilder.mssPackage(mssPackage)
  }

  /**
   * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
   */
  public fun mssPackage(mssPackage: CfnOriginEndpoint.MssPackageProperty) {
    cdkBuilder.mssPackage(mssPackage)
  }

  /**
   * @param origination Controls video origination from this endpoint.
   * Valid values:
   *
   * * `ALLOW` - enables this endpoint to serve content to requesting devices.
   * * `DENY` - prevents this endpoint from serving content. Denying origination is helpful for
   * harvesting live-to-VOD assets. For more information about harvesting and origination, see
   * [Live-to-VOD Requirements](https://docs.aws.amazon.com/mediapackage/latest/ug/ltov-reqmts.html) .
   */
  public fun origination(origination: String) {
    cdkBuilder.origination(origination)
  }

  /**
   * @param startoverWindowSeconds Maximum duration (seconds) of content to retain for startover
   * playback.
   * Omit this attribute or enter `0` to indicate that startover playback is disabled for this
   * endpoint.
   */
  public fun startoverWindowSeconds(startoverWindowSeconds: Number) {
    cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
  }

  /**
   * @param tags The tags to assign to the endpoint.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to assign to the endpoint.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param timeDelaySeconds Minimum duration (seconds) of delay to enforce on the playback of live
   * content.
   * Omit this attribute or enter `0` to indicate that there is no time delay in effect for this
   * endpoint.
   */
  public fun timeDelaySeconds(timeDelaySeconds: Number) {
    cdkBuilder.timeDelaySeconds(timeDelaySeconds)
  }

  /**
   * @param whitelist The IP addresses that can access this endpoint.
   */
  public fun whitelist(vararg whitelist: String) {
    _whitelist.addAll(listOf(*whitelist))
  }

  /**
   * @param whitelist The IP addresses that can access this endpoint.
   */
  public fun whitelist(whitelist: Collection<String>) {
    _whitelist.addAll(whitelist)
  }

  public fun build(): CfnOriginEndpointProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_whitelist.isNotEmpty()) cdkBuilder.whitelist(_whitelist)
    return cdkBuilder.build()
  }
}
