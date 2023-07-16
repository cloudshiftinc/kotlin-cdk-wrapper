@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ParameterDeclarationProperty.Builder =
      CfnTemplate.ParameterDeclarationProperty.builder()

  public fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: IResolvable) {
    cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
  }

  public
      fun dateTimeParameterDeclaration(dateTimeParameterDeclaration: CfnTemplate.DateTimeParameterDeclarationProperty) {
    cdkBuilder.dateTimeParameterDeclaration(dateTimeParameterDeclaration)
  }

  public fun decimalParameterDeclaration(decimalParameterDeclaration: IResolvable) {
    cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
  }

  public
      fun decimalParameterDeclaration(decimalParameterDeclaration: CfnTemplate.DecimalParameterDeclarationProperty) {
    cdkBuilder.decimalParameterDeclaration(decimalParameterDeclaration)
  }

  public fun integerParameterDeclaration(integerParameterDeclaration: IResolvable) {
    cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
  }

  public
      fun integerParameterDeclaration(integerParameterDeclaration: CfnTemplate.IntegerParameterDeclarationProperty) {
    cdkBuilder.integerParameterDeclaration(integerParameterDeclaration)
  }

  public fun stringParameterDeclaration(stringParameterDeclaration: IResolvable) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  public
      fun stringParameterDeclaration(stringParameterDeclaration: CfnTemplate.StringParameterDeclarationProperty) {
    cdkBuilder.stringParameterDeclaration(stringParameterDeclaration)
  }

  public fun build(): CfnTemplate.ParameterDeclarationProperty = cdkBuilder.build()
}
