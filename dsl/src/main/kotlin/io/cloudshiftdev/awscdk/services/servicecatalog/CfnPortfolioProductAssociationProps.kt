package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnPortfolioProductAssociationProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid)
   */
  public fun portfolioId(): String

  /**
   * The product identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid)
   */
  public fun productId(): String

  /**
   * The identifier of the source portfolio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid)
   */
  public fun sourcePortfolioId(): String? = unwrap(this).getSourcePortfolioId()

  /**
   * A builder for [CfnPortfolioProductAssociationProps]
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
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * @param productId The product identifier. 
     */
    public fun productId(productId: String)

    /**
     * @param sourcePortfolioId The identifier of the source portfolio.
     */
    public fun sourcePortfolioId(sourcePortfolioId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
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
     * @param sourcePortfolioId The identifier of the source portfolio.
     */
    override fun sourcePortfolioId(sourcePortfolioId: String) {
      cdkBuilder.sourcePortfolioId(sourcePortfolioId)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps,
  ) : CdkObject(cdkObject), CfnPortfolioProductAssociationProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid)
     */
    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid)
     */
    override fun productId(): String = unwrap(this).getProductId()

    /**
     * The identifier of the source portfolio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid)
     */
    override fun sourcePortfolioId(): String? = unwrap(this).getSourcePortfolioId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnPortfolioProductAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps):
        CfnPortfolioProductAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortfolioProductAssociationProps):
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps
  }
}
