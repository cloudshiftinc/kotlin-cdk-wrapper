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
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a package and storage location in an Amazon S3 access point.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.panorama.*;
 * CfnPackage cfnPackage = CfnPackage.Builder.create(this, "MyCfnPackage")
 * .packageName("packageName")
 * // the properties below are optional
 * .storageLocation(StorageLocationProperty.builder()
 * .binaryPrefixLocation("binaryPrefixLocation")
 * .bucket("bucket")
 * .generatedPrefixLocation("generatedPrefixLocation")
 * .manifestPrefixLocation("manifestPrefixLocation")
 * .repoPrefixLocation("repoPrefixLocation")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html)
 */
public open class CfnPackage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.panorama.CfnPackage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The package's ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When the package was created.
   */
  public open fun attrCreatedTime(): Number = unwrap(this).getAttrCreatedTime()

  /**
   * The package's ID.
   */
  public open fun attrPackageId(): String = unwrap(this).getAttrPackageId()

  /**
   *
   */
  public open fun attrStorageLocationBinaryPrefixLocation(): String =
      unwrap(this).getAttrStorageLocationBinaryPrefixLocation()

  /**
   *
   */
  public open fun attrStorageLocationBucket(): String = unwrap(this).getAttrStorageLocationBucket()

  /**
   *
   */
  public open fun attrStorageLocationGeneratedPrefixLocation(): String =
      unwrap(this).getAttrStorageLocationGeneratedPrefixLocation()

  /**
   *
   */
  public open fun attrStorageLocationManifestPrefixLocation(): String =
      unwrap(this).getAttrStorageLocationManifestPrefixLocation()

  /**
   *
   */
  public open fun attrStorageLocationRepoPrefixLocation(): String =
      unwrap(this).getAttrStorageLocationRepoPrefixLocation()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A name for the package.
   */
  public open fun packageName(): String = unwrap(this).getPackageName()

  /**
   * A name for the package.
   */
  public open fun packageName(`value`: String) {
    unwrap(this).setPackageName(`value`)
  }

  /**
   * A storage location.
   */
  public open fun storageLocation(): Any? = unwrap(this).getStorageLocation()

  /**
   * A storage location.
   */
  public open fun storageLocation(`value`: IResolvable) {
    unwrap(this).setStorageLocation(`value`.let(IResolvable::unwrap))
  }

  /**
   * A storage location.
   */
  public open fun storageLocation(`value`: StorageLocationProperty) {
    unwrap(this).setStorageLocation(`value`.let(StorageLocationProperty::unwrap))
  }

  /**
   * A storage location.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e692ebaef70429245fb2f1607ea303504b962cd429eae79ef3c9fe2fee9ea95c")
  public open fun storageLocation(`value`: StorageLocationProperty.Builder.() -> Unit): Unit =
      storageLocation(StorageLocationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags for the package.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags for the package.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags for the package.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.panorama.CfnPackage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-packagename)
     * @param packageName A name for the package. 
     */
    public fun packageName(packageName: String)

    /**
     * A storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     * @param storageLocation A storage location. 
     */
    public fun storageLocation(storageLocation: IResolvable)

    /**
     * A storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     * @param storageLocation A storage location. 
     */
    public fun storageLocation(storageLocation: StorageLocationProperty)

    /**
     * A storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     * @param storageLocation A storage location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eef293a1640ac178bc21191a3d7ed8355f679870b8a18c912b9ad3cf896ba7c")
    public fun storageLocation(storageLocation: StorageLocationProperty.Builder.() -> Unit)

    /**
     * Tags for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-tags)
     * @param tags Tags for the package. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-tags)
     * @param tags Tags for the package. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnPackage.Builder =
        software.amazon.awscdk.services.panorama.CfnPackage.Builder.create(scope, id)

    /**
     * A name for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-packagename)
     * @param packageName A name for the package. 
     */
    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    /**
     * A storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     * @param storageLocation A storage location. 
     */
    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable::unwrap))
    }

    /**
     * A storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     * @param storageLocation A storage location. 
     */
    override fun storageLocation(storageLocation: StorageLocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(StorageLocationProperty::unwrap))
    }

    /**
     * A storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     * @param storageLocation A storage location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eef293a1640ac178bc21191a3d7ed8355f679870b8a18c912b9ad3cf896ba7c")
    override fun storageLocation(storageLocation: StorageLocationProperty.Builder.() -> Unit): Unit
        = storageLocation(StorageLocationProperty(storageLocation))

    /**
     * Tags for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-tags)
     * @param tags Tags for the package. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-tags)
     * @param tags Tags for the package. 
     */
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

  /**
   * A storage location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.panorama.*;
   * StorageLocationProperty storageLocationProperty = StorageLocationProperty.builder()
   * .binaryPrefixLocation("binaryPrefixLocation")
   * .bucket("bucket")
   * .generatedPrefixLocation("generatedPrefixLocation")
   * .manifestPrefixLocation("manifestPrefixLocation")
   * .repoPrefixLocation("repoPrefixLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html)
   */
  public interface StorageLocationProperty {
    /**
     * The location's binary prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-binaryprefixlocation)
     */
    public fun binaryPrefixLocation(): String? = unwrap(this).getBinaryPrefixLocation()

    /**
     * The location's bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-bucket)
     */
    public fun bucket(): String? = unwrap(this).getBucket()

    /**
     * The location's generated prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-generatedprefixlocation)
     */
    public fun generatedPrefixLocation(): String? = unwrap(this).getGeneratedPrefixLocation()

    /**
     * The location's manifest prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-manifestprefixlocation)
     */
    public fun manifestPrefixLocation(): String? = unwrap(this).getManifestPrefixLocation()

    /**
     * The location's repo prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-repoprefixlocation)
     */
    public fun repoPrefixLocation(): String? = unwrap(this).getRepoPrefixLocation()

    /**
     * A builder for [StorageLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param binaryPrefixLocation The location's binary prefix.
       */
      public fun binaryPrefixLocation(binaryPrefixLocation: String)

      /**
       * @param bucket The location's bucket.
       */
      public fun bucket(bucket: String)

      /**
       * @param generatedPrefixLocation The location's generated prefix.
       */
      public fun generatedPrefixLocation(generatedPrefixLocation: String)

      /**
       * @param manifestPrefixLocation The location's manifest prefix.
       */
      public fun manifestPrefixLocation(manifestPrefixLocation: String)

      /**
       * @param repoPrefixLocation The location's repo prefix.
       */
      public fun repoPrefixLocation(repoPrefixLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty.Builder =
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty.builder()

      /**
       * @param binaryPrefixLocation The location's binary prefix.
       */
      override fun binaryPrefixLocation(binaryPrefixLocation: String) {
        cdkBuilder.binaryPrefixLocation(binaryPrefixLocation)
      }

      /**
       * @param bucket The location's bucket.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param generatedPrefixLocation The location's generated prefix.
       */
      override fun generatedPrefixLocation(generatedPrefixLocation: String) {
        cdkBuilder.generatedPrefixLocation(generatedPrefixLocation)
      }

      /**
       * @param manifestPrefixLocation The location's manifest prefix.
       */
      override fun manifestPrefixLocation(manifestPrefixLocation: String) {
        cdkBuilder.manifestPrefixLocation(manifestPrefixLocation)
      }

      /**
       * @param repoPrefixLocation The location's repo prefix.
       */
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
      /**
       * The location's binary prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-binaryprefixlocation)
       */
      override fun binaryPrefixLocation(): String? = unwrap(this).getBinaryPrefixLocation()

      /**
       * The location's bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-bucket)
       */
      override fun bucket(): String? = unwrap(this).getBucket()

      /**
       * The location's generated prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-generatedprefixlocation)
       */
      override fun generatedPrefixLocation(): String? = unwrap(this).getGeneratedPrefixLocation()

      /**
       * The location's manifest prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-manifestprefixlocation)
       */
      override fun manifestPrefixLocation(): String? = unwrap(this).getManifestPrefixLocation()

      /**
       * The location's repo prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html#cfn-panorama-package-storagelocation-repoprefixlocation)
       */
      override fun repoPrefixLocation(): String? = unwrap(this).getRepoPrefixLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty):
          StorageLocationProperty = CdkObjectWrappers.wrap(cdkObject) as StorageLocationProperty

      internal fun unwrap(wrapped: StorageLocationProperty):
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.panorama.CfnPackage.StorageLocationProperty
    }
  }
}
