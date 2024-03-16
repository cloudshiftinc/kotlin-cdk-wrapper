@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPipeline`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * Object parallelismConfiguration;
 * Object pipelineDefinition;
 * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
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
public interface CfnPipelineProps {
  /**
   * The parallelism configuration applied to the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-parallelismconfiguration)
   */
  public fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

  /**
   * The definition of the pipeline.
   *
   * This can be either a JSON string or an Amazon S3 location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedefinition)
   */
  public fun pipelineDefinition(): Any

  /**
   * The description of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedescription)
   */
  public fun pipelineDescription(): String? = unwrap(this).getPipelineDescription()

  /**
   * The display name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedisplayname)
   */
  public fun pipelineDisplayName(): String? = unwrap(this).getPipelineDisplayName()

  /**
   * The name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinename)
   */
  public fun pipelineName(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-rolearn)
   */
  public fun roleArn(): String

  /**
   * The tags of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPipelineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parallelismConfiguration The parallelism configuration applied to the pipeline.
     */
    public fun parallelismConfiguration(parallelismConfiguration: Any)

    /**
     * @param pipelineDefinition The definition of the pipeline. 
     * This can be either a JSON string or an Amazon S3 location.
     */
    public fun pipelineDefinition(pipelineDefinition: Any)

    /**
     * @param pipelineDescription The description of the pipeline.
     */
    public fun pipelineDescription(pipelineDescription: String)

    /**
     * @param pipelineDisplayName The display name of the pipeline.
     */
    public fun pipelineDisplayName(pipelineDisplayName: String)

    /**
     * @param pipelineName The name of the pipeline. 
     */
    public fun pipelineName(pipelineName: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags The tags of the pipeline.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags of the pipeline.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnPipelineProps.builder()

    /**
     * @param parallelismConfiguration The parallelism configuration applied to the pipeline.
     */
    override fun parallelismConfiguration(parallelismConfiguration: Any) {
      cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    /**
     * @param pipelineDefinition The definition of the pipeline. 
     * This can be either a JSON string or an Amazon S3 location.
     */
    override fun pipelineDefinition(pipelineDefinition: Any) {
      cdkBuilder.pipelineDefinition(pipelineDefinition)
    }

    /**
     * @param pipelineDescription The description of the pipeline.
     */
    override fun pipelineDescription(pipelineDescription: String) {
      cdkBuilder.pipelineDescription(pipelineDescription)
    }

    /**
     * @param pipelineDisplayName The display name of the pipeline.
     */
    override fun pipelineDisplayName(pipelineDisplayName: String) {
      cdkBuilder.pipelineDisplayName(pipelineDisplayName)
    }

    /**
     * @param pipelineName The name of the pipeline. 
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags The tags of the pipeline.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags of the pipeline.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnPipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    /**
     * The parallelism configuration applied to the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-parallelismconfiguration)
     */
    override fun parallelismConfiguration(): Any? = unwrap(this).getParallelismConfiguration()

    /**
     * The definition of the pipeline.
     *
     * This can be either a JSON string or an Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedefinition)
     */
    override fun pipelineDefinition(): Any = unwrap(this).getPipelineDefinition()

    /**
     * The description of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedescription)
     */
    override fun pipelineDescription(): String? = unwrap(this).getPipelineDescription()

    /**
     * The display name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedisplayname)
     */
    override fun pipelineDisplayName(): String? = unwrap(this).getPipelineDisplayName()

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinename)
     */
    override fun pipelineName(): String = unwrap(this).getPipelineName()

    /**
     * The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The tags of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnPipelineProps):
        CfnPipelineProps = CdkObjectWrappers.wrap(cdkObject) as CfnPipelineProps

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.sagemaker.CfnPipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnPipelineProps
  }
}
