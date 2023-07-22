@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps

@CdkDslMarker
public class CfnPortfolioPrincipalAssociationPropsDsl {
  private val cdkBuilder: CfnPortfolioPrincipalAssociationProps.Builder =
      CfnPortfolioPrincipalAssociationProps.builder()

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
   * @param principalArn The ARN of the principal ( IAM user, role, or group). 
   */
  public fun principalArn(principalArn: String) {
    cdkBuilder.principalArn(principalArn)
  }

  /**
   * @param principalType The principal type. The supported value is `IAM` . 
   * *Allowed Values* : `IAM`
   */
  public fun principalType(principalType: String) {
    cdkBuilder.principalType(principalType)
  }

  public fun build(): CfnPortfolioPrincipalAssociationProps = cdkBuilder.build()
}
