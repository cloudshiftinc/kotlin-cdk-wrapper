package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.Unit

public interface BackupProps {
  public fun preferredWindow(): String? = unwrap(this).getPreferredWindow()

  public fun retention(): Duration

  public interface Builder {
    public fun preferredWindow(preferredWindow: String)

    public fun retention(retention: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.BackupProps.Builder =
        software.amazon.awscdk.services.docdb.BackupProps.builder()

    override fun preferredWindow(preferredWindow: String) {
      cdkBuilder.preferredWindow(preferredWindow)
    }

    override fun retention(retention: Duration) {
      cdkBuilder.retention(retention.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.BackupProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.docdb.BackupProps,
  ) : BackupProps {
    override fun preferredWindow(): String? = unwrap(this).getPreferredWindow()

    override fun retention(): Duration = unwrap(this).getRetention().let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BackupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.BackupProps): BackupProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupProps): software.amazon.awscdk.services.docdb.BackupProps =
        (wrapped as Wrapper).cdkObject
  }
}
