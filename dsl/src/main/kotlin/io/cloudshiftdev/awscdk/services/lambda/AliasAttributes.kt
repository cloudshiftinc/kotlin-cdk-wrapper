package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String
import kotlin.Unit

public interface AliasAttributes {
  public fun aliasName(): String

  public fun aliasVersion(): IVersion

  public interface Builder {
    public fun aliasName(aliasName: String) {
    }

    public fun aliasVersion(aliasVersion: IVersion) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AliasAttributes.Builder =
        software.amazon.awscdk.services.lambda.AliasAttributes.builder()

    public override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    public override fun aliasVersion(aliasVersion: IVersion) {
      cdkBuilder.aliasVersion(aliasVersion.let(IVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.AliasAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.AliasAttributes,
  ) : AliasAttributes {
    public override fun aliasName(): String = unwrap(this).getAliasName()

    public override fun aliasVersion(): IVersion =
        unwrap(this).getAliasVersion().let(IVersion::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AliasAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AliasAttributes):
        AliasAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasAttributes):
        software.amazon.awscdk.services.lambda.AliasAttributes = (wrapped as Wrapper).cdkObject
  }
}
