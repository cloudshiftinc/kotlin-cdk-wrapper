@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare
import software.constructs.Construct

@CdkDslMarker
public class CfnPortfolioShareDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPortfolioShare.Builder = CfnPortfolioShare.Builder.create(scope, id)

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

  public fun build(): CfnPortfolioShare = cdkBuilder.build()
}
