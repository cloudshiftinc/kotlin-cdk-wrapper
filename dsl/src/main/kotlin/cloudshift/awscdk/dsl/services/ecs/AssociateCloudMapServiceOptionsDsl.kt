@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions
import software.amazon.awscdk.services.ecs.ContainerDefinition
import software.amazon.awscdk.services.servicediscovery.IService
import kotlin.Number

@CdkDslMarker
public class AssociateCloudMapServiceOptionsDsl {
    private val cdkBuilder: AssociateCloudMapServiceOptions.Builder =
        AssociateCloudMapServiceOptions.builder()

    public fun container(container: ContainerDefinition) {
        cdkBuilder.container(container)
    }

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun service(service: IService) {
        cdkBuilder.service(service)
    }

    public fun build(): AssociateCloudMapServiceOptions = cdkBuilder.build()
}
