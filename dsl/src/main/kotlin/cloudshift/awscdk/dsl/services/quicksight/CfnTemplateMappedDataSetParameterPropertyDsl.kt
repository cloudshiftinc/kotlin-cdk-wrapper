@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * A dataset parameter that is mapped to an analysis parameter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * MappedDataSetParameterProperty mappedDataSetParameterProperty =
 * MappedDataSetParameterProperty.builder()
 * .dataSetIdentifier("dataSetIdentifier")
 * .dataSetParameterName("dataSetParameterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-mappeddatasetparameter.html)
 */
@CdkDslMarker
public class CfnTemplateMappedDataSetParameterPropertyDsl {
    private val cdkBuilder: CfnTemplate.MappedDataSetParameterProperty.Builder =
        CfnTemplate.MappedDataSetParameterProperty.builder()

    /**
     * @param dataSetIdentifier A unique name that identifies a dataset within the analysis or
     * dashboard.
     */
    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    /**
     * @param dataSetParameterName The name of the dataset parameter.
     */
    public fun dataSetParameterName(dataSetParameterName: String) {
        cdkBuilder.dataSetParameterName(dataSetParameterName)
    }

    public fun build(): CfnTemplate.MappedDataSetParameterProperty = cdkBuilder.build()
}
