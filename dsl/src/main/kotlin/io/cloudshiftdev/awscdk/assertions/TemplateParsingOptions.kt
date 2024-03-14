package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface TemplateParsingOptions {
  /**
   * If set to true, will skip checking for cyclical / circular dependencies.
   *
   * Should be set to false other than for
   * templates that are valid despite containing cycles, such as unprocessed transform stacks.
   *
   * Default: false
   */
  public fun skipCyclicalDependenciesCheck(): Boolean? =
      unwrap(this).getSkipCyclicalDependenciesCheck()

  /**
   * A builder for [TemplateParsingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param skipCyclicalDependenciesCheck If set to true, will skip checking for cyclical /
     * circular dependencies.
     * Should be set to false other than for
     * templates that are valid despite containing cycles, such as unprocessed transform stacks.
     */
    public fun skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.assertions.TemplateParsingOptions.Builder =
        software.amazon.awscdk.assertions.TemplateParsingOptions.builder()

    /**
     * @param skipCyclicalDependenciesCheck If set to true, will skip checking for cyclical /
     * circular dependencies.
     * Should be set to false other than for
     * templates that are valid despite containing cycles, such as unprocessed transform stacks.
     */
    override fun skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck: Boolean) {
      cdkBuilder.skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck)
    }

    public fun build(): software.amazon.awscdk.assertions.TemplateParsingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.assertions.TemplateParsingOptions,
  ) : CdkObject(cdkObject), TemplateParsingOptions {
    /**
     * If set to true, will skip checking for cyclical / circular dependencies.
     *
     * Should be set to false other than for
     * templates that are valid despite containing cycles, such as unprocessed transform stacks.
     *
     * Default: false
     */
    override fun skipCyclicalDependenciesCheck(): Boolean? =
        unwrap(this).getSkipCyclicalDependenciesCheck()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TemplateParsingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.assertions.TemplateParsingOptions):
        TemplateParsingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TemplateParsingOptions):
        software.amazon.awscdk.assertions.TemplateParsingOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.assertions.TemplateParsingOptions
  }
}
