@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.secretsmanager.HostedRotation
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.RotationScheduleProps
import kotlin.Boolean

/**
 * Construction properties for a RotationSchedule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Function function_;
 * HostedRotation hostedRotation;
 * Secret secret;
 * RotationScheduleProps rotationScheduleProps = RotationScheduleProps.builder()
 * .secret(secret)
 * // the properties below are optional
 * .automaticallyAfter(Duration.minutes(30))
 * .hostedRotation(hostedRotation)
 * .rotateImmediatelyOnUpdate(false)
 * .rotationLambda(function_)
 * .build();
 * ```
 */
@CdkDslMarker
public class RotationSchedulePropsDsl {
    private val cdkBuilder: RotationScheduleProps.Builder = RotationScheduleProps.builder()

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     * A value of zero will disable automatic rotation - `Duration.days(0)`.
     */
    public fun automaticallyAfter(automaticallyAfter: Duration) {
        cdkBuilder.automaticallyAfter(automaticallyAfter)
    }

    /**
     * @param hostedRotation Hosted rotation.
     */
    public fun hostedRotation(hostedRotation: HostedRotation) {
        cdkBuilder.hostedRotation(hostedRotation)
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param rotationLambda A Lambda function that can rotate the secret.
     */
    public fun rotationLambda(rotationLambda: IFunction) {
        cdkBuilder.rotationLambda(rotationLambda)
    }

    /**
     * @param secret The secret to rotate.
     * If hosted rotation is used, this must be a JSON string with the following format:
     *
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
     * used to create users/change passwords&gt;
     * }
     * ```
     *
     * This is typically the case for a secret referenced from an
     * `AWS::SecretsManager::SecretTargetAttachment`
     * or an `ISecret` returned by the `attach()` method of `Secret`.
     */
    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    public fun build(): RotationScheduleProps = cdkBuilder.build()
}
