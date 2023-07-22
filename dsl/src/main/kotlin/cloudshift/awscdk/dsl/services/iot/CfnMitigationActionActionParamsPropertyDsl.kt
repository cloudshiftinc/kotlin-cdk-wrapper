@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnMitigationAction

@CdkDslMarker
public class CfnMitigationActionActionParamsPropertyDsl {
  private val cdkBuilder: CfnMitigationAction.ActionParamsProperty.Builder =
      CfnMitigationAction.ActionParamsProperty.builder()

  /**
   * @param addThingsToThingGroupParams Specifies the group to which you want to add the devices.
   */
  public fun addThingsToThingGroupParams(addThingsToThingGroupParams: IResolvable) {
    cdkBuilder.addThingsToThingGroupParams(addThingsToThingGroupParams)
  }

  /**
   * @param addThingsToThingGroupParams Specifies the group to which you want to add the devices.
   */
  public
      fun addThingsToThingGroupParams(addThingsToThingGroupParams: CfnMitigationAction.AddThingsToThingGroupParamsProperty) {
    cdkBuilder.addThingsToThingGroupParams(addThingsToThingGroupParams)
  }

  /**
   * @param enableIoTLoggingParams Specifies the logging level and the role with permissions for
   * logging.
   * You cannot specify a logging level of `DISABLED` .
   */
  public fun enableIoTLoggingParams(enableIoTLoggingParams: IResolvable) {
    cdkBuilder.enableIoTLoggingParams(enableIoTLoggingParams)
  }

  /**
   * @param enableIoTLoggingParams Specifies the logging level and the role with permissions for
   * logging.
   * You cannot specify a logging level of `DISABLED` .
   */
  public
      fun enableIoTLoggingParams(enableIoTLoggingParams: CfnMitigationAction.EnableIoTLoggingParamsProperty) {
    cdkBuilder.enableIoTLoggingParams(enableIoTLoggingParams)
  }

  /**
   * @param publishFindingToSnsParams Specifies the topic to which the finding should be published.
   */
  public fun publishFindingToSnsParams(publishFindingToSnsParams: IResolvable) {
    cdkBuilder.publishFindingToSnsParams(publishFindingToSnsParams)
  }

  /**
   * @param publishFindingToSnsParams Specifies the topic to which the finding should be published.
   */
  public
      fun publishFindingToSnsParams(publishFindingToSnsParams: CfnMitigationAction.PublishFindingToSnsParamsProperty) {
    cdkBuilder.publishFindingToSnsParams(publishFindingToSnsParams)
  }

  /**
   * @param replaceDefaultPolicyVersionParams Replaces the policy version with a default or blank
   * policy.
   * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
   */
  public fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: IResolvable) {
    cdkBuilder.replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams)
  }

  /**
   * @param replaceDefaultPolicyVersionParams Replaces the policy version with a default or blank
   * policy.
   * You specify the template name. Only a value of `BLANK_POLICY` is currently supported.
   */
  public
      fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty) {
    cdkBuilder.replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams)
  }

  /**
   * @param updateCaCertificateParams Specifies the new state for the CA certificate.
   * Only a value of `DEACTIVATE` is currently supported.
   */
  public fun updateCaCertificateParams(updateCaCertificateParams: IResolvable) {
    cdkBuilder.updateCaCertificateParams(updateCaCertificateParams)
  }

  /**
   * @param updateCaCertificateParams Specifies the new state for the CA certificate.
   * Only a value of `DEACTIVATE` is currently supported.
   */
  public
      fun updateCaCertificateParams(updateCaCertificateParams: CfnMitigationAction.UpdateCACertificateParamsProperty) {
    cdkBuilder.updateCaCertificateParams(updateCaCertificateParams)
  }

  /**
   * @param updateDeviceCertificateParams Specifies the new state for a device certificate.
   * Only a value of `DEACTIVATE` is currently supported.
   */
  public fun updateDeviceCertificateParams(updateDeviceCertificateParams: IResolvable) {
    cdkBuilder.updateDeviceCertificateParams(updateDeviceCertificateParams)
  }

  /**
   * @param updateDeviceCertificateParams Specifies the new state for a device certificate.
   * Only a value of `DEACTIVATE` is currently supported.
   */
  public
      fun updateDeviceCertificateParams(updateDeviceCertificateParams: CfnMitigationAction.UpdateDeviceCertificateParamsProperty) {
    cdkBuilder.updateDeviceCertificateParams(updateDeviceCertificateParams)
  }

  public fun build(): CfnMitigationAction.ActionParamsProperty = cdkBuilder.build()
}
