@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wisdom.CfnAssistantAssociation

/**
 * A union type that currently has a single argument, which is the knowledge base ID.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wisdom.*;
 * AssociationDataProperty associationDataProperty = AssociationDataProperty.builder()
 * .knowledgeBaseId("knowledgeBaseId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wisdom-assistantassociation-associationdata.html)
 */
@CdkDslMarker
public class CfnAssistantAssociationAssociationDataPropertyDsl {
    private val cdkBuilder: CfnAssistantAssociation.AssociationDataProperty.Builder =
        CfnAssistantAssociation.AssociationDataProperty.builder()

    /** @param knowledgeBaseId The identifier of the knowledge base. */
    public fun knowledgeBaseId(knowledgeBaseId: String) {
        cdkBuilder.knowledgeBaseId(knowledgeBaseId)
    }

    public fun build(): CfnAssistantAssociation.AssociationDataProperty = cdkBuilder.build()
}
