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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer

/**
 * The criteria for an archive rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.accessanalyzer.*;
 * ArchiveRuleProperty archiveRuleProperty = ArchiveRuleProperty.builder()
 * .filter(List.of(FilterProperty.builder()
 * .property("property")
 * // the properties below are optional
 * .contains(List.of("contains"))
 * .eq(List.of("eq"))
 * .exists(false)
 * .neq(List.of("neq"))
 * .build()))
 * .ruleName("ruleName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-accessanalyzer-analyzer-archiverule.html)
 */
@CdkDslMarker
public class CfnAnalyzerArchiveRulePropertyDsl {
    private val cdkBuilder: CfnAnalyzer.ArchiveRuleProperty.Builder =
        CfnAnalyzer.ArchiveRuleProperty.builder()

    private val _filter: MutableList<Any> = mutableListOf()

    /** @param filter The criteria for the rule. */
    public fun filter(vararg filter: Any) {
        _filter.addAll(listOf(*filter))
    }

    /** @param filter The criteria for the rule. */
    public fun filter(filter: Collection<Any>) {
        _filter.addAll(filter)
    }

    /** @param filter The criteria for the rule. */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /** @param ruleName The name of the archive rule. */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun build(): CfnAnalyzer.ArchiveRuleProperty {
        if (_filter.isNotEmpty()) cdkBuilder.filter(_filter)
        return cdkBuilder.build()
    }
}
