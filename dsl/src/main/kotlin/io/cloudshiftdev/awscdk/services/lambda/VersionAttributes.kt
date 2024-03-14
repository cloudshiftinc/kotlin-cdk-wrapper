package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String
import kotlin.Unit

public interface VersionAttributes {
  public fun lambda(): IFunction

  public fun version(): String

  public interface Builder {
    public fun lambda(lambda: IFunction) {
    }

    public fun version(version: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.VersionAttributes.Builder =
        software.amazon.awscdk.services.lambda.VersionAttributes.builder()

    public override fun lambda(lambda: IFunction) {
      cdkBuilder.lambda(lambda.let(IFunction::unwrap))
    }

    public override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.lambda.VersionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.VersionAttributes,
  ) : VersionAttributes {
    public override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

    public override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VersionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.VersionAttributes):
        VersionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VersionAttributes):
        software.amazon.awscdk.services.lambda.VersionAttributes = (wrapped as Wrapper).cdkObject
  }
}
