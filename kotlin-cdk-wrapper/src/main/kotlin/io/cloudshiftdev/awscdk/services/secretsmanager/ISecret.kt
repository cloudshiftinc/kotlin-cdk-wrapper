@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A secret in AWS Secrets Manager.
 */
public interface ISecret : IResource {
  /**
   * Adds a rotation schedule to the secret.
   *
   * @param id 
   * @param options 
   */
  public fun addRotationSchedule(id: String, options: RotationScheduleOptions): RotationSchedule

  /**
   * Adds a rotation schedule to the secret.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0185182b072761e632ab5e240b4f879efc97dadb0634fcd1f5cbd5e0c49fe563")
  public fun addRotationSchedule(id: String, options: RotationScheduleOptions.Builder.() -> Unit):
      RotationSchedule

  /**
   * Adds a statement to the IAM resource policy associated with this secret.
   *
   * If this secret was created in this stack, a resource policy will be
   * automatically created upon the first call to `addToResourcePolicy`. If
   * the secret is imported, then this is a no-op.
   *
   * @param statement 
   */
  public fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult

  /**
   * Adds a statement to the IAM resource policy associated with this secret.
   *
   * If this secret was created in this stack, a resource policy will be
   * automatically created upon the first call to `addToResourcePolicy`. If
   * the secret is imported, then this is a no-op.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  /**
   * Attach a target to this secret.
   *
   * @return An attached secret
   * @param target The target to attach. 
   */
  public fun attach(target: ISecretAttachmentTarget): ISecret

  /**
   * Denies the `DeleteSecret` action to all principals within the current account.
   */
  public fun denyAccountRootDelete()

  /**
   * The customer-managed encryption key that is used to encrypt this secret, if any.
   *
   * When not specified, the default
   * KMS key for the account and region is being used.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Grants reading the secret value to some role.
   *
   * @param grantee the principal being granted permission. 
   * @param versionStages the version stages the grant is limited to.
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * Grants reading the secret value to some role.
   *
   * @param grantee the principal being granted permission. 
   * @param versionStages the version stages the grant is limited to.
   */
  public fun grantRead(grantee: IGrantable, versionStages: List<String>): Grant

  /**
   * Grants writing and updating the secret value to some role.
   *
   * @param grantee the principal being granted permission. 
   */
  public fun grantWrite(grantee: IGrantable): Grant

  /**
   * The ARN of the secret in AWS Secrets Manager.
   *
   * Will return the full ARN if available, otherwise a partial arn.
   * For secrets imported by the deprecated `fromSecretName`, it will return the `secretName`.
   */
  public fun secretArn(): String

  /**
   * The full ARN of the secret in AWS Secrets Manager, which is the ARN including the Secrets
   * Manager-supplied 6-character suffix.
   *
   * This is equal to `secretArn` in most cases, but is undefined when a full ARN is not available
   * (e.g., secrets imported by name).
   */
  public fun secretFullArn(): String? = unwrap(this).getSecretFullArn()

  /**
   * The name of the secret.
   *
   * For "owned" secrets, this will be the full resource name (secret name + suffix), unless the
   * '&#64;aws-cdk/aws-secretsmanager:parseOwnedSecretName' feature flag is set.
   */
  public fun secretName(): String

  /**
   * Retrieve the value of the stored secret as a `SecretValue`.
   */
  public fun secretValue(): SecretValue

  /**
   * Interpret the secret as a JSON object and return a field's value from it as a `SecretValue`.
   *
   * @param key 
   */
  public fun secretValueFromJson(key: String): SecretValue

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ISecret): ISecret =
        CdkObjectWrappers.wrap(cdkObject) as ISecret

    internal fun unwrap(wrapped: ISecret): software.amazon.awscdk.services.secretsmanager.ISecret =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.ISecret
  }
}
