@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a KMS key.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * IInstanceEngine engine =
 * DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build());
 * Key myKey = new Key(this, "MyKey");
 * DatabaseInstance.Builder.create(this, "InstanceWithCustomizedSecret")
 * .engine(engine)
 * .vpc(vpc)
 * .credentials(Credentials.fromGeneratedSecret("postgres", CredentialsBaseOptions.builder()
 * .secretName("my-cool-name")
 * .encryptionKey(myKey)
 * .excludeCharacters("!&amp;*^#&#64;()")
 * .replicaRegions(List.of(ReplicaRegion.builder().region("eu-west-1").build(),
 * ReplicaRegion.builder().region("eu-west-2").build()))
 * .build()))
 * .build();
 * ```
 */
public open class Key internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kms.Key,
) : Resource(cdkObject), IKey {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.kms.Key(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeyProps,
  ) :
      this(software.amazon.awscdk.services.kms.Key(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(KeyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeyProps.Builder.() -> Unit,
  ) : this(scope, id, KeyProps(props)
  )

  /**
   * Defines a new alias for the key.
   *
   * @param aliasName 
   */
  public override fun addAlias(aliasName: String): Alias =
      unwrap(this).addAlias(aliasName).let(Alias::wrap)

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement The policy statement to add. 
   * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external key),
   * the operation will fail. Otherwise, it will no-op.
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement The policy statement to add. 
   * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external key),
   * the operation will fail. Otherwise, it will no-op.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement The policy statement to add. 
   * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external key),
   * the operation will fail. Otherwise, it will no-op.
   */
  public override fun addToResourcePolicy(statement: PolicyStatement, allowNoOp: Boolean):
      AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap),
      allowNoOp).let(AddToResourcePolicyResult::wrap)

  /**
   * Grant the indicated permissions on this key to the given principal.
   *
   * This modifies both the principal's policy as well as the resource policy,
   * since the default CloudFormation setup for KMS keys is that the policy
   * must not be empty and so default grants won't work.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), *actions).let(Grant::wrap)

  /**
   * Grant admins permissions using this key to the given principal.
   *
   * Key administrators have permissions to manage the key (e.g., change permissions, revoke), but
   * do not have permissions
   * to use the key in cryptographic operations (e.g., encrypt, decrypt).
   *
   * @param grantee 
   */
  public open fun grantAdmin(grantee: IGrantable): Grant =
      unwrap(this).grantAdmin(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant decryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public override fun grantDecrypt(grantee: IGrantable): Grant =
      unwrap(this).grantDecrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant encryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public override fun grantEncrypt(grantee: IGrantable): Grant =
      unwrap(this).grantEncrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant encryption and decryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public override fun grantEncryptDecrypt(grantee: IGrantable): Grant =
      unwrap(this).grantEncryptDecrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant permissions to generating MACs to the given principal.
   *
   * @param grantee 
   */
  public override fun grantGenerateMac(grantee: IGrantable): Grant =
      unwrap(this).grantGenerateMac(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant permissions to verifying MACs to the given principal.
   *
   * @param grantee 
   */
  public override fun grantVerifyMac(grantee: IGrantable): Grant =
      unwrap(this).grantVerifyMac(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * The ARN of the key.
   */
  public override fun keyArn(): String = unwrap(this).getKeyArn()

  /**
   * The ID of the key (the part that looks something like: 1234abcd-12ab-34cd-56ef-1234567890ab).
   */
  public override fun keyId(): String = unwrap(this).getKeyId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kms.Key].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param admins A list of principals to add as key administrators to the key policy. 
     */
    public fun admins(admins: List<IPrincipal>)

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
     *
     * @param admins A list of principals to add as key administrators to the key policy. 
     */
    public fun admins(vararg admins: IPrincipal)

    /**
     * Initial alias to add to the key.
     *
     * More aliases can be added later by calling `addAlias`.
     *
     * Default: - No alias is added for the key.
     *
     * @param alias Initial alias to add to the key. 
     */
    public fun alias(alias: String)

    /**
     * A description of the key.
     *
     * Use a description that helps your users decide
     * whether the key is appropriate for a particular task.
     *
     * Default: - No description.
     *
     * @param description A description of the key. 
     */
    public fun description(description: String)

    /**
     * Indicates whether AWS KMS rotates the key.
     *
     * Default: false
     *
     * @param enableKeyRotation Indicates whether AWS KMS rotates the key. 
     */
    public fun enableKeyRotation(enableKeyRotation: Boolean)

    /**
     * Indicates whether the key is available for use.
     *
     * Default: - Key is enabled.
     *
     * @param enabled Indicates whether the key is available for use. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The cryptographic configuration of the key. The valid value depends on usage of the key.
     *
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     *
     * Default: KeySpec.SYMMETRIC_DEFAULT
     *
     * @param keySpec The cryptographic configuration of the key. The valid value depends on usage
     * of the key. 
     */
    public fun keySpec(keySpec: KeySpec)

    /**
     * The cryptographic operations for which the key can be used.
     *
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     *
     * Default: KeyUsage.ENCRYPT_DECRYPT
     *
     * @param keyUsage The cryptographic operations for which the key can be used. 
     */
    public fun keyUsage(keyUsage: KeyUsage)

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
     * @param pendingWindow Specifies the number of days in the waiting period before AWS KMS
     * deletes a CMK that has been removed from a CloudFormation stack. 
     */
    public fun pendingWindow(pendingWindow: Duration)

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
     *
     * @param policy Custom policy document to attach to the KMS key. 
     */
    public fun policy(policy: PolicyDocument)

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
     *
     * @param policy Custom policy document to attach to the KMS key. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c7475e42519d6a2cabeb2117fee0a8b686e15b9804c0b06233e8ae6370d2268")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    /**
     * Whether the encryption key should be retained when it is removed from the Stack.
     *
     * This is useful when one wants to
     * retain access to data that was encrypted with a key that is being retired.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Whether the encryption key should be retained when it is removed from
     * the Stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.Key.Builder =
        software.amazon.awscdk.services.kms.Key.Builder.create(scope, id)

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
     *
     * @param admins A list of principals to add as key administrators to the key policy. 
     */
    override fun admins(admins: List<IPrincipal>) {
      cdkBuilder.admins(admins.map(IPrincipal::unwrap))
    }

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
     *
     * @param admins A list of principals to add as key administrators to the key policy. 
     */
    override fun admins(vararg admins: IPrincipal): Unit = admins(admins.toList())

    /**
     * Initial alias to add to the key.
     *
     * More aliases can be added later by calling `addAlias`.
     *
     * Default: - No alias is added for the key.
     *
     * @param alias Initial alias to add to the key. 
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * A description of the key.
     *
     * Use a description that helps your users decide
     * whether the key is appropriate for a particular task.
     *
     * Default: - No description.
     *
     * @param description A description of the key. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Indicates whether AWS KMS rotates the key.
     *
     * Default: false
     *
     * @param enableKeyRotation Indicates whether AWS KMS rotates the key. 
     */
    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    /**
     * Indicates whether the key is available for use.
     *
     * Default: - Key is enabled.
     *
     * @param enabled Indicates whether the key is available for use. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The cryptographic configuration of the key. The valid value depends on usage of the key.
     *
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     *
     * Default: KeySpec.SYMMETRIC_DEFAULT
     *
     * @param keySpec The cryptographic configuration of the key. The valid value depends on usage
     * of the key. 
     */
    override fun keySpec(keySpec: KeySpec) {
      cdkBuilder.keySpec(keySpec.let(KeySpec::unwrap))
    }

    /**
     * The cryptographic operations for which the key can be used.
     *
     * IMPORTANT: If you change this property of an existing key, the existing key is scheduled for
     * deletion
     * and a new key is created with the specified value.
     *
     * Default: KeyUsage.ENCRYPT_DECRYPT
     *
     * @param keyUsage The cryptographic operations for which the key can be used. 
     */
    override fun keyUsage(keyUsage: KeyUsage) {
      cdkBuilder.keyUsage(keyUsage.let(KeyUsage::unwrap))
    }

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
     * @param pendingWindow Specifies the number of days in the waiting period before AWS KMS
     * deletes a CMK that has been removed from a CloudFormation stack. 
     */
    override fun pendingWindow(pendingWindow: Duration) {
      cdkBuilder.pendingWindow(pendingWindow.let(Duration::unwrap))
    }

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
     *
     * @param policy Custom policy document to attach to the KMS key. 
     */
    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

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
     *
     * @param policy Custom policy document to attach to the KMS key. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c7475e42519d6a2cabeb2117fee0a8b686e15b9804c0b06233e8ae6370d2268")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    /**
     * Whether the encryption key should be retained when it is removed from the Stack.
     *
     * This is useful when one wants to
     * retain access to data that was encrypted with a key that is being retired.
     *
     * Default: RemovalPolicy.Retain
     *
     * @param removalPolicy Whether the encryption key should be retained when it is removed from
     * the Stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.Key = cdkBuilder.build()
  }

  public companion object {
    public fun fromCfnKey(cfnKey: CfnKey): IKey =
        software.amazon.awscdk.services.kms.Key.fromCfnKey(cfnKey.let(CfnKey::unwrap)).let(IKey::wrap)

    public fun fromKeyArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      keyArn: String,
    ): IKey =
        software.amazon.awscdk.services.kms.Key.fromKeyArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, keyArn).let(IKey::wrap)

    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: KeyLookupOptions,
    ): IKey =
        software.amazon.awscdk.services.kms.Key.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(KeyLookupOptions::unwrap)).let(IKey::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a38292968d860b56054807de2f29eed5b258ee0b12b25fe8d96e0d9eadd0a18a")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: KeyLookupOptions.Builder.() -> Unit,
    ): IKey = fromLookup(scope, id, KeyLookupOptions(options))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Key {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Key(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.Key): Key = Key(cdkObject)

    internal fun unwrap(wrapped: Key): software.amazon.awscdk.services.kms.Key = wrapped.cdkObject
  }
}
