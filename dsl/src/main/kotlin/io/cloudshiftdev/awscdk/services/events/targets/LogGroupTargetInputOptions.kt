package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Unit

public interface LogGroupTargetInputOptions {
  /**
   * The value provided here will be used in the Log "message" field.
   *
   * This field must be a string. If an object is passed (e.g. JSON data)
   * it will not throw an error, but the message that makes it to
   * CloudWatch logs will be incorrect. This is a likely scenario if
   * doing something like: EventField.fromPath('$.detail') since in most cases
   * the `detail` field contains JSON data.
   *
   * Default: EventField.detailType
   */
  public fun message(): Any? = unwrap(this).getMessage()

  /**
   * The timestamp that will appear in the CloudWatch Logs record.
   *
   * Default: EventField.time
   */
  public fun timestamp(): Any? = unwrap(this).getTimestamp()

  /**
   * A builder for [LogGroupTargetInputOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param message The value provided here will be used in the Log "message" field.
     * This field must be a string. If an object is passed (e.g. JSON data)
     * it will not throw an error, but the message that makes it to
     * CloudWatch logs will be incorrect. This is a likely scenario if
     * doing something like: EventField.fromPath('$.detail') since in most cases
     * the `detail` field contains JSON data.
     */
    public fun message(message: Any)

    /**
     * @param timestamp The timestamp that will appear in the CloudWatch Logs record.
     */
    public fun timestamp(timestamp: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions.Builder =
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions.builder()

    /**
     * @param message The value provided here will be used in the Log "message" field.
     * This field must be a string. If an object is passed (e.g. JSON data)
     * it will not throw an error, but the message that makes it to
     * CloudWatch logs will be incorrect. This is a likely scenario if
     * doing something like: EventField.fromPath('$.detail') since in most cases
     * the `detail` field contains JSON data.
     */
    override fun message(message: Any) {
      cdkBuilder.message(message)
    }

    /**
     * @param timestamp The timestamp that will appear in the CloudWatch Logs record.
     */
    override fun timestamp(timestamp: Any) {
      cdkBuilder.timestamp(timestamp)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions,
  ) : CdkObject(cdkObject), LogGroupTargetInputOptions {
    /**
     * The value provided here will be used in the Log "message" field.
     *
     * This field must be a string. If an object is passed (e.g. JSON data)
     * it will not throw an error, but the message that makes it to
     * CloudWatch logs will be incorrect. This is a likely scenario if
     * doing something like: EventField.fromPath('$.detail') since in most cases
     * the `detail` field contains JSON data.
     *
     * Default: EventField.detailType
     */
    override fun message(): Any? = unwrap(this).getMessage()

    /**
     * The timestamp that will appear in the CloudWatch Logs record.
     *
     * Default: EventField.time
     */
    override fun timestamp(): Any? = unwrap(this).getTimestamp()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogGroupTargetInputOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions):
        LogGroupTargetInputOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupTargetInputOptions):
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions
  }
}
