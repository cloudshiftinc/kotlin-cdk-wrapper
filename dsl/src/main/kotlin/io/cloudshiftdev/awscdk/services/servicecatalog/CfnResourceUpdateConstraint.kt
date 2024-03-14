package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourceUpdateConstraint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The language code.
   */
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The language code.
   */
  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description of the constraint.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the constraint.
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
   * The portfolio identifier.
   */
  public open fun portfolioId(): String = unwrap(this).getPortfolioId()

  /**
   * The portfolio identifier.
   */
  public open fun portfolioId(`value`: String) {
    unwrap(this).setPortfolioId(`value`)
  }

  /**
   * The product identifier.
   */
  public open fun productId(): String = unwrap(this).getProductId()

  /**
   * The product identifier.
   */
  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  /**
   * If set to `ALLOWED` , lets users change tags in a
   * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
   * resource.
   */
  public open fun tagUpdateOnProvisionedProduct(): String =
      unwrap(this).getTagUpdateOnProvisionedProduct()

  /**
   * If set to `ALLOWED` , lets users change tags in a
   * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
   * resource.
   */
  public open fun tagUpdateOnProvisionedProduct(`value`: String) {
    unwrap(this).setTagUpdateOnProvisionedProduct(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.servicecatalog.CfnResourceUpdateConstraint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-description)
     * @param description The description of the constraint. 
     */
    public fun description(description: String)

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-portfolioid)
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-productid)
     * @param productId The product identifier. 
     */
    public fun productId(productId: String)

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
     * @param tagUpdateOnProvisionedProduct If set to `ALLOWED` , lets users change tags in a
     * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     * resource. 
     */
    public fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint.Builder.create(scope,
        id)

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-description)
     * @param description The description of the constraint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-portfolioid)
     * @param portfolioId The portfolio identifier. 
     */
    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html#cfn-servicecatalog-resourceupdateconstraint-productid)
     * @param productId The product identifier. 
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

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
     * @param tagUpdateOnProvisionedProduct If set to `ALLOWED` , lets users change tags in a
     * [CloudFormationProvisionedProduct](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     * resource. 
     */
    override fun tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct: String) {
      cdkBuilder.tagUpdateOnProvisionedProduct(tagUpdateOnProvisionedProduct)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceUpdateConstraint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceUpdateConstraint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint):
        CfnResourceUpdateConstraint = CfnResourceUpdateConstraint(cdkObject)

    internal fun unwrap(wrapped: CfnResourceUpdateConstraint):
        software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint =
        wrapped.cdkObject
  }
}
