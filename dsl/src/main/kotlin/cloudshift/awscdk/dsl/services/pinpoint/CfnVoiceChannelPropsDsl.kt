@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnVoiceChannelProps

@CdkDslMarker
public class CfnVoiceChannelPropsDsl {
  private val cdkBuilder: CfnVoiceChannelProps.Builder = CfnVoiceChannelProps.builder()

  /**
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the voice
   * channel applies to. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param enabled Specifies whether to enable the voice channel for the application.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether to enable the voice channel for the application.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnVoiceChannelProps = cdkBuilder.build()
}
