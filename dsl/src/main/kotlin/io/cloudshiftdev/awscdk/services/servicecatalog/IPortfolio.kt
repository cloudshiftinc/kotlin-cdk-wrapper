package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.IGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.IUser
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IPortfolio : IResource {
  /**
   * Associate portfolio with the given product.
   *
   * @param product A service catalog produt. 
   */
  public fun addProduct(product: IProduct)

  /**
   * Associate Tag Options.
   *
   * A TagOption is a key-value pair managed in AWS Service Catalog.
   * It is not an AWS tag, but serves as a template for creating an AWS tag based on the TagOption.
   *
   * @param tagOptions 
   */
  public fun associateTagOptions(tagOptions: TagOptions)

  /**
   * Set provisioning rules for the product.
   *
   * @param product A service catalog product. 
   * @param options options for the constraint. 
   */
  public fun constrainCloudFormationParameters(product: IProduct,
      options: CloudFormationRuleConstraintOptions)

  /**
   * Set provisioning rules for the product.
   *
   * @param product A service catalog product. 
   * @param options options for the constraint. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("32bd369b539af8a90f2d7eeba368e4aa7a21c37de31a02b54c2303a5be146028")
  public fun constrainCloudFormationParameters(product: IProduct,
      options: CloudFormationRuleConstraintOptions.Builder.() -> Unit)

  /**
   * Add a Resource Update Constraint.
   *
   * @param product 
   * @param options
   */
  public fun constrainTagUpdates(product: IProduct)

  /**
   * Add a Resource Update Constraint.
   *
   * @param product 
   * @param options
   */
  public fun constrainTagUpdates(product: IProduct, options: TagUpdateConstraintOptions)

  /**
   * Add a Resource Update Constraint.
   *
   * @param product 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("919b36b21cc39a414fd014dc28ebcbcb3f794d52cc5f005a69d0019a3a2698f1")
  public fun constrainTagUpdates(product: IProduct,
      options: TagUpdateConstraintOptions.Builder.() -> Unit)

  /**
   * Configure deployment options using AWS Cloudformation StackSets.
   *
   * @param product A service catalog product. 
   * @param options Configuration options for the constraint. 
   */
  public fun deployWithStackSets(product: IProduct, options: StackSetsConstraintOptions)

  /**
   * Configure deployment options using AWS Cloudformation StackSets.
   *
   * @param product A service catalog product. 
   * @param options Configuration options for the constraint. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("476ed84dec221f7c2f3642fe8196cc1d576449c54c5b15ebcdb41211e260b952")
  public fun deployWithStackSets(product: IProduct,
      options: StackSetsConstraintOptions.Builder.() -> Unit)

  /**
   * Associate portfolio with an IAM Group.
   *
   * @param group an IAM Group. 
   */
  public fun giveAccessToGroup(group: IGroup)

  /**
   * Associate portfolio with an IAM Role.
   *
   * @param role an IAM role. 
   */
  public fun giveAccessToRole(role: IRole)

  /**
   * Associate portfolio with an IAM User.
   *
   * @param user an IAM user. 
   */
  public fun giveAccessToUser(user: IUser)

  /**
   * Force users to assume a certain role when launching a product.
   *
   * This sets the launch role using the role arn which is tied to the account this role exists in.
   * This is useful if you will be provisioning products from the account where this role exists.
   * If you intend to share the portfolio across accounts, use a local launch role.
   *
   * @param product A service catalog product. 
   * @param launchRole The IAM role a user must assume when provisioning the product. 
   * @param options options for the constraint.
   */
  public fun launchRole(product: IProduct, launchRole: IRole)

  /**
   * Force users to assume a certain role when launching a product.
   *
   * This sets the launch role using the role arn which is tied to the account this role exists in.
   * This is useful if you will be provisioning products from the account where this role exists.
   * If you intend to share the portfolio across accounts, use a local launch role.
   *
   * @param product A service catalog product. 
   * @param launchRole The IAM role a user must assume when provisioning the product. 
   * @param options options for the constraint.
   */
  public fun launchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions,
  )

  /**
   * Force users to assume a certain role when launching a product.
   *
   * This sets the launch role using the role arn which is tied to the account this role exists in.
   * This is useful if you will be provisioning products from the account where this role exists.
   * If you intend to share the portfolio across accounts, use a local launch role.
   *
   * @param product A service catalog product. 
   * @param launchRole The IAM role a user must assume when provisioning the product. 
   * @param options options for the constraint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98c41e7622968105b9c940bb8b9d23876232e99fe93e56e1ceccc3e68180e189")
  public fun launchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions.Builder.() -> Unit,
  )

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role name will be referenced by in the local account and must be set explicitly.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product A service catalog product. 
   * @param launchRole The IAM role a user must assume when provisioning the product. 
   * @param options options for the constraint.
   */
  public fun localLaunchRole(product: IProduct, launchRole: IRole)

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role name will be referenced by in the local account and must be set explicitly.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product A service catalog product. 
   * @param launchRole The IAM role a user must assume when provisioning the product. 
   * @param options options for the constraint.
   */
  public fun localLaunchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions,
  )

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role name will be referenced by in the local account and must be set explicitly.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product A service catalog product. 
   * @param launchRole The IAM role a user must assume when provisioning the product. 
   * @param options options for the constraint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a2436b7c82af62c4bbb20f6c53c9c4a3bb0b6044330b1ece2432fcc67a711d2")
  public fun localLaunchRole(
    product: IProduct,
    launchRole: IRole,
    options: CommonConstraintOptions.Builder.() -> Unit,
  )

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role will be referenced by name in the local account instead of a static role arn.
   * A role with this name will automatically be created and assumable by Service Catalog in this
   * account.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product A service catalog product. 
   * @param launchRoleName The name of the IAM role a user must assume when provisioning the
   * product. 
   * @param options options for the constraint.
   */
  public fun localLaunchRoleName(product: IProduct, launchRoleName: String): IRole

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role will be referenced by name in the local account instead of a static role arn.
   * A role with this name will automatically be created and assumable by Service Catalog in this
   * account.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product A service catalog product. 
   * @param launchRoleName The name of the IAM role a user must assume when provisioning the
   * product. 
   * @param options options for the constraint.
   */
  public fun localLaunchRoleName(
    product: IProduct,
    launchRoleName: String,
    options: CommonConstraintOptions,
  ): IRole

  /**
   * Force users to assume a certain role when launching a product.
   *
   * The role will be referenced by name in the local account instead of a static role arn.
   * A role with this name will automatically be created and assumable by Service Catalog in this
   * account.
   * This is useful when sharing the portfolio with multiple accounts.
   *
   * @param product A service catalog product. 
   * @param launchRoleName The name of the IAM role a user must assume when provisioning the
   * product. 
   * @param options options for the constraint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b21d056b146d924a5bf7908dfbd822cdd3fc6e4f92eec800d58dd3f534e3936")
  public fun localLaunchRoleName(
    product: IProduct,
    launchRoleName: String,
    options: CommonConstraintOptions.Builder.() -> Unit,
  ): IRole

  /**
   * Add notifications for supplied topics on the provisioned product.
   *
   * @param product A service catalog product. 
   * @param topic A SNS Topic to receive notifications on events related to the provisioned product.
   * 
   * @param options
   */
  public fun notifyOnStackEvents(product: IProduct, topic: ITopic)

  /**
   * Add notifications for supplied topics on the provisioned product.
   *
   * @param product A service catalog product. 
   * @param topic A SNS Topic to receive notifications on events related to the provisioned product.
   * 
   * @param options
   */
  public fun notifyOnStackEvents(
    product: IProduct,
    topic: ITopic,
    options: CommonConstraintOptions,
  )

  /**
   * Add notifications for supplied topics on the provisioned product.
   *
   * @param product A service catalog product. 
   * @param topic A SNS Topic to receive notifications on events related to the provisioned product.
   * 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c956a9bd1f74ede14814e6f7193ab364f4ec8d2e27dcce869f7d90985ee9f22")
  public fun notifyOnStackEvents(
    product: IProduct,
    topic: ITopic,
    options: CommonConstraintOptions.Builder.() -> Unit,
  )

  /**
   * The ARN of the portfolio.
   */
  public fun portfolioArn(): String

  /**
   * The ID of the portfolio.
   */
  public fun portfolioId(): String

  /**
   * Initiate a portfolio share with another account.
   *
   * @param accountId AWS account to share portfolio with. 
   * @param options Options for the initiate share.
   */
  public fun shareWithAccount(accountId: String)

  /**
   * Initiate a portfolio share with another account.
   *
   * @param accountId AWS account to share portfolio with. 
   * @param options Options for the initiate share.
   */
  public fun shareWithAccount(accountId: String, options: PortfolioShareOptions)

  /**
   * Initiate a portfolio share with another account.
   *
   * @param accountId AWS account to share portfolio with. 
   * @param options Options for the initiate share.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f9ea6bd3614654a35a908789dc09bbfdc040e68f2d5a1bbc5fd1b26439d1ad4")
  public fun shareWithAccount(accountId: String, options: PortfolioShareOptions.Builder.() -> Unit)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicecatalog.IPortfolio,
  ) : IPortfolio {
    /**
     * Associate portfolio with the given product.
     *
     * @param product A service catalog produt. 
     */
    override fun addProduct(product: IProduct) {
      unwrap(this).addProduct(product.let(IProduct::unwrap))
    }

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * Associate Tag Options.
     *
     * A TagOption is a key-value pair managed in AWS Service Catalog.
     * It is not an AWS tag, but serves as a template for creating an AWS tag based on the
     * TagOption.
     *
     * @param tagOptions 
     */
    override fun associateTagOptions(tagOptions: TagOptions) {
      unwrap(this).associateTagOptions(tagOptions.let(TagOptions::unwrap))
    }

    /**
     * Set provisioning rules for the product.
     *
     * @param product A service catalog product. 
     * @param options options for the constraint. 
     */
    override fun constrainCloudFormationParameters(product: IProduct,
        options: CloudFormationRuleConstraintOptions) {
      unwrap(this).constrainCloudFormationParameters(product.let(IProduct::unwrap),
          options.let(CloudFormationRuleConstraintOptions::unwrap))
    }

    /**
     * Set provisioning rules for the product.
     *
     * @param product A service catalog product. 
     * @param options options for the constraint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32bd369b539af8a90f2d7eeba368e4aa7a21c37de31a02b54c2303a5be146028")
    override fun constrainCloudFormationParameters(product: IProduct,
        options: CloudFormationRuleConstraintOptions.Builder.() -> Unit): Unit =
        constrainCloudFormationParameters(product, CloudFormationRuleConstraintOptions(options))

    /**
     * Add a Resource Update Constraint.
     *
     * @param product 
     * @param options
     */
    override fun constrainTagUpdates(product: IProduct) {
      unwrap(this).constrainTagUpdates(product.let(IProduct::unwrap))
    }

    /**
     * Add a Resource Update Constraint.
     *
     * @param product 
     * @param options
     */
    override fun constrainTagUpdates(product: IProduct, options: TagUpdateConstraintOptions) {
      unwrap(this).constrainTagUpdates(product.let(IProduct::unwrap),
          options.let(TagUpdateConstraintOptions::unwrap))
    }

    /**
     * Add a Resource Update Constraint.
     *
     * @param product 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("919b36b21cc39a414fd014dc28ebcbcb3f794d52cc5f005a69d0019a3a2698f1")
    override fun constrainTagUpdates(product: IProduct,
        options: TagUpdateConstraintOptions.Builder.() -> Unit): Unit = constrainTagUpdates(product,
        TagUpdateConstraintOptions(options))

    /**
     * Configure deployment options using AWS Cloudformation StackSets.
     *
     * @param product A service catalog product. 
     * @param options Configuration options for the constraint. 
     */
    override fun deployWithStackSets(product: IProduct, options: StackSetsConstraintOptions) {
      unwrap(this).deployWithStackSets(product.let(IProduct::unwrap),
          options.let(StackSetsConstraintOptions::unwrap))
    }

    /**
     * Configure deployment options using AWS Cloudformation StackSets.
     *
     * @param product A service catalog product. 
     * @param options Configuration options for the constraint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("476ed84dec221f7c2f3642fe8196cc1d576449c54c5b15ebcdb41211e260b952")
    override fun deployWithStackSets(product: IProduct,
        options: StackSetsConstraintOptions.Builder.() -> Unit): Unit = deployWithStackSets(product,
        StackSetsConstraintOptions(options))

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Associate portfolio with an IAM Group.
     *
     * @param group an IAM Group. 
     */
    override fun giveAccessToGroup(group: IGroup) {
      unwrap(this).giveAccessToGroup(group.let(IGroup::unwrap))
    }

    /**
     * Associate portfolio with an IAM Role.
     *
     * @param role an IAM role. 
     */
    override fun giveAccessToRole(role: IRole) {
      unwrap(this).giveAccessToRole(role.let(IRole::unwrap))
    }

    /**
     * Associate portfolio with an IAM User.
     *
     * @param user an IAM user. 
     */
    override fun giveAccessToUser(user: IUser) {
      unwrap(this).giveAccessToUser(user.let(IUser::unwrap))
    }

    /**
     * Force users to assume a certain role when launching a product.
     *
     * This sets the launch role using the role arn which is tied to the account this role exists
     * in.
     * This is useful if you will be provisioning products from the account where this role exists.
     * If you intend to share the portfolio across accounts, use a local launch role.
     *
     * @param product A service catalog product. 
     * @param launchRole The IAM role a user must assume when provisioning the product. 
     * @param options options for the constraint.
     */
    override fun launchRole(product: IProduct, launchRole: IRole) {
      unwrap(this).setLaunchRole(product.let(IProduct::unwrap), launchRole.let(IRole::unwrap))
    }

    /**
     * Force users to assume a certain role when launching a product.
     *
     * This sets the launch role using the role arn which is tied to the account this role exists
     * in.
     * This is useful if you will be provisioning products from the account where this role exists.
     * If you intend to share the portfolio across accounts, use a local launch role.
     *
     * @param product A service catalog product. 
     * @param launchRole The IAM role a user must assume when provisioning the product. 
     * @param options options for the constraint.
     */
    override fun launchRole(
      product: IProduct,
      launchRole: IRole,
      options: CommonConstraintOptions,
    ) {
      unwrap(this).setLaunchRole(product.let(IProduct::unwrap), launchRole.let(IRole::unwrap),
          options.let(CommonConstraintOptions::unwrap))
    }

    /**
     * Force users to assume a certain role when launching a product.
     *
     * This sets the launch role using the role arn which is tied to the account this role exists
     * in.
     * This is useful if you will be provisioning products from the account where this role exists.
     * If you intend to share the portfolio across accounts, use a local launch role.
     *
     * @param product A service catalog product. 
     * @param launchRole The IAM role a user must assume when provisioning the product. 
     * @param options options for the constraint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98c41e7622968105b9c940bb8b9d23876232e99fe93e56e1ceccc3e68180e189")
    override fun launchRole(
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
     * @param product A service catalog product. 
     * @param launchRole The IAM role a user must assume when provisioning the product. 
     * @param options options for the constraint.
     */
    override fun localLaunchRole(product: IProduct, launchRole: IRole) {
      unwrap(this).setLocalLaunchRole(product.let(IProduct::unwrap), launchRole.let(IRole::unwrap))
    }

    /**
     * Force users to assume a certain role when launching a product.
     *
     * The role name will be referenced by in the local account and must be set explicitly.
     * This is useful when sharing the portfolio with multiple accounts.
     *
     * @param product A service catalog product. 
     * @param launchRole The IAM role a user must assume when provisioning the product. 
     * @param options options for the constraint.
     */
    override fun localLaunchRole(
      product: IProduct,
      launchRole: IRole,
      options: CommonConstraintOptions,
    ) {
      unwrap(this).setLocalLaunchRole(product.let(IProduct::unwrap), launchRole.let(IRole::unwrap),
          options.let(CommonConstraintOptions::unwrap))
    }

    /**
     * Force users to assume a certain role when launching a product.
     *
     * The role name will be referenced by in the local account and must be set explicitly.
     * This is useful when sharing the portfolio with multiple accounts.
     *
     * @param product A service catalog product. 
     * @param launchRole The IAM role a user must assume when provisioning the product. 
     * @param options options for the constraint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a2436b7c82af62c4bbb20f6c53c9c4a3bb0b6044330b1ece2432fcc67a711d2")
    override fun localLaunchRole(
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
     * @param product A service catalog product. 
     * @param launchRoleName The name of the IAM role a user must assume when provisioning the
     * product. 
     * @param options options for the constraint.
     */
    override fun localLaunchRoleName(product: IProduct, launchRoleName: String): IRole =
        unwrap(this).setLocalLaunchRoleName(product.let(IProduct::unwrap),
        launchRoleName).let(IRole::wrap)

    /**
     * Force users to assume a certain role when launching a product.
     *
     * The role will be referenced by name in the local account instead of a static role arn.
     * A role with this name will automatically be created and assumable by Service Catalog in this
     * account.
     * This is useful when sharing the portfolio with multiple accounts.
     *
     * @param product A service catalog product. 
     * @param launchRoleName The name of the IAM role a user must assume when provisioning the
     * product. 
     * @param options options for the constraint.
     */
    override fun localLaunchRoleName(
      product: IProduct,
      launchRoleName: String,
      options: CommonConstraintOptions,
    ): IRole = unwrap(this).setLocalLaunchRoleName(product.let(IProduct::unwrap), launchRoleName,
        options.let(CommonConstraintOptions::unwrap)).let(IRole::wrap)

    /**
     * Force users to assume a certain role when launching a product.
     *
     * The role will be referenced by name in the local account instead of a static role arn.
     * A role with this name will automatically be created and assumable by Service Catalog in this
     * account.
     * This is useful when sharing the portfolio with multiple accounts.
     *
     * @param product A service catalog product. 
     * @param launchRoleName The name of the IAM role a user must assume when provisioning the
     * product. 
     * @param options options for the constraint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b21d056b146d924a5bf7908dfbd822cdd3fc6e4f92eec800d58dd3f534e3936")
    override fun localLaunchRoleName(
      product: IProduct,
      launchRoleName: String,
      options: CommonConstraintOptions.Builder.() -> Unit,
    ): IRole = localLaunchRoleName(product, launchRoleName, CommonConstraintOptions(options))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Add notifications for supplied topics on the provisioned product.
     *
     * @param product A service catalog product. 
     * @param topic A SNS Topic to receive notifications on events related to the provisioned
     * product. 
     * @param options
     */
    override fun notifyOnStackEvents(product: IProduct, topic: ITopic) {
      unwrap(this).notifyOnStackEvents(product.let(IProduct::unwrap), topic.let(ITopic::unwrap))
    }

    /**
     * Add notifications for supplied topics on the provisioned product.
     *
     * @param product A service catalog product. 
     * @param topic A SNS Topic to receive notifications on events related to the provisioned
     * product. 
     * @param options
     */
    override fun notifyOnStackEvents(
      product: IProduct,
      topic: ITopic,
      options: CommonConstraintOptions,
    ) {
      unwrap(this).notifyOnStackEvents(product.let(IProduct::unwrap), topic.let(ITopic::unwrap),
          options.let(CommonConstraintOptions::unwrap))
    }

    /**
     * Add notifications for supplied topics on the provisioned product.
     *
     * @param product A service catalog product. 
     * @param topic A SNS Topic to receive notifications on events related to the provisioned
     * product. 
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c956a9bd1f74ede14814e6f7193ab364f4ec8d2e27dcce869f7d90985ee9f22")
    override fun notifyOnStackEvents(
      product: IProduct,
      topic: ITopic,
      options: CommonConstraintOptions.Builder.() -> Unit,
    ): Unit = notifyOnStackEvents(product, topic, CommonConstraintOptions(options))

    /**
     * The ARN of the portfolio.
     */
    override fun portfolioArn(): String = unwrap(this).getPortfolioArn()

    /**
     * The ID of the portfolio.
     */
    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    /**
     * Initiate a portfolio share with another account.
     *
     * @param accountId AWS account to share portfolio with. 
     * @param options Options for the initiate share.
     */
    override fun shareWithAccount(accountId: String) {
      unwrap(this).shareWithAccount(accountId)
    }

    /**
     * Initiate a portfolio share with another account.
     *
     * @param accountId AWS account to share portfolio with. 
     * @param options Options for the initiate share.
     */
    override fun shareWithAccount(accountId: String, options: PortfolioShareOptions) {
      unwrap(this).shareWithAccount(accountId, options.let(PortfolioShareOptions::unwrap))
    }

    /**
     * Initiate a portfolio share with another account.
     *
     * @param accountId AWS account to share portfolio with. 
     * @param options Options for the initiate share.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f9ea6bd3614654a35a908789dc09bbfdc040e68f2d5a1bbc5fd1b26439d1ad4")
    override fun shareWithAccount(accountId: String,
        options: PortfolioShareOptions.Builder.() -> Unit): Unit = shareWithAccount(accountId,
        PortfolioShareOptions(options))

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.IPortfolio):
        IPortfolio = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPortfolio):
        software.amazon.awscdk.services.servicecatalog.IPortfolio = (wrapped as Wrapper).cdkObject
  }
}
