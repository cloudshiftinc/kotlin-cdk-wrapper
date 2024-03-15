@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisvideo

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnStreamProps {
  public fun dataRetentionInHours(): Number? = unwrap(this).getDataRetentionInHours()

  public fun deviceName(): String? = unwrap(this).getDeviceName()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun mediaType(): String? = unwrap(this).getMediaType()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisvideo.CfnStreamProps.Builder =
        software.amazon.awscdk.services.kinesisvideo.CfnStreamProps.builder()

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

    public fun build(): software.amazon.awscdk.services.kinesisvideo.CfnStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnStreamProps,
  ) : CdkObject(cdkObject), CfnStreamProps {
    override fun dataRetentionInHours(): Number? = unwrap(this).getDataRetentionInHours()

    override fun deviceName(): String? = unwrap(this).getDeviceName()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun mediaType(): String? = unwrap(this).getMediaType()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisvideo.CfnStreamProps):
        CfnStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamProps):
        software.amazon.awscdk.services.kinesisvideo.CfnStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisvideo.CfnStreamProps
  }
}
