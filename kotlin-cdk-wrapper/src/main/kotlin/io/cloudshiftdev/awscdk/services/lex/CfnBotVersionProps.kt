@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnBotVersionProps {
  public fun botId(): String

  public fun botVersionLocaleSpecification(): Any

  public fun description(): String? = unwrap(this).getDescription()

  @CdkDslMarker
  public interface Builder {
    public fun botId(botId: String)

    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable)

    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: List<Any>)

    public fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any)

    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotVersionProps.Builder =
        software.amazon.awscdk.services.lex.CfnBotVersionProps.builder()

    override fun botId(botId: String) {
      cdkBuilder.botId(botId)
    }

    override fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable) {
      cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification.let(IResolvable::unwrap))
    }

    override fun botVersionLocaleSpecification(botVersionLocaleSpecification: List<Any>) {
      cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification)
    }

    override fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any): Unit =
        botVersionLocaleSpecification(botVersionLocaleSpecification.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBotVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lex.CfnBotVersionProps,
  ) : CdkObject(cdkObject), CfnBotVersionProps {
    override fun botId(): String = unwrap(this).getBotId()

    override fun botVersionLocaleSpecification(): Any =
        unwrap(this).getBotVersionLocaleSpecification()

    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBotVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotVersionProps):
        CfnBotVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBotVersionProps):
        software.amazon.awscdk.services.lex.CfnBotVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lex.CfnBotVersionProps
  }
}
