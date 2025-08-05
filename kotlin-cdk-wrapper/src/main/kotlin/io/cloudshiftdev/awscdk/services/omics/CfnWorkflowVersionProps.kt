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
 * Properties for defining a `CfnWorkflowVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnWorkflowVersionProps cfnWorkflowVersionProps = CfnWorkflowVersionProps.builder()
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
public interface CfnWorkflowVersionProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-accelerators)
   */
  public fun accelerators(): String? = unwrap(this).getAccelerators()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-definitionuri)
   */
  public fun definitionUri(): String? = unwrap(this).getDefinitionUri()

  /**
   * The description of the workflow version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-engine)
   */
  public fun engine(): String? = unwrap(this).getEngine()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-main)
   */
  public fun main(): String? = unwrap(this).getMain()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-parametertemplate)
   */
  public fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-storagecapacity)
   */
  public fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-storagetype)
   */
  public fun storageType(): String? = unwrap(this).getStorageType()

  /**
   * A map of resource tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The name of the workflow version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-versionname)
   */
  public fun versionName(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-workflowbucketownerid)
   */
  public fun workflowBucketOwnerId(): String? = unwrap(this).getWorkflowBucketOwnerId()

  /**
   * The workflow's ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-workflowid)
   */
  public fun workflowId(): String

  /**
   * A builder for [CfnWorkflowVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accelerators the value to be set.
     */
    public fun accelerators(accelerators: String)

    /**
     * @param definitionUri the value to be set.
     */
    public fun definitionUri(definitionUri: String)

    /**
     * @param description The description of the workflow version.
     */
    public fun description(description: String)

    /**
     * @param engine the value to be set.
     */
    public fun engine(engine: String)

    /**
     * @param main the value to be set.
     */
    public fun main(main: String)

    /**
     * @param parameterTemplate the value to be set.
     */
    public fun parameterTemplate(parameterTemplate: IResolvable)

    /**
     * @param parameterTemplate the value to be set.
     */
    public fun parameterTemplate(parameterTemplate: Map<String, Any>)

    /**
     * @param storageCapacity the value to be set.
     */
    public fun storageCapacity(storageCapacity: Number)

    /**
     * @param storageType the value to be set.
     */
    public fun storageType(storageType: String)

    /**
     * @param tags A map of resource tags.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param versionName The name of the workflow version. 
     */
    public fun versionName(versionName: String)

    /**
     * @param workflowBucketOwnerId the value to be set.
     */
    public fun workflowBucketOwnerId(workflowBucketOwnerId: String)

    /**
     * @param workflowId The workflow's ID. 
     */
    public fun workflowId(workflowId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnWorkflowVersionProps.Builder =
        software.amazon.awscdk.services.omics.CfnWorkflowVersionProps.builder()

    /**
     * @param accelerators the value to be set.
     */
    override fun accelerators(accelerators: String) {
      cdkBuilder.accelerators(accelerators)
    }

    /**
     * @param definitionUri the value to be set.
     */
    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * @param description The description of the workflow version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine the value to be set.
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * @param main the value to be set.
     */
    override fun main(main: String) {
      cdkBuilder.main(main)
    }

    /**
     * @param parameterTemplate the value to be set.
     */
    override fun parameterTemplate(parameterTemplate: IResolvable) {
      cdkBuilder.parameterTemplate(parameterTemplate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param parameterTemplate the value to be set.
     */
    override fun parameterTemplate(parameterTemplate: Map<String, Any>) {
      cdkBuilder.parameterTemplate(parameterTemplate.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param storageCapacity the value to be set.
     */
    override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    /**
     * @param storageType the value to be set.
     */
    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    /**
     * @param tags A map of resource tags.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param versionName The name of the workflow version. 
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    /**
     * @param workflowBucketOwnerId the value to be set.
     */
    override fun workflowBucketOwnerId(workflowBucketOwnerId: String) {
      cdkBuilder.workflowBucketOwnerId(workflowBucketOwnerId)
    }

    /**
     * @param workflowId The workflow's ID. 
     */
    override fun workflowId(workflowId: String) {
      cdkBuilder.workflowId(workflowId)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnWorkflowVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowVersionProps,
  ) : CdkObject(cdkObject),
      CfnWorkflowVersionProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-accelerators)
     */
    override fun accelerators(): String? = unwrap(this).getAccelerators()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-definitionuri)
     */
    override fun definitionUri(): String? = unwrap(this).getDefinitionUri()

    /**
     * The description of the workflow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-engine)
     */
    override fun engine(): String? = unwrap(this).getEngine()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-main)
     */
    override fun main(): String? = unwrap(this).getMain()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-parametertemplate)
     */
    override fun parameterTemplate(): Any? = unwrap(this).getParameterTemplate()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-storagecapacity)
     */
    override fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-storagetype)
     */
    override fun storageType(): String? = unwrap(this).getStorageType()

    /**
     * A map of resource tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The name of the workflow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-versionname)
     */
    override fun versionName(): String = unwrap(this).getVersionName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-workflowbucketownerid)
     */
    override fun workflowBucketOwnerId(): String? = unwrap(this).getWorkflowBucketOwnerId()

    /**
     * The workflow's ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflowversion.html#cfn-omics-workflowversion-workflowid)
     */
    override fun workflowId(): String = unwrap(this).getWorkflowId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnWorkflowVersionProps):
        CfnWorkflowVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkflowVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowVersionProps):
        software.amazon.awscdk.services.omics.CfnWorkflowVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnWorkflowVersionProps
  }
}
