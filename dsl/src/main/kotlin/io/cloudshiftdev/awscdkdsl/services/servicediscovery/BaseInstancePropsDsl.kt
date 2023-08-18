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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.servicediscovery.BaseInstanceProps

/**
 * Used when the resource that's associated with the service instance is accessible using values
 * other than an IP address or a domain name (CNAME), i.e. for non-ip-instances.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * BaseInstanceProps baseInstanceProps = BaseInstanceProps.builder()
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseInstancePropsDsl {
    private val cdkBuilder: BaseInstanceProps.Builder = BaseInstanceProps.builder()

    /** @param customAttributes Custom attributes of the instance. */
    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    /** @param instanceId The id of the instance resource. */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun build(): BaseInstanceProps = cdkBuilder.build()
}
