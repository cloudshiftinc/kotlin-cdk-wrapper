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
 * The standard layout of the KPI visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * KPIVisualStandardLayoutProperty kPIVisualStandardLayoutProperty =
 * KPIVisualStandardLayoutProperty.builder()
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-kpivisualstandardlayout.html)
 */
@CdkDslMarker
public class CfnTemplateKPIVisualStandardLayoutPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPIVisualStandardLayoutProperty.Builder =
        CfnTemplate.KPIVisualStandardLayoutProperty.builder()

    /** @param type The standard layout type. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTemplate.KPIVisualStandardLayoutProperty = cdkBuilder.build()
}
