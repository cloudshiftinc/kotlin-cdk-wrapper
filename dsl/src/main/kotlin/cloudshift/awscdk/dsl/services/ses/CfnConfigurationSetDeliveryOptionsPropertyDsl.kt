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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSet

/**
 * Specifies whether messages that use the configuration set are required to use Transport Layer
 * Security (TLS).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DeliveryOptionsProperty deliveryOptionsProperty = DeliveryOptionsProperty.builder()
 * .sendingPoolName("sendingPoolName")
 * .tlsPolicy("tlsPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-deliveryoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetDeliveryOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.DeliveryOptionsProperty.Builder =
        CfnConfigurationSet.DeliveryOptionsProperty.builder()

    /**
     * @param sendingPoolName The name of the dedicated IP pool to associate with the configuration
     *   set.
     */
    public fun sendingPoolName(sendingPoolName: String) {
        cdkBuilder.sendingPoolName(sendingPoolName)
    }

    /**
     * @param tlsPolicy Specifies whether messages that use the configuration set are required to
     *   use Transport Layer Security (TLS). If the value is `REQUIRE` , messages are only delivered
     *   if a TLS connection can be established. If the value is `OPTIONAL` , messages can be
     *   delivered in plain text if a TLS connection can't be established.
     *
     * Valid Values: `REQUIRE | OPTIONAL`
     */
    public fun tlsPolicy(tlsPolicy: String) {
        cdkBuilder.tlsPolicy(tlsPolicy)
    }

    public fun build(): CfnConfigurationSet.DeliveryOptionsProperty = cdkBuilder.build()
}
