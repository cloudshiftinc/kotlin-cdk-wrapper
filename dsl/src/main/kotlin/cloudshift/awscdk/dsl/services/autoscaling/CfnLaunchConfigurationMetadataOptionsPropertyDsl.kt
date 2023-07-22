@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

@CdkDslMarker
public class CfnLaunchConfigurationMetadataOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchConfiguration.MetadataOptionsProperty.Builder =
      CfnLaunchConfiguration.MetadataOptionsProperty.builder()

  /**
   * @param httpEndpoint This parameter enables or disables the HTTP metadata endpoint on your
   * instances.
   * If the parameter is not specified, the default state is `enabled` .
   *
   *
   * If you specify a value of `disabled` , you will not be able to access your instance metadata.
   */
  public fun httpEndpoint(httpEndpoint: String) {
    cdkBuilder.httpEndpoint(httpEndpoint)
  }

  /**
   * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata
   * requests.
   * The larger the number, the further instance metadata requests can travel.
   *
   * Default: 1
   */
  public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
    cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
  }

  /**
   * @param httpTokens The state of token usage for your instance metadata requests.
   * If the parameter is not specified in the request, the default state is `optional` .
   *
   * If the state is `optional` , you can choose to retrieve instance metadata with or without a
   * signed token header on your request. If you retrieve the IAM role credentials without a token, the
   * version 1.0 role credentials are returned. If you retrieve the IAM role credentials using a valid
   * signed token, the version 2.0 role credentials are returned.
   *
   * If the state is `required` , you must send a signed token header with any instance metadata
   * retrieval requests. In this state, retrieving the IAM role credentials always returns the version
   * 2.0 credentials; the version 1.0 credentials are not available.
   */
  public fun httpTokens(httpTokens: String) {
    cdkBuilder.httpTokens(httpTokens)
  }

  public fun build(): CfnLaunchConfiguration.MetadataOptionsProperty = cdkBuilder.build()
}
