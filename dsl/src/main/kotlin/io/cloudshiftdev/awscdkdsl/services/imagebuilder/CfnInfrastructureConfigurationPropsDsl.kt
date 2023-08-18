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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps

/**
 * Properties for defining a `CfnInfrastructureConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * CfnInfrastructureConfigurationProps cfnInfrastructureConfigurationProps =
 * CfnInfrastructureConfigurationProps.builder()
 * .instanceProfileName("instanceProfileName")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .instanceMetadataOptions(InstanceMetadataOptionsProperty.builder()
 * .httpPutResponseHopLimit(123)
 * .httpTokens("httpTokens")
 * .build())
 * .instanceTypes(List.of("instanceTypes"))
 * .keyPair("keyPair")
 * .logging(LoggingProperty.builder()
 * .s3Logs(S3LogsProperty.builder()
 * .s3BucketName("s3BucketName")
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .build())
 * .resourceTags(Map.of(
 * "resourceTagsKey", "resourceTags"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .snsTopicArn("snsTopicArn")
 * .subnetId("subnetId")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .terminateInstanceOnFailure(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html)
 */
@CdkDslMarker
public class CfnInfrastructureConfigurationPropsDsl {
    private val cdkBuilder: CfnInfrastructureConfigurationProps.Builder =
        CfnInfrastructureConfigurationProps.builder()

    private val _instanceTypes: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    /** @param description The description of the infrastructure configuration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     *   configuration.
     */
    public fun instanceMetadataOptions(instanceMetadataOptions: IResolvable) {
        cdkBuilder.instanceMetadataOptions(instanceMetadataOptions)
    }

    /**
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     *   configuration.
     */
    public fun instanceMetadataOptions(
        instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty
    ) {
        cdkBuilder.instanceMetadataOptions(instanceMetadataOptions)
    }

    /** @param instanceProfileName The instance profile of the infrastructure configuration. */
    public fun instanceProfileName(instanceProfileName: String) {
        cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /** @param instanceTypes The instance types of the infrastructure configuration. */
    public fun instanceTypes(vararg instanceTypes: String) {
        _instanceTypes.addAll(listOf(*instanceTypes))
    }

    /** @param instanceTypes The instance types of the infrastructure configuration. */
    public fun instanceTypes(instanceTypes: Collection<String>) {
        _instanceTypes.addAll(instanceTypes)
    }

    /** @param keyPair The Amazon EC2 key pair of the infrastructure configuration. */
    public fun keyPair(keyPair: String) {
        cdkBuilder.keyPair(keyPair)
    }

    /** @param logging The logging configuration defines where Image Builder uploads your logs. */
    public fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging)
    }

    /** @param logging The logging configuration defines where Image Builder uploads your logs. */
    public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty) {
        cdkBuilder.logging(logging)
    }

    /** @param name The name of the infrastructure configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param resourceTags The tags attached to the resource created by Image Builder. */
    public fun resourceTags(resourceTags: Map<String, String>) {
        cdkBuilder.resourceTags(resourceTags)
    }

    /** @param resourceTags The tags attached to the resource created by Image Builder. */
    public fun resourceTags(resourceTags: IResolvable) {
        cdkBuilder.resourceTags(resourceTags)
    }

    /** @param securityGroupIds The security group IDs of the infrastructure configuration. */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /** @param securityGroupIds The security group IDs of the infrastructure configuration. */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic for the infrastructure
     *   configuration.
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /** @param subnetId The subnet ID of the infrastructure configuration. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /** @param tags The tags of the infrastructure configuration. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     *   infrastructure configuration.
     */
    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean) {
        cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
    }

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     *   infrastructure configuration.
     */
    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable) {
        cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
    }

    public fun build(): CfnInfrastructureConfigurationProps {
        if (_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
