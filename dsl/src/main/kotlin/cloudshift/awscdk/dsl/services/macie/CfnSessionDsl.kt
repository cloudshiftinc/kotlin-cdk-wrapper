@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.macie.CfnSession
import software.constructs.Construct

@CdkDslMarker
public class CfnSessionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSession.Builder = CfnSession.Builder.create(scope, id)

  /**
   * Specifies how often Amazon Macie publishes updates to policy findings for the account.
   *
   * This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly Amazon
   * CloudWatch Events ). Valid values are:
   *
   * * FIFTEEN_MINUTES
   * * ONE_HOUR
   * * SIX_HOURS
   *
   * Default: - "SIX_HOURS"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-findingpublishingfrequency)
   * @param findingPublishingFrequency Specifies how often Amazon Macie publishes updates to policy
   * findings for the account. 
   */
  public fun findingPublishingFrequency(findingPublishingFrequency: String) {
    cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
  }

  /**
   * The status of Amazon Macie for the account.
   *
   * Valid values are: `ENABLED` , start or resume all Macie activities for the account; and,
   * `PAUSED` , suspend all Macie activities for the account.
   *
   * Default: - "ENABLED"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-session.html#cfn-macie-session-status)
   * @param status The status of Amazon Macie for the account. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnSession = cdkBuilder.build()
}
