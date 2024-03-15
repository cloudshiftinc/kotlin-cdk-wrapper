@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IReceiptRuleSet : IResource {
  public fun addRule(arg0: String): ReceiptRule

  public fun addRule(arg0: String, arg1: ReceiptRuleOptions): ReceiptRule

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9870cb7a366bfe448970b02b093ce946df61e1278e1b984e00908c5e1e1d5df")
  public fun addRule(arg0: String, arg1: ReceiptRuleOptions.Builder.() -> Unit): ReceiptRule

  public fun receiptRuleSetName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleSet,
  ) : CdkObject(cdkObject), IReceiptRuleSet {
    override fun addRule(arg0: String): ReceiptRule =
        unwrap(this).addRule(arg0).let(ReceiptRule::wrap)

    override fun addRule(arg0: String, arg1: ReceiptRuleOptions): ReceiptRule =
        unwrap(this).addRule(arg0, arg1.let(ReceiptRuleOptions::unwrap)).let(ReceiptRule::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9870cb7a366bfe448970b02b093ce946df61e1278e1b984e00908c5e1e1d5df")
    override fun addRule(arg0: String, arg1: ReceiptRuleOptions.Builder.() -> Unit): ReceiptRule =
        addRule(arg0, ReceiptRuleOptions(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun receiptRuleSetName(): String = unwrap(this).getReceiptRuleSetName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IReceiptRuleSet):
        IReceiptRuleSet = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IReceiptRuleSet):
        software.amazon.awscdk.services.ses.IReceiptRuleSet = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.IReceiptRuleSet
  }
}
