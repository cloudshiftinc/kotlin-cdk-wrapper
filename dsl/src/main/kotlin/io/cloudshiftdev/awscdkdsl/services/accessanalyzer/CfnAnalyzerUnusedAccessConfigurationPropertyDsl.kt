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

package io.cloudshiftdev.awscdkdsl.services.accessanalyzer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer

/**
 * Contains information about an unused access analyzer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.accessanalyzer.*;
 * UnusedAccessConfigurationProperty unusedAccessConfigurationProperty =
 * UnusedAccessConfigurationProperty.builder()
 * .unusedAccessAge(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-unusedaccessconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalyzerUnusedAccessConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalyzer.UnusedAccessConfigurationProperty.Builder =
        CfnAnalyzer.UnusedAccessConfigurationProperty.builder()

    /**
     * @param unusedAccessAge The specified access age in days for which to generate findings for
     *   unused access. For example, if you specify 90 days, the analyzer will generate findings for
     *   IAM entities within the accounts of the selected organization for any access that hasn't
     *   been used in 90 or more days since the analyzer's last scan. You can choose a value between
     *   1 and 180 days.
     */
    public fun unusedAccessAge(unusedAccessAge: Number) {
        cdkBuilder.unusedAccessAge(unusedAccessAge)
    }

    public fun build(): CfnAnalyzer.UnusedAccessConfigurationProperty = cdkBuilder.build()
}
