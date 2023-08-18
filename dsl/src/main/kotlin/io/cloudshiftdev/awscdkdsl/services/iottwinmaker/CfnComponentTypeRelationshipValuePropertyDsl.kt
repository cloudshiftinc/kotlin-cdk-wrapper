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

package io.cloudshiftdev.awscdkdsl.services.iottwinmaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

/**
 * The component type relationship value.
 *
 * Example:
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-relationshipvalue.html)
 */
@CdkDslMarker
public class CfnComponentTypeRelationshipValuePropertyDsl {
    private val cdkBuilder: CfnComponentType.RelationshipValueProperty.Builder =
        CfnComponentType.RelationshipValueProperty.builder()

    /** @param targetComponentName The target component name. */
    public fun targetComponentName(targetComponentName: String) {
        cdkBuilder.targetComponentName(targetComponentName)
    }

    /** @param targetEntityId The target entity Id. */
    public fun targetEntityId(targetEntityId: String) {
        cdkBuilder.targetEntityId(targetEntityId)
    }

    public fun build(): CfnComponentType.RelationshipValueProperty = cdkBuilder.build()
}
