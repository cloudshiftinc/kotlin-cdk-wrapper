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

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnPlaceIndex

/**
 * Specifies the data storage option requesting Places.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * DataSourceConfigurationProperty dataSourceConfigurationProperty =
 * DataSourceConfigurationProperty.builder()
 * .intendedUse("intendedUse")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-placeindex-datasourceconfiguration.html)
 */
@CdkDslMarker
public class CfnPlaceIndexDataSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnPlaceIndex.DataSourceConfigurationProperty.Builder =
        CfnPlaceIndex.DataSourceConfigurationProperty.builder()

    /**
     * @param intendedUse Specifies how the results of an operation will be stored by the caller.
     *   Valid values include:
     * * `SingleUse` specifies that the results won't be stored.
     * * `Storage` specifies that the result can be cached or stored in a database.
     *
     * Default value: `SingleUse`
     */
    public fun intendedUse(intendedUse: String) {
        cdkBuilder.intendedUse(intendedUse)
    }

    public fun build(): CfnPlaceIndex.DataSourceConfigurationProperty = cdkBuilder.build()
}
