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
 * Properties for the private DNS namespace.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * PropertiesProperty propertiesProperty = PropertiesProperty.builder()
 * .dnsProperties(PrivateDnsPropertiesMutableProperty.builder()
 * .soa(SOAProperty.builder()
 * .ttl(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-properties.html)
 */
@CdkDslMarker
public class CfnPrivateDnsNamespacePropertiesPropertyDsl {
    private val cdkBuilder: CfnPrivateDnsNamespace.PropertiesProperty.Builder =
        CfnPrivateDnsNamespace.PropertiesProperty.builder()

    /** @param dnsProperties DNS properties for the private DNS namespace. */
    public fun dnsProperties(dnsProperties: IResolvable) {
        cdkBuilder.dnsProperties(dnsProperties)
    }

    /** @param dnsProperties DNS properties for the private DNS namespace. */
    public fun dnsProperties(
        dnsProperties: CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty
    ) {
        cdkBuilder.dnsProperties(dnsProperties)
    }

    public fun build(): CfnPrivateDnsNamespace.PropertiesProperty = cdkBuilder.build()
}
