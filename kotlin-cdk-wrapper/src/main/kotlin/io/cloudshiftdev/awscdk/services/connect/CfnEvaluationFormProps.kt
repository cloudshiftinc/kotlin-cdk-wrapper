@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEvaluationFormProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceArn(): String

  public fun items(): Any

  public fun scoringStrategy(): Any? = unwrap(this).getScoringStrategy()

  public fun status(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun title(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun items(items: IResolvable)

    public fun items(items: List<Any>)

    public fun items(vararg items: Any)

    public fun scoringStrategy(scoringStrategy: IResolvable)

    public fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0472134355e2ed226a8c7cbd437aa008aca38dbb991bc49b5ec0a01280d7effb")
    public
        fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty.Builder.() -> Unit)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun title(title: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnEvaluationFormProps.Builder =
        software.amazon.awscdk.services.connect.CfnEvaluationFormProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun items(items: IResolvable) {
      cdkBuilder.items(items.let(IResolvable::unwrap))
    }

    override fun items(items: List<Any>) {
      cdkBuilder.items(items)
    }

    override fun items(vararg items: Any): Unit = items(items.toList())

    override fun scoringStrategy(scoringStrategy: IResolvable) {
      cdkBuilder.scoringStrategy(scoringStrategy.let(IResolvable::unwrap))
    }

    override fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty) {
      cdkBuilder.scoringStrategy(scoringStrategy.let(CfnEvaluationForm.ScoringStrategyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0472134355e2ed226a8c7cbd437aa008aca38dbb991bc49b5ec0a01280d7effb")
    override
        fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty.Builder.() -> Unit):
        Unit = scoringStrategy(CfnEvaluationForm.ScoringStrategyProperty(scoringStrategy))

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnEvaluationFormProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationFormProps,
  ) : CdkObject(cdkObject), CfnEvaluationFormProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun items(): Any = unwrap(this).getItems()

    override fun scoringStrategy(): Any? = unwrap(this).getScoringStrategy()

    override fun status(): String = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun title(): String = unwrap(this).getTitle()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEvaluationFormProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationFormProps):
        CfnEvaluationFormProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEvaluationFormProps):
        software.amazon.awscdk.services.connect.CfnEvaluationFormProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnEvaluationFormProps
  }
}
