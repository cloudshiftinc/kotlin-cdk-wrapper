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

package io.cloudshiftdev.awscdkdsl.services.comprehend

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.comprehend.CfnFlywheel

/**
 * An entity type within a labeled training dataset that Amazon Comprehend uses to train a custom
 * entity recognizer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.comprehend.*;
 * EntityTypesListItemProperty entityTypesListItemProperty = EntityTypesListItemProperty.builder()
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entitytypeslistitem.html)
 */
@CdkDslMarker
public class CfnFlywheelEntityTypesListItemPropertyDsl {
    private val cdkBuilder: CfnFlywheel.EntityTypesListItemProperty.Builder =
        CfnFlywheel.EntityTypesListItemProperty.builder()

    /**
     * @param type An entity type within a labeled training dataset that Amazon Comprehend uses to
     *   train a custom entity recognizer. Entity types must not contain the following invalid
     *   characters: \n (line break), \n (escaped line break, \r (carriage return), \r (escaped
     *   carriage return), \t (tab), \t (escaped tab), space, and , (comma).
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnFlywheel.EntityTypesListItemProperty = cdkBuilder.build()
}
