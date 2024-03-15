@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options for the `CodePipelineActionFactory.produce()` method.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.pipelines.*;
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
public interface ProduceActionOptions {
  /**
   * Name the action should get.
   */
  public fun actionName(): String

  /**
   * Helper object to translate FileSets to CodePipeline Artifacts.
   */
  public fun artifacts(): ArtifactMap

  /**
   * Whether or not this action is inserted before self mutation.
   *
   * If it is, the action should take care to reflect some part of
   * its own definition in the pipeline action definition, to
   * trigger a restart after self-mutation (if necessary).
   *
   * Default: false
   */
  public fun beforeSelfMutation(): Boolean? = unwrap(this).getBeforeSelfMutation()

  /**
   * If this action factory creates a CodeBuild step, default options to inherit.
   *
   * Default: - No CodeBuild project defaults
   */
  public fun codeBuildDefaults(): CodeBuildOptions? =
      unwrap(this).getCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

  /**
   * An input artifact that CodeBuild projects that don't actually need an input artifact can use.
   *
   * CodeBuild Projects MUST have an input artifact in order to be added to the Pipeline. If
   * the Project doesn't actually care about its input (it can be anything), it can use the
   * Artifact passed here.
   *
   * Default: - A fallback artifact does not exist
   */
  public fun fallbackArtifact(): Artifact? = unwrap(this).getFallbackArtifact()?.let(Artifact::wrap)

  /**
   * The pipeline the action is being generated for.
   */
  public fun pipeline(): CodePipeline

  /**
   * RunOrder the action should get.
   */
  public fun runOrder(): Number

  /**
   * Scope in which to create constructs.
   */
  public fun scope(): Construct

  /**
   * Helper object to produce variables exported from stack deployments.
   *
   * If your step references outputs from a stack deployment, use
   * this to map the output references to Codepipeline variable names.
   *
   * Note - Codepipeline variables can only be referenced in action
   * configurations.
   */
  public fun stackOutputsMap(): StackOutputsMap

  /**
   * If this step is producing outputs, the variables namespace assigned to it.
   *
   * Pass this on to the Action you are creating.
   *
   * Default: - Step doesn't produce any outputs
   */
  public fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()

  /**
   * A builder for [ProduceActionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName Name the action should get. 
     */
    public fun actionName(actionName: String)

    /**
     * @param artifacts Helper object to translate FileSets to CodePipeline Artifacts. 
     */
    public fun artifacts(artifacts: ArtifactMap)

    /**
     * @param beforeSelfMutation Whether or not this action is inserted before self mutation.
     * If it is, the action should take care to reflect some part of
     * its own definition in the pipeline action definition, to
     * trigger a restart after self-mutation (if necessary).
     */
    public fun beforeSelfMutation(beforeSelfMutation: Boolean)

    /**
     * @param codeBuildDefaults If this action factory creates a CodeBuild step, default options to
     * inherit.
     */
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions)

    /**
     * @param codeBuildDefaults If this action factory creates a CodeBuild step, default options to
     * inherit.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9324b9d21c0f64710b713cfaadaec4e09e2a169a8c38c1691ce91fa3cb2d2606")
    public fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit)

    /**
     * @param fallbackArtifact An input artifact that CodeBuild projects that don't actually need an
     * input artifact can use.
     * CodeBuild Projects MUST have an input artifact in order to be added to the Pipeline. If
     * the Project doesn't actually care about its input (it can be anything), it can use the
     * Artifact passed here.
     */
    public fun fallbackArtifact(fallbackArtifact: Artifact)

    /**
     * @param pipeline The pipeline the action is being generated for. 
     */
    public fun pipeline(pipeline: CodePipeline)

    /**
     * @param runOrder RunOrder the action should get. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param scope Scope in which to create constructs. 
     */
    public fun scope(scope: Construct)

    /**
     * @param stackOutputsMap Helper object to produce variables exported from stack deployments. 
     * If your step references outputs from a stack deployment, use
     * this to map the output references to Codepipeline variable names.
     *
     * Note - Codepipeline variables can only be referenced in action
     * configurations.
     */
    public fun stackOutputsMap(stackOutputsMap: StackOutputsMap)

    /**
     * @param variablesNamespace If this step is producing outputs, the variables namespace assigned
     * to it.
     * Pass this on to the Action you are creating.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ProduceActionOptions.Builder =
        software.amazon.awscdk.pipelines.ProduceActionOptions.builder()

    /**
     * @param actionName Name the action should get. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param artifacts Helper object to translate FileSets to CodePipeline Artifacts. 
     */
    override fun artifacts(artifacts: ArtifactMap) {
      cdkBuilder.artifacts(artifacts.let(ArtifactMap::unwrap))
    }

    /**
     * @param beforeSelfMutation Whether or not this action is inserted before self mutation.
     * If it is, the action should take care to reflect some part of
     * its own definition in the pipeline action definition, to
     * trigger a restart after self-mutation (if necessary).
     */
    override fun beforeSelfMutation(beforeSelfMutation: Boolean) {
      cdkBuilder.beforeSelfMutation(beforeSelfMutation)
    }

    /**
     * @param codeBuildDefaults If this action factory creates a CodeBuild step, default options to
     * inherit.
     */
    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions) {
      cdkBuilder.codeBuildDefaults(codeBuildDefaults.let(CodeBuildOptions::unwrap))
    }

    /**
     * @param codeBuildDefaults If this action factory creates a CodeBuild step, default options to
     * inherit.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9324b9d21c0f64710b713cfaadaec4e09e2a169a8c38c1691ce91fa3cb2d2606")
    override fun codeBuildDefaults(codeBuildDefaults: CodeBuildOptions.Builder.() -> Unit): Unit =
        codeBuildDefaults(CodeBuildOptions(codeBuildDefaults))

    /**
     * @param fallbackArtifact An input artifact that CodeBuild projects that don't actually need an
     * input artifact can use.
     * CodeBuild Projects MUST have an input artifact in order to be added to the Pipeline. If
     * the Project doesn't actually care about its input (it can be anything), it can use the
     * Artifact passed here.
     */
    override fun fallbackArtifact(fallbackArtifact: Artifact) {
      cdkBuilder.fallbackArtifact(fallbackArtifact.let(Artifact::unwrap))
    }

    /**
     * @param pipeline The pipeline the action is being generated for. 
     */
    override fun pipeline(pipeline: CodePipeline) {
      cdkBuilder.pipeline(pipeline.let(CodePipeline::unwrap))
    }

    /**
     * @param runOrder RunOrder the action should get. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param scope Scope in which to create constructs. 
     */
    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    /**
     * @param stackOutputsMap Helper object to produce variables exported from stack deployments. 
     * If your step references outputs from a stack deployment, use
     * this to map the output references to Codepipeline variable names.
     *
     * Note - Codepipeline variables can only be referenced in action
     * configurations.
     */
    override fun stackOutputsMap(stackOutputsMap: StackOutputsMap) {
      cdkBuilder.stackOutputsMap(stackOutputsMap.let(StackOutputsMap::unwrap))
    }

    /**
     * @param variablesNamespace If this step is producing outputs, the variables namespace assigned
     * to it.
     * Pass this on to the Action you are creating.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.pipelines.ProduceActionOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ProduceActionOptions,
  ) : CdkObject(cdkObject), ProduceActionOptions {
    /**
     * Name the action should get.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * Helper object to translate FileSets to CodePipeline Artifacts.
     */
    override fun artifacts(): ArtifactMap = unwrap(this).getArtifacts().let(ArtifactMap::wrap)

    /**
     * Whether or not this action is inserted before self mutation.
     *
     * If it is, the action should take care to reflect some part of
     * its own definition in the pipeline action definition, to
     * trigger a restart after self-mutation (if necessary).
     *
     * Default: false
     */
    override fun beforeSelfMutation(): Boolean? = unwrap(this).getBeforeSelfMutation()

    /**
     * If this action factory creates a CodeBuild step, default options to inherit.
     *
     * Default: - No CodeBuild project defaults
     */
    override fun codeBuildDefaults(): CodeBuildOptions? =
        unwrap(this).getCodeBuildDefaults()?.let(CodeBuildOptions::wrap)

    /**
     * An input artifact that CodeBuild projects that don't actually need an input artifact can use.
     *
     * CodeBuild Projects MUST have an input artifact in order to be added to the Pipeline. If
     * the Project doesn't actually care about its input (it can be anything), it can use the
     * Artifact passed here.
     *
     * Default: - A fallback artifact does not exist
     */
    override fun fallbackArtifact(): Artifact? =
        unwrap(this).getFallbackArtifact()?.let(Artifact::wrap)

    /**
     * The pipeline the action is being generated for.
     */
    override fun pipeline(): CodePipeline = unwrap(this).getPipeline().let(CodePipeline::wrap)

    /**
     * RunOrder the action should get.
     */
    override fun runOrder(): Number = unwrap(this).getRunOrder()

    /**
     * Scope in which to create constructs.
     */
    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)

    /**
     * Helper object to produce variables exported from stack deployments.
     *
     * If your step references outputs from a stack deployment, use
     * this to map the output references to Codepipeline variable names.
     *
     * Note - Codepipeline variables can only be referenced in action
     * configurations.
     */
    override fun stackOutputsMap(): StackOutputsMap =
        unwrap(this).getStackOutputsMap().let(StackOutputsMap::wrap)

    /**
     * If this step is producing outputs, the variables namespace assigned to it.
     *
     * Pass this on to the Action you are creating.
     *
     * Default: - Step doesn't produce any outputs
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProduceActionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ProduceActionOptions):
        ProduceActionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProduceActionOptions):
        software.amazon.awscdk.pipelines.ProduceActionOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.ProduceActionOptions
  }
}
