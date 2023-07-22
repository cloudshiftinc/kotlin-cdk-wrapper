@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation
import software.constructs.Construct

/**
 * Associates the specified principal ARN with the specified portfolio.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnPortfolioPrincipalAssociation cfnPortfolioPrincipalAssociation =
 * CfnPortfolioPrincipalAssociation.Builder.create(this, "MyCfnPortfolioPrincipalAssociation")
 * .portfolioId("portfolioId")
 * .principalArn("principalArn")
 * .principalType("principalType")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html)
 */
@CdkDslMarker
public class CfnPortfolioPrincipalAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPortfolioPrincipalAssociation.Builder =
      CfnPortfolioPrincipalAssociation.Builder.create(scope, id)

  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-acceptlanguage)
   * @param acceptLanguage The language code. 
   */
  public fun acceptLanguage(acceptLanguage: String) {
    cdkBuilder.acceptLanguage(acceptLanguage)
  }

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-portfolioid)
   * @param portfolioId The portfolio identifier. 
   */
  public fun portfolioId(portfolioId: String) {
    cdkBuilder.portfolioId(portfolioId)
  }

  /**
   * The ARN of the principal ( IAM user, role, or group).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principalarn)
   * @param principalArn The ARN of the principal ( IAM user, role, or group). 
   */
  public fun principalArn(principalArn: String) {
    cdkBuilder.principalArn(principalArn)
  }

  /**
   * The principal type. The supported value is `IAM` .
   *
   * *Allowed Values* : `IAM`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html#cfn-servicecatalog-portfolioprincipalassociation-principaltype)
   * @param principalType The principal type. The supported value is `IAM` . 
   */
  public fun principalType(principalType: String) {
    cdkBuilder.principalType(principalType)
  }

  public fun build(): CfnPortfolioPrincipalAssociation = cdkBuilder.build()
}
