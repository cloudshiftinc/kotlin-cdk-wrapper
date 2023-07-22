@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.services.ec2.AttachInitOptions
import software.amazon.awscdk.services.ec2.OperatingSystemType
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.iam.IRole

/**
 * Options for attaching a CloudFormationInit to a resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.iam.*;
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
@CdkDslMarker
public class AttachInitOptionsDsl {
  private val cdkBuilder: AttachInitOptions.Builder = AttachInitOptions.builder()

  private val _configSets: MutableList<String> = mutableListOf()

  /**
   * @param configSets ConfigSet to activate.
   */
  public fun configSets(vararg configSets: String) {
    _configSets.addAll(listOf(*configSets))
  }

  /**
   * @param configSets ConfigSet to activate.
   */
  public fun configSets(configSets: Collection<String>) {
    _configSets.addAll(configSets)
  }

  /**
   * @param embedFingerprint Whether to embed a hash into the userData.
   * If `true` (the default), a hash of the config will be embedded into the
   * UserData, so that if the config changes, the UserData changes and
   * the instance will be replaced.
   *
   * If `false`, no such hash will be embedded, and if the CloudFormation Init
   * config changes nothing will happen to the running instance.
   */
  public fun embedFingerprint(embedFingerprint: Boolean) {
    cdkBuilder.embedFingerprint(embedFingerprint)
  }

  /**
   * @param ignoreFailures Don't fail the instance creation when cfn-init fails.
   * You can use this to prevent CloudFormation from rolling back when
   * instances fail to start up, to help in debugging.
   */
  public fun ignoreFailures(ignoreFailures: Boolean) {
    cdkBuilder.ignoreFailures(ignoreFailures)
  }

  /**
   * @param includeRole Include --role argument when running cfn-init and cfn-signal commands.
   * This will be the IAM instance profile attached to the EC2 instance
   */
  public fun includeRole(includeRole: Boolean) {
    cdkBuilder.includeRole(includeRole)
  }

  /**
   * @param includeUrl Include --url argument when running cfn-init and cfn-signal commands.
   * This will be the cloudformation endpoint in the deployed region
   * e.g. https://cloudformation.us-east-1.amazonaws.com
   */
  public fun includeUrl(includeUrl: Boolean) {
    cdkBuilder.includeUrl(includeUrl)
  }

  /**
   * @param instanceRole Instance role of the consuming instance or fleet. 
   */
  public fun instanceRole(instanceRole: IRole) {
    cdkBuilder.instanceRole(instanceRole)
  }

  /**
   * @param platform OS Platform the init config will be used for. 
   */
  public fun platform(platform: OperatingSystemType) {
    cdkBuilder.platform(platform)
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
  public fun printLog(printLog: Boolean) {
    cdkBuilder.printLog(printLog)
  }

  /**
   * @param signalResource When provided, signals this resource instead of the attached resource.
   * You can use this to support signaling LaunchTemplate while attaching AutoScalingGroup
   */
  public fun signalResource(signalResource: CfnResource) {
    cdkBuilder.signalResource(signalResource)
  }

  /**
   * @param userData UserData to add commands to. 
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun build(): AttachInitOptions {
    if(_configSets.isNotEmpty()) cdkBuilder.configSets(_configSets)
    return cdkBuilder.build()
  }
}
