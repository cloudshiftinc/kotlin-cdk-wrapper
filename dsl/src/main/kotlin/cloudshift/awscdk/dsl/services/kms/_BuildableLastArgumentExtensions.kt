@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Unit
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.kms.Key

/**
 * Adds a statement to the KMS key resource policy.
 *
 * @param statement The policy statement to add. 
 * @param allowNoOp If this is set to `false` and there is no policy defined (i.e. external key),
 * the operation will fail. Otherwise, it will no-op.
 */
public inline fun Key.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

/**
 * Adds a statement to the KMS key resource policy.
 *
 * @param statement 
 * @param allowNoOp
 */
public inline fun Alias.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun IKey.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}
