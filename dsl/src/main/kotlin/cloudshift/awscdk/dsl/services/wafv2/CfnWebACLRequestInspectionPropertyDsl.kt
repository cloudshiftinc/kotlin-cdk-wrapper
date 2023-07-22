@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * The criteria for inspecting login requests, used by the ATP rule group to validate credentials
 * usage.
 *
 * This is part of the `AWSManagedRulesATPRuleSet` configuration in `ManagedRuleGroupConfig` .
 *
 * In these settings, you specify how your application accepts login attempts by providing the
 * request payload type and the names of the fields within the request body where the username and
 * password are provided.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RequestInspectionProperty requestInspectionProperty = RequestInspectionProperty.builder()
 * .passwordField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .payloadType("payloadType")
 * .usernameField(FieldIdentifierProperty.builder()
 * .identifier("identifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspection.html)
 */
@CdkDslMarker
public class CfnWebACLRequestInspectionPropertyDsl {
  private val cdkBuilder: CfnWebACL.RequestInspectionProperty.Builder =
      CfnWebACL.RequestInspectionProperty.builder()

  /**
   * @param passwordField The name of the field in the request payload that contains your customer's
   * password. 
   * How you specify this depends on the request inspection payload type.
   *
   * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
   * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
   * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
   *
   * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the password
   * field specification is `/form/password` .
   *
   * * For form encoded payload types, use the HTML form names.
   *
   * For example, for an HTML form with the input element named `password1` , the password field
   * specification is `password1` .
   */
  public fun passwordField(passwordField: IResolvable) {
    cdkBuilder.passwordField(passwordField)
  }

  /**
   * @param passwordField The name of the field in the request payload that contains your customer's
   * password. 
   * How you specify this depends on the request inspection payload type.
   *
   * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
   * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
   * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
   *
   * For example, for the JSON payload `{ "form": { "password": "THE_PASSWORD" } }` , the password
   * field specification is `/form/password` .
   *
   * * For form encoded payload types, use the HTML form names.
   *
   * For example, for an HTML form with the input element named `password1` , the password field
   * specification is `password1` .
   */
  public fun passwordField(passwordField: CfnWebACL.FieldIdentifierProperty) {
    cdkBuilder.passwordField(passwordField)
  }

  /**
   * @param payloadType The payload type for your login endpoint, either JSON or form encoded. 
   */
  public fun payloadType(payloadType: String) {
    cdkBuilder.payloadType(payloadType)
  }

  /**
   * @param usernameField The name of the field in the request payload that contains your customer's
   * username. 
   * How you specify this depends on the request inspection payload type.
   *
   * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
   * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
   * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
   *
   * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the username
   * field specification is `/form/username` .
   *
   * * For form encoded payload types, use the HTML form names.
   *
   * For example, for an HTML form with the input element named `username1` , the username field
   * specification is `username1`
   */
  public fun usernameField(usernameField: IResolvable) {
    cdkBuilder.usernameField(usernameField)
  }

  /**
   * @param usernameField The name of the field in the request payload that contains your customer's
   * username. 
   * How you specify this depends on the request inspection payload type.
   *
   * * For JSON payloads, specify the field name in JSON pointer syntax. For information about the
   * JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation [JavaScript
   * Object Notation (JSON) Pointer](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc6901) .
   *
   * For example, for the JSON payload `{ "form": { "username": "THE_USERNAME" } }` , the username
   * field specification is `/form/username` .
   *
   * * For form encoded payload types, use the HTML form names.
   *
   * For example, for an HTML form with the input element named `username1` , the username field
   * specification is `username1`
   */
  public fun usernameField(usernameField: CfnWebACL.FieldIdentifierProperty) {
    cdkBuilder.usernameField(usernameField)
  }

  public fun build(): CfnWebACL.RequestInspectionProperty = cdkBuilder.build()
}
