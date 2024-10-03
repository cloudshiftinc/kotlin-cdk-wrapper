@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IVS::StorageConfiguration` resource specifies an  storage configuration.
 *
 * A storage configuration describes an S3 location where recorded videos will be stored. For more
 * information, see [Auto-Record to Amazon S3 (Low-Latency
 * Streaming)](https://docs.aws.amazon.com/ivs/latest/LowLatencyUserGuide/record-to-s3.html) in the
 * *Amazon IVS Low-Latency Streaming User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnStorageConfiguration cfnStorageConfiguration = CfnStorageConfiguration.Builder.create(this,
 * "MyCfnStorageConfiguration")
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
public open class CfnStorageConfiguration(
  cdkObject: software.amazon.awscdk.services.ivs.CfnStorageConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStorageConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.ivs.CfnStorageConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStorageConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStorageConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStorageConfigurationProps(props)
  )

  /**
   * The storage-configuration ARN.
   *
   * For example: `arn:aws:ivs:us-west-2:123456789012:storage-configuration/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Storage cnfiguration name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Storage cnfiguration name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An S3 storage configuration contains information about where recorded video will be stored.
   */
  public open fun s3(): Any = unwrap(this).getS3()

  /**
   * An S3 storage configuration contains information about where recorded video will be stored.
   */
  public open fun s3(`value`: IResolvable) {
    unwrap(this).setS3(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An S3 storage configuration contains information about where recorded video will be stored.
   */
  public open fun s3(`value`: S3StorageConfigurationProperty) {
    unwrap(this).setS3(`value`.let(S3StorageConfigurationProperty.Companion::unwrap))
  }

  /**
   * An S3 storage configuration contains information about where recorded video will be stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bab9913066199087129d99ae8106565d7bb6f0f5c070d5a244e0deb027d5c91c")
  public open fun s3(`value`: S3StorageConfigurationProperty.Builder.() -> Unit): Unit =
      s3(S3StorageConfigurationProperty(`value`))

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnStorageConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Storage cnfiguration name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-name)
     * @param name Storage cnfiguration name. 
     */
    public fun name(name: String)

    /**
     * An S3 storage configuration contains information about where recorded video will be stored.
     *
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-s3)
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     */
    public fun s3(s3: IResolvable)

    /**
     * An S3 storage configuration contains information about where recorded video will be stored.
     *
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-s3)
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     */
    public fun s3(s3: S3StorageConfigurationProperty)

    /**
     * An S3 storage configuration contains information about where recorded video will be stored.
     *
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-s3)
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20f6e70776470daddfd471e551d03903a88ffd7517b02f0c5bdf1f7edb99f572")
    public fun s3(s3: S3StorageConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnStorageConfiguration.Builder =
        software.amazon.awscdk.services.ivs.CfnStorageConfiguration.Builder.create(scope, id)

    /**
     * Storage cnfiguration name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-name)
     * @param name Storage cnfiguration name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An S3 storage configuration contains information about where recorded video will be stored.
     *
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-s3)
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     */
    override fun s3(s3: IResolvable) {
      cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
    }

    /**
     * An S3 storage configuration contains information about where recorded video will be stored.
     *
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-s3)
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     */
    override fun s3(s3: S3StorageConfigurationProperty) {
      cdkBuilder.s3(s3.let(S3StorageConfigurationProperty.Companion::unwrap))
    }

    /**
     * An S3 storage configuration contains information about where recorded video will be stored.
     *
     * See the
     * [S3StorageConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-s3)
     * @param s3 An S3 storage configuration contains information about where recorded video will be
     * stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20f6e70776470daddfd471e551d03903a88ffd7517b02f0c5bdf1f7edb99f572")
    override fun s3(s3: S3StorageConfigurationProperty.Builder.() -> Unit): Unit =
        s3(S3StorageConfigurationProperty(s3))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-storageconfiguration.html#cfn-ivs-storageconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnStorageConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnStorageConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStorageConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStorageConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnStorageConfiguration):
        CfnStorageConfiguration = CfnStorageConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnStorageConfiguration):
        software.amazon.awscdk.services.ivs.CfnStorageConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.ivs.CfnStorageConfiguration
  }

  /**
   * The S3StorageConfiguration property type describes an S3 location where recorded videos will be
   * stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivs.*;
   * S3StorageConfigurationProperty s3StorageConfigurationProperty =
   * S3StorageConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html)
   */
  public interface S3StorageConfigurationProperty {
    /**
     * Name of the S3 bucket where recorded video will be stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html#cfn-ivs-storageconfiguration-s3storageconfiguration-bucketname)
     */
    public fun bucketName(): String

    /**
     * A builder for [S3StorageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName Name of the S3 bucket where recorded video will be stored. 
       */
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnStorageConfiguration.S3StorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnStorageConfiguration.S3StorageConfigurationProperty.builder()

      /**
       * @param bucketName Name of the S3 bucket where recorded video will be stored. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.ivs.CfnStorageConfiguration.S3StorageConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ivs.CfnStorageConfiguration.S3StorageConfigurationProperty,
    ) : CdkObject(cdkObject),
        S3StorageConfigurationProperty {
      /**
       * Name of the S3 bucket where recorded video will be stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-storageconfiguration-s3storageconfiguration.html#cfn-ivs-storageconfiguration-s3storageconfiguration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3StorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnStorageConfiguration.S3StorageConfigurationProperty):
          S3StorageConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3StorageConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3StorageConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnStorageConfiguration.S3StorageConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnStorageConfiguration.S3StorageConfigurationProperty
    }
  }
}
