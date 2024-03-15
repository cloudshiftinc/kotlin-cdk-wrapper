@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFeatureProps {
  public fun defaultVariation(): String? = unwrap(this).getDefaultVariation()

  public fun description(): String? = unwrap(this).getDescription()

  public fun entityOverrides(): Any? = unwrap(this).getEntityOverrides()

  public fun evaluationStrategy(): String? = unwrap(this).getEvaluationStrategy()

  public fun name(): String

  public fun project(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun variations(): Any

  @CdkDslMarker
  public interface Builder {
    public fun defaultVariation(defaultVariation: String)

    public fun description(description: String)

    public fun entityOverrides(entityOverrides: IResolvable)

    public fun entityOverrides(entityOverrides: List<Any>)

    public fun entityOverrides(vararg entityOverrides: Any)

    public fun evaluationStrategy(evaluationStrategy: String)

    public fun name(name: String)

    public fun project(project: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun variations(variations: IResolvable)

    public fun variations(variations: List<Any>)

    public fun variations(vararg variations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnFeatureProps.Builder =
        software.amazon.awscdk.services.evidently.CfnFeatureProps.builder()

    override fun defaultVariation(defaultVariation: String) {
      cdkBuilder.defaultVariation(defaultVariation)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun entityOverrides(entityOverrides: IResolvable) {
      cdkBuilder.entityOverrides(entityOverrides.let(IResolvable::unwrap))
    }

    override fun entityOverrides(entityOverrides: List<Any>) {
      cdkBuilder.entityOverrides(entityOverrides)
    }

    override fun entityOverrides(vararg entityOverrides: Any): Unit =
        entityOverrides(entityOverrides.toList())

    override fun evaluationStrategy(evaluationStrategy: String) {
      cdkBuilder.evaluationStrategy(evaluationStrategy)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun project(project: String) {
      cdkBuilder.project(project)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun variations(variations: IResolvable) {
      cdkBuilder.variations(variations.let(IResolvable::unwrap))
    }

    override fun variations(variations: List<Any>) {
      cdkBuilder.variations(variations)
    }

    override fun variations(vararg variations: Any): Unit = variations(variations.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnFeatureProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.evidently.CfnFeatureProps,
  ) : CdkObject(cdkObject), CfnFeatureProps {
    override fun defaultVariation(): String? = unwrap(this).getDefaultVariation()

    override fun description(): String? = unwrap(this).getDescription()

    override fun entityOverrides(): Any? = unwrap(this).getEntityOverrides()

    override fun evaluationStrategy(): String? = unwrap(this).getEvaluationStrategy()

    override fun name(): String = unwrap(this).getName()

    override fun project(): String = unwrap(this).getProject()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun variations(): Any = unwrap(this).getVariations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFeatureProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnFeatureProps):
        CfnFeatureProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFeatureProps):
        software.amazon.awscdk.services.evidently.CfnFeatureProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.evidently.CfnFeatureProps
  }
}
