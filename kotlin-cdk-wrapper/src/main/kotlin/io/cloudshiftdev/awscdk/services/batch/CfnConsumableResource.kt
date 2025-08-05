@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Batch::ConsumableResource` resource specifies the parameters for an AWS Batch
 * consumable resource.
 *
 * For more information, see [Resource-aware
 * scheduling](https://docs.aws.amazon.com/batch/latest/userguide/resource-aware-scheduling.html) in
 * the ** .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * CfnConsumableResource cfnConsumableResource = CfnConsumableResource.Builder.create(this,
 * "MyCfnConsumableResource")
 * .resourceType("resourceType")
 * .totalQuantity(123)
 * // the properties below are optional
 * .consumableResourceName("consumableResourceName")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html)
 */
public open class CfnConsumableResource(
  cdkObject: software.amazon.awscdk.services.batch.CfnConsumableResource,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConsumableResourceProps,
  ) :
      this(software.amazon.awscdk.services.batch.CfnConsumableResource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConsumableResourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConsumableResourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConsumableResourceProps(props)
  )

  /**
   * The amount of the consumable resource that is currently available to use.
   */
  public open fun attrAvailableQuantity(): Number = unwrap(this).getAttrAvailableQuantity()

  /**
   * The Amazon Resource Name (ARN) of the consumable resource.
   */
  public open fun attrConsumableResourceArn(): String = unwrap(this).getAttrConsumableResourceArn()

  /**
   * The Unix timestamp (in milliseconds) for when the consumable resource was created.
   */
  public open fun attrCreatedAt(): Number = unwrap(this).getAttrCreatedAt()

  /**
   * The amount of the consumable resource that is currently in use.
   */
  public open fun attrInUseQuantity(): Number = unwrap(this).getAttrInUseQuantity()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the consumable resource.
   */
  public open fun consumableResourceName(): String? = unwrap(this).getConsumableResourceName()

  /**
   * The name of the consumable resource.
   */
  public open fun consumableResourceName(`value`: String) {
    unwrap(this).setConsumableResourceName(`value`)
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
   * Indicates whether the resource is available to be re-used after a job completes.
   *
   * Can be one of:.
   */
  public open fun resourceType(): String = unwrap(this).getResourceType()

  /**
   * Indicates whether the resource is available to be re-used after a job completes.
   *
   * Can be one of:.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * The tags that you apply to the consumable resource to help you categorize and organize your
   * resources.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The tags that you apply to the consumable resource to help you categorize and organize your
   * resources.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * The total amount of the consumable resource that is available.
   */
  public open fun totalQuantity(): Number = unwrap(this).getTotalQuantity()

  /**
   * The total amount of the consumable resource that is available.
   */
  public open fun totalQuantity(`value`: Number) {
    unwrap(this).setTotalQuantity(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.CfnConsumableResource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the consumable resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-consumableresourcename)
     * @param consumableResourceName The name of the consumable resource. 
     */
    public fun consumableResourceName(consumableResourceName: String)

    /**
     * Indicates whether the resource is available to be re-used after a job completes. Can be one
     * of:.
     *
     * * `REPLENISHABLE`
     * * `NON_REPLENISHABLE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-resourcetype)
     * @param resourceType Indicates whether the resource is available to be re-used after a job
     * completes. Can be one of:. 
     */
    public fun resourceType(resourceType: String)

    /**
     * The tags that you apply to the consumable resource to help you categorize and organize your
     * resources.
     *
     * Each tag consists of a key and an optional value. For more information, see [Tagging your AWS
     * Batch resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-tags)
     * @param tags The tags that you apply to the consumable resource to help you categorize and
     * organize your resources. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The total amount of the consumable resource that is available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-totalquantity)
     * @param totalQuantity The total amount of the consumable resource that is available. 
     */
    public fun totalQuantity(totalQuantity: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnConsumableResource.Builder =
        software.amazon.awscdk.services.batch.CfnConsumableResource.Builder.create(scope, id)

    /**
     * The name of the consumable resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-consumableresourcename)
     * @param consumableResourceName The name of the consumable resource. 
     */
    override fun consumableResourceName(consumableResourceName: String) {
      cdkBuilder.consumableResourceName(consumableResourceName)
    }

    /**
     * Indicates whether the resource is available to be re-used after a job completes. Can be one
     * of:.
     *
     * * `REPLENISHABLE`
     * * `NON_REPLENISHABLE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-resourcetype)
     * @param resourceType Indicates whether the resource is available to be re-used after a job
     * completes. Can be one of:. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * The tags that you apply to the consumable resource to help you categorize and organize your
     * resources.
     *
     * Each tag consists of a key and an optional value. For more information, see [Tagging your AWS
     * Batch resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-tags)
     * @param tags The tags that you apply to the consumable resource to help you categorize and
     * organize your resources. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The total amount of the consumable resource that is available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-consumableresource.html#cfn-batch-consumableresource-totalquantity)
     * @param totalQuantity The total amount of the consumable resource that is available. 
     */
    override fun totalQuantity(totalQuantity: Number) {
      cdkBuilder.totalQuantity(totalQuantity)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnConsumableResource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.batch.CfnConsumableResource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConsumableResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConsumableResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnConsumableResource):
        CfnConsumableResource = CfnConsumableResource(cdkObject)

    internal fun unwrap(wrapped: CfnConsumableResource):
        software.amazon.awscdk.services.batch.CfnConsumableResource = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.CfnConsumableResource
  }
}
