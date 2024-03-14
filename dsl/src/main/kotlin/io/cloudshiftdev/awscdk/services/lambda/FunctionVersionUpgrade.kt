package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.constructs.IConstruct

public open class FunctionVersionUpgrade internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.FunctionVersionUpgrade,
) : CdkObject(cdkObject), IAspect {
  /**
   * All aspects can visit an IConstruct.
   *
   * @param node 
   */
  public override fun visit(node: IConstruct) {
    unwrap(this).visit(node.let(IConstruct::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionVersionUpgrade):
        FunctionVersionUpgrade = FunctionVersionUpgrade(cdkObject)

    internal fun unwrap(wrapped: FunctionVersionUpgrade):
        software.amazon.awscdk.services.lambda.FunctionVersionUpgrade = wrapped.cdkObject
  }
}
