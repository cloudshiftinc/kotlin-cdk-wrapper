@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.secretsmanager.HostedRotation
import software.amazon.awscdk.services.secretsmanager.RotationScheduleOptions

@CdkDslMarker
public class RotationScheduleOptionsDsl {
  private val cdkBuilder: RotationScheduleOptions.Builder = RotationScheduleOptions.builder()

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

  public fun build(): RotationScheduleOptions = cdkBuilder.build()
}
