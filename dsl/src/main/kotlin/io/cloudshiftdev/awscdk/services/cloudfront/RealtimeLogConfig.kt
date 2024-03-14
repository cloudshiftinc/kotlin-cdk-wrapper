package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RealtimeLogConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.RealtimeLogConfig,
) : Resource(cdkObject), IRealtimeLogConfig {
  public override fun realtimeLogConfigArn(): String = unwrap(this).getRealtimeLogConfigArn()

  public override fun realtimeLogConfigName(): String = unwrap(this).getRealtimeLogConfigName()

  public interface Builder {
    public fun endPoints(endPoints: List<Endpoint>) {
    }

    public fun fields(fields: List<String>) {
    }

    public fun realtimeLogConfigName(realtimeLogConfigName: String) {
    }

    public fun samplingRate(samplingRate: Number) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.RealtimeLogConfig.Builder =
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfig.Builder.create(scope, id)

    public override fun endPoints(endPoints: List<Endpoint>) {
      cdkBuilder.endPoints(endPoints.map(Endpoint::unwrap))
    }

    public override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    public override fun realtimeLogConfigName(realtimeLogConfigName: String) {
      cdkBuilder.realtimeLogConfigName(realtimeLogConfigName)
    }

    public override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.RealtimeLogConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): RealtimeLogConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return RealtimeLogConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.RealtimeLogConfig):
        RealtimeLogConfig = RealtimeLogConfig(cdkObject)

    internal fun unwrap(wrapped: RealtimeLogConfig):
        software.amazon.awscdk.services.cloudfront.RealtimeLogConfig = wrapped.cdkObject
  }
}
