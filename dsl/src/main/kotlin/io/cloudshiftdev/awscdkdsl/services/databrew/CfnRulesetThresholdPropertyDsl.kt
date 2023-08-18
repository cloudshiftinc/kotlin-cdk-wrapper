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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnRuleset

/**
 * The threshold used with a non-aggregate check expression.
 *
 * The non-aggregate check expression will be applied to each row in a specific column. Then the
 * threshold will be used to determine whether the validation succeeds.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * ThresholdProperty thresholdProperty = ThresholdProperty.builder()
 * .value(123)
 * // the properties below are optional
 * .type("type")
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-ruleset-threshold.html)
 */
@CdkDslMarker
public class CfnRulesetThresholdPropertyDsl {
    private val cdkBuilder: CfnRuleset.ThresholdProperty.Builder =
        CfnRuleset.ThresholdProperty.builder()

    /**
     * @param type The type of a threshold. Used for comparison of an actual count of rows that
     *   satisfy the rule to the threshold value.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param unit Unit of threshold value. Can be either a COUNT or PERCENTAGE of the full sample
     *   size used for validation.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    /** @param value The value of a threshold. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRuleset.ThresholdProperty = cdkBuilder.build()
}
