@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate

@CdkDslMarker
public class CfnTaskTemplateInvisibleFieldInfoPropertyDsl {
  private val cdkBuilder: CfnTaskTemplate.InvisibleFieldInfoProperty.Builder =
      CfnTaskTemplate.InvisibleFieldInfoProperty.builder()

  /**
   * @param id Identifier of the invisible field. 
   */
  public fun id(id: IResolvable) {
    cdkBuilder.id(id)
  }

  /**
   * @param id Identifier of the invisible field. 
   */
  public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnTaskTemplate.InvisibleFieldInfoProperty = cdkBuilder.build()
}
