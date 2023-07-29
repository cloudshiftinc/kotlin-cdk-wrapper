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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

/**
 * Filtering that specifies which web requests are kept in the logs and which are dropped, defined
 * for a web ACL's `LoggingConfiguration` .
 *
 * You can filter on the rule action and on the web request labels that were applied by matching
 * rules during web ACL evaluation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * LoggingFilterProperty loggingFilterProperty = LoggingFilterProperty.builder()
 * .defaultBehavior("defaultBehavior")
 * .filters(List.of(FilterProperty.builder()
 * .behavior("behavior")
 * .conditions(List.of(ConditionProperty.builder()
 * .actionCondition(ActionConditionProperty.builder()
 * .action("action")
 * .build())
 * .labelNameCondition(LabelNameConditionProperty.builder()
 * .labelName("labelName")
 * .build())
 * .build()))
 * .requirement("requirement")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-loggingfilter.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationLoggingFilterPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.LoggingFilterProperty.Builder =
        CfnLoggingConfiguration.LoggingFilterProperty.builder()

    private val _filters: MutableList<Any> = mutableListOf()

    /**
     * @param defaultBehavior Default handling for logs that don't match any of the specified
     *   filtering conditions.
     */
    public fun defaultBehavior(defaultBehavior: String) {
        cdkBuilder.defaultBehavior(defaultBehavior)
    }

    /** @param filters The filters that you want to apply to the logs. */
    public fun filters(vararg filters: Any) {
        _filters.addAll(listOf(*filters))
    }

    /** @param filters The filters that you want to apply to the logs. */
    public fun filters(filters: Collection<Any>) {
        _filters.addAll(filters)
    }

    /** @param filters The filters that you want to apply to the logs. */
    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
    }

    public fun build(): CfnLoggingConfiguration.LoggingFilterProperty {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
