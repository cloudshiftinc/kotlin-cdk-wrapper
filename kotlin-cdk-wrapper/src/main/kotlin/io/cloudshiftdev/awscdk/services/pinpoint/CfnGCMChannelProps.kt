@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnGCMChannelProps {
  public fun apiKey(): String? = unwrap(this).getApiKey()

  public fun applicationId(): String

  public fun defaultAuthenticationMethod(): String? = unwrap(this).getDefaultAuthenticationMethod()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun serviceJson(): String? = unwrap(this).getServiceJson()

  @CdkDslMarker
  public interface Builder {
    public fun apiKey(apiKey: String)

    public fun applicationId(applicationId: String)

    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun serviceJson(serviceJson: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps.builder()

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

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps,
  ) : CdkObject(cdkObject), CfnGCMChannelProps {
    override fun apiKey(): String? = unwrap(this).getApiKey()

    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun defaultAuthenticationMethod(): String? =
        unwrap(this).getDefaultAuthenticationMethod()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun serviceJson(): String? = unwrap(this).getServiceJson()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGCMChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps):
        CfnGCMChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGCMChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps
  }
}
