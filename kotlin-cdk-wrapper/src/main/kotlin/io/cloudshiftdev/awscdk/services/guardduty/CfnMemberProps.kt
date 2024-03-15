@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnMemberProps {
  public fun detectorId(): String? = unwrap(this).getDetectorId()

  public fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

  public fun email(): String

  public fun memberId(): String? = unwrap(this).getMemberId()

  public fun message(): String? = unwrap(this).getMessage()

  public fun status(): String? = unwrap(this).getStatus()

  @CdkDslMarker
  public interface Builder {
    public fun detectorId(detectorId: String)

    public fun disableEmailNotification(disableEmailNotification: Boolean)

    public fun disableEmailNotification(disableEmailNotification: IResolvable)

    public fun email(email: String)

    public fun memberId(memberId: String)

    public fun message(message: String)

    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnMemberProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnMemberProps.builder()

    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    override fun disableEmailNotification(disableEmailNotification: Boolean) {
      cdkBuilder.disableEmailNotification(disableEmailNotification)
    }

    override fun disableEmailNotification(disableEmailNotification: IResolvable) {
      cdkBuilder.disableEmailNotification(disableEmailNotification.let(IResolvable::unwrap))
    }

    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnMemberProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.guardduty.CfnMemberProps,
  ) : CdkObject(cdkObject), CfnMemberProps {
    override fun detectorId(): String? = unwrap(this).getDetectorId()

    override fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

    override fun email(): String = unwrap(this).getEmail()

    override fun memberId(): String? = unwrap(this).getMemberId()

    override fun message(): String? = unwrap(this).getMessage()

    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMemberProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnMemberProps):
        CfnMemberProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMemberProps):
        software.amazon.awscdk.services.guardduty.CfnMemberProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.guardduty.CfnMemberProps
  }
}
