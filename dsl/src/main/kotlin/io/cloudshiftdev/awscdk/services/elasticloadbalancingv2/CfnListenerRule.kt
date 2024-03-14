package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnListenerRule internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The actions.
   */
  public open fun actions(): Any = unwrap(this).getActions()

  /**
   * The actions.
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The actions.
   */
  public open fun actions(__idx_ac66f0: List<Any>) {
    unwrap(this).setActions(__idx_ac66f0)
  }

  /**
   * The actions.
   */
  public open fun actions(vararg __idx_ac66f0: Any): Unit = actions(__idx_ac66f0.toList())

  /**
   * Indicates whether this is the default rule.
   */
  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the rule.
   */
  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

  /**
   * The conditions.
   */
  public open fun conditions(): Any = unwrap(this).getConditions()

  /**
   * The conditions.
   */
  public open fun conditions(`value`: IResolvable) {
    unwrap(this).setConditions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The conditions.
   */
  public open fun conditions(__idx_ac66f0: List<Any>) {
    unwrap(this).setConditions(__idx_ac66f0)
  }

  /**
   * The conditions.
   */
  public open fun conditions(vararg __idx_ac66f0: Any): Unit = conditions(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the listener.
   */
  public open fun listenerArn(): String? = unwrap(this).getListenerArn()

  /**
   * The Amazon Resource Name (ARN) of the listener.
   */
  public open fun listenerArn(`value`: String) {
    unwrap(this).setListenerArn(`value`)
  }

  /**
   * The rule priority.
   *
   * A listener can't have multiple rules with the same priority.
   */
  public open fun priority(): Number = unwrap(this).getPriority()

  /**
   * The rule priority.
   *
   * A listener can't have multiple rules with the same priority.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.CfnListenerRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The actions.
     *
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
     * @param actions The actions. 
     */
    public fun actions(actions: IResolvable)

    /**
     * The actions.
     *
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
     * @param actions The actions. 
     */
    public fun actions(actions: List<Any>)

    /**
     * The actions.
     *
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
     * @param actions The actions. 
     */
    public fun actions(vararg actions: Any)

    /**
     * The conditions.
     *
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
     * @param conditions The conditions. 
     */
    public fun conditions(conditions: IResolvable)

    /**
     * The conditions.
     *
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
     * @param conditions The conditions. 
     */
    public fun conditions(conditions: List<Any>)

    /**
     * The conditions.
     *
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
     * @param conditions The conditions. 
     */
    public fun conditions(vararg conditions: Any)

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn)
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    public fun listenerArn(listenerArn: String)

    /**
     * The rule priority. A listener can't have multiple rules with the same priority.
     *
     * If you try to reorder rules by updating their priorities, do not specify a new priority if an
     * existing rule already uses this priority, as this can cause an error. If you need to reuse a
     * priority with a different rule, you must remove it as a priority first, and then specify it in a
     * subsequent update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority)
     * @param priority The rule priority. A listener can't have multiple rules with the same
     * priority. 
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.Builder.create(scope,
        id)

    /**
     * The actions.
     *
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
     * @param actions The actions. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * The actions.
     *
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
     * @param actions The actions. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * The actions.
     *
     * The rule must include exactly one of the following types of actions: `forward` ,
     * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule
     * is for an HTTPS listener, it can also optionally include an authentication action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
     * @param actions The actions. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * The conditions.
     *
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
     * @param conditions The conditions. 
     */
    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
    }

    /**
     * The conditions.
     *
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
     * @param conditions The conditions. 
     */
    override fun conditions(conditions: List<Any>) {
      cdkBuilder.conditions(conditions)
    }

    /**
     * The conditions.
     *
     * The rule can optionally include up to one of each of the following conditions:
     * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
     * optionally include one or more of each of the following conditions: `http-header` and
     * `query-string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
     * @param conditions The conditions. 
     */
    override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn)
     * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * The rule priority. A listener can't have multiple rules with the same priority.
     *
     * If you try to reorder rules by updating their priorities, do not specify a new priority if an
     * existing rule already uses this priority, as this can cause an error. If you need to reuse a
     * priority with a different rule, you must remove it as a priority first, and then specify it in a
     * subsequent update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority)
     * @param priority The rule priority. A listener can't have multiple rules with the same
     * priority. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListenerRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListenerRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule):
        CfnListenerRule = CfnListenerRule(cdkObject)

    internal fun unwrap(wrapped: CfnListenerRule):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule = wrapped.cdkObject
  }

  public interface RedirectConfigProperty {
    /**
     * The hostname.
     *
     * This component is not percent-encoded. The hostname can contain #{host}.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-host)
     */
    public fun host(): String? = unwrap(this).getHost()

    /**
     * The absolute path, starting with the leading "/".
     *
     * This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The port.
     *
     * You can specify a value from 1 to 65535 or #{port}.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-port)
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * The protocol.
     *
     * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS,
     * and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The query parameters, URL-encoded when necessary, but not percent-encoded.
     *
     * Do not include the leading "?", as it is automatically added. You can specify any of the
     * reserved keywords.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-query)
     */
    public fun query(): String? = unwrap(this).getQuery()

    /**
     * The HTTP redirect code.
     *
     * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-statuscode)
     */
    public fun statusCode(): String

    /**
     * A builder for [RedirectConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param host The hostname.
       * This component is not percent-encoded. The hostname can contain #{host}.
       */
      public fun host(host: String)

      /**
       * @param path The absolute path, starting with the leading "/".
       * This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
       */
      public fun path(path: String)

      /**
       * @param port The port.
       * You can specify a value from 1 to 65535 or #{port}.
       */
      public fun port(port: String)

      /**
       * @param protocol The protocol.
       * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS,
       * and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
       */
      public fun protocol(protocol: String)

      /**
       * @param query The query parameters, URL-encoded when necessary, but not percent-encoded.
       * Do not include the leading "?", as it is automatically added. You can specify any of the
       * reserved keywords.
       */
      public fun query(query: String)

      /**
       * @param statusCode The HTTP redirect code. 
       * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
       */
      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty.builder()

      /**
       * @param host The hostname.
       * This component is not percent-encoded. The hostname can contain #{host}.
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param path The absolute path, starting with the leading "/".
       * This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param port The port.
       * You can specify a value from 1 to 65535 or #{port}.
       */
      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The protocol.
       * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS,
       * and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param query The query parameters, URL-encoded when necessary, but not percent-encoded.
       * Do not include the leading "?", as it is automatically added. You can specify any of the
       * reserved keywords.
       */
      override fun query(query: String) {
        cdkBuilder.query(query)
      }

      /**
       * @param statusCode The HTTP redirect code. 
       * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
       */
      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty,
    ) : CdkObject(cdkObject), RedirectConfigProperty {
      /**
       * The hostname.
       *
       * This component is not percent-encoded. The hostname can contain #{host}.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-host)
       */
      override fun host(): String? = unwrap(this).getHost()

      /**
       * The absolute path, starting with the leading "/".
       *
       * This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * The port.
       *
       * You can specify a value from 1 to 65535 or #{port}.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-port)
       */
      override fun port(): String? = unwrap(this).getPort()

      /**
       * The protocol.
       *
       * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS,
       * and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The query parameters, URL-encoded when necessary, but not percent-encoded.
       *
       * Do not include the leading "?", as it is automatically added. You can specify any of the
       * reserved keywords.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-query)
       */
      override fun query(): String? = unwrap(this).getQuery()

      /**
       * The HTTP redirect code.
       *
       * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html#cfn-elasticloadbalancingv2-listenerrule-redirectconfig-statuscode)
       */
      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedirectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty):
          RedirectConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedirectConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RedirectConfigProperty
    }
  }

  public interface ActionProperty {
    /**
     * [HTTPS listeners] Information for using Amazon Cognito to authenticate users.
     *
     * Specify only when `Type` is `authenticate-cognito` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-authenticatecognitoconfig)
     */
    public fun authenticateCognitoConfig(): Any? = unwrap(this).getAuthenticateCognitoConfig()

    /**
     * [HTTPS listeners] Information about an identity provider that is compliant with OpenID
     * Connect (OIDC).
     *
     * Specify only when `Type` is `authenticate-oidc` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-authenticateoidcconfig)
     */
    public fun authenticateOidcConfig(): Any? = unwrap(this).getAuthenticateOidcConfig()

    /**
     * [Application Load Balancer] Information for creating an action that returns a custom HTTP
     * response.
     *
     * Specify only when `Type` is `fixed-response` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-fixedresponseconfig)
     */
    public fun fixedResponseConfig(): Any? = unwrap(this).getFixedResponseConfig()

    /**
     * Information for creating an action that distributes requests among one or more target groups.
     *
     * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
     * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only
     * one target group using `ForwardConfig` and it must be the same target group specified in
     * `TargetGroupArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-forwardconfig)
     */
    public fun forwardConfig(): Any? = unwrap(this).getForwardConfig()

    /**
     * The order for the action.
     *
     * This value is required for rules with multiple actions. The action with the lowest value for
     * order is performed first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-order)
     */
    public fun order(): Number? = unwrap(this).getOrder()

    /**
     * [Application Load Balancer] Information for creating a redirect action.
     *
     * Specify only when `Type` is `redirect` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-redirectconfig)
     */
    public fun redirectConfig(): Any? = unwrap(this).getRedirectConfig()

    /**
     * The Amazon Resource Name (ARN) of the target group.
     *
     * Specify only when `Type` is `forward` and you want to route to a single target group. To
     * route to one or more target groups, use `ForwardConfig` instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-targetgrouparn)
     */
    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    /**
     * The type of action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-type)
     */
    public fun type(): String

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon Cognito to
       * authenticate users.
       * Specify only when `Type` is `authenticate-cognito` .
       */
      public fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable)

      /**
       * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon Cognito to
       * authenticate users.
       * Specify only when `Type` is `authenticate-cognito` .
       */
      public
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty)

      /**
       * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon Cognito to
       * authenticate users.
       * Specify only when `Type` is `authenticate-cognito` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("378d76cb2e2575288ef5df66fa14f71c0678b9ab6ae162163eb146b97192db7c")
      public
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty.Builder.() -> Unit)

      /**
       * @param authenticateOidcConfig [HTTPS listeners] Information about an identity provider that
       * is compliant with OpenID Connect (OIDC).
       * Specify only when `Type` is `authenticate-oidc` .
       */
      public fun authenticateOidcConfig(authenticateOidcConfig: IResolvable)

      /**
       * @param authenticateOidcConfig [HTTPS listeners] Information about an identity provider that
       * is compliant with OpenID Connect (OIDC).
       * Specify only when `Type` is `authenticate-oidc` .
       */
      public fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty)

      /**
       * @param authenticateOidcConfig [HTTPS listeners] Information about an identity provider that
       * is compliant with OpenID Connect (OIDC).
       * Specify only when `Type` is `authenticate-oidc` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be8fbd647e89028c48807d2deca6a6d3defb75b5e15a25146fca7dd7d3bdd073")
      public
          fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty.Builder.() -> Unit)

      /**
       * @param fixedResponseConfig [Application Load Balancer] Information for creating an action
       * that returns a custom HTTP response.
       * Specify only when `Type` is `fixed-response` .
       */
      public fun fixedResponseConfig(fixedResponseConfig: IResolvable)

      /**
       * @param fixedResponseConfig [Application Load Balancer] Information for creating an action
       * that returns a custom HTTP response.
       * Specify only when `Type` is `fixed-response` .
       */
      public fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty)

      /**
       * @param fixedResponseConfig [Application Load Balancer] Information for creating an action
       * that returns a custom HTTP response.
       * Specify only when `Type` is `fixed-response` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0043a9a4d68d3c72e55b5bfbddc78b332dcd268ac9c3b9033dd36530c6995975")
      public
          fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty.Builder.() -> Unit)

      /**
       * @param forwardConfig Information for creating an action that distributes requests among one
       * or more target groups.
       * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
       * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only
       * one target group using `ForwardConfig` and it must be the same target group specified in
       * `TargetGroupArn` .
       */
      public fun forwardConfig(forwardConfig: IResolvable)

      /**
       * @param forwardConfig Information for creating an action that distributes requests among one
       * or more target groups.
       * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
       * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only
       * one target group using `ForwardConfig` and it must be the same target group specified in
       * `TargetGroupArn` .
       */
      public fun forwardConfig(forwardConfig: ForwardConfigProperty)

      /**
       * @param forwardConfig Information for creating an action that distributes requests among one
       * or more target groups.
       * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
       * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only
       * one target group using `ForwardConfig` and it must be the same target group specified in
       * `TargetGroupArn` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11fd118fb9d2b4ce3a3509fa89b339f5e61454798d30be6f7d56e2eddcfa9b1f")
      public fun forwardConfig(forwardConfig: ForwardConfigProperty.Builder.() -> Unit)

      /**
       * @param order The order for the action.
       * This value is required for rules with multiple actions. The action with the lowest value
       * for order is performed first.
       */
      public fun order(order: Number)

      /**
       * @param redirectConfig [Application Load Balancer] Information for creating a redirect
       * action.
       * Specify only when `Type` is `redirect` .
       */
      public fun redirectConfig(redirectConfig: IResolvable)

      /**
       * @param redirectConfig [Application Load Balancer] Information for creating a redirect
       * action.
       * Specify only when `Type` is `redirect` .
       */
      public fun redirectConfig(redirectConfig: RedirectConfigProperty)

      /**
       * @param redirectConfig [Application Load Balancer] Information for creating a redirect
       * action.
       * Specify only when `Type` is `redirect` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("347e35c9ecda80593b305009ccbd0ecba03227fdd5b10911275978d2d4aed55c")
      public fun redirectConfig(redirectConfig: RedirectConfigProperty.Builder.() -> Unit)

      /**
       * @param targetGroupArn The Amazon Resource Name (ARN) of the target group.
       * Specify only when `Type` is `forward` and you want to route to a single target group. To
       * route to one or more target groups, use `ForwardConfig` instead.
       */
      public fun targetGroupArn(targetGroupArn: String)

      /**
       * @param type The type of action. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty.builder()

      /**
       * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon Cognito to
       * authenticate users.
       * Specify only when `Type` is `authenticate-cognito` .
       */
      override fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable) {
        cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig.let(IResolvable::unwrap))
      }

      /**
       * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon Cognito to
       * authenticate users.
       * Specify only when `Type` is `authenticate-cognito` .
       */
      override
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty) {
        cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig.let(AuthenticateCognitoConfigProperty::unwrap))
      }

      /**
       * @param authenticateCognitoConfig [HTTPS listeners] Information for using Amazon Cognito to
       * authenticate users.
       * Specify only when `Type` is `authenticate-cognito` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("378d76cb2e2575288ef5df66fa14f71c0678b9ab6ae162163eb146b97192db7c")
      override
          fun authenticateCognitoConfig(authenticateCognitoConfig: AuthenticateCognitoConfigProperty.Builder.() -> Unit):
          Unit =
          authenticateCognitoConfig(AuthenticateCognitoConfigProperty(authenticateCognitoConfig))

      /**
       * @param authenticateOidcConfig [HTTPS listeners] Information about an identity provider that
       * is compliant with OpenID Connect (OIDC).
       * Specify only when `Type` is `authenticate-oidc` .
       */
      override fun authenticateOidcConfig(authenticateOidcConfig: IResolvable) {
        cdkBuilder.authenticateOidcConfig(authenticateOidcConfig.let(IResolvable::unwrap))
      }

      /**
       * @param authenticateOidcConfig [HTTPS listeners] Information about an identity provider that
       * is compliant with OpenID Connect (OIDC).
       * Specify only when `Type` is `authenticate-oidc` .
       */
      override fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty) {
        cdkBuilder.authenticateOidcConfig(authenticateOidcConfig.let(AuthenticateOidcConfigProperty::unwrap))
      }

      /**
       * @param authenticateOidcConfig [HTTPS listeners] Information about an identity provider that
       * is compliant with OpenID Connect (OIDC).
       * Specify only when `Type` is `authenticate-oidc` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be8fbd647e89028c48807d2deca6a6d3defb75b5e15a25146fca7dd7d3bdd073")
      override
          fun authenticateOidcConfig(authenticateOidcConfig: AuthenticateOidcConfigProperty.Builder.() -> Unit):
          Unit = authenticateOidcConfig(AuthenticateOidcConfigProperty(authenticateOidcConfig))

      /**
       * @param fixedResponseConfig [Application Load Balancer] Information for creating an action
       * that returns a custom HTTP response.
       * Specify only when `Type` is `fixed-response` .
       */
      override fun fixedResponseConfig(fixedResponseConfig: IResolvable) {
        cdkBuilder.fixedResponseConfig(fixedResponseConfig.let(IResolvable::unwrap))
      }

      /**
       * @param fixedResponseConfig [Application Load Balancer] Information for creating an action
       * that returns a custom HTTP response.
       * Specify only when `Type` is `fixed-response` .
       */
      override fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty) {
        cdkBuilder.fixedResponseConfig(fixedResponseConfig.let(FixedResponseConfigProperty::unwrap))
      }

      /**
       * @param fixedResponseConfig [Application Load Balancer] Information for creating an action
       * that returns a custom HTTP response.
       * Specify only when `Type` is `fixed-response` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0043a9a4d68d3c72e55b5bfbddc78b332dcd268ac9c3b9033dd36530c6995975")
      override
          fun fixedResponseConfig(fixedResponseConfig: FixedResponseConfigProperty.Builder.() -> Unit):
          Unit = fixedResponseConfig(FixedResponseConfigProperty(fixedResponseConfig))

      /**
       * @param forwardConfig Information for creating an action that distributes requests among one
       * or more target groups.
       * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
       * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only
       * one target group using `ForwardConfig` and it must be the same target group specified in
       * `TargetGroupArn` .
       */
      override fun forwardConfig(forwardConfig: IResolvable) {
        cdkBuilder.forwardConfig(forwardConfig.let(IResolvable::unwrap))
      }

      /**
       * @param forwardConfig Information for creating an action that distributes requests among one
       * or more target groups.
       * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
       * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only
       * one target group using `ForwardConfig` and it must be the same target group specified in
       * `TargetGroupArn` .
       */
      override fun forwardConfig(forwardConfig: ForwardConfigProperty) {
        cdkBuilder.forwardConfig(forwardConfig.let(ForwardConfigProperty::unwrap))
      }

      /**
       * @param forwardConfig Information for creating an action that distributes requests among one
       * or more target groups.
       * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
       * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only
       * one target group using `ForwardConfig` and it must be the same target group specified in
       * `TargetGroupArn` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11fd118fb9d2b4ce3a3509fa89b339f5e61454798d30be6f7d56e2eddcfa9b1f")
      override fun forwardConfig(forwardConfig: ForwardConfigProperty.Builder.() -> Unit): Unit =
          forwardConfig(ForwardConfigProperty(forwardConfig))

      /**
       * @param order The order for the action.
       * This value is required for rules with multiple actions. The action with the lowest value
       * for order is performed first.
       */
      override fun order(order: Number) {
        cdkBuilder.order(order)
      }

      /**
       * @param redirectConfig [Application Load Balancer] Information for creating a redirect
       * action.
       * Specify only when `Type` is `redirect` .
       */
      override fun redirectConfig(redirectConfig: IResolvable) {
        cdkBuilder.redirectConfig(redirectConfig.let(IResolvable::unwrap))
      }

      /**
       * @param redirectConfig [Application Load Balancer] Information for creating a redirect
       * action.
       * Specify only when `Type` is `redirect` .
       */
      override fun redirectConfig(redirectConfig: RedirectConfigProperty) {
        cdkBuilder.redirectConfig(redirectConfig.let(RedirectConfigProperty::unwrap))
      }

      /**
       * @param redirectConfig [Application Load Balancer] Information for creating a redirect
       * action.
       * Specify only when `Type` is `redirect` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("347e35c9ecda80593b305009ccbd0ecba03227fdd5b10911275978d2d4aed55c")
      override fun redirectConfig(redirectConfig: RedirectConfigProperty.Builder.() -> Unit): Unit =
          redirectConfig(RedirectConfigProperty(redirectConfig))

      /**
       * @param targetGroupArn The Amazon Resource Name (ARN) of the target group.
       * Specify only when `Type` is `forward` and you want to route to a single target group. To
       * route to one or more target groups, use `ForwardConfig` instead.
       */
      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      /**
       * @param type The type of action. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * [HTTPS listeners] Information for using Amazon Cognito to authenticate users.
       *
       * Specify only when `Type` is `authenticate-cognito` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-authenticatecognitoconfig)
       */
      override fun authenticateCognitoConfig(): Any? = unwrap(this).getAuthenticateCognitoConfig()

      /**
       * [HTTPS listeners] Information about an identity provider that is compliant with OpenID
       * Connect (OIDC).
       *
       * Specify only when `Type` is `authenticate-oidc` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-authenticateoidcconfig)
       */
      override fun authenticateOidcConfig(): Any? = unwrap(this).getAuthenticateOidcConfig()

      /**
       * [Application Load Balancer] Information for creating an action that returns a custom HTTP
       * response.
       *
       * Specify only when `Type` is `fixed-response` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-fixedresponseconfig)
       */
      override fun fixedResponseConfig(): Any? = unwrap(this).getFixedResponseConfig()

      /**
       * Information for creating an action that distributes requests among one or more target
       * groups.
       *
       * For Network Load Balancers, you can specify a single target group. Specify only when `Type`
       * is `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only
       * one target group using `ForwardConfig` and it must be the same target group specified in
       * `TargetGroupArn` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-forwardconfig)
       */
      override fun forwardConfig(): Any? = unwrap(this).getForwardConfig()

      /**
       * The order for the action.
       *
       * This value is required for rules with multiple actions. The action with the lowest value
       * for order is performed first.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-order)
       */
      override fun order(): Number? = unwrap(this).getOrder()

      /**
       * [Application Load Balancer] Information for creating a redirect action.
       *
       * Specify only when `Type` is `redirect` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-redirectconfig)
       */
      override fun redirectConfig(): Any? = unwrap(this).getRedirectConfig()

      /**
       * The Amazon Resource Name (ARN) of the target group.
       *
       * Specify only when `Type` is `forward` and you want to route to a single target group. To
       * route to one or more target groups, use `ForwardConfig` instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-targetgrouparn)
       */
      override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

      /**
       * The type of action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-action.html#cfn-elasticloadbalancingv2-listenerrule-action-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ActionProperty
    }
  }

  public interface QueryStringConfigProperty {
    /**
     * The key/value pairs or values to find in the query string.
     *
     * The maximum size of each string is 128 characters. The comparison is case insensitive. The
     * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
     * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
     * escape these characters in `Values` using a '' character.
     *
     * If you specify multiple key/value pairs or values, the condition is satisfied if one of them
     * is found in the query string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringconfig.html#cfn-elasticloadbalancingv2-listenerrule-querystringconfig-values)
     */
    public fun values(): Any? = unwrap(this).getValues()

    /**
     * A builder for [QueryStringConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param values The key/value pairs or values to find in the query string.
       * The maximum size of each string is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
       * escape these characters in `Values` using a '' character.
       *
       * If you specify multiple key/value pairs or values, the condition is satisfied if one of
       * them is found in the query string.
       */
      public fun values(values: IResolvable)

      /**
       * @param values The key/value pairs or values to find in the query string.
       * The maximum size of each string is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
       * escape these characters in `Values` using a '' character.
       *
       * If you specify multiple key/value pairs or values, the condition is satisfied if one of
       * them is found in the query string.
       */
      public fun values(values: List<Any>)

      /**
       * @param values The key/value pairs or values to find in the query string.
       * The maximum size of each string is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
       * escape these characters in `Values` using a '' character.
       *
       * If you specify multiple key/value pairs or values, the condition is satisfied if one of
       * them is found in the query string.
       */
      public fun values(vararg values: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty.builder()

      /**
       * @param values The key/value pairs or values to find in the query string.
       * The maximum size of each string is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
       * escape these characters in `Values` using a '' character.
       *
       * If you specify multiple key/value pairs or values, the condition is satisfied if one of
       * them is found in the query string.
       */
      override fun values(values: IResolvable) {
        cdkBuilder.values(values.let(IResolvable::unwrap))
      }

      /**
       * @param values The key/value pairs or values to find in the query string.
       * The maximum size of each string is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
       * escape these characters in `Values` using a '' character.
       *
       * If you specify multiple key/value pairs or values, the condition is satisfied if one of
       * them is found in the query string.
       */
      override fun values(values: List<Any>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The key/value pairs or values to find in the query string.
       * The maximum size of each string is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
       * escape these characters in `Values` using a '' character.
       *
       * If you specify multiple key/value pairs or values, the condition is satisfied if one of
       * them is found in the query string.
       */
      override fun values(vararg values: Any): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty,
    ) : CdkObject(cdkObject), QueryStringConfigProperty {
      /**
       * The key/value pairs or values to find in the query string.
       *
       * The maximum size of each string is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character). To search for a literal '*' or '?' character in a query string, you must
       * escape these characters in `Values` using a '' character.
       *
       * If you specify multiple key/value pairs or values, the condition is satisfied if one of
       * them is found in the query string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringconfig.html#cfn-elasticloadbalancingv2-listenerrule-querystringconfig-values)
       */
      override fun values(): Any? = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty):
          QueryStringConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringConfigProperty
    }
  }

  public interface PathPatternConfigProperty {
    /**
     * The path patterns to compare against the request URL.
     *
     * The maximum size of each string is 128 characters. The comparison is case sensitive. The
     * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
     * exactly 1 character).
     *
     * If you specify multiple strings, the condition is satisfied if one of them matches the
     * request URL. The path pattern is compared only to the path of the URL, not to its query string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-pathpatternconfig.html#cfn-elasticloadbalancingv2-listenerrule-pathpatternconfig-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [PathPatternConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param values The path patterns to compare against the request URL.
       * The maximum size of each string is 128 characters. The comparison is case sensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of them matches the
       * request URL. The path pattern is compared only to the path of the URL, not to its query
       * string.
       */
      public fun values(values: List<String>)

      /**
       * @param values The path patterns to compare against the request URL.
       * The maximum size of each string is 128 characters. The comparison is case sensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of them matches the
       * request URL. The path pattern is compared only to the path of the URL, not to its query
       * string.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty.builder()

      /**
       * @param values The path patterns to compare against the request URL.
       * The maximum size of each string is 128 characters. The comparison is case sensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of them matches the
       * request URL. The path pattern is compared only to the path of the URL, not to its query
       * string.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The path patterns to compare against the request URL.
       * The maximum size of each string is 128 characters. The comparison is case sensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of them matches the
       * request URL. The path pattern is compared only to the path of the URL, not to its query
       * string.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty,
    ) : CdkObject(cdkObject), PathPatternConfigProperty {
      /**
       * The path patterns to compare against the request URL.
       *
       * The maximum size of each string is 128 characters. The comparison is case sensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of them matches the
       * request URL. The path pattern is compared only to the path of the URL, not to its query
       * string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-pathpatternconfig.html#cfn-elasticloadbalancingv2-listenerrule-pathpatternconfig-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathPatternConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty):
          PathPatternConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathPatternConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.PathPatternConfigProperty
    }
  }

  public interface TargetGroupStickinessConfigProperty {
    /**
     * The time period, in seconds, during which requests from a client should be routed to the same
     * target group.
     *
     * The range is 1-604800 seconds (7 days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html#cfn-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig-durationseconds)
     */
    public fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

    /**
     * Indicates whether target group stickiness is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html#cfn-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [TargetGroupStickinessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param durationSeconds The time period, in seconds, during which requests from a client
       * should be routed to the same target group.
       * The range is 1-604800 seconds (7 days).
       */
      public fun durationSeconds(durationSeconds: Number)

      /**
       * @param enabled Indicates whether target group stickiness is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether target group stickiness is enabled.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty.builder()

      /**
       * @param durationSeconds The time period, in seconds, during which requests from a client
       * should be routed to the same target group.
       * The range is 1-604800 seconds (7 days).
       */
      override fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
      }

      /**
       * @param enabled Indicates whether target group stickiness is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether target group stickiness is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty,
    ) : CdkObject(cdkObject), TargetGroupStickinessConfigProperty {
      /**
       * The time period, in seconds, during which requests from a client should be routed to the
       * same target group.
       *
       * The range is 1-604800 seconds (7 days).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html#cfn-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig-durationseconds)
       */
      override fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

      /**
       * Indicates whether target group stickiness is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig.html#cfn-elasticloadbalancingv2-listenerrule-targetgroupstickinessconfig-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetGroupStickinessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty):
          TargetGroupStickinessConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupStickinessConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupStickinessConfigProperty
    }
  }

  public interface TargetGroupTupleProperty {
    /**
     * The Amazon Resource Name (ARN) of the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgrouptuple.html#cfn-elasticloadbalancingv2-listenerrule-targetgrouptuple-targetgrouparn)
     */
    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    /**
     * The weight.
     *
     * The range is 0 to 999.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgrouptuple.html#cfn-elasticloadbalancingv2-listenerrule-targetgrouptuple-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [TargetGroupTupleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetGroupArn The Amazon Resource Name (ARN) of the target group.
       */
      public fun targetGroupArn(targetGroupArn: String)

      /**
       * @param weight The weight.
       * The range is 0 to 999.
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty.builder()

      /**
       * @param targetGroupArn The Amazon Resource Name (ARN) of the target group.
       */
      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      /**
       * @param weight The weight.
       * The range is 0 to 999.
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty,
    ) : CdkObject(cdkObject), TargetGroupTupleProperty {
      /**
       * The Amazon Resource Name (ARN) of the target group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgrouptuple.html#cfn-elasticloadbalancingv2-listenerrule-targetgrouptuple-targetgrouparn)
       */
      override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

      /**
       * The weight.
       *
       * The range is 0 to 999.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-targetgrouptuple.html#cfn-elasticloadbalancingv2-listenerrule-targetgrouptuple-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty):
          TargetGroupTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupTupleProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.TargetGroupTupleProperty
    }
  }

  public interface RuleConditionProperty {
    /**
     * The field in the HTTP request. The following are the possible values:.
     *
     * * `http-header`
     * * `http-request-method`
     * * `host-header`
     * * `path-pattern`
     * * `query-string`
     * * `source-ip`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * Information for a host header condition.
     *
     * Specify only when `Field` is `host-header` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-hostheaderconfig)
     */
    public fun hostHeaderConfig(): Any? = unwrap(this).getHostHeaderConfig()

    /**
     * Information for an HTTP header condition.
     *
     * Specify only when `Field` is `http-header` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-httpheaderconfig)
     */
    public fun httpHeaderConfig(): Any? = unwrap(this).getHttpHeaderConfig()

    /**
     * Information for an HTTP method condition.
     *
     * Specify only when `Field` is `http-request-method` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-httprequestmethodconfig)
     */
    public fun httpRequestMethodConfig(): Any? = unwrap(this).getHttpRequestMethodConfig()

    /**
     * Information for a path pattern condition.
     *
     * Specify only when `Field` is `path-pattern` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-pathpatternconfig)
     */
    public fun pathPatternConfig(): Any? = unwrap(this).getPathPatternConfig()

    /**
     * Information for a query string condition.
     *
     * Specify only when `Field` is `query-string` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-querystringconfig)
     */
    public fun queryStringConfig(): Any? = unwrap(this).getQueryStringConfig()

    /**
     * Information for a source IP condition.
     *
     * Specify only when `Field` is `source-ip` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-sourceipconfig)
     */
    public fun sourceIpConfig(): Any? = unwrap(this).getSourceIpConfig()

    /**
     * The condition value.
     *
     * Specify only when `Field` is `host-header` or `path-pattern` . Alternatively, to specify
     * multiple host names or multiple path patterns, use `HostHeaderConfig` or `PathPatternConfig` .
     *
     * If `Field` is `host-header` and you're not using `HostHeaderConfig` , you can specify a
     * single host name (for example, my.example.com). A host name is case insensitive, can be up to
     * 128 characters in length, and can contain any of the following characters.
     *
     * * A-Z, a-z, 0-9
     * * 
     * * .
     *
     * * 
     * * (matches 0 or more characters)
     *
     * * ? (matches exactly 1 character)
     *
     * If `Field` is `path-pattern` and you're not using `PathPatternConfig` , you can specify a
     * single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128
     * characters in length, and can contain any of the following characters.
     *
     * * A-Z, a-z, 0-9
     * * _ - . $ / ~ " ' &#64; : +
     * * &amp; (using &amp;)
     * * 
     * * (matches 0 or more characters)
     *
     * * ? (matches exactly 1 character)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [RuleConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param field The field in the HTTP request. The following are the possible values:.
       * * `http-header`
       * * `http-request-method`
       * * `host-header`
       * * `path-pattern`
       * * `query-string`
       * * `source-ip`
       */
      public fun `field`(`field`: String)

      /**
       * @param hostHeaderConfig Information for a host header condition.
       * Specify only when `Field` is `host-header` .
       */
      public fun hostHeaderConfig(hostHeaderConfig: IResolvable)

      /**
       * @param hostHeaderConfig Information for a host header condition.
       * Specify only when `Field` is `host-header` .
       */
      public fun hostHeaderConfig(hostHeaderConfig: HostHeaderConfigProperty)

      /**
       * @param hostHeaderConfig Information for a host header condition.
       * Specify only when `Field` is `host-header` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a9d3934c46b2887dcd4030a8dd4f0b1ab037ccdd11c8851f6c6f5ccd31ffe8f")
      public fun hostHeaderConfig(hostHeaderConfig: HostHeaderConfigProperty.Builder.() -> Unit)

      /**
       * @param httpHeaderConfig Information for an HTTP header condition.
       * Specify only when `Field` is `http-header` .
       */
      public fun httpHeaderConfig(httpHeaderConfig: IResolvable)

      /**
       * @param httpHeaderConfig Information for an HTTP header condition.
       * Specify only when `Field` is `http-header` .
       */
      public fun httpHeaderConfig(httpHeaderConfig: HttpHeaderConfigProperty)

      /**
       * @param httpHeaderConfig Information for an HTTP header condition.
       * Specify only when `Field` is `http-header` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2654036ebad02cf3518a9cb92038f87de2a79fa02bcfc4380ea875d7ddebd5a")
      public fun httpHeaderConfig(httpHeaderConfig: HttpHeaderConfigProperty.Builder.() -> Unit)

      /**
       * @param httpRequestMethodConfig Information for an HTTP method condition.
       * Specify only when `Field` is `http-request-method` .
       */
      public fun httpRequestMethodConfig(httpRequestMethodConfig: IResolvable)

      /**
       * @param httpRequestMethodConfig Information for an HTTP method condition.
       * Specify only when `Field` is `http-request-method` .
       */
      public fun httpRequestMethodConfig(httpRequestMethodConfig: HttpRequestMethodConfigProperty)

      /**
       * @param httpRequestMethodConfig Information for an HTTP method condition.
       * Specify only when `Field` is `http-request-method` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8177321ae54582f5b62ecc7be5e4f6abd31aebf954a0265e5c5134032e60f5cf")
      public
          fun httpRequestMethodConfig(httpRequestMethodConfig: HttpRequestMethodConfigProperty.Builder.() -> Unit)

      /**
       * @param pathPatternConfig Information for a path pattern condition.
       * Specify only when `Field` is `path-pattern` .
       */
      public fun pathPatternConfig(pathPatternConfig: IResolvable)

      /**
       * @param pathPatternConfig Information for a path pattern condition.
       * Specify only when `Field` is `path-pattern` .
       */
      public fun pathPatternConfig(pathPatternConfig: PathPatternConfigProperty)

      /**
       * @param pathPatternConfig Information for a path pattern condition.
       * Specify only when `Field` is `path-pattern` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6997fe58d1b50a439136930b30ed5927e3072f0777072a081fa7612b42cdfa7b")
      public fun pathPatternConfig(pathPatternConfig: PathPatternConfigProperty.Builder.() -> Unit)

      /**
       * @param queryStringConfig Information for a query string condition.
       * Specify only when `Field` is `query-string` .
       */
      public fun queryStringConfig(queryStringConfig: IResolvable)

      /**
       * @param queryStringConfig Information for a query string condition.
       * Specify only when `Field` is `query-string` .
       */
      public fun queryStringConfig(queryStringConfig: QueryStringConfigProperty)

      /**
       * @param queryStringConfig Information for a query string condition.
       * Specify only when `Field` is `query-string` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82897a687b5ea53096160d48383110ba1c0563bf1618b31f58a2734bbb0adbd5")
      public fun queryStringConfig(queryStringConfig: QueryStringConfigProperty.Builder.() -> Unit)

      /**
       * @param sourceIpConfig Information for a source IP condition.
       * Specify only when `Field` is `source-ip` .
       */
      public fun sourceIpConfig(sourceIpConfig: IResolvable)

      /**
       * @param sourceIpConfig Information for a source IP condition.
       * Specify only when `Field` is `source-ip` .
       */
      public fun sourceIpConfig(sourceIpConfig: SourceIpConfigProperty)

      /**
       * @param sourceIpConfig Information for a source IP condition.
       * Specify only when `Field` is `source-ip` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13e80fa32ee413fe9c4c30fa4989582cb5a1b13afdd202b62beeb9614d8f5bd6")
      public fun sourceIpConfig(sourceIpConfig: SourceIpConfigProperty.Builder.() -> Unit)

      /**
       * @param values The condition value.
       * Specify only when `Field` is `host-header` or `path-pattern` . Alternatively, to specify
       * multiple host names or multiple path patterns, use `HostHeaderConfig` or `PathPatternConfig` .
       *
       * If `Field` is `host-header` and you're not using `HostHeaderConfig` , you can specify a
       * single host name (for example, my.example.com). A host name is case insensitive, can be up to
       * 128 characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * 
       * * .
       *
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       *
       * If `Field` is `path-pattern` and you're not using `PathPatternConfig` , you can specify a
       * single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128
       * characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * _ - . $ / ~ " ' &#64; : +
       * * &amp; (using &amp;)
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       */
      public fun values(values: List<String>)

      /**
       * @param values The condition value.
       * Specify only when `Field` is `host-header` or `path-pattern` . Alternatively, to specify
       * multiple host names or multiple path patterns, use `HostHeaderConfig` or `PathPatternConfig` .
       *
       * If `Field` is `host-header` and you're not using `HostHeaderConfig` , you can specify a
       * single host name (for example, my.example.com). A host name is case insensitive, can be up to
       * 128 characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * 
       * * .
       *
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       *
       * If `Field` is `path-pattern` and you're not using `PathPatternConfig` , you can specify a
       * single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128
       * characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * _ - . $ / ~ " ' &#64; : +
       * * &amp; (using &amp;)
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty.builder()

      /**
       * @param field The field in the HTTP request. The following are the possible values:.
       * * `http-header`
       * * `http-request-method`
       * * `host-header`
       * * `path-pattern`
       * * `query-string`
       * * `source-ip`
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param hostHeaderConfig Information for a host header condition.
       * Specify only when `Field` is `host-header` .
       */
      override fun hostHeaderConfig(hostHeaderConfig: IResolvable) {
        cdkBuilder.hostHeaderConfig(hostHeaderConfig.let(IResolvable::unwrap))
      }

      /**
       * @param hostHeaderConfig Information for a host header condition.
       * Specify only when `Field` is `host-header` .
       */
      override fun hostHeaderConfig(hostHeaderConfig: HostHeaderConfigProperty) {
        cdkBuilder.hostHeaderConfig(hostHeaderConfig.let(HostHeaderConfigProperty::unwrap))
      }

      /**
       * @param hostHeaderConfig Information for a host header condition.
       * Specify only when `Field` is `host-header` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a9d3934c46b2887dcd4030a8dd4f0b1ab037ccdd11c8851f6c6f5ccd31ffe8f")
      override fun hostHeaderConfig(hostHeaderConfig: HostHeaderConfigProperty.Builder.() -> Unit):
          Unit = hostHeaderConfig(HostHeaderConfigProperty(hostHeaderConfig))

      /**
       * @param httpHeaderConfig Information for an HTTP header condition.
       * Specify only when `Field` is `http-header` .
       */
      override fun httpHeaderConfig(httpHeaderConfig: IResolvable) {
        cdkBuilder.httpHeaderConfig(httpHeaderConfig.let(IResolvable::unwrap))
      }

      /**
       * @param httpHeaderConfig Information for an HTTP header condition.
       * Specify only when `Field` is `http-header` .
       */
      override fun httpHeaderConfig(httpHeaderConfig: HttpHeaderConfigProperty) {
        cdkBuilder.httpHeaderConfig(httpHeaderConfig.let(HttpHeaderConfigProperty::unwrap))
      }

      /**
       * @param httpHeaderConfig Information for an HTTP header condition.
       * Specify only when `Field` is `http-header` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2654036ebad02cf3518a9cb92038f87de2a79fa02bcfc4380ea875d7ddebd5a")
      override fun httpHeaderConfig(httpHeaderConfig: HttpHeaderConfigProperty.Builder.() -> Unit):
          Unit = httpHeaderConfig(HttpHeaderConfigProperty(httpHeaderConfig))

      /**
       * @param httpRequestMethodConfig Information for an HTTP method condition.
       * Specify only when `Field` is `http-request-method` .
       */
      override fun httpRequestMethodConfig(httpRequestMethodConfig: IResolvable) {
        cdkBuilder.httpRequestMethodConfig(httpRequestMethodConfig.let(IResolvable::unwrap))
      }

      /**
       * @param httpRequestMethodConfig Information for an HTTP method condition.
       * Specify only when `Field` is `http-request-method` .
       */
      override
          fun httpRequestMethodConfig(httpRequestMethodConfig: HttpRequestMethodConfigProperty) {
        cdkBuilder.httpRequestMethodConfig(httpRequestMethodConfig.let(HttpRequestMethodConfigProperty::unwrap))
      }

      /**
       * @param httpRequestMethodConfig Information for an HTTP method condition.
       * Specify only when `Field` is `http-request-method` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8177321ae54582f5b62ecc7be5e4f6abd31aebf954a0265e5c5134032e60f5cf")
      override
          fun httpRequestMethodConfig(httpRequestMethodConfig: HttpRequestMethodConfigProperty.Builder.() -> Unit):
          Unit = httpRequestMethodConfig(HttpRequestMethodConfigProperty(httpRequestMethodConfig))

      /**
       * @param pathPatternConfig Information for a path pattern condition.
       * Specify only when `Field` is `path-pattern` .
       */
      override fun pathPatternConfig(pathPatternConfig: IResolvable) {
        cdkBuilder.pathPatternConfig(pathPatternConfig.let(IResolvable::unwrap))
      }

      /**
       * @param pathPatternConfig Information for a path pattern condition.
       * Specify only when `Field` is `path-pattern` .
       */
      override fun pathPatternConfig(pathPatternConfig: PathPatternConfigProperty) {
        cdkBuilder.pathPatternConfig(pathPatternConfig.let(PathPatternConfigProperty::unwrap))
      }

      /**
       * @param pathPatternConfig Information for a path pattern condition.
       * Specify only when `Field` is `path-pattern` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6997fe58d1b50a439136930b30ed5927e3072f0777072a081fa7612b42cdfa7b")
      override
          fun pathPatternConfig(pathPatternConfig: PathPatternConfigProperty.Builder.() -> Unit):
          Unit = pathPatternConfig(PathPatternConfigProperty(pathPatternConfig))

      /**
       * @param queryStringConfig Information for a query string condition.
       * Specify only when `Field` is `query-string` .
       */
      override fun queryStringConfig(queryStringConfig: IResolvable) {
        cdkBuilder.queryStringConfig(queryStringConfig.let(IResolvable::unwrap))
      }

      /**
       * @param queryStringConfig Information for a query string condition.
       * Specify only when `Field` is `query-string` .
       */
      override fun queryStringConfig(queryStringConfig: QueryStringConfigProperty) {
        cdkBuilder.queryStringConfig(queryStringConfig.let(QueryStringConfigProperty::unwrap))
      }

      /**
       * @param queryStringConfig Information for a query string condition.
       * Specify only when `Field` is `query-string` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82897a687b5ea53096160d48383110ba1c0563bf1618b31f58a2734bbb0adbd5")
      override
          fun queryStringConfig(queryStringConfig: QueryStringConfigProperty.Builder.() -> Unit):
          Unit = queryStringConfig(QueryStringConfigProperty(queryStringConfig))

      /**
       * @param sourceIpConfig Information for a source IP condition.
       * Specify only when `Field` is `source-ip` .
       */
      override fun sourceIpConfig(sourceIpConfig: IResolvable) {
        cdkBuilder.sourceIpConfig(sourceIpConfig.let(IResolvable::unwrap))
      }

      /**
       * @param sourceIpConfig Information for a source IP condition.
       * Specify only when `Field` is `source-ip` .
       */
      override fun sourceIpConfig(sourceIpConfig: SourceIpConfigProperty) {
        cdkBuilder.sourceIpConfig(sourceIpConfig.let(SourceIpConfigProperty::unwrap))
      }

      /**
       * @param sourceIpConfig Information for a source IP condition.
       * Specify only when `Field` is `source-ip` .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13e80fa32ee413fe9c4c30fa4989582cb5a1b13afdd202b62beeb9614d8f5bd6")
      override fun sourceIpConfig(sourceIpConfig: SourceIpConfigProperty.Builder.() -> Unit): Unit =
          sourceIpConfig(SourceIpConfigProperty(sourceIpConfig))

      /**
       * @param values The condition value.
       * Specify only when `Field` is `host-header` or `path-pattern` . Alternatively, to specify
       * multiple host names or multiple path patterns, use `HostHeaderConfig` or `PathPatternConfig` .
       *
       * If `Field` is `host-header` and you're not using `HostHeaderConfig` , you can specify a
       * single host name (for example, my.example.com). A host name is case insensitive, can be up to
       * 128 characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * 
       * * .
       *
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       *
       * If `Field` is `path-pattern` and you're not using `PathPatternConfig` , you can specify a
       * single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128
       * characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * _ - . $ / ~ " ' &#64; : +
       * * &amp; (using &amp;)
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The condition value.
       * Specify only when `Field` is `host-header` or `path-pattern` . Alternatively, to specify
       * multiple host names or multiple path patterns, use `HostHeaderConfig` or `PathPatternConfig` .
       *
       * If `Field` is `host-header` and you're not using `HostHeaderConfig` , you can specify a
       * single host name (for example, my.example.com). A host name is case insensitive, can be up to
       * 128 characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * 
       * * .
       *
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       *
       * If `Field` is `path-pattern` and you're not using `PathPatternConfig` , you can specify a
       * single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128
       * characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * _ - . $ / ~ " ' &#64; : +
       * * &amp; (using &amp;)
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty,
    ) : CdkObject(cdkObject), RuleConditionProperty {
      /**
       * The field in the HTTP request. The following are the possible values:.
       *
       * * `http-header`
       * * `http-request-method`
       * * `host-header`
       * * `path-pattern`
       * * `query-string`
       * * `source-ip`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * Information for a host header condition.
       *
       * Specify only when `Field` is `host-header` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-hostheaderconfig)
       */
      override fun hostHeaderConfig(): Any? = unwrap(this).getHostHeaderConfig()

      /**
       * Information for an HTTP header condition.
       *
       * Specify only when `Field` is `http-header` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-httpheaderconfig)
       */
      override fun httpHeaderConfig(): Any? = unwrap(this).getHttpHeaderConfig()

      /**
       * Information for an HTTP method condition.
       *
       * Specify only when `Field` is `http-request-method` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-httprequestmethodconfig)
       */
      override fun httpRequestMethodConfig(): Any? = unwrap(this).getHttpRequestMethodConfig()

      /**
       * Information for a path pattern condition.
       *
       * Specify only when `Field` is `path-pattern` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-pathpatternconfig)
       */
      override fun pathPatternConfig(): Any? = unwrap(this).getPathPatternConfig()

      /**
       * Information for a query string condition.
       *
       * Specify only when `Field` is `query-string` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-querystringconfig)
       */
      override fun queryStringConfig(): Any? = unwrap(this).getQueryStringConfig()

      /**
       * Information for a source IP condition.
       *
       * Specify only when `Field` is `source-ip` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-sourceipconfig)
       */
      override fun sourceIpConfig(): Any? = unwrap(this).getSourceIpConfig()

      /**
       * The condition value.
       *
       * Specify only when `Field` is `host-header` or `path-pattern` . Alternatively, to specify
       * multiple host names or multiple path patterns, use `HostHeaderConfig` or `PathPatternConfig` .
       *
       * If `Field` is `host-header` and you're not using `HostHeaderConfig` , you can specify a
       * single host name (for example, my.example.com). A host name is case insensitive, can be up to
       * 128 characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * 
       * * .
       *
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       *
       * If `Field` is `path-pattern` and you're not using `PathPatternConfig` , you can specify a
       * single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128
       * characters in length, and can contain any of the following characters.
       *
       * * A-Z, a-z, 0-9
       * * _ - . $ / ~ " ' &#64; : +
       * * &amp; (using &amp;)
       * * 
       * * (matches 0 or more characters)
       *
       * * ? (matches exactly 1 character)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html#cfn-elasticloadbalancingv2-listenerrule-rulecondition-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty):
          RuleConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleConditionProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.RuleConditionProperty
    }
  }

  public interface QueryStringKeyValueProperty {
    /**
     * The key.
     *
     * You can omit the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringkeyvalue.html#cfn-elasticloadbalancingv2-listenerrule-querystringkeyvalue-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringkeyvalue.html#cfn-elasticloadbalancingv2-listenerrule-querystringkeyvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [QueryStringKeyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key.
       * You can omit the key.
       */
      public fun key(key: String)

      /**
       * @param value The value.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty.builder()

      /**
       * @param key The key.
       * You can omit the key.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty,
    ) : CdkObject(cdkObject), QueryStringKeyValueProperty {
      /**
       * The key.
       *
       * You can omit the key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringkeyvalue.html#cfn-elasticloadbalancingv2-listenerrule-querystringkeyvalue-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-querystringkeyvalue.html#cfn-elasticloadbalancingv2-listenerrule-querystringkeyvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringKeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty):
          QueryStringKeyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringKeyValueProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.QueryStringKeyValueProperty
    }
  }

  public interface HttpRequestMethodConfigProperty {
    /**
     * The name of the request method.
     *
     * The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and underscore
     * (_). The comparison is case sensitive. Wildcards are not supported; therefore, the method name
     * must be an exact match.
     *
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the
     * HTTP request method. We recommend that you route GET and HEAD requests in the same way, because
     * the response to a HEAD request may be cached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httprequestmethodconfig.html#cfn-elasticloadbalancingv2-listenerrule-httprequestmethodconfig-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [HttpRequestMethodConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param values The name of the request method.
       * The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and
       * underscore (_). The comparison is case sensitive. Wildcards are not supported; therefore, the
       * method name must be an exact match.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the HTTP request method. We recommend that you route GET and HEAD requests in the same way,
       * because the response to a HEAD request may be cached.
       */
      public fun values(values: List<String>)

      /**
       * @param values The name of the request method.
       * The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and
       * underscore (_). The comparison is case sensitive. Wildcards are not supported; therefore, the
       * method name must be an exact match.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the HTTP request method. We recommend that you route GET and HEAD requests in the same way,
       * because the response to a HEAD request may be cached.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty.builder()

      /**
       * @param values The name of the request method.
       * The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and
       * underscore (_). The comparison is case sensitive. Wildcards are not supported; therefore, the
       * method name must be an exact match.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the HTTP request method. We recommend that you route GET and HEAD requests in the same way,
       * because the response to a HEAD request may be cached.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The name of the request method.
       * The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and
       * underscore (_). The comparison is case sensitive. Wildcards are not supported; therefore, the
       * method name must be an exact match.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the HTTP request method. We recommend that you route GET and HEAD requests in the same way,
       * because the response to a HEAD request may be cached.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty,
    ) : CdkObject(cdkObject), HttpRequestMethodConfigProperty {
      /**
       * The name of the request method.
       *
       * The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and
       * underscore (_). The comparison is case sensitive. Wildcards are not supported; therefore, the
       * method name must be an exact match.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the HTTP request method. We recommend that you route GET and HEAD requests in the same way,
       * because the response to a HEAD request may be cached.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httprequestmethodconfig.html#cfn-elasticloadbalancingv2-listenerrule-httprequestmethodconfig-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpRequestMethodConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty):
          HttpRequestMethodConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpRequestMethodConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpRequestMethodConfigProperty
    }
  }

  public interface ForwardConfigProperty {
    /**
     * Information about the target group stickiness for a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html#cfn-elasticloadbalancingv2-listenerrule-forwardconfig-targetgroupstickinessconfig)
     */
    public fun targetGroupStickinessConfig(): Any? = unwrap(this).getTargetGroupStickinessConfig()

    /**
     * Information about how traffic will be distributed between multiple target groups in a forward
     * rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html#cfn-elasticloadbalancingv2-listenerrule-forwardconfig-targetgroups)
     */
    public fun targetGroups(): Any? = unwrap(this).getTargetGroups()

    /**
     * A builder for [ForwardConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetGroupStickinessConfig Information about the target group stickiness for a
       * rule.
       */
      public fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable)

      /**
       * @param targetGroupStickinessConfig Information about the target group stickiness for a
       * rule.
       */
      public
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty)

      /**
       * @param targetGroupStickinessConfig Information about the target group stickiness for a
       * rule.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8346cc062be8b2d02d334cf94fabe9c105928903dc00dd8ad5a858022fdf5d88")
      public
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty.Builder.() -> Unit)

      /**
       * @param targetGroups Information about how traffic will be distributed between multiple
       * target groups in a forward rule.
       */
      public fun targetGroups(targetGroups: IResolvable)

      /**
       * @param targetGroups Information about how traffic will be distributed between multiple
       * target groups in a forward rule.
       */
      public fun targetGroups(targetGroups: List<Any>)

      /**
       * @param targetGroups Information about how traffic will be distributed between multiple
       * target groups in a forward rule.
       */
      public fun targetGroups(vararg targetGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty.builder()

      /**
       * @param targetGroupStickinessConfig Information about the target group stickiness for a
       * rule.
       */
      override fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig.let(IResolvable::unwrap))
      }

      /**
       * @param targetGroupStickinessConfig Information about the target group stickiness for a
       * rule.
       */
      override
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig.let(TargetGroupStickinessConfigProperty::unwrap))
      }

      /**
       * @param targetGroupStickinessConfig Information about the target group stickiness for a
       * rule.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8346cc062be8b2d02d334cf94fabe9c105928903dc00dd8ad5a858022fdf5d88")
      override
          fun targetGroupStickinessConfig(targetGroupStickinessConfig: TargetGroupStickinessConfigProperty.Builder.() -> Unit):
          Unit =
          targetGroupStickinessConfig(TargetGroupStickinessConfigProperty(targetGroupStickinessConfig))

      /**
       * @param targetGroups Information about how traffic will be distributed between multiple
       * target groups in a forward rule.
       */
      override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
      }

      /**
       * @param targetGroups Information about how traffic will be distributed between multiple
       * target groups in a forward rule.
       */
      override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups)
      }

      /**
       * @param targetGroups Information about how traffic will be distributed between multiple
       * target groups in a forward rule.
       */
      override fun targetGroups(vararg targetGroups: Any): Unit =
          targetGroups(targetGroups.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty,
    ) : CdkObject(cdkObject), ForwardConfigProperty {
      /**
       * Information about the target group stickiness for a rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html#cfn-elasticloadbalancingv2-listenerrule-forwardconfig-targetgroupstickinessconfig)
       */
      override fun targetGroupStickinessConfig(): Any? =
          unwrap(this).getTargetGroupStickinessConfig()

      /**
       * Information about how traffic will be distributed between multiple target groups in a
       * forward rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html#cfn-elasticloadbalancingv2-listenerrule-forwardconfig-targetgroups)
       */
      override fun targetGroups(): Any? = unwrap(this).getTargetGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty):
          ForwardConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.ForwardConfigProperty
    }
  }

  public interface HttpHeaderConfigProperty {
    /**
     * The name of the HTTP header field.
     *
     * The maximum size is 40 characters. The header name is case insensitive. The allowed
     * characters are specified by RFC 7230. Wildcards are not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html#cfn-elasticloadbalancingv2-listenerrule-httpheaderconfig-httpheadername)
     */
    public fun httpHeaderName(): String? = unwrap(this).getHttpHeaderName()

    /**
     * The strings to compare against the value of the HTTP header.
     *
     * The maximum size of each string is 128 characters. The comparison strings are case
     * insensitive. The following wildcard characters are supported: * (matches 0 or more characters)
     * and ? (matches exactly 1 character).
     *
     * If the same header appears multiple times in the request, we search them in order until a
     * match is found.
     *
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the
     * value of the HTTP header. To require that all of the strings are a match, create one condition
     * per string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html#cfn-elasticloadbalancingv2-listenerrule-httpheaderconfig-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [HttpHeaderConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpHeaderName The name of the HTTP header field.
       * The maximum size is 40 characters. The header name is case insensitive. The allowed
       * characters are specified by RFC 7230. Wildcards are not supported.
       */
      public fun httpHeaderName(httpHeaderName: String)

      /**
       * @param values The strings to compare against the value of the HTTP header.
       * The maximum size of each string is 128 characters. The comparison strings are case
       * insensitive. The following wildcard characters are supported: * (matches 0 or more characters)
       * and ? (matches exactly 1 character).
       *
       * If the same header appears multiple times in the request, we search them in order until a
       * match is found.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the value of the HTTP header. To require that all of the strings are a match, create one
       * condition per string.
       */
      public fun values(values: List<String>)

      /**
       * @param values The strings to compare against the value of the HTTP header.
       * The maximum size of each string is 128 characters. The comparison strings are case
       * insensitive. The following wildcard characters are supported: * (matches 0 or more characters)
       * and ? (matches exactly 1 character).
       *
       * If the same header appears multiple times in the request, we search them in order until a
       * match is found.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the value of the HTTP header. To require that all of the strings are a match, create one
       * condition per string.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty.builder()

      /**
       * @param httpHeaderName The name of the HTTP header field.
       * The maximum size is 40 characters. The header name is case insensitive. The allowed
       * characters are specified by RFC 7230. Wildcards are not supported.
       */
      override fun httpHeaderName(httpHeaderName: String) {
        cdkBuilder.httpHeaderName(httpHeaderName)
      }

      /**
       * @param values The strings to compare against the value of the HTTP header.
       * The maximum size of each string is 128 characters. The comparison strings are case
       * insensitive. The following wildcard characters are supported: * (matches 0 or more characters)
       * and ? (matches exactly 1 character).
       *
       * If the same header appears multiple times in the request, we search them in order until a
       * match is found.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the value of the HTTP header. To require that all of the strings are a match, create one
       * condition per string.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The strings to compare against the value of the HTTP header.
       * The maximum size of each string is 128 characters. The comparison strings are case
       * insensitive. The following wildcard characters are supported: * (matches 0 or more characters)
       * and ? (matches exactly 1 character).
       *
       * If the same header appears multiple times in the request, we search them in order until a
       * match is found.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the value of the HTTP header. To require that all of the strings are a match, create one
       * condition per string.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty,
    ) : CdkObject(cdkObject), HttpHeaderConfigProperty {
      /**
       * The name of the HTTP header field.
       *
       * The maximum size is 40 characters. The header name is case insensitive. The allowed
       * characters are specified by RFC 7230. Wildcards are not supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html#cfn-elasticloadbalancingv2-listenerrule-httpheaderconfig-httpheadername)
       */
      override fun httpHeaderName(): String? = unwrap(this).getHttpHeaderName()

      /**
       * The strings to compare against the value of the HTTP header.
       *
       * The maximum size of each string is 128 characters. The comparison strings are case
       * insensitive. The following wildcard characters are supported: * (matches 0 or more characters)
       * and ? (matches exactly 1 character).
       *
       * If the same header appears multiple times in the request, we search them in order until a
       * match is found.
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the value of the HTTP header. To require that all of the strings are a match, create one
       * condition per string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-httpheaderconfig.html#cfn-elasticloadbalancingv2-listenerrule-httpheaderconfig-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpHeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty):
          HttpHeaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpHeaderConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HttpHeaderConfigProperty
    }
  }

  public interface AuthenticateCognitoConfigProperty {
    /**
     * The query parameters (up to 10) to include in the redirect request to the authorization
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-authenticationrequestextraparams)
     */
    public fun authenticationRequestExtraParams(): Any? =
        unwrap(this).getAuthenticationRequestExtraParams()

    /**
     * The behavior if the user is not authenticated. The following are possible values:.
     *
     * * deny `` - Return an HTTP 401 Unauthorized error.
     * * allow `` - Allow the request to be forwarded to the target.
     * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
     * default value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-onunauthenticatedrequest)
     */
    public fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

    /**
     * The set of user claims to be requested from the IdP. The default is `openid` .
     *
     * To verify which scope values your IdP supports and how to separate multiple values, see the
     * documentation for your IdP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-scope)
     */
    public fun scope(): String? = unwrap(this).getScope()

    /**
     * The name of the cookie used to maintain session information.
     *
     * The default is AWSELBAuthSessionCookie.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-sessioncookiename)
     */
    public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

    /**
     * The maximum duration of the authentication session, in seconds.
     *
     * The default is 604800 seconds (7 days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-sessiontimeout)
     */
    public fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

    /**
     * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-userpoolarn)
     */
    public fun userPoolArn(): String

    /**
     * The ID of the Amazon Cognito user pool client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-userpoolclientid)
     */
    public fun userPoolClientId(): String

    /**
     * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-userpooldomain)
     */
    public fun userPoolDomain(): String

    /**
     * A builder for [AuthenticateCognitoConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
       * redirect request to the authorization endpoint.
       */
      public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable)

      /**
       * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
       * redirect request to the authorization endpoint.
       */
      public
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>)

      /**
       * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The
       * following are possible values:.
       * * deny `` - Return an HTTP 401 Unauthorized error.
       * * allow `` - Allow the request to be forwarded to the target.
       * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
       * default value.
       */
      public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String)

      /**
       * @param scope The set of user claims to be requested from the IdP. The default is `openid` .
       * To verify which scope values your IdP supports and how to separate multiple values, see the
       * documentation for your IdP.
       */
      public fun scope(scope: String)

      /**
       * @param sessionCookieName The name of the cookie used to maintain session information.
       * The default is AWSELBAuthSessionCookie.
       */
      public fun sessionCookieName(sessionCookieName: String)

      /**
       * @param sessionTimeout The maximum duration of the authentication session, in seconds.
       * The default is 604800 seconds (7 days).
       */
      public fun sessionTimeout(sessionTimeout: Number)

      /**
       * @param userPoolArn The Amazon Resource Name (ARN) of the Amazon Cognito user pool. 
       */
      public fun userPoolArn(userPoolArn: String)

      /**
       * @param userPoolClientId The ID of the Amazon Cognito user pool client. 
       */
      public fun userPoolClientId(userPoolClientId: String)

      /**
       * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon
       * Cognito user pool. 
       */
      public fun userPoolDomain(userPoolDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty.builder()

      /**
       * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
       * redirect request to the authorization endpoint.
       */
      override fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams.let(IResolvable::unwrap))
      }

      /**
       * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
       * redirect request to the authorization endpoint.
       */
      override
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
      }

      /**
       * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The
       * following are possible values:.
       * * deny `` - Return an HTTP 401 Unauthorized error.
       * * allow `` - Allow the request to be forwarded to the target.
       * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
       * default value.
       */
      override fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
        cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
      }

      /**
       * @param scope The set of user claims to be requested from the IdP. The default is `openid` .
       * To verify which scope values your IdP supports and how to separate multiple values, see the
       * documentation for your IdP.
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      /**
       * @param sessionCookieName The name of the cookie used to maintain session information.
       * The default is AWSELBAuthSessionCookie.
       */
      override fun sessionCookieName(sessionCookieName: String) {
        cdkBuilder.sessionCookieName(sessionCookieName)
      }

      /**
       * @param sessionTimeout The maximum duration of the authentication session, in seconds.
       * The default is 604800 seconds (7 days).
       */
      override fun sessionTimeout(sessionTimeout: Number) {
        cdkBuilder.sessionTimeout(sessionTimeout)
      }

      /**
       * @param userPoolArn The Amazon Resource Name (ARN) of the Amazon Cognito user pool. 
       */
      override fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
      }

      /**
       * @param userPoolClientId The ID of the Amazon Cognito user pool client. 
       */
      override fun userPoolClientId(userPoolClientId: String) {
        cdkBuilder.userPoolClientId(userPoolClientId)
      }

      /**
       * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon
       * Cognito user pool. 
       */
      override fun userPoolDomain(userPoolDomain: String) {
        cdkBuilder.userPoolDomain(userPoolDomain)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty,
    ) : CdkObject(cdkObject), AuthenticateCognitoConfigProperty {
      /**
       * The query parameters (up to 10) to include in the redirect request to the authorization
       * endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-authenticationrequestextraparams)
       */
      override fun authenticationRequestExtraParams(): Any? =
          unwrap(this).getAuthenticationRequestExtraParams()

      /**
       * The behavior if the user is not authenticated. The following are possible values:.
       *
       * * deny `` - Return an HTTP 401 Unauthorized error.
       * * allow `` - Allow the request to be forwarded to the target.
       * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
       * default value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-onunauthenticatedrequest)
       */
      override fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

      /**
       * The set of user claims to be requested from the IdP. The default is `openid` .
       *
       * To verify which scope values your IdP supports and how to separate multiple values, see the
       * documentation for your IdP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-scope)
       */
      override fun scope(): String? = unwrap(this).getScope()

      /**
       * The name of the cookie used to maintain session information.
       *
       * The default is AWSELBAuthSessionCookie.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-sessioncookiename)
       */
      override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

      /**
       * The maximum duration of the authentication session, in seconds.
       *
       * The default is 604800 seconds (7 days).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-sessiontimeout)
       */
      override fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

      /**
       * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-userpoolarn)
       */
      override fun userPoolArn(): String = unwrap(this).getUserPoolArn()

      /**
       * The ID of the Amazon Cognito user pool client.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-userpoolclientid)
       */
      override fun userPoolClientId(): String = unwrap(this).getUserPoolClientId()

      /**
       * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticatecognitoconfig-userpooldomain)
       */
      override fun userPoolDomain(): String = unwrap(this).getUserPoolDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticateCognitoConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty):
          AuthenticateCognitoConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticateCognitoConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateCognitoConfigProperty
    }
  }

  public interface HostHeaderConfigProperty {
    /**
     * The host names.
     *
     * The maximum size of each name is 128 characters. The comparison is case insensitive. The
     * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
     * exactly 1 character).
     *
     * If you specify multiple strings, the condition is satisfied if one of the strings matches the
     * host name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-hostheaderconfig.html#cfn-elasticloadbalancingv2-listenerrule-hostheaderconfig-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [HostHeaderConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param values The host names.
       * The maximum size of each name is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the host name.
       */
      public fun values(values: List<String>)

      /**
       * @param values The host names.
       * The maximum size of each name is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the host name.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty.builder()

      /**
       * @param values The host names.
       * The maximum size of each name is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the host name.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The host names.
       * The maximum size of each name is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the host name.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty,
    ) : CdkObject(cdkObject), HostHeaderConfigProperty {
      /**
       * The host names.
       *
       * The maximum size of each name is 128 characters. The comparison is case insensitive. The
       * following wildcard characters are supported: * (matches 0 or more characters) and ? (matches
       * exactly 1 character).
       *
       * If you specify multiple strings, the condition is satisfied if one of the strings matches
       * the host name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-hostheaderconfig.html#cfn-elasticloadbalancingv2-listenerrule-hostheaderconfig-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostHeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty):
          HostHeaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostHeaderConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.HostHeaderConfigProperty
    }
  }

  public interface SourceIpConfigProperty {
    /**
     * The source IP addresses, in CIDR format. You can use both IPv4 and IPv6 addresses. Wildcards
     * are not supported.
     *
     * If you specify multiple addresses, the condition is satisfied if the source IP address of the
     * request matches one of the CIDR blocks. This condition is not satisfied by the addresses in the
     * X-Forwarded-For header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-sourceipconfig.html#cfn-elasticloadbalancingv2-listenerrule-sourceipconfig-values)
     */
    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    /**
     * A builder for [SourceIpConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param values The source IP addresses, in CIDR format. You can use both IPv4 and IPv6
       * addresses. Wildcards are not supported.
       * If you specify multiple addresses, the condition is satisfied if the source IP address of
       * the request matches one of the CIDR blocks. This condition is not satisfied by the addresses
       * in the X-Forwarded-For header.
       */
      public fun values(values: List<String>)

      /**
       * @param values The source IP addresses, in CIDR format. You can use both IPv4 and IPv6
       * addresses. Wildcards are not supported.
       * If you specify multiple addresses, the condition is satisfied if the source IP address of
       * the request matches one of the CIDR blocks. This condition is not satisfied by the addresses
       * in the X-Forwarded-For header.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty.builder()

      /**
       * @param values The source IP addresses, in CIDR format. You can use both IPv4 and IPv6
       * addresses. Wildcards are not supported.
       * If you specify multiple addresses, the condition is satisfied if the source IP address of
       * the request matches one of the CIDR blocks. This condition is not satisfied by the addresses
       * in the X-Forwarded-For header.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The source IP addresses, in CIDR format. You can use both IPv4 and IPv6
       * addresses. Wildcards are not supported.
       * If you specify multiple addresses, the condition is satisfied if the source IP address of
       * the request matches one of the CIDR blocks. This condition is not satisfied by the addresses
       * in the X-Forwarded-For header.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty,
    ) : CdkObject(cdkObject), SourceIpConfigProperty {
      /**
       * The source IP addresses, in CIDR format. You can use both IPv4 and IPv6 addresses.
       * Wildcards are not supported.
       *
       * If you specify multiple addresses, the condition is satisfied if the source IP address of
       * the request matches one of the CIDR blocks. This condition is not satisfied by the addresses
       * in the X-Forwarded-For header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-sourceipconfig.html#cfn-elasticloadbalancingv2-listenerrule-sourceipconfig-values)
       */
      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceIpConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty):
          SourceIpConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceIpConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.SourceIpConfigProperty
    }
  }

  public interface AuthenticateOidcConfigProperty {
    /**
     * The query parameters (up to 10) to include in the redirect request to the authorization
     * endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-authenticationrequestextraparams)
     */
    public fun authenticationRequestExtraParams(): Any? =
        unwrap(this).getAuthenticationRequestExtraParams()

    /**
     * The authorization endpoint of the IdP.
     *
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-authorizationendpoint)
     */
    public fun authorizationEndpoint(): String

    /**
     * The OAuth 2.0 client identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-clientid)
     */
    public fun clientId(): String

    /**
     * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you
     * are modifying a rule, you can omit this parameter if you set `UseExistingClientSecret` to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-clientsecret)
     */
    public fun clientSecret(): String? = unwrap(this).getClientSecret()

    /**
     * The OIDC issuer identifier of the IdP.
     *
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-issuer)
     */
    public fun issuer(): String

    /**
     * The behavior if the user is not authenticated. The following are possible values:.
     *
     * * deny `` - Return an HTTP 401 Unauthorized error.
     * * allow `` - Allow the request to be forwarded to the target.
     * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
     * default value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-onunauthenticatedrequest)
     */
    public fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

    /**
     * The set of user claims to be requested from the IdP. The default is `openid` .
     *
     * To verify which scope values your IdP supports and how to separate multiple values, see the
     * documentation for your IdP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-scope)
     */
    public fun scope(): String? = unwrap(this).getScope()

    /**
     * The name of the cookie used to maintain session information.
     *
     * The default is AWSELBAuthSessionCookie.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-sessioncookiename)
     */
    public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

    /**
     * The maximum duration of the authentication session, in seconds.
     *
     * The default is 604800 seconds (7 days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-sessiontimeout)
     */
    public fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

    /**
     * The token endpoint of the IdP.
     *
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-tokenendpoint)
     */
    public fun tokenEndpoint(): String

    /**
     * Indicates whether to use the existing client secret when modifying a rule.
     *
     * If you are creating a rule, you can omit this parameter or set it to false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-useexistingclientsecret)
     */
    public fun useExistingClientSecret(): Any? = unwrap(this).getUseExistingClientSecret()

    /**
     * The user info endpoint of the IdP.
     *
     * This must be a full URL, including the HTTPS protocol, the domain, and the path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-userinfoendpoint)
     */
    public fun userInfoEndpoint(): String

    /**
     * A builder for [AuthenticateOidcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
       * redirect request to the authorization endpoint.
       */
      public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable)

      /**
       * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
       * redirect request to the authorization endpoint.
       */
      public
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>)

      /**
       * @param authorizationEndpoint The authorization endpoint of the IdP. 
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       */
      public fun authorizationEndpoint(authorizationEndpoint: String)

      /**
       * @param clientId The OAuth 2.0 client identifier. 
       */
      public fun clientId(clientId: String)

      /**
       * @param clientSecret The OAuth 2.0 client secret. This parameter is required if you are
       * creating a rule. If you are modifying a rule, you can omit this parameter if you set
       * `UseExistingClientSecret` to true.
       */
      public fun clientSecret(clientSecret: String)

      /**
       * @param issuer The OIDC issuer identifier of the IdP. 
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       */
      public fun issuer(issuer: String)

      /**
       * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The
       * following are possible values:.
       * * deny `` - Return an HTTP 401 Unauthorized error.
       * * allow `` - Allow the request to be forwarded to the target.
       * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
       * default value.
       */
      public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String)

      /**
       * @param scope The set of user claims to be requested from the IdP. The default is `openid` .
       * To verify which scope values your IdP supports and how to separate multiple values, see the
       * documentation for your IdP.
       */
      public fun scope(scope: String)

      /**
       * @param sessionCookieName The name of the cookie used to maintain session information.
       * The default is AWSELBAuthSessionCookie.
       */
      public fun sessionCookieName(sessionCookieName: String)

      /**
       * @param sessionTimeout The maximum duration of the authentication session, in seconds.
       * The default is 604800 seconds (7 days).
       */
      public fun sessionTimeout(sessionTimeout: Number)

      /**
       * @param tokenEndpoint The token endpoint of the IdP. 
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       */
      public fun tokenEndpoint(tokenEndpoint: String)

      /**
       * @param useExistingClientSecret Indicates whether to use the existing client secret when
       * modifying a rule.
       * If you are creating a rule, you can omit this parameter or set it to false.
       */
      public fun useExistingClientSecret(useExistingClientSecret: Boolean)

      /**
       * @param useExistingClientSecret Indicates whether to use the existing client secret when
       * modifying a rule.
       * If you are creating a rule, you can omit this parameter or set it to false.
       */
      public fun useExistingClientSecret(useExistingClientSecret: IResolvable)

      /**
       * @param userInfoEndpoint The user info endpoint of the IdP. 
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       */
      public fun userInfoEndpoint(userInfoEndpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty.builder()

      /**
       * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
       * redirect request to the authorization endpoint.
       */
      override fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams.let(IResolvable::unwrap))
      }

      /**
       * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
       * redirect request to the authorization endpoint.
       */
      override
          fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
        cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
      }

      /**
       * @param authorizationEndpoint The authorization endpoint of the IdP. 
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       */
      override fun authorizationEndpoint(authorizationEndpoint: String) {
        cdkBuilder.authorizationEndpoint(authorizationEndpoint)
      }

      /**
       * @param clientId The OAuth 2.0 client identifier. 
       */
      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      /**
       * @param clientSecret The OAuth 2.0 client secret. This parameter is required if you are
       * creating a rule. If you are modifying a rule, you can omit this parameter if you set
       * `UseExistingClientSecret` to true.
       */
      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      /**
       * @param issuer The OIDC issuer identifier of the IdP. 
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       */
      override fun issuer(issuer: String) {
        cdkBuilder.issuer(issuer)
      }

      /**
       * @param onUnauthenticatedRequest The behavior if the user is not authenticated. The
       * following are possible values:.
       * * deny `` - Return an HTTP 401 Unauthorized error.
       * * allow `` - Allow the request to be forwarded to the target.
       * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
       * default value.
       */
      override fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
        cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
      }

      /**
       * @param scope The set of user claims to be requested from the IdP. The default is `openid` .
       * To verify which scope values your IdP supports and how to separate multiple values, see the
       * documentation for your IdP.
       */
      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      /**
       * @param sessionCookieName The name of the cookie used to maintain session information.
       * The default is AWSELBAuthSessionCookie.
       */
      override fun sessionCookieName(sessionCookieName: String) {
        cdkBuilder.sessionCookieName(sessionCookieName)
      }

      /**
       * @param sessionTimeout The maximum duration of the authentication session, in seconds.
       * The default is 604800 seconds (7 days).
       */
      override fun sessionTimeout(sessionTimeout: Number) {
        cdkBuilder.sessionTimeout(sessionTimeout)
      }

      /**
       * @param tokenEndpoint The token endpoint of the IdP. 
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       */
      override fun tokenEndpoint(tokenEndpoint: String) {
        cdkBuilder.tokenEndpoint(tokenEndpoint)
      }

      /**
       * @param useExistingClientSecret Indicates whether to use the existing client secret when
       * modifying a rule.
       * If you are creating a rule, you can omit this parameter or set it to false.
       */
      override fun useExistingClientSecret(useExistingClientSecret: Boolean) {
        cdkBuilder.useExistingClientSecret(useExistingClientSecret)
      }

      /**
       * @param useExistingClientSecret Indicates whether to use the existing client secret when
       * modifying a rule.
       * If you are creating a rule, you can omit this parameter or set it to false.
       */
      override fun useExistingClientSecret(useExistingClientSecret: IResolvable) {
        cdkBuilder.useExistingClientSecret(useExistingClientSecret.let(IResolvable::unwrap))
      }

      /**
       * @param userInfoEndpoint The user info endpoint of the IdP. 
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       */
      override fun userInfoEndpoint(userInfoEndpoint: String) {
        cdkBuilder.userInfoEndpoint(userInfoEndpoint)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty,
    ) : CdkObject(cdkObject), AuthenticateOidcConfigProperty {
      /**
       * The query parameters (up to 10) to include in the redirect request to the authorization
       * endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-authenticationrequestextraparams)
       */
      override fun authenticationRequestExtraParams(): Any? =
          unwrap(this).getAuthenticationRequestExtraParams()

      /**
       * The authorization endpoint of the IdP.
       *
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-authorizationendpoint)
       */
      override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

      /**
       * The OAuth 2.0 client identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-clientid)
       */
      override fun clientId(): String = unwrap(this).getClientId()

      /**
       * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you
       * are modifying a rule, you can omit this parameter if you set `UseExistingClientSecret` to
       * true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-clientsecret)
       */
      override fun clientSecret(): String? = unwrap(this).getClientSecret()

      /**
       * The OIDC issuer identifier of the IdP.
       *
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-issuer)
       */
      override fun issuer(): String = unwrap(this).getIssuer()

      /**
       * The behavior if the user is not authenticated. The following are possible values:.
       *
       * * deny `` - Return an HTTP 401 Unauthorized error.
       * * allow `` - Allow the request to be forwarded to the target.
       * * authenticate `` - Redirect the request to the IdP authorization endpoint. This is the
       * default value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-onunauthenticatedrequest)
       */
      override fun onUnauthenticatedRequest(): String? = unwrap(this).getOnUnauthenticatedRequest()

      /**
       * The set of user claims to be requested from the IdP. The default is `openid` .
       *
       * To verify which scope values your IdP supports and how to separate multiple values, see the
       * documentation for your IdP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-scope)
       */
      override fun scope(): String? = unwrap(this).getScope()

      /**
       * The name of the cookie used to maintain session information.
       *
       * The default is AWSELBAuthSessionCookie.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-sessioncookiename)
       */
      override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

      /**
       * The maximum duration of the authentication session, in seconds.
       *
       * The default is 604800 seconds (7 days).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-sessiontimeout)
       */
      override fun sessionTimeout(): Number? = unwrap(this).getSessionTimeout()

      /**
       * The token endpoint of the IdP.
       *
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-tokenendpoint)
       */
      override fun tokenEndpoint(): String = unwrap(this).getTokenEndpoint()

      /**
       * Indicates whether to use the existing client secret when modifying a rule.
       *
       * If you are creating a rule, you can omit this parameter or set it to false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-useexistingclientsecret)
       */
      override fun useExistingClientSecret(): Any? = unwrap(this).getUseExistingClientSecret()

      /**
       * The user info endpoint of the IdP.
       *
       * This must be a full URL, including the HTTPS protocol, the domain, and the path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-authenticateoidcconfig.html#cfn-elasticloadbalancingv2-listenerrule-authenticateoidcconfig-userinfoendpoint)
       */
      override fun userInfoEndpoint(): String = unwrap(this).getUserInfoEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateOidcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty):
          AuthenticateOidcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticateOidcConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.AuthenticateOidcConfigProperty
    }
  }

  public interface FixedResponseConfigProperty {
    /**
     * The content type.
     *
     * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listenerrule-fixedresponseconfig-contenttype)
     */
    public fun contentType(): String? = unwrap(this).getContentType()

    /**
     * The message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listenerrule-fixedresponseconfig-messagebody)
     */
    public fun messageBody(): String? = unwrap(this).getMessageBody()

    /**
     * The HTTP response code (2XX, 4XX, or 5XX).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listenerrule-fixedresponseconfig-statuscode)
     */
    public fun statusCode(): String

    /**
     * A builder for [FixedResponseConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentType The content type.
       * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
       */
      public fun contentType(contentType: String)

      /**
       * @param messageBody The message.
       */
      public fun messageBody(messageBody: String)

      /**
       * @param statusCode The HTTP response code (2XX, 4XX, or 5XX). 
       */
      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty.builder()

      /**
       * @param contentType The content type.
       * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      /**
       * @param messageBody The message.
       */
      override fun messageBody(messageBody: String) {
        cdkBuilder.messageBody(messageBody)
      }

      /**
       * @param statusCode The HTTP response code (2XX, 4XX, or 5XX). 
       */
      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty,
    ) : CdkObject(cdkObject), FixedResponseConfigProperty {
      /**
       * The content type.
       *
       * Valid Values: text/plain | text/css | text/html | application/javascript | application/json
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listenerrule-fixedresponseconfig-contenttype)
       */
      override fun contentType(): String? = unwrap(this).getContentType()

      /**
       * The message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listenerrule-fixedresponseconfig-messagebody)
       */
      override fun messageBody(): String? = unwrap(this).getMessageBody()

      /**
       * The HTTP response code (2XX, 4XX, or 5XX).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-fixedresponseconfig.html#cfn-elasticloadbalancingv2-listenerrule-fixedresponseconfig-statuscode)
       */
      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty):
          FixedResponseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FixedResponseConfigProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.FixedResponseConfigProperty
    }
  }
}
