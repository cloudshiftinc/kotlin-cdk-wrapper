package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLiveSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediatailor.CfnLiveSource,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun httpPackageConfigurations(): Any = unwrap(this).getHttpPackageConfigurations()

  public open fun httpPackageConfigurations(`value`: IResolvable) {
    unwrap(this).setHttpPackageConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun httpPackageConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setHttpPackageConfigurations(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun liveSourceName(): String = unwrap(this).getLiveSourceName()

  public open fun liveSourceName(`value`: String) {
    unwrap(this).setLiveSourceName(`value`)
  }

  public open fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

  public open fun sourceLocationName(`value`: String) {
    unwrap(this).setSourceLocationName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable)

    public fun httpPackageConfigurations(httpPackageConfigurations: List<Any>)

    public fun liveSourceName(liveSourceName: String)

    public fun sourceLocationName(sourceLocationName: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnLiveSource.Builder =
        software.amazon.awscdk.services.mediatailor.CfnLiveSource.Builder.create(scope, id)

    override fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.let(IResolvable::unwrap))
    }

    override fun httpPackageConfigurations(httpPackageConfigurations: List<Any>) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations)
    }

    override fun liveSourceName(liveSourceName: String) {
      cdkBuilder.liveSourceName(liveSourceName)
    }

    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnLiveSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLiveSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLiveSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnLiveSource):
        CfnLiveSource = CfnLiveSource(cdkObject)

    internal fun unwrap(wrapped: CfnLiveSource):
        software.amazon.awscdk.services.mediatailor.CfnLiveSource = wrapped.cdkObject
  }

  public interface HttpPackageConfigurationProperty {
    public fun path(): String

    public fun sourceGroup(): String

    public fun type(): String

    public interface Builder {
      public fun path(path: String)

      public fun sourceGroup(sourceGroup: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnLiveSource.HttpPackageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnLiveSource.HttpPackageConfigurationProperty.builder()

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun sourceGroup(sourceGroup: String) {
        cdkBuilder.sourceGroup(sourceGroup)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnLiveSource.HttpPackageConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnLiveSource.HttpPackageConfigurationProperty,
    ) : HttpPackageConfigurationProperty {
      override fun path(): String = unwrap(this).getPath()

      override fun sourceGroup(): String = unwrap(this).getSourceGroup()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpPackageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnLiveSource.HttpPackageConfigurationProperty):
          HttpPackageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpPackageConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnLiveSource.HttpPackageConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
