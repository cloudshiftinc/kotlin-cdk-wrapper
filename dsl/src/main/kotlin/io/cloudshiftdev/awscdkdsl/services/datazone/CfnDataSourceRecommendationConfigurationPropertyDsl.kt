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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * The recommendation configuration for the data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * RecommendationConfigurationProperty recommendationConfigurationProperty =
 * RecommendationConfigurationProperty.builder()
 * .enableBusinessNameGeneration(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-recommendationconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceRecommendationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.RecommendationConfigurationProperty.Builder =
        CfnDataSource.RecommendationConfigurationProperty.builder()

    /**
     * @param enableBusinessNameGeneration Specifies whether automatic business name generation is
     *   to be enabled or not as part of the recommendation configuration.
     */
    public fun enableBusinessNameGeneration(enableBusinessNameGeneration: Boolean) {
        cdkBuilder.enableBusinessNameGeneration(enableBusinessNameGeneration)
    }

    /**
     * @param enableBusinessNameGeneration Specifies whether automatic business name generation is
     *   to be enabled or not as part of the recommendation configuration.
     */
    public fun enableBusinessNameGeneration(enableBusinessNameGeneration: IResolvable) {
        cdkBuilder.enableBusinessNameGeneration(enableBusinessNameGeneration)
    }

    public fun build(): CfnDataSource.RecommendationConfigurationProperty = cdkBuilder.build()
}
