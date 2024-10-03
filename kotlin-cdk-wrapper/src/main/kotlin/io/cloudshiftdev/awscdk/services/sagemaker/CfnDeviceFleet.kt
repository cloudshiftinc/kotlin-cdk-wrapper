@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SageMaker::DeviceFleet` resource is an Amazon SageMaker resource type that allows you
 * to create a DeviceFleet that manages your SageMaker Edge Manager Devices.
 *
 * You must register your devices against the `DeviceFleet` separately.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnDeviceFleet cfnDeviceFleet = CfnDeviceFleet.Builder.create(this, "MyCfnDeviceFleet")
 * .deviceFleetName("deviceFleetName")
 * .outputConfig(EdgeOutputConfigProperty.builder()
 * .s3OutputLocation("s3OutputLocation")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html)
 */
public open class CfnDeviceFleet(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceFleetProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnDeviceFleet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeviceFleetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceFleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeviceFleetProps(props)
  )

  /**
   * A description of the fleet.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the fleet.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Name of the device fleet.
   */
  public open fun deviceFleetName(): String = unwrap(this).getDeviceFleetName()

  /**
   * Name of the device fleet.
   */
  public open fun deviceFleetName(`value`: String) {
    unwrap(this).setDeviceFleetName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The output configuration for storing sample data collected by the fleet.
   */
  public open fun outputConfig(): Any = unwrap(this).getOutputConfig()

  /**
   * The output configuration for storing sample data collected by the fleet.
   */
  public open fun outputConfig(`value`: IResolvable) {
    unwrap(this).setOutputConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The output configuration for storing sample data collected by the fleet.
   */
  public open fun outputConfig(`value`: EdgeOutputConfigProperty) {
    unwrap(this).setOutputConfig(`value`.let(EdgeOutputConfigProperty.Companion::unwrap))
  }

  /**
   * The output configuration for storing sample data collected by the fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("96e638e358f25c3b8264512f204c8a561a17bc8e45952902d343fa4190154e51")
  public open fun outputConfig(`value`: EdgeOutputConfigProperty.Builder.() -> Unit): Unit =
      outputConfig(EdgeOutputConfigProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * device fleets.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * device fleets.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs that contain metadata to help you categorize and organize your
   * device fleets.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnDeviceFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-description)
     * @param description A description of the fleet. 
     */
    public fun description(description: String)

    /**
     * Name of the device fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-devicefleetname)
     * @param deviceFleetName Name of the device fleet. 
     */
    public fun deviceFleetName(deviceFleetName: String)

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    public fun outputConfig(outputConfig: IResolvable)

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    public fun outputConfig(outputConfig: EdgeOutputConfigProperty)

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b88d294cea23b1a959185b36e0dfa87ca8e9236822f671a0ae3e563a506650d")
    public fun outputConfig(outputConfig: EdgeOutputConfigProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) that has access to AWS Internet of Things
     * (IoT). 
     */
    public fun roleArn(roleArn: String)

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * device fleets.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-tags)
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your device fleets. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * device fleets.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-tags)
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your device fleets. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.Builder.create(scope, id)

    /**
     * A description of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-description)
     * @param description A description of the fleet. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Name of the device fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-devicefleetname)
     * @param deviceFleetName Name of the device fleet. 
     */
    override fun deviceFleetName(deviceFleetName: String) {
      cdkBuilder.deviceFleetName(deviceFleetName)
    }

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    override fun outputConfig(outputConfig: IResolvable) {
      cdkBuilder.outputConfig(outputConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    override fun outputConfig(outputConfig: EdgeOutputConfigProperty) {
      cdkBuilder.outputConfig(outputConfig.let(EdgeOutputConfigProperty.Companion::unwrap))
    }

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     * @param outputConfig The output configuration for storing sample data collected by the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b88d294cea23b1a959185b36e0dfa87ca8e9236822f671a0ae3e563a506650d")
    override fun outputConfig(outputConfig: EdgeOutputConfigProperty.Builder.() -> Unit): Unit =
        outputConfig(EdgeOutputConfigProperty(outputConfig))

    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) that has access to AWS Internet of Things
     * (IoT). 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * device fleets.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-tags)
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your device fleets. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * device fleets.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-tags)
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     * organize your device fleets. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDeviceFleet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeviceFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeviceFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet):
        CfnDeviceFleet = CfnDeviceFleet(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceFleet):
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleet = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
  }

  /**
   * The output configuration for storing sample data collected by the fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * EdgeOutputConfigProperty edgeOutputConfigProperty = EdgeOutputConfigProperty.builder()
   * .s3OutputLocation("s3OutputLocation")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-devicefleet-edgeoutputconfig.html)
   */
  public interface EdgeOutputConfigProperty {
    /**
     * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
     * the storage volume after compilation job.
     *
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
     * for your role's account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-devicefleet-edgeoutputconfig.html#cfn-sagemaker-devicefleet-edgeoutputconfig-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The Amazon Simple Storage (S3) bucket URI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-devicefleet-edgeoutputconfig.html#cfn-sagemaker-devicefleet-edgeoutputconfig-s3outputlocation)
     */
    public fun s3OutputLocation(): String

    /**
     * A builder for [EdgeOutputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
       * encrypt data on the storage volume after compilation job.
       * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
       * for your role's account.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param s3OutputLocation The Amazon Simple Storage (S3) bucket URI. 
       */
      public fun s3OutputLocation(s3OutputLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty.builder()

      /**
       * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
       * encrypt data on the storage volume after compilation job.
       * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
       * for your role's account.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param s3OutputLocation The Amazon Simple Storage (S3) bucket URI. 
       */
      override fun s3OutputLocation(s3OutputLocation: String) {
        cdkBuilder.s3OutputLocation(s3OutputLocation)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty,
    ) : CdkObject(cdkObject),
        EdgeOutputConfigProperty {
      /**
       * The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to encrypt data on
       * the storage volume after compilation job.
       *
       * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
       * for your role's account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-devicefleet-edgeoutputconfig.html#cfn-sagemaker-devicefleet-edgeoutputconfig-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The Amazon Simple Storage (S3) bucket URI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-devicefleet-edgeoutputconfig.html#cfn-sagemaker-devicefleet-edgeoutputconfig-s3outputlocation)
       */
      override fun s3OutputLocation(): String = unwrap(this).getS3OutputLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EdgeOutputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty):
          EdgeOutputConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? EdgeOutputConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdgeOutputConfigProperty):
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnDeviceFleet.EdgeOutputConfigProperty
    }
  }
}
