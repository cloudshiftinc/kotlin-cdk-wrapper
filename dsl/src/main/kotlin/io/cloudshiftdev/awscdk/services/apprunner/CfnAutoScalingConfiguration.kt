package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAutoScalingConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrAutoScalingConfigurationArn(): String =
      unwrap(this).getAttrAutoScalingConfigurationArn()

  public open fun attrAutoScalingConfigurationRevision(): Number =
      unwrap(this).getAttrAutoScalingConfigurationRevision()

  public open fun attrLatest(): IResolvable = unwrap(this).getAttrLatest().let(IResolvable::wrap)

  public open fun autoScalingConfigurationName(): String? =
      unwrap(this).getAutoScalingConfigurationName()

  public open fun autoScalingConfigurationName(`value`: String) {
    unwrap(this).setAutoScalingConfigurationName(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxConcurrency(): Number? = unwrap(this).getMaxConcurrency()

  public open fun maxConcurrency(`value`: Number) {
    unwrap(this).setMaxConcurrency(`value`)
  }

  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  public open fun maxSize(`value`: Number) {
    unwrap(this).setMaxSize(`value`)
  }

  public open fun minSize(): Number? = unwrap(this).getMinSize()

  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
    }

    public fun maxConcurrency(maxConcurrency: Number) {
    }

    public fun maxSize(maxSize: Number) {
    }

    public fun minSize(minSize: Number) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration.Builder =
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration.Builder.create(scope,
        id)

    public override fun autoScalingConfigurationName(autoScalingConfigurationName: String) {
      cdkBuilder.autoScalingConfigurationName(autoScalingConfigurationName)
    }

    public override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    public override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    public override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAutoScalingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAutoScalingConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration):
        CfnAutoScalingConfiguration = CfnAutoScalingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingConfiguration):
        software.amazon.awscdk.services.apprunner.CfnAutoScalingConfiguration = wrapped.cdkObject
  }
}
