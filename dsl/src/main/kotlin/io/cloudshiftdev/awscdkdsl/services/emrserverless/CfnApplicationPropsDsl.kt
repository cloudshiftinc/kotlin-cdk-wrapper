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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication
import software.amazon.awscdk.services.emrserverless.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * ConfigurationObjectProperty configurationObjectProperty_;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .releaseLabel("releaseLabel")
 * .type("type")
 * // the properties below are optional
 * .architecture("architecture")
 * .autoStartConfiguration(AutoStartConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .autoStopConfiguration(AutoStopConfigurationProperty.builder()
 * .enabled(false)
 * .idleTimeoutMinutes(123)
 * .build())
 * .imageConfiguration(ImageConfigurationInputProperty.builder()
 * .imageUri("imageUri")
 * .build())
 * .initialCapacity(List.of(InitialCapacityConfigKeyValuePairProperty.builder()
 * .key("key")
 * .value(InitialCapacityConfigProperty.builder()
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build())
 * .workerCount(123)
 * .build())
 * .build()))
 * .maximumCapacity(MaximumAllowedResourcesProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build())
 * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
 * .cloudWatchLoggingConfiguration(CloudWatchLoggingConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionKeyArn("encryptionKeyArn")
 * .logGroupName("logGroupName")
 * .logStreamNamePrefix("logStreamNamePrefix")
 * .logTypeMap(List.of(LogTypeMapKeyValuePairProperty.builder()
 * .key("key")
 * .value(List.of("value"))
 * .build()))
 * .build())
 * .managedPersistenceMonitoringConfiguration(ManagedPersistenceMonitoringConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionKeyArn("encryptionKeyArn")
 * .build())
 * .s3MonitoringConfiguration(S3MonitoringConfigurationProperty.builder()
 * .encryptionKeyArn("encryptionKeyArn")
 * .logUri("logUri")
 * .build())
 * .build())
 * .name("name")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .runtimeConfiguration(List.of(ConfigurationObjectProperty.builder()
 * .classification("classification")
 * // the properties below are optional
 * .configurations(List.of(configurationObjectProperty_))
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workerTypeSpecifications(Map.of(
 * "workerTypeSpecificationsKey", WorkerTypeSpecificationInputProperty.builder()
 * .imageConfiguration(ImageConfigurationInputProperty.builder()
 * .imageUri("imageUri")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    private val _initialCapacity: MutableList<Any> = mutableListOf()

    private val _runtimeConfiguration: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param architecture The CPU architecture of an application. */
    public fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
    }

    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on
     *   job submission.
     */
    public fun autoStartConfiguration(autoStartConfiguration: IResolvable) {
        cdkBuilder.autoStartConfiguration(autoStartConfiguration)
    }

    /**
     * @param autoStartConfiguration The configuration for an application to automatically start on
     *   job submission.
     */
    public fun autoStartConfiguration(
        autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty
    ) {
        cdkBuilder.autoStartConfiguration(autoStartConfiguration)
    }

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     *   a certain amount of time being idle.
     */
    public fun autoStopConfiguration(autoStopConfiguration: IResolvable) {
        cdkBuilder.autoStopConfiguration(autoStopConfiguration)
    }

    /**
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     *   a certain amount of time being idle.
     */
    public fun autoStopConfiguration(
        autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty
    ) {
        cdkBuilder.autoStopConfiguration(autoStopConfiguration)
    }

    /** @param imageConfiguration The image configuration applied to all worker types. */
    public fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    /** @param imageConfiguration The image configuration applied to all worker types. */
    public fun imageConfiguration(
        imageConfiguration: CfnApplication.ImageConfigurationInputProperty
    ) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    /** @param initialCapacity The initial capacity of the application. */
    public fun initialCapacity(vararg initialCapacity: Any) {
        _initialCapacity.addAll(listOf(*initialCapacity))
    }

    /** @param initialCapacity The initial capacity of the application. */
    public fun initialCapacity(initialCapacity: Collection<Any>) {
        _initialCapacity.addAll(initialCapacity)
    }

    /** @param initialCapacity The initial capacity of the application. */
    public fun initialCapacity(initialCapacity: IResolvable) {
        cdkBuilder.initialCapacity(initialCapacity)
    }

    /**
     * @param maximumCapacity The maximum capacity of the application. This is cumulative across all
     *   workers at any given point in time during the lifespan of the application is created. No
     *   new resources will be created once any one of the defined limits is hit.
     */
    public fun maximumCapacity(maximumCapacity: IResolvable) {
        cdkBuilder.maximumCapacity(maximumCapacity)
    }

    /**
     * @param maximumCapacity The maximum capacity of the application. This is cumulative across all
     *   workers at any given point in time during the lifespan of the application is created. No
     *   new resources will be created once any one of the defined limits is hit.
     */
    public fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty) {
        cdkBuilder.maximumCapacity(maximumCapacity)
    }

    /**
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     *   application. A configuration consists of a classification, properties, and optional nested
     *   configurations. A classification refers to an application-specific configuration file.
     *   Properties are the settings you want to change in that file.
     */
    public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration)
    }

    /**
     * @param monitoringConfiguration A configuration specification to be used when provisioning an
     *   application. A configuration consists of a classification, properties, and optional nested
     *   configurations. A classification refers to an application-specific configuration file.
     *   Properties are the settings you want to change in that file.
     */
    public fun monitoringConfiguration(
        monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty
    ) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration)
    }

    /** @param name The name of the application. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     *   application.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     *   application.
     */
    public fun networkConfiguration(
        networkConfiguration: CfnApplication.NetworkConfigurationProperty
    ) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /** @param releaseLabel The EMR release associated with the application. */
    public fun releaseLabel(releaseLabel: String) {
        cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * @param runtimeConfiguration The
     *   [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     *   specifications of an application. Each configuration consists of a classification and
     *   properties. You use this parameter when creating or updating an application. To see the
     *   runtimeConfiguration object of an application, run the
     *   [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     *   API operation.
     */
    public fun runtimeConfiguration(vararg runtimeConfiguration: Any) {
        _runtimeConfiguration.addAll(listOf(*runtimeConfiguration))
    }

    /**
     * @param runtimeConfiguration The
     *   [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     *   specifications of an application. Each configuration consists of a classification and
     *   properties. You use this parameter when creating or updating an application. To see the
     *   runtimeConfiguration object of an application, run the
     *   [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     *   API operation.
     */
    public fun runtimeConfiguration(runtimeConfiguration: Collection<Any>) {
        _runtimeConfiguration.addAll(runtimeConfiguration)
    }

    /**
     * @param runtimeConfiguration The
     *   [Configuration](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_Configuration.html)
     *   specifications of an application. Each configuration consists of a classification and
     *   properties. You use this parameter when creating or updating an application. To see the
     *   runtimeConfiguration object of an application, run the
     *   [GetApplication](https://docs.aws.amazon.com/emr-serverless/latest/APIReference/API_GetApplication.html)
     *   API operation.
     */
    public fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
        cdkBuilder.runtimeConfiguration(runtimeConfiguration)
    }

    /** @param tags The tags assigned to the application. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags assigned to the application. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param type The type of application, such as Spark or Hive. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param workerTypeSpecifications The specification applied to each worker type. */
    public fun workerTypeSpecifications(workerTypeSpecifications: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(workerTypeSpecifications)
        cdkBuilder.workerTypeSpecifications(builder.map)
    }

    /** @param workerTypeSpecifications The specification applied to each worker type. */
    public fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>) {
        cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    /** @param workerTypeSpecifications The specification applied to each worker type. */
    public fun workerTypeSpecifications(workerTypeSpecifications: IResolvable) {
        cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    public fun build(): CfnApplicationProps {
        if (_initialCapacity.isNotEmpty()) cdkBuilder.initialCapacity(_initialCapacity)
        if (_runtimeConfiguration.isNotEmpty())
            cdkBuilder.runtimeConfiguration(_runtimeConfiguration)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
