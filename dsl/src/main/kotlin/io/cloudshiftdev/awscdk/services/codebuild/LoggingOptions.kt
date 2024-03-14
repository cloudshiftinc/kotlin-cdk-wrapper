package io.cloudshiftdev.awscdk.services.codebuild

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LoggingOptions {
  public fun cloudWatch(): CloudWatchLoggingOptions? =
      unwrap(this).getCloudWatch()?.let(CloudWatchLoggingOptions::wrap)

  public fun s3(): S3LoggingOptions? = unwrap(this).getS3()?.let(S3LoggingOptions::wrap)

  public interface Builder {
    public fun cloudWatch(cloudWatch: CloudWatchLoggingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50db3558f5155ce5538bca42b8a0ef560f70e602e6df0a761ea716f2fe0b5b74")
    public fun cloudWatch(cloudWatch: CloudWatchLoggingOptions.Builder.() -> Unit) {
    }

    public fun s3(s3: S3LoggingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc17c5351a80cee363a0e712c8276bc76123fcea37c4f414243f4497c8a0b08d")
    public fun s3(s3: S3LoggingOptions.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.LoggingOptions.Builder =
        software.amazon.awscdk.services.codebuild.LoggingOptions.builder()

    public override fun cloudWatch(cloudWatch: CloudWatchLoggingOptions) {
      cdkBuilder.cloudWatch(cloudWatch.let(CloudWatchLoggingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50db3558f5155ce5538bca42b8a0ef560f70e602e6df0a761ea716f2fe0b5b74")
    public override fun cloudWatch(cloudWatch: CloudWatchLoggingOptions.Builder.() -> Unit): Unit =
        cloudWatch(CloudWatchLoggingOptions(cloudWatch))

    public override fun s3(s3: S3LoggingOptions) {
      cdkBuilder.s3(s3.let(S3LoggingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc17c5351a80cee363a0e712c8276bc76123fcea37c4f414243f4497c8a0b08d")
    public override fun s3(s3: S3LoggingOptions.Builder.() -> Unit): Unit = s3(S3LoggingOptions(s3))

    public fun build(): software.amazon.awscdk.services.codebuild.LoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codebuild.LoggingOptions,
  ) : LoggingOptions {
    public override fun cloudWatch(): CloudWatchLoggingOptions? =
        unwrap(this).getCloudWatch()?.let(CloudWatchLoggingOptions::wrap)

    public override fun s3(): S3LoggingOptions? = unwrap(this).getS3()?.let(S3LoggingOptions::wrap)
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
