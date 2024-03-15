@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface RealtimeLogConfigProps {
  public fun endPoints(): List<Endpoint>

  public fun fields(): List<String>

  public fun realtimeLogConfigName(): String? = unwrap(this).getRealtimeLogConfigName()

  public fun samplingRate(): Number

  @CdkDslMarker
  public interface Builder {
    public fun endPoints(endPoints: List<Endpoint>)

    public fun endPoints(vararg endPoints: Endpoint)

    public fun fields(fields: List<String>)

    public fun fields(vararg fields: String)

    public fun realtimeLogConfigName(realtimeLogConfigName: String)

    public fun samplingRate(samplingRate: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps.Builder =
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps.builder()

    override fun endPoints(endPoints: List<Endpoint>) {
      cdkBuilder.endPoints(endPoints.map(Endpoint::unwrap))
    }

    override fun endPoints(vararg endPoints: Endpoint): Unit = endPoints(endPoints.toList())

    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    override fun realtimeLogConfigName(realtimeLogConfigName: String) {
      cdkBuilder.realtimeLogConfigName(realtimeLogConfigName)
    }

    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps,
  ) : CdkObject(cdkObject), RealtimeLogConfigProps {
    override fun endPoints(): List<Endpoint> = unwrap(this).getEndPoints().map(Endpoint::wrap)

    override fun fields(): List<String> = unwrap(this).getFields()

    override fun realtimeLogConfigName(): String? = unwrap(this).getRealtimeLogConfigName()

    override fun samplingRate(): Number = unwrap(this).getSamplingRate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RealtimeLogConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps):
        RealtimeLogConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RealtimeLogConfigProps):
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.RealtimeLogConfigProps
  }
}
