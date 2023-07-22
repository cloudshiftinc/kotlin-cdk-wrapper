@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnApiKey
import software.constructs.Construct

@CdkDslMarker
public class CfnApiKeyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApiKey.Builder = CfnApiKey.Builder.create(scope, id)

  /**
   * Unique AWS AppSync GraphQL API ID for this API key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid)
   * @param apiId Unique AWS AppSync GraphQL API ID for this API key. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * The API key ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apikeyid)
   * @param apiKeyId The API key ID. 
   */
  public fun apiKeyId(apiKeyId: String) {
    cdkBuilder.apiKeyId(apiKeyId)
  }

  /**
   * Unique description of your API key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description)
   * @param description Unique description of your API key. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The time after which the API key expires.
   *
   * The date is represented as seconds since the epoch, rounded down to the nearest hour.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires)
   * @param expires The time after which the API key expires. 
   */
  public fun expires(expires: Number) {
    cdkBuilder.expires(expires)
  }

  public fun build(): CfnApiKey = cdkBuilder.build()
}
