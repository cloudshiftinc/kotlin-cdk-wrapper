@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datapipeline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::DataPipeline::Pipeline resource specifies a data pipeline that you can use to automate
 * the movement and transformation of data.
 *
 * In each pipeline, you define pipeline objects, such as activities, schedules, data nodes, and
 * resources. For information about pipeline objects and components that you can use, see [Pipeline
 * Object
 * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
 * in the *AWS Data Pipeline Developer Guide* .
 *
 * The `AWS::DataPipeline::Pipeline` resource adds tasks, schedules, and preconditions to the
 * specified pipeline. You can use `PutPipelineDefinition` to populate a new pipeline.
 *
 * `PutPipelineDefinition` also validates the configuration as it adds it to the pipeline. Changes
 * to the pipeline are saved unless one of the following validation errors exist in the pipeline.
 *
 * * An object is missing a name or identifier field.
 * * A string or reference field is empty.
 * * The number of objects in the pipeline exceeds the allowed maximum number of objects.
 * * The pipeline is in a FINISHED state.
 *
 * Pipeline object definitions are passed to the
 * [PutPipelineDefinition](https://docs.aws.amazon.com/datapipeline/latest/APIReference/API_PutPipelineDefinition.html)
 * action and returned by the
 * [GetPipelineDefinition](https://docs.aws.amazon.com/datapipeline/latest/APIReference/API_GetPipelineDefinition.html)
 * action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datapipeline.*;
 * CfnPipeline cfnPipeline = CfnPipeline.Builder.create(this, "MyCfnPipeline")
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
public open class CfnPipeline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * Indicates whether to validate and start the pipeline or stop an active pipeline.
   */
  public open fun activate(): Any? = unwrap(this).getActivate()

  /**
   * Indicates whether to validate and start the pipeline or stop an active pipeline.
   */
  public open fun activate(`value`: Boolean) {
    unwrap(this).setActivate(`value`)
  }

  /**
   * Indicates whether to validate and start the pipeline or stop an active pipeline.
   */
  public open fun activate(`value`: IResolvable) {
    unwrap(this).setActivate(`value`.let(IResolvable::unwrap))
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the pipeline.
   */
  public open fun attrPipelineId(): String = unwrap(this).getAttrPipelineId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the pipeline.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the pipeline.
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
   * The name of the pipeline.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the pipeline.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The parameter objects used with the pipeline.
   */
  public open fun parameterObjects(): Any? = unwrap(this).getParameterObjects()

  /**
   * The parameter objects used with the pipeline.
   */
  public open fun parameterObjects(`value`: IResolvable) {
    unwrap(this).setParameterObjects(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameter objects used with the pipeline.
   */
  public open fun parameterObjects(`value`: List<Any>) {
    unwrap(this).setParameterObjects(`value`)
  }

  /**
   * The parameter objects used with the pipeline.
   */
  public open fun parameterObjects(vararg `value`: Any): Unit = parameterObjects(`value`.toList())

  /**
   * The parameter values used with the pipeline.
   */
  public open fun parameterValues(): Any? = unwrap(this).getParameterValues()

  /**
   * The parameter values used with the pipeline.
   */
  public open fun parameterValues(`value`: IResolvable) {
    unwrap(this).setParameterValues(`value`.let(IResolvable::unwrap))
  }

  /**
   * The parameter values used with the pipeline.
   */
  public open fun parameterValues(`value`: List<Any>) {
    unwrap(this).setParameterValues(`value`)
  }

  /**
   * The parameter values used with the pipeline.
   */
  public open fun parameterValues(vararg `value`: Any): Unit = parameterValues(`value`.toList())

  /**
   * The objects that define the pipeline.
   */
  public open fun pipelineObjects(): Any? = unwrap(this).getPipelineObjects()

  /**
   * The objects that define the pipeline.
   */
  public open fun pipelineObjects(`value`: IResolvable) {
    unwrap(this).setPipelineObjects(`value`.let(IResolvable::unwrap))
  }

  /**
   * The objects that define the pipeline.
   */
  public open fun pipelineObjects(`value`: List<Any>) {
    unwrap(this).setPipelineObjects(`value`)
  }

  /**
   * The objects that define the pipeline.
   */
  public open fun pipelineObjects(vararg `value`: Any): Unit = pipelineObjects(`value`.toList())

  /**
   * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
   * control permissions.
   */
  public open fun pipelineTags(): List<PipelineTagProperty> =
      unwrap(this).getPipelineTags()?.map(PipelineTagProperty::wrap) ?: emptyList()

  /**
   * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
   * control permissions.
   */
  public open fun pipelineTags(`value`: List<PipelineTagProperty>) {
    unwrap(this).setPipelineTags(`value`.map(PipelineTagProperty::unwrap))
  }

  /**
   * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
   * control permissions.
   */
  public open fun pipelineTags(vararg `value`: PipelineTagProperty): Unit =
      pipelineTags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datapipeline.CfnPipeline].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether to validate and start the pipeline or stop an active pipeline.
     *
     * By default, the value is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     * pipeline. 
     */
    public fun activate(activate: Boolean)

    /**
     * Indicates whether to validate and start the pipeline or stop an active pipeline.
     *
     * By default, the value is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     * pipeline. 
     */
    public fun activate(activate: IResolvable)

    /**
     * A description of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description)
     * @param description A description of the pipeline. 
     */
    public fun description(description: String)

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name)
     * @param name The name of the pipeline. 
     */
    public fun name(name: String)

    /**
     * The parameter objects used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
     * @param parameterObjects The parameter objects used with the pipeline. 
     */
    public fun parameterObjects(parameterObjects: IResolvable)

    /**
     * The parameter objects used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
     * @param parameterObjects The parameter objects used with the pipeline. 
     */
    public fun parameterObjects(parameterObjects: List<Any>)

    /**
     * The parameter objects used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
     * @param parameterObjects The parameter objects used with the pipeline. 
     */
    public fun parameterObjects(vararg parameterObjects: Any)

    /**
     * The parameter values used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
     * @param parameterValues The parameter values used with the pipeline. 
     */
    public fun parameterValues(parameterValues: IResolvable)

    /**
     * The parameter values used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
     * @param parameterValues The parameter values used with the pipeline. 
     */
    public fun parameterValues(parameterValues: List<Any>)

    /**
     * The parameter values used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
     * @param parameterValues The parameter values used with the pipeline. 
     */
    public fun parameterValues(vararg parameterValues: Any)

    /**
     * The objects that define the pipeline.
     *
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
     * @param pipelineObjects The objects that define the pipeline. 
     */
    public fun pipelineObjects(pipelineObjects: IResolvable)

    /**
     * The objects that define the pipeline.
     *
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
     * @param pipelineObjects The objects that define the pipeline. 
     */
    public fun pipelineObjects(pipelineObjects: List<Any>)

    /**
     * The objects that define the pipeline.
     *
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
     * @param pipelineObjects The objects that define the pipeline. 
     */
    public fun pipelineObjects(vararg pipelineObjects: Any)

    /**
     * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use
     * to control permissions.
     *
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     * pipeline, which you can use to control permissions. 
     */
    public fun pipelineTags(pipelineTags: List<PipelineTagProperty>)

    /**
     * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use
     * to control permissions.
     *
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     * pipeline, which you can use to control permissions. 
     */
    public fun pipelineTags(vararg pipelineTags: PipelineTagProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datapipeline.CfnPipeline.Builder =
        software.amazon.awscdk.services.datapipeline.CfnPipeline.Builder.create(scope, id)

    /**
     * Indicates whether to validate and start the pipeline or stop an active pipeline.
     *
     * By default, the value is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     * pipeline. 
     */
    override fun activate(activate: Boolean) {
      cdkBuilder.activate(activate)
    }

    /**
     * Indicates whether to validate and start the pipeline or stop an active pipeline.
     *
     * By default, the value is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
     * @param activate Indicates whether to validate and start the pipeline or stop an active
     * pipeline. 
     */
    override fun activate(activate: IResolvable) {
      cdkBuilder.activate(activate.let(IResolvable::unwrap))
    }

    /**
     * A description of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description)
     * @param description A description of the pipeline. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name)
     * @param name The name of the pipeline. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The parameter objects used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
     * @param parameterObjects The parameter objects used with the pipeline. 
     */
    override fun parameterObjects(parameterObjects: IResolvable) {
      cdkBuilder.parameterObjects(parameterObjects.let(IResolvable::unwrap))
    }

    /**
     * The parameter objects used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
     * @param parameterObjects The parameter objects used with the pipeline. 
     */
    override fun parameterObjects(parameterObjects: List<Any>) {
      cdkBuilder.parameterObjects(parameterObjects)
    }

    /**
     * The parameter objects used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
     * @param parameterObjects The parameter objects used with the pipeline. 
     */
    override fun parameterObjects(vararg parameterObjects: Any): Unit =
        parameterObjects(parameterObjects.toList())

    /**
     * The parameter values used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
     * @param parameterValues The parameter values used with the pipeline. 
     */
    override fun parameterValues(parameterValues: IResolvable) {
      cdkBuilder.parameterValues(parameterValues.let(IResolvable::unwrap))
    }

    /**
     * The parameter values used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
     * @param parameterValues The parameter values used with the pipeline. 
     */
    override fun parameterValues(parameterValues: List<Any>) {
      cdkBuilder.parameterValues(parameterValues)
    }

    /**
     * The parameter values used with the pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
     * @param parameterValues The parameter values used with the pipeline. 
     */
    override fun parameterValues(vararg parameterValues: Any): Unit =
        parameterValues(parameterValues.toList())

    /**
     * The objects that define the pipeline.
     *
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
     * @param pipelineObjects The objects that define the pipeline. 
     */
    override fun pipelineObjects(pipelineObjects: IResolvable) {
      cdkBuilder.pipelineObjects(pipelineObjects.let(IResolvable::unwrap))
    }

    /**
     * The objects that define the pipeline.
     *
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
     * @param pipelineObjects The objects that define the pipeline. 
     */
    override fun pipelineObjects(pipelineObjects: List<Any>) {
      cdkBuilder.pipelineObjects(pipelineObjects)
    }

    /**
     * The objects that define the pipeline.
     *
     * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
     * can be updated. For information about restrictions, see [Editing Your
     * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
     * @param pipelineObjects The objects that define the pipeline. 
     */
    override fun pipelineObjects(vararg pipelineObjects: Any): Unit =
        pipelineObjects(pipelineObjects.toList())

    /**
     * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use
     * to control permissions.
     *
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     * pipeline, which you can use to control permissions. 
     */
    override fun pipelineTags(pipelineTags: List<PipelineTagProperty>) {
      cdkBuilder.pipelineTags(pipelineTags.map(PipelineTagProperty::unwrap))
    }

    /**
     * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use
     * to control permissions.
     *
     * For more information, see [Controlling Access to Pipelines and
     * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
     * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the
     * pipeline, which you can use to control permissions. 
     */
    override fun pipelineTags(vararg pipelineTags: PipelineTagProperty): Unit =
        pipelineTags(pipelineTags.toList())

    public fun build(): software.amazon.awscdk.services.datapipeline.CfnPipeline =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datapipeline.CfnPipeline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline):
        CfnPipeline = CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline):
        software.amazon.awscdk.services.datapipeline.CfnPipeline = wrapped.cdkObject
  }

  /**
   * Contains information about a parameter object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datapipeline.*;
   * ParameterObjectProperty parameterObjectProperty = ParameterObjectProperty.builder()
   * .attributes(List.of(ParameterAttributeProperty.builder()
   * .key("key")
   * .stringValue("stringValue")
   * .build()))
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobject.html)
   */
  public interface ParameterObjectProperty {
    /**
     * The attributes of the parameter object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobject.html#cfn-datapipeline-pipeline-parameterobject-attributes)
     */
    public fun attributes(): Any

    /**
     * The ID of the parameter object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobject.html#cfn-datapipeline-pipeline-parameterobject-id)
     */
    public fun id(): String

    /**
     * A builder for [ParameterObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes The attributes of the parameter object. 
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes The attributes of the parameter object. 
       */
      public fun attributes(attributes: List<Any>)

      /**
       * @param attributes The attributes of the parameter object. 
       */
      public fun attributes(vararg attributes: Any)

      /**
       * @param id The ID of the parameter object. 
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.builder()

      /**
       * @param attributes The attributes of the parameter object. 
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      /**
       * @param attributes The attributes of the parameter object. 
       */
      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param attributes The attributes of the parameter object. 
       */
      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      /**
       * @param id The ID of the parameter object. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty,
    ) : CdkObject(cdkObject), ParameterObjectProperty {
      /**
       * The attributes of the parameter object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobject.html#cfn-datapipeline-pipeline-parameterobject-attributes)
       */
      override fun attributes(): Any = unwrap(this).getAttributes()

      /**
       * The ID of the parameter object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobject.html#cfn-datapipeline-pipeline-parameterobject-id)
       */
      override fun id(): String = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty):
          ParameterObjectProperty = CdkObjectWrappers.wrap(cdkObject) as ParameterObjectProperty

      internal fun unwrap(wrapped: ParameterObjectProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty
    }
  }

  /**
   * A value or list of parameter values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datapipeline.*;
   * ParameterValueProperty parameterValueProperty = ParameterValueProperty.builder()
   * .id("id")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalue.html)
   */
  public interface ParameterValueProperty {
    /**
     * The ID of the parameter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalue.html#cfn-datapipeline-pipeline-parametervalue-id)
     */
    public fun id(): String

    /**
     * The field value, expressed as a String.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalue.html#cfn-datapipeline-pipeline-parametervalue-stringvalue)
     */
    public fun stringValue(): String

    /**
     * A builder for [ParameterValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the parameter value. 
       */
      public fun id(id: String)

      /**
       * @param stringValue The field value, expressed as a String. 
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty.builder()

      /**
       * @param id The ID of the parameter value. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param stringValue The field value, expressed as a String. 
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty,
    ) : CdkObject(cdkObject), ParameterValueProperty {
      /**
       * The ID of the parameter value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalue.html#cfn-datapipeline-pipeline-parametervalue-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The field value, expressed as a String.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalue.html#cfn-datapipeline-pipeline-parametervalue-stringvalue)
       */
      override fun stringValue(): String = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty):
          ParameterValueProperty = CdkObjectWrappers.wrap(cdkObject) as ParameterValueProperty

      internal fun unwrap(wrapped: ParameterValueProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterValueProperty
    }
  }

  /**
   * PipelineObject is property of the AWS::DataPipeline::Pipeline resource that contains
   * information about a pipeline object.
   *
   * This can be a logical, physical, or physical attempt pipeline object. The complete set of
   * components of a pipeline defines the pipeline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datapipeline.*;
   * PipelineObjectProperty pipelineObjectProperty = PipelineObjectProperty.builder()
   * .fields(List.of(FieldProperty.builder()
   * .key("key")
   * // the properties below are optional
   * .refValue("refValue")
   * .stringValue("stringValue")
   * .build()))
   * .id("id")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobject.html)
   */
  public interface PipelineObjectProperty {
    /**
     * Key-value pairs that define the properties of the object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobject.html#cfn-datapipeline-pipeline-pipelineobject-fields)
     */
    public fun fields(): Any

    /**
     * The ID of the object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobject.html#cfn-datapipeline-pipeline-pipelineobject-id)
     */
    public fun id(): String

    /**
     * The name of the object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobject.html#cfn-datapipeline-pipeline-pipelineobject-name)
     */
    public fun name(): String

    /**
     * A builder for [PipelineObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fields Key-value pairs that define the properties of the object. 
       */
      public fun fields(fields: IResolvable)

      /**
       * @param fields Key-value pairs that define the properties of the object. 
       */
      public fun fields(fields: List<Any>)

      /**
       * @param fields Key-value pairs that define the properties of the object. 
       */
      public fun fields(vararg fields: Any)

      /**
       * @param id The ID of the object. 
       */
      public fun id(id: String)

      /**
       * @param name The name of the object. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty.builder()

      /**
       * @param fields Key-value pairs that define the properties of the object. 
       */
      override fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields.let(IResolvable::unwrap))
      }

      /**
       * @param fields Key-value pairs that define the properties of the object. 
       */
      override fun fields(fields: List<Any>) {
        cdkBuilder.fields(fields)
      }

      /**
       * @param fields Key-value pairs that define the properties of the object. 
       */
      override fun fields(vararg fields: Any): Unit = fields(fields.toList())

      /**
       * @param id The ID of the object. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The name of the object. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty,
    ) : CdkObject(cdkObject), PipelineObjectProperty {
      /**
       * Key-value pairs that define the properties of the object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobject.html#cfn-datapipeline-pipeline-pipelineobject-fields)
       */
      override fun fields(): Any = unwrap(this).getFields()

      /**
       * The ID of the object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobject.html#cfn-datapipeline-pipeline-pipelineobject-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The name of the object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelineobject.html#cfn-datapipeline-pipeline-pipelineobject-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipelineObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty):
          PipelineObjectProperty = CdkObjectWrappers.wrap(cdkObject) as PipelineObjectProperty

      internal fun unwrap(wrapped: PipelineObjectProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineObjectProperty
    }
  }

  /**
   * `Attribute` is a property of `ParameterObject` that defines the attributes of a parameter
   * object as key-value pairs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datapipeline.*;
   * ParameterAttributeProperty parameterAttributeProperty = ParameterAttributeProperty.builder()
   * .key("key")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterattribute.html)
   */
  public interface ParameterAttributeProperty {
    /**
     * The field identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterattribute.html#cfn-datapipeline-pipeline-parameterattribute-key)
     */
    public fun key(): String

    /**
     * The field value, expressed as a String.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterattribute.html#cfn-datapipeline-pipeline-parameterattribute-stringvalue)
     */
    public fun stringValue(): String

    /**
     * A builder for [ParameterAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The field identifier. 
       */
      public fun key(key: String)

      /**
       * @param stringValue The field value, expressed as a String. 
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.Builder
          =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty.builder()

      /**
       * @param key The field identifier. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param stringValue The field value, expressed as a String. 
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty,
    ) : CdkObject(cdkObject), ParameterAttributeProperty {
      /**
       * The field identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterattribute.html#cfn-datapipeline-pipeline-parameterattribute-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The field value, expressed as a String.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterattribute.html#cfn-datapipeline-pipeline-parameterattribute-stringvalue)
       */
      override fun stringValue(): String = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty):
          ParameterAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as
          ParameterAttributeProperty

      internal fun unwrap(wrapped: ParameterAttributeProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterAttributeProperty
    }
  }

  /**
   * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
   * control permissions.
   *
   * For more information, see [Controlling Access to Pipelines and
   * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datapipeline.*;
   * PipelineTagProperty pipelineTagProperty = PipelineTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetag.html)
   */
  public interface PipelineTagProperty {
    /**
     * The key name of a tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetag.html#cfn-datapipeline-pipeline-pipelinetag-key)
     */
    public fun key(): String

    /**
     * The value to associate with the key name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetag.html#cfn-datapipeline-pipeline-pipelinetag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [PipelineTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key name of a tag. 
       */
      public fun key(key: String)

      /**
       * @param value The value to associate with the key name. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty.builder()

      /**
       * @param key The key name of a tag. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value to associate with the key name. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty,
    ) : CdkObject(cdkObject), PipelineTagProperty {
      /**
       * The key name of a tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetag.html#cfn-datapipeline-pipeline-pipelinetag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value to associate with the key name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetag.html#cfn-datapipeline-pipeline-pipelinetag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PipelineTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty):
          PipelineTagProperty = CdkObjectWrappers.wrap(cdkObject) as PipelineTagProperty

      internal fun unwrap(wrapped: PipelineTagProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datapipeline.CfnPipeline.PipelineTagProperty
    }
  }

  /**
   * A key-value pair that describes a property of a `PipelineObject` .
   *
   * The value is specified as either a string value ( `StringValue` ) or a reference to another
   * object ( `RefValue` ) but not as both. To view fields for a data pipeline object, see [Pipeline
   * Object
   * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datapipeline.*;
   * FieldProperty fieldProperty = FieldProperty.builder()
   * .key("key")
   * // the properties below are optional
   * .refValue("refValue")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-field.html)
   */
  public interface FieldProperty {
    /**
     * Specifies the name of a field for a particular object.
     *
     * To view valid values for a particular field, see [Pipeline Object
     * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-field.html#cfn-datapipeline-pipeline-field-key)
     */
    public fun key(): String

    /**
     * A field value that you specify as an identifier of another object in the same pipeline
     * definition.
     *
     *
     * You can specify the field value as either a string value ( `StringValue` ) or a reference to
     * another object ( `RefValue` ), but not both.
     *
     *
     * Required if the key that you are using requires it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-field.html#cfn-datapipeline-pipeline-field-refvalue)
     */
    public fun refValue(): String? = unwrap(this).getRefValue()

    /**
     * A field value that you specify as a string.
     *
     * To view valid values for a particular field, see [Pipeline Object
     * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
     * in the *AWS Data Pipeline Developer Guide* .
     *
     *
     * You can specify the field value as either a string value ( `StringValue` ) or a reference to
     * another object ( `RefValue` ), but not both.
     *
     *
     * Required if the key that you are using requires it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-field.html#cfn-datapipeline-pipeline-field-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [FieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key Specifies the name of a field for a particular object. 
       * To view valid values for a particular field, see [Pipeline Object
       * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
       * in the *AWS Data Pipeline Developer Guide* .
       */
      public fun key(key: String)

      /**
       * @param refValue A field value that you specify as an identifier of another object in the
       * same pipeline definition.
       *
       * You can specify the field value as either a string value ( `StringValue` ) or a reference
       * to another object ( `RefValue` ), but not both.
       *
       *
       * Required if the key that you are using requires it.
       */
      public fun refValue(refValue: String)

      /**
       * @param stringValue A field value that you specify as a string.
       * To view valid values for a particular field, see [Pipeline Object
       * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
       * in the *AWS Data Pipeline Developer Guide* .
       *
       *
       * You can specify the field value as either a string value ( `StringValue` ) or a reference
       * to another object ( `RefValue` ), but not both.
       *
       *
       * Required if the key that you are using requires it.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder =
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.builder()

      /**
       * @param key Specifies the name of a field for a particular object. 
       * To view valid values for a particular field, see [Pipeline Object
       * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
       * in the *AWS Data Pipeline Developer Guide* .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param refValue A field value that you specify as an identifier of another object in the
       * same pipeline definition.
       *
       * You can specify the field value as either a string value ( `StringValue` ) or a reference
       * to another object ( `RefValue` ), but not both.
       *
       *
       * Required if the key that you are using requires it.
       */
      override fun refValue(refValue: String) {
        cdkBuilder.refValue(refValue)
      }

      /**
       * @param stringValue A field value that you specify as a string.
       * To view valid values for a particular field, see [Pipeline Object
       * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
       * in the *AWS Data Pipeline Developer Guide* .
       *
       *
       * You can specify the field value as either a string value ( `StringValue` ) or a reference
       * to another object ( `RefValue` ), but not both.
       *
       *
       * Required if the key that you are using requires it.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build(): software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty,
    ) : CdkObject(cdkObject), FieldProperty {
      /**
       * Specifies the name of a field for a particular object.
       *
       * To view valid values for a particular field, see [Pipeline Object
       * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
       * in the *AWS Data Pipeline Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-field.html#cfn-datapipeline-pipeline-field-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * A field value that you specify as an identifier of another object in the same pipeline
       * definition.
       *
       *
       * You can specify the field value as either a string value ( `StringValue` ) or a reference
       * to another object ( `RefValue` ), but not both.
       *
       *
       * Required if the key that you are using requires it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-field.html#cfn-datapipeline-pipeline-field-refvalue)
       */
      override fun refValue(): String? = unwrap(this).getRefValue()

      /**
       * A field value that you specify as a string.
       *
       * To view valid values for a particular field, see [Pipeline Object
       * Reference](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-pipeline-objects.html)
       * in the *AWS Data Pipeline Developer Guide* .
       *
       *
       * You can specify the field value as either a string value ( `StringValue` ) or a reference
       * to another object ( `RefValue` ), but not both.
       *
       *
       * Required if the key that you are using requires it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-field.html#cfn-datapipeline-pipeline-field-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty):
          FieldProperty = CdkObjectWrappers.wrap(cdkObject) as FieldProperty

      internal fun unwrap(wrapped: FieldProperty):
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty
    }
  }
}
