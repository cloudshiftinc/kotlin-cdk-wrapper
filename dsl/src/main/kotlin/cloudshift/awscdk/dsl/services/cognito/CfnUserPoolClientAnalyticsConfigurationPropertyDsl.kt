@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolClient

/**
 * The Amazon Pinpoint analytics configuration necessary to collect metrics for a user pool.
 *
 *
 * In Regions where Amazon Pinpoint isn't available, user pools only support sending events to
 * Amazon Pinpoint projects in us-east-1. In Regions where Amazon Pinpoint is available, user pools
 * support sending events to Amazon Pinpoint projects within that same Region.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * AnalyticsConfigurationProperty analyticsConfigurationProperty =
 * AnalyticsConfigurationProperty.builder()
 * .applicationArn("applicationArn")
 * .applicationId("applicationId")
 * .externalId("externalId")
 * .roleArn("roleArn")
 * .userDataShared(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html)
 */
@CdkDslMarker
public class CfnUserPoolClientAnalyticsConfigurationPropertyDsl {
  private val cdkBuilder: CfnUserPoolClient.AnalyticsConfigurationProperty.Builder =
      CfnUserPoolClient.AnalyticsConfigurationProperty.builder()

  /**
   * @param applicationArn The Amazon Resource Name (ARN) of an Amazon Pinpoint project.
   * You can use the Amazon Pinpoint project for integration with the chosen user pool client.
   * Amazon Cognito publishes events to the Amazon Pinpoint project that the app ARN declares.
   */
  public fun applicationArn(applicationArn: String) {
    cdkBuilder.applicationArn(applicationArn)
  }

  /**
   * @param applicationId The application ID for an Amazon Pinpoint application.
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param externalId The external ID.
   */
  public fun externalId(externalId: String) {
    cdkBuilder.externalId(externalId)
  }

  /**
   * @param roleArn The ARN of an AWS Identity and Access Management role that authorizes Amazon
   * Cognito to publish events to Amazon Pinpoint analytics.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param userDataShared If `UserDataShared` is `true` , Amazon Cognito includes user data in the
   * events that it publishes to Amazon Pinpoint analytics.
   */
  public fun userDataShared(userDataShared: Boolean) {
    cdkBuilder.userDataShared(userDataShared)
  }

  /**
   * @param userDataShared If `UserDataShared` is `true` , Amazon Cognito includes user data in the
   * events that it publishes to Amazon Pinpoint analytics.
   */
  public fun userDataShared(userDataShared: IResolvable) {
    cdkBuilder.userDataShared(userDataShared)
  }

  public fun build(): CfnUserPoolClient.AnalyticsConfigurationProperty = cdkBuilder.build()
}
