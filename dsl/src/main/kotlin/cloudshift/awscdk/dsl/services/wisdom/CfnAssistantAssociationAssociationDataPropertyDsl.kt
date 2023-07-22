@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation

@CdkDslMarker
public class CfnAssistantAssociationAssociationDataPropertyDsl {
  private val cdkBuilder: CfnAssistantAssociation.AssociationDataProperty.Builder =
      CfnAssistantAssociation.AssociationDataProperty.builder()

  /**
   * @param knowledgeBaseId The identifier of the knowledge base. 
   */
  public fun knowledgeBaseId(knowledgeBaseId: String) {
    cdkBuilder.knowledgeBaseId(knowledgeBaseId)
  }

  public fun build(): CfnAssistantAssociation.AssociationDataProperty = cdkBuilder.build()
}
