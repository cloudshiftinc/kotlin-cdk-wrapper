@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

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
 * Properties for defining a `CfnStorageConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnStorageConfigurationProps cfnStorageConfigurationProps =
 * CfnStorageConfigurationProps.builder()
 * .s3(S3StorageConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html)
 */
public interface CfnStorageConfigurationProps {
  /**
   * Storage cnfiguration name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An S3 storage configuration contains information about where recorded video will be stored.
   *
   * See the
   * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
   * property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-s3)
   */
  public fun s3(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStorageConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Storage cnfiguration name.
     */
    public fun name(name: String)

    /**
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     */
    public fun s3(s3: IResolvable)

    /**
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     */
    public fun s3(s3: CfnStorageConfiguration.S3StorageConfigurationProperty)

    /**
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a960961094a78d75ff131edf141d8771b2c5f28a09a7709817fba88cd3a3ab41")
    public fun s3(s3: CfnStorageConfiguration.S3StorageConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnStorageConfigurationProps.Builder
        = software.amazon.awscdk.services.ivs.CfnStorageConfigurationProps.builder()

    /**
     * @param name Storage cnfiguration name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     */
    override fun s3(s3: IResolvable) {
      cdkBuilder.s3(s3.let(IResolvable::unwrap))
    }

    /**
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     */
    override fun s3(s3: CfnStorageConfiguration.S3StorageConfigurationProperty) {
      cdkBuilder.s3(s3.let(CfnStorageConfiguration.S3StorageConfigurationProperty::unwrap))
    }

    /**
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a960961094a78d75ff131edf141d8771b2c5f28a09a7709817fba88cd3a3ab41")
    override fun s3(s3: CfnStorageConfiguration.S3StorageConfigurationProperty.Builder.() -> Unit):
        Unit = s3(CfnStorageConfiguration.S3StorageConfigurationProperty(s3))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnStorageConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ivs.CfnStorageConfigurationProps,
  ) : CdkObject(cdkObject), CfnStorageConfigurationProps {
    /**
     * Storage cnfiguration name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An S3 storage configuration contains information about where recorded video will be stored.
     *
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-s3)
     */
    override fun s3(): Any = unwrap(this).getS3()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnStorageConfigurationProps):
        CfnStorageConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnStorageConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageConfigurationProps):
        software.amazon.awscdk.services.ivs.CfnStorageConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivs.CfnStorageConfigurationProps
  }
}
