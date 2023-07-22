@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.App
import software.amazon.awscdk.AppProps
import software.amazon.awscdk.ArnComponents
import software.amazon.awscdk.AssetManifestDockerImageDestination
import software.amazon.awscdk.AssetManifestFileDestination
import software.amazon.awscdk.AssetOptions
import software.amazon.awscdk.AssetStaging
import software.amazon.awscdk.AssetStagingProps
import software.amazon.awscdk.BootstraplessSynthesizer
import software.amazon.awscdk.BootstraplessSynthesizerProps
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.CfnAutoScalingReplacingUpdate
import software.amazon.awscdk.CfnAutoScalingRollingUpdate
import software.amazon.awscdk.CfnAutoScalingScheduledAction
import software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget
import software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes
import software.amazon.awscdk.CfnCodeDeployBlueGreenHook
import software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps
import software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks
import software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.CfnConditionProps
import software.amazon.awscdk.CfnCreationPolicy
import software.amazon.awscdk.CfnCustomResource
import software.amazon.awscdk.CfnCustomResourceProps
import software.amazon.awscdk.CfnDynamicReferenceProps
import software.amazon.awscdk.CfnHook
import software.amazon.awscdk.CfnHookDefaultVersion
import software.amazon.awscdk.CfnHookDefaultVersionProps
import software.amazon.awscdk.CfnHookProps
import software.amazon.awscdk.CfnHookTypeConfig
import software.amazon.awscdk.CfnHookTypeConfigProps
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.CfnHookVersionProps
import software.amazon.awscdk.CfnJson
import software.amazon.awscdk.CfnJsonProps
import software.amazon.awscdk.CfnMacro
import software.amazon.awscdk.CfnMacroProps
import software.amazon.awscdk.CfnMapping
import software.amazon.awscdk.CfnMappingProps
import software.amazon.awscdk.CfnModuleDefaultVersion
import software.amazon.awscdk.CfnModuleDefaultVersionProps
import software.amazon.awscdk.CfnModuleVersion
import software.amazon.awscdk.CfnModuleVersionProps
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.CfnOutputProps
import software.amazon.awscdk.CfnParameter
import software.amazon.awscdk.CfnParameterProps
import software.amazon.awscdk.CfnPublicTypeVersion
import software.amazon.awscdk.CfnPublicTypeVersionProps
import software.amazon.awscdk.CfnPublisher
import software.amazon.awscdk.CfnPublisherProps
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy
import software.amazon.awscdk.CfnResourceDefaultVersion
import software.amazon.awscdk.CfnResourceDefaultVersionProps
import software.amazon.awscdk.CfnResourceProps
import software.amazon.awscdk.CfnResourceSignal
import software.amazon.awscdk.CfnResourceVersion
import software.amazon.awscdk.CfnResourceVersionProps
import software.amazon.awscdk.CfnRule
import software.amazon.awscdk.CfnRuleAssertion
import software.amazon.awscdk.CfnRuleProps
import software.amazon.awscdk.CfnStack
import software.amazon.awscdk.CfnStackProps
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.CfnStackSetProps
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.CfnTrafficRoute
import software.amazon.awscdk.CfnTrafficRouting
import software.amazon.awscdk.CfnTrafficRoutingConfig
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear
import software.amazon.awscdk.CfnTypeActivation
import software.amazon.awscdk.CfnTypeActivationProps
import software.amazon.awscdk.CfnUpdatePolicy
import software.amazon.awscdk.CfnWaitCondition
import software.amazon.awscdk.CfnWaitConditionHandle
import software.amazon.awscdk.CfnWaitConditionHandleProps
import software.amazon.awscdk.CfnWaitConditionProps
import software.amazon.awscdk.CliCredentialsStackSynthesizer
import software.amazon.awscdk.CliCredentialsStackSynthesizerProps
import software.amazon.awscdk.CopyOptions
import software.amazon.awscdk.CustomResource
import software.amazon.awscdk.CustomResourceProps
import software.amazon.awscdk.CustomResourceProviderProps
import software.amazon.awscdk.DefaultStackSynthesizer
import software.amazon.awscdk.DefaultStackSynthesizerProps
import software.amazon.awscdk.DockerBuildOptions
import software.amazon.awscdk.DockerCacheOption
import software.amazon.awscdk.DockerImageAssetLocation
import software.amazon.awscdk.DockerImageAssetSource
import software.amazon.awscdk.DockerRunOptions
import software.amazon.awscdk.DockerVolume
import software.amazon.awscdk.EncodingOptions
import software.amazon.awscdk.Environment
import software.amazon.awscdk.ExportValueOptions
import software.amazon.awscdk.FileAssetLocation
import software.amazon.awscdk.FileAssetSource
import software.amazon.awscdk.FileCopyOptions
import software.amazon.awscdk.FileFingerprintOptions
import software.amazon.awscdk.FingerprintOptions
import software.amazon.awscdk.GetContextKeyOptions
import software.amazon.awscdk.GetContextKeyResult
import software.amazon.awscdk.GetContextValueOptions
import software.amazon.awscdk.GetContextValueResult
import software.amazon.awscdk.Intrinsic
import software.amazon.awscdk.IntrinsicProps
import software.amazon.awscdk.LazyAnyValueOptions
import software.amazon.awscdk.LazyListValueOptions
import software.amazon.awscdk.LazyStringValueOptions
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.NestedStackProps
import software.amazon.awscdk.PermissionsBoundaryBindOptions
import software.amazon.awscdk.PolicyValidationPluginReportBeta1
import software.amazon.awscdk.PolicyViolatingResourceBeta1
import software.amazon.awscdk.PolicyViolationBeta1
import software.amazon.awscdk.RemovalPolicyOptions
import software.amazon.awscdk.RemoveTag
import software.amazon.awscdk.ResolveChangeContextOptions
import software.amazon.awscdk.ResolveOptions
import software.amazon.awscdk.ResourceEnvironment
import software.amazon.awscdk.ResourceProps
import software.amazon.awscdk.ReverseOptions
import software.amazon.awscdk.RoleOptions
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.SecretsManagerSecretOptions
import software.amazon.awscdk.SizeConversionOptions
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
import software.amazon.awscdk.Stage
import software.amazon.awscdk.StageProps
import software.amazon.awscdk.StageSynthesisOptions
import software.amazon.awscdk.SynthesizeStackArtifactOptions
import software.amazon.awscdk.Tag
import software.amazon.awscdk.TagManager
import software.amazon.awscdk.TagManagerOptions
import software.amazon.awscdk.TagProps
import software.amazon.awscdk.TagType
import software.amazon.awscdk.TimeConversionOptions
import software.amazon.awscdk.UniqueResourceNameOptions
import software.constructs.Construct

public object awscdk {
  /**
   * A construct which represents an entire CDK app. This construct is normally the root of the
   * construct tree.
   *
   * You would normally define an `App` instance in your program's entrypoint,
   * then define constructs where the app is used as the parent scope.
   *
   * After all the child constructs are defined within the app, you should call
   * `app.synth()` which will emit a "cloud assembly" from this app into the
   * directory specified by `outdir`. Cloud assemblies includes artifacts such as
   * CloudFormation templates and assets that are needed to deploy this app into
   * the AWS cloud.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.*;
   * App app = new App();
   * Stack stack = new Stack(app, "aws-servicediscovery-integ");
   * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
   * .name("foobar.com")
   * .build();
   * Service service = namespace.createService("Service", DnsServiceProps.builder()
   * .name("foo")
   * .dnsRecordType(DnsRecordType.CNAME)
   * .dnsTtl(Duration.seconds(30))
   * .build());
   * service.registerCnameInstance("CnameInstance", CnameInstanceBaseProps.builder()
   * .instanceCname("service.pizza")
   * .build());
   * app.synth();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/cdk/latest/guide/apps.html)
   */
  public inline fun app(block: AppDsl.() -> Unit = {}): App {
    val builder = AppDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Initialization props for apps.
   *
   * Example:
   *
   * ```
   * App app = App.Builder.create()
   * .defaultStackSynthesizer(AppStagingSynthesizer.defaultResources(DefaultResourcesOptions.builder()
   * .appId("my-app-id")
   * .deploymentIdentities(DeploymentIdentities.cliCredentials())
   * .build()))
   * .build();
   * ```
   */
  public inline fun appProps(block: AppPropsDsl.() -> Unit = {}): AppProps {
    val builder = AppPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * PublicHostedZone subZone = PublicHostedZone.Builder.create(this, "SubZone")
   * .zoneName("sub.someexample.com")
   * .build();
   * // import the delegation role by constructing the roleArn
   * String delegationRoleArn = Stack.of(this).formatArn(ArnComponents.builder()
   * .region("") // IAM is global in each partition
   * .service("iam")
   * .account("parent-account-id")
   * .resource("role")
   * .resourceName("MyDelegationRole")
   * .build());
   * IRole delegationRole = Role.fromRoleArn(this, "DelegationRole", delegationRoleArn);
   * // create the record
   * // create the record
   * CrossAccountZoneDelegationRecord.Builder.create(this, "delegate")
   * .delegatedZone(subZone)
   * .parentHostedZoneName("someexample.com") // or you can use parentHostedZoneId
   * .delegationRole(delegationRole)
   * .build();
   * ```
   */
  public inline fun arnComponents(block: ArnComponentsDsl.() -> Unit = {}): ArnComponents {
    val builder = ArnComponentsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The destination for a docker image asset, when it is given to the AssetManifestBuilder.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * AssetManifestDockerImageDestination assetManifestDockerImageDestination =
   * AssetManifestDockerImageDestination.builder()
   * .repositoryName("repositoryName")
   * // the properties below are optional
   * .dockerTagPrefix("dockerTagPrefix")
   * .role(RoleOptions.builder()
   * .assumeRoleArn("assumeRoleArn")
   * // the properties below are optional
   * .assumeRoleExternalId("assumeRoleExternalId")
   * .build())
   * .build();
   * ```
   */
  public inline
      fun assetManifestDockerImageDestination(block: AssetManifestDockerImageDestinationDsl.() -> Unit
      = {}): AssetManifestDockerImageDestination {
    val builder = AssetManifestDockerImageDestinationDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The destination for a file asset, when it is given to the AssetManifestBuilder.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * AssetManifestFileDestination assetManifestFileDestination =
   * AssetManifestFileDestination.builder()
   * .bucketName("bucketName")
   * // the properties below are optional
   * .bucketPrefix("bucketPrefix")
   * .role(RoleOptions.builder()
   * .assumeRoleArn("assumeRoleArn")
   * // the properties below are optional
   * .assumeRoleExternalId("assumeRoleExternalId")
   * .build())
   * .build();
   * ```
   */
  public inline fun assetManifestFileDestination(block: AssetManifestFileDestinationDsl.() -> Unit =
      {}): AssetManifestFileDestination {
    val builder = AssetManifestFileDestinationDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Asset hash options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DockerImage dockerImage;
   * ILocalBundling localBundling;
   * AssetOptions assetOptions = AssetOptions.builder()
   * .assetHash("assetHash")
   * .assetHashType(AssetHashType.SOURCE)
   * .bundling(BundlingOptions.builder()
   * .image(dockerImage)
   * // the properties below are optional
   * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
   * .command(List.of("command"))
   * .entrypoint(List.of("entrypoint"))
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .local(localBundling)
   * .network("network")
   * .outputType(BundlingOutput.ARCHIVED)
   * .platform("platform")
   * .securityOpt("securityOpt")
   * .user("user")
   * .volumes(List.of(DockerVolume.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * // the properties below are optional
   * .consistency(DockerVolumeConsistency.CONSISTENT)
   * .build()))
   * .volumesFrom(List.of("volumesFrom"))
   * .workingDirectory("workingDirectory")
   * .build())
   * .build();
   * ```
   */
  public inline fun assetOptions(block: AssetOptionsDsl.() -> Unit = {}): AssetOptions {
    val builder = AssetOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Stages a file or directory from a location on the file system into a staging directory.
   *
   * This is controlled by the context key 'aws:cdk:asset-staging' and enabled
   * by the CLI by default in order to ensure that when the CDK app exists, all
   * assets are available for deployment. Otherwise, if an app references assets
   * in temporary locations, those will not be available when it exists (see
   * https://github.com/aws/aws-cdk/issues/1716).
   *
   * The `stagedPath` property is a stringified token that represents the location
   * of the file or directory after staging. It will be resolved only during the
   * "prepare" stage and may be either the original path or the staged path
   * depending on the context setting.
   *
   * The file/directory are staged based on their content hash (fingerprint). This
   * means that only if content was changed, copy will happen.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DockerImage dockerImage;
   * ILocalBundling localBundling;
   * AssetStaging assetStaging = AssetStaging.Builder.create(this, "MyAssetStaging")
   * .sourcePath("sourcePath")
   * // the properties below are optional
   * .assetHash("assetHash")
   * .assetHashType(AssetHashType.SOURCE)
   * .bundling(BundlingOptions.builder()
   * .image(dockerImage)
   * // the properties below are optional
   * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
   * .command(List.of("command"))
   * .entrypoint(List.of("entrypoint"))
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .local(localBundling)
   * .network("network")
   * .outputType(BundlingOutput.ARCHIVED)
   * .platform("platform")
   * .securityOpt("securityOpt")
   * .user("user")
   * .volumes(List.of(DockerVolume.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * // the properties below are optional
   * .consistency(DockerVolumeConsistency.CONSISTENT)
   * .build()))
   * .volumesFrom(List.of("volumesFrom"))
   * .workingDirectory("workingDirectory")
   * .build())
   * .exclude(List.of("exclude"))
   * .extraHash("extraHash")
   * .follow(SymlinkFollowMode.NEVER)
   * .ignoreMode(IgnoreMode.GLOB)
   * .build();
   * ```
   */
  public inline fun assetStaging(
    scope: Construct,
    id: String,
    block: AssetStagingDsl.() -> Unit = {},
  ): AssetStaging {
    val builder = AssetStagingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Initialization properties for `AssetStaging`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DockerImage dockerImage;
   * ILocalBundling localBundling;
   * AssetStagingProps assetStagingProps = AssetStagingProps.builder()
   * .sourcePath("sourcePath")
   * // the properties below are optional
   * .assetHash("assetHash")
   * .assetHashType(AssetHashType.SOURCE)
   * .bundling(BundlingOptions.builder()
   * .image(dockerImage)
   * // the properties below are optional
   * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
   * .command(List.of("command"))
   * .entrypoint(List.of("entrypoint"))
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .local(localBundling)
   * .network("network")
   * .outputType(BundlingOutput.ARCHIVED)
   * .platform("platform")
   * .securityOpt("securityOpt")
   * .user("user")
   * .volumes(List.of(DockerVolume.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * // the properties below are optional
   * .consistency(DockerVolumeConsistency.CONSISTENT)
   * .build()))
   * .volumesFrom(List.of("volumesFrom"))
   * .workingDirectory("workingDirectory")
   * .build())
   * .exclude(List.of("exclude"))
   * .extraHash("extraHash")
   * .follow(SymlinkFollowMode.NEVER)
   * .ignoreMode(IgnoreMode.GLOB)
   * .build();
   * ```
   */
  public inline fun assetStagingProps(block: AssetStagingPropsDsl.() -> Unit = {}):
      AssetStagingProps {
    val builder = AssetStagingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Synthesizer that reuses bootstrap roles from a different region.
   *
   * A special synthesizer that behaves similarly to `DefaultStackSynthesizer`,
   * but doesn't require bootstrapping the environment it operates in. Instead,
   * it will re-use the Roles that were created for a different region (which
   * is possible because IAM is a global service).
   *
   * However, it will not assume asset buckets or repositories have been created,
   * and therefore does not support assets.
   *
   * The name is poorly chosen -- it does still require bootstrapping, it just
   * does not support assets.
   *
   * Used by the CodePipeline construct for the support stacks needed for
   * cross-region replication S3 buckets. App builders do not need to use this
   * synthesizer directly.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * BootstraplessSynthesizer bootstraplessSynthesizer = BootstraplessSynthesizer.Builder.create()
   * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
   * .deployRoleArn("deployRoleArn")
   * .build();
   * ```
   */
  public inline fun bootstraplessSynthesizer(block: BootstraplessSynthesizerDsl.() -> Unit = {}):
      BootstraplessSynthesizer {
    val builder = BootstraplessSynthesizerDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties of `BootstraplessSynthesizer`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * BootstraplessSynthesizerProps bootstraplessSynthesizerProps =
   * BootstraplessSynthesizerProps.builder()
   * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
   * .deployRoleArn("deployRoleArn")
   * .build();
   * ```
   */
  public inline fun bootstraplessSynthesizerProps(block: BootstraplessSynthesizerPropsDsl.() -> Unit
      = {}): BootstraplessSynthesizerProps {
    val builder = BootstraplessSynthesizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Bundling options.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.*;
   * Asset asset = Asset.Builder.create(this, "BundledAsset")
   * .path("/path/to/asset")
   * .bundling(BundlingOptions.builder()
   * .image(DockerImage.fromRegistry("alpine"))
   * .command(List.of("command-that-produces-an-archive.sh"))
   * .outputType(BundlingOutput.NOT_ARCHIVED)
   * .build())
   * .build();
   * ```
   */
  public inline fun bundlingOptions(block: BundlingOptionsDsl.() -> Unit = {}): BundlingOptions {
    val builder = BundlingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies whether an Auto Scaling group and the instances it contains are replaced during an
   * update.
   *
   * During replacement,
   * AWS CloudFormation retains the old group until it finishes creating the new one. If the update
   * fails, AWS CloudFormation
   * can roll back to the old Auto Scaling group and delete the new Auto Scaling group.
   *
   * While AWS CloudFormation creates the new group, it doesn't detach or attach any instances.
   * After successfully creating
   * the new Auto Scaling group, AWS CloudFormation deletes the old Auto Scaling group during the
   * cleanup process.
   *
   * When you set the WillReplace parameter, remember to specify a matching CreationPolicy. If the
   * minimum number of
   * instances (specified by the MinSuccessfulInstancesPercent property) don't signal success within
   * the Timeout period
   * (specified in the CreationPolicy policy), the replacement update fails and AWS CloudFormation
   * rolls back to the old
   * Auto Scaling group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnAutoScalingReplacingUpdate cfnAutoScalingReplacingUpdate =
   * CfnAutoScalingReplacingUpdate.builder()
   * .willReplace(false)
   * .build();
   * ```
   */
  public inline fun cfnAutoScalingReplacingUpdate(block: CfnAutoScalingReplacingUpdateDsl.() -> Unit
      = {}): CfnAutoScalingReplacingUpdate {
    val builder = CfnAutoScalingReplacingUpdateDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * To specify how AWS CloudFormation handles rolling updates for an Auto Scaling group, use the
   * AutoScalingRollingUpdate policy.
   *
   * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are in
   * an Auto Scaling
   * group in batches or all at once.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnAutoScalingRollingUpdate cfnAutoScalingRollingUpdate = CfnAutoScalingRollingUpdate.builder()
   * .maxBatchSize(123)
   * .minInstancesInService(123)
   * .minSuccessfulInstancesPercent(123)
   * .pauseTime("pauseTime")
   * .suspendProcesses(List.of("suspendProcesses"))
   * .waitOnResourceSignals(false)
   * .build();
   * ```
   */
  public inline fun cfnAutoScalingRollingUpdate(block: CfnAutoScalingRollingUpdateDsl.() -> Unit =
      {}): CfnAutoScalingRollingUpdate {
    val builder = CfnAutoScalingRollingUpdateDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * With scheduled actions, the group size properties of an Auto Scaling group can change at any
   * time.
   *
   * When you update a
   * stack with an Auto Scaling group and scheduled action, AWS CloudFormation always sets the group
   * size property values of
   * your Auto Scaling group to the values that are defined in the
   * AWS::AutoScaling::AutoScalingGroup resource of your template,
   * even if a scheduled action is in effect.
   *
   * If you do not want AWS CloudFormation to change any of the group size property values when you
   * have a scheduled action in
   * effect, use the AutoScalingScheduledAction update policy to prevent AWS CloudFormation from
   * changing the MinSize, MaxSize,
   * or DesiredCapacity properties unless you have modified these values in your template.\
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnAutoScalingScheduledAction cfnAutoScalingScheduledAction =
   * CfnAutoScalingScheduledAction.builder()
   * .ignoreUnmodifiedGroupSizeProperties(false)
   * .build();
   * ```
   */
  public inline fun cfnAutoScalingScheduledAction(block: CfnAutoScalingScheduledActionDsl.() -> Unit
      = {}): CfnAutoScalingScheduledAction {
    val builder = CfnAutoScalingScheduledActionDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Additional options for the blue/green deployment.
   *
   * The type of the `CfnCodeDeployBlueGreenHookProps.additionalOptions` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCodeDeployBlueGreenAdditionalOptions cfnCodeDeployBlueGreenAdditionalOptions =
   * CfnCodeDeployBlueGreenAdditionalOptions.builder()
   * .terminationWaitTimeInMinutes(123)
   * .build();
   * ```
   */
  public inline
      fun cfnCodeDeployBlueGreenAdditionalOptions(block: CfnCodeDeployBlueGreenAdditionalOptionsDsl.() -> Unit
      = {}): CfnCodeDeployBlueGreenAdditionalOptions {
    val builder = CfnCodeDeployBlueGreenAdditionalOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The application actually being deployed.
   *
   * Type of the `CfnCodeDeployBlueGreenHookProps.applications` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCodeDeployBlueGreenApplication cfnCodeDeployBlueGreenApplication =
   * CfnCodeDeployBlueGreenApplication.builder()
   * .ecsAttributes(CfnCodeDeployBlueGreenEcsAttributes.builder()
   * .taskDefinitions(List.of("taskDefinitions"))
   * .taskSets(List.of("taskSets"))
   * .trafficRouting(CfnTrafficRouting.builder()
   * .prodTrafficRoute(CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .targetGroups(List.of("targetGroups"))
   * .testTrafficRoute(CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .build())
   * .build())
   * .target(CfnCodeDeployBlueGreenApplicationTarget.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .build();
   * ```
   */
  public inline
      fun cfnCodeDeployBlueGreenApplication(block: CfnCodeDeployBlueGreenApplicationDsl.() -> Unit =
      {}): CfnCodeDeployBlueGreenApplication {
    val builder = CfnCodeDeployBlueGreenApplicationDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Type of the `CfnCodeDeployBlueGreenApplication.target` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCodeDeployBlueGreenApplicationTarget cfnCodeDeployBlueGreenApplicationTarget =
   * CfnCodeDeployBlueGreenApplicationTarget.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build();
   * ```
   */
  public inline
      fun cfnCodeDeployBlueGreenApplicationTarget(block: CfnCodeDeployBlueGreenApplicationTargetDsl.() -> Unit
      = {}): CfnCodeDeployBlueGreenApplicationTarget {
    val builder = CfnCodeDeployBlueGreenApplicationTargetDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The attributes of the ECS Service being deployed.
   *
   * Type of the `CfnCodeDeployBlueGreenApplication.ecsAttributes` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCodeDeployBlueGreenEcsAttributes cfnCodeDeployBlueGreenEcsAttributes =
   * CfnCodeDeployBlueGreenEcsAttributes.builder()
   * .taskDefinitions(List.of("taskDefinitions"))
   * .taskSets(List.of("taskSets"))
   * .trafficRouting(CfnTrafficRouting.builder()
   * .prodTrafficRoute(CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .targetGroups(List.of("targetGroups"))
   * .testTrafficRoute(CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline
      fun cfnCodeDeployBlueGreenEcsAttributes(block: CfnCodeDeployBlueGreenEcsAttributesDsl.() -> Unit
      = {}): CfnCodeDeployBlueGreenEcsAttributes {
    val builder = CfnCodeDeployBlueGreenEcsAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A CloudFormation Hook for CodeDeploy blue-green ECS deployments.
   *
   * Example:
   *
   * ```
   * CfnInclude cfnTemplate;
   * // mutating the hook
   * Role myRole;
   * CfnHook hook = cfnTemplate.getHook("MyOutput");
   * CfnCodeDeployBlueGreenHook codeDeployHook = (CfnCodeDeployBlueGreenHook)hook;
   * codeDeployHook.getServiceRole() = myRole.getRoleArn();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html#blue-green-template-reference)
   */
  public inline fun cfnCodeDeployBlueGreenHook(
    scope: Construct,
    id: String,
    block: CfnCodeDeployBlueGreenHookDsl.() -> Unit = {},
  ): CfnCodeDeployBlueGreenHook {
    val builder = CfnCodeDeployBlueGreenHookDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties of `CfnCodeDeployBlueGreenHook`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCodeDeployBlueGreenHookProps cfnCodeDeployBlueGreenHookProps =
   * CfnCodeDeployBlueGreenHookProps.builder()
   * .applications(List.of(CfnCodeDeployBlueGreenApplication.builder()
   * .ecsAttributes(CfnCodeDeployBlueGreenEcsAttributes.builder()
   * .taskDefinitions(List.of("taskDefinitions"))
   * .taskSets(List.of("taskSets"))
   * .trafficRouting(CfnTrafficRouting.builder()
   * .prodTrafficRoute(CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .targetGroups(List.of("targetGroups"))
   * .testTrafficRoute(CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .build())
   * .build())
   * .target(CfnCodeDeployBlueGreenApplicationTarget.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .build()))
   * .serviceRole("serviceRole")
   * // the properties below are optional
   * .additionalOptions(CfnCodeDeployBlueGreenAdditionalOptions.builder()
   * .terminationWaitTimeInMinutes(123)
   * .build())
   * .lifecycleEventHooks(CfnCodeDeployBlueGreenLifecycleEventHooks.builder()
   * .afterAllowTestTraffic("afterAllowTestTraffic")
   * .afterAllowTraffic("afterAllowTraffic")
   * .afterInstall("afterInstall")
   * .beforeAllowTraffic("beforeAllowTraffic")
   * .beforeInstall("beforeInstall")
   * .build())
   * .trafficRoutingConfig(CfnTrafficRoutingConfig.builder()
   * .type(CfnTrafficRoutingType.ALL_AT_ONCE)
   * // the properties below are optional
   * .timeBasedCanary(CfnTrafficRoutingTimeBasedCanary.builder()
   * .bakeTimeMins(123)
   * .stepPercentage(123)
   * .build())
   * .timeBasedLinear(CfnTrafficRoutingTimeBasedLinear.builder()
   * .bakeTimeMins(123)
   * .stepPercentage(123)
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline
      fun cfnCodeDeployBlueGreenHookProps(block: CfnCodeDeployBlueGreenHookPropsDsl.() -> Unit =
      {}): CfnCodeDeployBlueGreenHookProps {
    val builder = CfnCodeDeployBlueGreenHookPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Lifecycle events for blue-green deployments.
   *
   * The type of the `CfnCodeDeployBlueGreenHookProps.lifecycleEventHooks` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCodeDeployBlueGreenLifecycleEventHooks cfnCodeDeployBlueGreenLifecycleEventHooks =
   * CfnCodeDeployBlueGreenLifecycleEventHooks.builder()
   * .afterAllowTestTraffic("afterAllowTestTraffic")
   * .afterAllowTraffic("afterAllowTraffic")
   * .afterInstall("afterInstall")
   * .beforeAllowTraffic("beforeAllowTraffic")
   * .beforeInstall("beforeInstall")
   * .build();
   * ```
   */
  public inline
      fun cfnCodeDeployBlueGreenLifecycleEventHooks(block: CfnCodeDeployBlueGreenLifecycleEventHooksDsl.() -> Unit
      = {}): CfnCodeDeployBlueGreenLifecycleEventHooks {
    val builder = CfnCodeDeployBlueGreenLifecycleEventHooksDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * To perform an AWS CodeDeploy deployment when the version changes on an AWS::Lambda::Alias
   * resource, use the CodeDeployLambdaAliasUpdate update policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
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
  public inline
      fun cfnCodeDeployLambdaAliasUpdate(block: CfnCodeDeployLambdaAliasUpdateDsl.() -> Unit = {}):
      CfnCodeDeployLambdaAliasUpdate {
    val builder = CfnCodeDeployLambdaAliasUpdateDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents a CloudFormation condition, for resources which must be conditionally created and
   * the determination must be made at deploy time.
   *
   * Example:
   *
   * ```
   * CfnBucket rawBucket = CfnBucket.Builder.create(this, "Bucket").build();
   * // -or-
   * CfnBucket rawBucketAlt = (CfnBucket)myBucket.getNode().getDefaultChild();
   * // then
   * rawBucket.getCfnOptions().getCondition() = CfnCondition.Builder.create(this,
   * "EnableBucket").build();
   * rawBucket.getCfnOptions().getMetadata() = Map.of(
   * "metadataKey", "MetadataValue");
   * ```
   */
  public inline fun cfnCondition(
    scope: Construct,
    id: String,
    block: CfnConditionDsl.() -> Unit = {},
  ): CfnCondition {
    val builder = CfnConditionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * CfnBucket rawBucket = CfnBucket.Builder.create(this, "Bucket").build();
   * // -or-
   * CfnBucket rawBucketAlt = (CfnBucket)myBucket.getNode().getDefaultChild();
   * // then
   * rawBucket.getCfnOptions().getCondition() = CfnCondition.Builder.create(this,
   * "EnableBucket").build();
   * rawBucket.getCfnOptions().getMetadata() = Map.of(
   * "metadataKey", "MetadataValue");
   * ```
   */
  public inline fun cfnConditionProps(block: CfnConditionPropsDsl.() -> Unit = {}):
      CfnConditionProps {
    val builder = CfnConditionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Associate the CreationPolicy attribute with a resource to prevent its status from reaching
   * create complete until AWS CloudFormation receives a specified number of success signals or the
   * timeout period is exceeded.
   *
   * To signal a
   * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
   * publishes valid signals
   * to the stack events so that you track the number of signals sent.
   *
   * The creation policy is invoked only when AWS CloudFormation creates the associated resource.
   * Currently, the only
   * AWS CloudFormation resources that support creation policies are
   * AWS::AutoScaling::AutoScalingGroup, AWS::EC2::Instance,
   * AWS::CloudFormation::WaitCondition and AWS::AppStream::Fleet.
   *
   * Use the CreationPolicy attribute when you want to wait on resource configuration actions before
   * stack creation proceeds.
   * For example, if you install and configure software applications on an EC2 instance, you might
   * want those applications to
   * be running before proceeding. In such cases, you can add a CreationPolicy attribute to the
   * instance, and then send a success
   * signal to the instance after the applications are installed and configured. For a detailed
   * example, see Deploying Applications
   * on Amazon EC2 with AWS CloudFormation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCreationPolicy cfnCreationPolicy = CfnCreationPolicy.builder()
   * .autoScalingCreationPolicy(CfnResourceAutoScalingCreationPolicy.builder()
   * .minSuccessfulInstancesPercent(123)
   * .build())
   * .resourceSignal(CfnResourceSignal.builder()
   * .count(123)
   * .timeout("timeout")
   * .build())
   * .startFleet(false)
   * .build();
   * ```
   */
  public inline fun cfnCreationPolicy(block: CfnCreationPolicyDsl.() -> Unit = {}):
      CfnCreationPolicy {
    val builder = CfnCreationPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * In a CloudFormation template, you use the `AWS::CloudFormation::CustomResource` or `Custom::
   * *String*` resource type to specify custom resources.
   *
   * Custom resources provide a way for you to write custom provisioning logic in CloudFormation
   * template and have CloudFormation run it during a stack operation, such as when you create, update
   * or delete a stack. For more information, see [Custom
   * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-custom-resources.html)
   * .
   *
   *
   * If you use the [VPC
   * endpoints](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html) feature, custom
   * resources in the VPC must have access to CloudFormation -specific Amazon Simple Storage Service (
   * Amazon S3 ) buckets. Custom resources must send responses to a presigned Amazon S3 URL. If they
   * can't send responses to Amazon S3 , CloudFormation won't receive a response and the stack
   * operation fails. For more information, see [Setting up VPC endpoints for AWS
   * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-vpce-bucketnames.html)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCustomResource cfnCustomResource = CfnCustomResource.Builder.create(this,
   * "MyCfnCustomResource")
   * .serviceToken("serviceToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
   */
  public inline fun cfnCustomResource(
    scope: Construct,
    id: String,
    block: CfnCustomResourceDsl.() -> Unit = {},
  ): CfnCustomResource {
    val builder = CfnCustomResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnCustomResource`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnCustomResourceProps cfnCustomResourceProps = CfnCustomResourceProps.builder()
   * .serviceToken("serviceToken")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
   */
  public inline fun cfnCustomResourceProps(block: CfnCustomResourcePropsDsl.() -> Unit = {}):
      CfnCustomResourceProps {
    val builder = CfnCustomResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a Dynamic Reference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnDynamicReferenceProps cfnDynamicReferenceProps = CfnDynamicReferenceProps.builder()
   * .referenceKey("referenceKey")
   * .service(CfnDynamicReferenceService.SSM)
   * .build();
   * ```
   */
  public inline fun cfnDynamicReferenceProps(block: CfnDynamicReferencePropsDsl.() -> Unit = {}):
      CfnDynamicReferenceProps {
    val builder = CfnDynamicReferencePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents a CloudFormation resource.
   *
   * Example:
   *
   * ```
   * CfnInclude cfnTemplate;
   * // mutating the hook
   * Role myRole;
   * CfnHook hook = cfnTemplate.getHook("MyOutput");
   * CfnCodeDeployBlueGreenHook codeDeployHook = (CfnCodeDeployBlueGreenHook)hook;
   * codeDeployHook.getServiceRole() = myRole.getRoleArn();
   * ```
   */
  public inline fun cfnHook(
    scope: Construct,
    id: String,
    block: CfnHookDsl.() -> Unit = {},
  ): CfnHook {
    val builder = CfnHookDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `HookDefaultVersion` resource specifies the default version of the hook.
   *
   * The default version of the hook is used in CloudFormation operations for this AWS account and
   * AWS Region .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnHookDefaultVersion cfnHookDefaultVersion = CfnHookDefaultVersion.Builder.create(this,
   * "MyCfnHookDefaultVersion")
   * .typeName("typeName")
   * .typeVersionArn("typeVersionArn")
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html)
   */
  public inline fun cfnHookDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnHookDefaultVersionDsl.() -> Unit = {},
  ): CfnHookDefaultVersion {
    val builder = CfnHookDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnHookDefaultVersion`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnHookDefaultVersionProps cfnHookDefaultVersionProps = CfnHookDefaultVersionProps.builder()
   * .typeName("typeName")
   * .typeVersionArn("typeVersionArn")
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html)
   */
  public inline fun cfnHookDefaultVersionProps(block: CfnHookDefaultVersionPropsDsl.() -> Unit =
      {}): CfnHookDefaultVersionProps {
    val builder = CfnHookDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties of `CfnHook`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Object properties;
   * CfnHookProps cfnHookProps = CfnHookProps.builder()
   * .type("type")
   * // the properties below are optional
   * .properties(Map.of(
   * "propertiesKey", properties))
   * .build();
   * ```
   */
  public inline fun cfnHookProps(block: CfnHookPropsDsl.() -> Unit = {}): CfnHookProps {
    val builder = CfnHookPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `HookTypeConfig` resource specifies the configuration of a hook.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnHookTypeConfig cfnHookTypeConfig = CfnHookTypeConfig.Builder.create(this,
   * "MyCfnHookTypeConfig")
   * .configuration("configuration")
   * // the properties below are optional
   * .configurationAlias("configurationAlias")
   * .typeArn("typeArn")
   * .typeName("typeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html)
   */
  public inline fun cfnHookTypeConfig(
    scope: Construct,
    id: String,
    block: CfnHookTypeConfigDsl.() -> Unit = {},
  ): CfnHookTypeConfig {
    val builder = CfnHookTypeConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnHookTypeConfig`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnHookTypeConfigProps cfnHookTypeConfigProps = CfnHookTypeConfigProps.builder()
   * .configuration("configuration")
   * // the properties below are optional
   * .configurationAlias("configurationAlias")
   * .typeArn("typeArn")
   * .typeName("typeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hooktypeconfig.html)
   */
  public inline fun cfnHookTypeConfigProps(block: CfnHookTypeConfigPropsDsl.() -> Unit = {}):
      CfnHookTypeConfigProps {
    val builder = CfnHookTypeConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `HookVersion` resource publishes new or first hook version to the AWS CloudFormation
   * registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnHookVersion cfnHookVersion = CfnHookVersion.Builder.create(this, "MyCfnHookVersion")
   * .schemaHandlerPackage("schemaHandlerPackage")
   * .typeName("typeName")
   * // the properties below are optional
   * .executionRoleArn("executionRoleArn")
   * .loggingConfig(LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html)
   */
  public inline fun cfnHookVersion(
    scope: Construct,
    id: String,
    block: CfnHookVersionDsl.() -> Unit = {},
  ): CfnHookVersion {
    val builder = CfnHookVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `LoggingConfig` property type specifies logging configuration information for an extension.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-hookversion-loggingconfig.html)
   */
  public inline
      fun cfnHookVersionLoggingConfigProperty(block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnHookVersion.LoggingConfigProperty {
    val builder = CfnHookVersionLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnHookVersion`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnHookVersionProps cfnHookVersionProps = CfnHookVersionProps.builder()
   * .schemaHandlerPackage("schemaHandlerPackage")
   * .typeName("typeName")
   * // the properties below are optional
   * .executionRoleArn("executionRoleArn")
   * .loggingConfig(LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookversion.html)
   */
  public inline fun cfnHookVersionProps(block: CfnHookVersionPropsDsl.() -> Unit = {}):
      CfnHookVersionProps {
    val builder = CfnHookVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Captures a synthesis-time JSON object a CloudFormation reference which resolves during
   * deployment to the resolved values of the JSON object.
   *
   * The main use case for this is to overcome a limitation in CloudFormation that
   * does not allow using intrinsic functions as dictionary keys (because
   * dictionary keys in JSON must be strings). Specifically this is common in IAM
   * conditions such as `StringEquals: { lhs: "rhs" }` where you want "lhs" to be
   * a reference.
   *
   * This object is resolvable, so it can be used as a value.
   *
   * This construct is backed by a custom resource.
   *
   * Example:
   *
   * ```
   * CfnParameter tagParam = new CfnParameter(this, "TagName");
   * CfnJson stringEquals = CfnJson.Builder.create(this, "ConditionJson")
   * .value(Map.of(
   * String.format("aws:PrincipalTag/%s", tagParam.getValueAsString()), true))
   * .build();
   * PrincipalBase principal = new AccountRootPrincipal().withConditions(Map.of(
   * "StringEquals", stringEquals));
   * Role.Builder.create(this, "MyRole").assumedBy(principal).build();
   * ```
   */
  public inline fun cfnJson(
    scope: Construct,
    id: String,
    block: CfnJsonDsl.() -> Unit = {},
  ): CfnJson {
    val builder = CfnJsonDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * CfnParameter tagParam = new CfnParameter(this, "TagName");
   * CfnJson stringEquals = CfnJson.Builder.create(this, "ConditionJson")
   * .value(Map.of(
   * String.format("aws:PrincipalTag/%s", tagParam.getValueAsString()), true))
   * .build();
   * PrincipalBase principal = new AccountRootPrincipal().withConditions(Map.of(
   * "StringEquals", stringEquals));
   * Role.Builder.create(this, "MyRole").assumedBy(principal).build();
   * ```
   */
  public inline fun cfnJsonProps(block: CfnJsonPropsDsl.() -> Unit = {}): CfnJsonProps {
    val builder = CfnJsonPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CloudFormation::Macro` resource is a CloudFormation resource type that creates a
   * CloudFormation macro to perform custom processing on CloudFormation templates.
   *
   * For more information, see [Using AWS CloudFormation macros to perform custom processing on
   * templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnMacro cfnMacro = CfnMacro.Builder.create(this, "MyCfnMacro")
   * .functionName("functionName")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html)
   */
  public inline fun cfnMacro(
    scope: Construct,
    id: String,
    block: CfnMacroDsl.() -> Unit = {},
  ): CfnMacro {
    val builder = CfnMacroDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnMacro`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnMacroProps cfnMacroProps = CfnMacroProps.builder()
   * .functionName("functionName")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-macro.html)
   */
  public inline fun cfnMacroProps(block: CfnMacroPropsDsl.() -> Unit = {}): CfnMacroProps {
    val builder = CfnMacroPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents a CloudFormation mapping.
   *
   * Example:
   *
   * ```
   * CfnMapping regionTable = CfnMapping.Builder.create(this, "RegionTable")
   * .mapping(Map.of(
   * "us-east-1", Map.of(
   * "regionName", "US East (N. Virginia)"),
   * "us-east-2", Map.of(
   * "regionName", "US East (Ohio)")))
   * .build();
   * regionTable.findInMap(Aws.REGION, "regionName");
   * ```
   */
  public inline fun cfnMapping(
    scope: Construct,
    id: String,
    block: CfnMappingDsl.() -> Unit = {},
  ): CfnMapping {
    val builder = CfnMappingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * CfnMapping regionTable = CfnMapping.Builder.create(this, "RegionTable")
   * .mapping(Map.of(
   * "us-east-1", Map.of(
   * "regionName", "US East (N. Virginia)"),
   * "us-east-2", Map.of(
   * "regionName", "US East (Ohio)")))
   * .build();
   * regionTable.findInMap(Aws.REGION, "regionName");
   * ```
   */
  public inline fun cfnMappingProps(block: CfnMappingPropsDsl.() -> Unit = {}): CfnMappingProps {
    val builder = CfnMappingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the default version of a module.
   *
   * The default version of the module will be used in CloudFormation operations for this account
   * and Region.
   *
   * To register a module version, use the
   * `[AWS::CloudFormation::ModuleVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)`
   * resource.
   *
   * For more information using modules, see [Using modules to encapsulate and reuse resource
   * configurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/modules.html) and
   * [Registering
   * extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register)
   * in the *AWS CloudFormation User Guide* . For information on developing modules, see [Developing
   * modules](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules.html) in the *AWS
   * CloudFormation CLI User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnModuleDefaultVersion cfnModuleDefaultVersion = CfnModuleDefaultVersion.Builder.create(this,
   * "MyCfnModuleDefaultVersion")
   * .arn("arn")
   * .moduleName("moduleName")
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)
   */
  public inline fun cfnModuleDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnModuleDefaultVersionDsl.() -> Unit = {},
  ): CfnModuleDefaultVersion {
    val builder = CfnModuleDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnModuleDefaultVersion`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnModuleDefaultVersionProps cfnModuleDefaultVersionProps =
   * CfnModuleDefaultVersionProps.builder()
   * .arn("arn")
   * .moduleName("moduleName")
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)
   */
  public inline fun cfnModuleDefaultVersionProps(block: CfnModuleDefaultVersionPropsDsl.() -> Unit =
      {}): CfnModuleDefaultVersionProps {
    val builder = CfnModuleDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Registers the specified version of the module with the CloudFormation service.
   *
   * Registering a module makes it available for use in CloudFormation templates in your AWS account
   * and Region.
   *
   * To specify a module version as the default version, use the
   * `[AWS::CloudFormation::ModuleDefaultVersion](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)`
   * resource.
   *
   * For more information using modules, see [Using modules to encapsulate and reuse resource
   * configurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/modules.html) and
   * [Registering
   * extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html#registry-register)
   * in the *CloudFormation User Guide* . For information on developing modules, see [Developing
   * modules](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules.html) in the
   * *CloudFormation CLI User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnModuleVersion cfnModuleVersion = CfnModuleVersion.Builder.create(this, "MyCfnModuleVersion")
   * .moduleName("moduleName")
   * .modulePackage("modulePackage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)
   */
  public inline fun cfnModuleVersion(
    scope: Construct,
    id: String,
    block: CfnModuleVersionDsl.() -> Unit = {},
  ): CfnModuleVersion {
    val builder = CfnModuleVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnModuleVersion`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnModuleVersionProps cfnModuleVersionProps = CfnModuleVersionProps.builder()
   * .moduleName("moduleName")
   * .modulePackage("modulePackage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)
   */
  public inline fun cfnModuleVersionProps(block: CfnModuleVersionPropsDsl.() -> Unit = {}):
      CfnModuleVersionProps {
    val builder = CfnModuleVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * Cluster cluster;
   * // add service account
   * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
   * Bucket bucket = new Bucket(this, "Bucket");
   * bucket.grantReadWrite(serviceAccount);
   * KubernetesManifest mypod = cluster.addManifest("mypod", Map.of(
   * "apiVersion", "v1",
   * "kind", "Pod",
   * "metadata", Map.of("name", "mypod"),
   * "spec", Map.of(
   * "serviceAccountName", serviceAccount.getServiceAccountName(),
   * "containers", List.of(Map.of(
   * "name", "hello",
   * "image", "paulbouwer/hello-kubernetes:1.5",
   * "ports", List.of(Map.of("containerPort", 8080)))))));
   * // create the resource after the service account.
   * mypod.node.addDependency(serviceAccount);
   * // print the IAM role arn for this service account
   * // print the IAM role arn for this service account
   * CfnOutput.Builder.create(this,
   * "ServiceAccountIamRole").value(serviceAccount.getRole().getRoleArn()).build();
   * ```
   */
  public inline fun cfnOutput(
    scope: Construct,
    id: String,
    block: CfnOutputDsl.() -> Unit = {},
  ): CfnOutput {
    val builder = CfnOutputDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * Cluster cluster;
   * // add service account
   * ServiceAccount serviceAccount = cluster.addServiceAccount("MyServiceAccount");
   * Bucket bucket = new Bucket(this, "Bucket");
   * bucket.grantReadWrite(serviceAccount);
   * KubernetesManifest mypod = cluster.addManifest("mypod", Map.of(
   * "apiVersion", "v1",
   * "kind", "Pod",
   * "metadata", Map.of("name", "mypod"),
   * "spec", Map.of(
   * "serviceAccountName", serviceAccount.getServiceAccountName(),
   * "containers", List.of(Map.of(
   * "name", "hello",
   * "image", "paulbouwer/hello-kubernetes:1.5",
   * "ports", List.of(Map.of("containerPort", 8080)))))));
   * // create the resource after the service account.
   * mypod.node.addDependency(serviceAccount);
   * // print the IAM role arn for this service account
   * // print the IAM role arn for this service account
   * CfnOutput.Builder.create(this,
   * "ServiceAccountIamRole").value(serviceAccount.getRole().getRoleArn()).build();
   * ```
   */
  public inline fun cfnOutputProps(block: CfnOutputPropsDsl.() -> Unit = {}): CfnOutputProps {
    val builder = CfnOutputPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A CloudFormation parameter.
   *
   * Use the optional Parameters section to customize your templates.
   * Parameters enable you to input custom values to your template each time you create or
   * update a stack.
   *
   * Example:
   *
   * ```
   * Topic myTopic = new Topic(this, "MyTopic");
   * CfnParameter url = new CfnParameter(this, "url-param");
   * myTopic.addSubscription(new UrlSubscription(url.getValueAsString()));
   * ```
   */
  public inline fun cfnParameter(
    scope: Construct,
    id: String,
    block: CfnParameterDsl.() -> Unit = {},
  ): CfnParameter {
    val builder = CfnParameterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * CfnParameter.Builder.create(this, "MyParameter")
   * .type("Number")
   * .default(1337)
   * .build();
   * ```
   */
  public inline fun cfnParameterProps(block: CfnParameterPropsDsl.() -> Unit = {}):
      CfnParameterProps {
    val builder = CfnParameterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Tests and publishes a registered extension as a public, third-party extension.
   *
   * CloudFormation first tests the extension to make sure it meets all necessary requirements for
   * being published in the CloudFormation registry. If it does, CloudFormation then publishes it to
   * the registry as a public third-party extension in this Region. Public extensions are available for
   * use by all CloudFormation users.
   *
   * * For resource types, testing includes passing all contracts tests defined for the type.
   * * For modules, testing includes determining if the module's model meets all necessary
   * requirements.
   *
   * For more information, see [Testing your public extension prior to
   * publishing](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-testing)
   * in the *CloudFormation CLI User Guide* .
   *
   * If you don't specify a version, CloudFormation uses the default version of the extension in
   * your account and Region for testing.
   *
   * To perform testing, CloudFormation assumes the execution role specified when the type was
   * registered.
   *
   * An extension must have a test status of `PASSED` before it can be published. For more
   * information, see [Publishing extensions to make them available for public
   * use](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-publish.html)
   * in the *CloudFormation CLI User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnPublicTypeVersion cfnPublicTypeVersion = CfnPublicTypeVersion.Builder.create(this,
   * "MyCfnPublicTypeVersion")
   * .arn("arn")
   * .logDeliveryBucket("logDeliveryBucket")
   * .publicVersionNumber("publicVersionNumber")
   * .type("type")
   * .typeName("typeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html)
   */
  public inline fun cfnPublicTypeVersion(
    scope: Construct,
    id: String,
    block: CfnPublicTypeVersionDsl.() -> Unit = {},
  ): CfnPublicTypeVersion {
    val builder = CfnPublicTypeVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPublicTypeVersion`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnPublicTypeVersionProps cfnPublicTypeVersionProps = CfnPublicTypeVersionProps.builder()
   * .arn("arn")
   * .logDeliveryBucket("logDeliveryBucket")
   * .publicVersionNumber("publicVersionNumber")
   * .type("type")
   * .typeName("typeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publictypeversion.html)
   */
  public inline fun cfnPublicTypeVersionProps(block: CfnPublicTypeVersionPropsDsl.() -> Unit = {}):
      CfnPublicTypeVersionProps {
    val builder = CfnPublicTypeVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Registers your account as a publisher of public extensions in the CloudFormation registry.
   *
   * Public extensions are available for use by all CloudFormation users.
   *
   * For information on requirements for registering as a public extension publisher, see
   * [Registering your account to publish CloudFormation
   * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
   * in the *CloudFormation CLI User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnPublisher cfnPublisher = CfnPublisher.Builder.create(this, "MyCfnPublisher")
   * .acceptTermsAndConditions(false)
   * // the properties below are optional
   * .connectionArn("connectionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html)
   */
  public inline fun cfnPublisher(
    scope: Construct,
    id: String,
    block: CfnPublisherDsl.() -> Unit = {},
  ): CfnPublisher {
    val builder = CfnPublisherDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPublisher`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnPublisherProps cfnPublisherProps = CfnPublisherProps.builder()
   * .acceptTermsAndConditions(false)
   * // the properties below are optional
   * .connectionArn("connectionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html)
   */
  public inline fun cfnPublisherProps(block: CfnPublisherPropsDsl.() -> Unit = {}):
      CfnPublisherProps {
    val builder = CfnPublisherPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents a CloudFormation resource.
   *
   * Example:
   *
   * ```
   * public class MyConstruct extends Resource implements ITaggable {
   * public final Object tags;
   * public MyConstruct(Construct scope, String id) {
   * super(scope, id);
   * CfnResource.Builder.create(this, "Resource")
   * .type("Whatever::The::Type")
   * .properties(Map.of(
   * // ...
   * "Tags", this.tags.getRenderedTags()))
   * .build();
   * }
   * }
   * ```
   */
  public inline fun cfnResource(
    scope: Construct,
    id: String,
    block: CfnResourceDsl.() -> Unit = {},
  ): CfnResource {
    val builder = CfnResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * For an Auto Scaling group replacement update, specifies how many instances must signal success
   * for the update to succeed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnResourceAutoScalingCreationPolicy cfnResourceAutoScalingCreationPolicy =
   * CfnResourceAutoScalingCreationPolicy.builder()
   * .minSuccessfulInstancesPercent(123)
   * .build();
   * ```
   */
  public inline
      fun cfnResourceAutoScalingCreationPolicy(block: CfnResourceAutoScalingCreationPolicyDsl.() -> Unit
      = {}): CfnResourceAutoScalingCreationPolicy {
    val builder = CfnResourceAutoScalingCreationPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the default version of a resource.
   *
   * The default version of a resource will be used in CloudFormation operations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnResourceDefaultVersion cfnResourceDefaultVersion =
   * CfnResourceDefaultVersion.Builder.create(this, "MyCfnResourceDefaultVersion")
   * .typeName("typeName")
   * .typeVersionArn("typeVersionArn")
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html)
   */
  public inline fun cfnResourceDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnResourceDefaultVersionDsl.() -> Unit = {},
  ): CfnResourceDefaultVersion {
    val builder = CfnResourceDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnResourceDefaultVersion`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnResourceDefaultVersionProps cfnResourceDefaultVersionProps =
   * CfnResourceDefaultVersionProps.builder()
   * .typeName("typeName")
   * .typeVersionArn("typeVersionArn")
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html)
   */
  public inline
      fun cfnResourceDefaultVersionProps(block: CfnResourceDefaultVersionPropsDsl.() -> Unit = {}):
      CfnResourceDefaultVersionProps {
    val builder = CfnResourceDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * public class MyConstruct extends Resource implements ITaggable {
   * public final Object tags;
   * public MyConstruct(Construct scope, String id) {
   * super(scope, id);
   * CfnResource.Builder.create(this, "Resource")
   * .type("Whatever::The::Type")
   * .properties(Map.of(
   * // ...
   * "Tags", this.tags.getRenderedTags()))
   * .build();
   * }
   * }
   * ```
   */
  public inline fun cfnResourceProps(block: CfnResourcePropsDsl.() -> Unit = {}): CfnResourceProps {
    val builder = CfnResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * When AWS CloudFormation creates the associated resource, configures the number of required
   * success signals and the length of time that AWS CloudFormation waits for those signals.
   *
   * Example:
   *
   * ```
   * CfnResource resource;
   * resource.getCfnOptions().getCreationPolicy() = CfnCreationPolicy.builder()
   * .resourceSignal(CfnResourceSignal.builder()
   * .count(3)
   * .timeout("PR15M")
   * .build())
   * .build();
   * ```
   */
  public inline fun cfnResourceSignal(block: CfnResourceSignalDsl.() -> Unit = {}):
      CfnResourceSignal {
    val builder = CfnResourceSignalDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Registers a resource version with the CloudFormation service.
   *
   * Registering a resource version makes it available for use in CloudFormation templates in your
   * AWS account , and includes:
   *
   * * Validating the resource schema.
   * * Determining which handlers, if any, have been specified for the resource.
   * * Making the resource available for use in your account.
   *
   * For more information on how to develop resources and ready them for registration, see [Creating
   * Resource
   * Providers](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-types.html) in
   * the *CloudFormation CLI User Guide* .
   *
   * You can have a maximum of 50 resource versions registered at a time. This maximum is per
   * account and per Region.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnResourceVersion cfnResourceVersion = CfnResourceVersion.Builder.create(this,
   * "MyCfnResourceVersion")
   * .schemaHandlerPackage("schemaHandlerPackage")
   * .typeName("typeName")
   * // the properties below are optional
   * .executionRoleArn("executionRoleArn")
   * .loggingConfig(LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html)
   */
  public inline fun cfnResourceVersion(
    scope: Construct,
    id: String,
    block: CfnResourceVersionDsl.() -> Unit = {},
  ): CfnResourceVersion {
    val builder = CfnResourceVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Logging configuration information for a resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-resourceversion-loggingconfig.html)
   */
  public inline
      fun cfnResourceVersionLoggingConfigProperty(block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnResourceVersion.LoggingConfigProperty {
    val builder = CfnResourceVersionLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnResourceVersion`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnResourceVersionProps cfnResourceVersionProps = CfnResourceVersionProps.builder()
   * .schemaHandlerPackage("schemaHandlerPackage")
   * .typeName("typeName")
   * // the properties below are optional
   * .executionRoleArn("executionRoleArn")
   * .loggingConfig(LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourceversion.html)
   */
  public inline fun cfnResourceVersionProps(block: CfnResourceVersionPropsDsl.() -> Unit = {}):
      CfnResourceVersionProps {
    val builder = CfnResourceVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The Rules that define template constraints in an AWS Service Catalog portfolio describe when
   * end users can use the template and which values they can specify for parameters that are declared
   * in the AWS CloudFormation template used to create the product they are attempting to use.
   *
   * Rules
   * are useful for preventing end users from inadvertently specifying an incorrect value.
   * For example, you can add a rule to verify whether end users specified a valid subnet in a
   * given VPC or used m1.small instance types for test environments. AWS CloudFormation uses
   * rules to validate parameter values before it creates the resources for the product.
   *
   * A rule can include a RuleCondition property and must include an Assertions property.
   * For each rule, you can define only one rule condition; you can define one or more asserts
   * within the Assertions property.
   * You define a rule condition and assertions by using rule-specific intrinsic functions.
   *
   * Example:
   *
   * ```
   * CfnInclude cfnTemplate;
   * // mutating the rule
   * CfnParameter myParameter;
   * CfnRule rule = cfnTemplate.getRule("MyRule");
   * rule.addAssertion(Fn.conditionContains(List.of("m1.small"), myParameter.getValueAsString()),
   * "MyParameter has to be m1.small");
   * ```
   */
  public inline fun cfnRule(
    scope: Construct,
    id: String,
    block: CfnRuleDsl.() -> Unit = {},
  ): CfnRule {
    val builder = CfnRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * A rule assertion.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ICfnConditionExpression cfnConditionExpression;
   * CfnRuleAssertion cfnRuleAssertion = CfnRuleAssertion.builder()
   * .assert(cfnConditionExpression)
   * .assertDescription("assertDescription")
   * .build();
   * ```
   */
  public inline fun cfnRuleAssertion(block: CfnRuleAssertionDsl.() -> Unit = {}): CfnRuleAssertion {
    val builder = CfnRuleAssertionDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A rule can include a RuleCondition property and must include an Assertions property.
   *
   * For each rule, you can define only one rule condition; you can define one or more asserts
   * within the Assertions property.
   * You define a rule condition and assertions by using rule-specific intrinsic functions.
   *
   * You can use the following rule-specific intrinsic functions to define rule conditions and
   * assertions:
   *
   * Fn::And
   * Fn::Contains
   * Fn::EachMemberEquals
   * Fn::EachMemberIn
   * Fn::Equals
   * Fn::If
   * Fn::Not
   * Fn::Or
   * Fn::RefAll
   * Fn::ValueOf
   * Fn::ValueOfAll
   *
   * https://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ICfnConditionExpression cfnConditionExpression;
   * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
   * .assertions(List.of(CfnRuleAssertion.builder()
   * .assert(cfnConditionExpression)
   * .assertDescription("assertDescription")
   * .build()))
   * .ruleCondition(cfnConditionExpression)
   * .build();
   * ```
   */
  public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
    val builder = CfnRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CloudFormation::Stack` resource nests a stack as a resource in a top-level template.
   *
   * You can add output values from a nested stack within the containing template. You use the
   * [GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
   * function with the nested stack's logical name and the name of the output value in the nested stack
   * in the format `Outputs. *NestedStackOutputName*` .
   *
   *
   * We strongly recommend that updates to nested stacks are run from the parent stack.
   *
   *
   * When you apply template changes to update a top-level stack, CloudFormation updates the
   * top-level stack and initiates an update to its nested stacks. CloudFormation updates the resources
   * of modified nested stacks, but doesn't update the resources of unmodified nested stacks. For more
   * information, see [CloudFormation stack
   * updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
   * .
   *
   *
   * You must acknowledge IAM capabilities for nested stacks that contain IAM resources. Also,
   * verify that you have cancel update stack permissions, which is required if an update rolls back.
   * For more information about IAM and CloudFormation , see [Controlling access with AWS Identity and
   * Access
   * Management](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
   * .templateUrl("templateUrl")
   * // the properties below are optional
   * .notificationArns(List.of("notificationArns"))
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .timeoutInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html)
   */
  public inline fun cfnStack(
    scope: Construct,
    id: String,
    block: CfnStackDsl.() -> Unit = {},
  ): CfnStack {
    val builder = CfnStackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnStack`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnStackProps cfnStackProps = CfnStackProps.builder()
   * .templateUrl("templateUrl")
   * // the properties below are optional
   * .notificationArns(List.of("notificationArns"))
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .timeoutInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html)
   */
  public inline fun cfnStackProps(block: CfnStackPropsDsl.() -> Unit = {}): CfnStackProps {
    val builder = CfnStackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CloudFormation::StackSet` enables you to provision stacks into AWS accounts and
   * across Regions by using a single CloudFormation template.
   *
   * In the stack set, you specify the template to use, in addition to any parameters and
   * capabilities that the template requires.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Object managedExecution;
   * CfnStackSet cfnStackSet = CfnStackSet.Builder.create(this, "MyCfnStackSet")
   * .permissionModel("permissionModel")
   * .stackSetName("stackSetName")
   * // the properties below are optional
   * .administrationRoleArn("administrationRoleArn")
   * .autoDeployment(AutoDeploymentProperty.builder()
   * .enabled(false)
   * .retainStacksOnAccountRemoval(false)
   * .build())
   * .callAs("callAs")
   * .capabilities(List.of("capabilities"))
   * .description("description")
   * .executionRoleName("executionRoleName")
   * .managedExecution(managedExecution)
   * .operationPreferences(OperationPreferencesProperty.builder()
   * .failureToleranceCount(123)
   * .failureTolerancePercentage(123)
   * .maxConcurrentCount(123)
   * .maxConcurrentPercentage(123)
   * .regionConcurrencyType("regionConcurrencyType")
   * .regionOrder(List.of("regionOrder"))
   * .build())
   * .parameters(List.of(ParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build()))
   * .stackInstancesGroup(List.of(StackInstancesProperty.builder()
   * .deploymentTargets(DeploymentTargetsProperty.builder()
   * .accountFilterType("accountFilterType")
   * .accounts(List.of("accounts"))
   * .organizationalUnitIds(List.of("organizationalUnitIds"))
   * .build())
   * .regions(List.of("regions"))
   * // the properties below are optional
   * .parameterOverrides(List.of(ParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .templateBody("templateBody")
   * .templateUrl("templateUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html)
   */
  public inline fun cfnStackSet(
    scope: Construct,
    id: String,
    block: CfnStackSetDsl.() -> Unit = {},
  ): CfnStackSet {
    val builder = CfnStackSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
   * Organizations accounts that are added to a target organizational unit (OU).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * AutoDeploymentProperty autoDeploymentProperty = AutoDeploymentProperty.builder()
   * .enabled(false)
   * .retainStacksOnAccountRemoval(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-autodeployment.html)
   */
  public inline
      fun cfnStackSetAutoDeploymentProperty(block: CfnStackSetAutoDeploymentPropertyDsl.() -> Unit =
      {}): CfnStackSet.AutoDeploymentProperty {
    val builder = CfnStackSetAutoDeploymentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The AWS OrganizationalUnitIds or Accounts for which to create stack instances in the specified
   * Regions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DeploymentTargetsProperty deploymentTargetsProperty = DeploymentTargetsProperty.builder()
   * .accountFilterType("accountFilterType")
   * .accounts(List.of("accounts"))
   * .organizationalUnitIds(List.of("organizationalUnitIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-deploymenttargets.html)
   */
  public inline
      fun cfnStackSetDeploymentTargetsProperty(block: CfnStackSetDeploymentTargetsPropertyDsl.() -> Unit
      = {}): CfnStackSet.DeploymentTargetsProperty {
    val builder = CfnStackSetDeploymentTargetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Describes whether StackSets performs non-conflicting operations concurrently and queues
   * conflicting operations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ManagedExecutionProperty managedExecutionProperty = ManagedExecutionProperty.builder()
   * .active(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-managedexecution.html)
   */
  public inline
      fun cfnStackSetManagedExecutionProperty(block: CfnStackSetManagedExecutionPropertyDsl.() -> Unit
      = {}): CfnStackSet.ManagedExecutionProperty {
    val builder = CfnStackSetManagedExecutionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
   *
   * For more information on maximum concurrent accounts and failure tolerance, see [Stack set
   * operation
   * options](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * OperationPreferencesProperty operationPreferencesProperty =
   * OperationPreferencesProperty.builder()
   * .failureToleranceCount(123)
   * .failureTolerancePercentage(123)
   * .maxConcurrentCount(123)
   * .maxConcurrentPercentage(123)
   * .regionConcurrencyType("regionConcurrencyType")
   * .regionOrder(List.of("regionOrder"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-operationpreferences.html)
   */
  public inline
      fun cfnStackSetOperationPreferencesProperty(block: CfnStackSetOperationPreferencesPropertyDsl.() -> Unit
      = {}): CfnStackSet.OperationPreferencesProperty {
    val builder = CfnStackSetOperationPreferencesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The Parameter data type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ParameterProperty parameterProperty = ParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-parameter.html)
   */
  public inline fun cfnStackSetParameterProperty(block: CfnStackSetParameterPropertyDsl.() -> Unit =
      {}): CfnStackSet.ParameterProperty {
    val builder = CfnStackSetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnStackSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Object managedExecution;
   * CfnStackSetProps cfnStackSetProps = CfnStackSetProps.builder()
   * .permissionModel("permissionModel")
   * .stackSetName("stackSetName")
   * // the properties below are optional
   * .administrationRoleArn("administrationRoleArn")
   * .autoDeployment(AutoDeploymentProperty.builder()
   * .enabled(false)
   * .retainStacksOnAccountRemoval(false)
   * .build())
   * .callAs("callAs")
   * .capabilities(List.of("capabilities"))
   * .description("description")
   * .executionRoleName("executionRoleName")
   * .managedExecution(managedExecution)
   * .operationPreferences(OperationPreferencesProperty.builder()
   * .failureToleranceCount(123)
   * .failureTolerancePercentage(123)
   * .maxConcurrentCount(123)
   * .maxConcurrentPercentage(123)
   * .regionConcurrencyType("regionConcurrencyType")
   * .regionOrder(List.of("regionOrder"))
   * .build())
   * .parameters(List.of(ParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build()))
   * .stackInstancesGroup(List.of(StackInstancesProperty.builder()
   * .deploymentTargets(DeploymentTargetsProperty.builder()
   * .accountFilterType("accountFilterType")
   * .accounts(List.of("accounts"))
   * .organizationalUnitIds(List.of("organizationalUnitIds"))
   * .build())
   * .regions(List.of("regions"))
   * // the properties below are optional
   * .parameterOverrides(List.of(ParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build()))
   * .build()))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .templateBody("templateBody")
   * .templateUrl("templateUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html)
   */
  public inline fun cfnStackSetProps(block: CfnStackSetPropsDsl.() -> Unit = {}): CfnStackSetProps {
    val builder = CfnStackSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Stack instances in some specific accounts and Regions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * StackInstancesProperty stackInstancesProperty = StackInstancesProperty.builder()
   * .deploymentTargets(DeploymentTargetsProperty.builder()
   * .accountFilterType("accountFilterType")
   * .accounts(List.of("accounts"))
   * .organizationalUnitIds(List.of("organizationalUnitIds"))
   * .build())
   * .regions(List.of("regions"))
   * // the properties below are optional
   * .parameterOverrides(List.of(ParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stackset-stackinstances.html)
   */
  public inline
      fun cfnStackSetStackInstancesProperty(block: CfnStackSetStackInstancesPropertyDsl.() -> Unit =
      {}): CfnStackSet.StackInstancesProperty {
    val builder = CfnStackSetStackInstancesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnTag cfnTag = CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   */
  public inline fun cfnTag(block: CfnTagDsl.() -> Unit = {}): CfnTag {
    val builder = CfnTagDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A traffic route, representing where the traffic is being directed to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnTrafficRoute cfnTrafficRoute = CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build();
   * ```
   */
  public inline fun cfnTrafficRoute(block: CfnTrafficRouteDsl.() -> Unit = {}): CfnTrafficRoute {
    val builder = CfnTrafficRouteDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Type of the `CfnCodeDeployBlueGreenEcsAttributes.trafficRouting` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnTrafficRouting cfnTrafficRouting = CfnTrafficRouting.builder()
   * .prodTrafficRoute(CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .targetGroups(List.of("targetGroups"))
   * .testTrafficRoute(CfnTrafficRoute.builder()
   * .logicalId("logicalId")
   * .type("type")
   * .build())
   * .build();
   * ```
   */
  public inline fun cfnTrafficRouting(block: CfnTrafficRoutingDsl.() -> Unit = {}):
      CfnTrafficRouting {
    val builder = CfnTrafficRoutingDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Traffic routing configuration settings.
   *
   * The type of the `CfnCodeDeployBlueGreenHookProps.trafficRoutingConfig` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnTrafficRoutingConfig cfnTrafficRoutingConfig = CfnTrafficRoutingConfig.builder()
   * .type(CfnTrafficRoutingType.ALL_AT_ONCE)
   * // the properties below are optional
   * .timeBasedCanary(CfnTrafficRoutingTimeBasedCanary.builder()
   * .bakeTimeMins(123)
   * .stepPercentage(123)
   * .build())
   * .timeBasedLinear(CfnTrafficRoutingTimeBasedLinear.builder()
   * .bakeTimeMins(123)
   * .stepPercentage(123)
   * .build())
   * .build();
   * ```
   */
  public inline fun cfnTrafficRoutingConfig(block: CfnTrafficRoutingConfigDsl.() -> Unit = {}):
      CfnTrafficRoutingConfig {
    val builder = CfnTrafficRoutingConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The traffic routing configuration if `CfnTrafficRoutingConfig.type` is
   * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnTrafficRoutingTimeBasedCanary cfnTrafficRoutingTimeBasedCanary =
   * CfnTrafficRoutingTimeBasedCanary.builder()
   * .bakeTimeMins(123)
   * .stepPercentage(123)
   * .build();
   * ```
   */
  public inline
      fun cfnTrafficRoutingTimeBasedCanary(block: CfnTrafficRoutingTimeBasedCanaryDsl.() -> Unit =
      {}): CfnTrafficRoutingTimeBasedCanary {
    val builder = CfnTrafficRoutingTimeBasedCanaryDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The traffic routing configuration if `CfnTrafficRoutingConfig.type` is
   * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnTrafficRoutingTimeBasedLinear cfnTrafficRoutingTimeBasedLinear =
   * CfnTrafficRoutingTimeBasedLinear.builder()
   * .bakeTimeMins(123)
   * .stepPercentage(123)
   * .build();
   * ```
   */
  public inline
      fun cfnTrafficRoutingTimeBasedLinear(block: CfnTrafficRoutingTimeBasedLinearDsl.() -> Unit =
      {}): CfnTrafficRoutingTimeBasedLinear {
    val builder = CfnTrafficRoutingTimeBasedLinearDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Activates a public third-party extension, making it available for use in stack templates.
   *
   * For more information, see [Using public
   * extensions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html)
   * in the *AWS CloudFormation User Guide* .
   *
   * Once you have activated a public third-party extension in your account and Region, use
   * [SetTypeConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_SetTypeConfiguration.html)
   * to specify configuration properties for the extension. For more information, see [Configuring
   * extensions at the account
   * level](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration)
   * in the *CloudFormation User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnTypeActivation cfnTypeActivation = CfnTypeActivation.Builder.create(this,
   * "MyCfnTypeActivation")
   * .autoUpdate(false)
   * .executionRoleArn("executionRoleArn")
   * .loggingConfig(LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build())
   * .majorVersion("majorVersion")
   * .publicTypeArn("publicTypeArn")
   * .publisherId("publisherId")
   * .type("type")
   * .typeName("typeName")
   * .typeNameAlias("typeNameAlias")
   * .versionBump("versionBump")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html)
   */
  public inline fun cfnTypeActivation(
    scope: Construct,
    id: String,
    block: CfnTypeActivationDsl.() -> Unit = {},
  ): CfnTypeActivation {
    val builder = CfnTypeActivationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains logging configuration information for an extension.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html)
   */
  public inline
      fun cfnTypeActivationLoggingConfigProperty(block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnTypeActivation.LoggingConfigProperty {
    val builder = CfnTypeActivationLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnTypeActivation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnTypeActivationProps cfnTypeActivationProps = CfnTypeActivationProps.builder()
   * .autoUpdate(false)
   * .executionRoleArn("executionRoleArn")
   * .loggingConfig(LoggingConfigProperty.builder()
   * .logGroupName("logGroupName")
   * .logRoleArn("logRoleArn")
   * .build())
   * .majorVersion("majorVersion")
   * .publicTypeArn("publicTypeArn")
   * .publisherId("publisherId")
   * .type("type")
   * .typeName("typeName")
   * .typeNameAlias("typeNameAlias")
   * .versionBump("versionBump")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-typeactivation.html)
   */
  public inline fun cfnTypeActivationProps(block: CfnTypeActivationPropsDsl.() -> Unit = {}):
      CfnTypeActivationProps {
    val builder = CfnTypeActivationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
   * AWS::AutoScaling::AutoScalingGroup resource.
   *
   * AWS CloudFormation invokes one of three update policies depending on the type of change you
   * make or whether a
   * scheduled action is associated with the Auto Scaling group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnUpdatePolicy cfnUpdatePolicy = CfnUpdatePolicy.builder()
   * .autoScalingReplacingUpdate(CfnAutoScalingReplacingUpdate.builder()
   * .willReplace(false)
   * .build())
   * .autoScalingRollingUpdate(CfnAutoScalingRollingUpdate.builder()
   * .maxBatchSize(123)
   * .minInstancesInService(123)
   * .minSuccessfulInstancesPercent(123)
   * .pauseTime("pauseTime")
   * .suspendProcesses(List.of("suspendProcesses"))
   * .waitOnResourceSignals(false)
   * .build())
   * .autoScalingScheduledAction(CfnAutoScalingScheduledAction.builder()
   * .ignoreUnmodifiedGroupSizeProperties(false)
   * .build())
   * .codeDeployLambdaAliasUpdate(CfnCodeDeployLambdaAliasUpdate.builder()
   * .applicationName("applicationName")
   * .deploymentGroupName("deploymentGroupName")
   * // the properties below are optional
   * .afterAllowTrafficHook("afterAllowTrafficHook")
   * .beforeAllowTrafficHook("beforeAllowTrafficHook")
   * .build())
   * .enableVersionUpgrade(false)
   * .useOnlineResharding(false)
   * .build();
   * ```
   */
  public inline fun cfnUpdatePolicy(block: CfnUpdatePolicyDsl.() -> Unit = {}): CfnUpdatePolicy {
    val builder = CfnUpdatePolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * For Amazon EC2 and Auto Scaling resources, we recommend that you use a `CreationPolicy`
   * attribute instead of wait conditions.
   *
   * Add a CreationPolicy attribute to those resources, and use the cfn-signal helper script to
   * signal when an instance creation process has completed successfully.
   *
   * You can use a wait condition for situations like the following:
   *
   * * To coordinate stack resource creation with configuration actions that are external to the
   * stack creation.
   * * To track the status of a configuration process.
   *
   * For these situations, we recommend that you associate a
   * [CreationPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-creationpolicy.html)
   * attribute with the wait condition so that you don't have to use a wait condition handle. For more
   * information and an example, see [Creating wait conditions in a
   * template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-waitcondition.html)
   * . If you use a CreationPolicy with a wait condition, don't specify any of the wait condition's
   * properties.
   *
   *
   * If you use the [VPC
   * endpoints](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html) feature, resources
   * in the VPC that respond to wait conditions must have access to CloudFormation , specific Amazon
   * Simple Storage Service ( Amazon S3 ) buckets. Resources must send wait condition responses to a
   * presigned Amazon S3 URL. If they can't send responses to Amazon S3 , CloudFormation won't receive
   * a response and the stack operation fails. For more information, see [Setting up VPC endpoints for
   * AWS
   * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-vpce-bucketnames.html)
   * .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnWaitCondition cfnWaitCondition = CfnWaitCondition.Builder.create(this, "MyCfnWaitCondition")
   * .count(123)
   * .handle("handle")
   * .timeout("timeout")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html)
   */
  public inline fun cfnWaitCondition(
    scope: Construct,
    id: String,
    block: CfnWaitConditionDsl.() -> Unit = {},
  ): CfnWaitCondition {
    val builder = CfnWaitConditionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * For Amazon EC2 and Auto Scaling resources, we recommend that you use a `CreationPolicy`
   * attribute instead of wait conditions.
   *
   * Add a `CreationPolicy` attribute to those resources, and use the cfn-signal helper script to
   * signal when an instance creation process has completed successfully.
   *
   *
   * For more information, see [Deploying applications on Amazon EC2 with AWS
   * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/deploying.applications.html)
   * .
   *
   *
   * The `AWS::CloudFormation::WaitConditionHandle` type has no properties. When you reference the
   * `WaitConditionHandle` resource by using the `Ref` function, AWS CloudFormation returns a presigned
   * URL. You pass this URL to applications or scripts that are running on your Amazon EC2 instances to
   * send signals to that URL. An associated `AWS::CloudFormation::WaitCondition` resource checks the
   * URL for the required number of success signals or for a failure signal.
   *
   *
   * Anytime you add a `WaitCondition` resource during a stack update or update a resource with a
   * wait condition, you must associate the wait condition with a new `WaitConditionHandle` resource.
   * Don't reuse an old wait condition handle that has already been defined in the template. If you
   * reuse a wait condition handle, the wait condition might evaluate old signals from a previous
   * create or update stack command. &gt; Updates aren't supported for this resource.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnWaitConditionHandle cfnWaitConditionHandle = CfnWaitConditionHandle.Builder.create(this,
   * "MyCfnWaitConditionHandle").build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitconditionhandle.html)
   */
  public inline fun cfnWaitConditionHandle(
    scope: Construct,
    id: String,
    block: CfnWaitConditionHandleDsl.() -> Unit = {},
  ): CfnWaitConditionHandle {
    val builder = CfnWaitConditionHandleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnWaitConditionHandle`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnWaitConditionHandleProps cfnWaitConditionHandleProps =
   * CfnWaitConditionHandleProps.builder().build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitconditionhandle.html)
   */
  public inline fun cfnWaitConditionHandleProps(block: CfnWaitConditionHandlePropsDsl.() -> Unit =
      {}): CfnWaitConditionHandleProps {
    val builder = CfnWaitConditionHandlePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnWaitCondition`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CfnWaitConditionProps cfnWaitConditionProps = CfnWaitConditionProps.builder()
   * .count(123)
   * .handle("handle")
   * .timeout("timeout")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-waitcondition.html)
   */
  public inline fun cfnWaitConditionProps(block: CfnWaitConditionPropsDsl.() -> Unit = {}):
      CfnWaitConditionProps {
    val builder = CfnWaitConditionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A synthesizer that uses conventional asset locations, but not conventional deployment roles.
   *
   * Instead of assuming the bootstrapped deployment roles, all stack operations will be performed
   * using the CLI's current credentials.
   *
   * * This synthesizer does not support deploying to accounts to which the CLI does not have
   * credentials. It also does not support deploying using **CDK Pipelines**. For either of those
   * features, use `DefaultStackSynthesizer`.
   * * This synthesizer requires an S3 bucket and ECR repository with well-known names. To
   * not depend on those, use `LegacyStackSynthesizer`.
   *
   * Be aware that your CLI credentials must be valid for the duration of the
   * entire deployment. If you are using session credentials, make sure the
   * session lifetime is long enough.
   *
   * By default, expects the environment to have been bootstrapped with just the staging resources
   * of the Bootstrap Stack V2 (also known as "modern bootstrap stack"). You can override
   * the default names using the synthesizer's construction properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CliCredentialsStackSynthesizer cliCredentialsStackSynthesizer =
   * CliCredentialsStackSynthesizer.Builder.create()
   * .bucketPrefix("bucketPrefix")
   * .dockerTagPrefix("dockerTagPrefix")
   * .fileAssetsBucketName("fileAssetsBucketName")
   * .imageAssetsRepositoryName("imageAssetsRepositoryName")
   * .qualifier("qualifier")
   * .build();
   * ```
   */
  public inline
      fun cliCredentialsStackSynthesizer(block: CliCredentialsStackSynthesizerDsl.() -> Unit = {}):
      CliCredentialsStackSynthesizer {
    val builder = CliCredentialsStackSynthesizerDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for the CliCredentialsStackSynthesizer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CliCredentialsStackSynthesizerProps cliCredentialsStackSynthesizerProps =
   * CliCredentialsStackSynthesizerProps.builder()
   * .bucketPrefix("bucketPrefix")
   * .dockerTagPrefix("dockerTagPrefix")
   * .fileAssetsBucketName("fileAssetsBucketName")
   * .imageAssetsRepositoryName("imageAssetsRepositoryName")
   * .qualifier("qualifier")
   * .build();
   * ```
   */
  public inline
      fun cliCredentialsStackSynthesizerProps(block: CliCredentialsStackSynthesizerPropsDsl.() -> Unit
      = {}): CliCredentialsStackSynthesizerProps {
    val builder = CliCredentialsStackSynthesizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options applied when copying directories.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * CopyOptions copyOptions = CopyOptions.builder()
   * .exclude(List.of("exclude"))
   * .follow(SymlinkFollowMode.NEVER)
   * .ignoreMode(IgnoreMode.GLOB)
   * .build();
   * ```
   */
  public inline fun copyOptions(block: CopyOptionsDsl.() -> Unit = {}): CopyOptions {
    val builder = CopyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Instantiation of a custom resource, whose implementation is provided a Provider.
   *
   * This class is intended to be used by construct library authors. Application
   * builder should not be able to tell whether or not a construct is backed by
   * a custom resource, and so the use of this class should be invisible.
   *
   * Instead, construct library authors declare a custom construct that hides the
   * choice of provider, and accepts a strongly-typed properties object with the
   * properties your provider accepts.
   *
   * Your custom resource provider (identified by the `serviceToken` property)
   * can be one of 4 constructs:
   *
   * * If you are authoring a construct library or application, we recommend you
   * use the `Provider` class in the `custom-resources` module.
   * * If you are authoring a construct for the CDK's AWS Construct Library,
   * you should use the `CustomResourceProvider` construct in this package.
   * * If you want full control over the provider, you can always directly use
   * a Lambda Function or SNS Topic by passing the ARN into `serviceToken`.
   *
   * Example:
   *
   * ```
   * String serviceToken = CustomResourceProvider.getOrCreate(this, "Custom::MyCustomResourceType",
   * CustomResourceProviderProps.builder()
   * .codeDirectory(String.format("%s/my-handler", __dirname))
   * .runtime(CustomResourceProviderRuntime.NODEJS_14_X)
   * .description("Lambda function created by the custom resource provider")
   * .build());
   * CustomResource.Builder.create(this, "MyResource")
   * .resourceType("Custom::MyCustomResourceType")
   * .serviceToken(serviceToken)
   * .build();
   * ```
   */
  public inline fun customResource(
    scope: Construct,
    id: String,
    block: CustomResourceDsl.() -> Unit = {},
  ): CustomResource {
    val builder = CustomResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties to provide a Lambda-backed custom resource.
   *
   * Example:
   *
   * ```
   * String serviceToken = CustomResourceProvider.getOrCreate(this, "Custom::MyCustomResourceType",
   * CustomResourceProviderProps.builder()
   * .codeDirectory(String.format("%s/my-handler", __dirname))
   * .runtime(CustomResourceProviderRuntime.NODEJS_14_X)
   * .description("Lambda function created by the custom resource provider")
   * .build());
   * CustomResource.Builder.create(this, "MyResource")
   * .resourceType("Custom::MyCustomResourceType")
   * .serviceToken(serviceToken)
   * .build();
   * ```
   */
  public inline fun customResourceProps(block: CustomResourcePropsDsl.() -> Unit = {}):
      CustomResourceProps {
    val builder = CustomResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Initialization properties for `CustomResourceProvider`.
   *
   * Example:
   *
   * ```
   * CustomResourceProvider provider = CustomResourceProvider.getOrCreateProvider(this,
   * "Custom::MyCustomResourceType", CustomResourceProviderProps.builder()
   * .codeDirectory(String.format("%s/my-handler", __dirname))
   * .runtime(CustomResourceProviderRuntime.NODEJS_14_X)
   * .build());
   * provider.addToRolePolicy(Map.of(
   * "Effect", "Allow",
   * "Action", "s3:GetObject",
   * "Resource", "*"));
   * ```
   */
  public inline fun customResourceProviderProps(block: CustomResourceProviderPropsDsl.() -> Unit =
      {}): CustomResourceProviderProps {
    val builder = CustomResourceProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Uses conventionally named roles and asset storage locations.
   *
   * This synthesizer:
   *
   * * Supports cross-account deployments (the CLI can have credentials to one
   * account, and you can still deploy to another account by assuming roles with
   * well-known names in the other account).
   * * Supports the **CDK Pipelines** library.
   *
   * Requires the environment to have been bootstrapped with Bootstrap Stack V2
   * (also known as "modern bootstrap stack"). The synthesizer adds a version
   * check to the template, to make sure the bootstrap stack is recent enough
   * to support all features expected by this synthesizer.
   *
   * Example:
   *
   * ```
   * MyStack.Builder.create(app, "MyStack")
   * .synthesizer(DefaultStackSynthesizer.Builder.create()
   * .fileAssetsBucketName("my-orgs-asset-bucket")
   * .build())
   * .build();
   * ```
   */
  public inline fun defaultStackSynthesizer(block: DefaultStackSynthesizerDsl.() -> Unit = {}):
      DefaultStackSynthesizer {
    val builder = DefaultStackSynthesizerDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configuration properties for DefaultStackSynthesizer.
   *
   * Example:
   *
   * ```
   * MyStack.Builder.create(app, "MyStack")
   * .synthesizer(DefaultStackSynthesizer.Builder.create()
   * .fileAssetsBucketName("my-orgs-asset-bucket")
   * .build())
   * .build();
   * ```
   */
  public inline fun defaultStackSynthesizerProps(block: DefaultStackSynthesizerPropsDsl.() -> Unit =
      {}): DefaultStackSynthesizerProps {
    val builder = DefaultStackSynthesizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Docker build options.
   *
   * Example:
   *
   * ```
   * Function.Builder.create(this, "Function")
   * .code(Code.fromAsset("/path/to/handler", AssetOptions.builder()
   * .bundling(BundlingOptions.builder()
   * .image(DockerImage.fromBuild("/path/to/dir/with/DockerFile", DockerBuildOptions.builder()
   * .buildArgs(Map.of(
   * "ARG1", "value1"))
   * .build()))
   * .command(List.of("my", "cool", "command"))
   * .build())
   * .build()))
   * .runtime(Runtime.PYTHON_3_9)
   * .handler("index.handler")
   * .build();
   * ```
   */
  public inline fun dockerBuildOptions(block: DockerBuildOptionsDsl.() -> Unit = {}):
      DockerBuildOptions {
    val builder = DockerBuildOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for configuring the Docker cache backend.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DockerCacheOption dockerCacheOption = DockerCacheOption.builder()
   * .type("type")
   * // the properties below are optional
   * .params(Map.of(
   * "paramsKey", "params"))
   * .build();
   * ```
   */
  public inline fun dockerCacheOption(block: DockerCacheOptionDsl.() -> Unit = {}):
      DockerCacheOption {
    val builder = DockerCacheOptionDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The location of the published docker image.
   *
   * This is where the image can be
   * consumed at runtime.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DockerImageAssetLocation dockerImageAssetLocation = DockerImageAssetLocation.builder()
   * .imageUri("imageUri")
   * .repositoryName("repositoryName")
   * // the properties below are optional
   * .imageTag("imageTag")
   * .build();
   * ```
   */
  public inline fun dockerImageAssetLocation(block: DockerImageAssetLocationDsl.() -> Unit = {}):
      DockerImageAssetLocation {
    val builder = DockerImageAssetLocationDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DockerImageAssetSource dockerImageAssetSource = DockerImageAssetSource.builder()
   * .sourceHash("sourceHash")
   * // the properties below are optional
   * .assetName("assetName")
   * .directoryName("directoryName")
   * .dockerBuildArgs(Map.of(
   * "dockerBuildArgsKey", "dockerBuildArgs"))
   * .dockerBuildSecrets(Map.of(
   * "dockerBuildSecretsKey", "dockerBuildSecrets"))
   * .dockerBuildTarget("dockerBuildTarget")
   * .dockerCacheFrom(List.of(DockerCacheOption.builder()
   * .type("type")
   * // the properties below are optional
   * .params(Map.of(
   * "paramsKey", "params"))
   * .build()))
   * .dockerCacheTo(DockerCacheOption.builder()
   * .type("type")
   * // the properties below are optional
   * .params(Map.of(
   * "paramsKey", "params"))
   * .build())
   * .dockerFile("dockerFile")
   * .dockerOutputs(List.of("dockerOutputs"))
   * .executable(List.of("executable"))
   * .networkMode("networkMode")
   * .platform("platform")
   * .build();
   * ```
   */
  public inline fun dockerImageAssetSource(block: DockerImageAssetSourceDsl.() -> Unit = {}):
      DockerImageAssetSource {
    val builder = DockerImageAssetSourceDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Docker run options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DockerRunOptions dockerRunOptions = DockerRunOptions.builder()
   * .command(List.of("command"))
   * .entrypoint(List.of("entrypoint"))
   * .environment(Map.of(
   * "environmentKey", "environment"))
   * .network("network")
   * .platform("platform")
   * .securityOpt("securityOpt")
   * .user("user")
   * .volumes(List.of(DockerVolume.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * // the properties below are optional
   * .consistency(DockerVolumeConsistency.CONSISTENT)
   * .build()))
   * .volumesFrom(List.of("volumesFrom"))
   * .workingDirectory("workingDirectory")
   * .build();
   * ```
   */
  public inline fun dockerRunOptions(block: DockerRunOptionsDsl.() -> Unit = {}): DockerRunOptions {
    val builder = DockerRunOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A Docker volume.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * DockerVolume dockerVolume = DockerVolume.builder()
   * .containerPath("containerPath")
   * .hostPath("hostPath")
   * // the properties below are optional
   * .consistency(DockerVolumeConsistency.CONSISTENT)
   * .build();
   * ```
   */
  public inline fun dockerVolume(block: DockerVolumeDsl.() -> Unit = {}): DockerVolume {
    val builder = DockerVolumeDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties to string encodings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * EncodingOptions encodingOptions = EncodingOptions.builder()
   * .displayHint("displayHint")
   * .build();
   * ```
   */
  public inline fun encodingOptions(block: EncodingOptionsDsl.() -> Unit = {}): EncodingOptions {
    val builder = EncodingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The deployment environment for a stack.
   *
   * Example:
   *
   * ```
   * // Passing a replication bucket created in a different stack.
   * App app = new App();
   * Stack replicationStack = Stack.Builder.create(app, "ReplicationStack")
   * .env(Environment.builder()
   * .region("us-west-1")
   * .build())
   * .build();
   * Key key = new Key(replicationStack, "ReplicationKey");
   * Bucket replicationBucket = Bucket.Builder.create(replicationStack, "ReplicationBucket")
   * // like was said above - replication buckets need a set physical name
   * .bucketName(PhysicalName.GENERATE_IF_NEEDED)
   * .encryptionKey(key)
   * .build();
   * // later...
   * // later...
   * Pipeline.Builder.create(replicationStack, "Pipeline")
   * .crossRegionReplicationBuckets(Map.of(
   * "us-west-1", replicationBucket))
   * .build();
   * ```
   */
  public inline fun environment(block: EnvironmentDsl.() -> Unit = {}): Environment {
    val builder = EnvironmentDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for the `stack.exportValue()` method.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ExportValueOptions exportValueOptions = ExportValueOptions.builder()
   * .name("name")
   * .build();
   * ```
   */
  public inline fun exportValueOptions(block: ExportValueOptionsDsl.() -> Unit = {}):
      ExportValueOptions {
    val builder = ExportValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The location of the published file asset.
   *
   * This is where the asset
   * can be consumed at runtime.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * FileAssetLocation fileAssetLocation = FileAssetLocation.builder()
   * .bucketName("bucketName")
   * .httpUrl("httpUrl")
   * .objectKey("objectKey")
   * .s3ObjectUrl("s3ObjectUrl")
   * // the properties below are optional
   * .kmsKeyArn("kmsKeyArn")
   * .s3ObjectUrlWithPlaceholders("s3ObjectUrlWithPlaceholders")
   * .build();
   * ```
   */
  public inline fun fileAssetLocation(block: FileAssetLocationDsl.() -> Unit = {}):
      FileAssetLocation {
    val builder = FileAssetLocationDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the source for a file asset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * FileAssetSource fileAssetSource = FileAssetSource.builder()
   * .sourceHash("sourceHash")
   * // the properties below are optional
   * .deployTime(false)
   * .executable(List.of("executable"))
   * .fileName("fileName")
   * .packaging(FileAssetPackaging.ZIP_DIRECTORY)
   * .build();
   * ```
   */
  public inline fun fileAssetSource(block: FileAssetSourceDsl.() -> Unit = {}): FileAssetSource {
    val builder = FileAssetSourceDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options applied when copying directories into the staging location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * FileCopyOptions fileCopyOptions = FileCopyOptions.builder()
   * .exclude(List.of("exclude"))
   * .followSymlinks(SymlinkFollowMode.NEVER)
   * .ignoreMode(IgnoreMode.GLOB)
   * .build();
   * ```
   */
  public inline fun fileCopyOptions(block: FileCopyOptionsDsl.() -> Unit = {}): FileCopyOptions {
    val builder = FileCopyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options related to calculating source hash.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * FileFingerprintOptions fileFingerprintOptions = FileFingerprintOptions.builder()
   * .exclude(List.of("exclude"))
   * .extraHash("extraHash")
   * .followSymlinks(SymlinkFollowMode.NEVER)
   * .ignoreMode(IgnoreMode.GLOB)
   * .build();
   * ```
   */
  public inline fun fileFingerprintOptions(block: FileFingerprintOptionsDsl.() -> Unit = {}):
      FileFingerprintOptions {
    val builder = FileFingerprintOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options related to calculating source hash.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * FingerprintOptions fingerprintOptions = FingerprintOptions.builder()
   * .exclude(List.of("exclude"))
   * .extraHash("extraHash")
   * .follow(SymlinkFollowMode.NEVER)
   * .ignoreMode(IgnoreMode.GLOB)
   * .build();
   * ```
   */
  public inline fun fingerprintOptions(block: FingerprintOptionsDsl.() -> Unit = {}):
      FingerprintOptions {
    val builder = FingerprintOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Object props;
   * GetContextKeyOptions getContextKeyOptions = GetContextKeyOptions.builder()
   * .provider("provider")
   * // the properties below are optional
   * .includeEnvironment(false)
   * .props(Map.of(
   * "propsKey", props))
   * .build();
   * ```
   */
  public inline fun getContextKeyOptions(block: GetContextKeyOptionsDsl.() -> Unit = {}):
      GetContextKeyOptions {
    val builder = GetContextKeyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Object props;
   * GetContextKeyResult getContextKeyResult = GetContextKeyResult.builder()
   * .key("key")
   * .props(Map.of(
   * "propsKey", props))
   * .build();
   * ```
   */
  public inline fun getContextKeyResult(block: GetContextKeyResultDsl.() -> Unit = {}):
      GetContextKeyResult {
    val builder = GetContextKeyResultDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Object dummyValue;
   * Object props;
   * GetContextValueOptions getContextValueOptions = GetContextValueOptions.builder()
   * .dummyValue(dummyValue)
   * .provider("provider")
   * // the properties below are optional
   * .includeEnvironment(false)
   * .props(Map.of(
   * "propsKey", props))
   * .build();
   * ```
   */
  public inline fun getContextValueOptions(block: GetContextValueOptionsDsl.() -> Unit = {}):
      GetContextValueOptions {
    val builder = GetContextValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Object value;
   * GetContextValueResult getContextValueResult = GetContextValueResult.builder()
   * .value(value)
   * .build();
   * ```
   */
  public inline fun getContextValueResult(block: GetContextValueResultDsl.() -> Unit = {}):
      GetContextValueResult {
    val builder = GetContextValueResultDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Token subclass that represents values intrinsic to the target document language.
   *
   * WARNING: this class should not be externally exposed, but is currently visible
   * because of a limitation of jsii (https://github.com/aws/jsii/issues/524).
   *
   * This class will disappear in a future release and should not be used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Object value;
   * Intrinsic intrinsic = Intrinsic.Builder.create(value)
   * .stackTrace(false)
   * .typeHint(ResolutionTypeHint.STRING)
   * .build();
   * ```
   */
  public inline fun intrinsic(`value`: Any, block: IntrinsicDsl.() -> Unit = {}): Intrinsic {
    val builder = IntrinsicDsl(value)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Customization properties for an Intrinsic token.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * IntrinsicProps intrinsicProps = IntrinsicProps.builder()
   * .stackTrace(false)
   * .typeHint(ResolutionTypeHint.STRING)
   * .build();
   * ```
   */
  public inline fun intrinsicProps(block: IntrinsicPropsDsl.() -> Unit = {}): IntrinsicProps {
    val builder = IntrinsicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for creating lazy untyped tokens.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * LazyAnyValueOptions lazyAnyValueOptions = LazyAnyValueOptions.builder()
   * .displayHint("displayHint")
   * .omitEmptyArray(false)
   * .build();
   * ```
   */
  public inline fun lazyAnyValueOptions(block: LazyAnyValueOptionsDsl.() -> Unit = {}):
      LazyAnyValueOptions {
    val builder = LazyAnyValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for creating a lazy list token.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * LazyListValueOptions lazyListValueOptions = LazyListValueOptions.builder()
   * .displayHint("displayHint")
   * .omitEmpty(false)
   * .build();
   * ```
   */
  public inline fun lazyListValueOptions(block: LazyListValueOptionsDsl.() -> Unit = {}):
      LazyListValueOptions {
    val builder = LazyListValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for creating a lazy string token.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * LazyStringValueOptions lazyStringValueOptions = LazyStringValueOptions.builder()
   * .displayHint("displayHint")
   * .build();
   * ```
   */
  public inline fun lazyStringValueOptions(block: LazyStringValueOptionsDsl.() -> Unit = {}):
      LazyStringValueOptions {
    val builder = LazyStringValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A CloudFormation nested stack.
   *
   * When you apply template changes to update a top-level stack, CloudFormation
   * updates the top-level stack and initiates an update to its nested stacks.
   * CloudFormation updates the resources of modified nested stacks, but does not
   * update the resources of unmodified nested stacks.
   *
   * Furthermore, this stack will not be treated as an independent deployment
   * artifact (won't be listed in "cdk list" or deployable through "cdk deploy"),
   * but rather only synthesized as a template and uploaded as an asset to S3.
   *
   * Cross references of resource attributes between the parent stack and the
   * nested stack will automatically be translated to stack parameters and
   * outputs.
   *
   * Example:
   *
   * ```
   * import software.constructs.Construct;
   * import software.amazon.awscdk.App;
   * import software.amazon.awscdk.CfnOutput;
   * import software.amazon.awscdk.NestedStack;
   * import software.amazon.awscdk.NestedStackProps;
   * import software.amazon.awscdk.Stack;
   * import software.amazon.awscdk.services.apigateway.Deployment;
   * import software.amazon.awscdk.services.apigateway.Method;
   * import software.amazon.awscdk.services.apigateway.MockIntegration;
   * import software.amazon.awscdk.services.apigateway.PassthroughBehavior;
   * import software.amazon.awscdk.services.apigateway.RestApi;
   * import software.amazon.awscdk.services.apigateway.Stage;
   * / **
   * * This file showcases how to split up a RestApi's Resources and Methods across nested stacks.
   * *
   * * The root stack 'RootStack' first defines a RestApi.
   * * Two nested stacks BooksStack and PetsStack, create corresponding Resources '/books' and
   * '/pets'.
   * * They are then deployed to a 'prod' Stage via a third nested stack - DeployStack.
   * *
   * * To verify this worked, go to the APIGateway
   * *&#47;
   * public class RootStack extends Stack {
   * public RootStack(Construct scope) {
   * super(scope, "integ-restapi-import-RootStack");
   * RestApi restApi = RestApi.Builder.create(this, "RestApi")
   * .cloudWatchRole(true)
   * .deploy(false)
   * .build();
   * restApi.root.addMethod("ANY");
   * PetsStack petsStack = new PetsStack(this, new ResourceNestedStackProps()
   * .restApiId(restApi.getRestApiId())
   * .rootResourceId(restApi.getRestApiRootResourceId())
   * );
   * BooksStack booksStack = new BooksStack(this, new ResourceNestedStackProps()
   * .restApiId(restApi.getRestApiId())
   * .rootResourceId(restApi.getRestApiRootResourceId())
   * );
   * new DeployStack(this, new DeployStackProps()
   * .restApiId(restApi.getRestApiId())
   * .methods(petsStack.methods.concat(booksStack.getMethods()))
   * );
   * CfnOutput.Builder.create(this, "PetsURL")
   * .value(String.format("https://%s.execute-api.%s.amazonaws.com/prod/pets",
   * restApi.getRestApiId(), this.region))
   * .build();
   * CfnOutput.Builder.create(this, "BooksURL")
   * .value(String.format("https://%s.execute-api.%s.amazonaws.com/prod/books",
   * restApi.getRestApiId(), this.region))
   * .build();
   * }
   * }
   * public class ResourceNestedStackProps extends NestedStackProps {
   * private String restApiId;
   * public String getRestApiId() {
   * return this.restApiId;
   * }
   * public ResourceNestedStackProps restApiId(String restApiId) {
   * this.restApiId = restApiId;
   * return this;
   * }
   * private String rootResourceId;
   * public String getRootResourceId() {
   * return this.rootResourceId;
   * }
   * public ResourceNestedStackProps rootResourceId(String rootResourceId) {
   * this.rootResourceId = rootResourceId;
   * return this;
   * }
   * }
   * public class PetsStack extends NestedStack {
   * public final Method[] methods;
   * public PetsStack(Construct scope, ResourceNestedStackProps props) {
   * super(scope, "integ-restapi-import-PetsStack", props);
   * IRestApi api = RestApi.fromRestApiAttributes(this, "RestApi", RestApiAttributes.builder()
   * .restApiId(props.getRestApiId())
   * .rootResourceId(props.getRootResourceId())
   * .build());
   * Method method = api.root.addResource("pets").addMethod("GET", MockIntegration.Builder.create()
   * .integrationResponses(List.of(IntegrationResponse.builder()
   * .statusCode("200")
   * .build()))
   * .passthroughBehavior(PassthroughBehavior.NEVER)
   * .requestTemplates(Map.of(
   * "application/json", "{ \"statusCode\": 200 }"))
   * .build(), MethodOptions.builder()
   * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
   * .build());
   * this.methods.push(method);
   * }
   * }
   * public class BooksStack extends NestedStack {
   * public final Method[] methods;
   * public BooksStack(Construct scope, ResourceNestedStackProps props) {
   * super(scope, "integ-restapi-import-BooksStack", props);
   * IRestApi api = RestApi.fromRestApiAttributes(this, "RestApi", RestApiAttributes.builder()
   * .restApiId(props.getRestApiId())
   * .rootResourceId(props.getRootResourceId())
   * .build());
   * Method method = api.root.addResource("books").addMethod("GET", MockIntegration.Builder.create()
   * .integrationResponses(List.of(IntegrationResponse.builder()
   * .statusCode("200")
   * .build()))
   * .passthroughBehavior(PassthroughBehavior.NEVER)
   * .requestTemplates(Map.of(
   * "application/json", "{ \"statusCode\": 200 }"))
   * .build(), MethodOptions.builder()
   * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
   * .build());
   * this.methods.push(method);
   * }
   * }
   * public class DeployStackProps extends NestedStackProps {
   * private String restApiId;
   * public String getRestApiId() {
   * return this.restApiId;
   * }
   * public DeployStackProps restApiId(String restApiId) {
   * this.restApiId = restApiId;
   * return this;
   * }
   * private Method[] methods;
   * public Method[] getMethods() {
   * return this.methods;
   * }
   * public DeployStackProps methods(Method[] methods) {
   * this.methods = methods;
   * return this;
   * }
   * }
   * public class DeployStack extends NestedStack {
   * public DeployStack(Construct scope, DeployStackProps props) {
   * super(scope, "integ-restapi-import-DeployStack", props);
   * Deployment deployment = Deployment.Builder.create(this, "Deployment")
   * .api(RestApi.fromRestApiId(this, "RestApi", props.getRestApiId()))
   * .build();
   * if (props.getMethods()) {
   * for (Object method : props.getMethods()) {
   * deployment.node.addDependency(method);
   * }
   * }
   * Stage.Builder.create(this, "Stage").deployment(deployment).build();
   * }
   * }
   * new RootStack(new App());
   * ```
   */
  public inline fun nestedStack(
    scope: Construct,
    id: String,
    block: NestedStackDsl.() -> Unit = {},
  ): NestedStack {
    val builder = NestedStackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Initialization props for the `NestedStack` construct.
   *
   * Example:
   *
   * ```
   * import software.constructs.Construct;
   * import software.amazon.awscdk.App;
   * import software.amazon.awscdk.CfnOutput;
   * import software.amazon.awscdk.NestedStack;
   * import software.amazon.awscdk.NestedStackProps;
   * import software.amazon.awscdk.Stack;
   * import software.amazon.awscdk.services.apigateway.Deployment;
   * import software.amazon.awscdk.services.apigateway.Method;
   * import software.amazon.awscdk.services.apigateway.MockIntegration;
   * import software.amazon.awscdk.services.apigateway.PassthroughBehavior;
   * import software.amazon.awscdk.services.apigateway.RestApi;
   * import software.amazon.awscdk.services.apigateway.Stage;
   * / **
   * * This file showcases how to split up a RestApi's Resources and Methods across nested stacks.
   * *
   * * The root stack 'RootStack' first defines a RestApi.
   * * Two nested stacks BooksStack and PetsStack, create corresponding Resources '/books' and
   * '/pets'.
   * * They are then deployed to a 'prod' Stage via a third nested stack - DeployStack.
   * *
   * * To verify this worked, go to the APIGateway
   * *&#47;
   * public class RootStack extends Stack {
   * public RootStack(Construct scope) {
   * super(scope, "integ-restapi-import-RootStack");
   * RestApi restApi = RestApi.Builder.create(this, "RestApi")
   * .cloudWatchRole(true)
   * .deploy(false)
   * .build();
   * restApi.root.addMethod("ANY");
   * PetsStack petsStack = new PetsStack(this, new ResourceNestedStackProps()
   * .restApiId(restApi.getRestApiId())
   * .rootResourceId(restApi.getRestApiRootResourceId())
   * );
   * BooksStack booksStack = new BooksStack(this, new ResourceNestedStackProps()
   * .restApiId(restApi.getRestApiId())
   * .rootResourceId(restApi.getRestApiRootResourceId())
   * );
   * new DeployStack(this, new DeployStackProps()
   * .restApiId(restApi.getRestApiId())
   * .methods(petsStack.methods.concat(booksStack.getMethods()))
   * );
   * CfnOutput.Builder.create(this, "PetsURL")
   * .value(String.format("https://%s.execute-api.%s.amazonaws.com/prod/pets",
   * restApi.getRestApiId(), this.region))
   * .build();
   * CfnOutput.Builder.create(this, "BooksURL")
   * .value(String.format("https://%s.execute-api.%s.amazonaws.com/prod/books",
   * restApi.getRestApiId(), this.region))
   * .build();
   * }
   * }
   * public class ResourceNestedStackProps extends NestedStackProps {
   * private String restApiId;
   * public String getRestApiId() {
   * return this.restApiId;
   * }
   * public ResourceNestedStackProps restApiId(String restApiId) {
   * this.restApiId = restApiId;
   * return this;
   * }
   * private String rootResourceId;
   * public String getRootResourceId() {
   * return this.rootResourceId;
   * }
   * public ResourceNestedStackProps rootResourceId(String rootResourceId) {
   * this.rootResourceId = rootResourceId;
   * return this;
   * }
   * }
   * public class PetsStack extends NestedStack {
   * public final Method[] methods;
   * public PetsStack(Construct scope, ResourceNestedStackProps props) {
   * super(scope, "integ-restapi-import-PetsStack", props);
   * IRestApi api = RestApi.fromRestApiAttributes(this, "RestApi", RestApiAttributes.builder()
   * .restApiId(props.getRestApiId())
   * .rootResourceId(props.getRootResourceId())
   * .build());
   * Method method = api.root.addResource("pets").addMethod("GET", MockIntegration.Builder.create()
   * .integrationResponses(List.of(IntegrationResponse.builder()
   * .statusCode("200")
   * .build()))
   * .passthroughBehavior(PassthroughBehavior.NEVER)
   * .requestTemplates(Map.of(
   * "application/json", "{ \"statusCode\": 200 }"))
   * .build(), MethodOptions.builder()
   * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
   * .build());
   * this.methods.push(method);
   * }
   * }
   * public class BooksStack extends NestedStack {
   * public final Method[] methods;
   * public BooksStack(Construct scope, ResourceNestedStackProps props) {
   * super(scope, "integ-restapi-import-BooksStack", props);
   * IRestApi api = RestApi.fromRestApiAttributes(this, "RestApi", RestApiAttributes.builder()
   * .restApiId(props.getRestApiId())
   * .rootResourceId(props.getRootResourceId())
   * .build());
   * Method method = api.root.addResource("books").addMethod("GET", MockIntegration.Builder.create()
   * .integrationResponses(List.of(IntegrationResponse.builder()
   * .statusCode("200")
   * .build()))
   * .passthroughBehavior(PassthroughBehavior.NEVER)
   * .requestTemplates(Map.of(
   * "application/json", "{ \"statusCode\": 200 }"))
   * .build(), MethodOptions.builder()
   * .methodResponses(List.of(MethodResponse.builder().statusCode("200").build()))
   * .build());
   * this.methods.push(method);
   * }
   * }
   * public class DeployStackProps extends NestedStackProps {
   * private String restApiId;
   * public String getRestApiId() {
   * return this.restApiId;
   * }
   * public DeployStackProps restApiId(String restApiId) {
   * this.restApiId = restApiId;
   * return this;
   * }
   * private Method[] methods;
   * public Method[] getMethods() {
   * return this.methods;
   * }
   * public DeployStackProps methods(Method[] methods) {
   * this.methods = methods;
   * return this;
   * }
   * }
   * public class DeployStack extends NestedStack {
   * public DeployStack(Construct scope, DeployStackProps props) {
   * super(scope, "integ-restapi-import-DeployStack", props);
   * Deployment deployment = Deployment.Builder.create(this, "Deployment")
   * .api(RestApi.fromRestApiId(this, "RestApi", props.getRestApiId()))
   * .build();
   * if (props.getMethods()) {
   * for (Object method : props.getMethods()) {
   * deployment.node.addDependency(method);
   * }
   * }
   * Stage.Builder.create(this, "Stage").deployment(deployment).build();
   * }
   * }
   * new RootStack(new App());
   * ```
   */
  public inline fun nestedStackProps(block: NestedStackPropsDsl.() -> Unit = {}): NestedStackProps {
    val builder = NestedStackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for binding a Permissions Boundary to a construct scope.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * PermissionsBoundaryBindOptions permissionsBoundaryBindOptions =
   * PermissionsBoundaryBindOptions.builder().build();
   * ```
   */
  public inline
      fun permissionsBoundaryBindOptions(block: PermissionsBoundaryBindOptionsDsl.() -> Unit = {}):
      PermissionsBoundaryBindOptions {
    val builder = PermissionsBoundaryBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The report emitted by the plugin after evaluation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * PolicyValidationPluginReportBeta1 policyValidationPluginReportBeta1 =
   * PolicyValidationPluginReportBeta1.builder()
   * .success(false)
   * .violations(List.of(PolicyViolationBeta1.builder()
   * .description("description")
   * .ruleName("ruleName")
   * .violatingResources(List.of(PolicyViolatingResourceBeta1.builder()
   * .locations(List.of("locations"))
   * .resourceLogicalId("resourceLogicalId")
   * .templatePath("templatePath")
   * .build()))
   * // the properties below are optional
   * .fix("fix")
   * .ruleMetadata(Map.of(
   * "ruleMetadataKey", "ruleMetadata"))
   * .severity("severity")
   * .build()))
   * // the properties below are optional
   * .metadata(Map.of(
   * "metadataKey", "metadata"))
   * .pluginVersion("pluginVersion")
   * .build();
   * ```
   */
  public inline
      fun policyValidationPluginReportBeta1(block: PolicyValidationPluginReportBeta1Dsl.() -> Unit =
      {}): PolicyValidationPluginReportBeta1 {
    val builder = PolicyValidationPluginReportBeta1Dsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Resource violating a specific rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * PolicyViolatingResourceBeta1 policyViolatingResourceBeta1 =
   * PolicyViolatingResourceBeta1.builder()
   * .locations(List.of("locations"))
   * .resourceLogicalId("resourceLogicalId")
   * .templatePath("templatePath")
   * .build();
   * ```
   */
  public inline fun policyViolatingResourceBeta1(block: PolicyViolatingResourceBeta1Dsl.() -> Unit =
      {}): PolicyViolatingResourceBeta1 {
    val builder = PolicyViolatingResourceBeta1Dsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Violation produced by the validation plugin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * PolicyViolationBeta1 policyViolationBeta1 = PolicyViolationBeta1.builder()
   * .description("description")
   * .ruleName("ruleName")
   * .violatingResources(List.of(PolicyViolatingResourceBeta1.builder()
   * .locations(List.of("locations"))
   * .resourceLogicalId("resourceLogicalId")
   * .templatePath("templatePath")
   * .build()))
   * // the properties below are optional
   * .fix("fix")
   * .ruleMetadata(Map.of(
   * "ruleMetadataKey", "ruleMetadata"))
   * .severity("severity")
   * .build();
   * ```
   */
  public inline fun policyViolationBeta1(block: PolicyViolationBeta1Dsl.() -> Unit = {}):
      PolicyViolationBeta1 {
    val builder = PolicyViolationBeta1Dsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * RemovalPolicyOptions removalPolicyOptions = RemovalPolicyOptions.builder()
   * .applyToUpdateReplacePolicy(false)
   * .default(RemovalPolicy.DESTROY)
   * .build();
   * ```
   */
  public inline fun removalPolicyOptions(block: RemovalPolicyOptionsDsl.() -> Unit = {}):
      RemovalPolicyOptions {
    val builder = RemovalPolicyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The RemoveTag Aspect will handle removing tags from this node and children.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * RemoveTag removeTag = RemoveTag.Builder.create("key")
   * .applyToLaunchedInstances(false)
   * .excludeResourceTypes(List.of("excludeResourceTypes"))
   * .includeResourceTypes(List.of("includeResourceTypes"))
   * .priority(123)
   * .build();
   * ```
   */
  public inline fun removeTag(key: String, block: RemoveTagDsl.() -> Unit = {}): RemoveTag {
    val builder = RemoveTagDsl(key)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options that can be changed while doing a recursive resolve.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ResolveChangeContextOptions resolveChangeContextOptions = ResolveChangeContextOptions.builder()
   * .allowIntrinsicKeys(false)
   * .removeEmpty(false)
   * .build();
   * ```
   */
  public inline fun resolveChangeContextOptions(block: ResolveChangeContextOptionsDsl.() -> Unit =
      {}): ResolveChangeContextOptions {
    val builder = ResolveChangeContextOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options to the resolve() operation.
   *
   * NOT the same as the ResolveContext; ResolveContext is exposed to Token
   * implementors and resolution hooks, whereas this struct is just to bundle
   * a number of things that would otherwise be arguments to resolve() in a
   * readable way.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.constructs.*;
   * Construct construct;
   * ITokenResolver tokenResolver;
   * ResolveOptions resolveOptions = ResolveOptions.builder()
   * .resolver(tokenResolver)
   * .scope(construct)
   * // the properties below are optional
   * .preparing(false)
   * .removeEmpty(false)
   * .build();
   * ```
   */
  public inline fun resolveOptions(block: ResolveOptionsDsl.() -> Unit = {}): ResolveOptions {
    val builder = ResolveOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the environment a given resource lives in.
   *
   * Used as the return value for the `IResource.env` property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ResourceEnvironment resourceEnvironment = ResourceEnvironment.builder()
   * .account("account")
   * .region("region")
   * .build();
   * ```
   */
  public inline fun resourceEnvironment(block: ResourceEnvironmentDsl.() -> Unit = {}):
      ResourceEnvironment {
    val builder = ResourceEnvironmentDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `Resource`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ResourceProps resourceProps = ResourceProps.builder()
   * .account("account")
   * .environmentFromArn("environmentFromArn")
   * .physicalName("physicalName")
   * .region("region")
   * .build();
   * ```
   */
  public inline fun resourceProps(block: ResourcePropsDsl.() -> Unit = {}): ResourceProps {
    val builder = ResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for the 'reverse()' operation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * ReverseOptions reverseOptions = ReverseOptions.builder()
   * .failConcat(false)
   * .build();
   * ```
   */
  public inline fun reverseOptions(block: ReverseOptionsDsl.() -> Unit = {}): ReverseOptions {
    val builder = ReverseOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for specifying a role.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * RoleOptions roleOptions = RoleOptions.builder()
   * .assumeRoleArn("assumeRoleArn")
   * // the properties below are optional
   * .assumeRoleExternalId("assumeRoleExternalId")
   * .build();
   * ```
   */
  public inline fun roleOptions(block: RoleOptionsDsl.() -> Unit = {}): RoleOptions {
    val builder = RoleOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Work with secret values in the CDK.
   *
   * Constructs that need secrets will declare parameters of type `SecretValue`.
   *
   * The actual values of these secrets should not be committed to your
   * repository, or even end up in the synthesized CloudFormation template. Instead, you should
   * store them in an external system like AWS Secrets Manager or SSM Parameter
   * Store, and you can reference them by calling `SecretValue.secretsManager()` or
   * `SecretValue.ssmSecure()`.
   *
   * You can use `SecretValue.unsafePlainText()` to construct a `SecretValue` from a
   * literal string, but doing so is highly discouraged.
   *
   * To make sure secret values don't accidentally end up in readable parts
   * of your infrastructure definition (such as the environment variables
   * of an AWS Lambda Function, where everyone who can read the function
   * definition has access to the secret), using secret values directly is not
   * allowed. You must pass them to constructs that accept `SecretValue`
   * properties, which are guaranteed to use the value only in CloudFormation
   * properties that are write-only.
   *
   * If you are sure that what you are doing is safe, you can call
   * `secretValue.unsafeUnwrap()` to access the protected string of the secret
   * value.
   *
   * (If you are writing something like an AWS Lambda Function and need to access
   * a secret inside it, make the API call to `GetSecretValue` directly inside
   * your Lamba's code, instead of using environment variables.)
   *
   * Example:
   *
   * ```
   * IPublicHostedZone myHostedZone;
   * EmailIdentity.Builder.create(this, "Identity")
   * .identity(Identity.publicHostedZone(myHostedZone))
   * .dkimIdentity(DkimIdentity.byoDkim(ByoDkimOptions.builder()
   * .privateKey(SecretValue.secretsManager("dkim-private-key"))
   * .publicKey("...base64-encoded-public-key...")
   * .selector("selector")
   * .build()))
   * .build();
   * ```
   */
  public inline fun secretValue(protectedValue: Any, block: SecretValueDsl.() -> Unit = {}):
      SecretValue {
    val builder = SecretValueDsl(protectedValue)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for referencing a secret value from Secrets Manager.
   *
   * Example:
   *
   * ```
   * BitBucketSourceCredentials.Builder.create(this, "CodeBuildBitBucketCreds")
   * .username(SecretValue.secretsManager("my-bitbucket-creds",
   * SecretsManagerSecretOptions.builder().jsonField("username").build()))
   * .password(SecretValue.secretsManager("my-bitbucket-creds",
   * SecretsManagerSecretOptions.builder().jsonField("password").build()))
   * .build();
   * ```
   */
  public inline fun secretsManagerSecretOptions(block: SecretsManagerSecretOptionsDsl.() -> Unit =
      {}): SecretsManagerSecretOptions {
    val builder = SecretsManagerSecretOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for how to convert time to a different unit.
   *
   * Example:
   *
   * ```
   * Size.mebibytes(2).toKibibytes(); // yields 2048
   * Size.kibibytes(2050).toMebibytes(SizeConversionOptions.builder().rounding(SizeRoundingBehavior.FLOOR).build());
   * ```
   */
  public inline fun sizeConversionOptions(block: SizeConversionOptionsDsl.() -> Unit = {}):
      SizeConversionOptions {
    val builder = SizeConversionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A root construct which represents a single CloudFormation stack.
   *
   * Example:
   *
   * ```
   * import path.*;
   * import software.amazon.awscdk.services.cloudwatch.*;
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.kinesisanalytics.flink.alpha.*;
   * App app = new App();
   * Stack stack = new Stack(app, "FlinkAppTest");
   * Application flinkApp = Application.Builder.create(stack, "App")
   * .code(ApplicationCode.fromAsset(join(__dirname, "code-asset")))
   * .runtime(Runtime.FLINK_1_11)
   * .build();
   * Alarm.Builder.create(stack, "Alarm")
   * .metric(flinkApp.metricFullRestarts())
   * .evaluationPeriods(1)
   * .threshold(3)
   * .build();
   * app.synth();
   * ```
   */
  public inline fun stack(
    scope: Construct,
    id: String,
    block: StackDsl.() -> Unit = {},
  ): Stack {
    val builder = StackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * Stack stack1 = Stack.Builder.create(app, "Stack1")
   * .env(Environment.builder()
   * .region("us-east-1")
   * .build())
   * .crossRegionReferences(true)
   * .build();
   * Certificate cert = Certificate.Builder.create(stack1, "Cert")
   * .domainName("*.example.com")
   * .validation(CertificateValidation.fromDns(PublicHostedZone.fromHostedZoneId(stack1, "Zone",
   * "Z0329774B51CGXTDQV3X")))
   * .build();
   * Stack stack2 = Stack.Builder.create(app, "Stack2")
   * .env(Environment.builder()
   * .region("us-east-2")
   * .build())
   * .crossRegionReferences(true)
   * .build();
   * Distribution.Builder.create(stack2, "Distribution")
   * .defaultBehavior(BehaviorOptions.builder()
   * .origin(new HttpOrigin("example.com"))
   * .build())
   * .domainNames(List.of("dev.example.com"))
   * .certificate(cert)
   * .build();
   * ```
   */
  public inline fun stackProps(block: StackPropsDsl.() -> Unit = {}): StackProps {
    val builder = StackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An abstract application modeling unit consisting of Stacks that should be deployed together.
   *
   * Derive a subclass of `Stage` and use it to model a single instance of your
   * application.
   *
   * You can then instantiate your subclass multiple times to model multiple
   * copies of your application which should be be deployed to different
   * environments.
   *
   * Example:
   *
   * ```
   * CodePipeline pipeline;
   * MyApplicationStage preprod = new MyApplicationStage(this, "PreProd");
   * MyApplicationStage prod = new MyApplicationStage(this, "Prod");
   * pipeline.addStage(preprod, AddStageOpts.builder()
   * .post(List.of(
   * ShellStep.Builder.create("Validate Endpoint")
   * .commands(List.of("curl -Ssf https://my.webservice.com/"))
   * .build()))
   * .build());
   * pipeline.addStage(prod, AddStageOpts.builder()
   * .pre(List.of(
   * new ManualApprovalStep("PromoteToProd")))
   * .build());
   * ```
   */
  public inline fun stage(
    scope: Construct,
    id: String,
    block: StageDsl.() -> Unit = {},
  ): Stage {
    val builder = StageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Initialization props for a stage.
   *
   * Example:
   *
   * ```
   * App app;
   * new Stage(app, "DevStage");
   * Stage.Builder.create(app, "BetaStage")
   * .permissionsBoundary(PermissionsBoundary.fromName("beta-permissions-boundary"))
   * .build();
   * Stage.Builder.create(app, "GammaStage")
   * .permissionsBoundary(PermissionsBoundary.fromName("prod-permissions-boundary"))
   * .build();
   * Stage.Builder.create(app, "ProdStage")
   * .permissionsBoundary(PermissionsBoundary.fromName("prod-permissions-boundary"))
   * .build();
   * ```
   */
  public inline fun stageProps(block: StagePropsDsl.() -> Unit = {}): StageProps {
    val builder = StagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for assembly synthesis.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * StageSynthesisOptions stageSynthesisOptions = StageSynthesisOptions.builder()
   * .force(false)
   * .skipValidation(false)
   * .validateOnSynthesis(false)
   * .build();
   * ```
   */
  public inline fun stageSynthesisOptions(block: StageSynthesisOptionsDsl.() -> Unit = {}):
      StageSynthesisOptions {
    val builder = StageSynthesisOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Stack artifact options.
   *
   * A subset of `cxschema.AwsCloudFormationStackProperties` of optional settings that need to be
   * configurable by synthesizers, plus `additionalDependencies`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * SynthesizeStackArtifactOptions synthesizeStackArtifactOptions =
   * SynthesizeStackArtifactOptions.builder()
   * .additionalDependencies(List.of("additionalDependencies"))
   * .assumeRoleArn("assumeRoleArn")
   * .assumeRoleExternalId("assumeRoleExternalId")
   * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
   * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
   * .lookupRole(BootstrapRole.builder()
   * .arn("arn")
   * // the properties below are optional
   * .assumeRoleExternalId("assumeRoleExternalId")
   * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
   * .requiresBootstrapStackVersion(123)
   * .build())
   * .parameters(Map.of(
   * "parametersKey", "parameters"))
   * .requiresBootstrapStackVersion(123)
   * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
   * .build();
   * ```
   */
  public inline
      fun synthesizeStackArtifactOptions(block: SynthesizeStackArtifactOptionsDsl.() -> Unit = {}):
      SynthesizeStackArtifactOptions {
    val builder = SynthesizeStackArtifactOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The Tag Aspect will handle adding a tag to this node and cascading tags to children.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * Tag tag = Tag.Builder.create("key", "value")
   * .applyToLaunchedInstances(false)
   * .excludeResourceTypes(List.of("excludeResourceTypes"))
   * .includeResourceTypes(List.of("includeResourceTypes"))
   * .priority(123)
   * .build();
   * ```
   */
  public inline fun tag(
    key: String,
    `value`: String,
    block: TagDsl.() -> Unit = {},
  ): Tag {
    val builder = TagDsl(key, value)
    builder.apply(block)
    return builder.build()
  }

  /**
   * TagManager facilitates a common implementation of tagging for Constructs.
   *
   * Normally, you do not need to use this class, as the CloudFormation specification
   * will indicate which resources are taggable. However, sometimes you will need this
   * to make custom resources taggable. Used `tagManager.renderedTags` to obtain a
   * value that will resolve to the tags at synthesis time.
   *
   * Example:
   *
   * ```
   * public class MyConstruct extends Resource implements ITaggable {
   * public final Object tags;
   * public MyConstruct(Construct scope, String id) {
   * super(scope, id);
   * CfnResource.Builder.create(this, "Resource")
   * .type("Whatever::The::Type")
   * .properties(Map.of(
   * // ...
   * "Tags", this.tags.getRenderedTags()))
   * .build();
   * }
   * }
   * ```
   */
  public inline fun tagManager(
    tagType: TagType,
    resourceTypeName: String,
    initialTags: Any,
    block: TagManagerDsl.() -> Unit = {},
  ): TagManager {
    val builder = TagManagerDsl(tagType, resourceTypeName, initialTags)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options to configure TagManager behavior.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * TagManagerOptions tagManagerOptions = TagManagerOptions.builder()
   * .tagPropertyName("tagPropertyName")
   * .build();
   * ```
   */
  public inline fun tagManagerOptions(block: TagManagerOptionsDsl.() -> Unit = {}):
      TagManagerOptions {
    val builder = TagManagerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a tag.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * TagProps tagProps = TagProps.builder()
   * .applyToLaunchedInstances(false)
   * .excludeResourceTypes(List.of("excludeResourceTypes"))
   * .includeResourceTypes(List.of("includeResourceTypes"))
   * .priority(123)
   * .build();
   * ```
   */
  public inline fun tagProps(block: TagPropsDsl.() -> Unit = {}): TagProps {
    val builder = TagPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for how to convert time to a different unit.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * TimeConversionOptions timeConversionOptions = TimeConversionOptions.builder()
   * .integral(false)
   * .build();
   * ```
   */
  public inline fun timeConversionOptions(block: TimeConversionOptionsDsl.() -> Unit = {}):
      TimeConversionOptions {
    val builder = TimeConversionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for creating a unique resource name.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * UniqueResourceNameOptions uniqueResourceNameOptions = UniqueResourceNameOptions.builder()
   * .allowedSpecialCharacters("allowedSpecialCharacters")
   * .maxLength(123)
   * .separator("separator")
   * .build();
   * ```
   */
  public inline fun uniqueResourceNameOptions(block: UniqueResourceNameOptionsDsl.() -> Unit = {}):
      UniqueResourceNameOptions {
    val builder = UniqueResourceNameOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
