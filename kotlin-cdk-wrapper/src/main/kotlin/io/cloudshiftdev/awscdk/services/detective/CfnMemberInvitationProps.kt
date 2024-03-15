@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnMemberInvitationProps {
  public fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

  public fun graphArn(): String

  public fun memberEmailAddress(): String

  public fun memberId(): String

  public fun message(): String? = unwrap(this).getMessage()

  @CdkDslMarker
  public interface Builder {
    public fun disableEmailNotification(disableEmailNotification: Boolean)

    public fun disableEmailNotification(disableEmailNotification: IResolvable)

    public fun graphArn(graphArn: String)

    public fun memberEmailAddress(memberEmailAddress: String)

    public fun memberId(memberId: String)

    public fun message(message: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.detective.CfnMemberInvitationProps.Builder =
        software.amazon.awscdk.services.detective.CfnMemberInvitationProps.builder()

    override fun disableEmailNotification(disableEmailNotification: Boolean) {
      cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    override fun disableEmailNotification(disableEmailNotification: IResolvable) {
      cdkBuilder.disableEmailNotification(disableEmailNotification.let(IResolvable::unwrap))
    }

    override fun graphArn(graphArn: String) {
      cdkBuilder.graphArn(graphArn)
    }

    override fun memberEmailAddress(memberEmailAddress: String) {
      cdkBuilder.memberEmailAddress(memberEmailAddress)
    }

    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnMemberInvitationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.detective.CfnMemberInvitationProps,
  ) : CdkObject(cdkObject), CfnMemberInvitationProps {
    override fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

    override fun graphArn(): String = unwrap(this).getGraphArn()

    override fun memberEmailAddress(): String = unwrap(this).getMemberEmailAddress()

    override fun memberId(): String = unwrap(this).getMemberId()

    override fun message(): String? = unwrap(this).getMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMemberInvitationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnMemberInvitationProps):
        CfnMemberInvitationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMemberInvitationProps):
        software.amazon.awscdk.services.detective.CfnMemberInvitationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.detective.CfnMemberInvitationProps
  }
}
