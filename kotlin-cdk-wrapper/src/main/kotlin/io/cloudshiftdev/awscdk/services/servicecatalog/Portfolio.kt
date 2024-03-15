@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.IUser
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Portfolio internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.servicecatalog.Portfolio,
) : Resource(cdkObject), IPortfolio {
  public override fun addProduct(product: IProduct) {
    unwrap(this).addProduct(product.let(IProduct::unwrap))
  }

  public override fun associateTagOptions(tagOptions: TagOptions) {
    unwrap(this).associateTagOptions(tagOptions.let(TagOptions::unwrap))
  }

  public override fun constrainCloudFormationParameters(product: IProduct,
      options: CloudFormationRuleConstraintOptions) {
    unwrap(this).constrainCloudFormationParameters(product.let(IProduct::unwrap),
        options.let(CloudFormationRuleConstraintOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("32bd369b539af8a90f2d7eeba368e4aa7a21c37de31a02b54c2303a5be146028")
  public override fun constrainCloudFormationParameters(product: IProduct,
      options: CloudFormationRuleConstraintOptions.Builder.() -> Unit): Unit =
      constrainCloudFormationParameters(product, CloudFormationRuleConstraintOptions(options))

  public override fun constrainTagUpdates(product: IProduct) {
    unwrap(this).constrainTagUpdates(product.let(IProduct::unwrap))
  }

  public override fun constrainTagUpdates(product: IProduct, options: TagUpdateConstraintOptions) {
    unwrap(this).constrainTagUpdates(product.let(IProduct::unwrap),
        options.let(TagUpdateConstraintOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("919b36b21cc39a414fd014dc28ebcbcb3f794d52cc5f005a69d0019a3a2698f1")
  public override fun constrainTagUpdates(product: IProduct,
      options: TagUpdateConstraintOptions.Builder.() -> Unit): Unit = constrainTagUpdates(product,
      TagUpdateConstraintOptions(options))

  public override fun deployWithStackSets(product: IProduct, options: StackSetsConstraintOptions) {
    unwrap(this).deployWithStackSets(product.let(IProduct::unwrap),
        options.let(StackSetsConstraintOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("476ed84dec221f7c2f3642fe8196cc1d576449c54c5b15ebcdb41211e260b952")
  public override fun deployWithStackSets(product: IProduct,
      options: StackSetsConstraintOptions.Builder.() -> Unit): Unit = deployWithStackSets(product,
      StackSetsConstraintOptions(options))

  public override fun giveAccessToGroup(group: IGroup) {
    unwrap(this).giveAccessToGroup(group.let(IGroup::unwrap))
  }

  public override fun giveAccessToRole(role: IRole) {
    unwrap(this).giveAccessToRole(role.let(IRole::unwrap))
  }

  public override fun giveAccessToUser(user: IUser) {
    unwrap(this).giveAccessToUser(user.let(IUser::unwrap))
  }

  public override fun launchRole(product: IProduct, launchRole: IRole) {
    unwrap(this).setLaunchRole(product.let(IProduct::unwrap), launchRole.let(IRole::unwrap))
  }

  public override fun launchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions,
  ) {
    unwrap(this).setLaunchRole(product.let(IProduct::unwrap), launchRole.let(IRole::unwrap),
        options.let(CommonConstraintOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98c41e7622968105b9c940bb8b9d23876232e99fe93e56e1ceccc3e68180e189")
  public override fun launchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): Unit = launchRole(product, launchRole, CommonConstraintOptions(options))

  public override fun localLaunchRole(product: IProduct, launchRole: IRole) {
    unwrap(this).setLocalLaunchRole(product.let(IProduct::unwrap), launchRole.let(IRole::unwrap))
  }

  public override fun localLaunchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions,
  ) {
    unwrap(this).setLocalLaunchRole(product.let(IProduct::unwrap), launchRole.let(IRole::unwrap),
        options.let(CommonConstraintOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a2436b7c82af62c4bbb20f6c53c9c4a3bb0b6044330b1ece2432fcc67a711d2")
  public override fun localLaunchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): Unit = localLaunchRole(product, launchRole, CommonConstraintOptions(options))

  public override fun localLaunchRoleName(product: IProduct, launchRoleName: String): IRole =
      unwrap(this).setLocalLaunchRoleName(product.let(IProduct::unwrap),
      launchRoleName).let(IRole::wrap)

  public override fun localLaunchRoleName(
    product: IProduct,
    launchRoleName: String,
    options: CommonConstraintOptions,
  ): IRole = unwrap(this).setLocalLaunchRoleName(product.let(IProduct::unwrap), launchRoleName,
      options.let(CommonConstraintOptions::unwrap)).let(IRole::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b21d056b146d924a5bf7908dfbd822cdd3fc6e4f92eec800d58dd3f534e3936")
  public override fun localLaunchRoleName(
    product: IProduct,
    launchRoleName: String,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): IRole = localLaunchRoleName(product, launchRoleName, CommonConstraintOptions(options))

  public override fun notifyOnStackEvents(product: IProduct, topic: ITopic) {
    unwrap(this).notifyOnStackEvents(product.let(IProduct::unwrap), topic.let(ITopic::unwrap))
  }

  public override fun notifyOnStackEvents(
    product: IProduct,
    topic: ITopic,
    options: CommonConstraintOptions,
  ) {
    unwrap(this).notifyOnStackEvents(product.let(IProduct::unwrap), topic.let(ITopic::unwrap),
        options.let(CommonConstraintOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c956a9bd1f74ede14814e6f7193ab364f4ec8d2e27dcce869f7d90985ee9f22")
  public override fun notifyOnStackEvents(
    product: IProduct,
    topic: ITopic,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): Unit = notifyOnStackEvents(product, topic, CommonConstraintOptions(options))

  public override fun portfolioArn(): String = unwrap(this).getPortfolioArn()

  public override fun portfolioId(): String = unwrap(this).getPortfolioId()

  public override fun shareWithAccount(accountId: String) {
    unwrap(this).shareWithAccount(accountId)
  }

  public override fun shareWithAccount(accountId: String, options: PortfolioShareOptions) {
    unwrap(this).shareWithAccount(accountId, options.let(PortfolioShareOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f9ea6bd3614654a35a908789dc09bbfdc040e68f2d5a1bbc5fd1b26439d1ad4")
  public override fun shareWithAccount(accountId: String,
      options: PortfolioShareOptions.Builder.() -> Unit): Unit = shareWithAccount(accountId,
      PortfolioShareOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun messageLanguage(messageLanguage: MessageLanguage)

    public fun providerName(providerName: String)

    public fun tagOptions(tagOptions: TagOptions)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.Portfolio.Builder =
        software.amazon.awscdk.services.servicecatalog.Portfolio.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    override fun tagOptions(tagOptions: TagOptions) {
      cdkBuilder.tagOptions(tagOptions.let(TagOptions::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.Portfolio =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromPortfolioArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      portfolioArn: String,
    ): IPortfolio =
        software.amazon.awscdk.services.servicecatalog.Portfolio.fromPortfolioArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, portfolioArn).let(IPortfolio::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Portfolio {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Portfolio(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.Portfolio):
        Portfolio = Portfolio(cdkObject)

    internal fun unwrap(wrapped: Portfolio):
        software.amazon.awscdk.services.servicecatalog.Portfolio = wrapped.cdkObject
  }
}
