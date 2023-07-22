@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datapipeline.CfnPipeline
import software.amazon.awscdk.services.datapipeline.CfnPipelineProps
import software.constructs.Construct

public object datapipeline {
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
   * import software.amazon.awscdk.services.datapipeline.*;
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
  public inline fun cfnPipeline(
    scope: Construct,
    id: String,
    block: CfnPipelineDsl.() -> Unit = {},
  ): CfnPipeline {
    val builder = CfnPipelineDsl(scope, id)
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.datapipeline.*;
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
  public inline fun cfnPipelineFieldProperty(block: CfnPipelineFieldPropertyDsl.() -> Unit = {}):
      CfnPipeline.FieldProperty {
    val builder = CfnPipelineFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.datapipeline.*;
   * ParameterAttributeProperty parameterAttributeProperty = ParameterAttributeProperty.builder()
   * .key("key")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterattribute.html)
   */
  public inline
      fun cfnPipelineParameterAttributeProperty(block: CfnPipelineParameterAttributePropertyDsl.() -> Unit
      = {}): CfnPipeline.ParameterAttributeProperty {
    val builder = CfnPipelineParameterAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about a parameter object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.datapipeline.*;
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
  public inline
      fun cfnPipelineParameterObjectProperty(block: CfnPipelineParameterObjectPropertyDsl.() -> Unit
      = {}): CfnPipeline.ParameterObjectProperty {
    val builder = CfnPipelineParameterObjectPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A value or list of parameter values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.datapipeline.*;
   * ParameterValueProperty parameterValueProperty = ParameterValueProperty.builder()
   * .id("id")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalue.html)
   */
  public inline
      fun cfnPipelineParameterValueProperty(block: CfnPipelineParameterValuePropertyDsl.() -> Unit =
      {}): CfnPipeline.ParameterValueProperty {
    val builder = CfnPipelineParameterValuePropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.datapipeline.*;
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
  public inline
      fun cfnPipelinePipelineObjectProperty(block: CfnPipelinePipelineObjectPropertyDsl.() -> Unit =
      {}): CfnPipeline.PipelineObjectProperty {
    val builder = CfnPipelinePipelineObjectPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.datapipeline.*;
   * PipelineTagProperty pipelineTagProperty = PipelineTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-pipelinetag.html)
   */
  public inline
      fun cfnPipelinePipelineTagProperty(block: CfnPipelinePipelineTagPropertyDsl.() -> Unit = {}):
      CfnPipeline.PipelineTagProperty {
    val builder = CfnPipelinePipelineTagPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPipeline`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.datapipeline.*;
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
  public inline fun cfnPipelineProps(block: CfnPipelinePropsDsl.() -> Unit = {}): CfnPipelineProps {
    val builder = CfnPipelinePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
