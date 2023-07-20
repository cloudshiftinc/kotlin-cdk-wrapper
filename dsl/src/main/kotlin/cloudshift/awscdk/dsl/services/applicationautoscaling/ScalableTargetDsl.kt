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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class ScalableTargetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ScalableTarget.Builder = ScalableTarget.Builder.create(scope, id)

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun scalableDimension(scalableDimension: String) {
        cdkBuilder.scalableDimension(scalableDimension)
    }

    public fun serviceNamespace(serviceNamespace: ServiceNamespace) {
        cdkBuilder.serviceNamespace(serviceNamespace)
    }

    public fun build(): ScalableTarget = cdkBuilder.build()
}
