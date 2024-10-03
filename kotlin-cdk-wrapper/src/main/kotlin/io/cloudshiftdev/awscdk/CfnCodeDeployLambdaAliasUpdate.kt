@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * To perform an AWS CodeDeploy deployment when the version changes on an AWS::Lambda::Alias
 * resource, use the CodeDeployLambdaAliasUpdate update policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnCodeDeployLambdaAliasUpdate cfnCodeDeployLambdaAliasUpdate =
 * CfnCodeDeployLambdaAliasUpdate.builder()
 * .applicationName("applicationName")
 * .deploymentGroupName("deploymentGroupName")
 * // the properties below are optional
 * .afterAllowTrafficHook("afterAllowTrafficHook")
 * .beforeAllowTrafficHook("beforeAllowTrafficHook")
 * .build();
 * ```
 */
public interface CfnCodeDeployLambdaAliasUpdate {
  /**
   * The name of the Lambda function to run after traffic routing completes.
   */
  public fun afterAllowTrafficHook(): String? = unwrap(this).getAfterAllowTrafficHook()

  /**
   * The name of the AWS CodeDeploy application.
   */
  public fun applicationName(): String

  /**
   * The name of the Lambda function to run before traffic routing starts.
   */
  public fun beforeAllowTrafficHook(): String? = unwrap(this).getBeforeAllowTrafficHook()

  /**
   * The name of the AWS CodeDeploy deployment group.
   *
   * This is where the traffic-shifting policy is set.
   */
  public fun deploymentGroupName(): String

  /**
   * A builder for [CfnCodeDeployLambdaAliasUpdate]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param afterAllowTrafficHook The name of the Lambda function to run after traffic routing
     * completes.
     */
    public fun afterAllowTrafficHook(afterAllowTrafficHook: String)

    /**
     * @param applicationName The name of the AWS CodeDeploy application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param beforeAllowTrafficHook The name of the Lambda function to run before traffic routing
     * starts.
     */
    public fun beforeAllowTrafficHook(beforeAllowTrafficHook: String)

    /**
     * @param deploymentGroupName The name of the AWS CodeDeploy deployment group. 
     * This is where the traffic-shifting policy is set.
     */
    public fun deploymentGroupName(deploymentGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate.Builder =
        software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate.builder()

    /**
     * @param afterAllowTrafficHook The name of the Lambda function to run after traffic routing
     * completes.
     */
    override fun afterAllowTrafficHook(afterAllowTrafficHook: String) {
      cdkBuilder.afterAllowTrafficHook(afterAllowTrafficHook)
    }

    /**
     * @param applicationName The name of the AWS CodeDeploy application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param beforeAllowTrafficHook The name of the Lambda function to run before traffic routing
     * starts.
     */
    override fun beforeAllowTrafficHook(beforeAllowTrafficHook: String) {
      cdkBuilder.beforeAllowTrafficHook(beforeAllowTrafficHook)
    }

    /**
     * @param deploymentGroupName The name of the AWS CodeDeploy deployment group. 
     * This is where the traffic-shifting policy is set.
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun build(): software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate,
  ) : CdkObject(cdkObject),
      CfnCodeDeployLambdaAliasUpdate {
    /**
     * The name of the Lambda function to run after traffic routing completes.
     */
    override fun afterAllowTrafficHook(): String? = unwrap(this).getAfterAllowTrafficHook()

    /**
     * The name of the AWS CodeDeploy application.
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * The name of the Lambda function to run before traffic routing starts.
     */
    override fun beforeAllowTrafficHook(): String? = unwrap(this).getBeforeAllowTrafficHook()

    /**
     * The name of the AWS CodeDeploy deployment group.
     *
     * This is where the traffic-shifting policy is set.
     */
    override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeDeployLambdaAliasUpdate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate):
        CfnCodeDeployLambdaAliasUpdate = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCodeDeployLambdaAliasUpdate ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployLambdaAliasUpdate):
        software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate
  }
}
