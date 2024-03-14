package io.cloudshiftdev.awscdk.services.pinpoint

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

public open class CfnSMSChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSMSChannel,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun senderId(): String? = unwrap(this).getSenderId()

  public open fun senderId(`value`: String) {
    unwrap(this).setSenderId(`value`)
  }

  public open fun shortCode(): String? = unwrap(this).getShortCode()

  public open fun shortCode(`value`: String) {
    unwrap(this).setShortCode(`value`)
  }

  public interface Builder {
    public fun applicationId(applicationId: String) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun enabled(enabled: IResolvable) {
    }

    public fun senderId(senderId: String) {
    }

    public fun shortCode(shortCode: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSMSChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSMSChannel.Builder.create(scope, id)

    public override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public override fun senderId(senderId: String) {
      cdkBuilder.senderId(senderId)
    }

    public override fun shortCode(shortCode: String) {
      cdkBuilder.shortCode(shortCode)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSMSChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSMSChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSMSChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSMSChannel):
        CfnSMSChannel = CfnSMSChannel(cdkObject)

    internal fun unwrap(wrapped: CfnSMSChannel):
        software.amazon.awscdk.services.pinpoint.CfnSMSChannel = wrapped.cdkObject
  }
}
