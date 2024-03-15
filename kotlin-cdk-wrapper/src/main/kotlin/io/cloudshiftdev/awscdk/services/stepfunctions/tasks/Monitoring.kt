@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface Monitoring {
  public fun logBucket(): IBucket? = unwrap(this).getLogBucket()?.let(IBucket::wrap)

  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public fun logStreamNamePrefix(): String? = unwrap(this).getLogStreamNamePrefix()

  public fun logging(): Boolean? = unwrap(this).getLogging()

  public fun persistentAppUi(): Boolean? = unwrap(this).getPersistentAppUI()

  @CdkDslMarker
  public interface Builder {
    public fun logBucket(logBucket: IBucket)

    public fun logGroup(logGroup: ILogGroup)

    public fun logStreamNamePrefix(logStreamNamePrefix: String)

    public fun logging(logging: Boolean)

    public fun persistentAppUi(persistentAppUi: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.Monitoring.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.Monitoring.builder()

    override fun logBucket(logBucket: IBucket) {
      cdkBuilder.logBucket(logBucket.let(IBucket::unwrap))
    }

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun logStreamNamePrefix(logStreamNamePrefix: String) {
      cdkBuilder.logStreamNamePrefix(logStreamNamePrefix)
    }

    override fun logging(logging: Boolean) {
      cdkBuilder.logging(logging)
    }

    override fun persistentAppUi(persistentAppUi: Boolean) {
      cdkBuilder.persistentAppUi(persistentAppUi)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.Monitoring =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Monitoring,
  ) : CdkObject(cdkObject), Monitoring {
    override fun logBucket(): IBucket? = unwrap(this).getLogBucket()?.let(IBucket::wrap)

    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    override fun logStreamNamePrefix(): String? = unwrap(this).getLogStreamNamePrefix()

    override fun logging(): Boolean? = unwrap(this).getLogging()

    override fun persistentAppUi(): Boolean? = unwrap(this).getPersistentAppUI()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Monitoring {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Monitoring):
        Monitoring = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Monitoring):
        software.amazon.awscdk.services.stepfunctions.tasks.Monitoring = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.Monitoring
  }
}
