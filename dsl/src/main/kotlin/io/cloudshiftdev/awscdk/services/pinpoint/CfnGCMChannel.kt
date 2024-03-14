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

public open class CfnGCMChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnGCMChannel,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiKey(): String? = unwrap(this).getApiKey()

  public open fun apiKey(`value`: String) {
    unwrap(this).setApiKey(`value`)
  }

  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun defaultAuthenticationMethod(): String? =
      unwrap(this).getDefaultAuthenticationMethod()

  public open fun defaultAuthenticationMethod(`value`: String) {
    unwrap(this).setDefaultAuthenticationMethod(`value`)
  }

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

  public open fun serviceJson(): String? = unwrap(this).getServiceJson()

  public open fun serviceJson(`value`: String) {
    unwrap(this).setServiceJson(`value`)
  }

  public interface Builder {
    public fun apiKey(apiKey: String)

    public fun applicationId(applicationId: String)

    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun serviceJson(serviceJson: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnGCMChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnGCMChannel.Builder.create(scope, id)

    override fun apiKey(apiKey: String) {
      cdkBuilder.apiKey(apiKey)
    }

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
      cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun serviceJson(serviceJson: String) {
      cdkBuilder.serviceJson(serviceJson)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnGCMChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGCMChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGCMChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnGCMChannel):
        CfnGCMChannel = CfnGCMChannel(cdkObject)

    internal fun unwrap(wrapped: CfnGCMChannel):
        software.amazon.awscdk.services.pinpoint.CfnGCMChannel = wrapped.cdkObject
  }
}
