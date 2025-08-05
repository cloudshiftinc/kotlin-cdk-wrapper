@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcs

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::PCS::Queue` resource creates an AWS PCS queue.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcs.*;
 * CfnQueue cfnQueue = CfnQueue.Builder.create(this, "MyCfnQueue")
 * .clusterId("clusterId")
 * // the properties below are optional
 * .computeNodeGroupConfigurations(List.of(ComputeNodeGroupConfigurationProperty.builder()
 * .computeNodeGroupId("computeNodeGroupId")
 * .build()))
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html)
 */
public open class CfnQueue(
  cdkObject: software.amazon.awscdk.services.pcs.CfnQueue,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps,
  ) :
      this(software.amazon.awscdk.services.pcs.CfnQueue(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnQueueProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueueProps(props)
  )

  /**
   * The unique Amazon Resource Name (ARN) of the queue.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The list of errors that occurred during queue provisioning.
   */
  public open fun attrErrorInfo(): IResolvable =
      unwrap(this).getAttrErrorInfo().let(IResolvable::wrap)

  /**
   * The generated unique ID of the queue.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The provisioning status of the queue.
   *
   * The provisioning status doesn't indicate the overall health of the queue.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ID of the cluster of the queue.
   */
  public open fun clusterId(): String = unwrap(this).getClusterId()

  /**
   * The ID of the cluster of the queue.
   */
  public open fun clusterId(`value`: String) {
    unwrap(this).setClusterId(`value`)
  }

  /**
   * The list of compute node group configurations associated with the queue.
   */
  public open fun computeNodeGroupConfigurations(): Any? =
      unwrap(this).getComputeNodeGroupConfigurations()

  /**
   * The list of compute node group configurations associated with the queue.
   */
  public open fun computeNodeGroupConfigurations(`value`: IResolvable) {
    unwrap(this).setComputeNodeGroupConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The list of compute node group configurations associated with the queue.
   */
  public open fun computeNodeGroupConfigurations(`value`: List<Any>) {
    unwrap(this).setComputeNodeGroupConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The list of compute node group configurations associated with the queue.
   */
  public open fun computeNodeGroupConfigurations(vararg `value`: Any): Unit =
      computeNodeGroupConfigurations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name that identifies the queue.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name that identifies the queue.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * 1 or more tags added to the resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * 1 or more tags added to the resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pcs.CfnQueue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the cluster of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-clusterid)
     * @param clusterId The ID of the cluster of the queue. 
     */
    public fun clusterId(clusterId: String)

    /**
     * The list of compute node group configurations associated with the queue.
     *
     * Queues assign jobs to associated compute node groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-computenodegroupconfigurations)
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue. 
     */
    public fun computeNodeGroupConfigurations(computeNodeGroupConfigurations: IResolvable)

    /**
     * The list of compute node group configurations associated with the queue.
     *
     * Queues assign jobs to associated compute node groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-computenodegroupconfigurations)
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue. 
     */
    public fun computeNodeGroupConfigurations(computeNodeGroupConfigurations: List<Any>)

    /**
     * The list of compute node group configurations associated with the queue.
     *
     * Queues assign jobs to associated compute node groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-computenodegroupconfigurations)
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue. 
     */
    public fun computeNodeGroupConfigurations(vararg computeNodeGroupConfigurations: Any)

    /**
     * The name that identifies the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-name)
     * @param name The name that identifies the queue. 
     */
    public fun name(name: String)

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-tags)
     * @param tags 1 or more tags added to the resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcs.CfnQueue.Builder =
        software.amazon.awscdk.services.pcs.CfnQueue.Builder.create(scope, id)

    /**
     * The ID of the cluster of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-clusterid)
     * @param clusterId The ID of the cluster of the queue. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * The list of compute node group configurations associated with the queue.
     *
     * Queues assign jobs to associated compute node groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-computenodegroupconfigurations)
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue. 
     */
    override fun computeNodeGroupConfigurations(computeNodeGroupConfigurations: IResolvable) {
      cdkBuilder.computeNodeGroupConfigurations(computeNodeGroupConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * The list of compute node group configurations associated with the queue.
     *
     * Queues assign jobs to associated compute node groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-computenodegroupconfigurations)
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue. 
     */
    override fun computeNodeGroupConfigurations(computeNodeGroupConfigurations: List<Any>) {
      cdkBuilder.computeNodeGroupConfigurations(computeNodeGroupConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The list of compute node group configurations associated with the queue.
     *
     * Queues assign jobs to associated compute node groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-computenodegroupconfigurations)
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue. 
     */
    override fun computeNodeGroupConfigurations(vararg computeNodeGroupConfigurations: Any): Unit =
        computeNodeGroupConfigurations(computeNodeGroupConfigurations.toList())

    /**
     * The name that identifies the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-name)
     * @param name The name that identifies the queue. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-tags)
     * @param tags 1 or more tags added to the resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcs.CfnQueue = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcs.CfnQueue.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnQueue): CfnQueue =
        CfnQueue(cdkObject)

    internal fun unwrap(wrapped: CfnQueue): software.amazon.awscdk.services.pcs.CfnQueue =
        wrapped.cdkObject as software.amazon.awscdk.services.pcs.CfnQueue
  }

  /**
   * The compute node group configuration for a queue.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * ComputeNodeGroupConfigurationProperty computeNodeGroupConfigurationProperty =
   * ComputeNodeGroupConfigurationProperty.builder()
   * .computeNodeGroupId("computeNodeGroupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-queue-computenodegroupconfiguration.html)
   */
  public interface ComputeNodeGroupConfigurationProperty {
    /**
     * The compute node group ID for the compute node group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-queue-computenodegroupconfiguration.html#cfn-pcs-queue-computenodegroupconfiguration-computenodegroupid)
     */
    public fun computeNodeGroupId(): String? = unwrap(this).getComputeNodeGroupId()

    /**
     * A builder for [ComputeNodeGroupConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computeNodeGroupId The compute node group ID for the compute node group
       * configuration.
       */
      public fun computeNodeGroupId(computeNodeGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcs.CfnQueue.ComputeNodeGroupConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pcs.CfnQueue.ComputeNodeGroupConfigurationProperty.builder()

      /**
       * @param computeNodeGroupId The compute node group ID for the compute node group
       * configuration.
       */
      override fun computeNodeGroupId(computeNodeGroupId: String) {
        cdkBuilder.computeNodeGroupId(computeNodeGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.pcs.CfnQueue.ComputeNodeGroupConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnQueue.ComputeNodeGroupConfigurationProperty,
    ) : CdkObject(cdkObject),
        ComputeNodeGroupConfigurationProperty {
      /**
       * The compute node group ID for the compute node group configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-queue-computenodegroupconfiguration.html#cfn-pcs-queue-computenodegroupconfiguration-computenodegroupid)
       */
      override fun computeNodeGroupId(): String? = unwrap(this).getComputeNodeGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComputeNodeGroupConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnQueue.ComputeNodeGroupConfigurationProperty):
          ComputeNodeGroupConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComputeNodeGroupConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeNodeGroupConfigurationProperty):
          software.amazon.awscdk.services.pcs.CfnQueue.ComputeNodeGroupConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcs.CfnQueue.ComputeNodeGroupConfigurationProperty
    }
  }

  /**
   * An error that occurred during resource provisioning.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pcs.*;
   * ErrorInfoProperty errorInfoProperty = ErrorInfoProperty.builder()
   * .code("code")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-queue-errorinfo.html)
   */
  public interface ErrorInfoProperty {
    /**
     * The short-form error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-queue-errorinfo.html#cfn-pcs-queue-errorinfo-code)
     */
    public fun code(): String? = unwrap(this).getCode()

    /**
     * TBDThe detailed error information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-queue-errorinfo.html#cfn-pcs-queue-errorinfo-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * A builder for [ErrorInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param code The short-form error code.
       */
      public fun code(code: String)

      /**
       * @param message TBDThe detailed error information.
       */
      public fun message(message: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.pcs.CfnQueue.ErrorInfoProperty.Builder
          = software.amazon.awscdk.services.pcs.CfnQueue.ErrorInfoProperty.builder()

      /**
       * @param code The short-form error code.
       */
      override fun code(code: String) {
        cdkBuilder.code(code)
      }

      /**
       * @param message TBDThe detailed error information.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      public fun build(): software.amazon.awscdk.services.pcs.CfnQueue.ErrorInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pcs.CfnQueue.ErrorInfoProperty,
    ) : CdkObject(cdkObject),
        ErrorInfoProperty {
      /**
       * The short-form error code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-queue-errorinfo.html#cfn-pcs-queue-errorinfo-code)
       */
      override fun code(): String? = unwrap(this).getCode()

      /**
       * TBDThe detailed error information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcs-queue-errorinfo.html#cfn-pcs-queue-errorinfo-message)
       */
      override fun message(): String? = unwrap(this).getMessage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ErrorInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnQueue.ErrorInfoProperty):
          ErrorInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ErrorInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ErrorInfoProperty):
          software.amazon.awscdk.services.pcs.CfnQueue.ErrorInfoProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnQueue.ErrorInfoProperty
    }
  }
}
