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
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
import kotlin.Boolean

@CdkDslMarker
public class RotationSchedulePropsDsl {
    private val cdkBuilder: RotationScheduleProps.Builder = RotationScheduleProps.builder()

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

    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    public fun build(): RotationScheduleProps = cdkBuilder.build()
}
