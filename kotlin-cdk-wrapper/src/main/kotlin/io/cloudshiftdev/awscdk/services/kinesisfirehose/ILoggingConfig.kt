@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean

/**
 * Configuration interface for logging errors when data transformation or delivery fails.
 *
 * This interface defines whether logging is enabled and optionally allows specifying a
 * CloudWatch Log Group for storing error logs.
 */
public interface ILoggingConfig {
  /**
   * The CloudWatch log group where log streams will be created to hold error logs.
   *
   * Default: - if `logging` is set to `true`, a log group will be created for you.
   */
  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * If true, log errors when data transformation or data delivery fails.
   *
   * `true` when using `EnableLogging`, `false` when using `DisableLogging`.
   */
  public fun logging(): Boolean

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.ILoggingConfig,
  ) : CdkObject(cdkObject),
      ILoggingConfig {
    /**
     * The CloudWatch log group where log streams will be created to hold error logs.
     *
     * Default: - if `logging` is set to `true`, a log group will be created for you.
     */
    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    /**
     * If true, log errors when data transformation or data delivery fails.
     *
     * `true` when using `EnableLogging`, `false` when using `DisableLogging`.
     */
    override fun logging(): Boolean = unwrap(this).getLogging()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.ILoggingConfig):
        ILoggingConfig = CdkObjectWrappers.wrap(cdkObject) as? ILoggingConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILoggingConfig):
        software.amazon.awscdk.services.kinesisfirehose.ILoggingConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.ILoggingConfig
  }
}
