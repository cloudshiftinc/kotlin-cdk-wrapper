@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityRelationshipValuePropertyDsl {
  private val cdkBuilder: CfnEntity.RelationshipValueProperty.Builder =
      CfnEntity.RelationshipValueProperty.builder()

  public fun targetComponentName(targetComponentName: String) {
    cdkBuilder.targetComponentName(targetComponentName)
  }

  public fun targetEntityId(targetEntityId: String) {
    cdkBuilder.targetEntityId(targetEntityId)
  }

  public fun build(): CfnEntity.RelationshipValueProperty = cdkBuilder.build()
}
