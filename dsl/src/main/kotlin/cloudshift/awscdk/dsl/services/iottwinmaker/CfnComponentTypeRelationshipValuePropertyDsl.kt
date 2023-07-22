@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypeRelationshipValuePropertyDsl {
  private val cdkBuilder: CfnComponentType.RelationshipValueProperty.Builder =
      CfnComponentType.RelationshipValueProperty.builder()

  /**
   * @param targetComponentName The target component name.
   */
  public fun targetComponentName(targetComponentName: String) {
    cdkBuilder.targetComponentName(targetComponentName)
  }

  /**
   * @param targetEntityId The target entity Id.
   */
  public fun targetEntityId(targetEntityId: String) {
    cdkBuilder.targetEntityId(targetEntityId)
  }

  public fun build(): CfnComponentType.RelationshipValueProperty = cdkBuilder.build()
}
