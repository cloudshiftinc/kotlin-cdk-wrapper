@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnWorkflow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
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
public interface CfnWorkflowProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-accelerators)
   */
  public fun accelerators(): String? = unwrap(this).getAccelerators()

  /**
   * The URI of a definition for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-definitionuri)
   */
  public fun definitionUri(): String? = unwrap(this).getDefinitionUri()

  /**
   * The parameter's description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An engine for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-engine)
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * The path of the main definition file for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-main)
   */
  public fun main(): String? = unwrap(this).getMain()

  /**
   * The workflow's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The workflow's parameter template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
   */
  public fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

  /**
   * The default storage capacity for the workflow runs, in gibibytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-storagecapacity)
   */
  public fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  /**
   * Tags for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnWorkflowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accelerators the value to be set.
     */
    public fun accelerators(accelerators: String)

    /**
     * @param definitionUri The URI of a definition for the workflow.
     */
    public fun definitionUri(definitionUri: String)

    /**
     * @param description The parameter's description.
     */
    public fun description(description: String)

    /**
     * @param engine An engine for the workflow.
     */
    public fun engine(engine: String)

    /**
     * @param main The path of the main definition file for the workflow.
     */
    public fun main(main: String)

    /**
     * @param name The workflow's name.
     */
    public fun name(name: String)

    /**
     * @param parameterTemplate The workflow's parameter template.
     */
    public fun parameterTemplate(parameterTemplate: IResolvable)

    /**
     * @param parameterTemplate The workflow's parameter template.
     */
    public fun parameterTemplate(parameterTemplate: Map<String, Any>)

    /**
     * @param storageCapacity The default storage capacity for the workflow runs, in gibibytes.
     */
    public fun storageCapacity(storageCapacity: Number)

    /**
     * @param tags Tags for the workflow.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnWorkflowProps.Builder =
        software.amazon.awscdk.services.omics.CfnWorkflowProps.builder()

    /**
     * @param accelerators the value to be set.
     */
    override fun accelerators(accelerators: String) {
      cdkBuilder.accelerators(accelerators)
    }

    /**
     * @param definitionUri The URI of a definition for the workflow.
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * @param description The parameter's description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine An engine for the workflow.
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param main The path of the main definition file for the workflow.
     */
    override fun main(main: String) {
      cdkBuilder.main(main)
    }

    /**
     * @param name The workflow's name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameterTemplate The workflow's parameter template.
     */
    override fun parameterTemplate(parameterTemplate: IResolvable) {
      cdkBuilder.parameterTemplate(parameterTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameterTemplate The workflow's parameter template.
     */
    override fun parameterTemplate(parameterTemplate: Map<String, Any>) {
      cdkBuilder.parameterTemplate(parameterTemplate.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param storageCapacity The default storage capacity for the workflow runs, in gibibytes.
     */
    override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    /**
     * @param tags Tags for the workflow.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnWorkflowProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowProps,
  ) : CdkObject(cdkObject),
      CfnWorkflowProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-accelerators)
     */
    override fun accelerators(): String? = unwrap(this).getAccelerators()

    /**
     * The URI of a definition for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-definitionuri)
     */
    override fun definitionUri(): String? = unwrap(this).getDefinitionUri()

    /**
     * The parameter's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An engine for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-engine)
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * The path of the main definition file for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-main)
     */
    override fun main(): String? = unwrap(this).getMain()

    /**
     * The workflow's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The workflow's parameter template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
     */
    override fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

    /**
     * The default storage capacity for the workflow runs, in gibibytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-storagecapacity)
     */
    override fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

    /**
     * Tags for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowProps):
        CfnWorkflowProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkflowProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowProps):
        software.amazon.awscdk.services.omics.CfnWorkflowProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.omics.CfnWorkflowProps
  }
}
