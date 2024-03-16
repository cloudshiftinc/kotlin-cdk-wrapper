@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.IUser
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A Service Catalog portfolio.
 */
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f9ea6bd3614654a35a908789dc09bbfdc040e68f2d5a1bbc5fd1b26439d1ad4")
  public fun shareWithAccount(accountId: String, options: PortfolioShareOptions.Builder.() -> Unit)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.IPortfolio):
        IPortfolio = CdkObjectWrappers.wrap(cdkObject) as IPortfolio

    internal fun unwrap(wrapped: IPortfolio):
        software.amazon.awscdk.services.servicecatalog.IPortfolio = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.servicecatalog.IPortfolio
  }
}
