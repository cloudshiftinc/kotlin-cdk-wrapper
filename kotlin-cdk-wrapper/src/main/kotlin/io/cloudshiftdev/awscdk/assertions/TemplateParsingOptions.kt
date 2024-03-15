@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.assertions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface TemplateParsingOptions {
  public fun skipCyclicalDependenciesCheck(): Boolean? =
      unwrap(this).getSkipCyclicalDependenciesCheck()

  @CdkDslMarker
  public interface Builder {
    public fun skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.assertions.TemplateParsingOptions.Builder =
        software.amazon.awscdk.assertions.TemplateParsingOptions.builder()

    override fun skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck: Boolean) {
      cdkBuilder.skipCyclicalDependenciesCheck(skipCyclicalDependenciesCheck)
    }

    public fun build(): software.amazon.awscdk.assertions.TemplateParsingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.assertions.TemplateParsingOptions,
  ) : CdkObject(cdkObject), TemplateParsingOptions {
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
