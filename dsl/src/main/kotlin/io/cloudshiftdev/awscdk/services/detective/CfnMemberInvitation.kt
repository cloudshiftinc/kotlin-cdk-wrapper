package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMemberInvitation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.detective.CfnMemberInvitation,
) : CfnResource(cdkObject), IInspectable {
  public open fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

  public open fun disableEmailNotification(`value`: Boolean) {
    unwrap(this).setDisableEmailNotification(`value`)
  }

  public open fun disableEmailNotification(`value`: IResolvable) {
    unwrap(this).setDisableEmailNotification(`value`.let(IResolvable::unwrap))
  }

  public open fun graphArn(): String = unwrap(this).getGraphArn()

  public open fun graphArn(`value`: String) {
    unwrap(this).setGraphArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun memberEmailAddress(): String = unwrap(this).getMemberEmailAddress()

  public open fun memberEmailAddress(`value`: String) {
    unwrap(this).setMemberEmailAddress(`value`)
  }

  public open fun memberId(): String = unwrap(this).getMemberId()

  public open fun memberId(`value`: String) {
    unwrap(this).setMemberId(`value`)
  }

  public open fun message(): String? = unwrap(this).getMessage()

  public open fun message(`value`: String) {
    unwrap(this).setMessage(`value`)
  }

  public interface Builder {
    public fun disableEmailNotification(disableEmailNotification: Boolean) {
    }

    public fun disableEmailNotification(disableEmailNotification: IResolvable) {
    }

    public fun graphArn(graphArn: String) {
    }

    public fun memberEmailAddress(memberEmailAddress: String) {
    }

    public fun memberId(memberId: String) {
    }

    public fun message(message: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.detective.CfnMemberInvitation.Builder =
        software.amazon.awscdk.services.detective.CfnMemberInvitation.Builder.create(scope, id)

    public override fun disableEmailNotification(disableEmailNotification: Boolean) {
      cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    public override fun disableEmailNotification(disableEmailNotification: IResolvable) {
      cdkBuilder.disableEmailNotification(disableEmailNotification.let(IResolvable::unwrap))
    }

    public override fun graphArn(graphArn: String) {
      cdkBuilder.graphArn(graphArn)
    }

    public override fun memberEmailAddress(memberEmailAddress: String) {
      cdkBuilder.memberEmailAddress(memberEmailAddress)
    }

    public override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    public override fun message(message: String) {
      cdkBuilder.message(message)
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnMemberInvitation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMemberInvitation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMemberInvitation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnMemberInvitation):
        CfnMemberInvitation = CfnMemberInvitation(cdkObject)

    internal fun unwrap(wrapped: CfnMemberInvitation):
        software.amazon.awscdk.services.detective.CfnMemberInvitation = wrapped.cdkObject
  }
}
