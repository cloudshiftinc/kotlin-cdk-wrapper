@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnBaiduChannelProps {
  public fun apiKey(): String

  public fun applicationId(): String

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun secretKey(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiKey(apiKey: String)

    public fun applicationId(applicationId: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun secretKey(secretKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps.builder()

    override fun apiKey(apiKey: String) {
      cdkBuilder.apiKey(apiKey)
    }

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun secretKey(secretKey: String) {
      cdkBuilder.secretKey(secretKey)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps,
  ) : CdkObject(cdkObject), CfnBaiduChannelProps {
    override fun apiKey(): String = unwrap(this).getApiKey()

    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun secretKey(): String = unwrap(this).getSecretKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBaiduChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps):
        CfnBaiduChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBaiduChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps
  }
}
