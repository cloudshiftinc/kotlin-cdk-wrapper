@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

/**
 * The entity relationship.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * RelationshipValueProperty relationshipValueProperty = RelationshipValueProperty.builder()
 * .targetComponentName("targetComponentName")
 * .targetEntityId("targetEntityId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationshipvalue.html)
 */
@CdkDslMarker
public class CfnEntityRelationshipValuePropertyDsl {
  private val cdkBuilder: CfnEntity.RelationshipValueProperty.Builder =
      CfnEntity.RelationshipValueProperty.builder()

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

  public fun build(): CfnEntity.RelationshipValueProperty = cdkBuilder.build()
}
