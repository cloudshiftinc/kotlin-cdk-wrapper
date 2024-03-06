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

package io.cloudshiftdev.awscdkdsl.services.cleanrooms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable

/**
 * A type of analysis rule that enables the table owner to approve custom SQL queries on their
 * configured tables.
 *
 * It supports differential privacy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cleanrooms.*;
 * AnalysisRuleCustomProperty analysisRuleCustomProperty = AnalysisRuleCustomProperty.builder()
 * .allowedAnalyses(List.of("allowedAnalyses"))
 * // the properties below are optional
 * .allowedAnalysisProviders(List.of("allowedAnalysisProviders"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtable-analysisrulecustom.html)
 */
@CdkDslMarker
public class CfnConfiguredTableAnalysisRuleCustomPropertyDsl {
    private val cdkBuilder: CfnConfiguredTable.AnalysisRuleCustomProperty.Builder =
        CfnConfiguredTable.AnalysisRuleCustomProperty.builder()

    private val _allowedAnalyses: MutableList<String> = mutableListOf()

    private val _allowedAnalysisProviders: MutableList<String> = mutableListOf()

    /**
     * @param allowedAnalyses The ARN of the analysis templates that are allowed by the custom
     *   analysis rule.
     */
    public fun allowedAnalyses(vararg allowedAnalyses: String) {
        _allowedAnalyses.addAll(listOf(*allowedAnalyses))
    }

    /**
     * @param allowedAnalyses The ARN of the analysis templates that are allowed by the custom
     *   analysis rule.
     */
    public fun allowedAnalyses(allowedAnalyses: Collection<String>) {
        _allowedAnalyses.addAll(allowedAnalyses)
    }

    /**
     * @param allowedAnalysisProviders The IDs of the AWS accounts that are allowed to query by the
     *   custom analysis rule. Required when `allowedAnalyses` is `ANY_QUERY` .
     */
    public fun allowedAnalysisProviders(vararg allowedAnalysisProviders: String) {
        _allowedAnalysisProviders.addAll(listOf(*allowedAnalysisProviders))
    }

    /**
     * @param allowedAnalysisProviders The IDs of the AWS accounts that are allowed to query by the
     *   custom analysis rule. Required when `allowedAnalyses` is `ANY_QUERY` .
     */
    public fun allowedAnalysisProviders(allowedAnalysisProviders: Collection<String>) {
        _allowedAnalysisProviders.addAll(allowedAnalysisProviders)
    }

    public fun build(): CfnConfiguredTable.AnalysisRuleCustomProperty {
        if (_allowedAnalyses.isNotEmpty()) cdkBuilder.allowedAnalyses(_allowedAnalyses)
        if (_allowedAnalysisProviders.isNotEmpty())
            cdkBuilder.allowedAnalysisProviders(_allowedAnalysisProviders)
        return cdkBuilder.build()
    }
}
