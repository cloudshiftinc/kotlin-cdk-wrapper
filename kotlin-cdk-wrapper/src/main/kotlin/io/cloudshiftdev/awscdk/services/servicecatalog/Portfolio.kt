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

/**
 * A Service Catalog portfolio.
 *
 * Example:
 *
 * ```
 * Portfolio.Builder.create(this, "Portfolio")
 * .displayName("MyPortfolio")
 * .providerName("MyTeam")
 * .build();
 * ```
 */
public open class Portfolio(
  cdkObject: software.amazon.awscdk.services.servicecatalog.Portfolio,
) : Resource(cdkObject),
    IPortfolio {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PortfolioProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.Portfolio(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(PortfolioProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PortfolioProps.Builder.() -> Unit,
  ) : this(scope, id, PortfolioProps(props)
  )

  /**
   * Associate portfolio with the given product.
   *
   * @param product 
   */
  public override fun addProduct(product: IProduct) {
    unwrap(this).addProduct(product.let(IProduct.Companion::unwrap))
  }

  /**
   * Associate Tag Options.
   *
   * A TagOption is a key-value pair managed in AWS Service Catalog.
   * It is not an AWS tag, but serves as a template for creating an AWS tag based on the TagOption.
   *
   * @param tagOptions 
   */
  public override fun associateTagOptions(tagOptions: TagOptions) {
    unwrap(this).associateTagOptions(tagOptions.let(TagOptions.Companion::unwrap))
  }

  /**
   * Set provisioning rules for the product.
   *
   * @param product 
   * @param options 
   */
  public override fun constrainCloudFormationParameters(product: IProduct,
      options: CloudFormationRuleConstraintOptions) {
    unwrap(this).constrainCloudFormationParameters(product.let(IProduct.Companion::unwrap),
        options.let(CloudFormationRuleConstraintOptions.Companion::unwrap))
  }

  /**
   * Set provisioning rules for the product.
   *
   * @param product 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("32bd369b539af8a90f2d7eeba368e4aa7a21c37de31a02b54c2303a5be146028")
  public override fun constrainCloudFormationParameters(product: IProduct,
      options: CloudFormationRuleConstraintOptions.Builder.() -> Unit): Unit =
      constrainCloudFormationParameters(product, CloudFormationRuleConstraintOptions(options))

  /**
   * Add a Resource Update Constraint.
   *
   * @param product 
   * @param options
   */
  public override fun constrainTagUpdates(product: IProduct) {
    unwrap(this).constrainTagUpdates(product.let(IProduct.Companion::unwrap))
  }

  /**
   * Add a Resource Update Constraint.
   *
   * @param product 
   * @param options
   */
  public override fun constrainTagUpdates(product: IProduct, options: TagUpdateConstraintOptions) {
    unwrap(this).constrainTagUpdates(product.let(IProduct.Companion::unwrap),
        options.let(TagUpdateConstraintOptions.Companion::unwrap))
  }

  /**
   * Add a Resource Update Constraint.
   *
   * @param product 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("919b36b21cc39a414fd014dc28ebcbcb3f794d52cc5f005a69d0019a3a2698f1")
  public override fun constrainTagUpdates(product: IProduct,
      options: TagUpdateConstraintOptions.Builder.() -> Unit): Unit = constrainTagUpdates(product,
      TagUpdateConstraintOptions(options))

  /**
   * Configure deployment options using AWS Cloudformation StackSets.
   *
   * @param product 
   * @param options 
   */
  public override fun deployWithStackSets(product: IProduct, options: StackSetsConstraintOptions) {
    unwrap(this).deployWithStackSets(product.let(IProduct.Companion::unwrap),
        options.let(StackSetsConstraintOptions.Companion::unwrap))
  }

  /**
   * Configure deployment options using AWS Cloudformation StackSets.
   *
   * @param product 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("476ed84dec221f7c2f3642fe8196cc1d576449c54c5b15ebcdb41211e260b952")
  public override fun deployWithStackSets(product: IProduct,
      options: StackSetsConstraintOptions.Builder.() -> Unit): Unit = deployWithStackSets(product,
      StackSetsConstraintOptions(options))

  /**
   * Associate portfolio with an IAM Group.
   *
   * @param group 
   */
  public override fun giveAccessToGroup(group: IGroup) {
    unwrap(this).giveAccessToGroup(group.let(IGroup.Companion::unwrap))
  }

  /**
   * Associate portfolio with an IAM Role.
   *
   * @param role 
   */
  public override fun giveAccessToRole(role: IRole) {
    unwrap(this).giveAccessToRole(role.let(IRole.Companion::unwrap))
  }

  /**
   * Associate portfolio with an IAM User.
   *
   * @param user 
   */
  public override fun giveAccessToUser(user: IUser) {
    unwrap(this).giveAccessToUser(user.let(IUser.Companion::unwrap))
  }

  /**
   * Force users to assume a certain role when launching a product.
   *
   * This sets the launch role using the role arn which is tied to the account this role exists in.
   * This is useful if you will be provisioning products from the account where this role exists.
   * If you intend to share the portfolio across accounts, use a local launch role.
   *
   * @param product 
   * @param launchRole 
   * @param options
   */
  public override fun launchRole(product: IProduct, launchRole: IRole) {
    unwrap(this).setLaunchRole(product.let(IProduct.Companion::unwrap),
        launchRole.let(IRole.Companion::unwrap))
  }

  /**
   * Force users to assume a certain role when launching a product.
   *
   * This sets the launch role using the role arn which is tied to the account this role exists in.
   * This is useful if you will be provisioning products from the account where this role exists.
   * If you intend to share the portfolio across accounts, use a local launch role.
   *
   * @param product 
   * @param launchRole 
   * @param options
   */
  public override fun launchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions,
  ) {
    unwrap(this).setLaunchRole(product.let(IProduct.Companion::unwrap),
        launchRole.let(IRole.Companion::unwrap),
        options.let(CommonConstraintOptions.Companion::unwrap))
  }

  /**
   * Force users to assume a certain role when launching a product.
   *
   * This sets the launch role using the role arn which is tied to the account this role exists in.
   * This is useful if you will be provisioning products from the account where this role exists.
   * If you intend to share the portfolio across accounts, use a local launch role.
   *
   * @param product 
   * @param launchRole 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98c41e7622968105b9c940bb8b9d23876232e99fe93e56e1ceccc3e68180e189")
  public override fun launchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): Unit = launchRole(product, launchRole, CommonConstraintOptions(options))

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role name will be referenced by in the local account and must be set explicitly.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product 
   * @param launchRole 
   * @param options
   */
  public override fun localLaunchRole(product: IProduct, launchRole: IRole) {
    unwrap(this).setLocalLaunchRole(product.let(IProduct.Companion::unwrap),
        launchRole.let(IRole.Companion::unwrap))
  }

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role name will be referenced by in the local account and must be set explicitly.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product 
   * @param launchRole 
   * @param options
   */
  public override fun localLaunchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions,
  ) {
    unwrap(this).setLocalLaunchRole(product.let(IProduct.Companion::unwrap),
        launchRole.let(IRole.Companion::unwrap),
        options.let(CommonConstraintOptions.Companion::unwrap))
  }

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role name will be referenced by in the local account and must be set explicitly.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product 
   * @param launchRole 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a2436b7c82af62c4bbb20f6c53c9c4a3bb0b6044330b1ece2432fcc67a711d2")
  public override fun localLaunchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): Unit = localLaunchRole(product, launchRole, CommonConstraintOptions(options))

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role will be referenced by name in the local account instead of a static role arn.
   * A role with this name will automatically be created and assumable by Service Catalog in this
   * account.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product 
   * @param launchRoleName 
   * @param options
   */
  public override fun localLaunchRoleName(product: IProduct, launchRoleName: String): IRole =
      unwrap(this).setLocalLaunchRoleName(product.let(IProduct.Companion::unwrap),
      launchRoleName).let(IRole::wrap)

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role will be referenced by name in the local account instead of a static role arn.
   * A role with this name will automatically be created and assumable by Service Catalog in this
   * account.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product 
   * @param launchRoleName 
   * @param options
   */
  public override fun localLaunchRoleName(
    product: IProduct,
    launchRoleName: String,
    options: CommonConstraintOptions,
  ): IRole = unwrap(this).setLocalLaunchRoleName(product.let(IProduct.Companion::unwrap),
      launchRoleName, options.let(CommonConstraintOptions.Companion::unwrap)).let(IRole::wrap)

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role will be referenced by name in the local account instead of a static role arn.
   * A role with this name will automatically be created and assumable by Service Catalog in this
   * account.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product 
   * @param launchRoleName 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b21d056b146d924a5bf7908dfbd822cdd3fc6e4f92eec800d58dd3f534e3936")
  public override fun localLaunchRoleName(
    product: IProduct,
    launchRoleName: String,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): IRole = localLaunchRoleName(product, launchRoleName, CommonConstraintOptions(options))

  /**
   * Add notifications for supplied topics on the provisioned product.
   *
   * @param product 
   * @param topic 
   * @param options
   */
  public override fun notifyOnStackEvents(product: IProduct, topic: ITopic) {
    unwrap(this).notifyOnStackEvents(product.let(IProduct.Companion::unwrap),
        topic.let(ITopic.Companion::unwrap))
  }

  /**
   * Add notifications for supplied topics on the provisioned product.
   *
   * @param product 
   * @param topic 
   * @param options
   */
  public override fun notifyOnStackEvents(
    product: IProduct,
    topic: ITopic,
    options: CommonConstraintOptions,
  ) {
    unwrap(this).notifyOnStackEvents(product.let(IProduct.Companion::unwrap),
        topic.let(ITopic.Companion::unwrap), options.let(CommonConstraintOptions.Companion::unwrap))
  }

  /**
   * Add notifications for supplied topics on the provisioned product.
   *
   * @param product 
   * @param topic 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c956a9bd1f74ede14814e6f7193ab364f4ec8d2e27dcce869f7d90985ee9f22")
  public override fun notifyOnStackEvents(
    product: IProduct,
    topic: ITopic,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): Unit = notifyOnStackEvents(product, topic, CommonConstraintOptions(options))

  /**
   * The ARN of the portfolio.
   */
  public override fun portfolioArn(): String = unwrap(this).getPortfolioArn()

  /**
   * The ID of the portfolio.
   */
  public override fun portfolioId(): String = unwrap(this).getPortfolioId()

  /**
   * Initiate a portfolio share with another account.
   *
   * @param accountId 
   * @param options
   */
  public override fun shareWithAccount(accountId: String) {
    unwrap(this).shareWithAccount(accountId)
  }

  /**
   * Initiate a portfolio share with another account.
   *
   * @param accountId 
   * @param options
   */
  public override fun shareWithAccount(accountId: String, options: PortfolioShareOptions) {
    unwrap(this).shareWithAccount(accountId, options.let(PortfolioShareOptions.Companion::unwrap))
  }

  /**
   * Initiate a portfolio share with another account.
   *
   * @param accountId 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f9ea6bd3614654a35a908789dc09bbfdc040e68f2d5a1bbc5fd1b26439d1ad4")
  public override fun shareWithAccount(accountId: String,
      options: PortfolioShareOptions.Builder.() -> Unit): Unit = shareWithAccount(accountId,
      PortfolioShareOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.Portfolio].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Description for portfolio.
     *
     * Default: - No description provided
     *
     * @param description Description for portfolio. 
     */
    public fun description(description: String)

    /**
     * The name of the portfolio.
     *
     * @param displayName The name of the portfolio. 
     */
    public fun displayName(displayName: String)

    /**
     * The message language.
     *
     * Controls language for
     * status logging and errors.
     *
     * Default: - English
     *
     * @param messageLanguage The message language. 
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)

    /**
     * The provider name.
     *
     * @param providerName The provider name. 
     */
    public fun providerName(providerName: String)

    /**
     * TagOptions associated directly to a portfolio.
     *
     * Default: - No tagOptions provided
     *
     * @param tagOptions TagOptions associated directly to a portfolio. 
     */
    public fun tagOptions(tagOptions: TagOptions)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.Portfolio.Builder =
        software.amazon.awscdk.services.servicecatalog.Portfolio.Builder.create(scope, id)

    /**
     * Description for portfolio.
     *
     * Default: - No description provided
     *
     * @param description Description for portfolio. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the portfolio.
     *
     * @param displayName The name of the portfolio. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The message language.
     *
     * Controls language for
     * status logging and errors.
     *
     * Default: - English
     *
     * @param messageLanguage The message language. 
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage.Companion::unwrap))
    }

    /**
     * The provider name.
     *
     * @param providerName The provider name. 
     */
    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    /**
     * TagOptions associated directly to a portfolio.
     *
     * Default: - No tagOptions provided
     *
     * @param tagOptions TagOptions associated directly to a portfolio. 
     */
    override fun tagOptions(tagOptions: TagOptions) {
      cdkBuilder.tagOptions(tagOptions.let(TagOptions.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.Portfolio =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.servicecatalog.Portfolio.PROPERTY_INJECTION_ID

    public fun fromPortfolioArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      portfolioArn: String,
    ): IPortfolio =
        software.amazon.awscdk.services.servicecatalog.Portfolio.fromPortfolioArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
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
        software.amazon.awscdk.services.servicecatalog.Portfolio = wrapped.cdkObject as
        software.amazon.awscdk.services.servicecatalog.Portfolio
  }
}
