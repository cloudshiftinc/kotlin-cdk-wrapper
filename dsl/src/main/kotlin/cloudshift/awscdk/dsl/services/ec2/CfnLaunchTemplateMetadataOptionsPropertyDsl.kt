@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateMetadataOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.MetadataOptionsProperty.Builder =
      CfnLaunchTemplate.MetadataOptionsProperty.builder()

  /**
   * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances.
   * If the parameter is not specified, the default state is `enabled` .
   *
   *
   * If you specify a value of `disabled` , you will not be able to access your instance metadata.
   */
  public fun httpEndpoint(httpEndpoint: String) {
    cdkBuilder.httpEndpoint(httpEndpoint)
  }

  /**
   * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
   * service.
   * Default: `disabled`
   */
  public fun httpProtocolIpv6(httpProtocolIpv6: String) {
    cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
  }

  /**
   * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata
   * requests.
   * The larger the number, the further instance metadata requests can travel.
   *
   * Default: `1`
   *
   * Possible values: Integers from 1 to 64
   */
  public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
    cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
  }

  /**
   * @param httpTokens IMDSv2 uses token-backed sessions.
   * Set the use of HTTP tokens to `optional` (in other words, set the use of IMDSv2 to `optional` )
   * or `required` (in other words, set the use of IMDSv2 to `required` ).
   *
   * * `optional` - When IMDSv2 is optional, you can choose to retrieve instance metadata with or
   * without a session token in your request. If you retrieve the IAM role credentials without a token,
   * the IMDSv1 role credentials are returned. If you retrieve the IAM role credentials using a valid
   * session token, the IMDSv2 role credentials are returned.
   * * `required` - When IMDSv2 is required, you must send a session token with any instance
   * metadata retrieval requests. In this state, retrieving the IAM role credentials always returns
   * IMDSv2 credentials; IMDSv1 credentials are not available.
   *
   * Default: `optional`
   */
  public fun httpTokens(httpTokens: String) {
    cdkBuilder.httpTokens(httpTokens)
  }

  /**
   * @param instanceMetadataTags Set to `enabled` to allow access to instance tags from the instance
   * metadata.
   * Set to `disabled` to turn off access to instance tags from the instance metadata. For more
   * information, see [Work with instance tags using the instance
   * metadata](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#work-with-tags-in-IMDS)
   * .
   *
   * Default: `disabled`
   */
  public fun instanceMetadataTags(instanceMetadataTags: String) {
    cdkBuilder.instanceMetadataTags(instanceMetadataTags)
  }

  public fun build(): CfnLaunchTemplate.MetadataOptionsProperty = cdkBuilder.build()
}
