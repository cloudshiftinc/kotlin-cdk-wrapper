@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for applying CloudFormation init to an instance or instance group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
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
public interface ApplyCloudFormationInitOptions {
  /**
   * ConfigSet to activate.
   *
   * Default: ['default']
   */
  public fun configSets(): List<String> = unwrap(this).getConfigSets() ?: emptyList()

  /**
   * Force instance replacement by embedding a config fingerprint.
   *
   * If `true` (the default), a hash of the config will be embedded into the
   * UserData, so that if the config changes, the UserData changes and
   * instances will be replaced (given an UpdatePolicy has been configured on
   * the AutoScalingGroup).
   *
   * If `false`, no such hash will be embedded, and if the CloudFormation Init
   * config changes nothing will happen to the running instances. If a
   * config update introduces errors, you will not notice until after the
   * CloudFormation deployment successfully finishes and the next instance
   * fails to launch.
   *
   * Default: true
   */
  public fun embedFingerprint(): Boolean? = unwrap(this).getEmbedFingerprint()

  /**
   * Don't fail the instance creation when cfn-init fails.
   *
   * You can use this to prevent CloudFormation from rolling back when
   * instances fail to start up, to help in debugging.
   *
   * Default: false
   */
  public fun ignoreFailures(): Boolean? = unwrap(this).getIgnoreFailures()

  /**
   * Include --role argument when running cfn-init and cfn-signal commands.
   *
   * This will be the IAM instance profile attached to the EC2 instance
   *
   * Default: false
   */
  public fun includeRole(): Boolean? = unwrap(this).getIncludeRole()

  /**
   * Include --url argument when running cfn-init and cfn-signal commands.
   *
   * This will be the cloudformation endpoint in the deployed region
   * e.g. https://cloudformation.us-east-1.amazonaws.com
   *
   * Default: false
   */
  public fun includeUrl(): Boolean? = unwrap(this).getIncludeUrl()

  /**
   * Print the results of running cfn-init to the Instance System Log.
   *
   * By default, the output of running cfn-init is written to a log file
   * on the instance. Set this to `true` to print it to the System Log
   * (visible from the EC2 Console), `false` to not print it.
   *
   * (Be aware that the system log is refreshed at certain points in
   * time of the instance life cycle, and successful execution may
   * not always show up).
   *
   * Default: true
   */
  public fun printLog(): Boolean? = unwrap(this).getPrintLog()

  /**
   * A builder for [ApplyCloudFormationInitOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configSets ConfigSet to activate.
     */
    public fun configSets(configSets: List<String>)

    /**
     * @param configSets ConfigSet to activate.
     */
    public fun configSets(vararg configSets: String)

    /**
     * @param embedFingerprint Force instance replacement by embedding a config fingerprint.
     * If `true` (the default), a hash of the config will be embedded into the
     * UserData, so that if the config changes, the UserData changes and
     * instances will be replaced (given an UpdatePolicy has been configured on
     * the AutoScalingGroup).
     *
     * If `false`, no such hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instances. If a
     * config update introduces errors, you will not notice until after the
     * CloudFormation deployment successfully finishes and the next instance
     * fails to launch.
     */
    public fun embedFingerprint(embedFingerprint: Boolean)

    /**
     * @param ignoreFailures Don't fail the instance creation when cfn-init fails.
     * You can use this to prevent CloudFormation from rolling back when
     * instances fail to start up, to help in debugging.
     */
    public fun ignoreFailures(ignoreFailures: Boolean)

    /**
     * @param includeRole Include --role argument when running cfn-init and cfn-signal commands.
     * This will be the IAM instance profile attached to the EC2 instance
     */
    public fun includeRole(includeRole: Boolean)

    /**
     * @param includeUrl Include --url argument when running cfn-init and cfn-signal commands.
     * This will be the cloudformation endpoint in the deployed region
     * e.g. https://cloudformation.us-east-1.amazonaws.com
     */
    public fun includeUrl(includeUrl: Boolean)

    /**
     * @param printLog Print the results of running cfn-init to the Instance System Log.
     * By default, the output of running cfn-init is written to a log file
     * on the instance. Set this to `true` to print it to the System Log
     * (visible from the EC2 Console), `false` to not print it.
     *
     * (Be aware that the system log is refreshed at certain points in
     * time of the instance life cycle, and successful execution may
     * not always show up).
     */
    public fun printLog(printLog: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions.Builder =
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions.builder()

    /**
     * @param configSets ConfigSet to activate.
     */
    override fun configSets(configSets: List<String>) {
      cdkBuilder.configSets(configSets)
    }

    /**
     * @param configSets ConfigSet to activate.
     */
    override fun configSets(vararg configSets: String): Unit = configSets(configSets.toList())

    /**
     * @param embedFingerprint Force instance replacement by embedding a config fingerprint.
     * If `true` (the default), a hash of the config will be embedded into the
     * UserData, so that if the config changes, the UserData changes and
     * instances will be replaced (given an UpdatePolicy has been configured on
     * the AutoScalingGroup).
     *
     * If `false`, no such hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instances. If a
     * config update introduces errors, you will not notice until after the
     * CloudFormation deployment successfully finishes and the next instance
     * fails to launch.
     */
    override fun embedFingerprint(embedFingerprint: Boolean) {
      cdkBuilder.embedFingerprint(embedFingerprint)
    }

    /**
     * @param ignoreFailures Don't fail the instance creation when cfn-init fails.
     * You can use this to prevent CloudFormation from rolling back when
     * instances fail to start up, to help in debugging.
     */
    override fun ignoreFailures(ignoreFailures: Boolean) {
      cdkBuilder.ignoreFailures(ignoreFailures)
    }

    /**
     * @param includeRole Include --role argument when running cfn-init and cfn-signal commands.
     * This will be the IAM instance profile attached to the EC2 instance
     */
    override fun includeRole(includeRole: Boolean) {
      cdkBuilder.includeRole(includeRole)
    }

    /**
     * @param includeUrl Include --url argument when running cfn-init and cfn-signal commands.
     * This will be the cloudformation endpoint in the deployed region
     * e.g. https://cloudformation.us-east-1.amazonaws.com
     */
    override fun includeUrl(includeUrl: Boolean) {
      cdkBuilder.includeUrl(includeUrl)
    }

    /**
     * @param printLog Print the results of running cfn-init to the Instance System Log.
     * By default, the output of running cfn-init is written to a log file
     * on the instance. Set this to `true` to print it to the System Log
     * (visible from the EC2 Console), `false` to not print it.
     *
     * (Be aware that the system log is refreshed at certain points in
     * time of the instance life cycle, and successful execution may
     * not always show up).
     */
    override fun printLog(printLog: Boolean) {
      cdkBuilder.printLog(printLog)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions,
  ) : CdkObject(cdkObject), ApplyCloudFormationInitOptions {
    /**
     * ConfigSet to activate.
     *
     * Default: ['default']
     */
    override fun configSets(): List<String> = unwrap(this).getConfigSets() ?: emptyList()

    /**
     * Force instance replacement by embedding a config fingerprint.
     *
     * If `true` (the default), a hash of the config will be embedded into the
     * UserData, so that if the config changes, the UserData changes and
     * instances will be replaced (given an UpdatePolicy has been configured on
     * the AutoScalingGroup).
     *
     * If `false`, no such hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instances. If a
     * config update introduces errors, you will not notice until after the
     * CloudFormation deployment successfully finishes and the next instance
     * fails to launch.
     *
     * Default: true
     */
    override fun embedFingerprint(): Boolean? = unwrap(this).getEmbedFingerprint()

    /**
     * Don't fail the instance creation when cfn-init fails.
     *
     * You can use this to prevent CloudFormation from rolling back when
     * instances fail to start up, to help in debugging.
     *
     * Default: false
     */
    override fun ignoreFailures(): Boolean? = unwrap(this).getIgnoreFailures()

    /**
     * Include --role argument when running cfn-init and cfn-signal commands.
     *
     * This will be the IAM instance profile attached to the EC2 instance
     *
     * Default: false
     */
    override fun includeRole(): Boolean? = unwrap(this).getIncludeRole()

    /**
     * Include --url argument when running cfn-init and cfn-signal commands.
     *
     * This will be the cloudformation endpoint in the deployed region
     * e.g. https://cloudformation.us-east-1.amazonaws.com
     *
     * Default: false
     */
    override fun includeUrl(): Boolean? = unwrap(this).getIncludeUrl()

    /**
     * Print the results of running cfn-init to the Instance System Log.
     *
     * By default, the output of running cfn-init is written to a log file
     * on the instance. Set this to `true` to print it to the System Log
     * (visible from the EC2 Console), `false` to not print it.
     *
     * (Be aware that the system log is refreshed at certain points in
     * time of the instance life cycle, and successful execution may
     * not always show up).
     *
     * Default: true
     */
    override fun printLog(): Boolean? = unwrap(this).getPrintLog()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplyCloudFormationInitOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions):
        ApplyCloudFormationInitOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ApplyCloudFormationInitOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplyCloudFormationInitOptions):
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.ApplyCloudFormationInitOptions
  }
}
