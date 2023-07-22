@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@CdkDslMarker
public class CfnDomainLogPublishingOptionPropertyDsl {
  private val cdkBuilder: CfnDomain.LogPublishingOptionProperty.Builder =
      CfnDomain.LogPublishingOptionProperty.builder()

  /**
   * @param cloudWatchLogsLogGroupArn Specifies the CloudWatch log group to publish to.
   * Required if you enable log publishing for the domain.
   */
  public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
    cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
  }

  /**
   * @param enabled If `true` , enables the publishing of logs to CloudWatch.
   * Default: `false` .
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled If `true` , enables the publishing of logs to CloudWatch.
   * Default: `false` .
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnDomain.LogPublishingOptionProperty = cdkBuilder.build()
}
