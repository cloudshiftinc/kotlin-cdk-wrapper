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
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.IService
import software.constructs.Construct

/**
 * Instance that uses Route 53 Alias record type.
 *
 * Currently, the only resource types supported are Elastic Load Balancers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * Service service;
 * AliasTargetInstance aliasTargetInstance = AliasTargetInstance.Builder.create(this,
 * "MyAliasTargetInstance")
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
public class AliasTargetInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AliasTargetInstance.Builder =
        AliasTargetInstance.Builder.create(scope, id)

    /**
     * Custom attributes of the instance.
     *
     * Default: none
     *
     * @param customAttributes Custom attributes of the instance.
     */
    public fun customAttributes(customAttributes: Map<String, String>) {
        cdkBuilder.customAttributes(customAttributes)
    }

    /**
     * DNS name of the target.
     *
     * @param dnsName DNS name of the target.
     */
    public fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
    }

    /**
     * The id of the instance resource.
     *
     * Default: Automatically generated name
     *
     * @param instanceId The id of the instance resource.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * The Cloudmap service this resource is registered to.
     *
     * @param service The Cloudmap service this resource is registered to.
     */
    public fun service(service: IService) {
        cdkBuilder.service(service)
    }

    public fun build(): AliasTargetInstance = cdkBuilder.build()
}
