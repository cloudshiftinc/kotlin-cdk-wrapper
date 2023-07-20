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
import software.amazon.awscdk.services.ecs.ExternalServiceAttributes
import software.amazon.awscdk.services.ecs.ICluster
import kotlin.String

@CdkDslMarker
public class ExternalServiceAttributesDsl {
    private val cdkBuilder: ExternalServiceAttributes.Builder = ExternalServiceAttributes.builder()

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun serviceArn(serviceArn: String) {
        cdkBuilder.serviceArn(serviceArn)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): ExternalServiceAttributes = cdkBuilder.build()
}
