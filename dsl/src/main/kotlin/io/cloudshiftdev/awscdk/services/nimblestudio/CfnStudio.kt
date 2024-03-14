package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStudio internal constructor(
  private val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudio,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun adminRoleArn(): String = unwrap(this).getAdminRoleArn()

  public open fun adminRoleArn(`value`: String) {
    unwrap(this).setAdminRoleArn(`value`)
  }

  public open fun attrHomeRegion(): String = unwrap(this).getAttrHomeRegion()

  public open fun attrSsoClientId(): String = unwrap(this).getAttrSsoClientId()

  public open fun attrStudioId(): String = unwrap(this).getAttrStudioId()

  public open fun attrStudioUrl(): String = unwrap(this).getAttrStudioUrl()

  public open fun displayName(): String = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun studioEncryptionConfiguration(): Any? =
      unwrap(this).getStudioEncryptionConfiguration()

  public open fun studioEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setStudioEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun studioEncryptionConfiguration(`value`: StudioEncryptionConfigurationProperty) {
    unwrap(this).setStudioEncryptionConfiguration(`value`.let(StudioEncryptionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dcbcad26b4f26f6724978b3351a27a58963a1c98c1b0d99212bf363d8962cbcf")
  public open
      fun studioEncryptionConfiguration(`value`: StudioEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = studioEncryptionConfiguration(StudioEncryptionConfigurationProperty(`value`))

  public open fun studioName(): String = unwrap(this).getStudioName()

  public open fun studioName(`value`: String) {
    unwrap(this).setStudioName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun userRoleArn(): String = unwrap(this).getUserRoleArn()

  public open fun userRoleArn(`value`: String) {
    unwrap(this).setUserRoleArn(`value`)
  }

  public interface Builder {
    public fun adminRoleArn(adminRoleArn: String) {
    }

    public fun displayName(displayName: String) {
    }

    public fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
    }

    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b39d51f74ed1bc0402515f97fa20ac5d1f08014ef753f0669fa829fbbdfc4e5e")
    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty.Builder.() -> Unit) {
    }

    public fun studioName(studioName: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun userRoleArn(userRoleArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnStudio.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStudio.Builder.create(scope, id)

    public override fun adminRoleArn(adminRoleArn: String) {
      cdkBuilder.adminRoleArn(adminRoleArn)
    }

    public override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public override fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(StudioEncryptionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b39d51f74ed1bc0402515f97fa20ac5d1f08014ef753f0669fa829fbbdfc4e5e")
    public override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: StudioEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        studioEncryptionConfiguration(StudioEncryptionConfigurationProperty(studioEncryptionConfiguration))

    public override fun studioName(studioName: String) {
      cdkBuilder.studioName(studioName)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun userRoleArn(userRoleArn: String) {
      cdkBuilder.userRoleArn(userRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudio = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStudio {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStudio(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudio): CfnStudio
        = CfnStudio(cdkObject)

    internal fun unwrap(wrapped: CfnStudio): software.amazon.awscdk.services.nimblestudio.CfnStudio
        = wrapped.cdkObject
  }

  public interface StudioEncryptionConfigurationProperty {
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    public fun keyType(): String

    public interface Builder {
      public fun keyArn(keyArn: String) {
      }

      public fun keyType(keyType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty.builder()

      public override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      public override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public fun build():
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty,
    ) : StudioEncryptionConfigurationProperty {
      public override fun keyArn(): String? = unwrap(this).getKeyArn()

      public override fun keyType(): String = unwrap(this).getKeyType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StudioEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty):
          StudioEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StudioEncryptionConfigurationProperty):
          software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
