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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions

/**
 * Options for applying CloudFormation init to an instance or instance group.
 *
 * Example:
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // Showing the most complex setup, if you have simpler requirements
 * // you can use `CloudFormationInit.fromElements()`.
 * .init(CloudFormationInit.fromConfigSets(ConfigSetProps.builder()
 * .configSets(Map.of(
 * // Applies the configs below in this order
 * "default", List.of("yumPreinstall", "config")))
 * .configs(Map.of(
 * "yumPreinstall", new InitConfig(List.of(InitPackage.yum("git"))),
 * "config", new InitConfig(List.of(InitFile.fromObject("/etc/stack.json", Map.of(
 * "stackId", Stack.of(this).getStackId(),
 * "stackName", Stack.of(this).getStackName(),
 * "region", Stack.of(this).getRegion())), InitGroup.fromName("my-group"),
 * InitUser.fromName("my-user"),
 * InitPackage.rpm("http://mirrors.ukfast.co.uk/sites/dl.fedoraproject.org/pub/epel/8/Everything/x86_64/Packages/r/rubygem-git-1.5.0-2.el8.noarch.rpm")))))
 * .build()))
 * .initOptions(ApplyCloudFormationInitOptions.builder()
 * // Optional, which configsets to activate (['default'] by default)
 * .configSets(List.of("default"))
 * // Optional, how long the installation is expected to take (5 minutes by default)
 * .timeout(Duration.minutes(30))
 * // Optional, whether to include the --url argument when running cfn-init and cfn-signal commands
 * (false by default)
 * .includeUrl(true)
 * // Optional, whether to include the --role argument when running cfn-init and cfn-signal commands
 * (false by default)
 * .includeRole(true)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplyCloudFormationInitOptionsDsl {
    private val cdkBuilder: ApplyCloudFormationInitOptions.Builder =
        ApplyCloudFormationInitOptions.builder()

    private val _configSets: MutableList<String> = mutableListOf()

    /** @param configSets ConfigSet to activate. */
    public fun configSets(vararg configSets: String) {
        _configSets.addAll(listOf(*configSets))
    }

    /** @param configSets ConfigSet to activate. */
    public fun configSets(configSets: Collection<String>) {
        _configSets.addAll(configSets)
    }

    /**
     * @param embedFingerprint Force instance replacement by embedding a config fingerprint. If
     *   `true` (the default), a hash of the config will be embedded into the UserData, so that if
     *   the config changes, the UserData changes.
     * * If the EC2 instance is instance-store backed or `userDataCausesReplacement` is set, this
     *   will cause the instance to be replaced and the new configuration to be applied.
     * * If the instance is EBS-backed and `userDataCausesReplacement` is not set, the change of
     *   UserData will make the instance restart but not be replaced, and the configuration will not
     *   be applied automatically.
     *
     * If `false`, no hash will be embedded, and if the CloudFormation Init config changes nothing
     * will happen to the running instance. If a config update introduces errors, you will not
     * notice until after the CloudFormation deployment successfully finishes and the next instance
     * fails to launch.
     */
    public fun embedFingerprint(embedFingerprint: Boolean) {
        cdkBuilder.embedFingerprint(embedFingerprint)
    }

    /**
     * @param ignoreFailures Don't fail the instance creation when cfn-init fails. You can use this
     *   to prevent CloudFormation from rolling back when instances fail to start up, to help in
     *   debugging.
     */
    public fun ignoreFailures(ignoreFailures: Boolean) {
        cdkBuilder.ignoreFailures(ignoreFailures)
    }

    /**
     * @param includeRole Include --role argument when running cfn-init and cfn-signal commands.
     *   This will be the IAM instance profile attached to the EC2 instance
     */
    public fun includeRole(includeRole: Boolean) {
        cdkBuilder.includeRole(includeRole)
    }

    /**
     * @param includeUrl Include --url argument when running cfn-init and cfn-signal commands. This
     *   will be the cloudformation endpoint in the deployed region e.g.
     *   https://cloudformation.us-east-1.amazonaws.com
     */
    public fun includeUrl(includeUrl: Boolean) {
        cdkBuilder.includeUrl(includeUrl)
    }

    /**
     * @param printLog Print the results of running cfn-init to the Instance System Log. By default,
     *   the output of running cfn-init is written to a log file on the instance. Set this to `true`
     *   to print it to the System Log (visible from the EC2 Console), `false` to not print it.
     *
     * (Be aware that the system log is refreshed at certain points in time of the instance life
     * cycle, and successful execution may not always show up).
     */
    public fun printLog(printLog: Boolean) {
        cdkBuilder.printLog(printLog)
    }

    /** @param timeout Timeout waiting for the configuration to be applied. */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): ApplyCloudFormationInitOptions {
        if (_configSets.isNotEmpty()) cdkBuilder.configSets(_configSets)
        return cdkBuilder.build()
    }
}
