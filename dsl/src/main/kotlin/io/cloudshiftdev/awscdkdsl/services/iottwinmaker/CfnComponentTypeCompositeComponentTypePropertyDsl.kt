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
 * Specifies the ID of the composite component type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * CompositeComponentTypeProperty compositeComponentTypeProperty =
 * CompositeComponentTypeProperty.builder()
 * .componentTypeId("componentTypeId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-compositecomponenttype.html)
 */
@CdkDslMarker
public class CfnComponentTypeCompositeComponentTypePropertyDsl {
    private val cdkBuilder: CfnComponentType.CompositeComponentTypeProperty.Builder =
        CfnComponentType.CompositeComponentTypeProperty.builder()

    /** @param componentTypeId The ID of the component type. */
    public fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
    }

    public fun build(): CfnComponentType.CompositeComponentTypeProperty = cdkBuilder.build()
}
