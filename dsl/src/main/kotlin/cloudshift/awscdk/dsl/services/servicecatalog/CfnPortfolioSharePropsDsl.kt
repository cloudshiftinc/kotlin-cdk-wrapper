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

  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  public fun shareTagOptions(shareTagOptions: Boolean) {
    cdkBuilder.shareTagOptions(shareTagOptions)
  }

  public fun shareTagOptions(shareTagOptions: IResolvable) {
    cdkBuilder.shareTagOptions(shareTagOptions)
  }

  public fun build(): CfnPortfolioShareProps = cdkBuilder.build()
}
