@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * CodePipeline action to deploy an AWS ElasticBeanstalk Application.
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
public open class ElasticBeanstalkDeployAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction,
) : Action(cdkObject) {
  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * The name of the AWS Elastic Beanstalk application to deploy.
     *
     * @param applicationName The name of the AWS Elastic Beanstalk application to deploy. 
     */
    public fun applicationName(applicationName: String)

    /**
     * The name of the AWS Elastic Beanstalk environment to deploy to.
     *
     * @param environmentName The name of the AWS Elastic Beanstalk environment to deploy to. 
     */
    public fun environmentName(environmentName: String)

    /**
     * The source to use as input for deployment.
     *
     * @param input The source to use as input for deployment. 
     */
    public fun input(input: Artifact)

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
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * The name of the AWS Elastic Beanstalk application to deploy.
     *
     * @param applicationName The name of the AWS Elastic Beanstalk application to deploy. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * The name of the AWS Elastic Beanstalk environment to deploy to.
     *
     * @param environmentName The name of the AWS Elastic Beanstalk environment to deploy to. 
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * The source to use as input for deployment.
     *
     * @param input The source to use as input for deployment. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact::unwrap))
    }

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
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ElasticBeanstalkDeployAction {
      val builderImpl = BuilderImpl()
      return ElasticBeanstalkDeployAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction):
        ElasticBeanstalkDeployAction = ElasticBeanstalkDeployAction(cdkObject)

    internal fun unwrap(wrapped: ElasticBeanstalkDeployAction):
        software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployAction =
        wrapped.cdkObject
  }
}
