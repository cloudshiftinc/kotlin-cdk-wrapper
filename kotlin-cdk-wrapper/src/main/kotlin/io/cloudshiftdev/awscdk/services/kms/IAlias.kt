@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * A KMS Key alias.
 *
 * An alias can be used in all places that expect a key.
 */
public interface IAlias : IKey {
  /**
   * The name of the alias.
   */
  public fun aliasName(): String

  /**
   * The Key to which the Alias refers.
   */
  public fun aliasTargetKey(): IKey

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.IAlias,
  ) : CdkObject(cdkObject), IAlias {
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
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

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
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap),
        allowNoOp).let(AddToResourcePolicyResult::wrap)

    /**
     * The name of the alias.
     */
    override fun aliasName(): String = unwrap(this).getAliasName()

    /**
     * The Key to which the Alias refers.
     */
    override fun aliasTargetKey(): IKey = unwrap(this).getAliasTargetKey().let(IKey::wrap)

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
    override fun grant(grantee: IGrantable, actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

    /**
     * Grant decryption permissions using this key to the given principal.
     *
     * @param grantee 
     */
    override fun grantDecrypt(grantee: IGrantable): Grant =
        unwrap(this).grantDecrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant encryption permissions using this key to the given principal.
     *
     * @param grantee 
     */
    override fun grantEncrypt(grantee: IGrantable): Grant =
        unwrap(this).grantEncrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant encryption and decryption permissions using this key to the given principal.
     *
     * @param grantee 
     */
    override fun grantEncryptDecrypt(grantee: IGrantable): Grant =
        unwrap(this).grantEncryptDecrypt(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant permissions to generating MACs to the given principal.
     *
     * @param grantee 
     */
    override fun grantGenerateMac(grantee: IGrantable): Grant =
        unwrap(this).grantGenerateMac(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant permissions to verifying MACs to the given principal.
     *
     * @param grantee 
     */
    override fun grantVerifyMac(grantee: IGrantable): Grant =
        unwrap(this).grantVerifyMac(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

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
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.IAlias): IAlias =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlias): software.amazon.awscdk.services.kms.IAlias = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kms.IAlias
  }
}
