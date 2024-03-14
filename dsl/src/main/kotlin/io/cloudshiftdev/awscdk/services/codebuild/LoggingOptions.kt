package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LoggingOptions {
  /**
   * Information about Amazon CloudWatch Logs for a build project.
   *
   * Default: - enabled
   */
  public fun cloudWatch(): CloudWatchLoggingOptions? =
      unwrap(this).getCloudWatch()?.let(CloudWatchLoggingOptions::wrap)

  /**
   * Information about logs built to an S3 bucket for a build project.
   *
   * Default: - disabled
   */
  public fun s3(): S3LoggingOptions? = unwrap(this).getS3()?.let(S3LoggingOptions::wrap)

  /**
   * A builder for [LoggingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudWatch Information about Amazon CloudWatch Logs for a build project.
     */
    public fun cloudWatch(cloudWatch: CloudWatchLoggingOptions)

    /**
     * @param cloudWatch Information about Amazon CloudWatch Logs for a build project.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50db3558f5155ce5538bca42b8a0ef560f70e602e6df0a761ea716f2fe0b5b74")
    public fun cloudWatch(cloudWatch: CloudWatchLoggingOptions.Builder.() -> Unit)

    /**
     * @param s3 Information about logs built to an S3 bucket for a build project.
     */
    public fun s3(s3: S3LoggingOptions)

    /**
     * @param s3 Information about logs built to an S3 bucket for a build project.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc17c5351a80cee363a0e712c8276bc76123fcea37c4f414243f4497c8a0b08d")
    public fun s3(s3: S3LoggingOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.LoggingOptions.Builder =
        software.amazon.awscdk.services.codebuild.LoggingOptions.builder()

    /**
     * @param cloudWatch Information about Amazon CloudWatch Logs for a build project.
     */
    override fun cloudWatch(cloudWatch: CloudWatchLoggingOptions) {
      cdkBuilder.cloudWatch(cloudWatch.let(CloudWatchLoggingOptions::unwrap))
    }

    /**
     * @param cloudWatch Information about Amazon CloudWatch Logs for a build project.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50db3558f5155ce5538bca42b8a0ef560f70e602e6df0a761ea716f2fe0b5b74")
    override fun cloudWatch(cloudWatch: CloudWatchLoggingOptions.Builder.() -> Unit): Unit =
        cloudWatch(CloudWatchLoggingOptions(cloudWatch))

    /**
     * @param s3 Information about logs built to an S3 bucket for a build project.
     */
    override fun s3(s3: S3LoggingOptions) {
      cdkBuilder.s3(s3.let(S3LoggingOptions::unwrap))
    }

    /**
     * @param s3 Information about logs built to an S3 bucket for a build project.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc17c5351a80cee363a0e712c8276bc76123fcea37c4f414243f4497c8a0b08d")
    override fun s3(s3: S3LoggingOptions.Builder.() -> Unit): Unit = s3(S3LoggingOptions(s3))

    public fun build(): software.amazon.awscdk.services.codebuild.LoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.LoggingOptions,
  ) : LoggingOptions {
    /**
     * Information about Amazon CloudWatch Logs for a build project.
     *
     * Default: - enabled
     */
    override fun cloudWatch(): CloudWatchLoggingOptions? =
        unwrap(this).getCloudWatch()?.let(CloudWatchLoggingOptions::wrap)

    /**
     * Information about logs built to an S3 bucket for a build project.
     *
     * Default: - disabled
     */
    override fun s3(): S3LoggingOptions? = unwrap(this).getS3()?.let(S3LoggingOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.LoggingOptions):
        LoggingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingOptions):
        software.amazon.awscdk.services.codebuild.LoggingOptions = (wrapped as Wrapper).cdkObject
  }
}
