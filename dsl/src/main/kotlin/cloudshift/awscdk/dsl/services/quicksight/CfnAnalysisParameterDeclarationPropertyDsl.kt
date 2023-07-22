@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ParameterDeclarationProperty.Builder =
      CfnAnalysis.ParameterDeclarationProperty.builder()

  /**
   * @param dateTimeParameterDeclaration A parameter declaration for the `DateTime` data type.
   */
  public fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: IResolvable) {
    cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
  }

  /**
   * @param dateTimeParameterDeclaration A parameter declaration for the `DateTime` data type.
   */
  public
      fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: CfnAnalysis.DateTimeParameterDeclarationProperty) {
    cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
  }

  /**
   * @param decimalParameterDeclaration A parameter declaration for the `Decimal` data type.
   */
  public fun decimalParameterDeclaration(decimalParameterDeclaration: IResolvable) {
    cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
  }

  /**
   * @param decimalParameterDeclaration A parameter declaration for the `Decimal` data type.
   */
  public
      fun decimalParameterDeclaration(decimalParameterDeclaration: CfnAnalysis.DecimalParameterDeclarationProperty) {
    cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
  }

  /**
   * @param integerParameterDeclaration A parameter declaration for the `Integer` data type.
   */
  public fun integerParameterDeclaration(integerParameterDeclaration: IResolvable) {
    cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
  }

  /**
   * @param integerParameterDeclaration A parameter declaration for the `Integer` data type.
   */
  public
      fun integerParameterDeclaration(integerParameterDeclaration: CfnAnalysis.IntegerParameterDeclarationProperty) {
    cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
  }

  /**
   * @param stringParameterDeclaration A parameter declaration for the `String` data type.
   */
  public fun stringParameterDeclaration(stringParameterDeclaration: IResolvable) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  /**
   * @param stringParameterDeclaration A parameter declaration for the `String` data type.
   */
  public
      fun stringParameterDeclaration(stringParameterDeclaration: CfnAnalysis.StringParameterDeclarationProperty) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  public fun build(): CfnAnalysis.ParameterDeclarationProperty = cdkBuilder.build()
}
