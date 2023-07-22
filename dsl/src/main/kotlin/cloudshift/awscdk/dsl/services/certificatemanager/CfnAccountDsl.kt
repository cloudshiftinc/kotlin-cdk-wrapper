@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import software.constructs.Construct

@CdkDslMarker
public class CfnAccountDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccount.Builder = CfnAccount.Builder.create(scope, id)

  /**
   * Object containing expiration events options associated with an AWS account .
   *
   * For more information, see
   * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
   * in the API reference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
   * @param expiryEventsConfiguration Object containing expiration events options associated with an
   * AWS account . 
   */
  public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
    cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
  }

  /**
   * Object containing expiration events options associated with an AWS account .
   *
   * For more information, see
   * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
   * in the API reference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
   * @param expiryEventsConfiguration Object containing expiration events options associated with an
   * AWS account . 
   */
  public
      fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty) {
    cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
  }

  public fun build(): CfnAccount = cdkBuilder.build()
}
