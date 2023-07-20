@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule
import software.amazon.awscdk.services.secretsmanager.CfnSecret
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.Secret
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment

public inline fun ISecret.addRotationSchedule(arg0: String,
    block: RotationScheduleOptionsDsl.() -> Unit = {}): RotationSchedule {
  val builder = RotationScheduleOptionsDsl()
  builder.apply(block)
  return addRotationSchedule(arg0, builder.build())
}

public inline fun ISecret.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun SecretTargetAttachment.addRotationSchedule(id: String,
    block: RotationScheduleOptionsDsl.() -> Unit = {}): RotationSchedule {
  val builder = RotationScheduleOptionsDsl()
  builder.apply(block)
  return addRotationSchedule(id, builder.build())
}

public inline fun SecretTargetAttachment.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit =
    {}): AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline
    fun CfnSecret.setGenerateSecretString(block: CfnSecretGenerateSecretStringPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSecretGenerateSecretStringPropertyDsl()
  builder.apply(block)
  return setGenerateSecretString(builder.build())
}

public inline fun Secret.addRotationSchedule(id: String,
    block: RotationScheduleOptionsDsl.() -> Unit = {}): RotationSchedule {
  val builder = RotationScheduleOptionsDsl()
  builder.apply(block)
  return addRotationSchedule(id, builder.build())
}

public inline fun Secret.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline
    fun CfnRotationSchedule.setHostedRotationLambda(block: CfnRotationScheduleHostedRotationLambdaPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRotationScheduleHostedRotationLambdaPropertyDsl()
  builder.apply(block)
  return setHostedRotationLambda(builder.build())
}

public inline
    fun CfnRotationSchedule.setRotationRules(block: CfnRotationScheduleRotationRulesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRotationScheduleRotationRulesPropertyDsl()
  builder.apply(block)
  return setRotationRules(builder.build())
}
