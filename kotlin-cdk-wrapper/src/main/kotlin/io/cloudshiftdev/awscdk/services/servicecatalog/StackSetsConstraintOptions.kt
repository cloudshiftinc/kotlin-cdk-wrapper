@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface StackSetsConstraintOptions : CommonConstraintOptions {
  public fun accounts(): List<String>

  public fun adminRole(): IRole

  public fun allowStackSetInstanceOperations(): Boolean? =
      unwrap(this).getAllowStackSetInstanceOperations()

  public fun executionRoleName(): String

  public fun regions(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun accounts(accounts: List<String>)

    public fun accounts(vararg accounts: String)

    public fun adminRole(adminRole: IRole)

    public fun allowStackSetInstanceOperations(allowStackSetInstanceOperations: Boolean)

    public fun description(description: String)

    public fun executionRoleName(executionRoleName: String)

    public fun messageLanguage(messageLanguage: MessageLanguage)

    public fun regions(regions: List<String>)

    public fun regions(vararg regions: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions.builder()

    override fun accounts(accounts: List<String>) {
      cdkBuilder.accounts(accounts)
    }

    override fun accounts(vararg accounts: String): Unit = accounts(accounts.toList())

    override fun adminRole(adminRole: IRole) {
      cdkBuilder.adminRole(adminRole.let(IRole::unwrap))
    }

    override fun allowStackSetInstanceOperations(allowStackSetInstanceOperations: Boolean) {
      cdkBuilder.allowStackSetInstanceOperations(allowStackSetInstanceOperations)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun executionRoleName(executionRoleName: String) {
      cdkBuilder.executionRoleName(executionRoleName)
    }

    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    public fun build(): software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions,
  ) : CdkObject(cdkObject), StackSetsConstraintOptions {
    override fun accounts(): List<String> = unwrap(this).getAccounts()

    override fun adminRole(): IRole = unwrap(this).getAdminRole().let(IRole::wrap)

    override fun allowStackSetInstanceOperations(): Boolean? =
        unwrap(this).getAllowStackSetInstanceOperations()

    override fun description(): String? = unwrap(this).getDescription()

    override fun executionRoleName(): String = unwrap(this).getExecutionRoleName()

    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)

    override fun regions(): List<String> = unwrap(this).getRegions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackSetsConstraintOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions):
        StackSetsConstraintOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackSetsConstraintOptions):
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions
  }
}
