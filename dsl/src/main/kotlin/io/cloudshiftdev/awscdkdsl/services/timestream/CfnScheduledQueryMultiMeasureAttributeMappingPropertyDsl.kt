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

package io.cloudshiftdev.awscdkdsl.services.timestream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * Attribute mapping for MULTI value measures.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * MultiMeasureAttributeMappingProperty multiMeasureAttributeMappingProperty =
 * MultiMeasureAttributeMappingProperty.builder()
 * .measureValueType("measureValueType")
 * .sourceColumn("sourceColumn")
 * // the properties below are optional
 * .targetMultiMeasureAttributeName("targetMultiMeasureAttributeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-multimeasureattributemapping.html)
 */
@CdkDslMarker
public class CfnScheduledQueryMultiMeasureAttributeMappingPropertyDsl {
    private val cdkBuilder: CfnScheduledQuery.MultiMeasureAttributeMappingProperty.Builder =
        CfnScheduledQuery.MultiMeasureAttributeMappingProperty.builder()

    /** @param measureValueType Type of the attribute to be read from the source column. */
    public fun measureValueType(measureValueType: String) {
        cdkBuilder.measureValueType(measureValueType)
    }

    /** @param sourceColumn Source column from where the attribute value is to be read. */
    public fun sourceColumn(sourceColumn: String) {
        cdkBuilder.sourceColumn(sourceColumn)
    }

    /**
     * @param targetMultiMeasureAttributeName Custom name to be used for attribute name in derived
     *   table. If not provided, source column name would be used.
     */
    public fun targetMultiMeasureAttributeName(targetMultiMeasureAttributeName: String) {
        cdkBuilder.targetMultiMeasureAttributeName(targetMultiMeasureAttributeName)
    }

    public fun build(): CfnScheduledQuery.MultiMeasureAttributeMappingProperty = cdkBuilder.build()
}
