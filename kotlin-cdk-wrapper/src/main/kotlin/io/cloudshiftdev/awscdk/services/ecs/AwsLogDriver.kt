@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

public open class AwsLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriver,
) : LogDriver(cdkObject) {
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  public open fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public open fun logGroup(`value`: ILogGroup) {
    unwrap(this).setLogGroup(`value`.let(ILogGroup::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun datetimeFormat(datetimeFormat: String)

    public fun logGroup(logGroup: ILogGroup)

    public fun logRetention(logRetention: RetentionDays)

    public fun maxBufferSize(maxBufferSize: Size)

    public fun mode(mode: AwsLogDriverMode)

    public fun multilinePattern(multilinePattern: String)

    public fun streamPrefix(streamPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AwsLogDriver.Builder =
        software.amazon.awscdk.services.ecs.AwsLogDriver.Builder.create()

    override fun datetimeFormat(datetimeFormat: String) {
      cdkBuilder.datetimeFormat(datetimeFormat)
    }

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    override fun maxBufferSize(maxBufferSize: Size) {
      cdkBuilder.maxBufferSize(maxBufferSize.let(Size::unwrap))
    }

    override fun mode(mode: AwsLogDriverMode) {
      cdkBuilder.mode(mode.let(AwsLogDriverMode::unwrap))
    }

    override fun multilinePattern(multilinePattern: String) {
      cdkBuilder.multilinePattern(multilinePattern)
    }

    override fun streamPrefix(streamPrefix: String) {
      cdkBuilder.streamPrefix(streamPrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AwsLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsLogDriver {
      val builderImpl = BuilderImpl()
      return AwsLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriver): AwsLogDriver =
        AwsLogDriver(cdkObject)

    internal fun unwrap(wrapped: AwsLogDriver): software.amazon.awscdk.services.ecs.AwsLogDriver =
        wrapped.cdkObject
  }
}
