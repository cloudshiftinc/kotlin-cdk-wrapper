@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a limit that manages the distribution of shared resources, such as floating licenses.
 *
 * A limit can throttle work assignments, help manage workloads, and track current usage. Before you
 * use a limit, you must associate the limit with one or more queues.
 *
 * You must add the `amountRequirementName` to a step in a job template to declare the limit
 * requirement.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnLimit cfnLimit = CfnLimit.Builder.create(this, "MyCfnLimit")
 * .amountRequirementName("amountRequirementName")
 * .displayName("displayName")
 * .farmId("farmId")
 * .maxCount(123)
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html)
 */
public open class CfnLimit(
  cdkObject: software.amazon.awscdk.services.deadline.CfnLimit,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLimitProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnLimit(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLimitProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLimitProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLimitProps(props)
  )

  /**
   * The value that you specify as the `name` in the `amounts` field of the `hostRequirements` in a
   * step of a job template to declare the limit requirement.
   */
  public open fun amountRequirementName(): String = unwrap(this).getAmountRequirementName()

  /**
   * The value that you specify as the `name` in the `amounts` field of the `hostRequirements` in a
   * step of a job template to declare the limit requirement.
   */
  public open fun amountRequirementName(`value`: String) {
    unwrap(this).setAmountRequirementName(`value`)
  }

  /**
   * The number of resources from the limit that are being used by jobs.
   *
   * The result is delayed and may not be the count at the time that you called the operation.
   */
  public open fun attrCurrentCount(): Number = unwrap(this).getAttrCurrentCount()

  /**
   * The unique identifier of the limit.
   */
  public open fun attrLimitId(): String = unwrap(this).getAttrLimitId()

  /**
   * A description of the limit.
   *
   * A clear description helps you identify the purpose of the limit.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the limit.
   *
   * A clear description helps you identify the purpose of the limit.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the limit used in lists to identify the limit.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The name of the limit used in lists to identify the limit.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The unique identifier of the farm that contains the limit.
   */
  public open fun farmId(): String = unwrap(this).getFarmId()

  /**
   * The unique identifier of the farm that contains the limit.
   */
  public open fun farmId(`value`: String) {
    unwrap(this).setFarmId(`value`)
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
   * The maximum number of resources constrained by this limit.
   */
  public open fun maxCount(): Number = unwrap(this).getMaxCount()

  /**
   * The maximum number of resources constrained by this limit.
   */
  public open fun maxCount(`value`: Number) {
    unwrap(this).setMaxCount(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnLimit].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The value that you specify as the `name` in the `amounts` field of the `hostRequirements` in
     * a step of a job template to declare the limit requirement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-amountrequirementname)
     * @param amountRequirementName The value that you specify as the `name` in the `amounts` field
     * of the `hostRequirements` in a step of a job template to declare the limit requirement. 
     */
    public fun amountRequirementName(amountRequirementName: String)

    /**
     * A description of the limit. A clear description helps you identify the purpose of the limit.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-description)
     * @param description A description of the limit. A clear description helps you identify the
     * purpose of the limit. 
     */
    public fun description(description: String)

    /**
     * The name of the limit used in lists to identify the limit.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-displayname)
     * @param displayName The name of the limit used in lists to identify the limit. 
     */
    public fun displayName(displayName: String)

    /**
     * The unique identifier of the farm that contains the limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-farmid)
     * @param farmId The unique identifier of the farm that contains the limit. 
     */
    public fun farmId(farmId: String)

    /**
     * The maximum number of resources constrained by this limit.
     *
     * When all of the resources are in use, steps that require the limit won't be scheduled until
     * the resource is available.
     *
     * The `maxValue` must not be 0. If the value is -1, there is no restriction on the number of
     * resources that can be acquired for this limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-maxcount)
     * @param maxCount The maximum number of resources constrained by this limit. 
     */
    public fun maxCount(maxCount: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnLimit.Builder =
        software.amazon.awscdk.services.deadline.CfnLimit.Builder.create(scope, id)

    /**
     * The value that you specify as the `name` in the `amounts` field of the `hostRequirements` in
     * a step of a job template to declare the limit requirement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-amountrequirementname)
     * @param amountRequirementName The value that you specify as the `name` in the `amounts` field
     * of the `hostRequirements` in a step of a job template to declare the limit requirement. 
     */
    override fun amountRequirementName(amountRequirementName: String) {
      cdkBuilder.amountRequirementName(amountRequirementName)
    }

    /**
     * A description of the limit. A clear description helps you identify the purpose of the limit.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-description)
     * @param description A description of the limit. A clear description helps you identify the
     * purpose of the limit. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the limit used in lists to identify the limit.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-displayname)
     * @param displayName The name of the limit used in lists to identify the limit. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The unique identifier of the farm that contains the limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-farmid)
     * @param farmId The unique identifier of the farm that contains the limit. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * The maximum number of resources constrained by this limit.
     *
     * When all of the resources are in use, steps that require the limit won't be scheduled until
     * the resource is available.
     *
     * The `maxValue` must not be 0. If the value is -1, there is no restriction on the number of
     * resources that can be acquired for this limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-limit.html#cfn-deadline-limit-maxcount)
     * @param maxCount The maximum number of resources constrained by this limit. 
     */
    override fun maxCount(maxCount: Number) {
      cdkBuilder.maxCount(maxCount)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnLimit = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnLimit.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLimit {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLimit(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnLimit): CfnLimit =
        CfnLimit(cdkObject)

    internal fun unwrap(wrapped: CfnLimit): software.amazon.awscdk.services.deadline.CfnLimit =
        wrapped.cdkObject as software.amazon.awscdk.services.deadline.CfnLimit
  }
}
