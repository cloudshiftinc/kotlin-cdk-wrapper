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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the layout a KPI visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * KPIVisualLayoutOptionsProperty kPIVisualLayoutOptionsProperty =
 * KPIVisualLayoutOptionsProperty.builder()
 * .standardLayout(KPIVisualStandardLayoutProperty.builder()
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-kpivisuallayoutoptions.html)
 */
@CdkDslMarker
public class CfnTemplateKPIVisualLayoutOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPIVisualLayoutOptionsProperty.Builder =
        CfnTemplate.KPIVisualLayoutOptionsProperty.builder()

    /** @param standardLayout The standard layout of the KPI visual. */
    public fun standardLayout(standardLayout: IResolvable) {
        cdkBuilder.standardLayout(standardLayout)
    }

    /** @param standardLayout The standard layout of the KPI visual. */
    public fun standardLayout(standardLayout: CfnTemplate.KPIVisualStandardLayoutProperty) {
        cdkBuilder.standardLayout(standardLayout)
    }

    public fun build(): CfnTemplate.KPIVisualLayoutOptionsProperty = cdkBuilder.build()
}
