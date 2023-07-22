@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ParameterDeclarationProperty.Builder =
      CfnDashboard.ParameterDeclarationProperty.builder()

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
      fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: CfnDashboard.DateTimeParameterDeclarationProperty) {
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
      fun decimalParameterDeclaration(decimalParameterDeclaration: CfnDashboard.DecimalParameterDeclarationProperty) {
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
      fun integerParameterDeclaration(integerParameterDeclaration: CfnDashboard.IntegerParameterDeclarationProperty) {
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
      fun stringParameterDeclaration(stringParameterDeclaration: CfnDashboard.StringParameterDeclarationProperty) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  public fun build(): CfnDashboard.ParameterDeclarationProperty = cdkBuilder.build()
}
