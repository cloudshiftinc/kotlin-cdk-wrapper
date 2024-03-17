@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnListenerRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
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
public interface CfnListenerRuleProps {
  /**
   * The actions.
   *
   * The rule must include exactly one of the following types of actions: `forward` ,
   * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule is
   * for an HTTPS listener, it can also optionally include an authentication action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
   */
  public fun actions(): Any

  /**
   * The conditions.
   *
   * The rule can optionally include up to one of each of the following conditions:
   * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
   * optionally include one or more of each of the following conditions: `http-header` and
   * `query-string` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
   */
  public fun conditions(): Any

  /**
   * The Amazon Resource Name (ARN) of the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn)
   */
  public fun listenerArn(): String? = unwrap(this).getListenerArn()

  /**
   * The rule priority. A listener can't have multiple rules with the same priority.
   *
   * If you try to reorder rules by updating their priorities, do not specify a new priority if an
   * existing rule already uses this priority, as this can cause an error. If you need to reuse a
   * priority with a different rule, you must remove it as a priority first, and then specify it in a
   * subsequent update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority)
   */
  public fun priority(): Number

  /**
   * A builder for [CfnListenerRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions. 
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions The actions. 
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     */
    public fun actions(actions: List<Any>)

    /**
     * @param actions The actions. 
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     */
    public fun actions(vararg actions: Any)

    /**
     * @param conditions The conditions. 
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     */
    public fun conditions(conditions: IResolvable)

    /**
     * @param conditions The conditions. 
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     */
    public fun conditions(conditions: List<Any>)

    /**
     * @param conditions The conditions. 
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     */
    public fun conditions(vararg conditions: Any)

    /**
     * @param listenerArn The Amazon Resource Name (ARN) of the listener.
     */
    public fun listenerArn(listenerArn: String)

    /**
     * @param priority The rule priority. A listener can't have multiple rules with the same
     * priority. 
     * If you try to reorder rules by updating their priorities, do not specify a new priority if an
     * existing rule already uses this priority, as this can cause an error. If you need to reuse a
     * priority with a different rule, you must remove it as a priority first, and then specify it in a
     * subsequent update.
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps.builder()

    /**
     * @param actions The actions. 
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * @param actions The actions. 
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions The actions. 
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * @param conditions The conditions. 
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     */
    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
    }

    /**
     * @param conditions The conditions. 
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     */
    override fun conditions(conditions: List<Any>) {
      cdkBuilder.conditions(conditions)
    }

    /**
     * @param conditions The conditions. 
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     */
    override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

    /**
     * @param listenerArn The Amazon Resource Name (ARN) of the listener.
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * @param priority The rule priority. A listener can't have multiple rules with the same
     * priority. 
     * If you try to reorder rules by updating their priorities, do not specify a new priority if an
     * existing rule already uses this priority, as this can cause an error. If you need to reuse a
     * priority with a different rule, you must remove it as a priority first, and then specify it in a
     * subsequent update.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps,
  ) : CdkObject(cdkObject), CfnListenerRuleProps {
    /**
     * The actions.
     *
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
     */
    override fun actions(): Any = unwrap(this).getActions()

    /**
     * The conditions.
     *
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
     */
    override fun conditions(): Any = unwrap(this).getConditions()

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn)
     */
    override fun listenerArn(): String? = unwrap(this).getListenerArn()

    /**
     * The rule priority. A listener can't have multiple rules with the same priority.
     *
     * If you try to reorder rules by updating their priorities, do not specify a new priority if an
     * existing rule already uses this priority, as this can cause an error. If you need to reuse a
     * priority with a different rule, you must remove it as a priority first, and then specify it in a
     * subsequent update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority)
     */
    override fun priority(): Number = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListenerRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps):
        CfnListenerRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnListenerRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListenerRuleProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
  }
}
