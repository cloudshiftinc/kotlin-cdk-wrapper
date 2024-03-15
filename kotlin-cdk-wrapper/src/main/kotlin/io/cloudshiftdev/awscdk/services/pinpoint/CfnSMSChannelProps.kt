@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnSMSChannelProps {
  public fun applicationId(): String

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun senderId(): String? = unwrap(this).getSenderId()

  public fun shortCode(): String? = unwrap(this).getShortCode()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun senderId(senderId: String)

    public fun shortCode(shortCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun senderId(senderId: String) {
      cdkBuilder.senderId(senderId)
    }

    override fun shortCode(shortCode: String) {
      cdkBuilder.shortCode(shortCode)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps,
  ) : CdkObject(cdkObject), CfnSMSChannelProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun senderId(): String? = unwrap(this).getSenderId()

    override fun shortCode(): String? = unwrap(this).getShortCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSMSChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps):
        CfnSMSChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSMSChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps
  }
}
