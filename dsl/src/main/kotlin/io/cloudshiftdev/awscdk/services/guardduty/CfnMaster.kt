package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMaster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.guardduty.CfnMaster,
) : CfnResource(cdkObject), IInspectable {
  public open fun detectorId(): String = unwrap(this).getDetectorId()

  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun invitationId(): String? = unwrap(this).getInvitationId()

  public open fun invitationId(`value`: String) {
    unwrap(this).setInvitationId(`value`)
  }

  public open fun masterId(): String = unwrap(this).getMasterId()

  public open fun masterId(`value`: String) {
    unwrap(this).setMasterId(`value`)
  }

  public interface Builder {
    public fun detectorId(detectorId: String) {
    }

    public fun invitationId(invitationId: String) {
    }

    public fun masterId(masterId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnMaster.Builder =
        software.amazon.awscdk.services.guardduty.CfnMaster.Builder.create(scope, id)

    public override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    public override fun invitationId(invitationId: String) {
      cdkBuilder.invitationId(invitationId)
    }

    public override fun masterId(masterId: String) {
      cdkBuilder.masterId(masterId)
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnMaster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMaster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMaster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnMaster): CfnMaster =
        CfnMaster(cdkObject)

    internal fun unwrap(wrapped: CfnMaster): software.amazon.awscdk.services.guardduty.CfnMaster =
        wrapped.cdkObject
  }
}
