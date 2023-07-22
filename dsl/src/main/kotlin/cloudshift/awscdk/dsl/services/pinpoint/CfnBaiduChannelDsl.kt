@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnBaiduChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnBaiduChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBaiduChannel.Builder = CfnBaiduChannel.Builder.create(scope, id)

  /**
   * The API key that you received from the Baidu Cloud Push service to communicate with the
   * service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-apikey)
   * @param apiKey The API key that you received from the Baidu Cloud Push service to communicate
   * with the service. 
   */
  public fun apiKey(apiKey: String) {
    cdkBuilder.apiKey(apiKey)
  }

  /**
   * The unique identifier for the Amazon Pinpoint application that you're configuring the Baidu
   * channel for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-applicationid)
   * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
   * configuring the Baidu channel for. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * Specifies whether to enable the Baidu channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
   * @param enabled Specifies whether to enable the Baidu channel for the application. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Specifies whether to enable the Baidu channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-enabled)
   * @param enabled Specifies whether to enable the Baidu channel for the application. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * The secret key that you received from the Baidu Cloud Push service to communicate with the
   * service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-baiduchannel.html#cfn-pinpoint-baiduchannel-secretkey)
   * @param secretKey The secret key that you received from the Baidu Cloud Push service to
   * communicate with the service. 
   */
  public fun secretKey(secretKey: String) {
    cdkBuilder.secretKey(secretKey)
  }

  public fun build(): CfnBaiduChannel = cdkBuilder.build()
}
