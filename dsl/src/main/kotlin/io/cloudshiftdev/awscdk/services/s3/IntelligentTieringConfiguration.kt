package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface IntelligentTieringConfiguration {
  public fun archiveAccessTierTime(): Duration? =
      unwrap(this).getArchiveAccessTierTime()?.let(Duration::wrap)

  public fun deepArchiveAccessTierTime(): Duration? =
      unwrap(this).getDeepArchiveAccessTierTime()?.let(Duration::wrap)

  public fun name(): String

  public fun prefix(): String? = unwrap(this).getPrefix()

  public fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

  public interface Builder {
    public fun archiveAccessTierTime(archiveAccessTierTime: Duration)

    public fun deepArchiveAccessTierTime(deepArchiveAccessTierTime: Duration)

    public fun name(name: String)

    public fun prefix(prefix: String)

    public fun tags(tags: List<Tag>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3.IntelligentTieringConfiguration.Builder =
        software.amazon.awscdk.services.s3.IntelligentTieringConfiguration.builder()

    override fun archiveAccessTierTime(archiveAccessTierTime: Duration) {
      cdkBuilder.archiveAccessTierTime(archiveAccessTierTime.let(Duration::unwrap))
    }

    override fun deepArchiveAccessTierTime(deepArchiveAccessTierTime: Duration) {
      cdkBuilder.deepArchiveAccessTierTime(deepArchiveAccessTierTime.let(Duration::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.IntelligentTieringConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.IntelligentTieringConfiguration,
  ) : IntelligentTieringConfiguration {
    override fun archiveAccessTierTime(): Duration? =
        unwrap(this).getArchiveAccessTierTime()?.let(Duration::wrap)

    override fun deepArchiveAccessTierTime(): Duration? =
        unwrap(this).getDeepArchiveAccessTierTime()?.let(Duration::wrap)

    override fun name(): String = unwrap(this).getName()

    override fun prefix(): String? = unwrap(this).getPrefix()

    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): IntelligentTieringConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.IntelligentTieringConfiguration):
        IntelligentTieringConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IntelligentTieringConfiguration):
        software.amazon.awscdk.services.s3.IntelligentTieringConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
