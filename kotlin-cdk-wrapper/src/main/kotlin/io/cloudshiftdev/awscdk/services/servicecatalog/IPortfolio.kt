@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.IUser
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IPortfolio : IResource {
  public fun addProduct(arg0: IProduct)

  public fun associateTagOptions(arg0: TagOptions)

  public fun constrainCloudFormationParameters(arg0: IProduct,
      arg1: CloudFormationRuleConstraintOptions)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("32bd369b539af8a90f2d7eeba368e4aa7a21c37de31a02b54c2303a5be146028")
  public fun constrainCloudFormationParameters(arg0: IProduct,
      arg1: CloudFormationRuleConstraintOptions.Builder.() -> Unit)

  public fun constrainTagUpdates(arg0: IProduct)

  public fun constrainTagUpdates(arg0: IProduct, arg1: TagUpdateConstraintOptions)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("919b36b21cc39a414fd014dc28ebcbcb3f794d52cc5f005a69d0019a3a2698f1")
  public fun constrainTagUpdates(arg0: IProduct,
      arg1: TagUpdateConstraintOptions.Builder.() -> Unit)

  public fun deployWithStackSets(arg0: IProduct, arg1: StackSetsConstraintOptions)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("476ed84dec221f7c2f3642fe8196cc1d576449c54c5b15ebcdb41211e260b952")
  public fun deployWithStackSets(arg0: IProduct,
      arg1: StackSetsConstraintOptions.Builder.() -> Unit)

  public fun giveAccessToGroup(arg0: IGroup)

  public fun giveAccessToRole(arg0: IRole)

  public fun giveAccessToUser(arg0: IUser)

  public fun launchRole(arg0: IProduct, arg1: IRole)

  public fun launchRole(
    arg0: IProduct,
    arg1: IRole,
    arg2: CommonConstraintOptions,
  )

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98c41e7622968105b9c940bb8b9d23876232e99fe93e56e1ceccc3e68180e189")
  public fun launchRole(
    arg0: IProduct,
    arg1: IRole,
    arg2: CommonConstraintOptions.Builder.() -> Unit,
  )

  public fun localLaunchRole(arg0: IProduct, arg1: IRole)

  public fun localLaunchRole(
    arg0: IProduct,
    arg1: IRole,
    arg2: CommonConstraintOptions,
  )

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a2436b7c82af62c4bbb20f6c53c9c4a3bb0b6044330b1ece2432fcc67a711d2")
  public fun localLaunchRole(
    arg0: IProduct,
    arg1: IRole,
    arg2: CommonConstraintOptions.Builder.() -> Unit,
  )

  public fun localLaunchRoleName(arg0: IProduct, arg1: String): IRole

  public fun localLaunchRoleName(
    arg0: IProduct,
    arg1: String,
    arg2: CommonConstraintOptions,
  ): IRole

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b21d056b146d924a5bf7908dfbd822cdd3fc6e4f92eec800d58dd3f534e3936")
  public fun localLaunchRoleName(
    arg0: IProduct,
    arg1: String,
    arg2: CommonConstraintOptions.Builder.() -> Unit,
  ): IRole

  public fun notifyOnStackEvents(arg0: IProduct, arg1: ITopic)

  public fun notifyOnStackEvents(
    arg0: IProduct,
    arg1: ITopic,
    arg2: CommonConstraintOptions,
  )

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c956a9bd1f74ede14814e6f7193ab364f4ec8d2e27dcce869f7d90985ee9f22")
  public fun notifyOnStackEvents(
    arg0: IProduct,
    arg1: ITopic,
    arg2: CommonConstraintOptions.Builder.() -> Unit,
  )

  public fun portfolioArn(): String

  public fun portfolioId(): String

  public fun shareWithAccount(arg0: String)

  public fun shareWithAccount(arg0: String, arg1: PortfolioShareOptions)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f9ea6bd3614654a35a908789dc09bbfdc040e68f2d5a1bbc5fd1b26439d1ad4")
  public fun shareWithAccount(arg0: String, arg1: PortfolioShareOptions.Builder.() -> Unit)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.IPortfolio,
  ) : CdkObject(cdkObject), IPortfolio {
    override fun addProduct(arg0: IProduct) {
      unwrap(this).addProduct(arg0.let(IProduct::unwrap))
    }

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun associateTagOptions(arg0: TagOptions) {
      unwrap(this).associateTagOptions(arg0.let(TagOptions::unwrap))
    }

    override fun constrainCloudFormationParameters(arg0: IProduct,
        arg1: CloudFormationRuleConstraintOptions) {
      unwrap(this).constrainCloudFormationParameters(arg0.let(IProduct::unwrap),
          arg1.let(CloudFormationRuleConstraintOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32bd369b539af8a90f2d7eeba368e4aa7a21c37de31a02b54c2303a5be146028")
    override fun constrainCloudFormationParameters(arg0: IProduct,
        arg1: CloudFormationRuleConstraintOptions.Builder.() -> Unit): Unit =
        constrainCloudFormationParameters(arg0, CloudFormationRuleConstraintOptions(arg1))

    override fun constrainTagUpdates(arg0: IProduct) {
      unwrap(this).constrainTagUpdates(arg0.let(IProduct::unwrap))
    }

    override fun constrainTagUpdates(arg0: IProduct, arg1: TagUpdateConstraintOptions) {
      unwrap(this).constrainTagUpdates(arg0.let(IProduct::unwrap),
          arg1.let(TagUpdateConstraintOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("919b36b21cc39a414fd014dc28ebcbcb3f794d52cc5f005a69d0019a3a2698f1")
    override fun constrainTagUpdates(arg0: IProduct,
        arg1: TagUpdateConstraintOptions.Builder.() -> Unit): Unit = constrainTagUpdates(arg0,
        TagUpdateConstraintOptions(arg1))

    override fun deployWithStackSets(arg0: IProduct, arg1: StackSetsConstraintOptions) {
      unwrap(this).deployWithStackSets(arg0.let(IProduct::unwrap),
          arg1.let(StackSetsConstraintOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("476ed84dec221f7c2f3642fe8196cc1d576449c54c5b15ebcdb41211e260b952")
    override fun deployWithStackSets(arg0: IProduct,
        arg1: StackSetsConstraintOptions.Builder.() -> Unit): Unit = deployWithStackSets(arg0,
        StackSetsConstraintOptions(arg1))

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun giveAccessToGroup(arg0: IGroup) {
      unwrap(this).giveAccessToGroup(arg0.let(IGroup::unwrap))
    }

    override fun giveAccessToRole(arg0: IRole) {
      unwrap(this).giveAccessToRole(arg0.let(IRole::unwrap))
    }

    override fun giveAccessToUser(arg0: IUser) {
      unwrap(this).giveAccessToUser(arg0.let(IUser::unwrap))
    }

    override fun launchRole(arg0: IProduct, arg1: IRole) {
      unwrap(this).setLaunchRole(arg0.let(IProduct::unwrap), arg1.let(IRole::unwrap))
    }

    override fun launchRole(
      arg0: IProduct,
      arg1: IRole,
      arg2: CommonConstraintOptions,
    ) {
      unwrap(this).setLaunchRole(arg0.let(IProduct::unwrap), arg1.let(IRole::unwrap),
          arg2.let(CommonConstraintOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98c41e7622968105b9c940bb8b9d23876232e99fe93e56e1ceccc3e68180e189")
    override fun launchRole(
      arg0: IProduct,
      arg1: IRole,
      arg2: CommonConstraintOptions.Builder.() -> Unit,
    ): Unit = launchRole(arg0, arg1, CommonConstraintOptions(arg2))

    override fun localLaunchRole(arg0: IProduct, arg1: IRole) {
      unwrap(this).setLocalLaunchRole(arg0.let(IProduct::unwrap), arg1.let(IRole::unwrap))
    }

    override fun localLaunchRole(
      arg0: IProduct,
      arg1: IRole,
      arg2: CommonConstraintOptions,
    ) {
      unwrap(this).setLocalLaunchRole(arg0.let(IProduct::unwrap), arg1.let(IRole::unwrap),
          arg2.let(CommonConstraintOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a2436b7c82af62c4bbb20f6c53c9c4a3bb0b6044330b1ece2432fcc67a711d2")
    override fun localLaunchRole(
      arg0: IProduct,
      arg1: IRole,
      arg2: CommonConstraintOptions.Builder.() -> Unit,
    ): Unit = localLaunchRole(arg0, arg1, CommonConstraintOptions(arg2))

    override fun localLaunchRoleName(arg0: IProduct, arg1: String): IRole =
        unwrap(this).setLocalLaunchRoleName(arg0.let(IProduct::unwrap), arg1).let(IRole::wrap)

    override fun localLaunchRoleName(
      arg0: IProduct,
      arg1: String,
      arg2: CommonConstraintOptions,
    ): IRole = unwrap(this).setLocalLaunchRoleName(arg0.let(IProduct::unwrap), arg1,
        arg2.let(CommonConstraintOptions::unwrap)).let(IRole::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b21d056b146d924a5bf7908dfbd822cdd3fc6e4f92eec800d58dd3f534e3936")
    override fun localLaunchRoleName(
      arg0: IProduct,
      arg1: String,
      arg2: CommonConstraintOptions.Builder.() -> Unit,
    ): IRole = localLaunchRoleName(arg0, arg1, CommonConstraintOptions(arg2))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun notifyOnStackEvents(arg0: IProduct, arg1: ITopic) {
      unwrap(this).notifyOnStackEvents(arg0.let(IProduct::unwrap), arg1.let(ITopic::unwrap))
    }

    override fun notifyOnStackEvents(
      arg0: IProduct,
      arg1: ITopic,
      arg2: CommonConstraintOptions,
    ) {
      unwrap(this).notifyOnStackEvents(arg0.let(IProduct::unwrap), arg1.let(ITopic::unwrap),
          arg2.let(CommonConstraintOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c956a9bd1f74ede14814e6f7193ab364f4ec8d2e27dcce869f7d90985ee9f22")
    override fun notifyOnStackEvents(
      arg0: IProduct,
      arg1: ITopic,
      arg2: CommonConstraintOptions.Builder.() -> Unit,
    ): Unit = notifyOnStackEvents(arg0, arg1, CommonConstraintOptions(arg2))

    override fun portfolioArn(): String = unwrap(this).getPortfolioArn()

    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    override fun shareWithAccount(arg0: String) {
      unwrap(this).shareWithAccount(arg0)
    }

    override fun shareWithAccount(arg0: String, arg1: PortfolioShareOptions) {
      unwrap(this).shareWithAccount(arg0, arg1.let(PortfolioShareOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f9ea6bd3614654a35a908789dc09bbfdc040e68f2d5a1bbc5fd1b26439d1ad4")
    override fun shareWithAccount(arg0: String, arg1: PortfolioShareOptions.Builder.() -> Unit):
        Unit = shareWithAccount(arg0, PortfolioShareOptions(arg1))

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.IPortfolio):
        IPortfolio = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPortfolio):
        software.amazon.awscdk.services.servicecatalog.IPortfolio = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.servicecatalog.IPortfolio
  }
}
