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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct

/**
 * Information about a parameter used to provision a product.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * ProvisioningParameterProperty provisioningParameterProperty =
 * ProvisioningParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html)
 */
@CdkDslMarker
public class CfnCloudFormationProvisionedProductProvisioningParameterPropertyDsl {
    private val cdkBuilder:
        CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.Builder =
        CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty.builder()

    /** @param key The parameter key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The parameter value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty =
        cdkBuilder.build()
}
