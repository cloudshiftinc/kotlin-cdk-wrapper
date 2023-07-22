@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLAWSManagedRulesATPRuleSetPropertyDsl {
  private val cdkBuilder: CfnWebACL.AWSManagedRulesATPRuleSetProperty.Builder =
      CfnWebACL.AWSManagedRulesATPRuleSetProperty.builder()

  /**
   * @param loginPath The path of the login endpoint for your application. 
   * For example, for the URL `https://example.com/web/login` , you would provide the path
   * `/web/login` .
   *
   * The rule group inspects only HTTP `POST` requests to your specified login endpoint.
   */
  public fun loginPath(loginPath: String) {
    cdkBuilder.loginPath(loginPath)
  }

  /**
   * @param requestInspection The criteria for inspecting login requests, used by the ATP rule group
   * to validate credentials usage.
   */
  public fun requestInspection(requestInspection: IResolvable) {
    cdkBuilder.requestInspection(requestInspection)
  }

  /**
   * @param requestInspection The criteria for inspecting login requests, used by the ATP rule group
   * to validate credentials usage.
   */
  public fun requestInspection(requestInspection: CfnWebACL.RequestInspectionProperty) {
    cdkBuilder.requestInspection(requestInspection)
  }

  /**
   * @param responseInspection The criteria for inspecting responses to login requests, used by the
   * ATP rule group to track login failure rates.
   * The ATP rule group evaluates the responses that your protected resources send back to client
   * login attempts, keeping count of successful and failed attempts from each IP address and client
   * session. Using this information, the rule group labels and mitigates requests from client sessions
   * and IP addresses that submit too many failed login attempts in a short amount of time.
   *
   *
   * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
   */
  public fun responseInspection(responseInspection: IResolvable) {
    cdkBuilder.responseInspection(responseInspection)
  }

  /**
   * @param responseInspection The criteria for inspecting responses to login requests, used by the
   * ATP rule group to track login failure rates.
   * The ATP rule group evaluates the responses that your protected resources send back to client
   * login attempts, keeping count of successful and failed attempts from each IP address and client
   * session. Using this information, the rule group labels and mitigates requests from client sessions
   * and IP addresses that submit too many failed login attempts in a short amount of time.
   *
   *
   * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
   */
  public fun responseInspection(responseInspection: CfnWebACL.ResponseInspectionProperty) {
    cdkBuilder.responseInspection(responseInspection)
  }

  public fun build(): CfnWebACL.AWSManagedRulesATPRuleSetProperty = cdkBuilder.build()
}
