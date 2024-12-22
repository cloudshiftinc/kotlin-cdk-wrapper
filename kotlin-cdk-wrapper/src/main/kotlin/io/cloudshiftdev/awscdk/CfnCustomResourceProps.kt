@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnCustomResource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnCustomResourceProps cfnCustomResourceProps = CfnCustomResourceProps.builder()
 * .serviceToken("serviceToken")
 * // the properties below are optional
 * .serviceTimeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
 */
public interface CfnCustomResourceProps {
  /**
   * The maximum time, in seconds, that can elapse before a custom resource operation times out.
   *
   * The value must be an integer from 1 to 3600. The default value is 3600 seconds (1 hour).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetimeout)
   */
  public fun serviceTimeout(): Number? = unwrap(this).getServiceTimeout()

  /**
   * The service token, such as an Amazon SNS topic ARN or Lambda function ARN.
   *
   * The service token must be from the same Region as the stack.
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
     * @param serviceTimeout The maximum time, in seconds, that can elapse before a custom resource
     * operation times out.
     * The value must be an integer from 1 to 3600. The default value is 3600 seconds (1 hour).
     */
    public fun serviceTimeout(serviceTimeout: Number)

    /**
     * @param serviceToken The service token, such as an Amazon SNS topic ARN or Lambda function
     * ARN. 
     * The service token must be from the same Region as the stack.
     *
     * Updates aren't supported.
     */
    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCustomResourceProps.Builder =
        software.amazon.awscdk.CfnCustomResourceProps.builder()

    /**
     * @param serviceTimeout The maximum time, in seconds, that can elapse before a custom resource
     * operation times out.
     * The value must be an integer from 1 to 3600. The default value is 3600 seconds (1 hour).
     */
    override fun serviceTimeout(serviceTimeout: Number) {
      cdkBuilder.serviceTimeout(serviceTimeout)
    }

    /**
     * @param serviceToken The service token, such as an Amazon SNS topic ARN or Lambda function
     * ARN. 
     * The service token must be from the same Region as the stack.
     *
     * Updates aren't supported.
     */
    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.CfnCustomResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnCustomResourceProps,
  ) : CdkObject(cdkObject),
      CfnCustomResourceProps {
    /**
     * The maximum time, in seconds, that can elapse before a custom resource operation times out.
     *
     * The value must be an integer from 1 to 3600. The default value is 3600 seconds (1 hour).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetimeout)
     */
    override fun serviceTimeout(): Number? = unwrap(this).getServiceTimeout()

    /**
     * The service token, such as an Amazon SNS topic ARN or Lambda function ARN.
     *
     * The service token must be from the same Region as the stack.
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
        CfnCustomResourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomResourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomResourceProps):
        software.amazon.awscdk.CfnCustomResourceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnCustomResourceProps
  }
}
