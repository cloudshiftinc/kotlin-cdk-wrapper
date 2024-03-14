package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLayerVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ARN of the layer version.
   */
  public open fun attrLayerVersionArn(): String = unwrap(this).getAttrLayerVersionArn()

  /**
   * A list of compatible [instruction set
   * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
   */
  public open fun compatibleArchitectures(): List<String> =
      unwrap(this).getCompatibleArchitectures() ?: emptyList()

  /**
   * A list of compatible [instruction set
   * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
   */
  public open fun compatibleArchitectures(`value`: List<String>) {
    unwrap(this).setCompatibleArchitectures(`value`)
  }

  /**
   * A list of compatible [instruction set
   * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
   */
  public open fun compatibleArchitectures(vararg `value`: String): Unit =
      compatibleArchitectures(`value`.toList())

  /**
   * A list of compatible [function
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for filtering
   * with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
   * [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html) .
   */
  public open fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
      emptyList()

  /**
   * A list of compatible [function
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for filtering
   * with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
   * [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html) .
   */
  public open fun compatibleRuntimes(`value`: List<String>) {
    unwrap(this).setCompatibleRuntimes(`value`)
  }

  /**
   * A list of compatible [function
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for filtering
   * with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
   * [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html) .
   */
  public open fun compatibleRuntimes(vararg `value`: String): Unit =
      compatibleRuntimes(`value`.toList())

  /**
   * The function layer archive.
   */
  public open fun content(): Any = unwrap(this).getContent()

  /**
   * The function layer archive.
   */
  public open fun content(`value`: IResolvable) {
    unwrap(this).setContent(`value`.let(IResolvable::unwrap))
  }

  /**
   * The function layer archive.
   */
  public open fun content(`value`: ContentProperty) {
    unwrap(this).setContent(`value`.let(ContentProperty::unwrap))
  }

  /**
   * The function layer archive.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4b2315742ae79120c21d4ff1bfb720e675a7715687d2aa87a17c238fccf1c351")
  public open fun content(`value`: ContentProperty.Builder.() -> Unit): Unit =
      content(ContentProperty(`value`))

  /**
   * The description of the version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the version.
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
   * The name or Amazon Resource Name (ARN) of the layer.
   */
  public open fun layerName(): String? = unwrap(this).getLayerName()

  /**
   * The name or Amazon Resource Name (ARN) of the layer.
   */
  public open fun layerName(`value`: String) {
    unwrap(this).setLayerName(`value`)
  }

  /**
   * The layer's software license.
   *
   * It can be any of the following:.
   */
  public open fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

  /**
   * The layer's software license.
   *
   * It can be any of the following:.
   */
  public open fun licenseInfo(`value`: String) {
    unwrap(this).setLicenseInfo(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnLayerVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatiblearchitectures)
     * @param compatibleArchitectures A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) . 
     */
    public fun compatibleArchitectures(compatibleArchitectures: List<String>)

    /**
     * A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatiblearchitectures)
     * @param compatibleArchitectures A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) . 
     */
    public fun compatibleArchitectures(vararg compatibleArchitectures: String)

    /**
     * A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes)
     * @param compatibleRuntimes A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * . 
     */
    public fun compatibleRuntimes(compatibleRuntimes: List<String>)

    /**
     * A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes)
     * @param compatibleRuntimes A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * . 
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: String)

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     * @param content The function layer archive. 
     */
    public fun content(content: IResolvable)

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     * @param content The function layer archive. 
     */
    public fun content(content: ContentProperty)

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     * @param content The function layer archive. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d9f4b6b8e6a4340d0fd83dea8fc7f5f98bb8cc60c16fc293abaa52663a51e15")
    public fun content(content: ContentProperty.Builder.() -> Unit)

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description)
     * @param description The description of the version. 
     */
    public fun description(description: String)

    /**
     * The name or Amazon Resource Name (ARN) of the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername)
     * @param layerName The name or Amazon Resource Name (ARN) of the layer. 
     */
    public fun layerName(layerName: String)

    /**
     * The layer's software license. It can be any of the following:.
     *
     * * An [SPDX license identifier](https://docs.aws.amazon.com/https://spdx.org/licenses/) . For
     * example, `MIT` .
     * * The URL of a license hosted on the internet. For example,
     * `https://opensource.org/licenses/MIT` .
     * * The full text of the license.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo)
     * @param licenseInfo The layer's software license. It can be any of the following:. 
     */
    public fun licenseInfo(licenseInfo: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnLayerVersion.Builder =
        software.amazon.awscdk.services.lambda.CfnLayerVersion.Builder.create(scope, id)

    /**
     * A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatiblearchitectures)
     * @param compatibleArchitectures A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) . 
     */
    override fun compatibleArchitectures(compatibleArchitectures: List<String>) {
      cdkBuilder.compatibleArchitectures(compatibleArchitectures)
    }

    /**
     * A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatiblearchitectures)
     * @param compatibleArchitectures A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) . 
     */
    override fun compatibleArchitectures(vararg compatibleArchitectures: String): Unit =
        compatibleArchitectures(compatibleArchitectures.toList())

    /**
     * A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes)
     * @param compatibleRuntimes A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * . 
     */
    override fun compatibleRuntimes(compatibleRuntimes: List<String>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes)
    }

    /**
     * A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes)
     * @param compatibleRuntimes A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * . 
     */
    override fun compatibleRuntimes(vararg compatibleRuntimes: String): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     * @param content The function layer archive. 
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     * @param content The function layer archive. 
     */
    override fun content(content: ContentProperty) {
      cdkBuilder.content(content.let(ContentProperty::unwrap))
    }

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     * @param content The function layer archive. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d9f4b6b8e6a4340d0fd83dea8fc7f5f98bb8cc60c16fc293abaa52663a51e15")
    override fun content(content: ContentProperty.Builder.() -> Unit): Unit =
        content(ContentProperty(content))

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description)
     * @param description The description of the version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name or Amazon Resource Name (ARN) of the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername)
     * @param layerName The name or Amazon Resource Name (ARN) of the layer. 
     */
    override fun layerName(layerName: String) {
      cdkBuilder.layerName(layerName)
    }

    /**
     * The layer's software license. It can be any of the following:.
     *
     * * An [SPDX license identifier](https://docs.aws.amazon.com/https://spdx.org/licenses/) . For
     * example, `MIT` .
     * * The URL of a license hosted on the internet. For example,
     * `https://opensource.org/licenses/MIT` .
     * * The full text of the license.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo)
     * @param licenseInfo The layer's software license. It can be any of the following:. 
     */
    override fun licenseInfo(licenseInfo: String) {
      cdkBuilder.licenseInfo(licenseInfo)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersion = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLayerVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLayerVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersion):
        CfnLayerVersion = CfnLayerVersion(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersion):
        software.amazon.awscdk.services.lambda.CfnLayerVersion = wrapped.cdkObject
  }

  public interface ContentProperty {
    /**
     * The Amazon S3 bucket of the layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The Amazon S3 key of the layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3key)
     */
    public fun s3Key(): String

    /**
     * For versioned objects, the version of the layer archive object to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3objectversion)
     */
    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    /**
     * A builder for [ContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket The Amazon S3 bucket of the layer archive. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The Amazon S3 key of the layer archive. 
       */
      public fun s3Key(s3Key: String)

      /**
       * @param s3ObjectVersion For versioned objects, the version of the layer archive object to
       * use.
       */
      public fun s3ObjectVersion(s3ObjectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.builder()

      /**
       * @param s3Bucket The Amazon S3 bucket of the layer archive. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The Amazon S3 key of the layer archive. 
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      /**
       * @param s3ObjectVersion For versioned objects, the version of the layer archive object to
       * use.
       */
      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty,
    ) : CdkObject(cdkObject), ContentProperty {
      /**
       * The Amazon S3 bucket of the layer archive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The Amazon S3 key of the layer archive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3key)
       */
      override fun s3Key(): String = unwrap(this).getS3Key()

      /**
       * For versioned objects, the version of the layer archive object to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html#cfn-lambda-layerversion-content-s3objectversion)
       */
      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty):
          ContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentProperty):
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty
    }
  }
}
