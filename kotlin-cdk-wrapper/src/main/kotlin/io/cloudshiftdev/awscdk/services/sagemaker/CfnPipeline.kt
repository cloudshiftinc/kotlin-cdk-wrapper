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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SageMaker::Pipeline` resource creates shell scripts that run when you create and/or
 * start a SageMaker Pipeline.
 *
 * For information about SageMaker Pipelines, see [SageMaker
 * Pipelines](https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines.html) in the *Amazon SageMaker
 * Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object parallelismConfiguration;
 * Object pipelineDefinition;
 * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
 * .pipelineDefinition(pipelineDefinition)
 * .pipelineName("pipelineName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .parallelismConfiguration(parallelismConfiguration)
 * .pipelineDescription("pipelineDescription")
 * .pipelineDisplayName("pipelineDisplayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html)
 */
public open class CfnPipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The parallelism configuration applied to the pipeline.
   */
  public open fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

  /**
   * The parallelism configuration applied to the pipeline.
   */
  public open fun parallelismConfiguration(`value`: Any) {
    unwrap(this).setParallelismConfiguration(`value`)
  }

  /**
   * The definition of the pipeline.
   */
  public open fun pipelineDefinition(): Any = unwrap(this).getPipelineDefinition()

  /**
   * The definition of the pipeline.
   */
  public open fun pipelineDefinition(`value`: Any) {
    unwrap(this).setPipelineDefinition(`value`)
  }

  /**
   * The description of the pipeline.
   */
  public open fun pipelineDescription(): String? = unwrap(this).getPipelineDescription()

  /**
   * The description of the pipeline.
   */
  public open fun pipelineDescription(`value`: String) {
    unwrap(this).setPipelineDescription(`value`)
  }

  /**
   * The display name of the pipeline.
   */
  public open fun pipelineDisplayName(): String? = unwrap(this).getPipelineDisplayName()

  /**
   * The display name of the pipeline.
   */
  public open fun pipelineDisplayName(`value`: String) {
    unwrap(this).setPipelineDisplayName(`value`)
  }

  /**
   * The name of the pipeline.
   */
  public open fun pipelineName(): String = unwrap(this).getPipelineName()

  /**
   * The name of the pipeline.
   */
  public open fun pipelineName(`value`: String) {
    unwrap(this).setPipelineName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of the pipeline.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags of the pipeline.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags of the pipeline.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnPipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The parallelism configuration applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-parallelismconfiguration)
     * @param parallelismConfiguration The parallelism configuration applied to the pipeline. 
     */
    public fun parallelismConfiguration(parallelismConfiguration: Any)

    /**
     * The definition of the pipeline.
     *
     * This can be either a JSON string or an Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedefinition)
     * @param pipelineDefinition The definition of the pipeline. 
     */
    public fun pipelineDefinition(pipelineDefinition: Any)

    /**
     * The description of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedescription)
     * @param pipelineDescription The description of the pipeline. 
     */
    public fun pipelineDescription(pipelineDescription: String)

    /**
     * The display name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedisplayname)
     * @param pipelineDisplayName The display name of the pipeline. 
     */
    public fun pipelineDisplayName(pipelineDisplayName: String)

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinename)
     * @param pipelineName The name of the pipeline. 
     */
    public fun pipelineName(pipelineName: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The tags of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-tags)
     * @param tags The tags of the pipeline. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-tags)
     * @param tags The tags of the pipeline. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnPipeline.Builder =
        software.amazon.awscdk.services.sagemaker.CfnPipeline.Builder.create(scope, id)

    /**
     * The parallelism configuration applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-parallelismconfiguration)
     * @param parallelismConfiguration The parallelism configuration applied to the pipeline. 
     */
    override fun parallelismConfiguration(parallelismConfiguration: Any) {
      cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    /**
     * The definition of the pipeline.
     *
     * This can be either a JSON string or an Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedefinition)
     * @param pipelineDefinition The definition of the pipeline. 
     */
    override fun pipelineDefinition(pipelineDefinition: Any) {
      cdkBuilder.pipelineDefinition(pipelineDefinition)
    }

    /**
     * The description of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedescription)
     * @param pipelineDescription The description of the pipeline. 
     */
    override fun pipelineDescription(pipelineDescription: String) {
      cdkBuilder.pipelineDescription(pipelineDescription)
    }

    /**
     * The display name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedisplayname)
     * @param pipelineDisplayName The display name of the pipeline. 
     */
    override fun pipelineDisplayName(pipelineDisplayName: String) {
      cdkBuilder.pipelineDisplayName(pipelineDisplayName)
    }

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinename)
     * @param pipelineName The name of the pipeline. 
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The tags of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-tags)
     * @param tags The tags of the pipeline. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-tags)
     * @param tags The tags of the pipeline. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnPipeline = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnPipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline): CfnPipeline
        = CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline): software.amazon.awscdk.services.sagemaker.CfnPipeline
        = wrapped.cdkObject
  }

  /**
   * The location of the pipeline definition stored in Amazon S3.
   *
   * If specified, SageMaker will retrieve the pipeline definition from this location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .eTag("eTag")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The name of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html#cfn-sagemaker-pipeline-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * A file checksum of the pipeline definition file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html#cfn-sagemaker-pipeline-s3location-etag)
     */
    public fun eTag(): String? = unwrap(this).getETag()

    /**
     * The object key (or key name) which uniquely identifies the object in an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html#cfn-sagemaker-pipeline-s3location-key)
     */
    public fun key(): String

    /**
     * The version ID of the pipeline definition file.
     *
     * If not specified, Amazon SageMaker will retrieve the latest version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html#cfn-sagemaker-pipeline-s3location-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket. 
       */
      public fun bucket(bucket: String)

      /**
       * @param eTag A file checksum of the pipeline definition file.
       */
      public fun eTag(eTag: String)

      /**
       * @param key The object key (or key name) which uniquely identifies the object in an S3
       * bucket. 
       */
      public fun key(key: String)

      /**
       * @param version The version ID of the pipeline definition file.
       * If not specified, Amazon SageMaker will retrieve the latest version.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty.builder()

      /**
       * @param bucket The name of the S3 bucket. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param eTag A file checksum of the pipeline definition file.
       */
      override fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
      }

      /**
       * @param key The object key (or key name) which uniquely identifies the object in an S3
       * bucket. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version The version ID of the pipeline definition file.
       * If not specified, Amazon SageMaker will retrieve the latest version.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The name of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html#cfn-sagemaker-pipeline-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * A file checksum of the pipeline definition file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html#cfn-sagemaker-pipeline-s3location-etag)
       */
      override fun eTag(): String? = unwrap(this).getETag()

      /**
       * The object key (or key name) which uniquely identifies the object in an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html#cfn-sagemaker-pipeline-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The version ID of the pipeline definition file.
       *
       * If not specified, Amazon SageMaker will retrieve the latest version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-s3location.html#cfn-sagemaker-pipeline-s3location-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as S3LocationProperty

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnPipeline.S3LocationProperty
    }
  }

  /**
   * The definition of the pipeline.
   *
   * This can be either a JSON string or an Amazon S3 location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * PipelineDefinitionProperty pipelineDefinitionProperty = PipelineDefinitionProperty.builder()
   * .pipelineDefinitionBody("pipelineDefinitionBody")
   * // the properties below are optional
   * .pipelineDefinitionS3Location(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * // the properties below are optional
   * .eTag("eTag")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-pipelinedefinition.html)
   */
  public interface PipelineDefinitionProperty {
    /**
     * The [JSON pipeline
     * definition](https://docs.aws.amazon.com/https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/)
     * of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-pipelinedefinition.html#cfn-sagemaker-pipeline-pipelinedefinition-pipelinedefinitionbody)
     */
    public fun pipelineDefinitionBody(): String

    /**
     * The location of the pipeline definition stored in Amazon S3.
     *
     * If specified, SageMaker retrieves the pipeline definition from this location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-pipelinedefinition.html#cfn-sagemaker-pipeline-pipelinedefinition-pipelinedefinitions3location)
     */
    public fun pipelineDefinitionS3Location(): Any? = unwrap(this).getPipelineDefinitionS3Location()

    /**
     * A builder for [PipelineDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pipelineDefinitionBody The [JSON pipeline
       * definition](https://docs.aws.amazon.com/https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/)
       * of the pipeline. 
       */
      public fun pipelineDefinitionBody(pipelineDefinitionBody: String)

      /**
       * @param pipelineDefinitionS3Location The location of the pipeline definition stored in
       * Amazon S3.
       * If specified, SageMaker retrieves the pipeline definition from this location.
       */
      public fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: IResolvable)

      /**
       * @param pipelineDefinitionS3Location The location of the pipeline definition stored in
       * Amazon S3.
       * If specified, SageMaker retrieves the pipeline definition from this location.
       */
      public fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: S3LocationProperty)

      /**
       * @param pipelineDefinitionS3Location The location of the pipeline definition stored in
       * Amazon S3.
       * If specified, SageMaker retrieves the pipeline definition from this location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1df0e687c3066c62629cdd1b718c8d4ebdc9be95b8c663f15f623c857c772010")
      public
          fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty.builder()

      /**
       * @param pipelineDefinitionBody The [JSON pipeline
       * definition](https://docs.aws.amazon.com/https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/)
       * of the pipeline. 
       */
      override fun pipelineDefinitionBody(pipelineDefinitionBody: String) {
        cdkBuilder.pipelineDefinitionBody(pipelineDefinitionBody)
      }

      /**
       * @param pipelineDefinitionS3Location The location of the pipeline definition stored in
       * Amazon S3.
       * If specified, SageMaker retrieves the pipeline definition from this location.
       */
      override fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: IResolvable) {
        cdkBuilder.pipelineDefinitionS3Location(pipelineDefinitionS3Location.let(IResolvable::unwrap))
      }

      /**
       * @param pipelineDefinitionS3Location The location of the pipeline definition stored in
       * Amazon S3.
       * If specified, SageMaker retrieves the pipeline definition from this location.
       */
      override fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: S3LocationProperty) {
        cdkBuilder.pipelineDefinitionS3Location(pipelineDefinitionS3Location.let(S3LocationProperty::unwrap))
      }

      /**
       * @param pipelineDefinitionS3Location The location of the pipeline definition stored in
       * Amazon S3.
       * If specified, SageMaker retrieves the pipeline definition from this location.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1df0e687c3066c62629cdd1b718c8d4ebdc9be95b8c663f15f623c857c772010")
      override
          fun pipelineDefinitionS3Location(pipelineDefinitionS3Location: S3LocationProperty.Builder.() -> Unit):
          Unit = pipelineDefinitionS3Location(S3LocationProperty(pipelineDefinitionS3Location))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty,
    ) : CdkObject(cdkObject), PipelineDefinitionProperty {
      /**
       * The [JSON pipeline
       * definition](https://docs.aws.amazon.com/https://aws-sagemaker-mlops.github.io/sagemaker-model-building-pipeline-definition-JSON-schema/)
       * of the pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-pipelinedefinition.html#cfn-sagemaker-pipeline-pipelinedefinition-pipelinedefinitionbody)
       */
      override fun pipelineDefinitionBody(): String = unwrap(this).getPipelineDefinitionBody()

      /**
       * The location of the pipeline definition stored in Amazon S3.
       *
       * If specified, SageMaker retrieves the pipeline definition from this location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-pipelinedefinition.html#cfn-sagemaker-pipeline-pipelinedefinition-pipelinedefinitions3location)
       */
      override fun pipelineDefinitionS3Location(): Any? =
          unwrap(this).getPipelineDefinitionS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipelineDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty):
          PipelineDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as
          PipelineDefinitionProperty

      internal fun unwrap(wrapped: PipelineDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnPipeline.PipelineDefinitionProperty
    }
  }

  /**
   * Configuration that controls the parallelism of the pipeline.
   *
   * By default, the parallelism configuration specified applies to all executions of the pipeline
   * unless overridden.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sagemaker.*;
   * ParallelismConfigurationProperty parallelismConfigurationProperty =
   * ParallelismConfigurationProperty.builder()
   * .maxParallelExecutionSteps(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-parallelismconfiguration.html)
   */
  public interface ParallelismConfigurationProperty {
    /**
     * The max number of steps that can be executed in parallel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-parallelismconfiguration.html#cfn-sagemaker-pipeline-parallelismconfiguration-maxparallelexecutionsteps)
     */
    public fun maxParallelExecutionSteps(): Number

    /**
     * A builder for [ParallelismConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxParallelExecutionSteps The max number of steps that can be executed in parallel. 
       */
      public fun maxParallelExecutionSteps(maxParallelExecutionSteps: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty.builder()

      /**
       * @param maxParallelExecutionSteps The max number of steps that can be executed in parallel. 
       */
      override fun maxParallelExecutionSteps(maxParallelExecutionSteps: Number) {
        cdkBuilder.maxParallelExecutionSteps(maxParallelExecutionSteps)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty,
    ) : CdkObject(cdkObject), ParallelismConfigurationProperty {
      /**
       * The max number of steps that can be executed in parallel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-pipeline-parallelismconfiguration.html#cfn-sagemaker-pipeline-parallelismconfiguration-maxparallelexecutionsteps)
       */
      override fun maxParallelExecutionSteps(): Number = unwrap(this).getMaxParallelExecutionSteps()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParallelismConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty):
          ParallelismConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          ParallelismConfigurationProperty

      internal fun unwrap(wrapped: ParallelismConfigurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnPipeline.ParallelismConfigurationProperty
    }
  }
}
