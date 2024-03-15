@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface BackupProps {
  public fun preferredWindow(): String? = unwrap(this).getPreferredWindow()

  public fun retention(): Duration

  @CdkDslMarker
  public interface Builder {
    public fun preferredWindow(preferredWindow: String)

    public fun retention(retention: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.BackupProps.Builder =
        software.amazon.awscdk.services.rds.BackupProps.builder()

    override fun preferredWindow(preferredWindow: String) {
      cdkBuilder.preferredWindow(preferredWindow)
    }

    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.BackupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.BackupProps,
  ) : CdkObject(cdkObject), BackupProps {
    override fun preferredWindow(): String? = unwrap(this).getPreferredWindow()

    override fun retention(): Duration = unwrap(this).getRetention().let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.BackupProps): BackupProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupProps): software.amazon.awscdk.services.rds.BackupProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.BackupProps
  }
}