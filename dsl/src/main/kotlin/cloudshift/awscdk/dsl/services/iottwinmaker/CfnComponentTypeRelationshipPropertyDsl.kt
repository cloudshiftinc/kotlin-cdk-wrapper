@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypeRelationshipPropertyDsl {
  private val cdkBuilder: CfnComponentType.RelationshipProperty.Builder =
      CfnComponentType.RelationshipProperty.builder()

  public fun relationshipType(relationshipType: String) {
    cdkBuilder.relationshipType(relationshipType)
  }

  public fun targetComponentTypeId(targetComponentTypeId: String) {
    cdkBuilder.targetComponentTypeId(targetComponentTypeId)
  }

  public fun build(): CfnComponentType.RelationshipProperty = cdkBuilder.build()
}
