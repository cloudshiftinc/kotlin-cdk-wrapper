@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.dsl.cloudassembly.schema.AssetManifestOptionsDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.DockerImageDestinationDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.FileDestinationDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.MissingContextDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.AssetManifestBuilder
import software.amazon.awscdk.BootstraplessSynthesizer
import software.amazon.awscdk.CfnCodeDeployBlueGreenHook
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.CfnResourceVersion
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.CfnTypeActivation
import software.amazon.awscdk.CliCredentialsStackSynthesizer
import software.amazon.awscdk.DefaultStackSynthesizer
import software.amazon.awscdk.DockerImage
import software.amazon.awscdk.DockerImageAssetLocation
import software.amazon.awscdk.DockerImageAssetSource
import software.amazon.awscdk.Duration
import software.amazon.awscdk.FileAssetLocation
import software.amazon.awscdk.FileAssetSource
import software.amazon.awscdk.ICfnResourceOptions
import software.amazon.awscdk.ILocalBundling
import software.amazon.awscdk.IResolveContext
import software.amazon.awscdk.IStackSynthesizer
import software.amazon.awscdk.ISynthesisSession
import software.amazon.awscdk.LegacyStackSynthesizer
import software.amazon.awscdk.NestedStackSynthesizer
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.Size
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackSynthesizer
import software.amazon.awscdk.Stage
import software.amazon.awscdk.Tags
import software.amazon.awscdk.cloudassembly.schema.DockerImageDestination
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource
import software.amazon.awscdk.cloudassembly.schema.FileDestination
import software.amazon.awscdk.cloudassembly.schema.FileSource
import software.amazon.awscdk.cxapi.CloudAssembly

public inline fun ILocalBundling.tryBundle(arg0: String, block: BundlingOptionsDsl.() -> Unit = {}):
    Boolean {
  val builder = BundlingOptionsDsl()
  builder.apply(block)
  return tryBundle(arg0, builder.build())
}

/**
 * Register a Docker Image Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline
    fun DefaultStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

/**
 * Register a File Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline fun DefaultStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

/**
 * Return this storage as a total number of bytes.
 *
 * @return the quantity expressed in bytes
 * @param opts the conversion options.
 */
public inline fun Size.toBytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toBytes(builder.build())
}

/**
 * Return this storage as a total number of gibibytes.
 *
 * @return the quantity of bytes expressed in gibibytes
 * @param opts the conversion options.
 */
public inline fun Size.toGibibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toGibibytes(builder.build())
}

/**
 * Return this storage as a total number of kibibytes.
 *
 * @return the quantity of bytes expressed in kibibytes
 * @param opts the conversion options.
 */
public inline fun Size.toKibibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toKibibytes(builder.build())
}

/**
 * Return this storage as a total number of mebibytes.
 *
 * @return the quantity of bytes expressed in mebibytes
 * @param opts the conversion options.
 */
public inline fun Size.toMebibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toMebibytes(builder.build())
}

/**
 * Return this storage as a total number of pebibytes.
 *
 * @return the quantity of bytes expressed in pebibytes
 * @param opts the conversion options.
 */
public inline fun Size.toPebibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toPebibytes(builder.build())
}

/**
 * Return this storage as a total number of tebibytes.
 *
 * @return the quantity of bytes expressed in tebibytes
 * @param opts the conversion options.
 */
public inline fun Size.toTebibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toTebibytes(builder.build())
}

/**
 * Specifies logging configuration information for an extension.
 */
public inline
    fun CfnTypeActivation.setLoggingConfig(block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTypeActivationLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

/**
 * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
 * Organizations accounts that are added to a target organization or organizational unit (OU).
 */
public inline
    fun CfnStackSet.setAutoDeployment(block: CfnStackSetAutoDeploymentPropertyDsl.() -> Unit = {}) {
  val builder = CfnStackSetAutoDeploymentPropertyDsl()
  builder.apply(block)
  return setAutoDeployment(builder.build())
}

/**
 * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
 */
public inline
    fun CfnStackSet.setOperationPreferences(block: CfnStackSetOperationPreferencesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStackSetOperationPreferencesPropertyDsl()
  builder.apply(block)
  return setOperationPreferences(builder.build())
}

/**
 * Additional options for the blue/green deployment.
 *
 * Default: - no additional options
 */
public inline
    fun CfnCodeDeployBlueGreenHook.setAdditionalOptions(block: CfnCodeDeployBlueGreenAdditionalOptionsDsl.() -> Unit
    = {}) {
  val builder = CfnCodeDeployBlueGreenAdditionalOptionsDsl()
  builder.apply(block)
  return setAdditionalOptions(builder.build())
}

/**
 * Use lifecycle event hooks to specify a Lambda function that CodeDeploy can call to validate a
 * deployment.
 *
 * You can use the same function or a different one for deployment lifecycle events.
 * Following completion of the validation tests,
 * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
 * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
 *
 * Default: - no lifecycle event hooks
 */
public inline
    fun CfnCodeDeployBlueGreenHook.setLifecycleEventHooks(block: CfnCodeDeployBlueGreenLifecycleEventHooksDsl.() -> Unit
    = {}) {
  val builder = CfnCodeDeployBlueGreenLifecycleEventHooksDsl()
  builder.apply(block)
  return setLifecycleEventHooks(builder.build())
}

/**
 * Traffic routing configuration settings.
 *
 * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute bake
 * time
 */
public inline
    fun CfnCodeDeployBlueGreenHook.setTrafficRoutingConfig(block: CfnTrafficRoutingConfigDsl.() -> Unit
    = {}) {
  val builder = CfnTrafficRoutingConfigDsl()
  builder.apply(block)
  return setTrafficRoutingConfig(builder.build())
}

/**
 * Register a Docker Image Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline
    fun LegacyStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

/**
 * Register a File Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline fun LegacyStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

/**
 * Create a CloudFormation Export for a string list value.
 *
 * Returns a string list representing the corresponding `Fn.importValue()`
 * expression for this Export. The export expression is automatically wrapped with an
 * `Fn::Join` and the import value with an `Fn::Split`, since CloudFormation can only
 * export strings. You can control the name for the export by passing the `name` option.
 *
 * If you don't supply a value for `name`, the value you're exporting must be
 * a Resource attribute (for example: `bucket.bucketName`) and it will be
 * given the same name as the automatic cross-stack reference that would be created
 * if you used the attribute in another Stack.
 *
 * One of the uses for this method is to *remove* the relationship between
 * two Stacks established by automatic cross-stack references. It will
 * temporarily ensure that the CloudFormation Export still exists while you
 * remove the reference from the consuming stack. After that, you can remove
 * the resource and the manual export.
 *
 * See `exportValue` for an example of this process.
 *
 * @param exportedValue 
 * @param options
 */
public inline fun Stack.exportStringListValue(exportedValue: Any,
    block: ExportValueOptionsDsl.() -> Unit = {}): List<String> {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportStringListValue(exportedValue, builder.build())
}

/**
 * Create a CloudFormation Export for a string value.
 *
 * Returns a string representing the corresponding `Fn.importValue()`
 * expression for this Export. You can control the name for the export by
 * passing the `name` option.
 *
 * If you don't supply a value for `name`, the value you're exporting must be
 * a Resource attribute (for example: `bucket.bucketName`) and it will be
 * given the same name as the automatic cross-stack reference that would be created
 * if you used the attribute in another Stack.
 *
 * One of the uses for this method is to *remove* the relationship between
 * two Stacks established by automatic cross-stack references. It will
 * temporarily ensure that the CloudFormation Export still exists while you
 * remove the reference from the consuming stack. After that, you can remove
 * the resource and the manual export.
 *
 * <h2>Example</h2>
 *
 * Here is how the process works. Let's say there are two stacks,
 * `producerStack` and `consumerStack`, and `producerStack` has a bucket
 * called `bucket`, which is referenced by `consumerStack` (perhaps because
 * an AWS Lambda Function writes into it, or something like that).
 *
 * It is not safe to remove `producerStack.bucket` because as the bucket is being
 * deleted, `consumerStack` might still be using it.
 *
 * Instead, the process takes two deployments:
 *
 * <h3>Deployment 1: break the relationship</h3>
 *
 * * Make sure `consumerStack` no longer references `bucket.bucketName` (maybe the consumer
 * stack now uses its own bucket, or it writes to an AWS DynamoDB table, or maybe you just
 * remove the Lambda Function altogether).
 * * In the `ProducerStack` class, call `this.exportValue(this.bucket.bucketName)`. This
 * will make sure the CloudFormation Export continues to exist while the relationship
 * between the two stacks is being broken.
 * * Deploy (this will effectively only change the `consumerStack`, but it's safe to deploy both).
 *
 * <h3>Deployment 2: remove the bucket resource</h3>
 *
 * * You are now free to remove the `bucket` resource from `producerStack`.
 * * Don't forget to remove the `exportValue()` call as well.
 * * Deploy again (this time only the `producerStack` will be changed -- the bucket will be
 * deleted).
 *
 * @param exportedValue 
 * @param options
 */
public inline fun Stack.exportValue(exportedValue: Any, block: ExportValueOptionsDsl.() -> Unit =
    {}): String {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportValue(exportedValue, builder.build())
}

/**
 * Creates an ARN from components.
 *
 * If `partition`, `region` or `account` are not specified, the stack's
 * partition, region and account will be used.
 *
 * If any component is the empty string, an empty string will be inserted
 * into the generated ARN at the location that component corresponds to.
 *
 * The ARN will be formatted as follows:
 *
 * arn:{partition}:{service}:{region}:{account}:{resource}{sep}{resource-name}
 *
 * The required ARN pieces that are omitted will be taken from the stack that
 * the 'scope' is attached to. If all ARN pieces are supplied, the supplied scope
 * can be 'undefined'.
 *
 * @param components 
 */
public inline fun Stack.formatArn(block: ArnComponentsDsl.() -> Unit = {}): String {
  val builder = ArnComponentsDsl()
  builder.apply(block)
  return formatArn(builder.build())
}

/**
 * Indicate that a context key was expected.
 *
 * Contains instructions which will be emitted into the cloud assembly on how
 * the key should be supplied.
 *
 * @param report The set of parameters needed to obtain the context. 
 */
public inline fun Stack.reportMissingContextKey(block: MissingContextDsl.() -> Unit = {}) {
  val builder = MissingContextDsl()
  builder.apply(block)
  return reportMissingContextKey(builder.build())
}

/**
 * Register a Docker Image Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline fun StackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

/**
 * Register a File Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline fun StackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

/**
 * Register a Docker Image Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline
    fun CliCredentialsStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit
    = {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

/**
 * Register a File Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline fun CliCredentialsStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit =
    {}): FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

/**
 * Runs a Docker image.
 *
 * @param options
 */
public inline fun DockerImage.run(block: DockerRunOptionsDsl.() -> Unit = {}) {
  val builder = DockerRunOptionsDsl()
  builder.apply(block)
  return run(builder.build())
}

/**
 * add tags to the node of a construct and all its the taggable children.
 *
 * @param key 
 * @param value 
 * @param props
 */
public inline fun Tags.add(
  key: String,
  `value`: String,
  block: TagPropsDsl.() -> Unit = {},
) {
  val builder = TagPropsDsl()
  builder.apply(block)
  return add(key, value, builder.build())
}

/**
 * remove tags to the node of a construct and all its the taggable children.
 *
 * @param key 
 * @param props
 */
public inline fun Tags.remove(key: String, block: TagPropsDsl.() -> Unit = {}) {
  val builder = TagPropsDsl()
  builder.apply(block)
  return remove(key, builder.build())
}

/**
 * Register a Docker Image Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline
    fun NestedStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

/**
 * Register a File Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param asset 
 */
public inline fun NestedStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

/**
 * Associate the CreationPolicy attribute with a resource to prevent its status from reaching create
 * complete until AWS CloudFormation receives a specified number of success signals or the timeout
 * period is exceeded.
 *
 * To signal a
 * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
 * publishes valid signals
 * to the stack events so that you track the number of signals sent.
 */
public inline fun ICfnResourceOptions.setCreationPolicy(block: CfnCreationPolicyDsl.() -> Unit =
    {}) {
  val builder = CfnCreationPolicyDsl()
  builder.apply(block)
  return setCreationPolicy(builder.build())
}

/**
 * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
 * AWS::AutoScaling::AutoScalingGroup resource.
 *
 * AWS CloudFormation invokes one of three update policies depending on the type of change you make
 * or whether a
 * scheduled action is associated with the Auto Scaling group.
 */
public inline fun ICfnResourceOptions.setUpdatePolicy(block: CfnUpdatePolicyDsl.() -> Unit = {}) {
  val builder = CfnUpdatePolicyDsl()
  builder.apply(block)
  return setUpdatePolicy(builder.build())
}

/**
 * Return the total number of days in this Duration.
 *
 * @return the value of this `Duration` expressed in Days.
 * @param opts
 */
public inline fun Duration.toDays(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toDays(builder.build())
}

/**
 * Return the total number of hours in this Duration.
 *
 * @return the value of this `Duration` expressed in Hours.
 * @param opts
 */
public inline fun Duration.toHours(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toHours(builder.build())
}

/**
 * Return the total number of milliseconds in this Duration.
 *
 * @return the value of this `Duration` expressed in Milliseconds.
 * @param opts
 */
public inline fun Duration.toMilliseconds(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toMilliseconds(builder.build())
}

/**
 * Return the total number of minutes in this Duration.
 *
 * @return the value of this `Duration` expressed in Minutes.
 * @param opts
 */
public inline fun Duration.toMinutes(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toMinutes(builder.build())
}

/**
 * Return the total number of seconds in this Duration.
 *
 * @return the value of this `Duration` expressed in Seconds.
 * @param opts
 */
public inline fun Duration.toSeconds(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toSeconds(builder.build())
}

/**
 * Synthesize this stage into a cloud assembly.
 *
 * Once an assembly has been synthesized, it cannot be modified. Subsequent
 * calls will return the same assembly.
 *
 * @param options
 */
public inline fun Stage.synth(block: StageSynthesisOptionsDsl.() -> Unit = {}): CloudAssembly {
  val builder = StageSynthesisOptionsDsl()
  builder.apply(block)
  return synth(builder.build())
}

public inline fun IResolveContext.resolve(arg0: Any,
    block: ResolveChangeContextOptionsDsl.() -> Unit = {}): Any {
  val builder = ResolveChangeContextOptionsDsl()
  builder.apply(block)
  return resolve(arg0, builder.build())
}

/**
 * Register a Docker Image Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param _asset 
 */
public inline
    fun BootstraplessSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

/**
 * Register a File Asset.
 *
 * Returns the parameters that can be used to refer to the asset inside the template.
 *
 * The synthesizer must rely on some out-of-band mechanism to make sure the given files
 * are actually placed in the returned location before the deployment happens. This can
 * be by writing the instructions to the asset manifest (for use by the `cdk-assets` tool),
 * by relying on the CLI to upload files (legacy behavior), or some other operator controlled
 * mechanism.
 *
 * @param _asset 
 */
public inline fun BootstraplessSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

/**
 * Logging configuration information for a resource.
 */
public inline
    fun CfnResourceVersion.setLoggingConfig(block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceVersionLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

/**
 * Contains logging configuration information for an extension.
 */
public inline
    fun CfnHookVersion.setLoggingConfig(block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnHookVersionLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

/**
 * Sets the deletion policy of the resource based on the removal policy specified.
 *
 * The Removal Policy controls what happens to this resource when it stops
 * being managed by CloudFormation, either because you've removed it from the
 * CDK application or because you've made a change that requires the resource
 * to be replaced.
 *
 * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
 * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`). In some
 * cases, a snapshot can be taken of the resource prior to deletion
 * (`RemovalPolicy.SNAPSHOT`). A list of resources that support this policy
 * can be found in the following link:
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html#aws-attribute-deletionpolicy-options)
 * @param policy
 * @param options
 */
public inline fun CfnResource.applyRemovalPolicy(policy: RemovalPolicy?,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(policy, builder.build())
}

public inline fun IStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit
    = {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

public inline fun IStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

/**
 * Add a docker asset source and destination to the manifest.
 *
 * sourceHash should be unique for every source.
 *
 * @param stack 
 * @param sourceHash 
 * @param source 
 * @param dest 
 */
public inline fun AssetManifestBuilder.addDockerImageAsset(
  stack: Stack,
  sourceHash: String,
  source: DockerImageSource,
  block: DockerImageDestinationDsl.() -> Unit = {},
): DockerImageDestination {
  val builder = DockerImageDestinationDsl()
  builder.apply(block)
  return addDockerImageAsset(stack, sourceHash, source, builder.build())
}

/**
 * Add a file asset source and destination to the manifest.
 *
 * sourceHash should be unique for every source.
 *
 * @param stack 
 * @param sourceHash 
 * @param source 
 * @param dest 
 */
public inline fun AssetManifestBuilder.addFileAsset(
  stack: Stack,
  sourceHash: String,
  source: FileSource,
  block: FileDestinationDsl.() -> Unit = {},
): FileDestination {
  val builder = FileDestinationDsl()
  builder.apply(block)
  return addFileAsset(stack, sourceHash, source, builder.build())
}

/**
 * Add a docker image asset to the manifest with default settings.
 *
 * Derive the region from the stack, use the asset hash as the key, and set the prefix.
 *
 * @param stack 
 * @param asset 
 * @param target 
 */
public inline fun AssetManifestBuilder.defaultAddDockerImageAsset(
  stack: Stack,
  asset: DockerImageAssetSource,
  block: AssetManifestDockerImageDestinationDsl.() -> Unit = {},
): DockerImageDestination {
  val builder = AssetManifestDockerImageDestinationDsl()
  builder.apply(block)
  return defaultAddDockerImageAsset(stack, asset, builder.build())
}

/**
 * Add a file asset to the manifest with default settings.
 *
 * Derive the region from the stack, use the asset hash as the key, copy the
 * file extension over, and set the prefix.
 *
 * @param stack 
 * @param asset 
 * @param target 
 */
public inline fun AssetManifestBuilder.defaultAddFileAsset(
  stack: Stack,
  asset: FileAssetSource,
  block: AssetManifestFileDestinationDsl.() -> Unit = {},
): FileDestination {
  val builder = AssetManifestFileDestinationDsl()
  builder.apply(block)
  return defaultAddFileAsset(stack, asset, builder.build())
}

/**
 * Write the manifest to disk, and add it to the synthesis session.
 *
 * Return the artifact id, which should be added to the `additionalDependencies`
 * field of the stack artifact.
 *
 * @param stack 
 * @param session 
 * @param options
 * @param dependencies
 */
public inline fun AssetManifestBuilder.emitManifest(
  stack: Stack,
  session: ISynthesisSession,
  block: AssetManifestOptionsDsl.() -> Unit = {},
): String {
  val builder = AssetManifestOptionsDsl()
  builder.apply(block)
  return emitManifest(stack, session, builder.build())
}
