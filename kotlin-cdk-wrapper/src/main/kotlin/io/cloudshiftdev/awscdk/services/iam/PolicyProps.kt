@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface PolicyProps {
  public fun document(): PolicyDocument? = unwrap(this).getDocument()?.let(PolicyDocument::wrap)

  public fun force(): Boolean? = unwrap(this).getForce()

  public fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

  public fun policyName(): String? = unwrap(this).getPolicyName()

  public fun roles(): List<IRole> = unwrap(this).getRoles()?.map(IRole::wrap) ?: emptyList()

  public fun statements(): List<PolicyStatement> =
      unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  public fun users(): List<IUser> = unwrap(this).getUsers()?.map(IUser::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun document(document: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df8053a8bb4a61ef6bdfdfc961697e47e260c454293532b1fcfb8255ee8bbbb0")
    public fun document(document: PolicyDocument.Builder.() -> Unit)

    public fun force(force: Boolean)

    public fun groups(groups: List<IGroup>)

    public fun groups(vararg groups: IGroup)

    public fun policyName(policyName: String)

    public fun roles(roles: List<IRole>)

    public fun roles(vararg roles: IRole)

    public fun statements(statements: List<PolicyStatement>)

    public fun statements(vararg statements: PolicyStatement)

    public fun users(users: List<IUser>)

    public fun users(vararg users: IUser)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.PolicyProps.Builder =
        software.amazon.awscdk.services.iam.PolicyProps.builder()

    override fun document(document: PolicyDocument) {
      cdkBuilder.document(document.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df8053a8bb4a61ef6bdfdfc961697e47e260c454293532b1fcfb8255ee8bbbb0")
    override fun document(document: PolicyDocument.Builder.() -> Unit): Unit =
        document(PolicyDocument(document))

    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    override fun groups(vararg groups: IGroup): Unit = groups(groups.toList())

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun roles(roles: List<IRole>) {
      cdkBuilder.roles(roles.map(IRole::unwrap))
    }

    override fun roles(vararg roles: IRole): Unit = roles(roles.toList())

    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    override fun statements(vararg statements: PolicyStatement): Unit =
        statements(statements.toList())

    override fun users(users: List<IUser>) {
      cdkBuilder.users(users.map(IUser::unwrap))
    }

    override fun users(vararg users: IUser): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.PolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.PolicyProps,
  ) : CdkObject(cdkObject), PolicyProps {
    override fun document(): PolicyDocument? = unwrap(this).getDocument()?.let(PolicyDocument::wrap)

    override fun force(): Boolean? = unwrap(this).getForce()

    override fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

    override fun policyName(): String? = unwrap(this).getPolicyName()

    override fun roles(): List<IRole> = unwrap(this).getRoles()?.map(IRole::wrap) ?: emptyList()

    override fun statements(): List<PolicyStatement> =
        unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    override fun users(): List<IUser> = unwrap(this).getUsers()?.map(IUser::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.PolicyProps): PolicyProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PolicyProps): software.amazon.awscdk.services.iam.PolicyProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.PolicyProps
  }
}
