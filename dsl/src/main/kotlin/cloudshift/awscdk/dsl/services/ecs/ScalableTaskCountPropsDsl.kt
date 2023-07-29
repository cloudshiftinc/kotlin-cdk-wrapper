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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
import software.amazon.awscdk.services.ecs.ScalableTaskCountProps
import software.amazon.awscdk.services.iam.IRole

/**
 * The properties of a scalable attribute representing task count.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * ScalableTaskCountProps scalableTaskCountProps = ScalableTaskCountProps.builder()
 * .dimension("dimension")
 * .maxCapacity(123)
 * .resourceId("resourceId")
 * .role(role)
 * .serviceNamespace(ServiceNamespace.ECS)
 * // the properties below are optional
 * .minCapacity(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ScalableTaskCountPropsDsl {
    private val cdkBuilder: ScalableTaskCountProps.Builder = ScalableTaskCountProps.builder()

    /** @param dimension Scalable dimension of the attribute. */
    public fun dimension(dimension: String) {
        cdkBuilder.dimension(dimension)
    }

    /** @param maxCapacity Maximum capacity to scale to. */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param minCapacity Minimum capacity to scale to. */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /** @param resourceId Resource ID of the attribute. */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /** @param role Role to use for scaling. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /** @param serviceNamespace Service namespace of the scalable attribute. */
    public fun serviceNamespace(serviceNamespace: ServiceNamespace) {
        cdkBuilder.serviceNamespace(serviceNamespace)
    }

    public fun build(): ScalableTaskCountProps = cdkBuilder.build()
}
