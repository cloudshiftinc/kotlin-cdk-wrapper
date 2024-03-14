package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPricingRuleProps {
  /**
   * The seller of services provided by AWS , their affiliates, or third-party providers selling
   * services via AWS Marketplace .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-billingentity)
   */
  public fun billingEntity(): String? = unwrap(this).getBillingEntity()

  /**
   * The pricing rule description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A percentage modifier applied on the public pricing rates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-modifierpercentage)
   */
  public fun modifierPercentage(): Number? = unwrap(this).getModifierPercentage()

  /**
   * The name of a pricing rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-name)
   */
  public fun name(): String

  /**
   * Operation is the specific AWS action covered by this line item.
   *
   * This describes the specific usage of the line item.
   *
   * If the `Scope` attribute is set to `SKU` , this attribute indicates which operation the
   * `PricingRule` is modifying. For example, a value of `RunInstances:0202` indicates the operation of
   * running an Amazon EC2 instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-operation)
   */
  public fun operation(): String? = unwrap(this).getOperation()

  /**
   * The scope of pricing rule that indicates if it's globally applicable or service-specific.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-scope)
   */
  public fun scope(): String

  /**
   * If the `Scope` attribute is `SERVICE` , this attribute indicates which service the
   * `PricingRule` is applicable for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-service)
   */
  public fun service(): String? = unwrap(this).getService()

  /**
   * A map that contains tag keys and tag values that are attached to a pricing rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The set of tiering configurations for the pricing rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
   */
  public fun tiering(): Any? = unwrap(this).getTiering()

  /**
   * The type of pricing rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-type)
   */
  public fun type(): String

  /**
   * Usage Type is the unit that each service uses to measure the usage of a specific type of
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-usagetype)
   */
  public fun usageType(): String? = unwrap(this).getUsageType()

  /**
   * A builder for [CfnPricingRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param billingEntity The seller of services provided by AWS , their affiliates, or
     * third-party providers selling services via AWS Marketplace .
     */
    public fun billingEntity(billingEntity: String)

    /**
     * @param description The pricing rule description.
     */
    public fun description(description: String)

    /**
     * @param modifierPercentage A percentage modifier applied on the public pricing rates.
     */
    public fun modifierPercentage(modifierPercentage: Number)

    /**
     * @param name The name of a pricing rule. 
     */
    public fun name(name: String)

    /**
     * @param operation Operation is the specific AWS action covered by this line item.
     * This describes the specific usage of the line item.
     *
     * If the `Scope` attribute is set to `SKU` , this attribute indicates which operation the
     * `PricingRule` is modifying. For example, a value of `RunInstances:0202` indicates the operation
     * of running an Amazon EC2 instance.
     */
    public fun operation(operation: String)

    /**
     * @param scope The scope of pricing rule that indicates if it's globally applicable or
     * service-specific. 
     */
    public fun scope(scope: String)

    /**
     * @param service If the `Scope` attribute is `SERVICE` , this attribute indicates which service
     * the `PricingRule` is applicable for.
     */
    public fun service(service: String)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tiering The set of tiering configurations for the pricing rule.
     */
    public fun tiering(tiering: IResolvable)

    /**
     * @param tiering The set of tiering configurations for the pricing rule.
     */
    public fun tiering(tiering: CfnPricingRule.TieringProperty)

    /**
     * @param tiering The set of tiering configurations for the pricing rule.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4998999d5817a1e5871ac0eb1bd28e4d0f8930f78aade0a6ffd6880a900a3102")
    public fun tiering(tiering: CfnPricingRule.TieringProperty.Builder.() -> Unit)

    /**
     * @param type The type of pricing rule. 
     */
    public fun type(type: String)

    /**
     * @param usageType Usage Type is the unit that each service uses to measure the usage of a
     * specific type of resource.
     */
    public fun usageType(usageType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps.Builder =
        software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps.builder()

    /**
     * @param billingEntity The seller of services provided by AWS , their affiliates, or
     * third-party providers selling services via AWS Marketplace .
     */
    override fun billingEntity(billingEntity: String) {
      cdkBuilder.billingEntity(billingEntity)
    }

    /**
     * @param description The pricing rule description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param modifierPercentage A percentage modifier applied on the public pricing rates.
     */
    override fun modifierPercentage(modifierPercentage: Number) {
      cdkBuilder.modifierPercentage(modifierPercentage)
    }

    /**
     * @param name The name of a pricing rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param operation Operation is the specific AWS action covered by this line item.
     * This describes the specific usage of the line item.
     *
     * If the `Scope` attribute is set to `SKU` , this attribute indicates which operation the
     * `PricingRule` is modifying. For example, a value of `RunInstances:0202` indicates the operation
     * of running an Amazon EC2 instance.
     */
    override fun operation(operation: String) {
      cdkBuilder.operation(operation)
    }

    /**
     * @param scope The scope of pricing rule that indicates if it's globally applicable or
     * service-specific. 
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * @param service If the `Scope` attribute is `SERVICE` , this attribute indicates which service
     * the `PricingRule` is applicable for.
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tiering The set of tiering configurations for the pricing rule.
     */
    override fun tiering(tiering: IResolvable) {
      cdkBuilder.tiering(tiering.let(IResolvable::unwrap))
    }

    /**
     * @param tiering The set of tiering configurations for the pricing rule.
     */
    override fun tiering(tiering: CfnPricingRule.TieringProperty) {
      cdkBuilder.tiering(tiering.let(CfnPricingRule.TieringProperty::unwrap))
    }

    /**
     * @param tiering The set of tiering configurations for the pricing rule.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4998999d5817a1e5871ac0eb1bd28e4d0f8930f78aade0a6ffd6880a900a3102")
    override fun tiering(tiering: CfnPricingRule.TieringProperty.Builder.() -> Unit): Unit =
        tiering(CfnPricingRule.TieringProperty(tiering))

    /**
     * @param type The type of pricing rule. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param usageType Usage Type is the unit that each service uses to measure the usage of a
     * specific type of resource.
     */
    override fun usageType(usageType: String) {
      cdkBuilder.usageType(usageType)
    }

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps,
  ) : CdkObject(cdkObject), CfnPricingRuleProps {
    /**
     * The seller of services provided by AWS , their affiliates, or third-party providers selling
     * services via AWS Marketplace .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-billingentity)
     */
    override fun billingEntity(): String? = unwrap(this).getBillingEntity()

    /**
     * The pricing rule description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A percentage modifier applied on the public pricing rates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-modifierpercentage)
     */
    override fun modifierPercentage(): Number? = unwrap(this).getModifierPercentage()

    /**
     * The name of a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Operation is the specific AWS action covered by this line item.
     *
     * This describes the specific usage of the line item.
     *
     * If the `Scope` attribute is set to `SKU` , this attribute indicates which operation the
     * `PricingRule` is modifying. For example, a value of `RunInstances:0202` indicates the operation
     * of running an Amazon EC2 instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-operation)
     */
    override fun operation(): String? = unwrap(this).getOperation()

    /**
     * The scope of pricing rule that indicates if it's globally applicable or service-specific.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-scope)
     */
    override fun scope(): String = unwrap(this).getScope()

    /**
     * If the `Scope` attribute is `SERVICE` , this attribute indicates which service the
     * `PricingRule` is applicable for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-service)
     */
    override fun service(): String? = unwrap(this).getService()

    /**
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     */
    override fun tiering(): Any? = unwrap(this).getTiering()

    /**
     * The type of pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * Usage Type is the unit that each service uses to measure the usage of a specific type of
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-usagetype)
     */
    override fun usageType(): String? = unwrap(this).getUsageType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPricingRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps):
        CfnPricingRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPricingRuleProps):
        software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.billingconductor.CfnPricingRuleProps
  }
}
