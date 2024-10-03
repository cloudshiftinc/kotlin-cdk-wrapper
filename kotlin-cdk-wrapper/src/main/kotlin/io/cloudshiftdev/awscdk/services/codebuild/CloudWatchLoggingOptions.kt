@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Information about logs built to a CloudWatch Log Group for a build project.
 *
 * Example:
 *
 * ```
 * Project.Builder.create(this, "Project")
 * .logging(LoggingOptions.builder()
 * .cloudWatch(CloudWatchLoggingOptions.builder()
 * .logGroup(new LogGroup(this, "MyLogGroup"))
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface CloudWatchLoggingOptions {
  /**
   * The current status of the logs in Amazon CloudWatch Logs for a build project.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The Log Group to send logs to.
   *
   * Default: - no log group specified
   */
  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * The prefix of the stream name of the Amazon CloudWatch Logs.
   *
   * Default: - no prefix
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * A builder for [CloudWatchLoggingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled The current status of the logs in Amazon CloudWatch Logs for a build project.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param logGroup The Log Group to send logs to.
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * @param prefix The prefix of the stream name of the Amazon CloudWatch Logs.
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions.Builder =
        software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions.builder()

    /**
     * @param enabled The current status of the logs in Amazon CloudWatch Logs for a build project.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param logGroup The Log Group to send logs to.
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup.Companion::unwrap))
    }

    /**
     * @param prefix The prefix of the stream name of the Amazon CloudWatch Logs.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions,
  ) : CdkObject(cdkObject),
      CloudWatchLoggingOptions {
    /**
     * The current status of the logs in Amazon CloudWatch Logs for a build project.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The Log Group to send logs to.
     *
     * Default: - no log group specified
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * The prefix of the stream name of the Amazon CloudWatch Logs.
     *
     * Default: - no prefix
     */
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLoggingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions):
        CloudWatchLoggingOptions = CdkObjectWrappers.wrap(cdkObject) as? CloudWatchLoggingOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudWatchLoggingOptions):
        software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions
  }
}
