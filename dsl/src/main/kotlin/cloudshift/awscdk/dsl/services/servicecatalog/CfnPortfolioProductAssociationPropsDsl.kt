@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps

@CdkDslMarker
public class CfnPortfolioProductAssociationPropsDsl {
  private val cdkBuilder: CfnPortfolioProductAssociationProps.Builder =
      CfnPortfolioProductAssociationProps.builder()

  /**
   * @param acceptLanguage The language code.
   * * `jp` - Japanese
   * * `zh` - Chinese
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * @param portfolioId The portfolio identifier. 
   */
  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  /**
   * @param productId The product identifier. 
   */
  public fun productId(productId: String) {
    cdkBuilder.productId(productId)
  }

  /**
   * @param sourcePortfolioId The identifier of the source portfolio.
   */
  public fun sourcePortfolioId(sourcePortfolioId: String) {
    cdkBuilder.sourcePortfolioId(sourcePortfolioId)
  }

  public fun build(): CfnPortfolioProductAssociationProps = cdkBuilder.build()
}
