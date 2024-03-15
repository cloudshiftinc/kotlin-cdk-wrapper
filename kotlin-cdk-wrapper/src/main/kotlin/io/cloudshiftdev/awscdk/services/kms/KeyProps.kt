@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Construction properties for a KMS Key object.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Artifact sourceOutput = new Artifact();
 * Bucket targetBucket = new Bucket(this, "MyBucket");
 * IKey key = Key.Builder.create(this, "EnvVarEncryptKey")
 * .description("sample key")
 * .build();
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * S3DeployAction deployAction = S3DeployAction.Builder.create()
 * .actionName("S3Deploy")
 * .bucket(targetBucket)
 * .input(sourceOutput)
 * .encryptionKey(key)
 * .build();
 * IStage deployStage = pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
public interface KeyProps {
  /**
   * A list of principals to add as key administrators to the key policy.
   *
   * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
   * do not have permissions
   * to use the key in cryptographic operations (e.g., encrypt, decrypt).
   *
   * These principals will be added to the default key policy (if none specified), or to the
   * specified policy (if provided).
   *
   * Default: []
   */
  public fun admins(): List<IPrincipal> = unwrap(this).getAdmins()?.map(IPrincipal::wrap) ?:
      emptyList()

  /**
   * Initial alias to add to the key.
   *
   * More aliases can be added later by calling `addAlias`.
   *
   * Default: - No alias is added for the key.
   */
  public fun alias(): String? = unwrap(this).getAlias()

  /**
   * A description of the key.
   *
   * Use a description that helps your users decide
   * whether the key is appropriate for a particular task.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Indicates whether AWS KMS rotates the key.
   *
   * Default: false
   */
  public fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

  /**
   * Indicates whether the key is available for use.
   *
   * Default: - Key is enabled.
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The cryptographic configuration of the key. The valid value depends on usage of the key.
   *
   * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
   * deletion
   * and a new key is created with the specified value.
   *
   * Default: KeySpec.SYMMETRIC_DEFAULT
   */
  public fun keySpec(): KeySpec? = unwrap(this).getKeySpec()?.let(KeySpec::wrap)

  /**
   * The cryptographic operations for which the key can be used.
   *
   * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
   * deletion
   * and a new key is created with the specified value.
   *
   * Default: KeyUsage.ENCRYPT_DECRYPT
   */
  public fun keyUsage(): KeyUsage? = unwrap(this).getKeyUsage()?.let(KeyUsage::wrap)

  /**
   * Specifies the number of days in the waiting period before AWS KMS deletes a CMK that has been
   * removed from a CloudFormation stack.
   *
   * When you remove a customer master key (CMK) from a CloudFormation stack, AWS KMS schedules the
   * CMK for deletion
   * and starts the mandatory waiting period. The PendingWindowInDays property determines the length
   * of waiting period.
   * During the waiting period, the key state of CMK is Pending Deletion, which prevents the CMK
   * from being used in
   * cryptographic operations. When the waiting period expires, AWS KMS permanently deletes the CMK.
   *
   * Enter a value between 7 and 30 days.
   *
   * Default: - 30 days
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-pendingwindowindays)
   */
  public fun pendingWindow(): Duration? = unwrap(this).getPendingWindow()?.let(Duration::wrap)

  /**
   * Custom policy document to attach to the KMS key.
   *
   * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
   * new projects),
   * this policy will *override* the default key policy and become the only key policy for the key.
   * If the
   * feature flag is not set, this policy will be appended to the default key policy.
   *
   * Default: - A policy document with permissions for the account root to
   * administer the key will be created.
   */
  public fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

  /**
   * Whether the encryption key should be retained when it is removed from the Stack.
   *
   * This is useful when one wants to
   * retain access to data that was encrypted with a key that is being retired.
   *
   * Default: RemovalPolicy.Retain
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [KeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param admins A list of principals to add as key administrators to the key policy.
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions
     * to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     */
    public fun admins(admins: List<IPrincipal>)

    /**
     * @param admins A list of principals to add as key administrators to the key policy.
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions
     * to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     */
    public fun admins(vararg admins: IPrincipal)

    /**
     * @param alias Initial alias to add to the key.
     * More aliases can be added later by calling `addAlias`.
     */
    public fun alias(alias: String)

    /**
     * @param description A description of the key.
     * Use a description that helps your users decide
     * whether the key is appropriate for a particular task.
     */
    public fun description(description: String)

    /**
     * @param enableKeyRotation Indicates whether AWS KMS rotates the key.
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean)

    /**
     * @param enabled Indicates whether the key is available for use.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param keySpec The cryptographic configuration of the key. The valid value depends on usage
     * of the key.
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     */
    public fun keySpec(keySpec: KeySpec)

    /**
     * @param keyUsage The cryptographic operations for which the key can be used.
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     */
    public fun keyUsage(keyUsage: KeyUsage)

    /**
     * @param pendingWindow Specifies the number of days in the waiting period before AWS KMS
     * deletes a CMK that has been removed from a CloudFormation stack.
     * When you remove a customer master key (CMK) from a CloudFormation stack, AWS KMS schedules
     * the CMK for deletion
     * and starts the mandatory waiting period. The PendingWindowInDays property determines the
     * length of waiting period.
     * During the waiting period, the key state of CMK is Pending Deletion, which prevents the CMK
     * from being used in
     * cryptographic operations. When the waiting period expires, AWS KMS permanently deletes the
     * CMK.
     *
     * Enter a value between 7 and 30 days.
     */
    public fun pendingWindow(pendingWindow: Duration)

    /**
     * @param policy Custom policy document to attach to the KMS key.
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects),
     * this policy will *override* the default key policy and become the only key policy for the
     * key. If the
     * feature flag is not set, this policy will be appended to the default key policy.
     */
    public fun policy(policy: PolicyDocument)

    /**
     * @param policy Custom policy document to attach to the KMS key.
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects),
     * this policy will *override* the default key policy and become the only key policy for the
     * key. If the
     * feature flag is not set, this policy will be appended to the default key policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91d06a29a428f9db400977a007619b727c707abbeffd97a3576933f2faaa093f")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    /**
     * @param removalPolicy Whether the encryption key should be retained when it is removed from
     * the Stack.
     * This is useful when one wants to
     * retain access to data that was encrypted with a key that is being retired.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.KeyProps.Builder =
        software.amazon.awscdk.services.kms.KeyProps.builder()

    /**
     * @param admins A list of principals to add as key administrators to the key policy.
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions
     * to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     */
    override fun admins(admins: List<IPrincipal>) {
      cdkBuilder.admins(admins.map(IPrincipal::unwrap))
    }

    /**
     * @param admins A list of principals to add as key administrators to the key policy.
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions
     * to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     */
    override fun admins(vararg admins: IPrincipal): Unit = admins(admins.toList())

    /**
     * @param alias Initial alias to add to the key.
     * More aliases can be added later by calling `addAlias`.
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * @param description A description of the key.
     * Use a description that helps your users decide
     * whether the key is appropriate for a particular task.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enableKeyRotation Indicates whether AWS KMS rotates the key.
     */
    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * @param enabled Indicates whether the key is available for use.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param keySpec The cryptographic configuration of the key. The valid value depends on usage
     * of the key.
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     */
    override fun keySpec(keySpec: KeySpec) {
      cdkBuilder.keySpec(keySpec.let(KeySpec::unwrap))
    }

    /**
     * @param keyUsage The cryptographic operations for which the key can be used.
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     */
    override fun keyUsage(keyUsage: KeyUsage) {
      cdkBuilder.keyUsage(keyUsage.let(KeyUsage::unwrap))
    }

    /**
     * @param pendingWindow Specifies the number of days in the waiting period before AWS KMS
     * deletes a CMK that has been removed from a CloudFormation stack.
     * When you remove a customer master key (CMK) from a CloudFormation stack, AWS KMS schedules
     * the CMK for deletion
     * and starts the mandatory waiting period. The PendingWindowInDays property determines the
     * length of waiting period.
     * During the waiting period, the key state of CMK is Pending Deletion, which prevents the CMK
     * from being used in
     * cryptographic operations. When the waiting period expires, AWS KMS permanently deletes the
     * CMK.
     *
     * Enter a value between 7 and 30 days.
     */
    override fun pendingWindow(pendingWindow: Duration) {
      cdkBuilder.pendingWindow(pendingWindow.let(Duration::unwrap))
    }

    /**
     * @param policy Custom policy document to attach to the KMS key.
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects),
     * this policy will *override* the default key policy and become the only key policy for the
     * key. If the
     * feature flag is not set, this policy will be appended to the default key policy.
     */
    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    /**
     * @param policy Custom policy document to attach to the KMS key.
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects),
     * this policy will *override* the default key policy and become the only key policy for the
     * key. If the
     * feature flag is not set, this policy will be appended to the default key policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91d06a29a428f9db400977a007619b727c707abbeffd97a3576933f2faaa093f")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    /**
     * @param removalPolicy Whether the encryption key should be retained when it is removed from
     * the Stack.
     * This is useful when one wants to
     * retain access to data that was encrypted with a key that is being retired.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.KeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.KeyProps,
  ) : CdkObject(cdkObject), KeyProps {
    /**
     * A list of principals to add as key administrators to the key policy.
     *
     * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
     * do not have permissions
     * to use the key in cryptographic operations (e.g., encrypt, decrypt).
     *
     * These principals will be added to the default key policy (if none specified), or to the
     * specified policy (if provided).
     *
     * Default: []
     */
    override fun admins(): List<IPrincipal> = unwrap(this).getAdmins()?.map(IPrincipal::wrap) ?:
        emptyList()

    /**
     * Initial alias to add to the key.
     *
     * More aliases can be added later by calling `addAlias`.
     *
     * Default: - No alias is added for the key.
     */
    override fun alias(): String? = unwrap(this).getAlias()

    /**
     * A description of the key.
     *
     * Use a description that helps your users decide
     * whether the key is appropriate for a particular task.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether AWS KMS rotates the key.
     *
     * Default: false
     */
    override fun enableKeyRotation(): Boolean? = unwrap(this).getEnableKeyRotation()

    /**
     * Indicates whether the key is available for use.
     *
     * Default: - Key is enabled.
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The cryptographic configuration of the key. The valid value depends on usage of the key.
     *
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     *
     * Default: KeySpec.SYMMETRIC_DEFAULT
     */
    override fun keySpec(): KeySpec? = unwrap(this).getKeySpec()?.let(KeySpec::wrap)

    /**
     * The cryptographic operations for which the key can be used.
     *
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     *
     * Default: KeyUsage.ENCRYPT_DECRYPT
     */
    override fun keyUsage(): KeyUsage? = unwrap(this).getKeyUsage()?.let(KeyUsage::wrap)

    /**
     * Specifies the number of days in the waiting period before AWS KMS deletes a CMK that has been
     * removed from a CloudFormation stack.
     *
     * When you remove a customer master key (CMK) from a CloudFormation stack, AWS KMS schedules
     * the CMK for deletion
     * and starts the mandatory waiting period. The PendingWindowInDays property determines the
     * length of waiting period.
     * During the waiting period, the key state of CMK is Pending Deletion, which prevents the CMK
     * from being used in
     * cryptographic operations. When the waiting period expires, AWS KMS permanently deletes the
     * CMK.
     *
     * Enter a value between 7 and 30 days.
     *
     * Default: - 30 days
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html#cfn-kms-key-pendingwindowindays)
     */
    override fun pendingWindow(): Duration? = unwrap(this).getPendingWindow()?.let(Duration::wrap)

    /**
     * Custom policy document to attach to the KMS key.
     *
     * NOTE - If the `&#64;aws-cdk/aws-kms:defaultKeyPolicies` feature flag is set (the default for
     * new projects),
     * this policy will *override* the default key policy and become the only key policy for the
     * key. If the
     * feature flag is not set, this policy will be appended to the default key policy.
     *
     * Default: - A policy document with permissions for the account root to
     * administer the key will be created.
     */
    override fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

    /**
     * Whether the encryption key should be retained when it is removed from the Stack.
     *
     * This is useful when one wants to
     * retain access to data that was encrypted with a key that is being retired.
     *
     * Default: RemovalPolicy.Retain
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.KeyProps): KeyProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyProps): software.amazon.awscdk.services.kms.KeyProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.kms.KeyProps
  }
}
