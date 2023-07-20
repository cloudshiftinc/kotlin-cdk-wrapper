@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare
import software.constructs.Construct

@CdkDslMarker
public class CfnAcceptedPortfolioShareDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAcceptedPortfolioShare.Builder =
      CfnAcceptedPortfolioShare.Builder.create(scope, id)

  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  public fun build(): CfnAcceptedPortfolioShare = cdkBuilder.build()
}
