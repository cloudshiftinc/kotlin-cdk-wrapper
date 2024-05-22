@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * For Amazon EC2 and Auto Scaling resources, we recommend that you use a `CreationPolicy` attribute
 * instead of wait conditions.
 *
 * Add a CreationPolicy attribute to those resources, and use the cfn-signal helper script to signal
 * when an instance creation process has completed successfully.
 *
 * You can use a wait condition for situations like the following:
 *
 * * To coordinate stack resource creation with configuration actions that are external to the stack
 * creation.
 * * To track the status of a configuration process.
 *
 * For these situations, we recommend that you associate a
 * [CreationPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-creationpolicy.html)
 * attribute with the wait condition so that you don't have to use a wait condition handle. For more
 * information and an example, see [Creating wait conditions in a
 * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-waitcondition.html)
 * . If you use a CreationPolicy with a wait condition, don't specify any of the wait condition's
 * properties.
 *
 *
 * If you use the [VPC
 * endpoints](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html) feature, resources
 * in the VPC that respond to wait conditions must have access to CloudFormation , specific Amazon
 * Simple Storage Service ( Amazon S3 ) buckets. Resources must send wait condition responses to a
 * presigned Amazon S3 URL. If they can't send responses to Amazon S3 , CloudFormation won't receive a
 * response and the stack operation fails. For more information, see [Setting up VPC endpoints for AWS
 * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-vpce-bucketnames.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnWaitCondition cfnWaitCondition = CfnWaitCondition.Builder.create(this, "MyCfnWaitCondition")
 * .count(123)
 * .handle("handle")
 * .timeout("timeout")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html)
 */
public open class CfnWaitCondition(
  cdkObject: software.amazon.awscdk.services.cloudformation.CfnWaitCondition,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudformation.CfnWaitCondition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWaitConditionProps,
  ) :
      this(software.amazon.awscdk.services.cloudformation.CfnWaitCondition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWaitConditionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWaitConditionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWaitConditionProps(props)
  )

  /**
   *
   */
  public open fun attrData(): IResolvable = unwrap(this).getAttrData().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The number of success signals that CloudFormation must receive before it continues the stack
   * creation process.
   */
  public open fun count(): Number? = unwrap(this).getCount()

  /**
   * The number of success signals that CloudFormation must receive before it continues the stack
   * creation process.
   */
  public open fun count(`value`: Number) {
    unwrap(this).setCount(`value`)
  }

  /**
   * A reference to the wait condition handle used to signal this wait condition.
   */
  public open fun handle(): String? = unwrap(this).getHandle()

  /**
   * A reference to the wait condition handle used to signal this wait condition.
   */
  public open fun handle(`value`: String) {
    unwrap(this).setHandle(`value`)
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
   * The length of time (in seconds) to wait for the number of signals that the `Count` property
   * specifies.
   */
  public open fun timeout(): String? = unwrap(this).getTimeout()

  /**
   * The length of time (in seconds) to wait for the number of signals that the `Count` property
   * specifies.
   */
  public open fun timeout(`value`: String) {
    unwrap(this).setTimeout(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudformation.CfnWaitCondition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of success signals that CloudFormation must receive before it continues the stack
     * creation process.
     *
     * When the wait condition receives the requisite number of success signals, CloudFormation
     * resumes the creation of the stack. If the wait condition doesn't receive the specified number of
     * success signals before the Timeout period expires, CloudFormation assumes that the wait
     * condition has failed and rolls the stack back.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-count)
     * @param count The number of success signals that CloudFormation must receive before it
     * continues the stack creation process. 
     */
    public fun count(count: Number)

    /**
     * A reference to the wait condition handle used to signal this wait condition.
     *
     * Use the `Ref` intrinsic function to specify an
     * [`AWS::CloudFormation::WaitConditionHandle`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
     * resource.
     *
     * Anytime you add a `WaitCondition` resource during a stack update, you must associate the wait
     * condition with a new WaitConditionHandle resource. Don't reuse an old wait condition handle that
     * has already been defined in the template. If you reuse a wait condition handle, the wait
     * condition might evaluate old signals from a previous create or update stack command.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-handle)
     * @param handle A reference to the wait condition handle used to signal this wait condition. 
     */
    public fun handle(handle: String)

    /**
     * The length of time (in seconds) to wait for the number of signals that the `Count` property
     * specifies.
     *
     * `Timeout` is a minimum-bound property, meaning the timeout occurs no sooner than the time you
     * specify, but can occur shortly thereafter. The maximum time that can be specified for this
     * property is 12 hours (43200 seconds).
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-timeout)
     * @param timeout The length of time (in seconds) to wait for the number of signals that the
     * `Count` property specifies. 
     */
    public fun timeout(timeout: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnWaitCondition.Builder
        = software.amazon.awscdk.services.cloudformation.CfnWaitCondition.Builder.create(scope, id)

    /**
     * The number of success signals that CloudFormation must receive before it continues the stack
     * creation process.
     *
     * When the wait condition receives the requisite number of success signals, CloudFormation
     * resumes the creation of the stack. If the wait condition doesn't receive the specified number of
     * success signals before the Timeout period expires, CloudFormation assumes that the wait
     * condition has failed and rolls the stack back.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-count)
     * @param count The number of success signals that CloudFormation must receive before it
     * continues the stack creation process. 
     */
    override fun count(count: Number) {
      cdkBuilder.count(count)
    }

    /**
     * A reference to the wait condition handle used to signal this wait condition.
     *
     * Use the `Ref` intrinsic function to specify an
     * [`AWS::CloudFormation::WaitConditionHandle`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waitconditionhandle.html)
     * resource.
     *
     * Anytime you add a `WaitCondition` resource during a stack update, you must associate the wait
     * condition with a new WaitConditionHandle resource. Don't reuse an old wait condition handle that
     * has already been defined in the template. If you reuse a wait condition handle, the wait
     * condition might evaluate old signals from a previous create or update stack command.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-handle)
     * @param handle A reference to the wait condition handle used to signal this wait condition. 
     */
    override fun handle(handle: String) {
      cdkBuilder.handle(handle)
    }

    /**
     * The length of time (in seconds) to wait for the number of signals that the `Count` property
     * specifies.
     *
     * `Timeout` is a minimum-bound property, meaning the timeout occurs no sooner than the time you
     * specify, but can occur shortly thereafter. The maximum time that can be specified for this
     * property is 12 hours (43200 seconds).
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html#cfn-cloudformation-waitcondition-timeout)
     * @param timeout The length of time (in seconds) to wait for the number of signals that the
     * `Count` property specifies. 
     */
    override fun timeout(timeout: String) {
      cdkBuilder.timeout(timeout)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnWaitCondition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnWaitCondition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWaitCondition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWaitCondition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnWaitCondition):
        CfnWaitCondition = CfnWaitCondition(cdkObject)

    internal fun unwrap(wrapped: CfnWaitCondition):
        software.amazon.awscdk.services.cloudformation.CfnWaitCondition = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnWaitCondition
  }
}
