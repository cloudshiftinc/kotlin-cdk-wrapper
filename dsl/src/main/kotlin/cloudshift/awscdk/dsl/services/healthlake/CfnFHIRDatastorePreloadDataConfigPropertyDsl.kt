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

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

/**
 * Optional parameter to preload data upon creation of the Data Store.
 *
 * Currently, the only supported preloaded data is synthetic data generated from Synthea.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.healthlake.*;
 * PreloadDataConfigProperty preloadDataConfigProperty = PreloadDataConfigProperty.builder()
 * .preloadDataType("preloadDataType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-preloaddataconfig.html)
 */
@CdkDslMarker
public class CfnFHIRDatastorePreloadDataConfigPropertyDsl {
    private val cdkBuilder: CfnFHIRDatastore.PreloadDataConfigProperty.Builder =
        CfnFHIRDatastore.PreloadDataConfigProperty.builder()

    /**
     * @param preloadDataType The type of preloaded data. Only Synthea preloaded data is supported.
     */
    public fun preloadDataType(preloadDataType: String) {
        cdkBuilder.preloadDataType(preloadDataType)
    }

    public fun build(): CfnFHIRDatastore.PreloadDataConfigProperty = cdkBuilder.build()
}
