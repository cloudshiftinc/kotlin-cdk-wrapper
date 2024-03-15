@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisvideo

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStream internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun dataRetentionInHours(): Number? = unwrap(this).getDataRetentionInHours()

  public open fun dataRetentionInHours(`value`: Number) {
    unwrap(this).setDataRetentionInHours(`value`)
  }

  public open fun deviceName(): String? = unwrap(this).getDeviceName()

  public open fun deviceName(`value`: String) {
    unwrap(this).setDeviceName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun mediaType(): String? = unwrap(this).getMediaType()

  public open fun mediaType(`value`: String) {
    unwrap(this).setMediaType(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun dataRetentionInHours(dataRetentionInHours: Number)

    public fun deviceName(deviceName: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun mediaType(mediaType: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisvideo.CfnStream.Builder =
        software.amazon.awscdk.services.kinesisvideo.CfnStream.Builder.create(scope, id)

    override fun dataRetentionInHours(dataRetentionInHours: Number) {
      cdkBuilder.dataRetentionInHours(dataRetentionInHours)
    }

    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun mediaType(mediaType: String) {
      cdkBuilder.mediaType(mediaType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kinesisvideo.CfnStream = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisvideo.CfnStream.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnStream): CfnStream
        = CfnStream(cdkObject)

    internal fun unwrap(wrapped: CfnStream): software.amazon.awscdk.services.kinesisvideo.CfnStream
        = wrapped.cdkObject
  }
}