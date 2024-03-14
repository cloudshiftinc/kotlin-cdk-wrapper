package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Policy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.Policy,
) : Resource(cdkObject), IPolicy, IGrantable {
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

  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun policyName(): String = unwrap(this).getPolicyName()

  public interface Builder {
    public fun document(document: PolicyDocument)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5f8c6030ff03cf2b0e6f84a0f4d897c709ef521a1ca98a4ce97147236626a0c")
    public fun document(document: PolicyDocument.Builder.() -> Unit)

    public fun force(force: Boolean)

    public fun groups(groups: List<IGroup>)

    public fun policyName(policyName: String)

    public fun roles(roles: List<IRole>)

    public fun statements(statements: List<PolicyStatement>)

    public fun users(users: List<IUser>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.Policy.Builder =
        software.amazon.awscdk.services.iam.Policy.Builder.create(scope, id)

    override fun document(document: PolicyDocument) {
      cdkBuilder.document(document.let(PolicyDocument::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5f8c6030ff03cf2b0e6f84a0f4d897c709ef521a1ca98a4ce97147236626a0c")
    override fun document(document: PolicyDocument.Builder.() -> Unit): Unit =
        document(PolicyDocument(document))

    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun roles(roles: List<IRole>) {
      cdkBuilder.roles(roles.map(IRole::unwrap))
    }

    override fun statements(statements: List<PolicyStatement>) {
      cdkBuilder.statements(statements.map(PolicyStatement::unwrap))
    }

    override fun users(users: List<IUser>) {
      cdkBuilder.users(users.map(IUser::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.Policy = cdkBuilder.build()
  }

  public companion object {
    public open fun fromPolicyName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      policyName: String,
    ): IPolicy =
        software.amazon.awscdk.services.iam.Policy.fromPolicyName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, policyName).let(IPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Policy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Policy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.Policy): Policy =
        Policy(cdkObject)

    internal fun unwrap(wrapped: Policy): software.amazon.awscdk.services.iam.Policy =
        wrapped.cdkObject
  }
}
