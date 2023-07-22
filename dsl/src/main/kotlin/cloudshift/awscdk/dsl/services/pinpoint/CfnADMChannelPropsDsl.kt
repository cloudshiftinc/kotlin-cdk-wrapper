@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnADMChannelProps

@CdkDslMarker
public class CfnADMChannelPropsDsl {
  private val cdkBuilder: CfnADMChannelProps.Builder = CfnADMChannelProps.builder()

  /**
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the ADM
   * channel applies to. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param clientId The Client ID that you received from Amazon to send messages by using ADM. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param clientSecret The Client Secret that you received from Amazon to send messages by using
   * ADM. 
   */
  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * @param enabled Specifies whether to enable the ADM channel for the application.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether to enable the ADM channel for the application.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnADMChannelProps = cdkBuilder.build()
}
