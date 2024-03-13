package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface CfnTag {
  public fun key(): String

  public fun `value`(): String

  public interface Builder {
    public fun key(key: String) {
    }

    public fun `value`(`value`: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTag.Builder =
        software.amazon.awscdk.CfnTag.builder()

    public override fun key(key: String) {
      cdkBuilder.key(key)
    }

    public override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.CfnTag = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnTag,
  ) : CfnTag {
    public override fun key(): String = unwrap(this).getKey()

    public override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTag): CfnTag = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTag): software.amazon.awscdk.CfnTag = (wrapped as
        Wrapper).cdkObject
  }
}
