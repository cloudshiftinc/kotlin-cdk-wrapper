@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRealtimeLogConfigProps {
  public fun endPoints(): Any

  public fun fields(): List<String>

  public fun name(): String

  public fun samplingRate(): Number

  @CdkDslMarker
  public interface Builder {
    public fun endPoints(endPoints: IResolvable)

    public fun endPoints(endPoints: List<Any>)

    public fun endPoints(vararg endPoints: Any)

    public fun fields(fields: List<String>)

    public fun fields(vararg fields: String)

    public fun name(name: String)

    public fun samplingRate(samplingRate: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps.builder()

    override fun endPoints(endPoints: IResolvable) {
      cdkBuilder.endPoints(endPoints.let(IResolvable::unwrap))
    }

    override fun endPoints(endPoints: List<Any>) {
      cdkBuilder.endPoints(endPoints)
    }

    override fun endPoints(vararg endPoints: Any): Unit = endPoints(endPoints.toList())

    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps,
  ) : CdkObject(cdkObject), CfnRealtimeLogConfigProps {
    override fun endPoints(): Any = unwrap(this).getEndPoints()

    override fun fields(): List<String> = unwrap(this).getFields()

    override fun name(): String = unwrap(this).getName()

    override fun samplingRate(): Number = unwrap(this).getSamplingRate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRealtimeLogConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps):
        CfnRealtimeLogConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRealtimeLogConfigProps):
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps
  }
}
