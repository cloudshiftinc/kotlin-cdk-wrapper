@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ParameterDeclarationProperty.Builder =
      CfnAnalysis.ParameterDeclarationProperty.builder()

  public fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: IResolvable) {
    cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
  }

  public
      fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: CfnAnalysis.DateTimeParameterDeclarationProperty) {
    cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
  }

  public fun decimalParameterDeclaration(decimalParameterDeclaration: IResolvable) {
    cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
  }

  public
      fun decimalParameterDeclaration(decimalParameterDeclaration: CfnAnalysis.DecimalParameterDeclarationProperty) {
    cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
  }

  public fun integerParameterDeclaration(integerParameterDeclaration: IResolvable) {
    cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
  }

  public
      fun integerParameterDeclaration(integerParameterDeclaration: CfnAnalysis.IntegerParameterDeclarationProperty) {
    cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
  }

  public fun stringParameterDeclaration(stringParameterDeclaration: IResolvable) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  public
      fun stringParameterDeclaration(stringParameterDeclaration: CfnAnalysis.StringParameterDeclarationProperty) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  public fun build(): CfnAnalysis.ParameterDeclarationProperty = cdkBuilder.build()
}
