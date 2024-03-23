@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnCustomResourceProps cfnCustomResourceProps = CfnCustomResourceProps.builder()
 * .serviceToken("serviceToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
 */
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
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.builder()

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

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps,
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

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps):
        CfnCustomResourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomResourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomResourceProps):
        software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps
  }
}
