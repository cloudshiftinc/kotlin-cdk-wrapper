@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps

/**
 * Properties for defining a `CfnListenerRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * CfnListenerRuleProps cfnListenerRuleProps = CfnListenerRuleProps.builder()
 * .actions(List.of(ActionProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .authenticateCognitoConfig(AuthenticateCognitoConfigProperty.builder()
 * .userPoolArn("userPoolArn")
 * .userPoolClientId("userPoolClientId")
 * .userPoolDomain("userPoolDomain")
 * // the properties below are optional
 * .authenticationRequestExtraParams(Map.of(
 * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
 * .onUnauthenticatedRequest("onUnauthenticatedRequest")
 * .scope("scope")
 * .sessionCookieName("sessionCookieName")
 * .sessionTimeout(123)
 * .build())
 * .authenticateOidcConfig(AuthenticateOidcConfigProperty.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientId("clientId")
 * .issuer("issuer")
 * .tokenEndpoint("tokenEndpoint")
 * .userInfoEndpoint("userInfoEndpoint")
 * // the properties below are optional
 * .authenticationRequestExtraParams(Map.of(
 * "authenticationRequestExtraParamsKey", "authenticationRequestExtraParams"))
 * .clientSecret("clientSecret")
 * .onUnauthenticatedRequest("onUnauthenticatedRequest")
 * .scope("scope")
 * .sessionCookieName("sessionCookieName")
 * .sessionTimeout(123)
 * .useExistingClientSecret(false)
 * .build())
 * .fixedResponseConfig(FixedResponseConfigProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentType("contentType")
 * .messageBody("messageBody")
 * .build())
 * .forwardConfig(ForwardConfigProperty.builder()
 * .targetGroups(List.of(TargetGroupTupleProperty.builder()
 * .targetGroupArn("targetGroupArn")
 * .weight(123)
 * .build()))
 * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
 * .durationSeconds(123)
 * .enabled(false)
 * .build())
 * .build())
 * .order(123)
 * .redirectConfig(RedirectConfigProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .host("host")
 * .path("path")
 * .port("port")
 * .protocol("protocol")
 * .query("query")
 * .build())
 * .targetGroupArn("targetGroupArn")
 * .build()))
 * .conditions(List.of(RuleConditionProperty.builder()
 * .field("field")
 * .hostHeaderConfig(HostHeaderConfigProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .httpHeaderConfig(HttpHeaderConfigProperty.builder()
 * .httpHeaderName("httpHeaderName")
 * .values(List.of("values"))
 * .build())
 * .httpRequestMethodConfig(HttpRequestMethodConfigProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .pathPatternConfig(PathPatternConfigProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .queryStringConfig(QueryStringConfigProperty.builder()
 * .values(List.of(QueryStringKeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .sourceIpConfig(SourceIpConfigProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .values(List.of("values"))
 * .build()))
 * .priority(123)
 * // the properties below are optional
 * .listenerArn("listenerArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html)
 */
@CdkDslMarker
public class CfnListenerRulePropsDsl {
  private val cdkBuilder: CfnListenerRuleProps.Builder = CfnListenerRuleProps.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  private val _conditions: MutableList<Any> = mutableListOf()

  /**
   * @param actions The actions. 
   * The rule must include exactly one of the following types of actions: `forward` ,
   * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule is
   * for an HTTPS listener, it can also optionally include an authentication action.
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The actions. 
   * The rule must include exactly one of the following types of actions: `forward` ,
   * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule is
   * for an HTTPS listener, it can also optionally include an authentication action.
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * @param actions The actions. 
   * The rule must include exactly one of the following types of actions: `forward` ,
   * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule is
   * for an HTTPS listener, it can also optionally include an authentication action.
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param conditions The conditions. 
   * The rule can optionally include up to one of each of the following conditions:
   * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
   * optionally include one or more of each of the following conditions: `http-header` and
   * `query-string` .
   */
  public fun conditions(vararg conditions: Any) {
    _conditions.addAll(listOf(*conditions))
  }

  /**
   * @param conditions The conditions. 
   * The rule can optionally include up to one of each of the following conditions:
   * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
   * optionally include one or more of each of the following conditions: `http-header` and
   * `query-string` .
   */
  public fun conditions(conditions: Collection<Any>) {
    _conditions.addAll(conditions)
  }

  /**
   * @param conditions The conditions. 
   * The rule can optionally include up to one of each of the following conditions:
   * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
   * optionally include one or more of each of the following conditions: `http-header` and
   * `query-string` .
   */
  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * @param listenerArn The Amazon Resource Name (ARN) of the listener.
   */
  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  /**
   * @param priority The rule priority. A listener can't have multiple rules with the same priority.
   * 
   * If you try to reorder rules by updating their priorities, do not specify a new priority if an
   * existing rule already uses this priority, as this can cause an error. If you need to reuse a
   * priority with a different rule, you must remove it as a priority first, and then specify it in a
   * subsequent update.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CfnListenerRuleProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    return cdkBuilder.build()
  }
}
