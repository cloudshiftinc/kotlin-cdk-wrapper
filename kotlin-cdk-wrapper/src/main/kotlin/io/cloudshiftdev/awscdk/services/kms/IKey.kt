@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
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
  public fun grant(grantee: IGrantable, actions: String): Grant

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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.IKey): IKey =
        CdkObjectWrappers.wrap(cdkObject) as IKey

    internal fun unwrap(wrapped: IKey): software.amazon.awscdk.services.kms.IKey = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kms.IKey
  }
}
