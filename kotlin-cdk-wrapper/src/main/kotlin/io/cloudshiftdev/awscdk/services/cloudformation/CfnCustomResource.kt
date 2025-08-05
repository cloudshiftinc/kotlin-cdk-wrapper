@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

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
 * The `AWS::CloudFormation::CustomResource` resource creates a custom resource.
 *
 * Custom resources provide a way for you to write custom provisioning logic into your
 * CloudFormation templates and have CloudFormation run it anytime you create, update (if you changed
 * the custom resource), or delete a stack.
 *
 * For more information, see [Create custom provisioning logic with custom
 * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-custom-resources.html)
 * in the *AWS CloudFormation User Guide* .
 *
 *
 * If you use AWS PrivateLink , custom resources in the VPC must have access to
 * CloudFormation -specific Amazon S3 buckets. Custom resources must send responses to a presigned
 * Amazon S3 URL. If they can't send responses to Amazon S3 , CloudFormation won't receive a response
 * and the stack operation fails. For more information, see [Access CloudFormation using an interface
 * endpoint ( AWS PrivateLink
 * )](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/vpc-interface-endpoints.html) in
 * the *AWS CloudFormation User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnCustomResource cfnCustomResource = CfnCustomResource.Builder.create(this,
 * "MyCfnCustomResource")
 * .serviceToken("serviceToken")
 * // the properties below are optional
 * .serviceTimeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
 */
public open class CfnCustomResource(
  cdkObject: software.amazon.awscdk.services.cloudformation.CfnCustomResource,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomResourceProps,
  ) :
      this(software.amazon.awscdk.services.cloudformation.CfnCustomResource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCustomResourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomResourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomResourceProps(props)
  )

  /**
   *
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
   * The maximum time, in seconds, that can elapse before a custom resource operation times out.
   */
  public open fun serviceTimeout(): Number? = unwrap(this).getServiceTimeout()

  /**
   * The maximum time, in seconds, that can elapse before a custom resource operation times out.
   */
  public open fun serviceTimeout(`value`: Number) {
    unwrap(this).setServiceTimeout(`value`)
  }

  /**
   * The service token, such as an Amazon SNS topic ARN or Lambda function ARN.
   */
  public open fun serviceToken(): String = unwrap(this).getServiceToken()

  /**
   * The service token, such as an Amazon SNS topic ARN or Lambda function ARN.
   */
  public open fun serviceToken(`value`: String) {
    unwrap(this).setServiceToken(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudformation.CfnCustomResource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The maximum time, in seconds, that can elapse before a custom resource operation times out.
     *
     * The value must be an integer from 1 to 3600. The default value is 3600 seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetimeout)
     * @param serviceTimeout The maximum time, in seconds, that can elapse before a custom resource
     * operation times out. 
     */
    public fun serviceTimeout(serviceTimeout: Number)

    /**
     * The service token, such as an Amazon SNS topic ARN or Lambda function ARN.
     *
     * The service token must be from the same Region as the stack.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetoken)
     * @param serviceToken The service token, such as an Amazon SNS topic ARN or Lambda function
     * ARN. 
     */
    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnCustomResource.Builder
        = software.amazon.awscdk.services.cloudformation.CfnCustomResource.Builder.create(scope, id)

    /**
     * The maximum time, in seconds, that can elapse before a custom resource operation times out.
     *
     * The value must be an integer from 1 to 3600. The default value is 3600 seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetimeout)
     * @param serviceTimeout The maximum time, in seconds, that can elapse before a custom resource
     * operation times out. 
     */
    override fun serviceTimeout(serviceTimeout: Number) {
      cdkBuilder.serviceTimeout(serviceTimeout)
    }

    /**
     * The service token, such as an Amazon SNS topic ARN or Lambda function ARN.
     *
     * The service token must be from the same Region as the stack.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetoken)
     * @param serviceToken The service token, such as an Amazon SNS topic ARN or Lambda function
     * ARN. 
     */
    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnCustomResource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnCustomResource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnCustomResource):
        CfnCustomResource = CfnCustomResource(cdkObject)

    internal fun unwrap(wrapped: CfnCustomResource):
        software.amazon.awscdk.services.cloudformation.CfnCustomResource = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnCustomResource
  }
}
