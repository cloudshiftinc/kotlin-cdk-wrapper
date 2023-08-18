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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.servicediscovery.IService

/**
 * The options for using a cloudmap service.
 *
 * Example:
 * ```
 * Service cloudMapService;
 * FargateService ecsService;
 * ecsService.associateCloudMapService(AssociateCloudMapServiceOptions.builder()
 * .service(cloudMapService)
 * .build());
 * ```
 */
@CdkDslMarker
public class AssociateCloudMapServiceOptionsDsl {
    private val cdkBuilder: AssociateCloudMapServiceOptions.Builder =
        AssociateCloudMapServiceOptions.builder()

    /** @param container The container to point to for a SRV record. */
    public fun container(container: ContainerDefinition) {
        cdkBuilder.container(container)
    }

    /** @param containerPort The port to point to for a SRV record. */
    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    /** @param service The cloudmap service to register with. */
    public fun service(service: IService) {
        cdkBuilder.service(service)
    }

    public fun build(): AssociateCloudMapServiceOptions = cdkBuilder.build()
}
