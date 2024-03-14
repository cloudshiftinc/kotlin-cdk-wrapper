package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnObservabilityConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLatest(): IResolvable = unwrap(this).getAttrLatest().let(IResolvable::wrap)

  public open fun attrObservabilityConfigurationArn(): String =
      unwrap(this).getAttrObservabilityConfigurationArn()

  public open fun attrObservabilityConfigurationRevision(): Number =
      unwrap(this).getAttrObservabilityConfigurationRevision()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun observabilityConfigurationName(): String? =
      unwrap(this).getObservabilityConfigurationName()

  public open fun observabilityConfigurationName(`value`: String) {
    unwrap(this).setObservabilityConfigurationName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun traceConfiguration(): Any? = unwrap(this).getTraceConfiguration()

  public open fun traceConfiguration(`value`: IResolvable) {
    unwrap(this).setTraceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun traceConfiguration(`value`: TraceConfigurationProperty) {
    unwrap(this).setTraceConfiguration(`value`.let(TraceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cee5a56d6d4eb5726d4660dd0d93b4937a33ef2bf9f6477d7e23462730e4df91")
  public open fun traceConfiguration(`value`: TraceConfigurationProperty.Builder.() -> Unit): Unit =
      traceConfiguration(TraceConfigurationProperty(`value`))

  public interface Builder {
    public fun observabilityConfigurationName(observabilityConfigurationName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun traceConfiguration(traceConfiguration: IResolvable)

    public fun traceConfiguration(traceConfiguration: TraceConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7028513f5636ee1f40f285706d70135ba1109f4834c25920aef1e17a17fd7638")
    public fun traceConfiguration(traceConfiguration: TraceConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.Builder =
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.Builder.create(scope,
        id)

    override fun observabilityConfigurationName(observabilityConfigurationName: String) {
      cdkBuilder.observabilityConfigurationName(observabilityConfigurationName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun traceConfiguration(traceConfiguration: IResolvable) {
      cdkBuilder.traceConfiguration(traceConfiguration.let(IResolvable::unwrap))
    }

    override fun traceConfiguration(traceConfiguration: TraceConfigurationProperty) {
      cdkBuilder.traceConfiguration(traceConfiguration.let(TraceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7028513f5636ee1f40f285706d70135ba1109f4834c25920aef1e17a17fd7638")
    override
        fun traceConfiguration(traceConfiguration: TraceConfigurationProperty.Builder.() -> Unit):
        Unit = traceConfiguration(TraceConfigurationProperty(traceConfiguration))

    public fun build(): software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnObservabilityConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnObservabilityConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration):
        CfnObservabilityConfiguration = CfnObservabilityConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnObservabilityConfiguration):
        software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration = wrapped.cdkObject
  }

  public interface TraceConfigurationProperty {
    public fun vendor(): String

    public interface Builder {
      public fun vendor(vendor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty.builder()

      override fun vendor(vendor: String) {
        cdkBuilder.vendor(vendor)
      }

      public fun build():
          software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty,
    ) : TraceConfigurationProperty {
      override fun vendor(): String = unwrap(this).getVendor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TraceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty):
          TraceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TraceConfigurationProperty):
          software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration.TraceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
