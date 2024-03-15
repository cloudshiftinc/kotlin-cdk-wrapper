@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGroupProps {
  public fun filterExpression(): String? = unwrap(this).getFilterExpression()

  public fun groupName(): String

  public fun insightsConfiguration(): Any? = unwrap(this).getInsightsConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun filterExpression(filterExpression: String)

    public fun groupName(groupName: String)

    public fun insightsConfiguration(insightsConfiguration: IResolvable)

    public fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f688e96f135b85484005cdd9f1b4e254c33776f7c9c31d5524c29e661cd007d")
    public
        fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnGroupProps.Builder =
        software.amazon.awscdk.services.xray.CfnGroupProps.builder()

    override fun filterExpression(filterExpression: String) {
      cdkBuilder.filterExpression(filterExpression)
    }

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun insightsConfiguration(insightsConfiguration: IResolvable) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(CfnGroup.InsightsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f688e96f135b85484005cdd9f1b4e254c33776f7c9c31d5524c29e661cd007d")
    override
        fun insightsConfiguration(insightsConfiguration: CfnGroup.InsightsConfigurationProperty.Builder.() -> Unit):
        Unit = insightsConfiguration(CfnGroup.InsightsConfigurationProperty(insightsConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.xray.CfnGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.xray.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    override fun filterExpression(): String? = unwrap(this).getFilterExpression()

    override fun groupName(): String = unwrap(this).getGroupName()

    override fun insightsConfiguration(): Any? = unwrap(this).getInsightsConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnGroupProps): CfnGroupProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps): software.amazon.awscdk.services.xray.CfnGroupProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.xray.CfnGroupProps
  }
}
