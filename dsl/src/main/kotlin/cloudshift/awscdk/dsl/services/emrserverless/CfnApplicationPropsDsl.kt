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

package cloudshift.awscdk.dsl.services.emrserverless

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
 * .name("name")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
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

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param architecture The CPU architecture type of the application. Allowed values: `X86_64` or
     *   `ARM64`
     */
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

    /** @param imageConfiguration The image configuration. */
    public fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    /** @param imageConfiguration The image configuration. */
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
     * @param name The name of the application. *Minimum* : 1
     *
     * *Maximum* : 64
     *
     * *Pattern* : `^[A-Za-z0-9._\\/#-]+$`
     */
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

    /**
     * @param releaseLabel The EMR release version associated with the application. *Minimum* : 1
     *
     * *Maximum* : 64
     *
     * *Pattern* : `^[A-Za-z0-9._/-]+$`
     */
    public fun releaseLabel(releaseLabel: String) {
        cdkBuilder.releaseLabel(releaseLabel)
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

    /** @param workerTypeSpecifications the value to be set. */
    public fun workerTypeSpecifications(workerTypeSpecifications: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(workerTypeSpecifications)
        cdkBuilder.workerTypeSpecifications(builder.map)
    }

    /** @param workerTypeSpecifications the value to be set. */
    public fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>) {
        cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    /** @param workerTypeSpecifications the value to be set. */
    public fun workerTypeSpecifications(workerTypeSpecifications: IResolvable) {
        cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    public fun build(): CfnApplicationProps {
        if (_initialCapacity.isNotEmpty()) cdkBuilder.initialCapacity(_initialCapacity)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
