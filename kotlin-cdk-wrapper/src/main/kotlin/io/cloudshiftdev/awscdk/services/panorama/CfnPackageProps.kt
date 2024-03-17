@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPackage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.panorama.*;
 * CfnPackageProps cfnPackageProps = CfnPackageProps.builder()
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
public interface CfnPackageProps {
  /**
   * A name for the package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-packagename)
   */
  public fun packageName(): String

  /**
   * A storage location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
   */
  public fun storageLocation(): Any? = unwrap(this).getStorageLocation()

  /**
   * Tags for the package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPackageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param packageName A name for the package. 
     */
    public fun packageName(packageName: String)

    /**
     * @param storageLocation A storage location.
     */
    public fun storageLocation(storageLocation: IResolvable)

    /**
     * @param storageLocation A storage location.
     */
    public fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty)

    /**
     * @param storageLocation A storage location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("682014929884d883a210f1e5dff27f34fc6e6d766cbcc017f53b55ce91b75b6e")
    public
        fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty.Builder.() -> Unit)

    /**
     * @param tags Tags for the package.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags for the package.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnPackageProps.Builder =
        software.amazon.awscdk.services.panorama.CfnPackageProps.builder()

    /**
     * @param packageName A name for the package. 
     */
    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    /**
     * @param storageLocation A storage location.
     */
    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable::unwrap))
    }

    /**
     * @param storageLocation A storage location.
     */
    override fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(CfnPackage.StorageLocationProperty::unwrap))
    }

    /**
     * @param storageLocation A storage location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("682014929884d883a210f1e5dff27f34fc6e6d766cbcc017f53b55ce91b75b6e")
    override
        fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty.Builder.() -> Unit):
        Unit = storageLocation(CfnPackage.StorageLocationProperty(storageLocation))

    /**
     * @param tags Tags for the package.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags for the package.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.panorama.CfnPackageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.panorama.CfnPackageProps,
  ) : CdkObject(cdkObject), CfnPackageProps {
    /**
     * A name for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-packagename)
     */
    override fun packageName(): String = unwrap(this).getPackageName()

    /**
     * A storage location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-storagelocation)
     */
    override fun storageLocation(): Any? = unwrap(this).getStorageLocation()

    /**
     * Tags for the package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html#cfn-panorama-package-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPackageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnPackageProps):
        CfnPackageProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPackageProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPackageProps):
        software.amazon.awscdk.services.panorama.CfnPackageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.panorama.CfnPackageProps
  }
}
