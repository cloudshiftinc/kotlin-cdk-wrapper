@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The AWS Secrets Manager secret that stores your broker credentials.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * MQBrokerAccessCredentialsProperty mQBrokerAccessCredentialsProperty =
 * MQBrokerAccessCredentialsProperty.builder()
 * .basicAuth("basicAuth")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-mqbrokeraccesscredentials.html)
 */
@CdkDslMarker
public class CfnPipeMQBrokerAccessCredentialsPropertyDsl {
  private val cdkBuilder: CfnPipe.MQBrokerAccessCredentialsProperty.Builder =
      CfnPipe.MQBrokerAccessCredentialsProperty.builder()

  /**
   * @param basicAuth The ARN of the Secrets Manager secret. 
   */
  public fun basicAuth(basicAuth: String) {
    cdkBuilder.basicAuth(basicAuth)
  }

  public fun build(): CfnPipe.MQBrokerAccessCredentialsProperty = cdkBuilder.build()
}
