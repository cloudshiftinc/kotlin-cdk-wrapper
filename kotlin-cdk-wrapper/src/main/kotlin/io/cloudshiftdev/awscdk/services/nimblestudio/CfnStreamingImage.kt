@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStreamingImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrEncryptionConfiguration(): IResolvable =
      unwrap(this).getAttrEncryptionConfiguration().let(IResolvable::wrap)

  public open fun attrEncryptionConfigurationKeyArn(): String =
      unwrap(this).getAttrEncryptionConfigurationKeyArn()

  public open fun attrEncryptionConfigurationKeyType(): String =
      unwrap(this).getAttrEncryptionConfigurationKeyType()

  public open fun attrEulaIds(): List<String> = unwrap(this).getAttrEulaIds()

  public open fun attrOwner(): String = unwrap(this).getAttrOwner()

  public open fun attrPlatform(): String = unwrap(this).getAttrPlatform()

  public open fun attrStreamingImageId(): String = unwrap(this).getAttrStreamingImageId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun ec2ImageId(): String = unwrap(this).getEc2ImageId()

  public open fun ec2ImageId(`value`: String) {
    unwrap(this).setEc2ImageId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun studioId(): String = unwrap(this).getStudioId()

  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun ec2ImageId(ec2ImageId: String)

    public fun name(name: String)

    public fun studioId(studioId: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ec2ImageId(ec2ImageId: String) {
      cdkBuilder.ec2ImageId(ec2ImageId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStreamingImage =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStreamingImage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStreamingImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage):
        CfnStreamingImage = CfnStreamingImage(cdkObject)

    internal fun unwrap(wrapped: CfnStreamingImage):
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImage = wrapped.cdkObject
  }

  public interface StreamingImageEncryptionConfigurationProperty {
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    public fun keyType(): String

    @CdkDslMarker
    public interface Builder {
      public fun keyArn(keyArn: String)

      public fun keyType(keyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty.builder()

      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), StreamingImageEncryptionConfigurationProperty {
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamingImageEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty):
          StreamingImageEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingImageEncryptionConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.nimblestudio.CfnStreamingImage.StreamingImageEncryptionConfigurationProperty
    }
  }
}
