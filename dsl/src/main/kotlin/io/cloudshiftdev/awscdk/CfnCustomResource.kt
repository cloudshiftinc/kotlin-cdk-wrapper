package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomResource internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnCustomResource,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Only one property is defined by AWS for a custom resource: `ServiceToken` .
   */
  public open fun serviceToken(): String = unwrap(this).getServiceToken()

  /**
   * Only one property is defined by AWS for a custom resource: `ServiceToken` .
   */
  public open fun serviceToken(`value`: String) {
    unwrap(this).setServiceToken(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnCustomResource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Only one property is defined by AWS for a custom resource: `ServiceToken` .
     *
     * All other properties are defined by the service provider.
     *
     * The service token that was given to the template developer by the service provider to access
     * the service, such as an Amazon SNS topic ARN or Lambda function ARN. The service token must be
     * from the same Region in which you are creating the stack.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetoken)
     * @param serviceToken Only one property is defined by AWS for a custom resource: `ServiceToken`
     * . 
     */
    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCustomResource.Builder =
        software.amazon.awscdk.CfnCustomResource.Builder.create(scope, id)

    /**
     * Only one property is defined by AWS for a custom resource: `ServiceToken` .
     *
     * All other properties are defined by the service provider.
     *
     * The service token that was given to the template developer by the service provider to access
     * the service, such as an Amazon SNS topic ARN or Lambda function ARN. The service token must be
     * from the same Region in which you are creating the stack.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetoken)
     * @param serviceToken Only one property is defined by AWS for a custom resource: `ServiceToken`
     * . 
     */
    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.CfnCustomResource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCustomResource): CfnCustomResource =
        CfnCustomResource(cdkObject)

    internal fun unwrap(wrapped: CfnCustomResource): software.amazon.awscdk.CfnCustomResource =
        wrapped.cdkObject
  }
}
