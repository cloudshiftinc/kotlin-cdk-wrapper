@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.CfnIdentityPool

@CdkDslMarker
public class CfnIdentityPoolPushSyncPropertyDsl {
  private val cdkBuilder: CfnIdentityPool.PushSyncProperty.Builder =
      CfnIdentityPool.PushSyncProperty.builder()

  private val _applicationArns: MutableList<String> = mutableListOf()

  /**
   * @param applicationArns The ARNs of the Amazon SNS platform applications that could be used by
   * clients.
   */
  public fun applicationArns(vararg applicationArns: String) {
    _applicationArns.addAll(listOf(*applicationArns))
  }

  /**
   * @param applicationArns The ARNs of the Amazon SNS platform applications that could be used by
   * clients.
   */
  public fun applicationArns(applicationArns: Collection<String>) {
    _applicationArns.addAll(applicationArns)
  }

  /**
   * @param roleArn An IAM role configured to allow Amazon Cognito to call Amazon SNS on behalf of
   * the developer.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnIdentityPool.PushSyncProperty {
    if(_applicationArns.isNotEmpty()) cdkBuilder.applicationArns(_applicationArns)
    return cdkBuilder.build()
  }
}
