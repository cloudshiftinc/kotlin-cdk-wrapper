@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datapipeline

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
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
 * import io.cloudshiftdev.awscdk.services.datapipeline.*;
 * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
 * .name("name")
 * // the properties below are optional
 * .activate(false)
 * .description("description")
 * .parameterObjects(List.of(ParameterObjectProperty.builder()
 * .attributes(List.of(ParameterAttributeProperty.builder()
 * .key("key")
 * .stringValue("stringValue")
 * .build()))
 * .id("id")
 * .build()))
 * .parameterValues(List.of(ParameterValueProperty.builder()
 * .id("id")
 * .stringValue("stringValue")
 * .build()))
 * .pipelineObjects(List.of(PipelineObjectProperty.builder()
 * .fields(List.of(FieldProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .refValue("refValue")
 * .stringValue("stringValue")
 * .build()))
 * .id("id")
 * .name("name")
 * .build()))
 * .pipelineTags(List.of(PipelineTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html)
 */
public interface CfnPipelineProps {
  /**
   * Indicates whether to validate and start the pipeline or stop an active pipeline.
   *
   * By default, the value is set to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
   */
  public fun activate(): Any? = unwrap(this).getActivate()

  /**
   * A description of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name)
   */
  public fun name(): String

  /**
   * The parameter objects used with the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
   */
  public fun parameterObjects(): Any? = unwrap(this).getParameterObjects()

  /**
   * The parameter values used with the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
   */
  public fun parameterValues(): Any? = unwrap(this).getParameterValues()

  /**
   * The objects that define the pipeline.
   *
   * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
   * can be updated. For information about restrictions, see [Editing Your
   * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
   */
  public fun pipelineObjects(): Any? = unwrap(this).getPipelineObjects()

  /**
   * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
   * control permissions.
   *
   * For more information, see [Controlling Access to Pipelines and
   * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
   */
  public fun pipelineTags(): List<CfnPipeline.PipelineTagProperty> =
      unwrap(this).getPipelineTags()?.map(CfnPipeline.PipelineTagProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnPipelineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     * pipeline.
     * By default, the value is set to `true` .
     */
    public fun activate(activate: Boolean)

    /**
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     * pipeline.
     * By default, the value is set to `true` .
     */
    public fun activate(activate: IResolvable)

    /**
     * @param description A description of the pipeline.
     */
    public fun description(description: String)

    /**
     * @param name The name of the pipeline. 
     */
    public fun name(name: String)

    /**
     * @param parameterObjects The parameter objects used with the pipeline.
     */
    public fun parameterObjects(parameterObjects: IResolvable)

    /**
     * @param parameterObjects The parameter objects used with the pipeline.
     */
    public fun parameterObjects(parameterObjects: List<Any>)

    /**
     * @param parameterObjects The parameter objects used with the pipeline.
     */
    public fun parameterObjects(vararg parameterObjects: Any)

    /**
     * @param parameterValues The parameter values used with the pipeline.
     */
    public fun parameterValues(parameterValues: IResolvable)

    /**
     * @param parameterValues The parameter values used with the pipeline.
     */
    public fun parameterValues(parameterValues: List<Any>)

    /**
     * @param parameterValues The parameter values used with the pipeline.
     */
    public fun parameterValues(vararg parameterValues: Any)

    /**
     * @param pipelineObjects The objects that define the pipeline.
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineObjects(pipelineObjects: IResolvable)

    /**
     * @param pipelineObjects The objects that define the pipeline.
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineObjects(pipelineObjects: List<Any>)

    /**
     * @param pipelineObjects The objects that define the pipeline.
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineObjects(vararg pipelineObjects: Any)

    /**
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     * pipeline, which you can use to control permissions.
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineTags(pipelineTags: List<CfnPipeline.PipelineTagProperty>)

    /**
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     * pipeline, which you can use to control permissions.
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    public fun pipelineTags(vararg pipelineTags: CfnPipeline.PipelineTagProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datapipeline.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.datapipeline.CfnPipelineProps.builder()

    /**
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     * pipeline.
     * By default, the value is set to `true` .
     */
    override fun activate(activate: Boolean) {
      cdkBuilder.activate(activate)
    }

    /**
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     * pipeline.
     * By default, the value is set to `true` .
     */
    override fun activate(activate: IResolvable) {
      cdkBuilder.activate(activate.let(IResolvable::unwrap))
    }

    /**
     * @param description A description of the pipeline.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the pipeline. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameterObjects The parameter objects used with the pipeline.
     */
    override fun parameterObjects(parameterObjects: IResolvable) {
      cdkBuilder.parameterObjects(parameterObjects.let(IResolvable::unwrap))
    }

    /**
     * @param parameterObjects The parameter objects used with the pipeline.
     */
    override fun parameterObjects(parameterObjects: List<Any>) {
      cdkBuilder.parameterObjects(parameterObjects.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param parameterObjects The parameter objects used with the pipeline.
     */
    override fun parameterObjects(vararg parameterObjects: Any): Unit =
        parameterObjects(parameterObjects.toList())

    /**
     * @param parameterValues The parameter values used with the pipeline.
     */
    override fun parameterValues(parameterValues: IResolvable) {
      cdkBuilder.parameterValues(parameterValues.let(IResolvable::unwrap))
    }

    /**
     * @param parameterValues The parameter values used with the pipeline.
     */
    override fun parameterValues(parameterValues: List<Any>) {
      cdkBuilder.parameterValues(parameterValues.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param parameterValues The parameter values used with the pipeline.
     */
    override fun parameterValues(vararg parameterValues: Any): Unit =
        parameterValues(parameterValues.toList())

    /**
     * @param pipelineObjects The objects that define the pipeline.
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    override fun pipelineObjects(pipelineObjects: IResolvable) {
      cdkBuilder.pipelineObjects(pipelineObjects.let(IResolvable::unwrap))
    }

    /**
     * @param pipelineObjects The objects that define the pipeline.
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    override fun pipelineObjects(pipelineObjects: List<Any>) {
      cdkBuilder.pipelineObjects(pipelineObjects.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param pipelineObjects The objects that define the pipeline.
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    override fun pipelineObjects(vararg pipelineObjects: Any): Unit =
        pipelineObjects(pipelineObjects.toList())

    /**
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     * pipeline, which you can use to control permissions.
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    override fun pipelineTags(pipelineTags: List<CfnPipeline.PipelineTagProperty>) {
      cdkBuilder.pipelineTags(pipelineTags.map(CfnPipeline.PipelineTagProperty::unwrap))
    }

    /**
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     * pipeline, which you can use to control permissions.
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     */
    override fun pipelineTags(vararg pipelineTags: CfnPipeline.PipelineTagProperty): Unit =
        pipelineTags(pipelineTags.toList())

    public fun build(): software.amazon.awscdk.services.datapipeline.CfnPipelineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    /**
     * Indicates whether to validate and start the pipeline or stop an active pipeline.
     *
     * By default, the value is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
     */
    override fun activate(): Any? = unwrap(this).getActivate()

    /**
     * A description of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The parameter objects used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
     */
    override fun parameterObjects(): Any? = unwrap(this).getParameterObjects()

    /**
     * The parameter values used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
     */
    override fun parameterValues(): Any? = unwrap(this).getParameterValues()

    /**
     * The objects that define the pipeline.
     *
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
     */
    override fun pipelineObjects(): Any? = unwrap(this).getPipelineObjects()

    /**
     * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use
     * to control permissions.
     *
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
     */
    override fun pipelineTags(): List<CfnPipeline.PipelineTagProperty> =
        unwrap(this).getPipelineTags()?.map(CfnPipeline.PipelineTagProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipelineProps):
        CfnPipelineProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPipelineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.datapipeline.CfnPipelineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datapipeline.CfnPipelineProps
  }
}
