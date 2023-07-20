@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ParameterDeclarationProperty.Builder =
      CfnDashboard.ParameterDeclarationProperty.builder()

  public fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: IResolvable) {
    cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
  }

  public
      fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: CfnDashboard.DateTimeParameterDeclarationProperty) {
    cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
  }

  public fun decimalParameterDeclaration(decimalParameterDeclaration: IResolvable) {
    cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
  }

  public
      fun decimalParameterDeclaration(decimalParameterDeclaration: CfnDashboard.DecimalParameterDeclarationProperty) {
    cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
  }

  public fun integerParameterDeclaration(integerParameterDeclaration: IResolvable) {
    cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
  }

  public
      fun integerParameterDeclaration(integerParameterDeclaration: CfnDashboard.IntegerParameterDeclarationProperty) {
    cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
  }

  public fun stringParameterDeclaration(stringParameterDeclaration: IResolvable) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  public
      fun stringParameterDeclaration(stringParameterDeclaration: CfnDashboard.StringParameterDeclarationProperty) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  public fun build(): CfnDashboard.ParameterDeclarationProperty = cdkBuilder.build()
}
