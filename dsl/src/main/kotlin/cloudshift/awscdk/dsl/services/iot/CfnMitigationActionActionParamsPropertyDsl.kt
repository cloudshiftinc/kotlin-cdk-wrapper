@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnMitigationAction

@CdkDslMarker
public class CfnMitigationActionActionParamsPropertyDsl {
    private val cdkBuilder: CfnMitigationAction.ActionParamsProperty.Builder =
        CfnMitigationAction.ActionParamsProperty.builder()

    public fun addThingsToThingGroupParams(addThingsToThingGroupParams: IResolvable) {
        cdkBuilder.addThingsToThingGroupParams(addThingsToThingGroupParams)
    }

    public fun addThingsToThingGroupParams(addThingsToThingGroupParams: CfnMitigationAction.AddThingsToThingGroupParamsProperty) {
        cdkBuilder.addThingsToThingGroupParams(addThingsToThingGroupParams)
    }

    public fun enableIoTLoggingParams(enableIoTLoggingParams: IResolvable) {
        cdkBuilder.enableIoTLoggingParams(enableIoTLoggingParams)
    }

    public fun enableIoTLoggingParams(enableIoTLoggingParams: CfnMitigationAction.EnableIoTLoggingParamsProperty) {
        cdkBuilder.enableIoTLoggingParams(enableIoTLoggingParams)
    }

    public fun publishFindingToSnsParams(publishFindingToSnsParams: IResolvable) {
        cdkBuilder.publishFindingToSnsParams(publishFindingToSnsParams)
    }

    public fun publishFindingToSnsParams(publishFindingToSnsParams: CfnMitigationAction.PublishFindingToSnsParamsProperty) {
        cdkBuilder.publishFindingToSnsParams(publishFindingToSnsParams)
    }

    public fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: IResolvable) {
        cdkBuilder.replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams)
    }

    public fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty) {
        cdkBuilder.replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams)
    }

    public fun updateCaCertificateParams(updateCaCertificateParams: IResolvable) {
        cdkBuilder.updateCaCertificateParams(updateCaCertificateParams)
    }

    public fun updateCaCertificateParams(updateCaCertificateParams: CfnMitigationAction.UpdateCACertificateParamsProperty) {
        cdkBuilder.updateCaCertificateParams(updateCaCertificateParams)
    }

    public fun updateDeviceCertificateParams(updateDeviceCertificateParams: IResolvable) {
        cdkBuilder.updateDeviceCertificateParams(updateDeviceCertificateParams)
    }

    public fun updateDeviceCertificateParams(updateDeviceCertificateParams: CfnMitigationAction.UpdateDeviceCertificateParamsProperty) {
        cdkBuilder.updateDeviceCertificateParams(updateDeviceCertificateParams)
    }

    public fun build(): CfnMitigationAction.ActionParamsProperty = cdkBuilder.build()
}
