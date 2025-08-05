@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.LifecycleRule
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a new Canary.
 *
 * Example:
 *
 * ```
 * Canary canary = Canary.Builder.create(this, "MyCanary")
 * .schedule(Schedule.rate(Duration.minutes(5)))
 * .test(Test.custom(CustomTestOptions.builder()
 * .code(Code.fromAsset(join(__dirname, "canary")))
 * .handler("index.handler")
 * .build()))
 * .runtime(Runtime.SYNTHETICS_NODEJS_PUPPETEER_7_0)
 * .resourcesToReplicateTags(List.of(ResourceToReplicateTags.LAMBDA_FUNCTION))
 * .build();
 * ```
 */
public open class Canary(
  cdkObject: software.amazon.awscdk.services.synthetics.Canary,
) : Resource(cdkObject),
    IConnectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CanaryProps,
  ) :
      this(software.amazon.awscdk.services.synthetics.Canary(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CanaryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CanaryProps.Builder.() -> Unit,
  ) : this(scope, id, CanaryProps(props)
  )

  /**
   * Bucket where data from each canary run is stored.
   */
  public open fun artifactsBucket(): IBucket = unwrap(this).getArtifactsBucket().let(IBucket::wrap)

  /**
   * The canary ID.
   */
  public open fun canaryId(): String = unwrap(this).getCanaryId()

  /**
   * The canary Name.
   */
  public open fun canaryName(): String = unwrap(this).getCanaryName()

  /**
   * The state of the canary.
   *
   * For example, 'RUNNING', 'STOPPED', 'NOT STARTED', or 'ERROR'.
   */
  public open fun canaryState(): String = unwrap(this).getCanaryState()

  /**
   * Access the Connections object.
   *
   * Will fail if not a VPC-enabled Canary
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Measure the Duration of a single canary run, in seconds.
   *
   * Default: avg over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  public open fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

  /**
   * Measure the Duration of a single canary run, in seconds.
   *
   * Default: avg over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  public open fun metricDuration(options: MetricOptions): Metric =
      unwrap(this).metricDuration(options.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Measure the Duration of a single canary run, in seconds.
   *
   * Default: avg over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public open fun metricDuration(options: MetricOptions.Builder.() -> Unit): Metric =
      metricDuration(MetricOptions(options))

  /**
   * Measure the number of failed canary runs over a given time period.
   *
   * Default: sum over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  public open fun metricFailed(): Metric = unwrap(this).metricFailed().let(Metric::wrap)

  /**
   * Measure the number of failed canary runs over a given time period.
   *
   * Default: sum over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  public open fun metricFailed(options: MetricOptions): Metric =
      unwrap(this).metricFailed(options.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Measure the number of failed canary runs over a given time period.
   *
   * Default: sum over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
  public open fun metricFailed(options: MetricOptions.Builder.() -> Unit): Metric =
      metricFailed(MetricOptions(options))

  /**
   * Measure the percentage of successful canary runs.
   *
   * Default: avg over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  public open fun metricSuccessPercent(): Metric =
      unwrap(this).metricSuccessPercent().let(Metric::wrap)

  /**
   * Measure the percentage of successful canary runs.
   *
   * Default: avg over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  public open fun metricSuccessPercent(options: MetricOptions): Metric =
      unwrap(this).metricSuccessPercent(options.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Measure the percentage of successful canary runs.
   *
   * Default: avg over 5 minutes
   *
   * @param options * configuration options for the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("440514f5588d39cbe9cbdeafe3b15d768d76c9e168f35becb0e0afe0d2b06bfb")
  public open fun metricSuccessPercent(options: MetricOptions.Builder.() -> Unit): Metric =
      metricSuccessPercent(MetricOptions(options))

  /**
   * Execution role associated with this Canary.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.synthetics.Canary].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether this canary is to use active AWS X-Ray tracing when it runs.
     *
     * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
     * maps even if the
     * canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray tracing incurs
     * charges.
     *
     * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
     * for their canary runtime.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
     * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when it
     * runs. 
     */
    public fun activeTracing(activeTracing: Boolean)

    /**
     * Canary Artifacts in S3 encryption mode.
     *
     * Artifact encryption is only supported for canaries that use Synthetics runtime
     * version `syn-nodejs-puppeteer-3.3` or later.
     *
     * Default: - Artifacts are encrypted at rest using an AWS managed key.
     * `ArtifactsEncryptionMode.KMS` is set if you specify `artifactS3KmsKey`.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
     * @param artifactS3EncryptionMode Canary Artifacts in S3 encryption mode. 
     */
    public fun artifactS3EncryptionMode(artifactS3EncryptionMode: ArtifactsEncryptionMode)

    /**
     * The KMS key used to encrypt canary artifacts.
     *
     * Default: - no kms key if `artifactS3EncryptionMode` is set to `S3_MANAGED`. A key will be
     * created if one is not provided and `artifactS3EncryptionMode` is set to `KMS`.
     *
     * @param artifactS3KmsKey The KMS key used to encrypt canary artifacts. 
     */
    public fun artifactS3KmsKey(artifactS3KmsKey: IKey)

    /**
     * Lifecycle rules for the generated canary artifact bucket.
     *
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     *
     * Default: - no rules applied to the generated bucket.
     *
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     * bucket. 
     */
    public fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>)

    /**
     * Lifecycle rules for the generated canary artifact bucket.
     *
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     *
     * Default: - no rules applied to the generated bucket.
     *
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     * bucket. 
     */
    public fun artifactsBucketLifecycleRules(vararg artifactsBucketLifecycleRules: LifecycleRule)

    /**
     * The s3 location that stores the data of the canary runs.
     *
     * Default: - A new s3 bucket will be created without a prefix.
     *
     * @param artifactsBucketLocation The s3 location that stores the data of the canary runs. 
     */
    public fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation)

    /**
     * The s3 location that stores the data of the canary runs.
     *
     * Default: - A new s3 bucket will be created without a prefix.
     *
     * @param artifactsBucketLocation The s3 location that stores the data of the canary runs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cba359b9320a239876b8e1a47380fa5d3221f2548b13aaa4c6ee90331bf90fa7")
    public
        fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit)

    /**
     * The name of the canary.
     *
     * Be sure to give it a descriptive name that distinguishes it from
     * other canaries in your account.
     *
     * Do not include secrets or proprietary information in your canary name. The canary name
     * makes up part of the canary ARN, which is included in outbound calls over the internet.
     *
     * Default: - A unique name will be generated from the construct ID
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
     * @param canaryName The name of the canary. 
     */
    public fun canaryName(canaryName: String)

    /**
     * (deprecated) Specify the underlying resources to be cleaned up when the canary is deleted.
     *
     * Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
     *
     * Default: Cleanup.NOTHING
     *
     * @deprecated use provisionedResourceCleanup
     * @param cleanup Specify the underlying resources to be cleaned up when the canary is deleted. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun cleanup(cleanup: Cleanup)

    /**
     * Specifies whether to perform a dry run before updating the canary.
     *
     * If set to true, CDK will execute a dry run to validate the changes before applying them to
     * the canary.
     * If the dry run succeeds, the canary will be updated with the changes.
     * If the dry run fails, the CloudFormation deployment will fail with the dry run's failure
     * reason.
     *
     * If set to false or omitted, the canary will be updated directly without first performing a
     * dry run.
     *
     * Default: undefined - AWS CloudWatch default is false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/performing-safe-canary-upgrades.html)
     * @param dryRunAndUpdate Specifies whether to perform a dry run before updating the canary. 
     */
    public fun dryRunAndUpdate(dryRunAndUpdate: Boolean)

    /**
     * Key-value pairs that the Synthetics caches and makes available for your canary scripts.
     *
     * Use environment variables
     * to apply configuration changes, such as test and production environment configurations,
     * without changing your
     * Canary script source code.
     *
     * Default: - No environment variables.
     *
     * @param environmentVariables Key-value pairs that the Synthetics caches and makes available
     * for your canary scripts. 
     */
    public fun environmentVariables(environmentVariables: Map<String, String>)

    /**
     * How many days should failed runs be retained.
     *
     * Default: Duration.days(31)
     *
     * @param failureRetentionPeriod How many days should failed runs be retained. 
     */
    public fun failureRetentionPeriod(failureRetentionPeriod: Duration)

    /**
     * The amount of times the canary will automatically retry a failed run.
     *
     * This is only supported on the following runtimes or newer:
     * `Runtime.SYNTHETICS_NODEJS_PUPPETEER_10_0`, `Runtime.SYNTHETICS_NODEJS_PLAYWRIGHT_2_0`,
     * `Runtime.SYNTHETICS_PYTHON_SELENIUM_5_1`.
     * Max retries can be set between 0 and 2. Canaries which time out after 10 minutes are
     * automatically limited to one retry.
     *
     * Default: 0
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_autoretry.html)
     * @param maxRetries The amount of times the canary will automatically retry a failed run. 
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * The maximum amount of memory that the canary can use while running.
     *
     * This value must be a multiple of 64 Mib.
     * The range is 960 MiB to 3008 MiB.
     *
     * Default: Size.mebibytes(1024)
     *
     * @param memory The maximum amount of memory that the canary can use while running. 
     */
    public fun memory(memory: Size)

    /**
     * Whether to also delete the Lambda functions and layers used by this canary when the canary is
     * deleted.
     *
     * Default: undefined - the default behavior is to not delete the Lambda functions and layers
     *
     * @param provisionedResourceCleanup Whether to also delete the Lambda functions and layers used
     * by this canary when the canary is deleted. 
     */
    public fun provisionedResourceCleanup(provisionedResourceCleanup: Boolean)

    /**
     * Specifies which resources should have their tags replicated to this canary.
     *
     * To have the tags that you apply to this canary also be applied to the Lambda
     * function that the canary uses, specify this property with the value
     * ResourceToReplicateTags.LAMBDA_FUNCTION. If you do this, CloudWatch Synthetics will keep the
     * tags of the canary and the
     * Lambda function synchronized. Any future changes you make to the canary's tags
     * will also be applied to the function.
     *
     * Default: - No resources will have their tags replicated to this canary
     *
     * @param resourcesToReplicateTags Specifies which resources should have their tags replicated
     * to this canary. 
     */
    public fun resourcesToReplicateTags(resourcesToReplicateTags: List<ResourceToReplicateTags>)

    /**
     * Specifies which resources should have their tags replicated to this canary.
     *
     * To have the tags that you apply to this canary also be applied to the Lambda
     * function that the canary uses, specify this property with the value
     * ResourceToReplicateTags.LAMBDA_FUNCTION. If you do this, CloudWatch Synthetics will keep the
     * tags of the canary and the
     * Lambda function synchronized. Any future changes you make to the canary's tags
     * will also be applied to the function.
     *
     * Default: - No resources will have their tags replicated to this canary
     *
     * @param resourcesToReplicateTags Specifies which resources should have their tags replicated
     * to this canary. 
     */
    public fun resourcesToReplicateTags(vararg resourcesToReplicateTags: ResourceToReplicateTags)

    /**
     * Canary execution role.
     *
     * This is the role that will be assumed by the canary upon execution.
     * It controls the permissions that the canary will have. The role must
     * be assumable by the AWS Lambda service principal.
     *
     * If not supplied, a role will be created with all the required permissions.
     * If you provide a Role, you must add the required permissions.
     *
     * Default: - A unique role will be generated for this canary.
     * You can add permissions to roles by calling 'addToRolePolicy'.
     *
     * [Documentation](required permissions:
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn)
     * @param role Canary execution role. 
     */
    public fun role(role: IRole)

    /**
     * Specify the runtime version to use for the canary.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
     * @param runtime Specify the runtime version to use for the canary. 
     */
    public fun runtime(runtime: Runtime)

    /**
     * Specify the schedule for how often the canary runs.
     *
     * For example, if you set `schedule` to `rate(10 minutes)`, then the canary will run every 10
     * minutes.
     * You can set the schedule with `Schedule.rate(Duration)` (recommended) or you can specify an
     * expression using `Schedule.expression()`.
     *
     * Default: 'rate(5 minutes)'
     *
     * @param schedule Specify the schedule for how often the canary runs. 
     */
    public fun schedule(schedule: Schedule)

    /**
     * The list of security groups to associate with the canary's network interfaces.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - If the canary is placed within a VPC and a security group is
     * not specified a dedicated security group will be created for this canary.
     *
     * @param securityGroups The list of security groups to associate with the canary's network
     * interfaces. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The list of security groups to associate with the canary's network interfaces.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - If the canary is placed within a VPC and a security group is
     * not specified a dedicated security group will be created for this canary.
     *
     * @param securityGroups The list of security groups to associate with the canary's network
     * interfaces. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Whether or not the canary should start after creation.
     *
     * Default: true
     *
     * @param startAfterCreation Whether or not the canary should start after creation. 
     */
    public fun startAfterCreation(startAfterCreation: Boolean)

    /**
     * How many days should successful runs be retained.
     *
     * Default: Duration.days(31)
     *
     * @param successRetentionPeriod How many days should successful runs be retained. 
     */
    public fun successRetentionPeriod(successRetentionPeriod: Duration)

    /**
     * The type of test that you want your canary to run.
     *
     * Use `Test.custom()` to specify the test to run.
     *
     * @param test The type of test that you want your canary to run. 
     */
    public fun test(test: Test)

    /**
     * How long the canary will be in a 'RUNNING' state.
     *
     * For example, if you set `timeToLive` to be 1 hour and `schedule` to be `rate(10 minutes)`,
     * your canary will run at 10 minute intervals for an hour, for a total of 6 times.
     *
     * Default: - no limit
     *
     * @param timeToLive How long the canary will be in a 'RUNNING' state. 
     */
    public fun timeToLive(timeToLive: Duration)

    /**
     * How long the canary is allowed to run before it must stop.
     *
     * You can't set this time to be longer than the frequency of the runs of this canary.
     *
     * The minimum allowed value is 3 seconds.
     * The maximum allowed value is 840 seconds (14 minutes).
     *
     * Default: - the frequency of the canary is used as this value, up to a maximum of 900 seconds.
     *
     * @param timeout How long the canary is allowed to run before it must stop. 
     */
    public fun timeout(timeout: Duration)

    /**
     * The VPC where this canary is run.
     *
     * Specify this if the canary needs to access resources in a VPC.
     *
     * Default: - Not in VPC
     *
     * @param vpc The VPC where this canary is run. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Where to place the network interfaces within the VPC.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where to place the network interfaces within the VPC. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Where to place the network interfaces within the VPC.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where to place the network interfaces within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea7816fdc9d36fdb22296f345cc70fac642d963ca5449962c72b1b2ad55c7100")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.Canary.Builder =
        software.amazon.awscdk.services.synthetics.Canary.Builder.create(scope, id)

    /**
     * Specifies whether this canary is to use active AWS X-Ray tracing when it runs.
     *
     * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
     * maps even if the
     * canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray tracing incurs
     * charges.
     *
     * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
     * for their canary runtime.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
     * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when it
     * runs. 
     */
    override fun activeTracing(activeTracing: Boolean) {
      cdkBuilder.activeTracing(activeTracing)
    }

    /**
     * Canary Artifacts in S3 encryption mode.
     *
     * Artifact encryption is only supported for canaries that use Synthetics runtime
     * version `syn-nodejs-puppeteer-3.3` or later.
     *
     * Default: - Artifacts are encrypted at rest using an AWS managed key.
     * `ArtifactsEncryptionMode.KMS` is set if you specify `artifactS3KmsKey`.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
     * @param artifactS3EncryptionMode Canary Artifacts in S3 encryption mode. 
     */
    override fun artifactS3EncryptionMode(artifactS3EncryptionMode: ArtifactsEncryptionMode) {
      cdkBuilder.artifactS3EncryptionMode(artifactS3EncryptionMode.let(ArtifactsEncryptionMode.Companion::unwrap))
    }

    /**
     * The KMS key used to encrypt canary artifacts.
     *
     * Default: - no kms key if `artifactS3EncryptionMode` is set to `S3_MANAGED`. A key will be
     * created if one is not provided and `artifactS3EncryptionMode` is set to `KMS`.
     *
     * @param artifactS3KmsKey The KMS key used to encrypt canary artifacts. 
     */
    override fun artifactS3KmsKey(artifactS3KmsKey: IKey) {
      cdkBuilder.artifactS3KmsKey(artifactS3KmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * Lifecycle rules for the generated canary artifact bucket.
     *
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     *
     * Default: - no rules applied to the generated bucket.
     *
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     * bucket. 
     */
    override fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>) {
      cdkBuilder.artifactsBucketLifecycleRules(artifactsBucketLifecycleRules.map(LifecycleRule.Companion::unwrap))
    }

    /**
     * Lifecycle rules for the generated canary artifact bucket.
     *
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     *
     * Default: - no rules applied to the generated bucket.
     *
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     * bucket. 
     */
    override fun artifactsBucketLifecycleRules(vararg artifactsBucketLifecycleRules: LifecycleRule):
        Unit = artifactsBucketLifecycleRules(artifactsBucketLifecycleRules.toList())

    /**
     * The s3 location that stores the data of the canary runs.
     *
     * Default: - A new s3 bucket will be created without a prefix.
     *
     * @param artifactsBucketLocation The s3 location that stores the data of the canary runs. 
     */
    override fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation) {
      cdkBuilder.artifactsBucketLocation(artifactsBucketLocation.let(ArtifactsBucketLocation.Companion::unwrap))
    }

    /**
     * The s3 location that stores the data of the canary runs.
     *
     * Default: - A new s3 bucket will be created without a prefix.
     *
     * @param artifactsBucketLocation The s3 location that stores the data of the canary runs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cba359b9320a239876b8e1a47380fa5d3221f2548b13aaa4c6ee90331bf90fa7")
    override
        fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit):
        Unit = artifactsBucketLocation(ArtifactsBucketLocation(artifactsBucketLocation))

    /**
     * The name of the canary.
     *
     * Be sure to give it a descriptive name that distinguishes it from
     * other canaries in your account.
     *
     * Do not include secrets or proprietary information in your canary name. The canary name
     * makes up part of the canary ARN, which is included in outbound calls over the internet.
     *
     * Default: - A unique name will be generated from the construct ID
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
     * @param canaryName The name of the canary. 
     */
    override fun canaryName(canaryName: String) {
      cdkBuilder.canaryName(canaryName)
    }

    /**
     * (deprecated) Specify the underlying resources to be cleaned up when the canary is deleted.
     *
     * Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
     *
     * Default: Cleanup.NOTHING
     *
     * @deprecated use provisionedResourceCleanup
     * @param cleanup Specify the underlying resources to be cleaned up when the canary is deleted. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun cleanup(cleanup: Cleanup) {
      cdkBuilder.cleanup(cleanup.let(Cleanup.Companion::unwrap))
    }

    /**
     * Specifies whether to perform a dry run before updating the canary.
     *
     * If set to true, CDK will execute a dry run to validate the changes before applying them to
     * the canary.
     * If the dry run succeeds, the canary will be updated with the changes.
     * If the dry run fails, the CloudFormation deployment will fail with the dry run's failure
     * reason.
     *
     * If set to false or omitted, the canary will be updated directly without first performing a
     * dry run.
     *
     * Default: undefined - AWS CloudWatch default is false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/performing-safe-canary-upgrades.html)
     * @param dryRunAndUpdate Specifies whether to perform a dry run before updating the canary. 
     */
    override fun dryRunAndUpdate(dryRunAndUpdate: Boolean) {
      cdkBuilder.dryRunAndUpdate(dryRunAndUpdate)
    }

    /**
     * Key-value pairs that the Synthetics caches and makes available for your canary scripts.
     *
     * Use environment variables
     * to apply configuration changes, such as test and production environment configurations,
     * without changing your
     * Canary script source code.
     *
     * Default: - No environment variables.
     *
     * @param environmentVariables Key-value pairs that the Synthetics caches and makes available
     * for your canary scripts. 
     */
    override fun environmentVariables(environmentVariables: Map<String, String>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * How many days should failed runs be retained.
     *
     * Default: Duration.days(31)
     *
     * @param failureRetentionPeriod How many days should failed runs be retained. 
     */
    override fun failureRetentionPeriod(failureRetentionPeriod: Duration) {
      cdkBuilder.failureRetentionPeriod(failureRetentionPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * The amount of times the canary will automatically retry a failed run.
     *
     * This is only supported on the following runtimes or newer:
     * `Runtime.SYNTHETICS_NODEJS_PUPPETEER_10_0`, `Runtime.SYNTHETICS_NODEJS_PLAYWRIGHT_2_0`,
     * `Runtime.SYNTHETICS_PYTHON_SELENIUM_5_1`.
     * Max retries can be set between 0 and 2. Canaries which time out after 10 minutes are
     * automatically limited to one retry.
     *
     * Default: 0
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_autoretry.html)
     * @param maxRetries The amount of times the canary will automatically retry a failed run. 
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * The maximum amount of memory that the canary can use while running.
     *
     * This value must be a multiple of 64 Mib.
     * The range is 960 MiB to 3008 MiB.
     *
     * Default: Size.mebibytes(1024)
     *
     * @param memory The maximum amount of memory that the canary can use while running. 
     */
    override fun memory(memory: Size) {
      cdkBuilder.memory(memory.let(Size.Companion::unwrap))
    }

    /**
     * Whether to also delete the Lambda functions and layers used by this canary when the canary is
     * deleted.
     *
     * Default: undefined - the default behavior is to not delete the Lambda functions and layers
     *
     * @param provisionedResourceCleanup Whether to also delete the Lambda functions and layers used
     * by this canary when the canary is deleted. 
     */
    override fun provisionedResourceCleanup(provisionedResourceCleanup: Boolean) {
      cdkBuilder.provisionedResourceCleanup(provisionedResourceCleanup)
    }

    /**
     * Specifies which resources should have their tags replicated to this canary.
     *
     * To have the tags that you apply to this canary also be applied to the Lambda
     * function that the canary uses, specify this property with the value
     * ResourceToReplicateTags.LAMBDA_FUNCTION. If you do this, CloudWatch Synthetics will keep the
     * tags of the canary and the
     * Lambda function synchronized. Any future changes you make to the canary's tags
     * will also be applied to the function.
     *
     * Default: - No resources will have their tags replicated to this canary
     *
     * @param resourcesToReplicateTags Specifies which resources should have their tags replicated
     * to this canary. 
     */
    override fun resourcesToReplicateTags(resourcesToReplicateTags: List<ResourceToReplicateTags>) {
      cdkBuilder.resourcesToReplicateTags(resourcesToReplicateTags.map(ResourceToReplicateTags.Companion::unwrap))
    }

    /**
     * Specifies which resources should have their tags replicated to this canary.
     *
     * To have the tags that you apply to this canary also be applied to the Lambda
     * function that the canary uses, specify this property with the value
     * ResourceToReplicateTags.LAMBDA_FUNCTION. If you do this, CloudWatch Synthetics will keep the
     * tags of the canary and the
     * Lambda function synchronized. Any future changes you make to the canary's tags
     * will also be applied to the function.
     *
     * Default: - No resources will have their tags replicated to this canary
     *
     * @param resourcesToReplicateTags Specifies which resources should have their tags replicated
     * to this canary. 
     */
    override fun resourcesToReplicateTags(vararg resourcesToReplicateTags: ResourceToReplicateTags):
        Unit = resourcesToReplicateTags(resourcesToReplicateTags.toList())

    /**
     * Canary execution role.
     *
     * This is the role that will be assumed by the canary upon execution.
     * It controls the permissions that the canary will have. The role must
     * be assumable by the AWS Lambda service principal.
     *
     * If not supplied, a role will be created with all the required permissions.
     * If you provide a Role, you must add the required permissions.
     *
     * Default: - A unique role will be generated for this canary.
     * You can add permissions to roles by calling 'addToRolePolicy'.
     *
     * [Documentation](required permissions:
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn)
     * @param role Canary execution role. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * Specify the runtime version to use for the canary.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
     * @param runtime Specify the runtime version to use for the canary. 
     */
    override fun runtime(runtime: Runtime) {
      cdkBuilder.runtime(runtime.let(Runtime.Companion::unwrap))
    }

    /**
     * Specify the schedule for how often the canary runs.
     *
     * For example, if you set `schedule` to `rate(10 minutes)`, then the canary will run every 10
     * minutes.
     * You can set the schedule with `Schedule.rate(Duration)` (recommended) or you can specify an
     * expression using `Schedule.expression()`.
     *
     * Default: 'rate(5 minutes)'
     *
     * @param schedule Specify the schedule for how often the canary runs. 
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule.Companion::unwrap))
    }

    /**
     * The list of security groups to associate with the canary's network interfaces.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - If the canary is placed within a VPC and a security group is
     * not specified a dedicated security group will be created for this canary.
     *
     * @param securityGroups The list of security groups to associate with the canary's network
     * interfaces. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * The list of security groups to associate with the canary's network interfaces.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - If the canary is placed within a VPC and a security group is
     * not specified a dedicated security group will be created for this canary.
     *
     * @param securityGroups The list of security groups to associate with the canary's network
     * interfaces. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Whether or not the canary should start after creation.
     *
     * Default: true
     *
     * @param startAfterCreation Whether or not the canary should start after creation. 
     */
    override fun startAfterCreation(startAfterCreation: Boolean) {
      cdkBuilder.startAfterCreation(startAfterCreation)
    }

    /**
     * How many days should successful runs be retained.
     *
     * Default: Duration.days(31)
     *
     * @param successRetentionPeriod How many days should successful runs be retained. 
     */
    override fun successRetentionPeriod(successRetentionPeriod: Duration) {
      cdkBuilder.successRetentionPeriod(successRetentionPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * The type of test that you want your canary to run.
     *
     * Use `Test.custom()` to specify the test to run.
     *
     * @param test The type of test that you want your canary to run. 
     */
    override fun test(test: Test) {
      cdkBuilder.test(test.let(Test.Companion::unwrap))
    }

    /**
     * How long the canary will be in a 'RUNNING' state.
     *
     * For example, if you set `timeToLive` to be 1 hour and `schedule` to be `rate(10 minutes)`,
     * your canary will run at 10 minute intervals for an hour, for a total of 6 times.
     *
     * Default: - no limit
     *
     * @param timeToLive How long the canary will be in a 'RUNNING' state. 
     */
    override fun timeToLive(timeToLive: Duration) {
      cdkBuilder.timeToLive(timeToLive.let(Duration.Companion::unwrap))
    }

    /**
     * How long the canary is allowed to run before it must stop.
     *
     * You can't set this time to be longer than the frequency of the runs of this canary.
     *
     * The minimum allowed value is 3 seconds.
     * The maximum allowed value is 840 seconds (14 minutes).
     *
     * Default: - the frequency of the canary is used as this value, up to a maximum of 900 seconds.
     *
     * @param timeout How long the canary is allowed to run before it must stop. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * The VPC where this canary is run.
     *
     * Specify this if the canary needs to access resources in a VPC.
     *
     * Default: - Not in VPC
     *
     * @param vpc The VPC where this canary is run. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * Where to place the network interfaces within the VPC.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where to place the network interfaces within the VPC. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Where to place the network interfaces within the VPC.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Where to place the network interfaces within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea7816fdc9d36fdb22296f345cc70fac642d963ca5449962c72b1b2ad55c7100")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.synthetics.Canary = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.synthetics.Canary.PROPERTY_INJECTION_ID

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Canary {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Canary(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.Canary): Canary =
        Canary(cdkObject)

    internal fun unwrap(wrapped: Canary): software.amazon.awscdk.services.synthetics.Canary =
        wrapped.cdkObject as software.amazon.awscdk.services.synthetics.Canary
  }
}
