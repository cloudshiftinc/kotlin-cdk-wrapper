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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation

/**
 * The HTTP configuration for the source location.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * HttpConfigurationProperty httpConfigurationProperty = HttpConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-httpconfiguration.html)
 */
@CdkDslMarker
public class CfnSourceLocationHttpConfigurationPropertyDsl {
    private val cdkBuilder: CfnSourceLocation.HttpConfigurationProperty.Builder =
        CfnSourceLocation.HttpConfigurationProperty.builder()

    /**
     * @param baseUrl The base URL for the source location host server. This string must include the
     *   protocol, such as <b>https://</b>.</p>
     */
    public fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
    }

    public fun build(): CfnSourceLocation.HttpConfigurationProperty = cdkBuilder.build()
}
