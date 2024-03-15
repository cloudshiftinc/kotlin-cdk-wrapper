@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnMasterProps {
  public fun detectorId(): String

  public fun invitationId(): String? = unwrap(this).getInvitationId()

  public fun masterId(): String

  @CdkDslMarker
  public interface Builder {
    public fun detectorId(detectorId: String)

    public fun invitationId(invitationId: String)

    public fun masterId(masterId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnMasterProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnMasterProps.builder()

    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    override fun invitationId(invitationId: String) {
      cdkBuilder.invitationId(invitationId)
    }

    override fun masterId(masterId: String) {
      cdkBuilder.masterId(masterId)
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnMasterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.guardduty.CfnMasterProps,
  ) : CdkObject(cdkObject), CfnMasterProps {
    override fun detectorId(): String = unwrap(this).getDetectorId()

    override fun invitationId(): String? = unwrap(this).getInvitationId()

    override fun masterId(): String = unwrap(this).getMasterId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMasterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnMasterProps):
        CfnMasterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMasterProps):
        software.amazon.awscdk.services.guardduty.CfnMasterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.guardduty.CfnMasterProps
  }
}
