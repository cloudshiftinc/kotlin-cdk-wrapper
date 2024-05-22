@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a display name for a customer master key (CMK) in AWS Key Management Service (AWS KMS).
 *
 * Using an alias to refer to a key can help you simplify key
 * management. For example, when rotating keys, you can just update the alias
 * mapping instead of tracking and changing key IDs. For more information, see
 * Working with Aliases in the AWS Key Management Service Developer Guide.
 *
 * You can also add an alias for a key by calling `key.addAlias(alias)`.
 *
 * Example:
 *
 * ```
 * // Passing an encrypted replication bucket created in a different stack.
 * App app = new App();
 * Stack replicationStack = Stack.Builder.create(app, "ReplicationStack")
 * .env(Environment.builder()
 * .region("us-west-1")
 * .build())
 * .build();
 * Key key = new Key(replicationStack, "ReplicationKey");
 * Alias alias = Alias.Builder.create(replicationStack, "ReplicationAlias")
 * // aliasName is required
 * .aliasName(PhysicalName.GENERATE_IF_NEEDED)
 * .targetKey(key)
 * .build();
 * Bucket replicationBucket = Bucket.Builder.create(replicationStack, "ReplicationBucket")
 * .bucketName(PhysicalName.GENERATE_IF_NEEDED)
 * .encryptionKey(alias)
 * .build();
 * ```
 */
public open class Alias(
  cdkObject: software.amazon.awscdk.services.kms.Alias,
) : Resource(cdkObject), IAlias {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AliasProps,
  ) :
      this(software.amazon.awscdk.services.kms.Alias(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AliasProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AliasProps.Builder.() -> Unit,
  ) : this(scope, id, AliasProps(props)
  )

  /**
   * Defines a new alias for the key.
   *
   * @param alias 
   */
  public override fun addAlias(alias: String): Alias = unwrap(this).addAlias(alias).let(Alias::wrap)

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement 
   * @param allowNoOp
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement 
   * @param allowNoOp
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement 
   * @param allowNoOp
   */
  public override fun addToResourcePolicy(statement: PolicyStatement, allowNoOp: Boolean):
      AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap),
      allowNoOp).let(AddToResourcePolicyResult::wrap)

  /**
   * The ARN of the alias.
   */
  public open fun aliasArn(): String = unwrap(this).getAliasArn()

  /**
   * The name of the alias.
   */
  public override fun aliasName(): String = unwrap(this).getAliasName()

  /**
   * The Key to which the Alias refers.
   */
  public override fun aliasTargetKey(): IKey = unwrap(this).getAliasTargetKey().let(IKey::wrap)

  /**
   * Grant the indicated permissions on this key to the given principal.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Grant decryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public override fun grantDecrypt(grantee: IGrantable): Grant =
      unwrap(this).grantDecrypt(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant encryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public override fun grantEncrypt(grantee: IGrantable): Grant =
      unwrap(this).grantEncrypt(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant encryption and decryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public override fun grantEncryptDecrypt(grantee: IGrantable): Grant =
      unwrap(this).grantEncryptDecrypt(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant permissions to generating MACs to the given principal.
   *
   * @param grantee 
   */
  public override fun grantGenerateMac(grantee: IGrantable): Grant =
      unwrap(this).grantGenerateMac(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant permissions to verifying MACs to the given principal.
   *
   * @param grantee 
   */
  public override fun grantVerifyMac(grantee: IGrantable): Grant =
      unwrap(this).grantVerifyMac(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) The ARN of the alias.
   *
   * @deprecated use `aliasArn` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun keyArn(): String = unwrap(this).getKeyArn()

  /**
   * The ID of the key (the part that looks something like: 1234abcd-12ab-34cd-56ef-1234567890ab).
   */
  public override fun keyId(): String = unwrap(this).getKeyId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kms.Alias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the alias.
     *
     * The name must start with alias followed by a
     * forward slash, such as alias/. You can't specify aliases that begin with
     * alias/AWS. These aliases are reserved.
     *
     * @param aliasName The name of the alias. 
     */
    public fun aliasName(aliasName: String)

    /**
     * Policy to apply when the alias is removed from this stack.
     *
     * Default: - The alias will be deleted
     *
     * @param removalPolicy Policy to apply when the alias is removed from this stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The ID of the key for which you are creating the alias.
     *
     * Specify the key's
     * globally unique identifier or Amazon Resource Name (ARN). You can't
     * specify another alias.
     *
     * @param targetKey The ID of the key for which you are creating the alias. 
     */
    public fun targetKey(targetKey: IKey)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.Alias.Builder =
        software.amazon.awscdk.services.kms.Alias.Builder.create(scope, id)

    /**
     * The name of the alias.
     *
     * The name must start with alias followed by a
     * forward slash, such as alias/. You can't specify aliases that begin with
     * alias/AWS. These aliases are reserved.
     *
     * @param aliasName The name of the alias. 
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * Policy to apply when the alias is removed from this stack.
     *
     * Default: - The alias will be deleted
     *
     * @param removalPolicy Policy to apply when the alias is removed from this stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The ID of the key for which you are creating the alias.
     *
     * Specify the key's
     * globally unique identifier or Amazon Resource Name (ARN). You can't
     * specify another alias.
     *
     * @param targetKey The ID of the key for which you are creating the alias. 
     */
    override fun targetKey(targetKey: IKey) {
      cdkBuilder.targetKey(targetKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.Alias = cdkBuilder.build()
  }

  public companion object {
    public fun fromAliasAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AliasAttributes,
    ): IAlias =
        software.amazon.awscdk.services.kms.Alias.fromAliasAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(AliasAttributes.Companion::unwrap)).let(IAlias::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f8a4f380057c7db5b4bb4a37859d5e4eb587ce5d28aeceaa398fb06fc738c1f")
    public fun fromAliasAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AliasAttributes.Builder.() -> Unit,
    ): IAlias = fromAliasAttributes(scope, id, AliasAttributes(attrs))

    public fun fromAliasName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      aliasName: String,
    ): IAlias =
        software.amazon.awscdk.services.kms.Alias.fromAliasName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, aliasName).let(IAlias::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Alias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Alias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.Alias): Alias =
        Alias(cdkObject)

    internal fun unwrap(wrapped: Alias): software.amazon.awscdk.services.kms.Alias =
        wrapped.cdkObject as software.amazon.awscdk.services.kms.Alias
  }
}
