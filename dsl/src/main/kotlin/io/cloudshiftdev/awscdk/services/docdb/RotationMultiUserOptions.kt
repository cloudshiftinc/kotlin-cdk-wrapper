package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Unit

public interface RotationMultiUserOptions {
  public fun automaticallyAfter(): Duration? =
      unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

  public fun secret(): ISecret

  public interface Builder {
    public fun automaticallyAfter(automaticallyAfter: Duration)

    public fun secret(secret: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.RotationMultiUserOptions.Builder =
        software.amazon.awscdk.services.docdb.RotationMultiUserOptions.builder()

    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.RotationMultiUserOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.docdb.RotationMultiUserOptions,
  ) : RotationMultiUserOptions {
    override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RotationMultiUserOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.RotationMultiUserOptions):
        RotationMultiUserOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RotationMultiUserOptions):
        software.amazon.awscdk.services.docdb.RotationMultiUserOptions = (wrapped as
        Wrapper).cdkObject
  }
}
