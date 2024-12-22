@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.LifecycleRule
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for a canary.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * Canary canary = Canary.Builder.create(this, "MyCanary")
 * .schedule(Schedule.rate(Duration.minutes(5)))
 * .test(Test.custom(CustomTestOptions.builder()
 * .code(Code.fromAsset(join(__dirname, "canary")))
 * .handler("index.handler")
 * .build()))
 * .runtime(Runtime.SYNTHETICS_NODEJS_PUPPETEER_6_2)
 * .memory(Size.mebibytes(1024))
 * .build();
 * ```
 */
public interface CanaryProps {
  /**
   * Specifies whether this canary is to use active AWS X-Ray tracing when it runs.
   *
   * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
   * maps even if the
   * canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray tracing incurs
   * charges.
   *
   * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later for
   * their canary runtime.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html)
   */
  public fun activeTracing(): Boolean? = unwrap(this).getActiveTracing()

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
   */
  public fun artifactS3EncryptionMode(): ArtifactsEncryptionMode? =
      unwrap(this).getArtifactS3EncryptionMode()?.let(ArtifactsEncryptionMode::wrap)

  /**
   * The KMS key used to encrypt canary artifacts.
   *
   * Default: - no kms key if `artifactS3EncryptionMode` is set to `S3_MANAGED`. A key will be
   * created if one is not provided and `artifactS3EncryptionMode` is set to `KMS`.
   */
  public fun artifactS3KmsKey(): IKey? = unwrap(this).getArtifactS3KmsKey()?.let(IKey::wrap)

  /**
   * Lifecycle rules for the generated canary artifact bucket.
   *
   * Has no effect
   * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
   * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
   * itself.
   *
   * Default: - no rules applied to the generated bucket.
   */
  public fun artifactsBucketLifecycleRules(): List<LifecycleRule> =
      unwrap(this).getArtifactsBucketLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

  /**
   * The s3 location that stores the data of the canary runs.
   *
   * Default: - A new s3 bucket will be created without a prefix.
   */
  public fun artifactsBucketLocation(): ArtifactsBucketLocation? =
      unwrap(this).getArtifactsBucketLocation()?.let(ArtifactsBucketLocation::wrap)

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
   */
  public fun canaryName(): String? = unwrap(this).getCanaryName()

  /**
   * Specify the underlying resources to be cleaned up when the canary is deleted.
   *
   * Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
   *
   * Default: Cleanup.NOTHING
   */
  public fun cleanup(): Cleanup? = unwrap(this).getCleanup()?.let(Cleanup::wrap)

  /**
   * Key-value pairs that the Synthetics caches and makes available for your canary scripts.
   *
   * Use environment variables
   * to apply configuration changes, such as test and production environment configurations, without
   * changing your
   * Canary script source code.
   *
   * Default: - No environment variables.
   */
  public fun environmentVariables(): Map<String, String> = unwrap(this).getEnvironmentVariables() ?:
      emptyMap()

  /**
   * How many days should failed runs be retained.
   *
   * Default: Duration.days(31)
   */
  public fun failureRetentionPeriod(): Duration? =
      unwrap(this).getFailureRetentionPeriod()?.let(Duration::wrap)

  /**
   * The maximum amount of memory that the canary can use while running.
   *
   * This value must be a multiple of 64 Mib.
   * The range is 960 MiB to 3008 MiB.
   *
   * Default: Size.mebibytes(1024)
   */
  public fun memory(): Size? = unwrap(this).getMemory()?.let(Size::wrap)

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
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Specify the runtime version to use for the canary.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
   */
  public fun runtime(): Runtime

  /**
   * Specify the schedule for how often the canary runs.
   *
   * For example, if you set `schedule` to `rate(10 minutes)`, then the canary will run every 10
   * minutes.
   * You can set the schedule with `Schedule.rate(Duration)` (recommended) or you can specify an
   * expression using `Schedule.expression()`.
   *
   * Default: 'rate(5 minutes)'
   */
  public fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

  /**
   * The list of security groups to associate with the canary's network interfaces.
   *
   * You must provide `vpc` when using this prop.
   *
   * Default: - If the canary is placed within a VPC and a security group is
   * not specified a dedicated security group will be created for this canary.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Whether or not the canary should start after creation.
   *
   * Default: true
   */
  public fun startAfterCreation(): Boolean? = unwrap(this).getStartAfterCreation()

  /**
   * How many days should successful runs be retained.
   *
   * Default: Duration.days(31)
   */
  public fun successRetentionPeriod(): Duration? =
      unwrap(this).getSuccessRetentionPeriod()?.let(Duration::wrap)

  /**
   * The type of test that you want your canary to run.
   *
   * Use `Test.custom()` to specify the test to run.
   */
  public fun test(): Test

  /**
   * How long the canary will be in a 'RUNNING' state.
   *
   * For example, if you set `timeToLive` to be 1 hour and `schedule` to be `rate(10 minutes)`,
   * your canary will run at 10 minute intervals for an hour, for a total of 6 times.
   *
   * Default: - no limit
   */
  public fun timeToLive(): Duration? = unwrap(this).getTimeToLive()?.let(Duration::wrap)

  /**
   * How long the canary is allowed to run before it must stop.
   *
   * You can't set this time to be longer than the frequency of the runs of this canary.
   *
   * The minimum allowed value is 3 seconds.
   * The maximum allowed value is 840 seconds (14 minutes).
   *
   * Default: - the frequency of the canary is used as this value, up to a maximum of 900 seconds.
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * The VPC where this canary is run.
   *
   * Specify this if the canary needs to access resources in a VPC.
   *
   * Default: - Not in VPC
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * Where to place the network interfaces within the VPC.
   *
   * You must provide `vpc` when using this prop.
   *
   * Default: - the Vpc default strategy if not specified
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [CanaryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when it
     * runs.
     * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
     * maps even if the
     * canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray tracing incurs
     * charges.
     *
     * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
     * for their canary runtime.
     */
    public fun activeTracing(activeTracing: Boolean)

    /**
     * @param artifactS3EncryptionMode Canary Artifacts in S3 encryption mode.
     * Artifact encryption is only supported for canaries that use Synthetics runtime
     * version `syn-nodejs-puppeteer-3.3` or later.
     */
    public fun artifactS3EncryptionMode(artifactS3EncryptionMode: ArtifactsEncryptionMode)

    /**
     * @param artifactS3KmsKey The KMS key used to encrypt canary artifacts.
     */
    public fun artifactS3KmsKey(artifactS3KmsKey: IKey)

    /**
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     * bucket.
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     */
    public fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>)

    /**
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     * bucket.
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     */
    public fun artifactsBucketLifecycleRules(vararg artifactsBucketLifecycleRules: LifecycleRule)

    /**
     * @param artifactsBucketLocation The s3 location that stores the data of the canary runs.
     */
    public fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation)

    /**
     * @param artifactsBucketLocation The s3 location that stores the data of the canary runs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99d5fbdde3a8e2c0e8c1d8a8dced4d7d42b93266ffd1c5647e159d53a8fa151c")
    public
        fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit)

    /**
     * @param canaryName The name of the canary.
     * Be sure to give it a descriptive name that distinguishes it from
     * other canaries in your account.
     *
     * Do not include secrets or proprietary information in your canary name. The canary name
     * makes up part of the canary ARN, which is included in outbound calls over the internet.
     */
    public fun canaryName(canaryName: String)

    /**
     * @param cleanup Specify the underlying resources to be cleaned up when the canary is deleted.
     * Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
     */
    public fun cleanup(cleanup: Cleanup)

    /**
     * @param environmentVariables Key-value pairs that the Synthetics caches and makes available
     * for your canary scripts.
     * Use environment variables
     * to apply configuration changes, such as test and production environment configurations,
     * without changing your
     * Canary script source code.
     */
    public fun environmentVariables(environmentVariables: Map<String, String>)

    /**
     * @param failureRetentionPeriod How many days should failed runs be retained.
     */
    public fun failureRetentionPeriod(failureRetentionPeriod: Duration)

    /**
     * @param memory The maximum amount of memory that the canary can use while running.
     * This value must be a multiple of 64 Mib.
     * The range is 960 MiB to 3008 MiB.
     */
    public fun memory(memory: Size)

    /**
     * @param role Canary execution role.
     * This is the role that will be assumed by the canary upon execution.
     * It controls the permissions that the canary will have. The role must
     * be assumable by the AWS Lambda service principal.
     *
     * If not supplied, a role will be created with all the required permissions.
     * If you provide a Role, you must add the required permissions.
     */
    public fun role(role: IRole)

    /**
     * @param runtime Specify the runtime version to use for the canary. 
     */
    public fun runtime(runtime: Runtime)

    /**
     * @param schedule Specify the schedule for how often the canary runs.
     * For example, if you set `schedule` to `rate(10 minutes)`, then the canary will run every 10
     * minutes.
     * You can set the schedule with `Schedule.rate(Duration)` (recommended) or you can specify an
     * expression using `Schedule.expression()`.
     */
    public fun schedule(schedule: Schedule)

    /**
     * @param securityGroups The list of security groups to associate with the canary's network
     * interfaces.
     * You must provide `vpc` when using this prop.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The list of security groups to associate with the canary's network
     * interfaces.
     * You must provide `vpc` when using this prop.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param startAfterCreation Whether or not the canary should start after creation.
     */
    public fun startAfterCreation(startAfterCreation: Boolean)

    /**
     * @param successRetentionPeriod How many days should successful runs be retained.
     */
    public fun successRetentionPeriod(successRetentionPeriod: Duration)

    /**
     * @param test The type of test that you want your canary to run. 
     * Use `Test.custom()` to specify the test to run.
     */
    public fun test(test: Test)

    /**
     * @param timeToLive How long the canary will be in a 'RUNNING' state.
     * For example, if you set `timeToLive` to be 1 hour and `schedule` to be `rate(10 minutes)`,
     * your canary will run at 10 minute intervals for an hour, for a total of 6 times.
     */
    public fun timeToLive(timeToLive: Duration)

    /**
     * @param timeout How long the canary is allowed to run before it must stop.
     * You can't set this time to be longer than the frequency of the runs of this canary.
     *
     * The minimum allowed value is 3 seconds.
     * The maximum allowed value is 840 seconds (14 minutes).
     */
    public fun timeout(timeout: Duration)

    /**
     * @param vpc The VPC where this canary is run.
     * Specify this if the canary needs to access resources in a VPC.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC.
     * You must provide `vpc` when using this prop.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC.
     * You must provide `vpc` when using this prop.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5103fac4d1992618bf2bdae41546ad3f07047fcc9cc33f44af40a0a5fd9ac373")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.synthetics.CanaryProps.Builder =
        software.amazon.awscdk.services.synthetics.CanaryProps.builder()

    /**
     * @param activeTracing Specifies whether this canary is to use active AWS X-Ray tracing when it
     * runs.
     * Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service
     * maps even if the
     * canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray tracing incurs
     * charges.
     *
     * You can enable active tracing only for canaries that use version `syn-nodejs-2.0` or later
     * for their canary runtime.
     */
    override fun activeTracing(activeTracing: Boolean) {
      cdkBuilder.activeTracing(activeTracing)
    }

    /**
     * @param artifactS3EncryptionMode Canary Artifacts in S3 encryption mode.
     * Artifact encryption is only supported for canaries that use Synthetics runtime
     * version `syn-nodejs-puppeteer-3.3` or later.
     */
    override fun artifactS3EncryptionMode(artifactS3EncryptionMode: ArtifactsEncryptionMode) {
      cdkBuilder.artifactS3EncryptionMode(artifactS3EncryptionMode.let(ArtifactsEncryptionMode.Companion::unwrap))
    }

    /**
     * @param artifactS3KmsKey The KMS key used to encrypt canary artifacts.
     */
    override fun artifactS3KmsKey(artifactS3KmsKey: IKey) {
      cdkBuilder.artifactS3KmsKey(artifactS3KmsKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     * bucket.
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     */
    override fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>) {
      cdkBuilder.artifactsBucketLifecycleRules(artifactsBucketLifecycleRules.map(LifecycleRule.Companion::unwrap))
    }

    /**
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     * bucket.
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     */
    override fun artifactsBucketLifecycleRules(vararg artifactsBucketLifecycleRules: LifecycleRule):
        Unit = artifactsBucketLifecycleRules(artifactsBucketLifecycleRules.toList())

    /**
     * @param artifactsBucketLocation The s3 location that stores the data of the canary runs.
     */
    override fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation) {
      cdkBuilder.artifactsBucketLocation(artifactsBucketLocation.let(ArtifactsBucketLocation.Companion::unwrap))
    }

    /**
     * @param artifactsBucketLocation The s3 location that stores the data of the canary runs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99d5fbdde3a8e2c0e8c1d8a8dced4d7d42b93266ffd1c5647e159d53a8fa151c")
    override
        fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit):
        Unit = artifactsBucketLocation(ArtifactsBucketLocation(artifactsBucketLocation))

    /**
     * @param canaryName The name of the canary.
     * Be sure to give it a descriptive name that distinguishes it from
     * other canaries in your account.
     *
     * Do not include secrets or proprietary information in your canary name. The canary name
     * makes up part of the canary ARN, which is included in outbound calls over the internet.
     */
    override fun canaryName(canaryName: String) {
      cdkBuilder.canaryName(canaryName)
    }

    /**
     * @param cleanup Specify the underlying resources to be cleaned up when the canary is deleted.
     * Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
     */
    override fun cleanup(cleanup: Cleanup) {
      cdkBuilder.cleanup(cleanup.let(Cleanup.Companion::unwrap))
    }

    /**
     * @param environmentVariables Key-value pairs that the Synthetics caches and makes available
     * for your canary scripts.
     * Use environment variables
     * to apply configuration changes, such as test and production environment configurations,
     * without changing your
     * Canary script source code.
     */
    override fun environmentVariables(environmentVariables: Map<String, String>) {
      cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param failureRetentionPeriod How many days should failed runs be retained.
     */
    override fun failureRetentionPeriod(failureRetentionPeriod: Duration) {
      cdkBuilder.failureRetentionPeriod(failureRetentionPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * @param memory The maximum amount of memory that the canary can use while running.
     * This value must be a multiple of 64 Mib.
     * The range is 960 MiB to 3008 MiB.
     */
    override fun memory(memory: Size) {
      cdkBuilder.memory(memory.let(Size.Companion::unwrap))
    }

    /**
     * @param role Canary execution role.
     * This is the role that will be assumed by the canary upon execution.
     * It controls the permissions that the canary will have. The role must
     * be assumable by the AWS Lambda service principal.
     *
     * If not supplied, a role will be created with all the required permissions.
     * If you provide a Role, you must add the required permissions.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runtime Specify the runtime version to use for the canary. 
     */
    override fun runtime(runtime: Runtime) {
      cdkBuilder.runtime(runtime.let(Runtime.Companion::unwrap))
    }

    /**
     * @param schedule Specify the schedule for how often the canary runs.
     * For example, if you set `schedule` to `rate(10 minutes)`, then the canary will run every 10
     * minutes.
     * You can set the schedule with `Schedule.rate(Duration)` (recommended) or you can specify an
     * expression using `Schedule.expression()`.
     */
    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule.Companion::unwrap))
    }

    /**
     * @param securityGroups The list of security groups to associate with the canary's network
     * interfaces.
     * You must provide `vpc` when using this prop.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups The list of security groups to associate with the canary's network
     * interfaces.
     * You must provide `vpc` when using this prop.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param startAfterCreation Whether or not the canary should start after creation.
     */
    override fun startAfterCreation(startAfterCreation: Boolean) {
      cdkBuilder.startAfterCreation(startAfterCreation)
    }

    /**
     * @param successRetentionPeriod How many days should successful runs be retained.
     */
    override fun successRetentionPeriod(successRetentionPeriod: Duration) {
      cdkBuilder.successRetentionPeriod(successRetentionPeriod.let(Duration.Companion::unwrap))
    }

    /**
     * @param test The type of test that you want your canary to run. 
     * Use `Test.custom()` to specify the test to run.
     */
    override fun test(test: Test) {
      cdkBuilder.test(test.let(Test.Companion::unwrap))
    }

    /**
     * @param timeToLive How long the canary will be in a 'RUNNING' state.
     * For example, if you set `timeToLive` to be 1 hour and `schedule` to be `rate(10 minutes)`,
     * your canary will run at 10 minute intervals for an hour, for a total of 6 times.
     */
    override fun timeToLive(timeToLive: Duration) {
      cdkBuilder.timeToLive(timeToLive.let(Duration.Companion::unwrap))
    }

    /**
     * @param timeout How long the canary is allowed to run before it must stop.
     * You can't set this time to be longer than the frequency of the runs of this canary.
     *
     * The minimum allowed value is 3 seconds.
     * The maximum allowed value is 840 seconds (14 minutes).
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param vpc The VPC where this canary is run.
     * Specify this if the canary needs to access resources in a VPC.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC.
     * You must provide `vpc` when using this prop.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC.
     * You must provide `vpc` when using this prop.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5103fac4d1992618bf2bdae41546ad3f07047fcc9cc33f44af40a0a5fd9ac373")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.synthetics.CanaryProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.synthetics.CanaryProps,
  ) : CdkObject(cdkObject),
      CanaryProps {
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
     */
    override fun activeTracing(): Boolean? = unwrap(this).getActiveTracing()

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
     */
    override fun artifactS3EncryptionMode(): ArtifactsEncryptionMode? =
        unwrap(this).getArtifactS3EncryptionMode()?.let(ArtifactsEncryptionMode::wrap)

    /**
     * The KMS key used to encrypt canary artifacts.
     *
     * Default: - no kms key if `artifactS3EncryptionMode` is set to `S3_MANAGED`. A key will be
     * created if one is not provided and `artifactS3EncryptionMode` is set to `KMS`.
     */
    override fun artifactS3KmsKey(): IKey? = unwrap(this).getArtifactS3KmsKey()?.let(IKey::wrap)

    /**
     * Lifecycle rules for the generated canary artifact bucket.
     *
     * Has no effect
     * if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket
     * to `artifactsBucketLocation`, you can add lifecycle rules to the bucket
     * itself.
     *
     * Default: - no rules applied to the generated bucket.
     */
    override fun artifactsBucketLifecycleRules(): List<LifecycleRule> =
        unwrap(this).getArtifactsBucketLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

    /**
     * The s3 location that stores the data of the canary runs.
     *
     * Default: - A new s3 bucket will be created without a prefix.
     */
    override fun artifactsBucketLocation(): ArtifactsBucketLocation? =
        unwrap(this).getArtifactsBucketLocation()?.let(ArtifactsBucketLocation::wrap)

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
     */
    override fun canaryName(): String? = unwrap(this).getCanaryName()

    /**
     * Specify the underlying resources to be cleaned up when the canary is deleted.
     *
     * Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
     *
     * Default: Cleanup.NOTHING
     */
    override fun cleanup(): Cleanup? = unwrap(this).getCleanup()?.let(Cleanup::wrap)

    /**
     * Key-value pairs that the Synthetics caches and makes available for your canary scripts.
     *
     * Use environment variables
     * to apply configuration changes, such as test and production environment configurations,
     * without changing your
     * Canary script source code.
     *
     * Default: - No environment variables.
     */
    override fun environmentVariables(): Map<String, String> =
        unwrap(this).getEnvironmentVariables() ?: emptyMap()

    /**
     * How many days should failed runs be retained.
     *
     * Default: Duration.days(31)
     */
    override fun failureRetentionPeriod(): Duration? =
        unwrap(this).getFailureRetentionPeriod()?.let(Duration::wrap)

    /**
     * The maximum amount of memory that the canary can use while running.
     *
     * This value must be a multiple of 64 Mib.
     * The range is 960 MiB to 3008 MiB.
     *
     * Default: Size.mebibytes(1024)
     */
    override fun memory(): Size? = unwrap(this).getMemory()?.let(Size::wrap)

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
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Specify the runtime version to use for the canary.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
     */
    override fun runtime(): Runtime = unwrap(this).getRuntime().let(Runtime::wrap)

    /**
     * Specify the schedule for how often the canary runs.
     *
     * For example, if you set `schedule` to `rate(10 minutes)`, then the canary will run every 10
     * minutes.
     * You can set the schedule with `Schedule.rate(Duration)` (recommended) or you can specify an
     * expression using `Schedule.expression()`.
     *
     * Default: 'rate(5 minutes)'
     */
    override fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

    /**
     * The list of security groups to associate with the canary's network interfaces.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - If the canary is placed within a VPC and a security group is
     * not specified a dedicated security group will be created for this canary.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Whether or not the canary should start after creation.
     *
     * Default: true
     */
    override fun startAfterCreation(): Boolean? = unwrap(this).getStartAfterCreation()

    /**
     * How many days should successful runs be retained.
     *
     * Default: Duration.days(31)
     */
    override fun successRetentionPeriod(): Duration? =
        unwrap(this).getSuccessRetentionPeriod()?.let(Duration::wrap)

    /**
     * The type of test that you want your canary to run.
     *
     * Use `Test.custom()` to specify the test to run.
     */
    override fun test(): Test = unwrap(this).getTest().let(Test::wrap)

    /**
     * How long the canary will be in a 'RUNNING' state.
     *
     * For example, if you set `timeToLive` to be 1 hour and `schedule` to be `rate(10 minutes)`,
     * your canary will run at 10 minute intervals for an hour, for a total of 6 times.
     *
     * Default: - no limit
     */
    override fun timeToLive(): Duration? = unwrap(this).getTimeToLive()?.let(Duration::wrap)

    /**
     * How long the canary is allowed to run before it must stop.
     *
     * You can't set this time to be longer than the frequency of the runs of this canary.
     *
     * The minimum allowed value is 3 seconds.
     * The maximum allowed value is 840 seconds (14 minutes).
     *
     * Default: - the frequency of the canary is used as this value, up to a maximum of 900 seconds.
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The VPC where this canary is run.
     *
     * Specify this if the canary needs to access resources in a VPC.
     *
     * Default: - Not in VPC
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Where to place the network interfaces within the VPC.
     *
     * You must provide `vpc` when using this prop.
     *
     * Default: - the Vpc default strategy if not specified
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CanaryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.CanaryProps):
        CanaryProps = CdkObjectWrappers.wrap(cdkObject) as? CanaryProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CanaryProps):
        software.amazon.awscdk.services.synthetics.CanaryProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.synthetics.CanaryProps
  }
}
