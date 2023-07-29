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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService
import software.amazon.awscdk.services.apprunner.CfnServiceProps

/**
 * Properties for defining a `CfnService`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
 * .sourceConfiguration(SourceConfigurationProperty.builder()
 * .authenticationConfiguration(AuthenticationConfigurationProperty.builder()
 * .accessRoleArn("accessRoleArn")
 * .connectionArn("connectionArn")
 * .build())
 * .autoDeploymentsEnabled(false)
 * .codeRepository(CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .sourceCodeVersion(SourceCodeVersionProperty.builder()
 * .type("type")
 * .value("value")
 * .build())
 * // the properties below are optional
 * .codeConfiguration(CodeConfigurationProperty.builder()
 * .configurationSource("configurationSource")
 * // the properties below are optional
 * .codeConfigurationValues(CodeConfigurationValuesProperty.builder()
 * .runtime("runtime")
 * // the properties below are optional
 * .buildCommand("buildCommand")
 * .port("port")
 * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .startCommand("startCommand")
 * .build())
 * .build())
 * .build())
 * .imageRepository(ImageRepositoryProperty.builder()
 * .imageIdentifier("imageIdentifier")
 * .imageRepositoryType("imageRepositoryType")
 * // the properties below are optional
 * .imageConfiguration(ImageConfigurationProperty.builder()
 * .port("port")
 * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .startCommand("startCommand")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .autoScalingConfigurationArn("autoScalingConfigurationArn")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build())
 * .healthCheckConfiguration(HealthCheckConfigurationProperty.builder()
 * .healthyThreshold(123)
 * .interval(123)
 * .path("path")
 * .protocol("protocol")
 * .timeout(123)
 * .unhealthyThreshold(123)
 * .build())
 * .instanceConfiguration(InstanceConfigurationProperty.builder()
 * .cpu("cpu")
 * .instanceRoleArn("instanceRoleArn")
 * .memory("memory")
 * .build())
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .egressConfiguration(EgressConfigurationProperty.builder()
 * .egressType("egressType")
 * // the properties below are optional
 * .vpcConnectorArn("vpcConnectorArn")
 * .build())
 * .ingressConfiguration(IngressConfigurationProperty.builder()
 * .isPubliclyAccessible(false)
 * .build())
 * .build())
 * .observabilityConfiguration(ServiceObservabilityConfigurationProperty.builder()
 * .observabilityEnabled(false)
 * // the properties below are optional
 * .observabilityConfigurationArn("observabilityConfigurationArn")
 * .build())
 * .serviceName("serviceName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html)
 */
@CdkDslMarker
public class CfnServicePropsDsl {
    private val cdkBuilder: CfnServiceProps.Builder = CfnServiceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param autoScalingConfigurationArn The Amazon Resource Name (ARN) of an App Runner automatic
     *   scaling configuration resource that you want to associate with your service. If not
     *   provided, App Runner associates the latest revision of a default auto scaling
     *   configuration.
     *
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability/3`
     *
     * Specify just the name to associate the latest revision. For example:
     * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability`
     */
    public fun autoScalingConfigurationArn(autoScalingConfigurationArn: String) {
        cdkBuilder.autoScalingConfigurationArn(autoScalingConfigurationArn)
    }

    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     *   encrypt the copy of your source repository that it maintains and your service logs. By
     *   default, App Runner uses an AWS managed key .
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
     *   encrypt the copy of your source repository that it maintains and your service logs. By
     *   default, App Runner uses an AWS managed key .
     */
    public fun encryptionConfiguration(
        encryptionConfiguration: CfnService.EncryptionConfigurationProperty
    ) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     *   performs to monitor the health of the App Runner service.
     */
    public fun healthCheckConfiguration(healthCheckConfiguration: IResolvable) {
        cdkBuilder.healthCheckConfiguration(healthCheckConfiguration)
    }

    /**
     * @param healthCheckConfiguration The settings for the health check that AWS App Runner
     *   performs to monitor the health of the App Runner service.
     */
    public fun healthCheckConfiguration(
        healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty
    ) {
        cdkBuilder.healthCheckConfiguration(healthCheckConfiguration)
    }

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     *   service.
     */
    public fun instanceConfiguration(instanceConfiguration: IResolvable) {
        cdkBuilder.instanceConfiguration(instanceConfiguration)
    }

    /**
     * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
     *   service.
     */
    public fun instanceConfiguration(
        instanceConfiguration: CfnService.InstanceConfigurationProperty
    ) {
        cdkBuilder.instanceConfiguration(instanceConfiguration)
    }

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web
     *   application that the App Runner service runs.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * @param networkConfiguration Configuration settings related to network traffic of the web
     *   application that the App Runner service runs.
     */
    public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /** @param observabilityConfiguration The observability configuration of your service. */
    public fun observabilityConfiguration(observabilityConfiguration: IResolvable) {
        cdkBuilder.observabilityConfiguration(observabilityConfiguration)
    }

    /** @param observabilityConfiguration The observability configuration of your service. */
    public fun observabilityConfiguration(
        observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty
    ) {
        cdkBuilder.observabilityConfiguration(observabilityConfiguration)
    }

    /**
     * @param serviceName A name for the App Runner service. It must be unique across all the
     *   running App Runner services in your AWS account in the AWS Region .
     *
     * If you don't specify a name, AWS CloudFormation generates a name for your service.
     */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. It can be a code
     *   or an image repository.
     */
    public fun sourceConfiguration(sourceConfiguration: IResolvable) {
        cdkBuilder.sourceConfiguration(sourceConfiguration)
    }

    /**
     * @param sourceConfiguration The source to deploy to the App Runner service. It can be a code
     *   or an image repository.
     */
    public fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty) {
        cdkBuilder.sourceConfiguration(sourceConfiguration)
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the App Runner
     *   service resource. A tag is a key-value pair.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the App Runner
     *   service resource. A tag is a key-value pair.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
