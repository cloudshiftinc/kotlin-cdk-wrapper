@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointElasticsearchSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.ElasticsearchSettingsProperty.Builder =
      CfnEndpoint.ElasticsearchSettingsProperty.builder()

  /**
   * @param endpointUri The endpoint for the OpenSearch cluster.
   * AWS DMS uses HTTPS if a transport protocol (either HTTP or HTTPS) isn't specified.
   */
  public fun endpointUri(endpointUri: String) {
    cdkBuilder.endpointUri(endpointUri)
  }

  /**
   * @param errorRetryDuration The maximum number of seconds for which DMS retries failed API
   * requests to the OpenSearch cluster.
   */
  public fun errorRetryDuration(errorRetryDuration: Number) {
    cdkBuilder.errorRetryDuration(errorRetryDuration)
  }

  /**
   * @param fullLoadErrorPercentage The maximum percentage of records that can fail to be written
   * before a full load operation stops.
   * To avoid early failure, this counter is only effective after 1,000 records are transferred.
   * OpenSearch also has the concept of error monitoring during the last 10 minutes of an Observation
   * Window. If transfer of all records fail in the last 10 minutes, the full load operation stops.
   */
  public fun fullLoadErrorPercentage(fullLoadErrorPercentage: Number) {
    cdkBuilder.fullLoadErrorPercentage(fullLoadErrorPercentage)
  }

  /**
   * @param serviceAccessRoleArn The Amazon Resource Name (ARN) used by the service to access the
   * IAM role.
   * The role must allow the `iam:PassRole` action.
   */
  public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
    cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
  }

  public fun build(): CfnEndpoint.ElasticsearchSettingsProperty = cdkBuilder.build()
}
