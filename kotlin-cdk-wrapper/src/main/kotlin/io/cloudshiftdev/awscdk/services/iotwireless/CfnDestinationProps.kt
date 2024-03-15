@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDestinationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun expression(): String

  public fun expressionType(): String

  public fun name(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun expression(expression: String)

    public fun expressionType(expressionType: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnDestinationProps.Builder
        = software.amazon.awscdk.services.iotwireless.CfnDestinationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun expression(expression: String) {
      cdkBuilder.expression(expression)
    }

    override fun expressionType(expressionType: String) {
      cdkBuilder.expressionType(expressionType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnDestinationProps,
  ) : CdkObject(cdkObject), CfnDestinationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun expression(): String = unwrap(this).getExpression()

    override fun expressionType(): String = unwrap(this).getExpressionType()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnDestinationProps):
        CfnDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDestinationProps):
        software.amazon.awscdk.services.iotwireless.CfnDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnDestinationProps
  }
}
