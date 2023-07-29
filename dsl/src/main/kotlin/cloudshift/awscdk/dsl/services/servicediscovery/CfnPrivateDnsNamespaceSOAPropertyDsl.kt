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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace

/**
 * Start of Authority (SOA) properties for a public or private DNS namespace.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * SOAProperty sOAProperty = SOAProperty.builder()
 * .ttl(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-privatednsnamespace-soa.html)
 */
@CdkDslMarker
public class CfnPrivateDnsNamespaceSOAPropertyDsl {
    private val cdkBuilder: CfnPrivateDnsNamespace.SOAProperty.Builder =
        CfnPrivateDnsNamespace.SOAProperty.builder()

    /** @param ttl The time to live (TTL) for purposes of negative caching. */
    public fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CfnPrivateDnsNamespace.SOAProperty = cdkBuilder.build()
}
