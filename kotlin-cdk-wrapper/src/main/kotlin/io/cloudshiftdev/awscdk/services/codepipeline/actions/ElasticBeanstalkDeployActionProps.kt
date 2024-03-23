@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Construction properties of the `ElasticBeanstalkDeployAction Elastic Beanstalk deploy
 * CodePipeline Action`.
 *
 * Example:
 *
 * ```
 * Artifact sourceOutput = new Artifact();
 * Bucket targetBucket = new Bucket(this, "MyBucket");
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * ElasticBeanstalkDeployAction deployAction = ElasticBeanstalkDeployAction.Builder.create()
 * .actionName("ElasticBeanstalkDeploy")
 * .input(sourceOutput)
 * .environmentName("envName")
 * .applicationName("appName")
 * .build();
 * IStage deployStage = pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
public interface ElasticBeanstalkDeployActionProps : CommonAwsActionProps {
  /**
   * The name of the AWS Elastic Beanstalk application to deploy.
   */
  public fun applicationName(): String

  /**
   * The name of the AWS Elastic Beanstalk environment to deploy to.
   */
  public fun environmentName(): String

  /**
   * The source to use as input for deployment.
   */
  public fun input(): Artifact

  /**
   * A builder for [ElasticBeanstalkDeployActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param applicationName The name of the AWS Elastic Beanstalk application to deploy. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param environmentName The name of the AWS Elastic Beanstalk environment to deploy to. 
     */
    public fun environmentName(environmentName: String)

    /**
     * @param input The source to use as input for deployment. 
     */
    public fun input(input: Artifact)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param applicationName The name of the AWS Elastic Beanstalk application to deploy. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param environmentName The name of the AWS Elastic Beanstalk environment to deploy to. 
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param input The source to use as input for deployment. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps,
  ) : CdkObject(cdkObject), ElasticBeanstalkDeployActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The name of the AWS Elastic Beanstalk application to deploy.
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * The name of the AWS Elastic Beanstalk environment to deploy to.
     */
    override fun environmentName(): String = unwrap(this).getEnvironmentName()

    /**
     * The source to use as input for deployment.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ElasticBeanstalkDeployActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps):
        ElasticBeanstalkDeployActionProps = CdkObjectWrappers.wrap(cdkObject) as?
        ElasticBeanstalkDeployActionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ElasticBeanstalkDeployActionProps):
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps
  }
}
