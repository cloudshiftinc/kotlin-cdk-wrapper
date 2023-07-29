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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of target visuals that you want to be filtered.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterOperationTargetVisualsConfigurationProperty
 * filterOperationTargetVisualsConfigurationProperty =
 * FilterOperationTargetVisualsConfigurationProperty.builder()
 * .sameSheetTargetVisualConfiguration(SameSheetTargetVisualConfigurationProperty.builder()
 * .targetVisualOptions("targetVisualOptions")
 * .targetVisuals(List.of("targetVisuals"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-filteroperationtargetvisualsconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateFilterOperationTargetVisualsConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilterOperationTargetVisualsConfigurationProperty.Builder =
        CfnTemplate.FilterOperationTargetVisualsConfigurationProperty.builder()

    /**
     * @param sameSheetTargetVisualConfiguration The configuration of the same-sheet target visuals
     *   that you want to be filtered.
     */
    public fun sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration: IResolvable) {
        cdkBuilder.sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration)
    }

    /**
     * @param sameSheetTargetVisualConfiguration The configuration of the same-sheet target visuals
     *   that you want to be filtered.
     */
    public fun sameSheetTargetVisualConfiguration(
        sameSheetTargetVisualConfiguration: CfnTemplate.SameSheetTargetVisualConfigurationProperty
    ) {
        cdkBuilder.sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration)
    }

    public fun build(): CfnTemplate.FilterOperationTargetVisualsConfigurationProperty =
        cdkBuilder.build()
}
