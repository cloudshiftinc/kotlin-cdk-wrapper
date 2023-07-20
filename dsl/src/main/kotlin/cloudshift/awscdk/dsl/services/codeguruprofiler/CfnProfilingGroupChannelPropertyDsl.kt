@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup

@CdkDslMarker
public class CfnProfilingGroupChannelPropertyDsl {
  private val cdkBuilder: CfnProfilingGroup.ChannelProperty.Builder =
      CfnProfilingGroup.ChannelProperty.builder()

  public fun channelId(channelId: String) {
    cdkBuilder.channelId(channelId)
  }

  public fun channelUri(channelUri: String) {
    cdkBuilder.channelUri(channelUri)
  }

  public fun build(): CfnProfilingGroup.ChannelProperty = cdkBuilder.build()
}
