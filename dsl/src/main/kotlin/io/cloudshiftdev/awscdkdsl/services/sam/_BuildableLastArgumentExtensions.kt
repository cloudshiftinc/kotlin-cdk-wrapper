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

package io.cloudshiftdev.awscdkdsl.services.sam

import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApi
import software.amazon.awscdk.services.sam.CfnApplication
import software.amazon.awscdk.services.sam.CfnFunction
import software.amazon.awscdk.services.sam.CfnHttpApi
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnStateMachine

/**  */
public inline fun CfnApi.setAccessLogSetting(
    block: CfnApiAccessLogSettingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApiAccessLogSettingPropertyDsl()
    builder.apply(block)
    return setAccessLogSetting(builder.build())
}

/**  */
public inline fun CfnApi.setAuth(block: CfnApiAuthPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiAuthPropertyDsl()
    builder.apply(block)
    return setAuth(builder.build())
}

/**  */
public inline fun CfnApi.setCanarySetting(block: CfnApiCanarySettingPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiCanarySettingPropertyDsl()
    builder.apply(block)
    return setCanarySetting(builder.build())
}

/**  */
public inline fun CfnApi.setCors(block: CfnApiCorsConfigurationPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiCorsConfigurationPropertyDsl()
    builder.apply(block)
    return setCors(builder.build())
}

/**  */
public inline fun CfnApi.setDefinitionUri(block: CfnApiS3LocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiS3LocationPropertyDsl()
    builder.apply(block)
    return setDefinitionUri(builder.build())
}

/**  */
public inline fun CfnApi.setDomain(block: CfnApiDomainConfigurationPropertyDsl.() -> Unit = {}) {
    val builder = CfnApiDomainConfigurationPropertyDsl()
    builder.apply(block)
    return setDomain(builder.build())
}

/**  */
public inline fun CfnApi.setEndpointConfiguration(
    block: CfnApiEndpointConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApiEndpointConfigurationPropertyDsl()
    builder.apply(block)
    return setEndpointConfiguration(builder.build())
}

/**  */
public inline fun CfnApplication.setLocation(
    block: CfnApplicationApplicationLocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationApplicationLocationPropertyDsl()
    builder.apply(block)
    return setLocation(builder.build())
}

/**  */
public inline fun CfnFunction.setCodeUri(block: CfnFunctionS3LocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnFunctionS3LocationPropertyDsl()
    builder.apply(block)
    return setCodeUri(builder.build())
}

/**  */
public inline fun CfnFunction.setDeadLetterQueue(
    block: CfnFunctionDeadLetterQueuePropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionDeadLetterQueuePropertyDsl()
    builder.apply(block)
    return setDeadLetterQueue(builder.build())
}

/**  */
public inline fun CfnFunction.setDeploymentPreference(
    block: CfnFunctionDeploymentPreferencePropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionDeploymentPreferencePropertyDsl()
    builder.apply(block)
    return setDeploymentPreference(builder.build())
}

/**  */
public inline fun CfnFunction.setEnvironment(
    block: CfnFunctionFunctionEnvironmentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionFunctionEnvironmentPropertyDsl()
    builder.apply(block)
    return setEnvironment(builder.build())
}

/**  */
public inline fun CfnFunction.setEphemeralStorage(
    block: CfnFunctionEphemeralStoragePropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionEphemeralStoragePropertyDsl()
    builder.apply(block)
    return setEphemeralStorage(builder.build())
}

/**  */
public inline fun CfnFunction.setEventInvokeConfig(
    block: CfnFunctionEventInvokeConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionEventInvokeConfigPropertyDsl()
    builder.apply(block)
    return setEventInvokeConfig(builder.build())
}

/**  */
public inline fun CfnFunction.setFunctionUrlConfig(
    block: CfnFunctionFunctionUrlConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionFunctionUrlConfigPropertyDsl()
    builder.apply(block)
    return setFunctionUrlConfig(builder.build())
}

/**  */
public inline fun CfnFunction.setImageConfig(
    block: CfnFunctionImageConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionImageConfigPropertyDsl()
    builder.apply(block)
    return setImageConfig(builder.build())
}

/**  */
public inline fun CfnFunction.setPolicies(
    block: CfnFunctionIAMPolicyDocumentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionIAMPolicyDocumentPropertyDsl()
    builder.apply(block)
    return setPolicies(builder.build())
}

/**  */
public inline fun CfnFunction.setProvisionedConcurrencyConfig(
    block: CfnFunctionProvisionedConcurrencyConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionProvisionedConcurrencyConfigPropertyDsl()
    builder.apply(block)
    return setProvisionedConcurrencyConfig(builder.build())
}

/**  */
public inline fun CfnFunction.setVpcConfig(block: CfnFunctionVpcConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnFunctionVpcConfigPropertyDsl()
    builder.apply(block)
    return setVpcConfig(builder.build())
}

/**  */
public inline fun CfnHttpApi.setAccessLogSetting(
    block: CfnHttpApiAccessLogSettingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHttpApiAccessLogSettingPropertyDsl()
    builder.apply(block)
    return setAccessLogSetting(builder.build())
}

/**  */
public inline fun CfnHttpApi.setAuth(block: CfnHttpApiHttpApiAuthPropertyDsl.() -> Unit = {}) {
    val builder = CfnHttpApiHttpApiAuthPropertyDsl()
    builder.apply(block)
    return setAuth(builder.build())
}

/**  */
public inline fun CfnHttpApi.setCorsConfiguration(
    block: CfnHttpApiCorsConfigurationObjectPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHttpApiCorsConfigurationObjectPropertyDsl()
    builder.apply(block)
    return setCorsConfiguration(builder.build())
}

/**  */
public inline fun CfnHttpApi.setDefaultRouteSettings(
    block: CfnHttpApiRouteSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHttpApiRouteSettingsPropertyDsl()
    builder.apply(block)
    return setDefaultRouteSettings(builder.build())
}

/**  */
public inline fun CfnHttpApi.setDefinitionUri(
    block: CfnHttpApiS3LocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHttpApiS3LocationPropertyDsl()
    builder.apply(block)
    return setDefinitionUri(builder.build())
}

/**  */
public inline fun CfnHttpApi.setDomain(
    block: CfnHttpApiHttpApiDomainConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHttpApiHttpApiDomainConfigurationPropertyDsl()
    builder.apply(block)
    return setDomain(builder.build())
}

/**  */
public inline fun CfnHttpApi.setRouteSettings(
    block: CfnHttpApiRouteSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnHttpApiRouteSettingsPropertyDsl()
    builder.apply(block)
    return setRouteSettings(builder.build())
}

/**  */
public inline fun CfnLayerVersion.setContentUri(
    block: CfnLayerVersionS3LocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLayerVersionS3LocationPropertyDsl()
    builder.apply(block)
    return setContentUri(builder.build())
}

/**  */
public inline fun CfnSimpleTable.setPrimaryKey(
    block: CfnSimpleTablePrimaryKeyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimpleTablePrimaryKeyPropertyDsl()
    builder.apply(block)
    return setPrimaryKey(builder.build())
}

/**  */
public inline fun CfnSimpleTable.setProvisionedThroughput(
    block: CfnSimpleTableProvisionedThroughputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimpleTableProvisionedThroughputPropertyDsl()
    builder.apply(block)
    return setProvisionedThroughput(builder.build())
}

/**  */
public inline fun CfnSimpleTable.setSseSpecification(
    block: CfnSimpleTableSSESpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSimpleTableSSESpecificationPropertyDsl()
    builder.apply(block)
    return setSseSpecification(builder.build())
}

/**  */
public inline fun CfnStateMachine.setDefinitionUri(
    block: CfnStateMachineS3LocationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStateMachineS3LocationPropertyDsl()
    builder.apply(block)
    return setDefinitionUri(builder.build())
}

/**  */
public inline fun CfnStateMachine.setLogging(
    block: CfnStateMachineLoggingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStateMachineLoggingConfigurationPropertyDsl()
    builder.apply(block)
    return setLogging(builder.build())
}

/**  */
public inline fun CfnStateMachine.setPolicies(
    block: CfnStateMachineIAMPolicyDocumentPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStateMachineIAMPolicyDocumentPropertyDsl()
    builder.apply(block)
    return setPolicies(builder.build())
}

/**  */
public inline fun CfnStateMachine.setTracing(
    block: CfnStateMachineTracingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStateMachineTracingConfigurationPropertyDsl()
    builder.apply(block)
    return setTracing(builder.build())
}
