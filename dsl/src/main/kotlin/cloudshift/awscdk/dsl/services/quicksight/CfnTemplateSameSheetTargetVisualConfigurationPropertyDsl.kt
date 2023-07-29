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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of the same-sheet target visuals that you want to be filtered.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SameSheetTargetVisualConfigurationProperty sameSheetTargetVisualConfigurationProperty =
 * SameSheetTargetVisualConfigurationProperty.builder()
 * .targetVisualOptions("targetVisualOptions")
 * .targetVisuals(List.of("targetVisuals"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-samesheettargetvisualconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateSameSheetTargetVisualConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.SameSheetTargetVisualConfigurationProperty.Builder =
        CfnTemplate.SameSheetTargetVisualConfigurationProperty.builder()

    private val _targetVisuals: MutableList<String> = mutableListOf()

    /**
     * @param targetVisualOptions The options that choose the target visual in the same sheet. Valid
     *   values are defined as follows:
     * * `ALL_VISUALS` : Applies the filter operation to all visuals in the same sheet.
     */
    public fun targetVisualOptions(targetVisualOptions: String) {
        cdkBuilder.targetVisualOptions(targetVisualOptions)
    }

    /**
     * @param targetVisuals A list of the target visual IDs that are located in the same sheet of
     *   the analysis.
     */
    public fun targetVisuals(vararg targetVisuals: String) {
        _targetVisuals.addAll(listOf(*targetVisuals))
    }

    /**
     * @param targetVisuals A list of the target visual IDs that are located in the same sheet of
     *   the analysis.
     */
    public fun targetVisuals(targetVisuals: Collection<String>) {
        _targetVisuals.addAll(targetVisuals)
    }

    public fun build(): CfnTemplate.SameSheetTargetVisualConfigurationProperty {
        if (_targetVisuals.isNotEmpty()) cdkBuilder.targetVisuals(_targetVisuals)
        return cdkBuilder.build()
    }
}
