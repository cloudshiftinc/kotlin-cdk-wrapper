package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnCustomResourceProps {
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
   */
  public fun serviceToken(): String

  /**
   * A builder for [CfnCustomResourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param serviceToken Only one property is defined by AWS for a custom resource: `ServiceToken`
     * . 
     * All other properties are defined by the service provider.
     *
     * The service token that was given to the template developer by the service provider to access
     * the service, such as an Amazon SNS topic ARN or Lambda function ARN. The service token must be
     * from the same Region in which you are creating the stack.
     *
     * Updates aren't supported.
     */
    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCustomResourceProps.Builder =
        software.amazon.awscdk.CfnCustomResourceProps.builder()

    /**
     * @param serviceToken Only one property is defined by AWS for a custom resource: `ServiceToken`
     * . 
     * All other properties are defined by the service provider.
     *
     * The service token that was given to the template developer by the service provider to access
     * the service, such as an Amazon SNS topic ARN or Lambda function ARN. The service token must be
     * from the same Region in which you are creating the stack.
     *
     * Updates aren't supported.
     */
    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.CfnCustomResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCustomResourceProps,
  ) : CdkObject(cdkObject), CfnCustomResourceProps {
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
     */
    override fun serviceToken(): String = unwrap(this).getServiceToken()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCustomResourceProps):
        CfnCustomResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomResourceProps):
        software.amazon.awscdk.CfnCustomResourceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnCustomResourceProps
  }
}
