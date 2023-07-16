@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnBaiduChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBaiduChannel.Builder = CfnBaiduChannel.Builder.create(scope, id)

  public fun apiKey(apiKey: String) {
    cdkBuilder.apiKey(apiKey)
  }

  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun secretKey(secretKey: String) {
    cdkBuilder.secretKey(secretKey)
  }

  public fun build(): CfnBaiduChannel = cdkBuilder.build()
}
