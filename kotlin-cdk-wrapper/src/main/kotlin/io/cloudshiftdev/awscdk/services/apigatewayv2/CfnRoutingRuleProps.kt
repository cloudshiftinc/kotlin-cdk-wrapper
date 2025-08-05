@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

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
 * Properties for defining a `CfnRoutingRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * CfnRoutingRuleProps cfnRoutingRuleProps = CfnRoutingRuleProps.builder()
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
public interface CfnRoutingRuleProps {
  /**
   * The resulting action based on matching a routing rules condition.
   *
   * Only InvokeApi is supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-actions)
   */
  public fun actions(): Any

  /**
   * The conditions of the routing rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-conditions)
   */
  public fun conditions(): Any

  /**
   * The ARN of the domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-domainnamearn)
   */
  public fun domainNameArn(): String

  /**
   * The order in which API Gateway evaluates a rule.
   *
   * Priority is evaluated from the lowest value to the highest value. Rules can't have the same
   * priority. Priority values 1-1,000,000 are supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-priority)
   */
  public fun priority(): Number

  /**
   * A builder for [CfnRoutingRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The resulting action based on matching a routing rules condition. 
     * Only InvokeApi is supported.
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions The resulting action based on matching a routing rules condition. 
     * Only InvokeApi is supported.
     */
    public fun actions(actions: List<Any>)

    /**
     * @param actions The resulting action based on matching a routing rules condition. 
     * Only InvokeApi is supported.
     */
    public fun actions(vararg actions: Any)

    /**
     * @param conditions The conditions of the routing rule. 
     */
    public fun conditions(conditions: IResolvable)

    /**
     * @param conditions The conditions of the routing rule. 
     */
    public fun conditions(conditions: List<Any>)

    /**
     * @param conditions The conditions of the routing rule. 
     */
    public fun conditions(vararg conditions: Any)

    /**
     * @param domainNameArn The ARN of the domain name. 
     */
    public fun domainNameArn(domainNameArn: String)

    /**
     * @param priority The order in which API Gateway evaluates a rule. 
     * Priority is evaluated from the lowest value to the highest value. Rules can't have the same
     * priority. Priority values 1-1,000,000 are supported.
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRuleProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnRoutingRuleProps.builder()

    /**
     * @param actions The resulting action based on matching a routing rules condition. 
     * Only InvokeApi is supported.
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param actions The resulting action based on matching a routing rules condition. 
     * Only InvokeApi is supported.
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param actions The resulting action based on matching a routing rules condition. 
     * Only InvokeApi is supported.
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * @param conditions The conditions of the routing rule. 
     */
    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param conditions The conditions of the routing rule. 
     */
    override fun conditions(conditions: List<Any>) {
      cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param conditions The conditions of the routing rule. 
     */
    override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

    /**
     * @param domainNameArn The ARN of the domain name. 
     */
    override fun domainNameArn(domainNameArn: String) {
      cdkBuilder.domainNameArn(domainNameArn)
    }

    /**
     * @param priority The order in which API Gateway evaluates a rule. 
     * Priority is evaluated from the lowest value to the highest value. Rules can't have the same
     * priority. Priority values 1-1,000,000 are supported.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRoutingRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRuleProps,
  ) : CdkObject(cdkObject),
      CfnRoutingRuleProps {
    /**
     * The resulting action based on matching a routing rules condition.
     *
     * Only InvokeApi is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-actions)
     */
    override fun actions(): Any = unwrap(this).getActions()

    /**
     * The conditions of the routing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-conditions)
     */
    override fun conditions(): Any = unwrap(this).getConditions()

    /**
     * The ARN of the domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-domainnamearn)
     */
    override fun domainNameArn(): String = unwrap(this).getDomainNameArn()

    /**
     * The order in which API Gateway evaluates a rule.
     *
     * Priority is evaluated from the lowest value to the highest value. Rules can't have the same
     * priority. Priority values 1-1,000,000 are supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routingrule.html#cfn-apigatewayv2-routingrule-priority)
     */
    override fun priority(): Number = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoutingRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoutingRuleProps):
        CfnRoutingRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRoutingRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoutingRuleProps):
        software.amazon.awscdk.services.apigatewayv2.CfnRoutingRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnRoutingRuleProps
  }
}
