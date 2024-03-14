package io.cloudshiftdev.awscdk.services.servicecatalog

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface TagUpdateConstraintOptions : CommonConstraintOptions {
  public fun allow(): Boolean? = unwrap(this).getAllow()

  public interface Builder {
    public fun allow(allow: Boolean)

    public fun description(description: String)

    public fun messageLanguage(messageLanguage: MessageLanguage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions.Builder =
        software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions.builder()

    override fun allow(allow: Boolean) {
      cdkBuilder.allow(allow)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun messageLanguage(messageLanguage: MessageLanguage) {
      cdkBuilder.messageLanguage(messageLanguage.let(MessageLanguage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions,
  ) : TagUpdateConstraintOptions {
    override fun allow(): Boolean? = unwrap(this).getAllow()

    override fun description(): String? = unwrap(this).getDescription()

    override fun messageLanguage(): MessageLanguage? =
        unwrap(this).getMessageLanguage()?.let(MessageLanguage::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TagUpdateConstraintOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions):
        TagUpdateConstraintOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagUpdateConstraintOptions):
        software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions = (wrapped as
        Wrapper).cdkObject
  }
}
