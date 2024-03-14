package io.cloudshiftdev.awscdk.services.events

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface RuleTargetInputProperties {
  public fun input(): String? = unwrap(this).getInput()

  public fun inputPath(): String? = unwrap(this).getInputPath()

  public fun inputPathsMap(): Map<String, String> = unwrap(this).getInputPathsMap() ?: emptyMap()

  public fun inputTemplate(): String? = unwrap(this).getInputTemplate()

  public interface Builder {
    public fun input(input: String)

    public fun inputPath(inputPath: String)

    public fun inputPathsMap(inputPathsMap: Map<String, String>)

    public fun inputTemplate(inputTemplate: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.RuleTargetInputProperties.Builder
        = software.amazon.awscdk.services.events.RuleTargetInputProperties.builder()

    override fun input(input: String) {
      cdkBuilder.input(input)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun inputPathsMap(inputPathsMap: Map<String, String>) {
      cdkBuilder.inputPathsMap(inputPathsMap)
    }

    override fun inputTemplate(inputTemplate: String) {
      cdkBuilder.inputTemplate(inputTemplate)
    }

    public fun build(): software.amazon.awscdk.services.events.RuleTargetInputProperties =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.RuleTargetInputProperties,
  ) : RuleTargetInputProperties {
    override fun input(): String? = unwrap(this).getInput()

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun inputPathsMap(): Map<String, String> = unwrap(this).getInputPathsMap() ?:
        emptyMap()

    override fun inputTemplate(): String? = unwrap(this).getInputTemplate()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RuleTargetInputProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleTargetInputProperties):
        RuleTargetInputProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleTargetInputProperties):
        software.amazon.awscdk.services.events.RuleTargetInputProperties = (wrapped as
        Wrapper).cdkObject
  }
}
