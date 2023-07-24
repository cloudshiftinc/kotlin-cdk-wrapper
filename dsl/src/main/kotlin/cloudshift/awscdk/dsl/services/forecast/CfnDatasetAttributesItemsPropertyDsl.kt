@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.forecast.CfnDataset
import kotlin.String

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.forecast.*;
 * AttributesItemsProperty attributesItemsProperty = AttributesItemsProperty.builder()
 * .attributeName("attributeName")
 * .attributeType("attributeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-attributesitems.html)
 */
@CdkDslMarker
public class CfnDatasetAttributesItemsPropertyDsl {
    private val cdkBuilder: CfnDataset.AttributesItemsProperty.Builder =
        CfnDataset.AttributesItemsProperty.builder()

    /**
     * @param attributeName Name of the dataset field.
     */
    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    /**
     * @param attributeType Data type of the field.
     */
    public fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
    }

    public fun build(): CfnDataset.AttributesItemsProperty = cdkBuilder.build()
}
