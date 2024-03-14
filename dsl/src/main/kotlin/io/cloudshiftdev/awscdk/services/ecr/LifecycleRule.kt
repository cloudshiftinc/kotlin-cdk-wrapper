package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LifecycleRule {
  public fun description(): String? = unwrap(this).getDescription()

  public fun maxImageAge(): Duration? = unwrap(this).getMaxImageAge()?.let(Duration::wrap)

  public fun maxImageCount(): Number? = unwrap(this).getMaxImageCount()

  public fun rulePriority(): Number? = unwrap(this).getRulePriority()

  public fun tagPatternList(): List<String> = unwrap(this).getTagPatternList() ?: emptyList()

  public fun tagPrefixList(): List<String> = unwrap(this).getTagPrefixList() ?: emptyList()

  public fun tagStatus(): TagStatus? = unwrap(this).getTagStatus()?.let(TagStatus::wrap)

  public interface Builder {
    public fun description(description: String) {
    }

    public fun maxImageAge(maxImageAge: Duration) {
    }

    public fun maxImageCount(maxImageCount: Number) {
    }

    public fun rulePriority(rulePriority: Number) {
    }

    public fun tagPatternList(tagPatternList: List<String>) {
    }

    public fun tagPrefixList(tagPrefixList: List<String>) {
    }

    public fun tagStatus(tagStatus: TagStatus) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.LifecycleRule.Builder =
        software.amazon.awscdk.services.ecr.LifecycleRule.builder()

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun maxImageAge(maxImageAge: Duration) {
      cdkBuilder.maxImageAge(maxImageAge.let(Duration::unwrap))
    }

    public override fun maxImageCount(maxImageCount: Number) {
      cdkBuilder.maxImageCount(maxImageCount)
    }

    public override fun rulePriority(rulePriority: Number) {
      cdkBuilder.rulePriority(rulePriority)
    }

    public override fun tagPatternList(tagPatternList: List<String>) {
      cdkBuilder.tagPatternList(tagPatternList)
    }

    public override fun tagPrefixList(tagPrefixList: List<String>) {
      cdkBuilder.tagPrefixList(tagPrefixList)
    }

    public override fun tagStatus(tagStatus: TagStatus) {
      cdkBuilder.tagStatus(tagStatus.let(TagStatus::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecr.LifecycleRule = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecr.LifecycleRule,
  ) : LifecycleRule {
    public override fun description(): String? = unwrap(this).getDescription()

    public override fun maxImageAge(): Duration? =
        unwrap(this).getMaxImageAge()?.let(Duration::wrap)

    public override fun maxImageCount(): Number? = unwrap(this).getMaxImageCount()

    public override fun rulePriority(): Number? = unwrap(this).getRulePriority()

    public override fun tagPatternList(): List<String> = unwrap(this).getTagPatternList() ?:
        emptyList()

    public override fun tagPrefixList(): List<String> = unwrap(this).getTagPrefixList() ?:
        emptyList()

    public override fun tagStatus(): TagStatus? = unwrap(this).getTagStatus()?.let(TagStatus::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.LifecycleRule): LifecycleRule =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LifecycleRule): software.amazon.awscdk.services.ecr.LifecycleRule =
        (wrapped as Wrapper).cdkObject
  }
}
