@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps

@CdkDslMarker
public class CfnStudioComponentPropsDsl {
  private val cdkBuilder: CfnStudioComponentProps.Builder = CfnStudioComponentProps.builder()

  private val _ec2SecurityGroupIds: MutableList<String> = mutableListOf()

  private val _initializationScripts: MutableList<Any> = mutableListOf()

  private val _scriptParameters: MutableList<Any> = mutableListOf()

  /**
   * @param configuration The configuration of the studio component, based on component type.
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param configuration The configuration of the studio component, based on component type.
   */
  public fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * @param description A human-readable description for the studio component resource.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio component.
   */
  public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String) {
    _ec2SecurityGroupIds.addAll(listOf(*ec2SecurityGroupIds))
  }

  /**
   * @param ec2SecurityGroupIds The EC2 security groups that control access to the studio component.
   */
  public fun ec2SecurityGroupIds(ec2SecurityGroupIds: Collection<String>) {
    _ec2SecurityGroupIds.addAll(ec2SecurityGroupIds)
  }

  /**
   * @param initializationScripts Initialization scripts for studio components.
   */
  public fun initializationScripts(vararg initializationScripts: Any) {
    _initializationScripts.addAll(listOf(*initializationScripts))
  }

  /**
   * @param initializationScripts Initialization scripts for studio components.
   */
  public fun initializationScripts(initializationScripts: Collection<Any>) {
    _initializationScripts.addAll(initializationScripts)
  }

  /**
   * @param initializationScripts Initialization scripts for studio components.
   */
  public fun initializationScripts(initializationScripts: IResolvable) {
    cdkBuilder.initializationScripts(initializationScripts)
  }

  /**
   * @param name A friendly name for the studio component resource. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param runtimeRoleArn the value to be set.
   */
  public fun runtimeRoleArn(runtimeRoleArn: String) {
    cdkBuilder.runtimeRoleArn(runtimeRoleArn)
  }

  /**
   * @param scriptParameters Parameters for the studio component scripts.
   */
  public fun scriptParameters(vararg scriptParameters: Any) {
    _scriptParameters.addAll(listOf(*scriptParameters))
  }

  /**
   * @param scriptParameters Parameters for the studio component scripts.
   */
  public fun scriptParameters(scriptParameters: Collection<Any>) {
    _scriptParameters.addAll(scriptParameters)
  }

  /**
   * @param scriptParameters Parameters for the studio component scripts.
   */
  public fun scriptParameters(scriptParameters: IResolvable) {
    cdkBuilder.scriptParameters(scriptParameters)
  }

  /**
   * @param secureInitializationRoleArn the value to be set.
   */
  public fun secureInitializationRoleArn(secureInitializationRoleArn: String) {
    cdkBuilder.secureInitializationRoleArn(secureInitializationRoleArn)
  }

  /**
   * @param studioId The unique identifier for a studio resource. 
   * In Nimble Studio , all other resources are contained in a studio resource.
   */
  public fun studioId(studioId: String) {
    cdkBuilder.studioId(studioId)
  }

  /**
   * @param subtype The specific subtype of a studio component.
   */
  public fun subtype(subtype: String) {
    cdkBuilder.subtype(subtype)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param type The type of the studio component. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnStudioComponentProps {
    if(_ec2SecurityGroupIds.isNotEmpty()) cdkBuilder.ec2SecurityGroupIds(_ec2SecurityGroupIds)
    if(_initializationScripts.isNotEmpty()) cdkBuilder.initializationScripts(_initializationScripts)
    if(_scriptParameters.isNotEmpty()) cdkBuilder.scriptParameters(_scriptParameters)
    return cdkBuilder.build()
  }
}
