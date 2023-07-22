@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnServiceAction

@CdkDslMarker
public class CfnServiceActionDefinitionParameterPropertyDsl {
  private val cdkBuilder: CfnServiceAction.DefinitionParameterProperty.Builder =
      CfnServiceAction.DefinitionParameterProperty.builder()

  /**
   * @param key The parameter key. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of the parameter. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnServiceAction.DefinitionParameterProperty = cdkBuilder.build()
}
