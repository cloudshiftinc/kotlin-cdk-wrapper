package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.xray.CfnGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrGroupArn(): String = unwrap(this).getAttrGroupArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun filterExpression(): String? = unwrap(this).getFilterExpression()

  public open fun filterExpression(`value`: String) {
    unwrap(this).setFilterExpression(`value`)
  }

  public open fun groupName(): String = unwrap(this).getGroupName()

  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  public open fun insightsConfiguration(): Any? = unwrap(this).getInsightsConfiguration()

  public open fun insightsConfiguration(`value`: IResolvable) {
    unwrap(this).setInsightsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun insightsConfiguration(`value`: InsightsConfigurationProperty) {
    unwrap(this).setInsightsConfiguration(`value`.let(InsightsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e7a1b1ee0c528a291571125f084fe3f352b6eee004c646e010cd75b4d911253")
  public open fun insightsConfiguration(`value`: InsightsConfigurationProperty.Builder.() -> Unit):
      Unit = insightsConfiguration(InsightsConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun filterExpression(filterExpression: String) {
    }

    public fun groupName(groupName: String) {
    }

    public fun insightsConfiguration(insightsConfiguration: IResolvable) {
    }

    public fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e14f6cec07b18027436bd71c2f8cbcc7699546fea0b70fd3021cfc68390e860")
    public
        fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnGroup.Builder =
        software.amazon.awscdk.services.xray.CfnGroup.Builder.create(scope, id)

    public override fun filterExpression(filterExpression: String) {
      cdkBuilder.filterExpression(filterExpression)
    }

    public override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    public override fun insightsConfiguration(insightsConfiguration: IResolvable) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(InsightsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e14f6cec07b18027436bd71c2f8cbcc7699546fea0b70fd3021cfc68390e860")
    public override
        fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty.Builder.() -> Unit):
        Unit = insightsConfiguration(InsightsConfigurationProperty(insightsConfiguration))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.xray.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.xray.CfnGroup =
        wrapped.cdkObject
  }

  public interface InsightsConfigurationProperty {
    public fun insightsEnabled(): Any? = unwrap(this).getInsightsEnabled()

    public fun notificationsEnabled(): Any? = unwrap(this).getNotificationsEnabled()

    public interface Builder {
      public fun insightsEnabled(insightsEnabled: Boolean) {
      }

      public fun insightsEnabled(insightsEnabled: IResolvable) {
      }

      public fun notificationsEnabled(notificationsEnabled: Boolean) {
      }

      public fun notificationsEnabled(notificationsEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty.Builder =
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty.builder()

      public override fun insightsEnabled(insightsEnabled: Boolean) {
        cdkBuilder.insightsEnabled(insightsEnabled)
      }

      public override fun insightsEnabled(insightsEnabled: IResolvable) {
        cdkBuilder.insightsEnabled(insightsEnabled.let(IResolvable::unwrap))
      }

      public override fun notificationsEnabled(notificationsEnabled: Boolean) {
        cdkBuilder.notificationsEnabled(notificationsEnabled)
      }

      public override fun notificationsEnabled(notificationsEnabled: IResolvable) {
        cdkBuilder.notificationsEnabled(notificationsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty,
    ) : InsightsConfigurationProperty {
      public override fun insightsEnabled(): Any? = unwrap(this).getInsightsEnabled()

      public override fun notificationsEnabled(): Any? = unwrap(this).getNotificationsEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InsightsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty):
          InsightsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InsightsConfigurationProperty):
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
