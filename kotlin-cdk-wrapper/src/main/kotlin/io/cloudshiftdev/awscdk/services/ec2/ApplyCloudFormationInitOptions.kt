@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Duration
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
   * UserData, so that if the config changes, the UserData changes.
   *
   * * If the EC2 instance is instance-store backed or
   * `userDataCausesReplacement` is set, this will cause the instance to be
   * replaced and the new configuration to be applied.
   * * If the instance is EBS-backed and `userDataCausesReplacement` is not
   * set, the change of UserData will make the instance restart but not be
   * replaced, and the configuration will not be applied automatically.
   *
   * If `false`, no hash will be embedded, and if the CloudFormation Init
   * config changes nothing will happen to the running instance. If a
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
   * Timeout waiting for the configuration to be applied.
   *
   * Default: Duration.minutes(5)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

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
     * UserData, so that if the config changes, the UserData changes.
     *
     * * If the EC2 instance is instance-store backed or
     * `userDataCausesReplacement` is set, this will cause the instance to be
     * replaced and the new configuration to be applied.
     * * If the instance is EBS-backed and `userDataCausesReplacement` is not
     * set, the change of UserData will make the instance restart but not be
     * replaced, and the configuration will not be applied automatically.
     *
     * If `false`, no hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instance. If a
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

    /**
     * @param timeout Timeout waiting for the configuration to be applied.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions.Builder =
        software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions.builder()

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
     * UserData, so that if the config changes, the UserData changes.
     *
     * * If the EC2 instance is instance-store backed or
     * `userDataCausesReplacement` is set, this will cause the instance to be
     * replaced and the new configuration to be applied.
     * * If the instance is EBS-backed and `userDataCausesReplacement` is not
     * set, the change of UserData will make the instance restart but not be
     * replaced, and the configuration will not be applied automatically.
     *
     * If `false`, no hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instance. If a
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

    /**
     * @param timeout Timeout waiting for the configuration to be applied.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions,
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
     * UserData, so that if the config changes, the UserData changes.
     *
     * * If the EC2 instance is instance-store backed or
     * `userDataCausesReplacement` is set, this will cause the instance to be
     * replaced and the new configuration to be applied.
     * * If the instance is EBS-backed and `userDataCausesReplacement` is not
     * set, the change of UserData will make the instance restart but not be
     * replaced, and the configuration will not be applied automatically.
     *
     * If `false`, no hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instance. If a
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

    /**
     * Timeout waiting for the configuration to be applied.
     *
     * Default: Duration.minutes(5)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplyCloudFormationInitOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions):
        ApplyCloudFormationInitOptions = CdkObjectWrappers.wrap(cdkObject) as?
        ApplyCloudFormationInitOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplyCloudFormationInitOptions):
        software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions
  }
}
