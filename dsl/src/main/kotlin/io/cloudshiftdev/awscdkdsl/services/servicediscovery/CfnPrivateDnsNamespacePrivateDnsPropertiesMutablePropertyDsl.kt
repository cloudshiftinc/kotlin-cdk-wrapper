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

package io.cloudshiftdev.awscdkdsl.services.servicediscovery

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace

/**
 * DNS properties for the private DNS namespace.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * PrivateDnsPropertiesMutableProperty privateDnsPropertiesMutableProperty =
 * PrivateDnsPropertiesMutableProperty.builder()
 * .soa(SOAProperty.builder()
 * .ttl(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-privatednspropertiesmutable.html)
 */
@CdkDslMarker
public class CfnPrivateDnsNamespacePrivateDnsPropertiesMutablePropertyDsl {
    private val cdkBuilder: CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.Builder =
        CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.builder()

    /**
     * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the private
     *   DNS namespace.
     */
    public fun soa(soa: IResolvable) {
        cdkBuilder.soa(soa)
    }

    /**
     * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the private
     *   DNS namespace.
     */
    public fun soa(soa: CfnPrivateDnsNamespace.SOAProperty) {
        cdkBuilder.soa(soa)
    }

    public fun build(): CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty =
        cdkBuilder.build()
}
