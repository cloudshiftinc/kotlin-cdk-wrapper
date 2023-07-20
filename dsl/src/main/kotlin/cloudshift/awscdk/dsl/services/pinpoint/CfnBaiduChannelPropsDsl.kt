@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps

@CdkDslMarker
public class CfnBaiduChannelPropsDsl {
  private val cdkBuilder: CfnBaiduChannelProps.Builder = CfnBaiduChannelProps.builder()

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

  public fun build(): CfnBaiduChannelProps = cdkBuilder.build()
}
