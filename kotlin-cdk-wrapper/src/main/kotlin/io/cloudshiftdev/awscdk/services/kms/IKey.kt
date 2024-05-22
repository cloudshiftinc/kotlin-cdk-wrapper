@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A KMS Key, either managed by this CDK app, or imported.
 */
public interface IKey : IResource {
  /**
   * Defines a new alias for the key.
   *
   * @param alias 
   */
  public fun addAlias(alias: String): Alias

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement The policy statement to add. 
   * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external key),
   * the operation will fail. Otherwise, it will no-op.
   */
  public fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement The policy statement to add. 
   * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external key),
   * the operation will fail. Otherwise, it will no-op.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  /**
   * Adds a statement to the KMS key resource policy.
   *
   * @param statement The policy statement to add. 
   * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external key),
   * the operation will fail. Otherwise, it will no-op.
   */
  public fun addToResourcePolicy(statement: PolicyStatement, allowNoOp: Boolean):
      AddToResourcePolicyResult

  /**
   * Grant the indicated permissions on this key to the given principal.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, vararg actions: String): Grant

  /**
   * Grant decryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public fun grantDecrypt(grantee: IGrantable): Grant

  /**
   * Grant encryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public fun grantEncrypt(grantee: IGrantable): Grant

  /**
   * Grant encryption and decryption permissions using this key to the given principal.
   *
   * @param grantee 
   */
  public fun grantEncryptDecrypt(grantee: IGrantable): Grant

  /**
   * Grant permissions to generating MACs to the given principal.
   *
   * @param grantee 
   */
  public fun grantGenerateMac(grantee: IGrantable): Grant

  /**
   * Grant permissions to verifying MACs to the given principal.
   *
   * @param grantee 
   */
  public fun grantVerifyMac(grantee: IGrantable): Grant

  /**
   * The ARN of the key.
   */
  public fun keyArn(): String

  /**
   * The ID of the key (the part that looks something like: 1234abcd-12ab-34cd-56ef-1234567890ab).
   */
  public fun keyId(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kms.IKey,
  ) : CdkObject(cdkObject), IKey {
    /**
     * Defines a new alias for the key.
     *
     * @param alias 
     */
    override fun addAlias(alias: String): Alias = unwrap(this).addAlias(alias).let(Alias::wrap)

    /**
     * Adds a statement to the KMS key resource policy.
     *
     * @param statement The policy statement to add. 
     * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external
     * key), the operation will fail. Otherwise, it will no-op.
     */
    override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

    /**
     * Adds a statement to the KMS key resource policy.
     *
     * @param statement The policy statement to add. 
     * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external
     * key), the operation will fail. Otherwise, it will no-op.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

    /**
     * Adds a statement to the KMS key resource policy.
     *
     * @param statement The policy statement to add. 
     * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external
     * key), the operation will fail. Otherwise, it will no-op.
     */
    override fun addToResourcePolicy(statement: PolicyStatement, allowNoOp: Boolean):
        AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap),
        allowNoOp).let(AddToResourcePolicyResult::wrap)

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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

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
     * Grant the indicated permissions on this key to the given principal.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, vararg actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
        *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * Grant decryption permissions using this key to the given principal.
     *
     * @param grantee 
     */
    override fun grantDecrypt(grantee: IGrantable): Grant =
        unwrap(this).grantDecrypt(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant encryption permissions using this key to the given principal.
     *
     * @param grantee 
     */
    override fun grantEncrypt(grantee: IGrantable): Grant =
        unwrap(this).grantEncrypt(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant encryption and decryption permissions using this key to the given principal.
     *
     * @param grantee 
     */
    override fun grantEncryptDecrypt(grantee: IGrantable): Grant =
        unwrap(this).grantEncryptDecrypt(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant permissions to generating MACs to the given principal.
     *
     * @param grantee 
     */
    override fun grantGenerateMac(grantee: IGrantable): Grant =
        unwrap(this).grantGenerateMac(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Grant permissions to verifying MACs to the given principal.
     *
     * @param grantee 
     */
    override fun grantVerifyMac(grantee: IGrantable): Grant =
        unwrap(this).grantVerifyMac(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * The ARN of the key.
     */
    override fun keyArn(): String = unwrap(this).getKeyArn()

    /**
     * The ID of the key (the part that looks something like: 1234abcd-12ab-34cd-56ef-1234567890ab).
     */
    override fun keyId(): String = unwrap(this).getKeyId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.IKey): IKey =
        CdkObjectWrappers.wrap(cdkObject) as? IKey ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IKey): software.amazon.awscdk.services.kms.IKey = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kms.IKey
  }
}
