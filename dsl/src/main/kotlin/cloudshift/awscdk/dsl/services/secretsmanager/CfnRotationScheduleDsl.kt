@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.constructs.Construct

@CdkDslMarker
public class CfnRotationScheduleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRotationSchedule.Builder = CfnRotationSchedule.Builder.create(scope,
      id)

  public fun hostedRotationLambda(hostedRotationLambda: IResolvable) {
    cdkBuilder.hostedRotationLambda(hostedRotationLambda)
  }

  public
      fun hostedRotationLambda(hostedRotationLambda: CfnRotationSchedule.HostedRotationLambdaProperty) {
    cdkBuilder.hostedRotationLambda(hostedRotationLambda)
  }

  public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
    cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
  }

  public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable) {
    cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
  }

  public fun rotationLambdaArn(rotationLambdaArn: String) {
    cdkBuilder.rotationLambdaArn(rotationLambdaArn)
  }

  public fun rotationRules(rotationRules: IResolvable) {
    cdkBuilder.rotationRules(rotationRules)
  }

  public fun rotationRules(rotationRules: CfnRotationSchedule.RotationRulesProperty) {
    cdkBuilder.rotationRules(rotationRules)
  }

  public fun secretId(secretId: String) {
    cdkBuilder.secretId(secretId)
  }

  public fun build(): CfnRotationSchedule = cdkBuilder.build()
}
