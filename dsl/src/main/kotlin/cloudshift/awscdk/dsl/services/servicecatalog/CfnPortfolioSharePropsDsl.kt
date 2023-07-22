@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps

@CdkDslMarker
public class CfnPortfolioSharePropsDsl {
  private val cdkBuilder: CfnPortfolioShareProps.Builder = CfnPortfolioShareProps.builder()

  /**
   * @param acceptLanguage The language code.
   * * `jp` - Japanese
   * * `zh` - Chinese
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * @param accountId The AWS account ID. 
   * For example, `123456789012` .
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * @param portfolioId The portfolio identifier. 
   */
  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  /**
   * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
   * portfolio share.
   */
  public fun shareTagOptions(shareTagOptions: Boolean) {
    cdkBuilder.shareTagOptions(shareTagOptions)
  }

  /**
   * @param shareTagOptions Indicates whether TagOptions sharing is enabled or disabled for the
   * portfolio share.
   */
  public fun shareTagOptions(shareTagOptions: IResolvable) {
    cdkBuilder.shareTagOptions(shareTagOptions)
  }

  public fun build(): CfnPortfolioShareProps = cdkBuilder.build()
}
