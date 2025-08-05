@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a routing rule.
 *
 * When the incoming request to a domain name matches the conditions for a rule, API Gateway invokes
 * a stage of a target API. Supported only for REST APIs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * CfnRoutingRule cfnRoutingRule = CfnRoutingRule.Builder.create(this, "MyCfnRoutingRule")
 * .actions(List.of(ActionProperty.builder()
 * .invokeApi(ActionInvokeApiProperty.builder()
 * .apiId("apiId")
 * .stage("stage")
 * // the properties below are optional
 * .stripBasePath(false)
 * .build())
 * .build()))
 * .conditions(List.of(ConditionProperty.builder()
 * .matchBasePaths(MatchBasePathsProperty.builder()
 * .anyOf(List.of("anyOf"))
 * .build())
 * .matchHeaders(MatchHeadersProperty.builder()
 * .anyOf(List.of(MatchHeaderValueProperty.builder()
 * .header("header")
 * .valueGlob("valueGlob")
 * .build()))
 * .build())
 * .build()))
 * .domainNameArn("domainNameArn")
 * .priority(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html)
 */
public open class CfnRoutingRule(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRoutingRuleProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRoutingRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRoutingRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRoutingRuleProps(props)
  )

  /**
   * The resulting action based on matching a routing rules condition.
   */
  public open fun actions(): Any = unwrap(this).getActions()

  /**
   * The resulting action based on matching a routing rules condition.
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The resulting action based on matching a routing rules condition.
   */
  public open fun actions(`value`: List<Any>) {
    unwrap(this).setActions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The resulting action based on matching a routing rules condition.
   */
  public open fun actions(vararg `value`: Any): Unit = actions(`value`.toList())

  /**
   * Represents an Amazon Resource Name (ARN).
   */
  public open fun attrRoutingRuleArn(): String = unwrap(this).getAttrRoutingRuleArn()

  /**
   * The identifier.
   */
  public open fun attrRoutingRuleId(): String = unwrap(this).getAttrRoutingRuleId()

  /**
   * The conditions of the routing rule.
   */
  public open fun conditions(): Any = unwrap(this).getConditions()

  /**
   * The conditions of the routing rule.
   */
  public open fun conditions(`value`: IResolvable) {
    unwrap(this).setConditions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The conditions of the routing rule.
   */
  public open fun conditions(`value`: List<Any>) {
    unwrap(this).setConditions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The conditions of the routing rule.
   */
  public open fun conditions(vararg `value`: Any): Unit = conditions(`value`.toList())

  /**
   * The ARN of the domain name.
   */
  public open fun domainNameArn(): String = unwrap(this).getDomainNameArn()

  /**
   * The ARN of the domain name.
   */
  public open fun domainNameArn(`value`: String) {
    unwrap(this).setDomainNameArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The order in which API Gateway evaluates a rule.
   */
  public open fun priority(): Number = unwrap(this).getPriority()

  /**
   * The order in which API Gateway evaluates a rule.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnRoutingRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The resulting action based on matching a routing rules condition.
     *
     * Only InvokeApi is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-actions)
     * @param actions The resulting action based on matching a routing rules condition. 
     */
    public fun actions(actions: IResolvable)

    /**
     * The resulting action based on matching a routing rules condition.
     *
     * Only InvokeApi is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-actions)
     * @param actions The resulting action based on matching a routing rules condition. 
     */
    public fun actions(actions: List<Any>)

    /**
     * The resulting action based on matching a routing rules condition.
     *
     * Only InvokeApi is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-actions)
     * @param actions The resulting action based on matching a routing rules condition. 
     */
    public fun actions(vararg actions: Any)

    /**
     * The conditions of the routing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-conditions)
     * @param conditions The conditions of the routing rule. 
     */
    public fun conditions(conditions: IResolvable)

    /**
     * The conditions of the routing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-conditions)
     * @param conditions The conditions of the routing rule. 
     */
    public fun conditions(conditions: List<Any>)

    /**
     * The conditions of the routing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-conditions)
     * @param conditions The conditions of the routing rule. 
     */
    public fun conditions(vararg conditions: Any)

    /**
     * The ARN of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-domainnamearn)
     * @param domainNameArn The ARN of the domain name. 
     */
    public fun domainNameArn(domainNameArn: String)

    /**
     * The order in which API Gateway evaluates a rule.
     *
     * Priority is evaluated from the lowest value to the highest value. Rules can't have the same
     * priority. Priority values 1-1,000,000 are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-priority)
     * @param priority The order in which API Gateway evaluates a rule. 
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.Builder.create(scope, id)

    /**
     * The resulting action based on matching a routing rules condition.
     *
     * Only InvokeApi is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-actions)
     * @param actions The resulting action based on matching a routing rules condition. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The resulting action based on matching a routing rules condition.
     *
     * Only InvokeApi is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-actions)
     * @param actions The resulting action based on matching a routing rules condition. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The resulting action based on matching a routing rules condition.
     *
     * Only InvokeApi is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-actions)
     * @param actions The resulting action based on matching a routing rules condition. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * The conditions of the routing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-conditions)
     * @param conditions The conditions of the routing rule. 
     */
    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The conditions of the routing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-conditions)
     * @param conditions The conditions of the routing rule. 
     */
    override fun conditions(conditions: List<Any>) {
      cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The conditions of the routing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-conditions)
     * @param conditions The conditions of the routing rule. 
     */
    override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

    /**
     * The ARN of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-domainnamearn)
     * @param domainNameArn The ARN of the domain name. 
     */
    override fun domainNameArn(domainNameArn: String) {
      cdkBuilder.domainNameArn(domainNameArn)
    }

    /**
     * The order in which API Gateway evaluates a rule.
     *
     * Priority is evaluated from the lowest value to the highest value. Rules can't have the same
     * priority. Priority values 1-1,000,000 are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-priority)
     * @param priority The order in which API Gateway evaluates a rule. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoutingRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoutingRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule):
        CfnRoutingRule = CfnRoutingRule(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingRule):
        software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule
  }

  /**
   * Represents an InvokeApi action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * ActionInvokeApiProperty actionInvokeApiProperty = ActionInvokeApiProperty.builder()
   * .apiId("apiId")
   * .stage("stage")
   * // the properties below are optional
   * .stripBasePath(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-actioninvokeapi.html)
   */
  public interface ActionInvokeApiProperty {
    /**
     * The API identifier of the target API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-actioninvokeapi.html#cfn-apigatewayv2-routingrule-actioninvokeapi-apiid)
     */
    public fun apiId(): String

    /**
     * The name of the target stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-actioninvokeapi.html#cfn-apigatewayv2-routingrule-actioninvokeapi-stage)
     */
    public fun stage(): String

    /**
     * The strip base path setting.
     *
     * When true, API Gateway strips the incoming matched base path when forwarding the request to
     * the target API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-actioninvokeapi.html#cfn-apigatewayv2-routingrule-actioninvokeapi-stripbasepath)
     */
    public fun stripBasePath(): Any? = unwrap(this).getStripBasePath()

    /**
     * A builder for [ActionInvokeApiProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiId The API identifier of the target API. 
       */
      public fun apiId(apiId: String)

      /**
       * @param stage The name of the target stage. 
       */
      public fun stage(stage: String)

      /**
       * @param stripBasePath The strip base path setting.
       * When true, API Gateway strips the incoming matched base path when forwarding the request to
       * the target API.
       */
      public fun stripBasePath(stripBasePath: Boolean)

      /**
       * @param stripBasePath The strip base path setting.
       * When true, API Gateway strips the incoming matched base path when forwarding the request to
       * the target API.
       */
      public fun stripBasePath(stripBasePath: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionInvokeApiProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionInvokeApiProperty.builder()

      /**
       * @param apiId The API identifier of the target API. 
       */
      override fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
      }

      /**
       * @param stage The name of the target stage. 
       */
      override fun stage(stage: String) {
        cdkBuilder.stage(stage)
      }

      /**
       * @param stripBasePath The strip base path setting.
       * When true, API Gateway strips the incoming matched base path when forwarding the request to
       * the target API.
       */
      override fun stripBasePath(stripBasePath: Boolean) {
        cdkBuilder.stripBasePath(stripBasePath)
      }

      /**
       * @param stripBasePath The strip base path setting.
       * When true, API Gateway strips the incoming matched base path when forwarding the request to
       * the target API.
       */
      override fun stripBasePath(stripBasePath: IResolvable) {
        cdkBuilder.stripBasePath(stripBasePath.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionInvokeApiProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionInvokeApiProperty,
    ) : CdkObject(cdkObject),
        ActionInvokeApiProperty {
      /**
       * The API identifier of the target API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-actioninvokeapi.html#cfn-apigatewayv2-routingrule-actioninvokeapi-apiid)
       */
      override fun apiId(): String = unwrap(this).getApiId()

      /**
       * The name of the target stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-actioninvokeapi.html#cfn-apigatewayv2-routingrule-actioninvokeapi-stage)
       */
      override fun stage(): String = unwrap(this).getStage()

      /**
       * The strip base path setting.
       *
       * When true, API Gateway strips the incoming matched base path when forwarding the request to
       * the target API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-actioninvokeapi.html#cfn-apigatewayv2-routingrule-actioninvokeapi-stripbasepath)
       */
      override fun stripBasePath(): Any? = unwrap(this).getStripBasePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionInvokeApiProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionInvokeApiProperty):
          ActionInvokeApiProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionInvokeApiProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionInvokeApiProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionInvokeApiProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionInvokeApiProperty
    }
  }

  /**
   * Represents a routing rule action.
   *
   * The only supported action is `invokeApi` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .invokeApi(ActionInvokeApiProperty.builder()
   * .apiId("apiId")
   * .stage("stage")
   * // the properties below are optional
   * .stripBasePath(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-action.html)
   */
  public interface ActionProperty {
    /**
     * Represents an InvokeApi action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-action.html#cfn-apigatewayv2-routingrule-action-invokeapi)
     */
    public fun invokeApi(): Any

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invokeApi Represents an InvokeApi action. 
       */
      public fun invokeApi(invokeApi: IResolvable)

      /**
       * @param invokeApi Represents an InvokeApi action. 
       */
      public fun invokeApi(invokeApi: ActionInvokeApiProperty)

      /**
       * @param invokeApi Represents an InvokeApi action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f09347c878f5083904e17c9f5cb28af61603dd25c7642a35194fcc95f12763c6")
      public fun invokeApi(invokeApi: ActionInvokeApiProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionProperty.builder()

      /**
       * @param invokeApi Represents an InvokeApi action. 
       */
      override fun invokeApi(invokeApi: IResolvable) {
        cdkBuilder.invokeApi(invokeApi.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param invokeApi Represents an InvokeApi action. 
       */
      override fun invokeApi(invokeApi: ActionInvokeApiProperty) {
        cdkBuilder.invokeApi(invokeApi.let(ActionInvokeApiProperty.Companion::unwrap))
      }

      /**
       * @param invokeApi Represents an InvokeApi action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f09347c878f5083904e17c9f5cb28af61603dd25c7642a35194fcc95f12763c6")
      override fun invokeApi(invokeApi: ActionInvokeApiProperty.Builder.() -> Unit): Unit =
          invokeApi(ActionInvokeApiProperty(invokeApi))

      public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionProperty,
    ) : CdkObject(cdkObject),
        ActionProperty {
      /**
       * Represents an InvokeApi action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-action.html#cfn-apigatewayv2-routingrule-action-invokeapi)
       */
      override fun invokeApi(): Any = unwrap(this).getInvokeApi()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionProperty):
          ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ActionProperty
    }
  }

  /**
   * Represents a condition.
   *
   * Conditions can contain up to two `matchHeaders` conditions and one `matchBasePaths` conditions.
   * API Gateway evaluates header conditions and base path conditions together. You can only use AND
   * between header and base path conditions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * ConditionProperty conditionProperty = ConditionProperty.builder()
   * .matchBasePaths(MatchBasePathsProperty.builder()
   * .anyOf(List.of("anyOf"))
   * .build())
   * .matchHeaders(MatchHeadersProperty.builder()
   * .anyOf(List.of(MatchHeaderValueProperty.builder()
   * .header("header")
   * .valueGlob("valueGlob")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-condition.html)
   */
  public interface ConditionProperty {
    /**
     * The base path to be matched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-condition.html#cfn-apigatewayv2-routingrule-condition-matchbasepaths)
     */
    public fun matchBasePaths(): Any? = unwrap(this).getMatchBasePaths()

    /**
     * The headers to be matched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-condition.html#cfn-apigatewayv2-routingrule-condition-matchheaders)
     */
    public fun matchHeaders(): Any? = unwrap(this).getMatchHeaders()

    /**
     * A builder for [ConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param matchBasePaths The base path to be matched.
       */
      public fun matchBasePaths(matchBasePaths: IResolvable)

      /**
       * @param matchBasePaths The base path to be matched.
       */
      public fun matchBasePaths(matchBasePaths: MatchBasePathsProperty)

      /**
       * @param matchBasePaths The base path to be matched.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca97ac7b579681d555e8d5f2105c062f966bc5c712d39d9a3f7690e4df8c49b9")
      public fun matchBasePaths(matchBasePaths: MatchBasePathsProperty.Builder.() -> Unit)

      /**
       * @param matchHeaders The headers to be matched.
       */
      public fun matchHeaders(matchHeaders: IResolvable)

      /**
       * @param matchHeaders The headers to be matched.
       */
      public fun matchHeaders(matchHeaders: MatchHeadersProperty)

      /**
       * @param matchHeaders The headers to be matched.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e43a23aff6c86a47846c20bc1a5a15236c9ba6634efc9748ba27fe8df630acc")
      public fun matchHeaders(matchHeaders: MatchHeadersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ConditionProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ConditionProperty.builder()

      /**
       * @param matchBasePaths The base path to be matched.
       */
      override fun matchBasePaths(matchBasePaths: IResolvable) {
        cdkBuilder.matchBasePaths(matchBasePaths.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchBasePaths The base path to be matched.
       */
      override fun matchBasePaths(matchBasePaths: MatchBasePathsProperty) {
        cdkBuilder.matchBasePaths(matchBasePaths.let(MatchBasePathsProperty.Companion::unwrap))
      }

      /**
       * @param matchBasePaths The base path to be matched.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca97ac7b579681d555e8d5f2105c062f966bc5c712d39d9a3f7690e4df8c49b9")
      override fun matchBasePaths(matchBasePaths: MatchBasePathsProperty.Builder.() -> Unit): Unit =
          matchBasePaths(MatchBasePathsProperty(matchBasePaths))

      /**
       * @param matchHeaders The headers to be matched.
       */
      override fun matchHeaders(matchHeaders: IResolvable) {
        cdkBuilder.matchHeaders(matchHeaders.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param matchHeaders The headers to be matched.
       */
      override fun matchHeaders(matchHeaders: MatchHeadersProperty) {
        cdkBuilder.matchHeaders(matchHeaders.let(MatchHeadersProperty.Companion::unwrap))
      }

      /**
       * @param matchHeaders The headers to be matched.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e43a23aff6c86a47846c20bc1a5a15236c9ba6634efc9748ba27fe8df630acc")
      override fun matchHeaders(matchHeaders: MatchHeadersProperty.Builder.() -> Unit): Unit =
          matchHeaders(MatchHeadersProperty(matchHeaders))

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ConditionProperty,
    ) : CdkObject(cdkObject),
        ConditionProperty {
      /**
       * The base path to be matched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-condition.html#cfn-apigatewayv2-routingrule-condition-matchbasepaths)
       */
      override fun matchBasePaths(): Any? = unwrap(this).getMatchBasePaths()

      /**
       * The headers to be matched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-condition.html#cfn-apigatewayv2-routingrule-condition-matchheaders)
       */
      override fun matchHeaders(): Any? = unwrap(this).getMatchHeaders()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ConditionProperty):
          ConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? ConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ConditionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.ConditionProperty
    }
  }

  /**
   * Represents a `MatchBasePaths` condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * MatchBasePathsProperty matchBasePathsProperty = MatchBasePathsProperty.builder()
   * .anyOf(List.of("anyOf"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchbasepaths.html)
   */
  public interface MatchBasePathsProperty {
    /**
     * The string of the case sensitive base path to be matched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchbasepaths.html#cfn-apigatewayv2-routingrule-matchbasepaths-anyof)
     */
    public fun anyOf(): List<String>

    /**
     * A builder for [MatchBasePathsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param anyOf The string of the case sensitive base path to be matched. 
       */
      public fun anyOf(anyOf: List<String>)

      /**
       * @param anyOf The string of the case sensitive base path to be matched. 
       */
      public fun anyOf(vararg anyOf: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchBasePathsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchBasePathsProperty.builder()

      /**
       * @param anyOf The string of the case sensitive base path to be matched. 
       */
      override fun anyOf(anyOf: List<String>) {
        cdkBuilder.anyOf(anyOf)
      }

      /**
       * @param anyOf The string of the case sensitive base path to be matched. 
       */
      override fun anyOf(vararg anyOf: String): Unit = anyOf(anyOf.toList())

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchBasePathsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchBasePathsProperty,
    ) : CdkObject(cdkObject),
        MatchBasePathsProperty {
      /**
       * The string of the case sensitive base path to be matched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchbasepaths.html#cfn-apigatewayv2-routingrule-matchbasepaths-anyof)
       */
      override fun anyOf(): List<String> = unwrap(this).getAnyOf()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchBasePathsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchBasePathsProperty):
          MatchBasePathsProperty = CdkObjectWrappers.wrap(cdkObject) as? MatchBasePathsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchBasePathsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchBasePathsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchBasePathsProperty
    }
  }

  /**
   * Represents a `MatchHeaderValue` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * MatchHeaderValueProperty matchHeaderValueProperty = MatchHeaderValueProperty.builder()
   * .header("header")
   * .valueGlob("valueGlob")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchheadervalue.html)
   */
  public interface MatchHeaderValueProperty {
    /**
     * The case insensitive header name to be matched.
     *
     * The header name must be less than 40 characters and the only allowed characters are `a-z` ,
     * `A-Z` , `0-9` , and the following special characters: `*?-!#$%&amp;'.^_`|~.` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchheadervalue.html#cfn-apigatewayv2-routingrule-matchheadervalue-header)
     */
    public fun `header`(): String

    /**
     * The case sensitive header glob value to be matched against entire header value.
     *
     * The header glob value must be less than 128 characters and the only allowed characters are
     * `a-z` , `A-Z` , `0-9` , and the following special characters: `*?-!#$%&amp;'.^_`|~`. Wildcard
     * matching is supported for header glob values but must be for`*prefix-match`,`suffix-match*`,
     * or`*infix*-match` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchheadervalue.html#cfn-apigatewayv2-routingrule-matchheadervalue-valueglob)
     */
    public fun valueGlob(): String

    /**
     * A builder for [MatchHeaderValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param header The case insensitive header name to be matched. 
       * The header name must be less than 40 characters and the only allowed characters are `a-z` ,
       * `A-Z` , `0-9` , and the following special characters: `*?-!#$%&amp;'.^_`|~.` .
       */
      public fun `header`(`header`: String)

      /**
       * @param valueGlob The case sensitive header glob value to be matched against entire header
       * value. 
       * The header glob value must be less than 128 characters and the only allowed characters are
       * `a-z` , `A-Z` , `0-9` , and the following special characters: `*?-!#$%&amp;'.^_`|~`. Wildcard
       * matching is supported for header glob values but must be for`*prefix-match`,`suffix-match*`,
       * or`*infix*-match` .
       */
      public fun valueGlob(valueGlob: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeaderValueProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeaderValueProperty.builder()

      /**
       * @param header The case insensitive header name to be matched. 
       * The header name must be less than 40 characters and the only allowed characters are `a-z` ,
       * `A-Z` , `0-9` , and the following special characters: `*?-!#$%&amp;'.^_`|~.` .
       */
      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param valueGlob The case sensitive header glob value to be matched against entire header
       * value. 
       * The header glob value must be less than 128 characters and the only allowed characters are
       * `a-z` , `A-Z` , `0-9` , and the following special characters: `*?-!#$%&amp;'.^_`|~`. Wildcard
       * matching is supported for header glob values but must be for`*prefix-match`,`suffix-match*`,
       * or`*infix*-match` .
       */
      override fun valueGlob(valueGlob: String) {
        cdkBuilder.valueGlob(valueGlob)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeaderValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeaderValueProperty,
    ) : CdkObject(cdkObject),
        MatchHeaderValueProperty {
      /**
       * The case insensitive header name to be matched.
       *
       * The header name must be less than 40 characters and the only allowed characters are `a-z` ,
       * `A-Z` , `0-9` , and the following special characters: `*?-!#$%&amp;'.^_`|~.` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchheadervalue.html#cfn-apigatewayv2-routingrule-matchheadervalue-header)
       */
      override fun `header`(): String = unwrap(this).getHeader()

      /**
       * The case sensitive header glob value to be matched against entire header value.
       *
       * The header glob value must be less than 128 characters and the only allowed characters are
       * `a-z` , `A-Z` , `0-9` , and the following special characters: `*?-!#$%&amp;'.^_`|~`. Wildcard
       * matching is supported for header glob values but must be for`*prefix-match`,`suffix-match*`,
       * or`*infix*-match` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchheadervalue.html#cfn-apigatewayv2-routingrule-matchheadervalue-valueglob)
       */
      override fun valueGlob(): String = unwrap(this).getValueGlob()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchHeaderValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeaderValueProperty):
          MatchHeaderValueProperty = CdkObjectWrappers.wrap(cdkObject) as? MatchHeaderValueProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchHeaderValueProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeaderValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeaderValueProperty
    }
  }

  /**
   * Represents a `MatchHeaders` condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * MatchHeadersProperty matchHeadersProperty = MatchHeadersProperty.builder()
   * .anyOf(List.of(MatchHeaderValueProperty.builder()
   * .header("header")
   * .valueGlob("valueGlob")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchheaders.html)
   */
  public interface MatchHeadersProperty {
    /**
     * The header name and header value glob to be matched.
     *
     * The matchHeaders condition is matched if any of the header name and header value globs are
     * matched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchheaders.html#cfn-apigatewayv2-routingrule-matchheaders-anyof)
     */
    public fun anyOf(): Any

    /**
     * A builder for [MatchHeadersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param anyOf The header name and header value glob to be matched. 
       * The matchHeaders condition is matched if any of the header name and header value globs are
       * matched.
       */
      public fun anyOf(anyOf: IResolvable)

      /**
       * @param anyOf The header name and header value glob to be matched. 
       * The matchHeaders condition is matched if any of the header name and header value globs are
       * matched.
       */
      public fun anyOf(anyOf: List<Any>)

      /**
       * @param anyOf The header name and header value glob to be matched. 
       * The matchHeaders condition is matched if any of the header name and header value globs are
       * matched.
       */
      public fun anyOf(vararg anyOf: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeadersProperty.Builder =
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeadersProperty.builder()

      /**
       * @param anyOf The header name and header value glob to be matched. 
       * The matchHeaders condition is matched if any of the header name and header value globs are
       * matched.
       */
      override fun anyOf(anyOf: IResolvable) {
        cdkBuilder.anyOf(anyOf.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param anyOf The header name and header value glob to be matched. 
       * The matchHeaders condition is matched if any of the header name and header value globs are
       * matched.
       */
      override fun anyOf(anyOf: List<Any>) {
        cdkBuilder.anyOf(anyOf.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param anyOf The header name and header value glob to be matched. 
       * The matchHeaders condition is matched if any of the header name and header value globs are
       * matched.
       */
      override fun anyOf(vararg anyOf: Any): Unit = anyOf(anyOf.toList())

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeadersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeadersProperty,
    ) : CdkObject(cdkObject),
        MatchHeadersProperty {
      /**
       * The header name and header value glob to be matched.
       *
       * The matchHeaders condition is matched if any of the header name and header value globs are
       * matched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routingrule-matchheaders.html#cfn-apigatewayv2-routingrule-matchheaders-anyof)
       */
      override fun anyOf(): Any = unwrap(this).getAnyOf()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatchHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeadersProperty):
          MatchHeadersProperty = CdkObjectWrappers.wrap(cdkObject) as? MatchHeadersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchHeadersProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeadersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRoutingRule.MatchHeadersProperty
    }
  }
}
