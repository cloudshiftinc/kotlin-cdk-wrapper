@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 *
 */
public abstract class VpcEndpoint(
  cdkObject: software.amazon.awscdk.services.ec2.VpcEndpoint,
) : Resource(cdkObject), IVpcEndpoint {
  /**
   * Adds a statement to the policy document of the VPC endpoint. The statement must have a
   * Principal.
   *
   * Not all interface VPC endpoints support policy. For more information
   * see https://docs.aws.amazon.com/vpc/latest/userguide/vpce-interface.html
   *
   * @param statement the IAM statement to add. 
   */
  public open fun addToPolicy(statement: PolicyStatement) {
    unwrap(this).addToPolicy(statement.let(PolicyStatement::unwrap))
  }

  /**
   * Adds a statement to the policy document of the VPC endpoint. The statement must have a
   * Principal.
   *
   * Not all interface VPC endpoints support policy. For more information
   * see https://docs.aws.amazon.com/vpc/latest/userguide/vpce-interface.html
   *
   * @param statement the IAM statement to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2eea211fe501e0e50683eae70fa3c2771f31519727d8e172bc0eb1dfa9f6b6cb")
  public open fun addToPolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToPolicy(PolicyStatement(statement))

  /**
   * The VPC endpoint identifier.
   */
  public override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.VpcEndpoint,
  ) : VpcEndpoint(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpoint): VpcEndpoint =
        CdkObjectWrappers.wrap(cdkObject) as? VpcEndpoint ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcEndpoint): software.amazon.awscdk.services.ec2.VpcEndpoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VpcEndpoint
  }
}
