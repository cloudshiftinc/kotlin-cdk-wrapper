@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a workflow.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
 * .accelerators("accelerators")
 * .definitionUri("definitionUri")
 * .description("description")
 * .engine("engine")
 * .main("main")
 * .name("name")
 * .parameterTemplate(Map.of(
 * "parameterTemplateKey", WorkflowParameterProperty.builder()
 * .description("description")
 * .optional(false)
 * .build()))
 * .storageCapacity(123)
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html)
 */
public open class CfnWorkflow(
  cdkObject: software.amazon.awscdk.services.omics.CfnWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.omics.CfnWorkflow(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkflowProps,
  ) :
      this(software.amazon.awscdk.services.omics.CfnWorkflow(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWorkflowProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkflowProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkflowProps(props)
  )

  /**
   *
   */
  public open fun accelerators(): String? = unwrap(this).getAccelerators()

  /**
   *
   */
  public open fun accelerators(`value`: String) {
    unwrap(this).setAccelerators(`value`)
  }

  /**
   * The ARN for the workflow.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When the workflow was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The workflow's ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The workflow's status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The workflow's type.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The URI of a definition for the workflow.
   */
  public open fun definitionUri(): String? = unwrap(this).getDefinitionUri()

  /**
   * The URI of a definition for the workflow.
   */
  public open fun definitionUri(`value`: String) {
    unwrap(this).setDefinitionUri(`value`)
  }

  /**
   * The parameter's description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The parameter's description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * An engine for the workflow.
   */
  public open fun engine(): String? = unwrap(this).getEngine()

  /**
   * An engine for the workflow.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
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
   * The path of the main definition file for the workflow.
   */
  public open fun main(): String? = unwrap(this).getMain()

  /**
   * The path of the main definition file for the workflow.
   */
  public open fun main(`value`: String) {
    unwrap(this).setMain(`value`)
  }

  /**
   * The workflow's name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The workflow's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The workflow's parameter template.
   */
  public open fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

  /**
   * The workflow's parameter template.
   */
  public open fun parameterTemplate(`value`: IResolvable) {
    unwrap(this).setParameterTemplate(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The workflow's parameter template.
   */
  public open fun parameterTemplate(`value`: Map<String, Any>) {
    unwrap(this).setParameterTemplate(`value`.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   * The default storage capacity for the workflow runs, in gibibytes.
   */
  public open fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  /**
   * The default storage capacity for the workflow runs, in gibibytes.
   */
  public open fun storageCapacity(`value`: Number) {
    unwrap(this).setStorageCapacity(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags for the workflow.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Tags for the workflow.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.omics.CfnWorkflow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-accelerators)
     * @param accelerators 
     */
    public fun accelerators(accelerators: String)

    /**
     * The URI of a definition for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-definitionuri)
     * @param definitionUri The URI of a definition for the workflow. 
     */
    public fun definitionUri(definitionUri: String)

    /**
     * The parameter's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-description)
     * @param description The parameter's description. 
     */
    public fun description(description: String)

    /**
     * An engine for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-engine)
     * @param engine An engine for the workflow. 
     */
    public fun engine(engine: String)

    /**
     * The path of the main definition file for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-main)
     * @param main The path of the main definition file for the workflow. 
     */
    public fun main(main: String)

    /**
     * The workflow's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-name)
     * @param name The workflow's name. 
     */
    public fun name(name: String)

    /**
     * The workflow's parameter template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
     * @param parameterTemplate The workflow's parameter template. 
     */
    public fun parameterTemplate(parameterTemplate: IResolvable)

    /**
     * The workflow's parameter template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
     * @param parameterTemplate The workflow's parameter template. 
     */
    public fun parameterTemplate(parameterTemplate: Map<String, Any>)

    /**
     * The default storage capacity for the workflow runs, in gibibytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-storagecapacity)
     * @param storageCapacity The default storage capacity for the workflow runs, in gibibytes. 
     */
    public fun storageCapacity(storageCapacity: Number)

    /**
     * Tags for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-tags)
     * @param tags Tags for the workflow. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnWorkflow.Builder =
        software.amazon.awscdk.services.omics.CfnWorkflow.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-accelerators)
     * @param accelerators 
     */
    override fun accelerators(accelerators: String) {
      cdkBuilder.accelerators(accelerators)
    }

    /**
     * The URI of a definition for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-definitionuri)
     * @param definitionUri The URI of a definition for the workflow. 
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * The parameter's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-description)
     * @param description The parameter's description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An engine for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-engine)
     * @param engine An engine for the workflow. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The path of the main definition file for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-main)
     * @param main The path of the main definition file for the workflow. 
     */
    override fun main(main: String) {
      cdkBuilder.main(main)
    }

    /**
     * The workflow's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-name)
     * @param name The workflow's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The workflow's parameter template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
     * @param parameterTemplate The workflow's parameter template. 
     */
    override fun parameterTemplate(parameterTemplate: IResolvable) {
      cdkBuilder.parameterTemplate(parameterTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * The workflow's parameter template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
     * @param parameterTemplate The workflow's parameter template. 
     */
    override fun parameterTemplate(parameterTemplate: Map<String, Any>) {
      cdkBuilder.parameterTemplate(parameterTemplate.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The default storage capacity for the workflow runs, in gibibytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-storagecapacity)
     * @param storageCapacity The default storage capacity for the workflow runs, in gibibytes. 
     */
    override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    /**
     * Tags for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-tags)
     * @param tags Tags for the workflow. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnWorkflow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnWorkflow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkflow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflow): CfnWorkflow =
        CfnWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflow): software.amazon.awscdk.services.omics.CfnWorkflow =
        wrapped.cdkObject as software.amazon.awscdk.services.omics.CfnWorkflow
  }

  /**
   * A workflow parameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.omics.*;
   * WorkflowParameterProperty workflowParameterProperty = WorkflowParameterProperty.builder()
   * .description("description")
   * .optional(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflow-workflowparameter.html)
   */
  public interface WorkflowParameterProperty {
    /**
     * The parameter's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflow-workflowparameter.html#cfn-omics-workflow-workflowparameter-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Whether the parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflow-workflowparameter.html#cfn-omics-workflow-workflowparameter-optional)
     */
    public fun optional(): Any? = unwrap(this).getOptional()

    /**
     * A builder for [WorkflowParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The parameter's description.
       */
      public fun description(description: String)

      /**
       * @param optional Whether the parameter is optional.
       */
      public fun optional(optional: Boolean)

      /**
       * @param optional Whether the parameter is optional.
       */
      public fun optional(optional: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty.Builder =
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty.builder()

      /**
       * @param description The parameter's description.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param optional Whether the parameter is optional.
       */
      override fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
      }

      /**
       * @param optional Whether the parameter is optional.
       */
      override fun optional(optional: IResolvable) {
        cdkBuilder.optional(optional.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty,
    ) : CdkObject(cdkObject), WorkflowParameterProperty {
      /**
       * The parameter's description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflow-workflowparameter.html#cfn-omics-workflow-workflowparameter-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Whether the parameter is optional.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflow-workflowparameter.html#cfn-omics-workflow-workflowparameter-optional)
       */
      override fun optional(): Any? = unwrap(this).getOptional()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty):
          WorkflowParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WorkflowParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowParameterProperty):
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnWorkflow.WorkflowParameterProperty
    }
  }
}
