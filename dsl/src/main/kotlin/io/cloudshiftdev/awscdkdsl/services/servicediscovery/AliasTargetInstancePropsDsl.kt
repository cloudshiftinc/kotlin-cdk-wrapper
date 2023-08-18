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
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
import software.amazon.awscdk.services.servicediscovery.IService

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * Service service;
 * AliasTargetInstanceProps aliasTargetInstanceProps = AliasTargetInstanceProps.builder()
 * .dnsName("dnsName")
 * .service(service)
 * // the properties below are optional
 * .customAttributes(Map.of(
 * "customAttributesKey", "customAttributes"))
 * .instanceId("instanceId")
 * .build();
 * ```
 */
@CdkDslMarker
public class AliasTargetInstancePropsDsl {
    private val cdkBuilder: AliasTargetInstanceProps.Builder = AliasTargetInstanceProps.builder()

    /** @param customAttributes Custom attributes of the instance. */
    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    /** @param dnsName DNS name of the target. */
    public fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
    }

    /** @param instanceId The id of the instance resource. */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /** @param service The Cloudmap service this resource is registered to. */
    public fun service(service: IService) {
        cdkBuilder.service(service)
    }

    public fun build(): AliasTargetInstanceProps = cdkBuilder.build()
}
