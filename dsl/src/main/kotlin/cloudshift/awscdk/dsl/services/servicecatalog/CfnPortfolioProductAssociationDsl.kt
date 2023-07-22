@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation
import software.constructs.Construct

/**
 * Associates the specified product with the specified portfolio.
 *
 * A delegated admin is authorized to invoke this command.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnPortfolioProductAssociation cfnPortfolioProductAssociation =
 * CfnPortfolioProductAssociation.Builder.create(this, "MyCfnPortfolioProductAssociation")
 * .portfolioId("portfolioId")
 * .productId("productId")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .sourcePortfolioId("sourcePortfolioId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html)
 */
@CdkDslMarker
public class CfnPortfolioProductAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPortfolioProductAssociation.Builder =
      CfnPortfolioProductAssociation.Builder.create(scope, id)

  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-acceptlanguage)
   * @param acceptLanguage The language code. 
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-portfolioid)
   * @param portfolioId The portfolio identifier. 
   */
  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  /**
   * The product identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-productid)
   * @param productId The product identifier. 
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  /**
   * The identifier of the source portfolio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html#cfn-servicecatalog-portfolioproductassociation-sourceportfolioid)
   * @param sourcePortfolioId The identifier of the source portfolio. 
   */
  public fun sourcePortfolioId(sourcePortfolioId: String) {
    cdkBuilder.sourcePortfolioId(sourcePortfolioId)
  }

  public fun build(): CfnPortfolioProductAssociation = cdkBuilder.build()
}
