@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.ArtifactMap
import software.amazon.awscdk.pipelines.CodeBuildOptions
import software.amazon.awscdk.pipelines.CodePipeline
import software.amazon.awscdk.pipelines.ProduceActionOptions
import software.amazon.awscdk.pipelines.StackOutputsMap
import software.amazon.awscdk.services.codepipeline.Artifact
import software.constructs.Construct

/**
 * Options for the `CodePipelineActionFactory.produce()` method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.codebuild.*;
 * import software.amazon.awscdk.services.codepipeline.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.*;
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.pipelines.*;
 * import software.constructs.*;
 * Artifact artifact;
 * ArtifactMap artifactMap;
 * Bucket bucket;
 * IBuildImage buildImage;
 * BuildSpec buildSpec;
 * Cache cache;
 * CodePipeline codePipeline;
 * Construct construct;
 * IFileSystemLocation fileSystemLocation;
 * LogGroup logGroup;
 * PolicyStatement policyStatement;
 * SecurityGroup securityGroup;
 * StackOutputsMap stackOutputsMap;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Object value;
 * Vpc vpc;
 * ProduceActionOptions produceActionOptions = ProduceActionOptions.builder()
 * .actionName("actionName")
 * .artifacts(artifactMap)
 * .pipeline(codePipeline)
 * .runOrder(123)
 * .scope(construct)
 * .stackOutputsMap(stackOutputsMap)
 * // the properties below are optional
 * .beforeSelfMutation(false)
 * .codeBuildDefaults(CodeBuildOptions.builder()
 * .buildEnvironment(BuildEnvironment.builder()
 * .buildImage(buildImage)
 * .certificate(BuildEnvironmentCertificate.builder()
 * .bucket(bucket)
 * .objectKey("objectKey")
 * .build())
 * .computeType(ComputeType.SMALL)
 * .environmentVariables(Map.of(
 * "environmentVariablesKey", BuildEnvironmentVariable.builder()
 * .value(value)
 * // the properties below are optional
 * .type(BuildEnvironmentVariableType.PLAINTEXT)
 * .build()))
 * .privileged(false)
 * .build())
 * .cache(cache)
 * .fileSystemLocations(List.of(fileSystemLocation))
 * .logging(LoggingOptions.builder()
 * .cloudWatch(CloudWatchLoggingOptions.builder()
 * .enabled(false)
 * .logGroup(logGroup)
 * .prefix("prefix")
 * .build())
 * .s3(S3LoggingOptions.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .enabled(false)
 * .encrypted(false)
 * .prefix("prefix")
 * .build())
 * .build())
 * .partialBuildSpec(buildSpec)
 * .rolePolicy(List.of(policyStatement))
 * .securityGroups(List.of(securityGroup))
 * .subnetSelection(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .timeout(Duration.minutes(30))
 * .vpc(vpc)
 * .build())
 * .fallbackArtifact(artifact)
 * .variablesNamespace("variablesNamespace")
 * .build();
 * ```
 */
@CdkDslMarker
public class ProduceActionOptionsDsl {
  private val cdkBuilder: ProduceActionOptions.Builder = ProduceActionOptions.builder()

  /**
   * @param actionName Name the action should get. 
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param artifacts Helper object to translate FileSets to CodePipeline Artifacts. 
   */
  public fun artifacts(artifacts: ArtifactMap) {
    cdkBuilder.artifacts(artifacts)
  }

  /**
   * @param beforeSelfMutation Whether or not this action is inserted before self mutation.
   * If it is, the action should take care to reflect some part of
   * its own definition in the pipeline action definition, to
   * trigger a restart after self-mutation (if necessary).
   */
  public fun beforeSelfMutation(beforeSelfMutation: Boolean) {
    cdkBuilder.beforeSelfMutation(beforeSelfMutation)
  }

  /**
   * @param codeBuildDefaults If this action factory creates a CodeBuild step, default options to
   * inherit.
   */
  public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptionsDsl.() -> Unit = {}) {
    val builder = CodeBuildOptionsDsl()
    builder.apply(codeBuildDefaults)
    cdkBuilder.codeBuildDefaults(builder.build())
  }

  /**
   * @param codeBuildDefaults If this action factory creates a CodeBuild step, default options to
   * inherit.
   */
  public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
    cdkBuilder.codeBuildDefaults(codeBuildDefaults)
  }

  /**
   * @param fallbackArtifact An input artifact that CodeBuild projects that don't actually need an
   * input artifact can use.
   * CodeBuild Projects MUST have an input artifact in order to be added to the Pipeline. If
   * the Project doesn't actually care about its input (it can be anything), it can use the
   * Artifact passed here.
   */
  public fun fallbackArtifact(fallbackArtifact: Artifact) {
    cdkBuilder.fallbackArtifact(fallbackArtifact)
  }

  /**
   * @param pipeline The pipeline the action is being generated for. 
   */
  public fun pipeline(pipeline: CodePipeline) {
    cdkBuilder.pipeline(pipeline)
  }

  /**
   * @param runOrder RunOrder the action should get. 
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param scope Scope in which to create constructs. 
   */
  public fun scope(scope: Construct) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param stackOutputsMap Helper object to produce variables exported from stack deployments. 
   * If your step references outputs from a stack deployment, use
   * this to map the output references to Codepipeline variable names.
   *
   * Note - Codepipeline variables can only be referenced in action
   * configurations.
   */
  public fun stackOutputsMap(stackOutputsMap: StackOutputsMap) {
    cdkBuilder.stackOutputsMap(stackOutputsMap)
  }

  /**
   * @param variablesNamespace If this step is producing outputs, the variables namespace assigned
   * to it.
   * Pass this on to the Action you are creating.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): ProduceActionOptions = cdkBuilder.build()
}
