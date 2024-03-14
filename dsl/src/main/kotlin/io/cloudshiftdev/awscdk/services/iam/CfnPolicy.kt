package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  public open fun groups(`value`: List<String>) {
    unwrap(this).setGroups(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun policyName(): String = unwrap(this).getPolicyName()

  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  public open fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  public open fun roles(`value`: List<String>) {
    unwrap(this).setRoles(`value`)
  }

  public open fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  public open fun users(`value`: List<String>) {
    unwrap(this).setUsers(`value`)
  }

  public interface Builder {
    public fun groups(groups: List<String>)

    public fun policyDocument(policyDocument: Any)

    public fun policyName(policyName: String)

    public fun roles(roles: List<String>)

    public fun users(users: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnPolicy.Builder =
        software.amazon.awscdk.services.iam.CfnPolicy.Builder.create(scope, id)

    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnPolicy): CfnPolicy =
        CfnPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnPolicy): software.amazon.awscdk.services.iam.CfnPolicy =
        wrapped.cdkObject
  }
}
