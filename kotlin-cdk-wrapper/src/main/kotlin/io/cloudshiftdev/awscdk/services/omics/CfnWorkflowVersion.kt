@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new workflow version for the workflow that you specify with the `workflowId` parameter.
 *
 * When you create a new version of a workflow, you need to specify the configuration for the new
 * version. It doesn't inherit any configuration values from the workflow.
 *
 * Provide a version name that is unique for this workflow. You cannot change the name after
 * HealthOmics creates the version.
 *
 *
 * Don’t include any personally identifiable information (PII) in the version name. Version names
 * appear in the workflow version ARN.
 *
 *
 * For more information, see [Workflow versioning in AWS
 * HealthOmics](https://docs.aws.amazon.com/omics/latest/dev/workflow-versions.html) in the *AWS
 * HealthOmics User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnWorkflowVersion cfnWorkflowVersion = CfnWorkflowVersion.Builder.create(this,
 * "MyCfnWorkflowVersion")
 * .versionName("versionName")
 * .workflowId("workflowId")
 * // the properties below are optional
 * .accelerators("accelerators")
 * .definitionUri("definitionUri")
 * .description("description")
 * .engine("engine")
 * .main("main")
 * .parameterTemplate(Map.of(
 * "parameterTemplateKey", WorkflowParameterProperty.builder()
 * .description("description")
 * .optional(false)
 * .build()))
 * .storageCapacity(123)
 * .storageType("storageType")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .workflowBucketOwnerId("workflowBucketOwnerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html)
 */
public open class CfnWorkflowVersion(
  cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowVersion,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkflowVersionProps,
  ) :
      this(software.amazon.awscdk.services.omics.CfnWorkflowVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWorkflowVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkflowVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkflowVersionProps(props)
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
   * ARN of the workflow version.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The creation time of the workflow version.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The status of the workflow version.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The type of the workflow version.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   *
   */
  public open fun attrUuid(): String = unwrap(this).getAttrUuid()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   *
   */
  public open fun definitionUri(): String? = unwrap(this).getDefinitionUri()

  /**
   *
   */
  public open fun definitionUri(`value`: String) {
    unwrap(this).setDefinitionUri(`value`)
  }

  /**
   * The description of the workflow version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the workflow version.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun engine(): String? = unwrap(this).getEngine()

  /**
   *
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
   *
   */
  public open fun main(): String? = unwrap(this).getMain()

  /**
   *
   */
  public open fun main(`value`: String) {
    unwrap(this).setMain(`value`)
  }

  /**
   *
   */
  public open fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

  /**
   *
   */
  public open fun parameterTemplate(`value`: IResolvable) {
    unwrap(this).setParameterTemplate(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun parameterTemplate(`value`: Map<String, Any>) {
    unwrap(this).setParameterTemplate(`value`.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   *
   */
  public open fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  /**
   *
   */
  public open fun storageCapacity(`value`: Number) {
    unwrap(this).setStorageCapacity(`value`)
  }

  /**
   *
   */
  public open fun storageType(): String? = unwrap(this).getStorageType()

  /**
   *
   */
  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  /**
   * A map of resource tags.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A map of resource tags.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * The name of the workflow version.
   */
  public open fun versionName(): String = unwrap(this).getVersionName()

  /**
   * The name of the workflow version.
   */
  public open fun versionName(`value`: String) {
    unwrap(this).setVersionName(`value`)
  }

  /**
   *
   */
  public open fun workflowBucketOwnerId(): String? = unwrap(this).getWorkflowBucketOwnerId()

  /**
   *
   */
  public open fun workflowBucketOwnerId(`value`: String) {
    unwrap(this).setWorkflowBucketOwnerId(`value`)
  }

  /**
   * The workflow's ID.
   */
  public open fun workflowId(): String = unwrap(this).getWorkflowId()

  /**
   * The workflow's ID.
   */
  public open fun workflowId(`value`: String) {
    unwrap(this).setWorkflowId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.omics.CfnWorkflowVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-accelerators)
     * @param accelerators 
     */
    public fun accelerators(accelerators: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-definitionuri)
     * @param definitionUri 
     */
    public fun definitionUri(definitionUri: String)

    /**
     * The description of the workflow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-description)
     * @param description The description of the workflow version. 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-engine)
     * @param engine 
     */
    public fun engine(engine: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-main)
     * @param main 
     */
    public fun main(main: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-parametertemplate)
     * @param parameterTemplate 
     */
    public fun parameterTemplate(parameterTemplate: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-parametertemplate)
     * @param parameterTemplate 
     */
    public fun parameterTemplate(parameterTemplate: Map<String, Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-storagecapacity)
     * @param storageCapacity 
     */
    public fun storageCapacity(storageCapacity: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-storagetype)
     * @param storageType 
     */
    public fun storageType(storageType: String)

    /**
     * A map of resource tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-tags)
     * @param tags A map of resource tags. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The name of the workflow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-versionname)
     * @param versionName The name of the workflow version. 
     */
    public fun versionName(versionName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-workflowbucketownerid)
     * @param workflowBucketOwnerId 
     */
    public fun workflowBucketOwnerId(workflowBucketOwnerId: String)

    /**
     * The workflow's ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-workflowid)
     * @param workflowId The workflow's ID. 
     */
    public fun workflowId(workflowId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnWorkflowVersion.Builder =
        software.amazon.awscdk.services.omics.CfnWorkflowVersion.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-accelerators)
     * @param accelerators 
     */
    override fun accelerators(accelerators: String) {
      cdkBuilder.accelerators(accelerators)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-definitionuri)
     * @param definitionUri 
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * The description of the workflow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-description)
     * @param description The description of the workflow version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-engine)
     * @param engine 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-main)
     * @param main 
     */
    override fun main(main: String) {
      cdkBuilder.main(main)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-parametertemplate)
     * @param parameterTemplate 
     */
    override fun parameterTemplate(parameterTemplate: IResolvable) {
      cdkBuilder.parameterTemplate(parameterTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-parametertemplate)
     * @param parameterTemplate 
     */
    override fun parameterTemplate(parameterTemplate: Map<String, Any>) {
      cdkBuilder.parameterTemplate(parameterTemplate.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-storagecapacity)
     * @param storageCapacity 
     */
    override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-storagetype)
     * @param storageType 
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * A map of resource tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-tags)
     * @param tags A map of resource tags. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The name of the workflow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-versionname)
     * @param versionName The name of the workflow version. 
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-workflowbucketownerid)
     * @param workflowBucketOwnerId 
     */
    override fun workflowBucketOwnerId(workflowBucketOwnerId: String) {
      cdkBuilder.workflowBucketOwnerId(workflowBucketOwnerId)
    }

    /**
     * The workflow's ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-workflowid)
     * @param workflowId The workflow's ID. 
     */
    override fun workflowId(workflowId: String) {
      cdkBuilder.workflowId(workflowId)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnWorkflowVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnWorkflowVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkflowVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkflowVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowVersion):
        CfnWorkflowVersion = CfnWorkflowVersion(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowVersion):
        software.amazon.awscdk.services.omics.CfnWorkflowVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.omics.CfnWorkflowVersion
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflowversion-workflowparameter.html)
   */
  public interface WorkflowParameterProperty {
    /**
     * The parameter's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflowversion-workflowparameter.html#cfn-omics-workflowversion-workflowparameter-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Whether the parameter is optional.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflowversion-workflowparameter.html#cfn-omics-workflowversion-workflowparameter-optional)
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
          software.amazon.awscdk.services.omics.CfnWorkflowVersion.WorkflowParameterProperty.Builder
          =
          software.amazon.awscdk.services.omics.CfnWorkflowVersion.WorkflowParameterProperty.builder()

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
          software.amazon.awscdk.services.omics.CfnWorkflowVersion.WorkflowParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowVersion.WorkflowParameterProperty,
    ) : CdkObject(cdkObject),
        WorkflowParameterProperty {
      /**
       * The parameter's description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflowversion-workflowparameter.html#cfn-omics-workflowversion-workflowparameter-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Whether the parameter is optional.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflowversion-workflowparameter.html#cfn-omics-workflowversion-workflowparameter-optional)
       */
      override fun optional(): Any? = unwrap(this).getOptional()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowVersion.WorkflowParameterProperty):
          WorkflowParameterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WorkflowParameterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowParameterProperty):
          software.amazon.awscdk.services.omics.CfnWorkflowVersion.WorkflowParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnWorkflowVersion.WorkflowParameterProperty
    }
  }
}
