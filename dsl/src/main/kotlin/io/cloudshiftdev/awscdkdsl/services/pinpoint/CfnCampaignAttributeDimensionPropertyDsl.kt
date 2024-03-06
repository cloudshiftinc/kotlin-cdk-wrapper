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

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * AttributeDimensionProperty attributeDimensionProperty = AttributeDimensionProperty.builder()
 * .attributeType("attributeType")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-attributedimension.html)
 */
@CdkDslMarker
public class CfnCampaignAttributeDimensionPropertyDsl {
    private val cdkBuilder: CfnCampaign.AttributeDimensionProperty.Builder =
        CfnCampaign.AttributeDimensionProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /** @param attributeType the value to be set. */
    public fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
    }

    /** @param values the value to be set. */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /** @param values the value to be set. */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnCampaign.AttributeDimensionProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
