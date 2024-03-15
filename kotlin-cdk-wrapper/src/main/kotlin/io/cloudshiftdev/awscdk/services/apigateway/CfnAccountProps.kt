@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAccount`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnAccountProps cfnAccountProps = CfnAccountProps.builder()
 * .cloudWatchRoleArn("cloudWatchRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html)
 */
public interface CfnAccountProps {
  /**
   * The ARN of an Amazon CloudWatch role for the current Account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn)
   */
  public fun cloudWatchRoleArn(): String? = unwrap(this).getCloudWatchRoleArn()

  /**
   * A builder for [CfnAccountProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cloudWatchRoleArn The ARN of an Amazon CloudWatch role for the current Account.
     */
    public fun cloudWatchRoleArn(cloudWatchRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnAccountProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnAccountProps.builder()

    /**
     * @param cloudWatchRoleArn The ARN of an Amazon CloudWatch role for the current Account.
     */
    override fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
      cdkBuilder.cloudWatchRoleArn(cloudWatchRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnAccountProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnAccountProps,
  ) : CdkObject(cdkObject), CfnAccountProps {
    /**
     * The ARN of an Amazon CloudWatch role for the current Account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-account.html#cfn-apigateway-account-cloudwatchrolearn)
     */
    override fun cloudWatchRoleArn(): String? = unwrap(this).getCloudWatchRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnAccountProps):
        CfnAccountProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountProps):
        software.amazon.awscdk.services.apigateway.CfnAccountProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnAccountProps
  }
}
