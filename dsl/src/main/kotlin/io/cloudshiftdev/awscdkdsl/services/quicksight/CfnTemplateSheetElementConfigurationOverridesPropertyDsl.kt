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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The override configuration of the rendering rules of a sheet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetElementConfigurationOverridesProperty sheetElementConfigurationOverridesProperty =
 * SheetElementConfigurationOverridesProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-sheetelementconfigurationoverrides.html)
 */
@CdkDslMarker
public class CfnTemplateSheetElementConfigurationOverridesPropertyDsl {
    private val cdkBuilder: CfnTemplate.SheetElementConfigurationOverridesProperty.Builder =
        CfnTemplate.SheetElementConfigurationOverridesProperty.builder()

    /**
     * @param visibility Determines whether or not the overrides are visible. Choose one of the
     *   following options:.
     * * `VISIBLE`
     * * `HIDDEN`
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.SheetElementConfigurationOverridesProperty = cdkBuilder.build()
}
