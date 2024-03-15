@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEventTypeProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun entityTypes(): Any

  public fun eventVariables(): Any

  public fun labels(): Any

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun entityTypes(entityTypes: IResolvable)

    public fun entityTypes(entityTypes: List<Any>)

    public fun entityTypes(vararg entityTypes: Any)

    public fun eventVariables(eventVariables: IResolvable)

    public fun eventVariables(eventVariables: List<Any>)

    public fun eventVariables(vararg eventVariables: Any)

    public fun labels(labels: IResolvable)

    public fun labels(labels: List<Any>)

    public fun labels(vararg labels: Any)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnEventTypeProps.Builder
        = software.amazon.awscdk.services.frauddetector.CfnEventTypeProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun entityTypes(entityTypes: IResolvable) {
      cdkBuilder.entityTypes(entityTypes.let(IResolvable::unwrap))
    }

    override fun entityTypes(entityTypes: List<Any>) {
      cdkBuilder.entityTypes(entityTypes)
    }

    override fun entityTypes(vararg entityTypes: Any): Unit = entityTypes(entityTypes.toList())

    override fun eventVariables(eventVariables: IResolvable) {
      cdkBuilder.eventVariables(eventVariables.let(IResolvable::unwrap))
    }

    override fun eventVariables(eventVariables: List<Any>) {
      cdkBuilder.eventVariables(eventVariables)
    }

    override fun eventVariables(vararg eventVariables: Any): Unit =
        eventVariables(eventVariables.toList())

    override fun labels(labels: IResolvable) {
      cdkBuilder.labels(labels.let(IResolvable::unwrap))
    }

    override fun labels(labels: List<Any>) {
      cdkBuilder.labels(labels)
    }

    override fun labels(vararg labels: Any): Unit = labels(labels.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnEventTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventTypeProps,
  ) : CdkObject(cdkObject), CfnEventTypeProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun entityTypes(): Any = unwrap(this).getEntityTypes()

    override fun eventVariables(): Any = unwrap(this).getEventVariables()

    override fun labels(): Any = unwrap(this).getLabels()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEventTypeProps):
        CfnEventTypeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventTypeProps):
        software.amazon.awscdk.services.frauddetector.CfnEventTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnEventTypeProps
  }
}
