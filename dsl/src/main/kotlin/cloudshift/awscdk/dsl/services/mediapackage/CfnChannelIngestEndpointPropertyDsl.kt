@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnChannel

@CdkDslMarker
public class CfnChannelIngestEndpointPropertyDsl {
  private val cdkBuilder: CfnChannel.IngestEndpointProperty.Builder =
      CfnChannel.IngestEndpointProperty.builder()

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnChannel.IngestEndpointProperty = cdkBuilder.build()
}
