@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes resources needed to authenticate access to some source repositories.
 *
 * The specific resource depends on the repository provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * AuthenticationConfigurationProperty authenticationConfigurationProperty =
 * AuthenticationConfigurationProperty.builder()
 * .accessRoleArn("accessRoleArn")
 * .connectionArn("connectionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-authenticationconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceAuthenticationConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.AuthenticationConfigurationProperty.Builder =
      CfnService.AuthenticationConfigurationProperty.builder()

  /**
   * @param accessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants the App Runner
   * service access to a source repository.
   * It's required for ECR image repositories (but not for ECR Public repositories).
   */
  public fun accessRoleArn(accessRoleArn: String) {
    cdkBuilder.accessRoleArn(accessRoleArn)
  }

  /**
   * @param connectionArn The Amazon Resource Name (ARN) of the App Runner connection that enables
   * the App Runner service to connect to a source repository.
   * It's required for GitHub code repositories.
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  public fun build(): CfnService.AuthenticationConfigurationProperty = cdkBuilder.build()
}
