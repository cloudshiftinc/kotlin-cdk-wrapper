@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

@CdkDslMarker
public class CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl {
  private val cdkBuilder: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder =
      CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.builder()

  /**
   * @param httpPutResponseHopLimit Limit the number of hops that an instance metadata request can
   * traverse to reach its destination.
   * The default is one hop. However, if HTTP tokens are required, container image builds need a
   * minimum of two hops.
   */
  public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
    cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
  }

  /**
   * @param httpTokens Indicates whether a signed token header is required for instance metadata
   * retrieval requests.
   * The values affect the response as follows:
   *
   * * *required* – When you retrieve the IAM role credentials, version 2.0 credentials are returned
   * in all cases.
   * * *optional* – You can include a signed token header in your request to retrieve instance
   * metadata, or you can leave it out. If you include it, version 2.0 credentials are returned for the
   * IAM role. Otherwise, version 1.0 credentials are returned.
   *
   * The default setting is *optional* .
   */
  public fun httpTokens(httpTokens: String) {
    cdkBuilder.httpTokens(httpTokens)
  }

  public fun build(): CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty =
      cdkBuilder.build()
}
