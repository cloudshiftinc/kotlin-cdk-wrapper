package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnManagedPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnManagedPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAttachmentCount(): Number = unwrap(this).getAttrAttachmentCount()

  public open fun attrCreateDate(): String = unwrap(this).getAttrCreateDate()

  public open fun attrDefaultVersionId(): String = unwrap(this).getAttrDefaultVersionId()

  public open fun attrIsAttachable(): IResolvable =
      unwrap(this).getAttrIsAttachable().let(IResolvable::wrap)

  public open fun attrPermissionsBoundaryUsageCount(): Number =
      unwrap(this).getAttrPermissionsBoundaryUsageCount()

  public open fun attrPolicyArn(): String = unwrap(this).getAttrPolicyArn()

  public open fun attrPolicyId(): String = unwrap(this).getAttrPolicyId()

  public open fun attrUpdateDate(): String = unwrap(this).getAttrUpdateDate()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  public open fun groups(`value`: List<String>) {
    unwrap(this).setGroups(`value`)
  }

  public open fun groups(vararg `value`: String): Unit = groups(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

  public open fun managedPolicyName(`value`: String) {
    unwrap(this).setManagedPolicyName(`value`)
  }

  public open fun path(): String? = unwrap(this).getPath()

  public open fun path(`value`: String) {
    unwrap(this).setPath(`value`)
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  public open fun roles(`value`: List<String>) {
    unwrap(this).setRoles(`value`)
  }

  public open fun roles(vararg `value`: String): Unit = roles(`value`.toList())

  public open fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  public open fun users(`value`: List<String>) {
    unwrap(this).setUsers(`value`)
  }

  public open fun users(vararg `value`: String): Unit = users(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun groups(groups: List<String>)

    public fun groups(vararg groups: String)

    public fun managedPolicyName(managedPolicyName: String)

    public fun path(path: String)

    public fun policyDocument(policyDocument: Any)

    public fun roles(roles: List<String>)

    public fun roles(vararg roles: String)

    public fun users(users: List<String>)

    public fun users(vararg users: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnManagedPolicy.Builder =
        software.amazon.awscdk.services.iam.CfnManagedPolicy.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnManagedPolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnManagedPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnManagedPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnManagedPolicy):
        CfnManagedPolicy = CfnManagedPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnManagedPolicy):
        software.amazon.awscdk.services.iam.CfnManagedPolicy = wrapped.cdkObject
  }
}
