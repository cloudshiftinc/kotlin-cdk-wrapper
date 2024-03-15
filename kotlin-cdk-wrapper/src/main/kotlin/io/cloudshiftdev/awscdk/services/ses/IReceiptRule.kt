@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IReceiptRule : IResource {
  public fun receiptRuleName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.IReceiptRule,
  ) : CdkObject(cdkObject), IReceiptRule {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun receiptRuleName(): String = unwrap(this).getReceiptRuleName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IReceiptRule): IReceiptRule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReceiptRule): software.amazon.awscdk.services.ses.IReceiptRule =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.IReceiptRule
  }
}
