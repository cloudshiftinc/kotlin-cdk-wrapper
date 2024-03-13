package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LogStream internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.LogStream,
) : Resource(cdkObject), ILogStream {
  public override fun logStreamName(): String = unwrap(this).getLogStreamName()

  public interface Builder {
    public fun logGroup(logGroup: ILogGroup) {
    }

    public fun logStreamName(logStreamName: String) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogStream.Builder =
        software.amazon.awscdk.services.logs.LogStream.Builder.create(scope, id)

    public override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogStream = cdkBuilder.build()
  }

  public companion object {
    public open fun fromLogStreamName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      logStreamName: String,
    ): ILogStream =
        software.amazon.awscdk.services.logs.LogStream.fromLogStreamName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, logStreamName).let(ILogStream::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LogStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LogStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogStream): LogStream =
        LogStream(cdkObject)

    internal fun unwrap(wrapped: LogStream): software.amazon.awscdk.services.logs.LogStream =
        wrapped.cdkObject
  }
}
