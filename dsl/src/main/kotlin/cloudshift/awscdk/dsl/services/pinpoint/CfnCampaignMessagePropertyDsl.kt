@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignMessagePropertyDsl {
  private val cdkBuilder: CfnCampaign.MessageProperty.Builder =
      CfnCampaign.MessageProperty.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun body(body: String) {
    cdkBuilder.body(body)
  }

  public fun imageIconUrl(imageIconUrl: String) {
    cdkBuilder.imageIconUrl(imageIconUrl)
  }

  public fun imageSmallIconUrl(imageSmallIconUrl: String) {
    cdkBuilder.imageSmallIconUrl(imageSmallIconUrl)
  }

  public fun imageUrl(imageUrl: String) {
    cdkBuilder.imageUrl(imageUrl)
  }

  public fun jsonBody(jsonBody: String) {
    cdkBuilder.jsonBody(jsonBody)
  }

  public fun mediaUrl(mediaUrl: String) {
    cdkBuilder.mediaUrl(mediaUrl)
  }

  public fun rawContent(rawContent: String) {
    cdkBuilder.rawContent(rawContent)
  }

  public fun silentPush(silentPush: Boolean) {
    cdkBuilder.silentPush(silentPush)
  }

  public fun silentPush(silentPush: IResolvable) {
    cdkBuilder.silentPush(silentPush)
  }

  public fun timeToLive(timeToLive: Number) {
    cdkBuilder.timeToLive(timeToLive)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnCampaign.MessageProperty = cdkBuilder.build()
}
