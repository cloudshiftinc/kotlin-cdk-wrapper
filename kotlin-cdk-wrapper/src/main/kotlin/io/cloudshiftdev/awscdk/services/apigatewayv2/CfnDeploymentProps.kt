@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDeployment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
 * .apiId("apiId")
 * // the properties below are optional
 * .description("description")
 * .stageName("stageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html)
 */
public interface CfnDeploymentProps {
  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html#cfn-apigatewayv2-deployment-apiid)
   */
  public fun apiId(): String

  /**
   * The description for the deployment resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html#cfn-apigatewayv2-deployment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of an existing stage to associate with the deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html#cfn-apigatewayv2-deployment-stagename)
   */
  public fun stageName(): String? = unwrap(this).getStageName()

  /**
   * A builder for [CfnDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * @param description The description for the deployment resource.
     */
    public fun description(description: String)

    /**
     * @param stageName The name of an existing stage to associate with the deployment.
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps.builder()

    /**
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param description The description for the deployment resource.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param stageName The name of an existing stage to associate with the deployment.
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps,
  ) : CdkObject(cdkObject), CfnDeploymentProps {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html#cfn-apigatewayv2-deployment-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The description for the deployment resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html#cfn-apigatewayv2-deployment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of an existing stage to associate with the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html#cfn-apigatewayv2-deployment-stagename)
     */
    override fun stageName(): String? = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps):
        CfnDeploymentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeploymentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentProps):
        software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps
  }
}
