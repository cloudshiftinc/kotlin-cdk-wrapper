@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnWorkflowProps {
  public fun defaultRunProperties(): Any? = unwrap(this).getDefaultRunProperties()

  public fun description(): String? = unwrap(this).getDescription()

  public fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun defaultRunProperties(defaultRunProperties: Any)

    public fun description(description: String)

    public fun maxConcurrentRuns(maxConcurrentRuns: Number)

    public fun name(name: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnWorkflowProps.Builder =
        software.amazon.awscdk.services.glue.CfnWorkflowProps.builder()

    override fun defaultRunProperties(defaultRunProperties: Any) {
      cdkBuilder.defaultRunProperties(defaultRunProperties)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun maxConcurrentRuns(maxConcurrentRuns: Number) {
      cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnWorkflowProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnWorkflowProps,
  ) : CdkObject(cdkObject), CfnWorkflowProps {
    override fun defaultRunProperties(): Any? = unwrap(this).getDefaultRunProperties()

    override fun description(): String? = unwrap(this).getDescription()

    override fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnWorkflowProps):
        CfnWorkflowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowProps):
        software.amazon.awscdk.services.glue.CfnWorkflowProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnWorkflowProps
  }
}
