package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ivs.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrIngestEndpoint(): String = unwrap(this).getAttrIngestEndpoint()

  public open fun attrPlaybackUrl(): String = unwrap(this).getAttrPlaybackUrl()

  public open fun authorized(): Any? = unwrap(this).getAuthorized()

  public open fun authorized(`value`: Boolean) {
    unwrap(this).setAuthorized(`value`)
  }

  public open fun authorized(`value`: IResolvable) {
    unwrap(this).setAuthorized(`value`.let(IResolvable::unwrap))
  }

  public open fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

  public open fun insecureIngest(`value`: Boolean) {
    unwrap(this).setInsecureIngest(`value`)
  }

  public open fun insecureIngest(`value`: IResolvable) {
    unwrap(this).setInsecureIngest(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun latencyMode(): String? = unwrap(this).getLatencyMode()

  public open fun latencyMode(`value`: String) {
    unwrap(this).setLatencyMode(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun preset(): String? = unwrap(this).getPreset()

  public open fun preset(`value`: String) {
    unwrap(this).setPreset(`value`)
  }

  public open fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

  public open fun recordingConfigurationArn(`value`: String) {
    unwrap(this).setRecordingConfigurationArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun authorized(authorized: Boolean)

    public fun authorized(authorized: IResolvable)

    public fun insecureIngest(insecureIngest: Boolean)

    public fun insecureIngest(insecureIngest: IResolvable)

    public fun latencyMode(latencyMode: String)

    public fun name(name: String)

    public fun preset(preset: String)

    public fun recordingConfigurationArn(recordingConfigurationArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnChannel.Builder =
        software.amazon.awscdk.services.ivs.CfnChannel.Builder.create(scope, id)

    override fun authorized(authorized: Boolean) {
      cdkBuilder.authorized(authorized)
    }

    override fun authorized(authorized: IResolvable) {
      cdkBuilder.authorized(authorized.let(IResolvable::unwrap))
    }

    override fun insecureIngest(insecureIngest: Boolean) {
      cdkBuilder.insecureIngest(insecureIngest)
    }

    override fun insecureIngest(insecureIngest: IResolvable) {
      cdkBuilder.insecureIngest(insecureIngest.let(IResolvable::unwrap))
    }

    override fun latencyMode(latencyMode: String) {
      cdkBuilder.latencyMode(latencyMode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun preset(preset: String) {
      cdkBuilder.preset(preset)
    }

    override fun recordingConfigurationArn(recordingConfigurationArn: String) {
      cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ivs.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnChannel): CfnChannel =
        CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel): software.amazon.awscdk.services.ivs.CfnChannel =
        wrapped.cdkObject
  }
}
