@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.ElasticBeanstalkDeployActionProps
import software.amazon.awscdk.services.iam.IRole

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
@CdkDslMarker
public class ElasticBeanstalkDeployActionPropsDsl {
  private val cdkBuilder: ElasticBeanstalkDeployActionProps.Builder =
      ElasticBeanstalkDeployActionProps.builder()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param applicationName The name of the AWS Elastic Beanstalk application to deploy. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param environmentName The name of the AWS Elastic Beanstalk environment to deploy to. 
   */
  public fun environmentName(environmentName: String) {
    cdkBuilder.environmentName(environmentName)
  }

  /**
   * @param input The source to use as input for deployment. 
   */
  public fun input(input: Artifact) {
    cdkBuilder.input(input)
  }

  /**
   * @param role The Role in which context's this Action will be executing in.
   * The Pipeline's Role will assume this Role
   * (the required permissions for that will be granted automatically)
   * right before executing this Action.
   * This Action will be passed into your `IAction.bind`
   * method in the `ActionBindOptions.role` property.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runOrder The runOrder property for this Action.
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): ElasticBeanstalkDeployActionProps = cdkBuilder.build()
}
