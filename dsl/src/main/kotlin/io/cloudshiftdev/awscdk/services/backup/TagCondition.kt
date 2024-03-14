package io.cloudshiftdev.awscdk.services.backup

import kotlin.String
import kotlin.Unit

public interface TagCondition {
  public fun key(): String

  public fun operation(): TagOperation? = unwrap(this).getOperation()?.let(TagOperation::wrap)

  public fun `value`(): String

  public interface Builder {
    public fun key(key: String)

    public fun operation(operation: TagOperation)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.TagCondition.Builder =
        software.amazon.awscdk.services.backup.TagCondition.builder()

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun operation(operation: TagOperation) {
      cdkBuilder.operation(operation.let(TagOperation::unwrap))
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.backup.TagCondition = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.backup.TagCondition,
  ) : TagCondition {
    override fun key(): String = unwrap(this).getKey()

    override fun operation(): TagOperation? = unwrap(this).getOperation()?.let(TagOperation::wrap)

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TagCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.TagCondition): TagCondition
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagCondition): software.amazon.awscdk.services.backup.TagCondition
        = (wrapped as Wrapper).cdkObject
  }
}
