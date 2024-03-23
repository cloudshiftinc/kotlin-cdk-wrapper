@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for attaching a CloudFormationInit to a resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CfnResource cfnResource;
 * Role role;
 * UserData userData;
 * AttachInitOptions attachInitOptions = AttachInitOptions.builder()
 * .instanceRole(role)
 * .platform(OperatingSystemType.LINUX)
 * .userData(userData)
 * // the properties below are optional
 * .configSets(List.of("configSets"))
 * .embedFingerprint(false)
 * .ignoreFailures(false)
 * .includeRole(false)
 * .includeUrl(false)
 * .printLog(false)
 * .signalResource(cfnResource)
 * .build();
 * ```
 */
public interface AttachInitOptions {
  /**
   * ConfigSet to activate.
   *
   * Default: ['default']
   */
  public fun configSets(): List<String> = unwrap(this).getConfigSets() ?: emptyList()

  /**
   * Whether to embed a hash into the userData.
   *
   * If `true` (the default), a hash of the config will be embedded into the
   * UserData, so that if the config changes, the UserData changes and
   * the instance will be replaced.
   *
   * If `false`, no such hash will be embedded, and if the CloudFormation Init
   * config changes nothing will happen to the running instance.
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
   * Instance role of the consuming instance or fleet.
   */
  public fun instanceRole(): IRole

  /**
   * OS Platform the init config will be used for.
   */
  public fun platform(): OperatingSystemType

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
   * When provided, signals this resource instead of the attached resource.
   *
   * You can use this to support signaling LaunchTemplate while attaching AutoScalingGroup
   *
   * Default: - if this property is undefined cfn-signal signals the attached resource
   */
  public fun signalResource(): CfnResource? =
      unwrap(this).getSignalResource()?.let(CfnResource::wrap)

  /**
   * UserData to add commands to.
   */
  public fun userData(): UserData

  /**
   * A builder for [AttachInitOptions]
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
     * @param embedFingerprint Whether to embed a hash into the userData.
     * If `true` (the default), a hash of the config will be embedded into the
     * UserData, so that if the config changes, the UserData changes and
     * the instance will be replaced.
     *
     * If `false`, no such hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instance.
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
     * @param instanceRole Instance role of the consuming instance or fleet. 
     */
    public fun instanceRole(instanceRole: IRole)

    /**
     * @param platform OS Platform the init config will be used for. 
     */
    public fun platform(platform: OperatingSystemType)

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
     * @param signalResource When provided, signals this resource instead of the attached resource.
     * You can use this to support signaling LaunchTemplate while attaching AutoScalingGroup
     */
    public fun signalResource(signalResource: CfnResource)

    /**
     * @param userData UserData to add commands to. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AttachInitOptions.Builder =
        software.amazon.awscdk.services.ec2.AttachInitOptions.builder()

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
     * @param embedFingerprint Whether to embed a hash into the userData.
     * If `true` (the default), a hash of the config will be embedded into the
     * UserData, so that if the config changes, the UserData changes and
     * the instance will be replaced.
     *
     * If `false`, no such hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instance.
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
     * @param instanceRole Instance role of the consuming instance or fleet. 
     */
    override fun instanceRole(instanceRole: IRole) {
      cdkBuilder.instanceRole(instanceRole.let(IRole::unwrap))
    }

    /**
     * @param platform OS Platform the init config will be used for. 
     */
    override fun platform(platform: OperatingSystemType) {
      cdkBuilder.platform(platform.let(OperatingSystemType::unwrap))
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
     * @param signalResource When provided, signals this resource instead of the attached resource.
     * You can use this to support signaling LaunchTemplate while attaching AutoScalingGroup
     */
    override fun signalResource(signalResource: CfnResource) {
      cdkBuilder.signalResource(signalResource.let(CfnResource::unwrap))
    }

    /**
     * @param userData UserData to add commands to. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AttachInitOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.AttachInitOptions,
  ) : CdkObject(cdkObject), AttachInitOptions {
    /**
     * ConfigSet to activate.
     *
     * Default: ['default']
     */
    override fun configSets(): List<String> = unwrap(this).getConfigSets() ?: emptyList()

    /**
     * Whether to embed a hash into the userData.
     *
     * If `true` (the default), a hash of the config will be embedded into the
     * UserData, so that if the config changes, the UserData changes and
     * the instance will be replaced.
     *
     * If `false`, no such hash will be embedded, and if the CloudFormation Init
     * config changes nothing will happen to the running instance.
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
     * Instance role of the consuming instance or fleet.
     */
    override fun instanceRole(): IRole = unwrap(this).getInstanceRole().let(IRole::wrap)

    /**
     * OS Platform the init config will be used for.
     */
    override fun platform(): OperatingSystemType =
        unwrap(this).getPlatform().let(OperatingSystemType::wrap)

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
     * When provided, signals this resource instead of the attached resource.
     *
     * You can use this to support signaling LaunchTemplate while attaching AutoScalingGroup
     *
     * Default: - if this property is undefined cfn-signal signals the attached resource
     */
    override fun signalResource(): CfnResource? =
        unwrap(this).getSignalResource()?.let(CfnResource::wrap)

    /**
     * UserData to add commands to.
     */
    override fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AttachInitOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AttachInitOptions):
        AttachInitOptions = CdkObjectWrappers.wrap(cdkObject) as? AttachInitOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AttachInitOptions):
        software.amazon.awscdk.services.ec2.AttachInitOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AttachInitOptions
  }
}
