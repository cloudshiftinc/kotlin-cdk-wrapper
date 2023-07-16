@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps

@CdkDslMarker
public class CfnPortfolioPrincipalAssociationPropsDsl {
  private val cdkBuilder: CfnPortfolioPrincipalAssociationProps.Builder =
      CfnPortfolioPrincipalAssociationProps.builder()

  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  public fun principalArn(principalArn: String) {
    cdkBuilder.principalArn(principalArn)
  }

  public fun principalType(principalType: String) {
    cdkBuilder.principalType(principalType)
  }

  public fun build(): CfnPortfolioPrincipalAssociationProps = cdkBuilder.build()
}
