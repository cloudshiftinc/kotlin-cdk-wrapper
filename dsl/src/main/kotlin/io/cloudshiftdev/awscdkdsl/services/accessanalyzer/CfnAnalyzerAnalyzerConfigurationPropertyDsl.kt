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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer

/**
 * Contains information about the configuration of an unused access analyzer for an AWS organization
 * or account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.accessanalyzer.*;
 * AnalyzerConfigurationProperty analyzerConfigurationProperty =
 * AnalyzerConfigurationProperty.builder()
 * .unusedAccessConfiguration(UnusedAccessConfigurationProperty.builder()
 * .unusedAccessAge(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-analyzerconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalyzerAnalyzerConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalyzer.AnalyzerConfigurationProperty.Builder =
        CfnAnalyzer.AnalyzerConfigurationProperty.builder()

    /**
     * @param unusedAccessConfiguration Specifies the configuration of an unused access analyzer for
     *   an AWS organization or account. External access analyzers do not support any configuration.
     */
    public fun unusedAccessConfiguration(unusedAccessConfiguration: IResolvable) {
        cdkBuilder.unusedAccessConfiguration(unusedAccessConfiguration)
    }

    /**
     * @param unusedAccessConfiguration Specifies the configuration of an unused access analyzer for
     *   an AWS organization or account. External access analyzers do not support any configuration.
     */
    public fun unusedAccessConfiguration(
        unusedAccessConfiguration: CfnAnalyzer.UnusedAccessConfigurationProperty
    ) {
        cdkBuilder.unusedAccessConfiguration(unusedAccessConfiguration)
    }

    public fun build(): CfnAnalyzer.AnalyzerConfigurationProperty = cdkBuilder.build()
}
