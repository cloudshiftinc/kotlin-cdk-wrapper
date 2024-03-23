@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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
 * Creates a pricing rule which can be associated with a pricing plan, or a set of pricing plans.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.billingconductor.*;
 * CfnPricingRule cfnPricingRule = CfnPricingRule.Builder.create(this, "MyCfnPricingRule")
 * .name("name")
 * .scope("scope")
 * .type("type")
 * // the properties below are optional
 * .billingEntity("billingEntity")
 * .description("description")
 * .modifierPercentage(123)
 * .operation("operation")
 * .service("service")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tiering(TieringProperty.builder()
 * .freeTier(FreeTierProperty.builder()
 * .activated(false)
 * .build())
 * .build())
 * .usageType("usageType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html)
 */
public open class CfnPricingRule(
  cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPricingRuleProps,
  ) :
      this(software.amazon.awscdk.services.billingconductor.CfnPricingRule(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPricingRuleProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPricingRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPricingRuleProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) used to uniquely identify a pricing rule.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The pricing plans count that this pricing rule is associated with.
   */
  public open fun attrAssociatedPricingPlanCount(): Number =
      unwrap(this).getAttrAssociatedPricingPlanCount()

  /**
   * The time the pricing rule was created.
   */
  public open fun attrCreationTime(): Number = unwrap(this).getAttrCreationTime()

  /**
   * The most recent time the pricing rule was modified.
   */
  public open fun attrLastModifiedTime(): Number = unwrap(this).getAttrLastModifiedTime()

  /**
   * The seller of services provided by AWS , their affiliates, or third-party providers selling
   * services via AWS Marketplace .
   */
  public open fun billingEntity(): String? = unwrap(this).getBillingEntity()

  /**
   * The seller of services provided by AWS , their affiliates, or third-party providers selling
   * services via AWS Marketplace .
   */
  public open fun billingEntity(`value`: String) {
    unwrap(this).setBillingEntity(`value`)
  }

  /**
   * The pricing rule description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The pricing rule description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A percentage modifier applied on the public pricing rates.
   */
  public open fun modifierPercentage(): Number? = unwrap(this).getModifierPercentage()

  /**
   * A percentage modifier applied on the public pricing rates.
   */
  public open fun modifierPercentage(`value`: Number) {
    unwrap(this).setModifierPercentage(`value`)
  }

  /**
   * The name of a pricing rule.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a pricing rule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Operation is the specific AWS action covered by this line item.
   */
  public open fun operation(): String? = unwrap(this).getOperation()

  /**
   * Operation is the specific AWS action covered by this line item.
   */
  public open fun operation(`value`: String) {
    unwrap(this).setOperation(`value`)
  }

  /**
   * The scope of pricing rule that indicates if it's globally applicable or service-specific.
   */
  public open fun scope(): String = unwrap(this).getScope()

  /**
   * The scope of pricing rule that indicates if it's globally applicable or service-specific.
   */
  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
  }

  /**
   * If the `Scope` attribute is `SERVICE` , this attribute indicates which service the
   * `PricingRule` is applicable for.
   */
  public open fun service(): String? = unwrap(this).getService()

  /**
   * If the `Scope` attribute is `SERVICE` , this attribute indicates which service the
   * `PricingRule` is applicable for.
   */
  public open fun service(`value`: String) {
    unwrap(this).setService(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values that are attached to a pricing rule.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A map that contains tag keys and tag values that are attached to a pricing rule.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A map that contains tag keys and tag values that are attached to a pricing rule.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The set of tiering configurations for the pricing rule.
   */
  public open fun tiering(): Any? = unwrap(this).getTiering()

  /**
   * The set of tiering configurations for the pricing rule.
   */
  public open fun tiering(`value`: IResolvable) {
    unwrap(this).setTiering(`value`.let(IResolvable::unwrap))
  }

  /**
   * The set of tiering configurations for the pricing rule.
   */
  public open fun tiering(`value`: TieringProperty) {
    unwrap(this).setTiering(`value`.let(TieringProperty::unwrap))
  }

  /**
   * The set of tiering configurations for the pricing rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2daf26b6f15b100a4acffbd0dab7471fb1944d1d6a18cf1eba5dc10e5209ec83")
  public open fun tiering(`value`: TieringProperty.Builder.() -> Unit): Unit =
      tiering(TieringProperty(`value`))

  /**
   * The type of pricing rule.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of pricing rule.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * Usage Type is the unit that each service uses to measure the usage of a specific type of
   * resource.
   */
  public open fun usageType(): String? = unwrap(this).getUsageType()

  /**
   * Usage Type is the unit that each service uses to measure the usage of a specific type of
   * resource.
   */
  public open fun usageType(`value`: String) {
    unwrap(this).setUsageType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.billingconductor.CfnPricingRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The seller of services provided by AWS , their affiliates, or third-party providers selling
     * services via AWS Marketplace .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-billingentity)
     * @param billingEntity The seller of services provided by AWS , their affiliates, or
     * third-party providers selling services via AWS Marketplace . 
     */
    public fun billingEntity(billingEntity: String)

    /**
     * The pricing rule description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-description)
     * @param description The pricing rule description. 
     */
    public fun description(description: String)

    /**
     * A percentage modifier applied on the public pricing rates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-modifierpercentage)
     * @param modifierPercentage A percentage modifier applied on the public pricing rates. 
     */
    public fun modifierPercentage(modifierPercentage: Number)

    /**
     * The name of a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-name)
     * @param name The name of a pricing rule. 
     */
    public fun name(name: String)

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
     * @param operation Operation is the specific AWS action covered by this line item. 
     */
    public fun operation(operation: String)

    /**
     * The scope of pricing rule that indicates if it's globally applicable or service-specific.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-scope)
     * @param scope The scope of pricing rule that indicates if it's globally applicable or
     * service-specific. 
     */
    public fun scope(scope: String)

    /**
     * If the `Scope` attribute is `SERVICE` , this attribute indicates which service the
     * `PricingRule` is applicable for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-service)
     * @param service If the `Scope` attribute is `SERVICE` , this attribute indicates which service
     * the `PricingRule` is applicable for. 
     */
    public fun service(service: String)

    /**
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     * @param tiering The set of tiering configurations for the pricing rule. 
     */
    public fun tiering(tiering: IResolvable)

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     * @param tiering The set of tiering configurations for the pricing rule. 
     */
    public fun tiering(tiering: TieringProperty)

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     * @param tiering The set of tiering configurations for the pricing rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39c4d567580d2fcfd35bf97cd19eb8b6199b758d5fb2766cf70606df78d6df2f")
    public fun tiering(tiering: TieringProperty.Builder.() -> Unit)

    /**
     * The type of pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-type)
     * @param type The type of pricing rule. 
     */
    public fun type(type: String)

    /**
     * Usage Type is the unit that each service uses to measure the usage of a specific type of
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-usagetype)
     * @param usageType Usage Type is the unit that each service uses to measure the usage of a
     * specific type of resource. 
     */
    public fun usageType(usageType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.billingconductor.CfnPricingRule.Builder
        = software.amazon.awscdk.services.billingconductor.CfnPricingRule.Builder.create(scope, id)

    /**
     * The seller of services provided by AWS , their affiliates, or third-party providers selling
     * services via AWS Marketplace .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-billingentity)
     * @param billingEntity The seller of services provided by AWS , their affiliates, or
     * third-party providers selling services via AWS Marketplace . 
     */
    override fun billingEntity(billingEntity: String) {
      cdkBuilder.billingEntity(billingEntity)
    }

    /**
     * The pricing rule description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-description)
     * @param description The pricing rule description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A percentage modifier applied on the public pricing rates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-modifierpercentage)
     * @param modifierPercentage A percentage modifier applied on the public pricing rates. 
     */
    override fun modifierPercentage(modifierPercentage: Number) {
      cdkBuilder.modifierPercentage(modifierPercentage)
    }

    /**
     * The name of a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-name)
     * @param name The name of a pricing rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param operation Operation is the specific AWS action covered by this line item. 
     */
    override fun operation(operation: String) {
      cdkBuilder.operation(operation)
    }

    /**
     * The scope of pricing rule that indicates if it's globally applicable or service-specific.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-scope)
     * @param scope The scope of pricing rule that indicates if it's globally applicable or
     * service-specific. 
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * If the `Scope` attribute is `SERVICE` , this attribute indicates which service the
     * `PricingRule` is applicable for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-service)
     * @param service If the `Scope` attribute is `SERVICE` , this attribute indicates which service
     * the `PricingRule` is applicable for. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    /**
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     * @param tiering The set of tiering configurations for the pricing rule. 
     */
    override fun tiering(tiering: IResolvable) {
      cdkBuilder.tiering(tiering.let(IResolvable::unwrap))
    }

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     * @param tiering The set of tiering configurations for the pricing rule. 
     */
    override fun tiering(tiering: TieringProperty) {
      cdkBuilder.tiering(tiering.let(TieringProperty::unwrap))
    }

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     * @param tiering The set of tiering configurations for the pricing rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39c4d567580d2fcfd35bf97cd19eb8b6199b758d5fb2766cf70606df78d6df2f")
    override fun tiering(tiering: TieringProperty.Builder.() -> Unit): Unit =
        tiering(TieringProperty(tiering))

    /**
     * The type of pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-type)
     * @param type The type of pricing rule. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * Usage Type is the unit that each service uses to measure the usage of a specific type of
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-usagetype)
     * @param usageType Usage Type is the unit that each service uses to measure the usage of a
     * specific type of resource. 
     */
    override fun usageType(usageType: String) {
      cdkBuilder.usageType(usageType)
    }

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnPricingRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.billingconductor.CfnPricingRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPricingRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPricingRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule):
        CfnPricingRule = CfnPricingRule(cdkObject)

    internal fun unwrap(wrapped: CfnPricingRule):
        software.amazon.awscdk.services.billingconductor.CfnPricingRule = wrapped.cdkObject as
        software.amazon.awscdk.services.billingconductor.CfnPricingRule
  }

  /**
   * The possible AWS Free Tier configurations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * FreeTierProperty freeTierProperty = FreeTierProperty.builder()
   * .activated(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-freetier.html)
   */
  public interface FreeTierProperty {
    /**
     * Activate or deactivate AWS Free Tier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-freetier.html#cfn-billingconductor-pricingrule-freetier-activated)
     */
    public fun activated(): Any

    /**
     * A builder for [FreeTierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activated Activate or deactivate AWS Free Tier. 
       */
      public fun activated(activated: Boolean)

      /**
       * @param activated Activate or deactivate AWS Free Tier. 
       */
      public fun activated(activated: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty.Builder =
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty.builder()

      /**
       * @param activated Activate or deactivate AWS Free Tier. 
       */
      override fun activated(activated: Boolean) {
        cdkBuilder.activated(activated)
      }

      /**
       * @param activated Activate or deactivate AWS Free Tier. 
       */
      override fun activated(activated: IResolvable) {
        cdkBuilder.activated(activated.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty,
    ) : CdkObject(cdkObject), FreeTierProperty {
      /**
       * Activate or deactivate AWS Free Tier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-freetier.html#cfn-billingconductor-pricingrule-freetier-activated)
       */
      override fun activated(): Any = unwrap(this).getActivated()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FreeTierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty):
          FreeTierProperty = CdkObjectWrappers.wrap(cdkObject) as? FreeTierProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FreeTierProperty):
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.FreeTierProperty
    }
  }

  /**
   * The set of tiering configurations for the pricing rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.billingconductor.*;
   * TieringProperty tieringProperty = TieringProperty.builder()
   * .freeTier(FreeTierProperty.builder()
   * .activated(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-tiering.html)
   */
  public interface TieringProperty {
    /**
     * The possible AWS Free Tier configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-tiering.html#cfn-billingconductor-pricingrule-tiering-freetier)
     */
    public fun freeTier(): Any? = unwrap(this).getFreeTier()

    /**
     * A builder for [TieringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param freeTier The possible AWS Free Tier configurations.
       */
      public fun freeTier(freeTier: IResolvable)

      /**
       * @param freeTier The possible AWS Free Tier configurations.
       */
      public fun freeTier(freeTier: FreeTierProperty)

      /**
       * @param freeTier The possible AWS Free Tier configurations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b769e8df57b6486c6a4fd8d9d82cd8fe24425f18e2d4bf345ce5ef1f57878dd3")
      public fun freeTier(freeTier: FreeTierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty.Builder =
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty.builder()

      /**
       * @param freeTier The possible AWS Free Tier configurations.
       */
      override fun freeTier(freeTier: IResolvable) {
        cdkBuilder.freeTier(freeTier.let(IResolvable::unwrap))
      }

      /**
       * @param freeTier The possible AWS Free Tier configurations.
       */
      override fun freeTier(freeTier: FreeTierProperty) {
        cdkBuilder.freeTier(freeTier.let(FreeTierProperty::unwrap))
      }

      /**
       * @param freeTier The possible AWS Free Tier configurations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b769e8df57b6486c6a4fd8d9d82cd8fe24425f18e2d4bf345ce5ef1f57878dd3")
      override fun freeTier(freeTier: FreeTierProperty.Builder.() -> Unit): Unit =
          freeTier(FreeTierProperty(freeTier))

      public fun build():
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty,
    ) : CdkObject(cdkObject), TieringProperty {
      /**
       * The possible AWS Free Tier configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-billingconductor-pricingrule-tiering.html#cfn-billingconductor-pricingrule-tiering-freetier)
       */
      override fun freeTier(): Any? = unwrap(this).getFreeTier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TieringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty):
          TieringProperty = CdkObjectWrappers.wrap(cdkObject) as? TieringProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TieringProperty):
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.billingconductor.CfnPricingRule.TieringProperty
    }
  }
}
