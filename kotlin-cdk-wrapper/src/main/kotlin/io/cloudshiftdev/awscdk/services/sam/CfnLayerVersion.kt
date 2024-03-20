@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlesslayerversion.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * CfnLayerVersion cfnLayerVersion = CfnLayerVersion.Builder.create(this, "MyCfnLayerVersion")
 * .compatibleRuntimes(List.of("compatibleRuntimes"))
 * .contentUri("contentUri")
 * .description("description")
 * .layerName("layerName")
 * .licenseInfo("licenseInfo")
 * .retentionPolicy("retentionPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html)
 */
public open class CfnLayerVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersion,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sam.CfnLayerVersion(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLayerVersionProps,
  ) :
      this(software.amazon.awscdk.services.sam.CfnLayerVersion(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLayerVersionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLayerVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLayerVersionProps(props)
  )

  /**
   *
   */
  public open fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
      emptyList()

  /**
   *
   */
  public open fun compatibleRuntimes(`value`: List<String>) {
    unwrap(this).setCompatibleRuntimes(`value`)
  }

  /**
   *
   */
  public open fun compatibleRuntimes(vararg `value`: String): Unit =
      compatibleRuntimes(`value`.toList())

  /**
   *
   */
  public open fun contentUri(): Any? = unwrap(this).getContentUri()

  /**
   *
   */
  public open fun contentUri(`value`: String) {
    unwrap(this).setContentUri(`value`)
  }

  /**
   *
   */
  public open fun contentUri(`value`: IResolvable) {
    unwrap(this).setContentUri(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun contentUri(`value`: S3LocationProperty) {
    unwrap(this).setContentUri(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64c6c0278a22197e3ef06f16d82290aa89b5a4af0413dfd9222080261a0044d1")
  public open fun contentUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      contentUri(S3LocationProperty(`value`))

  /**
   *
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   *
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   *
   */
  public open fun layerName(): String? = unwrap(this).getLayerName()

  /**
   *
   */
  public open fun layerName(`value`: String) {
    unwrap(this).setLayerName(`value`)
  }

  /**
   *
   */
  public open fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

  /**
   *
   */
  public open fun licenseInfo(`value`: String) {
    unwrap(this).setLicenseInfo(`value`)
  }

  /**
   *
   */
  public open fun retentionPolicy(): String? = unwrap(this).getRetentionPolicy()

  /**
   *
   */
  public open fun retentionPolicy(`value`: String) {
    unwrap(this).setRetentionPolicy(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sam.CfnLayerVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-compatibleruntimes)
     * @param compatibleRuntimes 
     */
    public fun compatibleRuntimes(compatibleRuntimes: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-compatibleruntimes)
     * @param compatibleRuntimes 
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     * @param contentUri 
     */
    public fun contentUri(contentUri: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     * @param contentUri 
     */
    public fun contentUri(contentUri: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     * @param contentUri 
     */
    public fun contentUri(contentUri: S3LocationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     * @param contentUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63fff5b9dd1b6c0c48d29201034a530a992a3fc058d59ebc3b9811473f077de")
    public fun contentUri(contentUri: S3LocationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-description)
     * @param description 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-layername)
     * @param layerName 
     */
    public fun layerName(layerName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-licenseinfo)
     * @param licenseInfo 
     */
    public fun licenseInfo(licenseInfo: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-retentionpolicy)
     * @param retentionPolicy 
     */
    public fun retentionPolicy(retentionPolicy: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnLayerVersion.Builder =
        software.amazon.awscdk.services.sam.CfnLayerVersion.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-compatibleruntimes)
     * @param compatibleRuntimes 
     */
    override fun compatibleRuntimes(compatibleRuntimes: List<String>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-compatibleruntimes)
     * @param compatibleRuntimes 
     */
    override fun compatibleRuntimes(vararg compatibleRuntimes: String): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     * @param contentUri 
     */
    override fun contentUri(contentUri: String) {
      cdkBuilder.contentUri(contentUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     * @param contentUri 
     */
    override fun contentUri(contentUri: IResolvable) {
      cdkBuilder.contentUri(contentUri.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     * @param contentUri 
     */
    override fun contentUri(contentUri: S3LocationProperty) {
      cdkBuilder.contentUri(contentUri.let(S3LocationProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     * @param contentUri 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63fff5b9dd1b6c0c48d29201034a530a992a3fc058d59ebc3b9811473f077de")
    override fun contentUri(contentUri: S3LocationProperty.Builder.() -> Unit): Unit =
        contentUri(S3LocationProperty(contentUri))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-description)
     * @param description 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-layername)
     * @param layerName 
     */
    override fun layerName(layerName: String) {
      cdkBuilder.layerName(layerName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-licenseinfo)
     * @param licenseInfo 
     */
    override fun licenseInfo(licenseInfo: String) {
      cdkBuilder.licenseInfo(licenseInfo)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-retentionpolicy)
     * @param retentionPolicy 
     */
    override fun retentionPolicy(retentionPolicy: String) {
      cdkBuilder.retentionPolicy(retentionPolicy)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnLayerVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnLayerVersion.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnLayerVersion.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLayerVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLayerVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersion):
        CfnLayerVersion = CfnLayerVersion(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersion):
        software.amazon.awscdk.services.sam.CfnLayerVersion = wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .version(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-layerversion-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-layerversion-s3location.html#cfn-serverless-layerversion-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-layerversion-s3location.html#cfn-serverless-layerversion-s3location-key)
     */
    public fun key(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-layerversion-s3location.html#cfn-serverless-layerversion-s3location-version)
     */
    public fun version(): Number? = unwrap(this).getVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket the value to be set. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key the value to be set. 
       */
      public fun key(key: String)

      /**
       * @param version the value to be set.
       */
      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty.builder()

      /**
       * @param bucket the value to be set. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key the value to be set. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version the value to be set.
       */
      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-layerversion-s3location.html#cfn-serverless-layerversion-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-layerversion-s3location.html#cfn-serverless-layerversion-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-layerversion-s3location.html#cfn-serverless-layerversion-s3location-version)
       */
      override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty
    }
  }
}
