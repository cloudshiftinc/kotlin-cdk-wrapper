@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An attached secret.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * Secret secret;
 * ISecretAttachmentTarget secretAttachmentTarget;
 * SecretTargetAttachment secretTargetAttachment = SecretTargetAttachment.Builder.create(this,
 * "MySecretTargetAttachment")
 * .secret(secret)
 * .target(secretAttachmentTarget)
 * .build();
 * ```
 */
public open class SecretTargetAttachment(
  cdkObject: software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment,
) : Resource(cdkObject),
    ISecretTargetAttachment,
    ISecret {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SecretTargetAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(SecretTargetAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SecretTargetAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, SecretTargetAttachmentProps(props)
  )

  /**
   * Adds a rotation schedule to the secret.
   *
   * @param id 
   * @param options 
   */
  public override fun addRotationSchedule(id: String, options: RotationScheduleOptions):
      RotationSchedule = unwrap(this).addRotationSchedule(id,
      options.let(RotationScheduleOptions.Companion::unwrap)).let(RotationSchedule::wrap)

  /**
   * Adds a rotation schedule to the secret.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0185182b072761e632ab5e240b4f879efc97dadb0634fcd1f5cbd5e0c49fe563")
  public override fun addRotationSchedule(id: String,
      options: RotationScheduleOptions.Builder.() -> Unit): RotationSchedule =
      addRotationSchedule(id, RotationScheduleOptions(options))

  /**
   * Forward any additions to the resource policy to the original secret.
   *
   * This is required because a secret can only have a single resource policy.
   * If we do not forward policy additions, a new policy resource is created using the secret
   * attachment ARN.
   * This ends up being rejected by CloudFormation.
   *
   * @param statement 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Forward any additions to the resource policy to the original secret.
   *
   * This is required because a secret can only have a single resource policy.
   * If we do not forward policy additions, a new policy resource is created using the secret
   * attachment ARN.
   * This ends up being rejected by CloudFormation.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Attach a target to this secret.
   *
   * @return An attached secret
   * @param target The target to attach. 
   */
  public override fun attach(target: ISecretAttachmentTarget): ISecret =
      unwrap(this).attach(target.let(ISecretAttachmentTarget.Companion::unwrap)).let(ISecret::wrap)

  /**
   * Denies the `DeleteSecret` action to all principals within the current account.
   */
  public override fun denyAccountRootDelete() {
    unwrap(this).denyAccountRootDelete()
  }

  /**
   * The customer-managed encryption key that is used to encrypt this secret, if any.
   *
   * When not specified, the default
   * KMS key for the account and region is being used.
   */
  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Grants reading the secret value to some role.
   *
   * @param grantee 
   * @param versionStages
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grants reading the secret value to some role.
   *
   * @param grantee 
   * @param versionStages
   */
  public override fun grantRead(grantee: IGrantable, versionStages: List<String>): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap),
      versionStages).let(Grant::wrap)

  /**
   * Grants writing and updating the secret value to some role.
   *
   * @param grantee 
   */
  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The ARN of the secret in AWS Secrets Manager.
   *
   * Will return the full ARN if available, otherwise a partial arn.
   * For secrets imported by the deprecated `fromSecretName`, it will return the `secretName`.
   */
  public override fun secretArn(): String = unwrap(this).getSecretArn()

  /**
   * The full ARN of the secret in AWS Secrets Manager, which is the ARN including the Secrets
   * Manager-supplied 6-character suffix.
   *
   * This is equal to `secretArn` in most cases, but is undefined when a full ARN is not available
   * (e.g., secrets imported by name).
   */
  public override fun secretFullArn(): String? = unwrap(this).getSecretFullArn()

  /**
   * The name of the secret.
   *
   * For "owned" secrets, this will be the full resource name (secret name + suffix), unless the
   * '&#64;aws-cdk/aws-secretsmanager:parseOwnedSecretName' feature flag is set.
   */
  public override fun secretName(): String = unwrap(this).getSecretName()

  /**
   * Same as `secretArn`.
   */
  public override fun secretTargetAttachmentSecretArn(): String =
      unwrap(this).getSecretTargetAttachmentSecretArn()

  /**
   * Retrieve the value of the stored secret as a `SecretValue`.
   */
  public override fun secretValue(): SecretValue =
      unwrap(this).getSecretValue().let(SecretValue::wrap)

  /**
   * Interpret the secret as a JSON object and return a field's value from it as a `SecretValue`.
   *
   * @param jsonField 
   */
  public override fun secretValueFromJson(jsonField: String): SecretValue =
      unwrap(this).secretValueFromJson(jsonField).let(SecretValue::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.secretsmanager.SecretTargetAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The secret to attach to the target.
     *
     * @param secret The secret to attach to the target. 
     */
    public fun secret(secret: ISecret)

    /**
     * The target to attach the secret to.
     *
     * @param target The target to attach the secret to. 
     */
    public fun target(target: ISecretAttachmentTarget)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment.Builder.create(scope,
        id)

    /**
     * The secret to attach to the target.
     *
     * @param secret The secret to attach to the target. 
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    /**
     * The target to attach the secret to.
     *
     * @param target The target to attach the secret to. 
     */
    override fun target(target: ISecretAttachmentTarget) {
      cdkBuilder.target(target.let(ISecretAttachmentTarget.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromSecretTargetAttachmentSecretArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      secretTargetAttachmentSecretArn: String,
    ): ISecretTargetAttachment =
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment.fromSecretTargetAttachmentSecretArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, secretTargetAttachmentSecretArn).let(ISecretTargetAttachment::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SecretTargetAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SecretTargetAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment):
        SecretTargetAttachment = SecretTargetAttachment(cdkObject)

    internal fun unwrap(wrapped: SecretTargetAttachment):
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment = wrapped.cdkObject as
        software.amazon.awscdk.services.secretsmanager.SecretTargetAttachment
  }
}
