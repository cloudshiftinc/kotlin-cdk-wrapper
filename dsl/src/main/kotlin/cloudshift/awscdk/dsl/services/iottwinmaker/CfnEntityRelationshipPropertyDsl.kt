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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

/**
 * The entity relationship.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * RelationshipProperty relationshipProperty = RelationshipProperty.builder()
 * .relationshipType("relationshipType")
 * .targetComponentTypeId("targetComponentTypeId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-relationship.html)
 */
@CdkDslMarker
public class CfnEntityRelationshipPropertyDsl {
    private val cdkBuilder: CfnEntity.RelationshipProperty.Builder =
        CfnEntity.RelationshipProperty.builder()

    /** @param relationshipType The relationship type. */
    public fun relationshipType(relationshipType: String) {
        cdkBuilder.relationshipType(relationshipType)
    }

    /** @param targetComponentTypeId the component type Id target. */
    public fun targetComponentTypeId(targetComponentTypeId: String) {
        cdkBuilder.targetComponentTypeId(targetComponentTypeId)
    }

    public fun build(): CfnEntity.RelationshipProperty = cdkBuilder.build()
}
