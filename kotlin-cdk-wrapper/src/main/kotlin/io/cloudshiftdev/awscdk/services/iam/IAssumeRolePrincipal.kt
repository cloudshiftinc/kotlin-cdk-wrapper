@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A type of principal that has more control over its own representation in
 * AssumeRolePolicyDocuments.
 *
 * More complex types of identity providers need more control over Role's policy documents
 * than simply `{ Effect: 'Allow', Action: 'AssumeRole', Principal: &lt;Whatever&gt; }`.
 *
 * If that control is necessary, they can implement `IAssumeRolePrincipal` to get full
 * access to a Role's AssumeRolePolicyDocument.
 */
public interface IAssumeRolePrincipal : IPrincipal {
  /**
   * Add the principal to the AssumeRolePolicyDocument.
   *
   * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
   * permissions to assume the given role.
   *
   * @param document 
   */
  public fun addToAssumeRolePolicy(document: PolicyDocument)

  /**
   * Add the principal to the AssumeRolePolicyDocument.
   *
   * Add the statements to the AssumeRolePolicyDocument necessary to give this principal
   * permissions to assume the given role.
   *
   * @param document 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cef9e06c9678a219d566dc6f09959675ba743f7c64440ddbd5b37c4d552db9c0")
  public fun addToAssumeRolePolicy(document: PolicyDocument.Builder.() -> Unit)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.IAssumeRolePrincipal):
        IAssumeRolePrincipal = CdkObjectWrappers.wrap(cdkObject) as IAssumeRolePrincipal

    internal fun unwrap(wrapped: IAssumeRolePrincipal):
        software.amazon.awscdk.services.iam.IAssumeRolePrincipal = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.IAssumeRolePrincipal
  }
}
