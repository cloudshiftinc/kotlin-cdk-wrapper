@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CloudFormation::WaitConditionHandle` type has no properties.
 *
 * When you reference the `WaitConditionHandle` resource by using the `Ref` function, CloudFormation
 * returns a presigned URL. You pass this URL to applications or scripts that are running on your
 * Amazon EC2 instances to send signals to that URL. An associated `AWS::CloudFormation::WaitCondition`
 * resource checks the URL for the required number of success signals or for a failure signal.
 *
 * For more information, see [Create wait conditions in a CloudFormation
 * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-waitcondition.html)
 * in the *AWS CloudFormation User Guide* .
 *
 * Anytime you add a `WaitCondition` resource during a stack update or update a resource with a wait
 * condition, you must associate the wait condition with a new `WaitConditionHandle` resource. Don't
 * reuse an old wait condition handle that has already been defined in the template. If you reuse a
 * wait condition handle, the wait condition might evaluate old signals from a previous create or
 * update stack command.
 *
 * Updates aren't supported for this resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnWaitConditionHandle cfnWaitConditionHandle = CfnWaitConditionHandle.Builder.create(this,
 * "MyCfnWaitConditionHandle").build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitconditionhandle.html)
 */
public open class CfnWaitConditionHandle(
  cdkObject: software.amazon.awscdk.CfnWaitConditionHandle,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.CfnWaitConditionHandle(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWaitConditionHandleProps,
  ) :
      this(software.amazon.awscdk.CfnWaitConditionHandle(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWaitConditionHandleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWaitConditionHandleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWaitConditionHandleProps(props)
  )

  /**
   * Returns a unique identifier for the resource.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnWaitConditionHandle].
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnWaitConditionHandle.Builder =
        software.amazon.awscdk.CfnWaitConditionHandle.Builder.create(scope, id)

    public fun build(): software.amazon.awscdk.CfnWaitConditionHandle = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnWaitConditionHandle.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWaitConditionHandle {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWaitConditionHandle(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnWaitConditionHandle):
        CfnWaitConditionHandle = CfnWaitConditionHandle(cdkObject)

    internal fun unwrap(wrapped: CfnWaitConditionHandle):
        software.amazon.awscdk.CfnWaitConditionHandle = wrapped.cdkObject as
        software.amazon.awscdk.CfnWaitConditionHandle
  }
}
