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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

/**
 * Define and configure the output AMIs of the pipeline.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * AmiDistributionConfigurationProperty amiDistributionConfigurationProperty =
 * AmiDistributionConfigurationProperty.builder()
 * .amiTags(Map.of(
 * "amiTagsKey", "amiTags"))
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .launchPermissionConfiguration(LaunchPermissionConfigurationProperty.builder()
 * .organizationalUnitArns(List.of("organizationalUnitArns"))
 * .organizationArns(List.of("organizationArns"))
 * .userGroups(List.of("userGroups"))
 * .userIds(List.of("userIds"))
 * .build())
 * .name("name")
 * .targetAccountIds(List.of("targetAccountIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html)
 */
@CdkDslMarker
public class CfnDistributionConfigurationAmiDistributionConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDistributionConfiguration.AmiDistributionConfigurationProperty.Builder =
        CfnDistributionConfiguration.AmiDistributionConfigurationProperty.builder()

    private val _targetAccountIds: MutableList<String> = mutableListOf()

    /** @param amiTags The tags to apply to AMIs distributed to this Region. */
    public fun amiTags(amiTags: Map<String, String>) {
        cdkBuilder.amiTags(amiTags)
    }

    /** @param amiTags The tags to apply to AMIs distributed to this Region. */
    public fun amiTags(amiTags: IResolvable) {
        cdkBuilder.amiTags(amiTags)
    }

    /**
     * @param description The description of the AMI distribution configuration. Minimum and maximum
     *   length are in characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param kmsKeyId The KMS key identifier used to encrypt the distributed image. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param launchPermissionConfiguration Launch permissions can be used to configure which AWS
     *   account s can use the AMI to launch instances.
     */
    public fun launchPermissionConfiguration(launchPermissionConfiguration: IResolvable) {
        cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration)
    }

    /**
     * @param launchPermissionConfiguration Launch permissions can be used to configure which AWS
     *   account s can use the AMI to launch instances.
     */
    public fun launchPermissionConfiguration(
        launchPermissionConfiguration:
            CfnDistributionConfiguration.LaunchPermissionConfigurationProperty
    ) {
        cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration)
    }

    /** @param name The name of the output AMI. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param targetAccountIds The ID of an account to which you want to distribute an image. */
    public fun targetAccountIds(vararg targetAccountIds: String) {
        _targetAccountIds.addAll(listOf(*targetAccountIds))
    }

    /** @param targetAccountIds The ID of an account to which you want to distribute an image. */
    public fun targetAccountIds(targetAccountIds: Collection<String>) {
        _targetAccountIds.addAll(targetAccountIds)
    }

    public fun build(): CfnDistributionConfiguration.AmiDistributionConfigurationProperty {
        if (_targetAccountIds.isNotEmpty()) cdkBuilder.targetAccountIds(_targetAccountIds)
        return cdkBuilder.build()
    }
}
