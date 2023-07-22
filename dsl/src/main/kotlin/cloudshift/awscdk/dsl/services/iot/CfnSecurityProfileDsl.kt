@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import software.constructs.Construct

@CdkDslMarker
public class CfnSecurityProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityProfile.Builder = CfnSecurityProfile.Builder.create(scope, id)

  private val _additionalMetricsToRetainV2: MutableList<Any> = mutableListOf()

  private val _behaviors: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetArns: MutableList<String> = mutableListOf()

  /**
   * A list of metrics whose data is retained (stored).
   *
   * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
   * retained for any metric specified here. Can be used with custom metrics; can't be used with
   * dimensions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
   * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
   */
  public fun additionalMetricsToRetainV2(vararg additionalMetricsToRetainV2: Any) {
    _additionalMetricsToRetainV2.addAll(listOf(*additionalMetricsToRetainV2))
  }

  /**
   * A list of metrics whose data is retained (stored).
   *
   * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
   * retained for any metric specified here. Can be used with custom metrics; can't be used with
   * dimensions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
   * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
   */
  public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: Collection<Any>) {
    _additionalMetricsToRetainV2.addAll(additionalMetricsToRetainV2)
  }

  /**
   * A list of metrics whose data is retained (stored).
   *
   * By default, data is retained for any metric used in the profile's `behaviors` , but it's also
   * retained for any metric specified here. Can be used with custom metrics; can't be used with
   * dimensions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-additionalmetricstoretainv2)
   * @param additionalMetricsToRetainV2 A list of metrics whose data is retained (stored). 
   */
  public fun additionalMetricsToRetainV2(additionalMetricsToRetainV2: IResolvable) {
    cdkBuilder.additionalMetricsToRetainV2(additionalMetricsToRetainV2)
  }

  /**
   * Specifies the destinations to which alerts are sent.
   *
   * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates a
   * behavior.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
   * @param alertTargets Specifies the destinations to which alerts are sent. 
   */
  public fun alertTargets(alertTargets: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(alertTargets)
    cdkBuilder.alertTargets(builder.map)
  }

  /**
   * Specifies the destinations to which alerts are sent.
   *
   * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates a
   * behavior.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
   * @param alertTargets Specifies the destinations to which alerts are sent. 
   */
  public fun alertTargets(alertTargets: Map<String, Any>) {
    cdkBuilder.alertTargets(alertTargets)
  }

  /**
   * Specifies the destinations to which alerts are sent.
   *
   * (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates a
   * behavior.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-alerttargets)
   * @param alertTargets Specifies the destinations to which alerts are sent. 
   */
  public fun alertTargets(alertTargets: IResolvable) {
    cdkBuilder.alertTargets(alertTargets)
  }

  /**
   * Specifies the behaviors that, when violated by a device (thing), cause an alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
   * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
   * alert. 
   */
  public fun behaviors(vararg behaviors: Any) {
    _behaviors.addAll(listOf(*behaviors))
  }

  /**
   * Specifies the behaviors that, when violated by a device (thing), cause an alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
   * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
   * alert. 
   */
  public fun behaviors(behaviors: Collection<Any>) {
    _behaviors.addAll(behaviors)
  }

  /**
   * Specifies the behaviors that, when violated by a device (thing), cause an alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-behaviors)
   * @param behaviors Specifies the behaviors that, when violated by a device (thing), cause an
   * alert. 
   */
  public fun behaviors(behaviors: IResolvable) {
    cdkBuilder.behaviors(behaviors)
  }

  /**
   * A description of the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofiledescription)
   * @param securityProfileDescription A description of the security profile. 
   */
  public fun securityProfileDescription(securityProfileDescription: String) {
    cdkBuilder.securityProfileDescription(securityProfileDescription)
  }

  /**
   * The name you gave to the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-securityprofilename)
   * @param securityProfileName The name you gave to the security profile. 
   */
  public fun securityProfileName(securityProfileName: String) {
    cdkBuilder.securityProfileName(securityProfileName)
  }

  /**
   * Metadata that can be used to manage the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-tags)
   * @param tags Metadata that can be used to manage the security profile. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata that can be used to manage the security profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-tags)
   * @param tags Metadata that can be used to manage the security profile. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ARN of the target (thing group) to which the security profile is attached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-targetarns)
   * @param targetArns The ARN of the target (thing group) to which the security profile is
   * attached. 
   */
  public fun targetArns(vararg targetArns: String) {
    _targetArns.addAll(listOf(*targetArns))
  }

  /**
   * The ARN of the target (thing group) to which the security profile is attached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-securityprofile.html#cfn-iot-securityprofile-targetarns)
   * @param targetArns The ARN of the target (thing group) to which the security profile is
   * attached. 
   */
  public fun targetArns(targetArns: Collection<String>) {
    _targetArns.addAll(targetArns)
  }

  public fun build(): CfnSecurityProfile {
    if(_additionalMetricsToRetainV2.isNotEmpty())
        cdkBuilder.additionalMetricsToRetainV2(_additionalMetricsToRetainV2)
    if(_behaviors.isNotEmpty()) cdkBuilder.behaviors(_behaviors)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetArns.isNotEmpty()) cdkBuilder.targetArns(_targetArns)
    return cdkBuilder.build()
  }
}
