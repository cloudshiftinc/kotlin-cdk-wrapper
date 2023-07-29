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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * An object, structure, or sub-structure of an analysis, template, or dashboard.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * EntityProperty entityProperty = EntityProperty.builder()
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-entity.html)
 */
@CdkDslMarker
public class CfnTemplateEntityPropertyDsl {
    private val cdkBuilder: CfnTemplate.EntityProperty.Builder =
        CfnTemplate.EntityProperty.builder()

    /**
     * @param path The hierarchical path of the entity within the analysis, template, or dashboard
     *   definition tree.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnTemplate.EntityProperty = cdkBuilder.build()
}
