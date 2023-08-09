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

/**
 * Creates a new Lambda rotation function based on one of the
 * [Secrets Manager rotation function templates](https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_available-rotation-templates.html)
 * . To use a rotation function that already exists, specify `RotationLambdaARN` instead.
 */
public inline fun CfnRotationSchedule.setHostedRotationLambda(
    block: CfnRotationScheduleHostedRotationLambdaPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRotationScheduleHostedRotationLambdaPropertyDsl()
    builder.apply(block)
    return setHostedRotationLambda(builder.build())
}

/** A structure that defines the rotation configuration for this secret. */
public inline fun CfnRotationSchedule.setRotationRules(
    block: CfnRotationScheduleRotationRulesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRotationScheduleRotationRulesPropertyDsl()
    builder.apply(block)
    return setRotationRules(builder.build())
}

/** A structure that specifies how to generate a password to encrypt and store in the secret. */
public inline fun CfnSecret.setGenerateSecretString(
    block: CfnSecretGenerateSecretStringPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSecretGenerateSecretStringPropertyDsl()
    builder.apply(block)
    return setGenerateSecretString(builder.build())
}

/**
 * Adds a rotation schedule to the secret.
 *
 * @param id
 * @param options
 */
public inline fun ISecret.addRotationSchedule(
    arg0: String,
    block: RotationScheduleOptionsDsl.() -> Unit = {}
): RotationSchedule {
    val builder = RotationScheduleOptionsDsl()
    builder.apply(block)
    return addRotationSchedule(arg0, builder.build())
}

/**
 * Adds a statement to the IAM resource policy associated with this secret.
 *
 * If this secret was created in this stack, a resource policy will be automatically created upon
 * the first call to `addToResourcePolicy`. If the secret is imported, then this is a no-op.
 *
 * @param statement
 */
public inline fun ISecret.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Adds a rotation schedule to the secret.
 *
 * @param id
 * @param options
 */
public inline fun Secret.addRotationSchedule(
    id: String,
    block: RotationScheduleOptionsDsl.() -> Unit = {}
): RotationSchedule {
    val builder = RotationScheduleOptionsDsl()
    builder.apply(block)
    return addRotationSchedule(id, builder.build())
}

/**
 * Adds a statement to the IAM resource policy associated with this secret.
 *
 * If this secret was created in this stack, a resource policy will be automatically created upon
 * the first call to `addToResourcePolicy`. If the secret is imported, then this is a no-op.
 *
 * @param statement
 */
public inline fun Secret.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Adds a rotation schedule to the secret.
 *
 * @param id
 * @param options
 */
public inline fun SecretTargetAttachment.addRotationSchedule(
    id: String,
    block: RotationScheduleOptionsDsl.() -> Unit = {}
): RotationSchedule {
    val builder = RotationScheduleOptionsDsl()
    builder.apply(block)
    return addRotationSchedule(id, builder.build())
}

/**
 * Forward any additions to the resource policy to the original secret.
 *
 * This is required because a secret can only have a single resource policy. If we do not forward
 * policy additions, a new policy resource is created using the secret attachment ARN. This ends up
 * being rejected by CloudFormation.
 *
 * @param statement
 */
public inline fun SecretTargetAttachment.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}
