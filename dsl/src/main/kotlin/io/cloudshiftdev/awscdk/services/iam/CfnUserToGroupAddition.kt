package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserToGroupAddition internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iam.CfnUserToGroupAddition,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun groupName(): String = unwrap(this).getGroupName()

  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun users(): List<String> = unwrap(this).getUsers()

  public open fun users(`value`: List<String>) {
    unwrap(this).setUsers(`value`)
  }

  public open fun users(vararg `value`: String): Unit = users(`value`.toList())

  public interface Builder {
    public fun groupName(groupName: String)

    public fun users(users: List<String>)

    public fun users(vararg users: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUserToGroupAddition.Builder =
        software.amazon.awscdk.services.iam.CfnUserToGroupAddition.Builder.create(scope, id)

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnUserToGroupAddition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserToGroupAddition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserToGroupAddition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUserToGroupAddition):
        CfnUserToGroupAddition = CfnUserToGroupAddition(cdkObject)

    internal fun unwrap(wrapped: CfnUserToGroupAddition):
        software.amazon.awscdk.services.iam.CfnUserToGroupAddition = wrapped.cdkObject
  }
}
