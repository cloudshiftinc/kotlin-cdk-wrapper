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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a named entity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NamedEntityDefinitionProperty namedEntityDefinitionProperty =
 * NamedEntityDefinitionProperty.builder()
 * .fieldName("fieldName")
 * .metric(NamedEntityDefinitionMetricProperty.builder()
 * .aggregation("aggregation")
 * .aggregationFunctionParameters(Map.of(
 * "aggregationFunctionParametersKey", "aggregationFunctionParameters"))
 * .build())
 * .propertyName("propertyName")
 * .propertyRole("propertyRole")
 * .propertyUsage("propertyUsage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html)
 */
@CdkDslMarker
public class CfnTopicNamedEntityDefinitionPropertyDsl {
    private val cdkBuilder: CfnTopic.NamedEntityDefinitionProperty.Builder =
        CfnTopic.NamedEntityDefinitionProperty.builder()

    /** @param fieldName The name of the entity. */
    public fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
    }

    /** @param metric The definition of a metric. */
    public fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric)
    }

    /** @param metric The definition of a metric. */
    public fun metric(metric: CfnTopic.NamedEntityDefinitionMetricProperty) {
        cdkBuilder.metric(metric)
    }

    /** @param propertyName The property name to be used for the named entity. */
    public fun propertyName(propertyName: String) {
        cdkBuilder.propertyName(propertyName)
    }

    /**
     * @param propertyRole The property role. Valid values for this structure are `PRIMARY` and `ID`
     *   .
     */
    public fun propertyRole(propertyRole: String) {
        cdkBuilder.propertyRole(propertyRole)
    }

    /**
     * @param propertyUsage The property usage. Valid values for this structure are `INHERIT` ,
     *   `DIMENSION` , and `MEASURE` .
     */
    public fun propertyUsage(propertyUsage: String) {
        cdkBuilder.propertyUsage(propertyUsage)
    }

    public fun build(): CfnTopic.NamedEntityDefinitionProperty = cdkBuilder.build()
}
