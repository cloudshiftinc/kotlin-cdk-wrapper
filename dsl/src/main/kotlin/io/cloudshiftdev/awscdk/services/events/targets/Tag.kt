package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface Tag {
  /**
   * Key is the name of the tag.
   */
  public fun key(): String

  /**
   * Value is the metadata contents of the tag.
   */
  public fun `value`(): String

  /**
   * A builder for [Tag]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key Key is the name of the tag. 
     */
    public fun key(key: String)

    /**
     * @param value Value is the metadata contents of the tag. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.Tag.Builder =
        software.amazon.awscdk.services.events.targets.Tag.builder()

    /**
     * @param key Key is the name of the tag. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value Value is the metadata contents of the tag. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.Tag = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.targets.Tag,
  ) : Tag {
    /**
     * Key is the name of the tag.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * Value is the metadata contents of the tag.
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Tag {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.Tag): Tag =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Tag): software.amazon.awscdk.services.events.targets.Tag = (wrapped
        as Wrapper).cdkObject
  }
}
