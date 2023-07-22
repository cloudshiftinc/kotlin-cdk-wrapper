@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps

/**
 * Properties for defining a `CfnGCMChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnGCMChannelProps cfnGCMChannelProps = CfnGCMChannelProps.builder()
 * .apiKey("apiKey")
 * .applicationId("applicationId")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html)
 */
@CdkDslMarker
public class CfnGCMChannelPropsDsl {
  private val cdkBuilder: CfnGCMChannelProps.Builder = CfnGCMChannelProps.builder()

  /**
   * @param apiKey The Web API key, also called the *server key* , that you received from Google to
   * communicate with Google services. 
   */
  public fun apiKey(apiKey: String) {
    cdkBuilder.apiKey(apiKey)
  }

  /**
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the GCM
   * channel applies to. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnGCMChannelProps = cdkBuilder.build()
}
