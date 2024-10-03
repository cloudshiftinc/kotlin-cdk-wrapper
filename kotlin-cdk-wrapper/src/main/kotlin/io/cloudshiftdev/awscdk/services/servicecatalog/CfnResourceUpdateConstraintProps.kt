@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResourceUpdateConstraint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnResourceUpdateConstraintProps cfnResourceUpdateConstraintProps =
 * CfnResourceUpdateConstraintProps.builder()
 * .portfolioId("portfolioId")
 * .productId("productId")
 * .tagUpdateOnProvisionedProduct("tagUpdateOnProvisionedProduct")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
 */
public interface CfnResourceUpdateConstraintProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The description of the constraint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-portfolioid)
   */
  public fun portfolioId(): String

  /**
   * The product identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-productid)
   */
  public fun productId(): String

  /**
   * If set to `ALLOWED` , lets users change tags in a
   * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
   * resource.
   *
   * If set to `NOT_ALLOWED` , prevents users from changing tags in a
   * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-tagupdateonprovisionedproduct)
   */
  public fun tagUpdateOnProvisionedProduct(): String

  /**
   * A builder for [CfnResourceUpdateConstraintProps]
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
     * @param tagUpdateOnProvisionedProduct If set to `ALLOWED` , lets users change tags in a
     * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     * resource. 
     * If set to `NOT_ALLOWED` , prevents users from changing tags in a
     * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     * resource.
     */
    public fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps.builder()

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
     * @param tagUpdateOnProvisionedProduct If set to `ALLOWED` , lets users change tags in a
     * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     * resource. 
     * If set to `NOT_ALLOWED` , prevents users from changing tags in a
     * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     * resource.
     */
    override fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String) {
      cdkBuilder.tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps,
  ) : CdkObject(cdkObject),
      CfnResourceUpdateConstraintProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-portfolioid)
     */
    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-productid)
     */
    override fun productId(): String = unwrap(this).getProductId()

    /**
     * If set to `ALLOWED` , lets users change tags in a
     * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     * resource.
     *
     * If set to `NOT_ALLOWED` , prevents users from changing tags in a
     * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-tagupdateonprovisionedproduct)
     */
    override fun tagUpdateOnProvisionedProduct(): String =
        unwrap(this).getTagUpdateOnProvisionedProduct()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceUpdateConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps):
        CfnResourceUpdateConstraintProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnResourceUpdateConstraintProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceUpdateConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps
  }
}
