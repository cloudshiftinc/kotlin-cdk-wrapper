package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ManagedPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.ManagedPolicy,
) : Resource(cdkObject), IManagedPolicy, IGrantable {
  public open fun addStatements(statement: PolicyStatement) {
    unwrap(this).addStatements(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("98fe20c8550beea0e99a87c49e8839386e2715f38099686c4beb06cab4f71d9d")
  public open fun addStatements(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addStatements(PolicyStatement(statement))

  public open fun attachToGroup(group: IGroup) {
    unwrap(this).attachToGroup(group.let(IGroup::unwrap))
  }

  public open fun attachToRole(role: IRole) {
    unwrap(this).attachToRole(role.let(IRole::unwrap))
  }

  public open fun attachToUser(user: IUser) {
    unwrap(this).attachToUser(user.let(IUser::unwrap))
  }

  public open fun description(): String = unwrap(this).getDescription()

  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun managedPolicyArn(): String = unwrap(this).getManagedPolicyArn()

  public open fun managedPolicyName(): String = unwrap(this).getManagedPolicyName()

  public open fun path(): String = unwrap(this).getPath()

  public interface Builder {
    public fun description(description: String) {
    }

    public fun document(document: PolicyDocument) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0415bb056af93e8ba2db8804e6c461983ea2f49e71a35facaee559f4a9c03e")
    public fun document(document: PolicyDocument.Builder.() -> Unit) {
    }

    public fun groups(groups: List<IGroup>) {
    }

    public fun managedPolicyName(managedPolicyName: String) {
    }

    public fun path(path: String) {
    }

    public fun roles(roles: List<IRole>) {
    }

    public fun statements(statements: List<PolicyStatement>) {
    }

    public fun users(users: List<IUser>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.ManagedPolicy.Builder =
        software.amazon.awscdk.services.iam.ManagedPolicy.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun document(document: PolicyDocument) {
      cdkBuilder.document(document.let(PolicyDocument::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf0415bb056af93e8ba2db8804e6c461983ea2f49e71a35facaee559f4a9c03e")
    public override fun document(document: PolicyDocument.Builder.() -> Unit): Unit =
        document(PolicyDocument(document))

    public override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    public override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    public override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public override fun roles(roles: List<IRole>) {
      cdkBuilder.roles(roles.map(IRole::unwrap))
    }

    public override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    public override fun users(users: List<IUser>) {
      cdkBuilder.users(users.map(IUser::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.ManagedPolicy = cdkBuilder.build()
  }

  public companion object {
    public open fun fromAwsManagedPolicyName(managedPolicyName: String): IManagedPolicy =
        software.amazon.awscdk.services.iam.ManagedPolicy.fromAwsManagedPolicyName(managedPolicyName).let(IManagedPolicy::wrap)

    public open fun fromManagedPolicyArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      managedPolicyArn: String,
    ): IManagedPolicy =
        software.amazon.awscdk.services.iam.ManagedPolicy.fromManagedPolicyArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, managedPolicyArn).let(IManagedPolicy::wrap)

    public open fun fromManagedPolicyName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      managedPolicyName: String,
    ): IManagedPolicy =
        software.amazon.awscdk.services.iam.ManagedPolicy.fromManagedPolicyName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, managedPolicyName).let(IManagedPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ManagedPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ManagedPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.ManagedPolicy): ManagedPolicy =
        ManagedPolicy(cdkObject)

    internal fun unwrap(wrapped: ManagedPolicy): software.amazon.awscdk.services.iam.ManagedPolicy =
        wrapped.cdkObject
  }
}
