@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnLaunchTemplateConstraint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnLaunchTemplateConstraintProps cfnLaunchTemplateConstraintProps =
 * CfnLaunchTemplateConstraintProps.builder()
 * .portfolioId("portfolioId")
 * .productId("productId")
 * .rules("rules")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html)
 */
public interface CfnLaunchTemplateConstraintProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The description of the constraint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-portfolioid)
   */
  public fun portfolioId(): String

  /**
   * The product identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-productid)
   */
  public fun productId(): String

  /**
   * The constraint rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-rules)
   */
  public fun rules(): String

  /**
   * A builder for [CfnLaunchTemplateConstraintProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * @param description The description of the constraint.
     */
    public fun description(description: String)

    /**
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * @param productId The product identifier. 
     */
    public fun productId(productId: String)

    /**
     * @param rules The constraint rules. 
     */
    public fun rules(rules: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param description The description of the constraint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param portfolioId The portfolio identifier. 
     */
    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * @param productId The product identifier. 
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * @param rules The constraint rules. 
     */
    override fun rules(rules: String) {
      cdkBuilder.rules(rules)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps,
  ) : CdkObject(cdkObject),
      CfnLaunchTemplateConstraintProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-portfolioid)
     */
    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-productid)
     */
    override fun productId(): String = unwrap(this).getProductId()

    /**
     * The constraint rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html#cfn-servicecatalog-launchtemplateconstraint-rules)
     */
    override fun rules(): String = unwrap(this).getRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchTemplateConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps):
        CfnLaunchTemplateConstraintProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnLaunchTemplateConstraintProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchTemplateConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps
  }
}
