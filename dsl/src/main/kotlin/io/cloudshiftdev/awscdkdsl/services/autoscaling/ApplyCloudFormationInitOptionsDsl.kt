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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions

/**
 * Options for applying CloudFormation init to an instance or instance group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * ApplyCloudFormationInitOptions applyCloudFormationInitOptions =
 * ApplyCloudFormationInitOptions.builder()
 * .configSets(List.of("configSets"))
 * .embedFingerprint(false)
 * .ignoreFailures(false)
 * .includeRole(false)
 * .includeUrl(false)
 * .printLog(false)
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
     *   the config changes, the UserData changes and instances will be replaced (given an
     *   UpdatePolicy has been configured on the AutoScalingGroup).
     *
     * If `false`, no such hash will be embedded, and if the CloudFormation Init config changes
     * nothing will happen to the running instances. If a config update introduces errors, you will
     * not notice until after the CloudFormation deployment successfully finishes and the next
     * instance fails to launch.
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

    public fun build(): ApplyCloudFormationInitOptions {
        if (_configSets.isNotEmpty()) cdkBuilder.configSets(_configSets)
        return cdkBuilder.build()
    }
}
