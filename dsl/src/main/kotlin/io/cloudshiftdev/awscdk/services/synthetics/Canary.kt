package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.LifecycleRule
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Canary
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.synthetics.Canary,
) : Resource(cdkObject), IConnectable {
    /** Bucket where data from each canary run is stored. */
    public open fun artifactsBucket(): IBucket =
        unwrap(this).getArtifactsBucket().let(IBucket::wrap)

    /** The canary ID. */
    public open fun canaryId(): String = unwrap(this).getCanaryId()

    /** The canary Name. */
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
        unwrap(this).metricDuration(options.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Measure the Duration of a single canary run, in seconds.
     *
     * Default: avg over 5 minutes
     *
     * @param options * configuration options for the metric.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
        unwrap(this).metricFailed(options.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Measure the number of failed canary runs over a given time period.
     *
     * Default: sum over 5 minutes
     *
     * @param options * configuration options for the metric.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
        unwrap(this).metricSuccessPercent(options.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Measure the percentage of successful canary runs.
     *
     * Default: avg over 5 minutes
     *
     * @param options * configuration options for the metric.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("440514f5588d39cbe9cbdeafe3b15d768d76c9e168f35becb0e0afe0d2b06bfb")
    public open fun metricSuccessPercent(options: MetricOptions.Builder.() -> Unit): Metric =
        metricSuccessPercent(MetricOptions(options))

    /** Execution role associated with this Canary. */
    public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.synthetics.Canary]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Lifecycle rules for the generated canary artifact bucket.
         *
         * Has no effect if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket to
         * `artifactsBucketLocation`, you can add lifecycle rules to the bucket itself.
         *
         * Default: - no rules applied to the generated bucket.
         *
         * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
         *   bucket.
         */
        public fun artifactsBucketLifecycleRules(artifactsBucketLifecycleRules: List<LifecycleRule>)

        /**
         * Lifecycle rules for the generated canary artifact bucket.
         *
         * Has no effect if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket to
         * `artifactsBucketLocation`, you can add lifecycle rules to the bucket itself.
         *
         * Default: - no rules applied to the generated bucket.
         *
         * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
         *   bucket.
         */
        public fun artifactsBucketLifecycleRules(
            vararg artifactsBucketLifecycleRules: LifecycleRule
        )

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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("cba359b9320a239876b8e1a47380fa5d3221f2548b13aaa4c6ee90331bf90fa7")
        public fun artifactsBucketLocation(
            artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit
        )

        /**
         * The name of the canary.
         *
         * Be sure to give it a descriptive name that distinguishes it from other canaries in your
         * account.
         *
         * Do not include secrets or proprietary information in your canary name. The canary name
         * makes up part of the canary ARN, which is included in outbound calls over the internet.
         *
         * Default: - A unique name will be generated from the construct ID
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
         *
         * @param canaryName The name of the canary.
         */
        public fun canaryName(canaryName: String)

        /**
         * Specify the underlying resources to be cleaned up when the canary is deleted.
         *
         * Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
         *
         * Default: Cleanup.NOTHING
         *
         * @param cleanup Specify the underlying resources to be cleaned up when the canary is
         *   deleted.
         */
        public fun cleanup(cleanup: Cleanup)

        /**
         * Key-value pairs that the Synthetics caches and makes available for your canary scripts.
         *
         * Use environment variables to apply configuration changes, such as test and production
         * environment configurations, without changing your Canary script source code.
         *
         * Default: - No environment variables.
         *
         * @param environmentVariables Key-value pairs that the Synthetics caches and makes
         *   available for your canary scripts.
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
         * Canary execution role.
         *
         * This is the role that will be assumed by the canary upon execution. It controls the
         * permissions that the canary will have. The role must be assumable by the AWS Lambda
         * service principal.
         *
         * If not supplied, a role will be created with all the required permissions. If you provide
         * a Role, you must add the required permissions.
         *
         * Default: - A unique role will be generated for this canary. You can add permissions to
         * roles by calling 'addToRolePolicy'.
         *
         * [Documentation](required permissions:
         * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn)
         *
         * @param role Canary execution role.
         */
        public fun role(role: IRole)

        /**
         * Specify the runtime version to use for the canary.
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
         *
         * @param runtime Specify the runtime version to use for the canary.
         */
        public fun runtime(runtime: Runtime)

        /**
         * Specify the schedule for how often the canary runs.
         *
         * For example, if you set `schedule` to `rate(10 minutes)`, then the canary will run every
         * 10 minutes. You can set the schedule with `Schedule.rate(Duration)` (recommended) or you
         * can specify an expression using `Schedule.expression()`.
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
         * Default: - If the canary is placed within a VPC and a security group is not specified a
         * dedicated security group will be created for this canary.
         *
         * @param securityGroups The list of security groups to associate with the canary's network
         *   interfaces.
         */
        public fun securityGroups(securityGroups: List<ISecurityGroup>)

        /**
         * The list of security groups to associate with the canary's network interfaces.
         *
         * You must provide `vpc` when using this prop.
         *
         * Default: - If the canary is placed within a VPC and a security group is not specified a
         * dedicated security group will be created for this canary.
         *
         * @param securityGroups The list of security groups to associate with the canary's network
         *   interfaces.
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
         * For example, if you set `timeToLive` to be 1 hour and `schedule` to be `rate(10
         * minutes)`, your canary will run at 10 minute intervals for an hour, for a total of 6
         * times.
         *
         * Default: - no limit
         *
         * @param timeToLive How long the canary will be in a 'RUNNING' state.
         */
        public fun timeToLive(timeToLive: Duration)

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
        @Suppress("INAPPLICABLE_JVM_NAME")
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
         * Lifecycle rules for the generated canary artifact bucket.
         *
         * Has no effect if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket to
         * `artifactsBucketLocation`, you can add lifecycle rules to the bucket itself.
         *
         * Default: - no rules applied to the generated bucket.
         *
         * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
         *   bucket.
         */
        override fun artifactsBucketLifecycleRules(
            artifactsBucketLifecycleRules: List<LifecycleRule>
        ) {
            cdkBuilder.artifactsBucketLifecycleRules(
                artifactsBucketLifecycleRules.map(LifecycleRule::unwrap)
            )
        }

        /**
         * Lifecycle rules for the generated canary artifact bucket.
         *
         * Has no effect if a bucket is passed to `artifactsBucketLocation`. If you pass a bucket to
         * `artifactsBucketLocation`, you can add lifecycle rules to the bucket itself.
         *
         * Default: - no rules applied to the generated bucket.
         *
         * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
         *   bucket.
         */
        override fun artifactsBucketLifecycleRules(
            vararg artifactsBucketLifecycleRules: LifecycleRule
        ): Unit = artifactsBucketLifecycleRules(artifactsBucketLifecycleRules.toList())

        /**
         * The s3 location that stores the data of the canary runs.
         *
         * Default: - A new s3 bucket will be created without a prefix.
         *
         * @param artifactsBucketLocation The s3 location that stores the data of the canary runs.
         */
        override fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation) {
            cdkBuilder.artifactsBucketLocation(
                artifactsBucketLocation.let(ArtifactsBucketLocation::unwrap)
            )
        }

        /**
         * The s3 location that stores the data of the canary runs.
         *
         * Default: - A new s3 bucket will be created without a prefix.
         *
         * @param artifactsBucketLocation The s3 location that stores the data of the canary runs.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("cba359b9320a239876b8e1a47380fa5d3221f2548b13aaa4c6ee90331bf90fa7")
        override fun artifactsBucketLocation(
            artifactsBucketLocation: ArtifactsBucketLocation.Builder.() -> Unit
        ): Unit = artifactsBucketLocation(ArtifactsBucketLocation(artifactsBucketLocation))

        /**
         * The name of the canary.
         *
         * Be sure to give it a descriptive name that distinguishes it from other canaries in your
         * account.
         *
         * Do not include secrets or proprietary information in your canary name. The canary name
         * makes up part of the canary ARN, which is included in outbound calls over the internet.
         *
         * Default: - A unique name will be generated from the construct ID
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html)
         *
         * @param canaryName The name of the canary.
         */
        override fun canaryName(canaryName: String) {
            cdkBuilder.canaryName(canaryName)
        }

        /**
         * Specify the underlying resources to be cleaned up when the canary is deleted.
         *
         * Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
         *
         * Default: Cleanup.NOTHING
         *
         * @param cleanup Specify the underlying resources to be cleaned up when the canary is
         *   deleted.
         */
        override fun cleanup(cleanup: Cleanup) {
            cdkBuilder.cleanup(cleanup.let(Cleanup::unwrap))
        }

        /**
         * Key-value pairs that the Synthetics caches and makes available for your canary scripts.
         *
         * Use environment variables to apply configuration changes, such as test and production
         * environment configurations, without changing your Canary script source code.
         *
         * Default: - No environment variables.
         *
         * @param environmentVariables Key-value pairs that the Synthetics caches and makes
         *   available for your canary scripts.
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
            cdkBuilder.failureRetentionPeriod(failureRetentionPeriod.let(Duration::unwrap))
        }

        /**
         * Canary execution role.
         *
         * This is the role that will be assumed by the canary upon execution. It controls the
         * permissions that the canary will have. The role must be assumable by the AWS Lambda
         * service principal.
         *
         * If not supplied, a role will be created with all the required permissions. If you provide
         * a Role, you must add the required permissions.
         *
         * Default: - A unique role will be generated for this canary. You can add permissions to
         * roles by calling 'addToRolePolicy'.
         *
         * [Documentation](required permissions:
         * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-synthetics-canary.html#cfn-synthetics-canary-executionrolearn)
         *
         * @param role Canary execution role.
         */
        override fun role(role: IRole) {
            cdkBuilder.role(role.let(IRole::unwrap))
        }

        /**
         * Specify the runtime version to use for the canary.
         *
         * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html)
         *
         * @param runtime Specify the runtime version to use for the canary.
         */
        override fun runtime(runtime: Runtime) {
            cdkBuilder.runtime(runtime.let(Runtime::unwrap))
        }

        /**
         * Specify the schedule for how often the canary runs.
         *
         * For example, if you set `schedule` to `rate(10 minutes)`, then the canary will run every
         * 10 minutes. You can set the schedule with `Schedule.rate(Duration)` (recommended) or you
         * can specify an expression using `Schedule.expression()`.
         *
         * Default: 'rate(5 minutes)'
         *
         * @param schedule Specify the schedule for how often the canary runs.
         */
        override fun schedule(schedule: Schedule) {
            cdkBuilder.schedule(schedule.let(Schedule::unwrap))
        }

        /**
         * The list of security groups to associate with the canary's network interfaces.
         *
         * You must provide `vpc` when using this prop.
         *
         * Default: - If the canary is placed within a VPC and a security group is not specified a
         * dedicated security group will be created for this canary.
         *
         * @param securityGroups The list of security groups to associate with the canary's network
         *   interfaces.
         */
        override fun securityGroups(securityGroups: List<ISecurityGroup>) {
            cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
        }

        /**
         * The list of security groups to associate with the canary's network interfaces.
         *
         * You must provide `vpc` when using this prop.
         *
         * Default: - If the canary is placed within a VPC and a security group is not specified a
         * dedicated security group will be created for this canary.
         *
         * @param securityGroups The list of security groups to associate with the canary's network
         *   interfaces.
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
            cdkBuilder.successRetentionPeriod(successRetentionPeriod.let(Duration::unwrap))
        }

        /**
         * The type of test that you want your canary to run.
         *
         * Use `Test.custom()` to specify the test to run.
         *
         * @param test The type of test that you want your canary to run.
         */
        override fun test(test: Test) {
            cdkBuilder.test(test.let(Test::unwrap))
        }

        /**
         * How long the canary will be in a 'RUNNING' state.
         *
         * For example, if you set `timeToLive` to be 1 hour and `schedule` to be `rate(10
         * minutes)`, your canary will run at 10 minute intervals for an hour, for a total of 6
         * times.
         *
         * Default: - no limit
         *
         * @param timeToLive How long the canary will be in a 'RUNNING' state.
         */
        override fun timeToLive(timeToLive: Duration) {
            cdkBuilder.timeToLive(timeToLive.let(Duration::unwrap))
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
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
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
            cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
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
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ea7816fdc9d36fdb22296f345cc70fac642d963ca5449962c72b1b2ad55c7100")
        override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
            vpcSubnets(SubnetSelection(vpcSubnets))

        public fun build(): software.amazon.awscdk.services.synthetics.Canary = cdkBuilder.build()
    }

    public companion object {
        init {}

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
            wrapped.cdkObject
    }
}
