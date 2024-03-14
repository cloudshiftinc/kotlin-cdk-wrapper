package io.cloudshiftdev.awscdk.services.iotanalytics

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPipelineProps {
  /**
   * A list of "PipelineActivity" objects.
   *
   * Activities perform transformations on your messages, such as removing, renaming or adding
   * message attributes; filtering messages based on attribute values; invoking your Lambda functions
   * on messages for advanced processing; or performing mathematical transformations to normalize
   * device data.
   *
   * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
   * `datastore` activity. Each entry in the list must contain only one activity, for example:
   *
   * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities)
   */
  public fun pipelineActivities(): Any

  /**
   * The name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelinename)
   */
  public fun pipelineName(): String? = unwrap(this).getPipelineName()

  /**
   * Metadata which can be used to manage the pipeline.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPipelineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     */
    public fun pipelineActivities(pipelineActivities: IResolvable)

    /**
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     */
    public fun pipelineActivities(pipelineActivities: List<Any>)

    /**
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     */
    public fun pipelineActivities(vararg pipelineActivities: Any)

    /**
     * @param pipelineName The name of the pipeline.
     */
    public fun pipelineName(pipelineName: String)

    /**
     * @param tags Metadata which can be used to manage the pipeline.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the pipeline.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnPipelineProps.builder()

    /**
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     */
    override fun pipelineActivities(pipelineActivities: IResolvable) {
      cdkBuilder.pipelineActivities(pipelineActivities.let(IResolvable::unwrap))
    }

    /**
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     */
    override fun pipelineActivities(pipelineActivities: List<Any>) {
      cdkBuilder.pipelineActivities(pipelineActivities)
    }

    /**
     * @param pipelineActivities A list of "PipelineActivity" objects. 
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     */
    override fun pipelineActivities(vararg pipelineActivities: Any): Unit =
        pipelineActivities(pipelineActivities.toList())

    /**
     * @param pipelineName The name of the pipeline.
     */
    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * @param tags Metadata which can be used to manage the pipeline.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the pipeline.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    /**
     * A list of "PipelineActivity" objects.
     *
     * Activities perform transformations on your messages, such as removing, renaming or adding
     * message attributes; filtering messages based on attribute values; invoking your Lambda functions
     * on messages for advanced processing; or performing mathematical transformations to normalize
     * device data.
     *
     * The list can be 2-25 *PipelineActivity* objects and must contain both a `channel` and a
     * `datastore` activity. Each entry in the list must contain only one activity, for example:
     *
     * `pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelineactivities)
     */
    override fun pipelineActivities(): Any = unwrap(this).getPipelineActivities()

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-pipelinename)
     */
    override fun pipelineName(): String? = unwrap(this).getPipelineName()

    /**
     * Metadata which can be used to manage the pipeline.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-pipeline.html#cfn-iotanalytics-pipeline-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipelineProps):
        CfnPipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.iotanalytics.CfnPipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotanalytics.CfnPipelineProps
  }
}
