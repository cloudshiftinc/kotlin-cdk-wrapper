@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate

@CdkDslMarker
public class CfnTaskTemplateReadOnlyFieldInfoPropertyDsl {
  private val cdkBuilder: CfnTaskTemplate.ReadOnlyFieldInfoProperty.Builder =
      CfnTaskTemplate.ReadOnlyFieldInfoProperty.builder()

  /**
   * @param id Identifier of the read-only field. 
   */
  public fun id(id: IResolvable) {
    cdkBuilder.id(id)
  }

  /**
   * @param id Identifier of the read-only field. 
   */
  public fun id(id: CfnTaskTemplate.FieldIdentifierProperty) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnTaskTemplate.ReadOnlyFieldInfoProperty = cdkBuilder.build()
}
