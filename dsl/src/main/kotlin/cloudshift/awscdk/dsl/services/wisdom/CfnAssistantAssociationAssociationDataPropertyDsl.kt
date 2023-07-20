@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation
import kotlin.String

@CdkDslMarker
public class CfnAssistantAssociationAssociationDataPropertyDsl {
    private val cdkBuilder: CfnAssistantAssociation.AssociationDataProperty.Builder =
        CfnAssistantAssociation.AssociationDataProperty.builder()

    public fun knowledgeBaseId(knowledgeBaseId: String) {
        cdkBuilder.knowledgeBaseId(knowledgeBaseId)
    }

    public fun build(): CfnAssistantAssociation.AssociationDataProperty = cdkBuilder.build()
}
