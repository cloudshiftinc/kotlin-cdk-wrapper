@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import io.cloudshiftdev.awscdkdsl.services.s3.LifecycleRuleDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.s3.LifecycleRule
import software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation
import software.amazon.awscdk.services.synthetics.CanaryProps
import software.amazon.awscdk.services.synthetics.Cleanup
import software.amazon.awscdk.services.synthetics.Runtime
import software.amazon.awscdk.services.synthetics.Schedule
import software.amazon.awscdk.services.synthetics.Test

/**
 * Properties for a canary.
 *
 * Example:
 * ```
 * Canary canary = Canary.Builder.create(this, "MyCanary")
 * .schedule(Schedule.rate(Duration.minutes(5)))
 * .test(Test.custom(CustomTestOptions.builder()
 * .code(Code.fromAsset(join(__dirname, "canary")))
 * .handler("index.handler")
 * .build()))
 * .runtime(Runtime.SYNTHETICS_NODEJS_PUPPETEER_6_2)
 * .environmentVariables(Map.of(
 * "stage", "prod"))
 * .build();
 * ```
 */
@CdkDslMarker
public class CanaryPropsDsl {
    private val cdkBuilder: CanaryProps.Builder = CanaryProps.builder()

    private val _artifactsBucketLifecycleRules: MutableList<LifecycleRule> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     *   bucket. Has no effect if a bucket is passed to `artifactsBucketLocation`. If you pass a
     *   bucket to `artifactsBucketLocation`, you can add lifecycle rules to the bucket itself.
     */
    public fun artifactsBucketLifecycleRules(
        artifactsBucketLifecycleRules: LifecycleRuleDsl.() -> Unit
    ) {
        _artifactsBucketLifecycleRules.add(
            LifecycleRuleDsl().apply(artifactsBucketLifecycleRules).build()
        )
    }

    /**
     * @param artifactsBucketLifecycleRules Lifecycle rules for the generated canary artifact
     *   bucket. Has no effect if a bucket is passed to `artifactsBucketLocation`. If you pass a
     *   bucket to `artifactsBucketLocation`, you can add lifecycle rules to the bucket itself.
     */
    public fun artifactsBucketLifecycleRules(
        artifactsBucketLifecycleRules: Collection<LifecycleRule>
    ) {
        _artifactsBucketLifecycleRules.addAll(artifactsBucketLifecycleRules)
    }

    /** @param artifactsBucketLocation The s3 location that stores the data of the canary runs. */
    public fun artifactsBucketLocation(
        artifactsBucketLocation: ArtifactsBucketLocationDsl.() -> Unit = {}
    ) {
        val builder = ArtifactsBucketLocationDsl()
        builder.apply(artifactsBucketLocation)
        cdkBuilder.artifactsBucketLocation(builder.build())
    }

    /** @param artifactsBucketLocation The s3 location that stores the data of the canary runs. */
    public fun artifactsBucketLocation(artifactsBucketLocation: ArtifactsBucketLocation) {
        cdkBuilder.artifactsBucketLocation(artifactsBucketLocation)
    }

    /**
     * @param canaryName The name of the canary. Be sure to give it a descriptive name that
     *   distinguishes it from other canaries in your account.
     *
     * Do not include secrets or proprietary information in your canary name. The canary name makes
     * up part of the canary ARN, which is included in outbound calls over the internet.
     */
    public fun canaryName(canaryName: String) {
        cdkBuilder.canaryName(canaryName)
    }

    /**
     * @param cleanup Specify the underlying resources to be cleaned up when the canary is deleted.
     *   Using `Cleanup.LAMBDA` will create a Custom Resource to achieve this.
     */
    public fun cleanup(cleanup: Cleanup) {
        cdkBuilder.cleanup(cleanup)
    }

    /**
     * @param environmentVariables Key-value pairs that the Synthetics caches and makes available
     *   for your canary scripts. Use environment variables to apply configuration changes, such as
     *   test and production environment configurations, without changing your Canary script source
     *   code.
     */
    public fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /** @param failureRetentionPeriod How many days should failed runs be retained. */
    public fun failureRetentionPeriod(failureRetentionPeriod: Duration) {
        cdkBuilder.failureRetentionPeriod(failureRetentionPeriod)
    }

    /**
     * @param role Canary execution role. This is the role that will be assumed by the canary upon
     *   execution. It controls the permissions that the canary will have. The role must be
     *   assumable by the AWS Lambda service principal.
     *
     * If not supplied, a role will be created with all the required permissions. If you provide a
     * Role, you must add the required permissions.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /** @param runtime Specify the runtime version to use for the canary. */
    public fun runtime(runtime: Runtime) {
        cdkBuilder.runtime(runtime)
    }

    /**
     * @param schedule Specify the schedule for how often the canary runs. For example, if you set
     *   `schedule` to `rate(10 minutes)`, then the canary will run every 10 minutes. You can set
     *   the schedule with `Schedule.rate(Duration)` (recommended) or you can specify an expression
     *   using `Schedule.expression()`.
     */
    public fun schedule(schedule: Schedule) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * @param securityGroups The list of security groups to associate with the canary's network
     *   interfaces. You must provide `vpc` when using this prop.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The list of security groups to associate with the canary's network
     *   interfaces. You must provide `vpc` when using this prop.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param startAfterCreation Whether or not the canary should start after creation. */
    public fun startAfterCreation(startAfterCreation: Boolean) {
        cdkBuilder.startAfterCreation(startAfterCreation)
    }

    /** @param successRetentionPeriod How many days should successful runs be retained. */
    public fun successRetentionPeriod(successRetentionPeriod: Duration) {
        cdkBuilder.successRetentionPeriod(successRetentionPeriod)
    }

    /**
     * @param test The type of test that you want your canary to run. Use `Test.custom()` to specify
     *   the test to run.
     */
    public fun test(test: Test) {
        cdkBuilder.test(test)
    }

    /**
     * @param timeToLive How long the canary will be in a 'RUNNING' state. For example, if you set
     *   `timeToLive` to be 1 hour and `schedule` to be `rate(10 minutes)`, your canary will run at
     *   10 minute intervals for an hour, for a total of 6 times.
     */
    public fun timeToLive(timeToLive: Duration) {
        cdkBuilder.timeToLive(timeToLive)
    }

    /**
     * @param vpc The VPC where this canary is run. Specify this if the canary needs to access
     *   resources in a VPC.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC. You must provide
     *   `vpc` when using this prop.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * @param vpcSubnets Where to place the network interfaces within the VPC. You must provide
     *   `vpc` when using this prop.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): CanaryProps {
        if (_artifactsBucketLifecycleRules.isNotEmpty())
            cdkBuilder.artifactsBucketLifecycleRules(_artifactsBucketLifecycleRules)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
