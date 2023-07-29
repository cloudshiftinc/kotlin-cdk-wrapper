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
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

/**
 * An object that specifies a relationship with another component type.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationship.html)
 */
@CdkDslMarker
public class CfnComponentTypeRelationshipPropertyDsl {
    private val cdkBuilder: CfnComponentType.RelationshipProperty.Builder =
        CfnComponentType.RelationshipProperty.builder()

    /** @param relationshipType The type of the relationship. */
    public fun relationshipType(relationshipType: String) {
        cdkBuilder.relationshipType(relationshipType)
    }

    /**
     * @param targetComponentTypeId The ID of the target component type associated with this
     *   relationship.
     */
    public fun targetComponentTypeId(targetComponentTypeId: String) {
        cdkBuilder.targetComponentTypeId(targetComponentTypeId)
    }

    public fun build(): CfnComponentType.RelationshipProperty = cdkBuilder.build()
}
