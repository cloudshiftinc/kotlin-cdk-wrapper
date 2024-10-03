@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for deploying with Stackset, which creates a StackSet constraint.
 *
 * Example:
 *
 * ```
 * Portfolio portfolio;
 * CloudFormationProduct product;
 * Role adminRole = Role.Builder.create(this, "AdminRole")
 * .assumedBy(new AccountRootPrincipal())
 * .build();
 * portfolio.deployWithStackSets(product, StackSetsConstraintOptions.builder()
 * .accounts(List.of("012345678901", "012345678902", "012345678903"))
 * .regions(List.of("us-west-1", "us-east-1", "us-west-2", "us-east-1"))
 * .adminRole(adminRole)
 * .executionRoleName("SCStackSetExecutionRole") // Name of role deployed in end users accounts.
 * .allowStackSetInstanceOperations(true)
 * .build());
 * ```
 */
public interface StackSetsConstraintOptions : CommonConstraintOptions {
  /**
   * List of accounts to deploy stacks to.
   */
  public fun accounts(): List<String>

  /**
   * IAM role used to administer the StackSets configuration.
   */
  public fun adminRole(): IRole

  /**
   * Wether to allow end users to create, update, and delete stacks.
   *
   * Default: false
   */
  public fun allowStackSetInstanceOperations(): Boolean? =
      unwrap(this).getAllowStackSetInstanceOperations()

  /**
   * IAM role used to provision the products in the Stacks.
   */
  public fun executionRoleName(): String

  /**
   * List of regions to deploy stacks to.
   */
  public fun regions(): List<String>

  /**
   * A builder for [StackSetsConstraintOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accounts List of accounts to deploy stacks to. 
     */
    public fun accounts(accounts: List<String>)

    /**
     * @param accounts List of accounts to deploy stacks to. 
     */
    public fun accounts(vararg accounts: String)

    /**
     * @param adminRole IAM role used to administer the StackSets configuration. 
     */
    public fun adminRole(adminRole: IRole)

    /**
     * @param allowStackSetInstanceOperations Wether to allow end users to create, update, and
     * delete stacks.
     */
    public fun allowStackSetInstanceOperations(allowStackSetInstanceOperations: Boolean)

    /**
     * @param description The description of the constraint.
     */
    public fun description(description: String)

    /**
     * @param executionRoleName IAM role used to provision the products in the Stacks. 
     */
    public fun executionRoleName(executionRoleName: String)

    /**
     * @param messageLanguage The language code.
     * Configures the language for error messages from service catalog.
     */
    public fun messageLanguage(messageLanguage: MessageLanguage)

    /**
     * @param regions List of regions to deploy stacks to. 
     */
    public fun regions(regions: List<String>)

    /**
     * @param regions List of regions to deploy stacks to. 
     */
    public fun regions(vararg regions: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions.builder()

    /**
     * @param accounts List of accounts to deploy stacks to. 
     */
    override fun accounts(accounts: List<String>) {
      cdkBuilder.accounts(accounts)
    }

    /**
     * @param accounts List of accounts to deploy stacks to. 
     */
    override fun accounts(vararg accounts: String): Unit = accounts(accounts.toList())

    /**
     * @param adminRole IAM role used to administer the StackSets configuration. 
     */
    override fun adminRole(adminRole: IRole) {
      cdkBuilder.adminRole(adminRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param allowStackSetInstanceOperations Wether to allow end users to create, update, and
     * delete stacks.
     */
    override fun allowStackSetInstanceOperations(allowStackSetInstanceOperations: Boolean) {
      cdkBuilder.allowStackSetInstanceOperations(allowStackSetInstanceOperations)
    }

    /**
     * @param description The description of the constraint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param executionRoleName IAM role used to provision the products in the Stacks. 
     */
    override fun executionRoleName(executionRoleName: String) {
      cdkBuilder.executionRoleName(executionRoleName)
    }

    /**
     * @param messageLanguage The language code.
     * Configures the language for error messages from service catalog.
     */
    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage.Companion::unwrap))
    }

    /**
     * @param regions List of regions to deploy stacks to. 
     */
    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    /**
     * @param regions List of regions to deploy stacks to. 
     */
    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    public fun build(): software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions,
  ) : CdkObject(cdkObject),
      StackSetsConstraintOptions {
    /**
     * List of accounts to deploy stacks to.
     */
    override fun accounts(): List<String> = unwrap(this).getAccounts()

    /**
     * IAM role used to administer the StackSets configuration.
     */
    override fun adminRole(): IRole = unwrap(this).getAdminRole().let(IRole::wrap)

    /**
     * Wether to allow end users to create, update, and delete stacks.
     *
     * Default: false
     */
    override fun allowStackSetInstanceOperations(): Boolean? =
        unwrap(this).getAllowStackSetInstanceOperations()

    /**
     * The description of the constraint.
     *
     * Default: - No description provided
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * IAM role used to provision the products in the Stacks.
     */
    override fun executionRoleName(): String = unwrap(this).getExecutionRoleName()

    /**
     * The language code.
     *
     * Configures the language for error messages from service catalog.
     *
     * Default: - English
     */
    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    /**
     * List of regions to deploy stacks to.
     */
    override fun regions(): List<String> = unwrap(this).getRegions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackSetsConstraintOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions):
        StackSetsConstraintOptions = CdkObjectWrappers.wrap(cdkObject) as?
        StackSetsConstraintOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSetsConstraintOptions):
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions
  }
}
