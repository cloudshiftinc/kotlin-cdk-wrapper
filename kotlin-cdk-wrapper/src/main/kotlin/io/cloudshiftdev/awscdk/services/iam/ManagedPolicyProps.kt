@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ManagedPolicyProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun document(): PolicyDocument? = unwrap(this).getDocument()?.let(PolicyDocument::wrap)

  public fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

  public fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

  public fun path(): String? = unwrap(this).getPath()

  public fun roles(): List<IRole> = unwrap(this).getRoles()?.map(IRole::wrap) ?: emptyList()

  public fun statements(): List<PolicyStatement> =
      unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  public fun users(): List<IUser> = unwrap(this).getUsers()?.map(IUser::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun document(document: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a4f5f96c59c0b0de3516c6f29487e97194ced16113cf4e5d91098fc6e6f57d9")
    public fun document(document: PolicyDocument.Builder.() -> Unit)

    public fun groups(groups: List<IGroup>)

    public fun groups(vararg groups: IGroup)

    public fun managedPolicyName(managedPolicyName: String)

    public fun path(path: String)

    public fun roles(roles: List<IRole>)

    public fun roles(vararg roles: IRole)

    public fun statements(statements: List<PolicyStatement>)

    public fun statements(vararg statements: PolicyStatement)

    public fun users(users: List<IUser>)

    public fun users(vararg users: IUser)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.ManagedPolicyProps.Builder =
        software.amazon.awscdk.services.iam.ManagedPolicyProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun document(document: PolicyDocument) {
      cdkBuilder.document(document.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a4f5f96c59c0b0de3516c6f29487e97194ced16113cf4e5d91098fc6e6f57d9")
    override fun document(document: PolicyDocument.Builder.() -> Unit): Unit =
        document(PolicyDocument(document))

    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    override fun groups(vararg groups: IGroup): Unit = groups(groups.toList())

    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
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

    public fun build(): software.amazon.awscdk.services.iam.ManagedPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.ManagedPolicyProps,
  ) : CdkObject(cdkObject), ManagedPolicyProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun document(): PolicyDocument? = unwrap(this).getDocument()?.let(PolicyDocument::wrap)

    override fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

    override fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

    override fun path(): String? = unwrap(this).getPath()

    override fun roles(): List<IRole> = unwrap(this).getRoles()?.map(IRole::wrap) ?: emptyList()

    override fun statements(): List<PolicyStatement> =
        unwrap(this).getStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    override fun users(): List<IUser> = unwrap(this).getUsers()?.map(IUser::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManagedPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ManagedPolicyProps):
        ManagedPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManagedPolicyProps):
        software.amazon.awscdk.services.iam.ManagedPolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.ManagedPolicyProps
  }
}
