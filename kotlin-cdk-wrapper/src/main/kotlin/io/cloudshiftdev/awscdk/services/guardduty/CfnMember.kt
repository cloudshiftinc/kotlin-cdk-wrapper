@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMember internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.guardduty.CfnMember,
) : CfnResource(cdkObject), IInspectable {
  public open fun detectorId(): String? = unwrap(this).getDetectorId()

  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
  }

  public open fun disableEmailNotification(): Any? = unwrap(this).getDisableEmailNotification()

  public open fun disableEmailNotification(`value`: Boolean) {
    unwrap(this).setDisableEmailNotification(`value`)
  }

  public open fun disableEmailNotification(`value`: IResolvable) {
    unwrap(this).setDisableEmailNotification(`value`.let(IResolvable::unwrap))
  }

  public open fun email(): String = unwrap(this).getEmail()

  public open fun email(`value`: String) {
    unwrap(this).setEmail(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun memberId(): String? = unwrap(this).getMemberId()

  public open fun memberId(`value`: String) {
    unwrap(this).setMemberId(`value`)
  }

  public open fun message(): String? = unwrap(this).getMessage()

  public open fun message(`value`: String) {
    unwrap(this).setMessage(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnMember.Builder =
        software.amazon.awscdk.services.guardduty.CfnMember.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.guardduty.CfnMember = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.guardduty.CfnMember.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMember {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMember(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnMember): CfnMember =
        CfnMember(cdkObject)

    internal fun unwrap(wrapped: CfnMember): software.amazon.awscdk.services.guardduty.CfnMember =
        wrapped.cdkObject
  }
}
