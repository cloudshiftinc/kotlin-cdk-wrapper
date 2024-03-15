@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CloudWatchLoggingOptions {
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public fun prefix(): String? = unwrap(this).getPrefix()

  @CdkDslMarker
  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun logGroup(logGroup: ILogGroup)

    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions.Builder =
        software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions.builder()

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions,
  ) : CdkObject(cdkObject), CloudWatchLoggingOptions {
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLoggingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions):
        CloudWatchLoggingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudWatchLoggingOptions):
        software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions
  }
}
