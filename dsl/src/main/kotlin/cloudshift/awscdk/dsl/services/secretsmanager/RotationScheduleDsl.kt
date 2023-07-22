@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.secretsmanager.HostedRotation
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.constructs.Construct

@CdkDslMarker
public class RotationScheduleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: RotationSchedule.Builder = RotationSchedule.Builder.create(scope, id)

  /**
   * Specifies the number of days after the previous rotation before Secrets Manager triggers the
   * next automatic rotation.
   *
   * A value of zero will disable automatic rotation - `Duration.days(0)`.
   *
   * Default: Duration.days(30)
   *
   * @param automaticallyAfter Specifies the number of days after the previous rotation before
   * Secrets Manager triggers the next automatic rotation. 
   */
  public fun automaticallyAfter(automaticallyAfter: Duration) {
    cdkBuilder.automaticallyAfter(automaticallyAfter)
  }

  /**
   * Hosted rotation.
   *
   * Default: - either `rotationLambda` or `hostedRotation` must be specified
   *
   * @param hostedRotation Hosted rotation. 
   */
  public fun hostedRotation(hostedRotation: HostedRotation) {
    cdkBuilder.hostedRotation(hostedRotation)
  }

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   *
   * Default: true
   *
   * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
   * until the next scheduled rotation window. 
   */
  public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
    cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
  }

  /**
   * A Lambda function that can rotate the secret.
   *
   * Default: - either `rotationLambda` or `hostedRotation` must be specified
   *
   * @param rotationLambda A Lambda function that can rotate the secret. 
   */
  public fun rotationLambda(rotationLambda: IFunction) {
    cdkBuilder.rotationLambda(rotationLambda)
  }

  /**
   * The secret to rotate.
   *
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
   *
   * @param secret The secret to rotate. 
   */
  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  public fun build(): RotationSchedule = cdkBuilder.build()
}
