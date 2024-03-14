package io.cloudshiftdev.awscdk.services.lambda

import kotlin.Number
import kotlin.Unit

public interface VersionWeight {
  public fun version(): IVersion

  public fun weight(): Number

  public interface Builder {
    public fun version(version: IVersion) {
    }

    public fun weight(weight: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.VersionWeight.Builder =
        software.amazon.awscdk.services.lambda.VersionWeight.builder()

    public override fun version(version: IVersion) {
      cdkBuilder.version(version.let(IVersion::unwrap))
    }

    public override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.lambda.VersionWeight = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.VersionWeight,
  ) : VersionWeight {
    public override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)

    public override fun weight(): Number = unwrap(this).getWeight()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VersionWeight {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.VersionWeight):
        VersionWeight = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VersionWeight):
        software.amazon.awscdk.services.lambda.VersionWeight = (wrapped as Wrapper).cdkObject
  }
}
