package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUser internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnUser,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun authenticationType(): String = unwrap(this).getAuthenticationType()

  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  public open fun firstName(): String? = unwrap(this).getFirstName()

  public open fun firstName(`value`: String) {
    unwrap(this).setFirstName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lastName(): String? = unwrap(this).getLastName()

  public open fun lastName(`value`: String) {
    unwrap(this).setLastName(`value`)
  }

  public open fun messageAction(): String? = unwrap(this).getMessageAction()

  public open fun messageAction(`value`: String) {
    unwrap(this).setMessageAction(`value`)
  }

  public open fun userName(): String = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  public interface Builder {
    public fun authenticationType(authenticationType: String)

    public fun firstName(firstName: String)

    public fun lastName(lastName: String)

    public fun messageAction(messageAction: String)

    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnUser.Builder =
        software.amazon.awscdk.services.appstream.CfnUser.Builder.create(scope, id)

    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    override fun firstName(firstName: String) {
      cdkBuilder.firstName(firstName)
    }

    override fun lastName(lastName: String) {
      cdkBuilder.lastName(lastName)
    }

    override fun messageAction(messageAction: String) {
      cdkBuilder.messageAction(messageAction)
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnUser = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.appstream.CfnUser =
        wrapped.cdkObject
  }
}
