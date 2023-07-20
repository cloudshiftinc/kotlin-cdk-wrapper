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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import kotlin.String

@CdkDslMarker
public class CfnComponentTypeRelationshipValuePropertyDsl {
    private val cdkBuilder: CfnComponentType.RelationshipValueProperty.Builder =
        CfnComponentType.RelationshipValueProperty.builder()

    public fun targetComponentName(targetComponentName: String) {
        cdkBuilder.targetComponentName(targetComponentName)
    }

    public fun targetEntityId(targetEntityId: String) {
        cdkBuilder.targetEntityId(targetEntityId)
    }

    public fun build(): CfnComponentType.RelationshipValueProperty = cdkBuilder.build()
}
