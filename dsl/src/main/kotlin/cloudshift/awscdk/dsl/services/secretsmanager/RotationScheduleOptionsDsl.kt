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

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.secretsmanager.HostedRotation
import software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions
import kotlin.Boolean

@CdkDslMarker
public class RotationScheduleOptionsDsl {
    private val cdkBuilder: RotationScheduleOptions.Builder = RotationScheduleOptions.builder()

    public fun automaticallyAfter(automaticallyAfter: Duration) {
        cdkBuilder.automaticallyAfter(automaticallyAfter)
    }

    public fun hostedRotation(hostedRotation: HostedRotation) {
        cdkBuilder.hostedRotation(hostedRotation)
    }

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    public fun rotationLambda(rotationLambda: IFunction) {
        cdkBuilder.rotationLambda(rotationLambda)
    }

    public fun build(): RotationScheduleOptions = cdkBuilder.build()
}
