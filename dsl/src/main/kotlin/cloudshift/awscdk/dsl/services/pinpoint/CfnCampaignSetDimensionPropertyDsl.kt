@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Specifies the dimension type and values for a segment dimension.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * SetDimensionProperty setDimensionProperty = SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html)
 */
@CdkDslMarker
public class CfnCampaignSetDimensionPropertyDsl {
    private val cdkBuilder: CfnCampaign.SetDimensionProperty.Builder =
        CfnCampaign.SetDimensionProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param dimensionType The type of segment dimension to use.
     * Valid values are: `INCLUSIVE` , endpoints that match the criteria are included in the segment;
     * and, `EXCLUSIVE` , endpoints that match the criteria are excluded from the segment.
     */
    public fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
    }

    /**
     * @param values The criteria values to use for the segment dimension.
     * Depending on the value of the `DimensionType` property, endpoints are included or excluded from
     * the segment if their values match the criteria values.
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The criteria values to use for the segment dimension.
     * Depending on the value of the `DimensionType` property, endpoints are included or excluded from
     * the segment if their values match the criteria values.
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnCampaign.SetDimensionProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
