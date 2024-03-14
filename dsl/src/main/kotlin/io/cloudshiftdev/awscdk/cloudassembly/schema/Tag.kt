package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface Tag {
  public fun key(): String

  public fun `value`(): String

  public interface Builder {
    public fun key(key: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.Tag.Builder =
        software.amazon.awscdk.cloudassembly.schema.Tag.builder()

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.Tag = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.Tag,
  ) : Tag {
    override fun key(): String = unwrap(this).getKey()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Tag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.Tag): Tag =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Tag): software.amazon.awscdk.cloudassembly.schema.Tag = (wrapped as
        Wrapper).cdkObject
  }
}
