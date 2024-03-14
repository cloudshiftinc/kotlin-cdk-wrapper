package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ISecretTargetAttachment : ISecret {
  /**
   * Same as `secretArn`.
   */
  public fun secretTargetAttachmentSecretArn(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.ISecretTargetAttachment,
  ) : CdkObject(cdkObject), ISecretTargetAttachment {
    /**
     * Adds a rotation schedule to the secret.
     *
     * @param id 
     * @param options 
     */
    override fun addRotationSchedule(id: String, options: RotationScheduleOptions): RotationSchedule
        = unwrap(this).addRotationSchedule(id,
        options.let(RotationScheduleOptions::unwrap)).let(RotationSchedule::wrap)

    /**
     * Adds a rotation schedule to the secret.
     *
     * @param id 
     * @param options 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0185182b072761e632ab5e240b4f879efc97dadb0634fcd1f5cbd5e0c49fe563")
    override fun addRotationSchedule(id: String,
        options: RotationScheduleOptions.Builder.() -> Unit): RotationSchedule =
        addRotationSchedule(id, RotationScheduleOptions(options))

    /**
     * Adds a statement to the IAM resource policy associated with this secret.
     *
     * If this secret was created in this stack, a resource policy will be
     * automatically created upon the first call to `addToResourcePolicy`. If
     * the secret is imported, then this is a no-op.
     *
     * @param statement 
     */
    override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    /**
     * Adds a statement to the IAM resource policy associated with this secret.
     *
     * If this secret was created in this stack, a resource policy will be
     * automatically created upon the first call to `addToResourcePolicy`. If
     * the secret is imported, then this is a no-op.
     *
     * @param statement 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * Attach a target to this secret.
     *
     * @return An attached secret
     * @param target The target to attach. 
     */
    override fun attach(target: ISecretAttachmentTarget): ISecret =
        unwrap(this).attach(target.let(ISecretAttachmentTarget::unwrap)).let(ISecret::wrap)

    /**
     * Denies the `DeleteSecret` action to all principals within the current account.
     */
    override fun denyAccountRootDelete() {
      unwrap(this).denyAccountRootDelete()
    }

    /**
     * The customer-managed encryption key that is used to encrypt this secret, if any.
     *
     * When not specified, the default
     * KMS key for the account and region is being used.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Grants reading the secret value to some role.
     *
     * @param grantee the principal being granted permission. 
     * @param versionStages the version stages the grant is limited to.
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grants reading the secret value to some role.
     *
     * @param grantee the principal being granted permission. 
     * @param versionStages the version stages the grant is limited to.
     */
    override fun grantRead(grantee: IGrantable, versionStages: List<String>): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable::unwrap), versionStages).let(Grant::wrap)

    /**
     * Grants writing and updating the secret value to some role.
     *
     * @param grantee the principal being granted permission. 
     */
    override fun grantWrite(grantee: IGrantable): Grant =
        unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The ARN of the secret in AWS Secrets Manager.
     *
     * Will return the full ARN if available, otherwise a partial arn.
     * For secrets imported by the deprecated `fromSecretName`, it will return the `secretName`.
     */
    override fun secretArn(): String = unwrap(this).getSecretArn()

    /**
     * The full ARN of the secret in AWS Secrets Manager, which is the ARN including the Secrets
     * Manager-supplied 6-character suffix.
     *
     * This is equal to `secretArn` in most cases, but is undefined when a full ARN is not available
     * (e.g., secrets imported by name).
     */
    override fun secretFullArn(): String? = unwrap(this).getSecretFullArn()

    /**
     * The name of the secret.
     *
     * For "owned" secrets, this will be the full resource name (secret name + suffix), unless the
     * '&#64;aws-cdk/aws-secretsmanager:parseOwnedSecretName' feature flag is set.
     */
    override fun secretName(): String = unwrap(this).getSecretName()

    /**
     * Same as `secretArn`.
     */
    override fun secretTargetAttachmentSecretArn(): String =
        unwrap(this).getSecretTargetAttachmentSecretArn()

    /**
     * Retrieve the value of the stored secret as a `SecretValue`.
     */
    override fun secretValue(): SecretValue = unwrap(this).getSecretValue().let(SecretValue::wrap)

    /**
     * Interpret the secret as a JSON object and return a field's value from it as a `SecretValue`.
     *
     * @param key 
     */
    override fun secretValueFromJson(key: String): SecretValue =
        unwrap(this).secretValueFromJson(key).let(SecretValue::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.ISecretTargetAttachment):
        ISecretTargetAttachment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISecretTargetAttachment):
        software.amazon.awscdk.services.secretsmanager.ISecretTargetAttachment = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.ISecretTargetAttachment
  }
}
