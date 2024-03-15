@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPackage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.panorama.CfnPackage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): Number = unwrap(this).getAttrCreatedTime()

  public open fun attrPackageId(): String = unwrap(this).getAttrPackageId()

  public open fun attrStorageLocationBinaryPrefixLocation(): String =
      unwrap(this).getAttrStorageLocationBinaryPrefixLocation()

  public open fun attrStorageLocationBucket(): String = unwrap(this).getAttrStorageLocationBucket()

  public open fun attrStorageLocationGeneratedPrefixLocation(): String =
      unwrap(this).getAttrStorageLocationGeneratedPrefixLocation()

  public open fun attrStorageLocationManifestPrefixLocation(): String =
      unwrap(this).getAttrStorageLocationManifestPrefixLocation()

  public open fun attrStorageLocationRepoPrefixLocation(): String =
      unwrap(this).getAttrStorageLocationRepoPrefixLocation()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun packageName(): String = unwrap(this).getPackageName()

  public open fun packageName(`value`: String) {
    unwrap(this).setPackageName(`value`)
  }

  public open fun storageLocation(): Any? = unwrap(this).getStorageLocation()

  public open fun storageLocation(`value`: IResolvable) {
    unwrap(this).setStorageLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun storageLocation(`value`: StorageLocationProperty) {
    unwrap(this).setStorageLocation(`value`.let(StorageLocationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e692ebaef70429245fb2f1607ea303504b962cd429eae79ef3c9fe2fee9ea95c")
  public open fun storageLocation(`value`: StorageLocationProperty.Builder.() -> Unit): Unit =
      storageLocation(StorageLocationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun packageName(packageName: String)

    public fun storageLocation(storageLocation: IResolvable)

    public fun storageLocation(storageLocation: StorageLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eef293a1640ac178bc21191a3d7ed8355f679870b8a18c912b9ad3cf896ba7c")
    public fun storageLocation(storageLocation: StorageLocationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnPackage.Builder =
        software.amazon.awscdk.services.panorama.CfnPackage.Builder.create(scope, id)

    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable::unwrap))
    }

    override fun storageLocation(storageLocation: StorageLocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(StorageLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eef293a1640ac178bc21191a3d7ed8355f679870b8a18c912b9ad3cf896ba7c")
    override fun storageLocation(storageLocation: StorageLocationProperty.Builder.() -> Unit): Unit
        = storageLocation(StorageLocationProperty(storageLocation))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.panorama.CfnPackage = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.panorama.CfnPackage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPackage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPackage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnPackage): CfnPackage =
        CfnPackage(cdkObject)

    internal fun unwrap(wrapped: CfnPackage): software.amazon.awscdk.services.panorama.CfnPackage =
        wrapped.cdkObject
  }

  public interface StorageLocationProperty {
    public fun binaryPrefixLocation(): String? = unwrap(this).getBinaryPrefixLocation()

    public fun bucket(): String? = unwrap(this).getBucket()

    public fun generatedPrefixLocation(): String? = unwrap(this).getGeneratedPrefixLocation()

    public fun manifestPrefixLocation(): String? = unwrap(this).getManifestPrefixLocation()

    public fun repoPrefixLocation(): String? = unwrap(this).getRepoPrefixLocation()

    @CdkDslMarker
    public interface Builder {
      public fun binaryPrefixLocation(binaryPrefixLocation: String)

      public fun bucket(bucket: String)

      public fun generatedPrefixLocation(generatedPrefixLocation: String)

      public fun manifestPrefixLocation(manifestPrefixLocation: String)

      public fun repoPrefixLocation(repoPrefixLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty.Builder =
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty.builder()

      override fun binaryPrefixLocation(binaryPrefixLocation: String) {
        cdkBuilder.binaryPrefixLocation(binaryPrefixLocation)
      }

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun generatedPrefixLocation(generatedPrefixLocation: String) {
        cdkBuilder.generatedPrefixLocation(generatedPrefixLocation)
      }

      override fun manifestPrefixLocation(manifestPrefixLocation: String) {
        cdkBuilder.manifestPrefixLocation(manifestPrefixLocation)
      }

      override fun repoPrefixLocation(repoPrefixLocation: String) {
        cdkBuilder.repoPrefixLocation(repoPrefixLocation)
      }

      public fun build():
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty,
    ) : CdkObject(cdkObject), StorageLocationProperty {
      override fun binaryPrefixLocation(): String? = unwrap(this).getBinaryPrefixLocation()

      override fun bucket(): String? = unwrap(this).getBucket()

      override fun generatedPrefixLocation(): String? = unwrap(this).getGeneratedPrefixLocation()

      override fun manifestPrefixLocation(): String? = unwrap(this).getManifestPrefixLocation()

      override fun repoPrefixLocation(): String? = unwrap(this).getRepoPrefixLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty):
          StorageLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageLocationProperty):
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty
    }
  }
}
