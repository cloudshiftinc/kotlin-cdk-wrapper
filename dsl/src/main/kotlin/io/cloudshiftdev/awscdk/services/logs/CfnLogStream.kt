package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogStream internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnLogStream,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logGroupName(): String = unwrap(this).getLogGroupName()

  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  public open fun logStreamName(): String? = unwrap(this).getLogStreamName()

  public open fun logStreamName(`value`: String) {
    unwrap(this).setLogStreamName(`value`)
  }

  public interface Builder {
    public fun logGroupName(logGroupName: String) {
    }

    public fun logStreamName(logStreamName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogStream.Builder =
        software.amazon.awscdk.services.logs.CfnLogStream.Builder.create(scope, id)

    public override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    public override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnLogStream = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogStream): CfnLogStream =
        CfnLogStream(cdkObject)

    internal fun unwrap(wrapped: CfnLogStream): software.amazon.awscdk.services.logs.CfnLogStream =
        wrapped.cdkObject
  }
}
