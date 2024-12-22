@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.m2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
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
 * import io.cloudshiftdev.awscdk.services.m2.*;
 * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
 * .applicationId("applicationId")
 * .applicationVersion(123)
 * .environmentId("environmentId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html)
 */
public interface CfnDeploymentProps {
  /**
   * The unique identifier of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-applicationid)
   */
  public fun applicationId(): String

  /**
   * The version of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-applicationversion)
   */
  public fun applicationVersion(): Number

  /**
   * The unique identifier of the runtime environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-environmentid)
   */
  public fun environmentId(): String

  /**
   * A builder for [CfnDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier of the application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param applicationVersion The version of the application. 
     */
    public fun applicationVersion(applicationVersion: Number)

    /**
     * @param environmentId The unique identifier of the runtime environment. 
     */
    public fun environmentId(environmentId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnDeploymentProps.Builder =
        software.amazon.awscdk.services.m2.CfnDeploymentProps.builder()

    /**
     * @param applicationId The unique identifier of the application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param applicationVersion The version of the application. 
     */
    override fun applicationVersion(applicationVersion: Number) {
      cdkBuilder.applicationVersion(applicationVersion)
    }

    /**
     * @param environmentId The unique identifier of the runtime environment. 
     */
    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnDeploymentProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.m2.CfnDeploymentProps,
  ) : CdkObject(cdkObject),
      CfnDeploymentProps {
    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The version of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-applicationversion)
     */
    override fun applicationVersion(): Number = unwrap(this).getApplicationVersion()

    /**
     * The unique identifier of the runtime environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-deployment.html#cfn-m2-deployment-environmentid)
     */
    override fun environmentId(): String = unwrap(this).getEnvironmentId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnDeploymentProps):
        CfnDeploymentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeploymentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentProps):
        software.amazon.awscdk.services.m2.CfnDeploymentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.m2.CfnDeploymentProps
  }
}
