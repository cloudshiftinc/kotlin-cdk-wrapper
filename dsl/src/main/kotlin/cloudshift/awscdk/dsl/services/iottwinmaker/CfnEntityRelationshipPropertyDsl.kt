@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityRelationshipPropertyDsl {
  private val cdkBuilder: CfnEntity.RelationshipProperty.Builder =
      CfnEntity.RelationshipProperty.builder()

  /**
   * @param relationshipType The relationship type.
   */
  public fun relationshipType(relationshipType: String) {
    cdkBuilder.relationshipType(relationshipType)
  }

  /**
   * @param targetComponentTypeId the component type Id target.
   */
  public fun targetComponentTypeId(targetComponentTypeId: String) {
    cdkBuilder.targetComponentTypeId(targetComponentTypeId)
  }

  public fun build(): CfnEntity.RelationshipProperty = cdkBuilder.build()
}
