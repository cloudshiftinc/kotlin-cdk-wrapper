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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.CfnDeployment
import software.amazon.awscdk.services.appconfig.CfnDeploymentProps

/**
 * Properties for defining a `CfnDeployment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
 * .applicationId("applicationId")
 * .configurationProfileId("configurationProfileId")
 * .configurationVersion("configurationVersion")
 * .deploymentStrategyId("deploymentStrategyId")
 * .environmentId("environmentId")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html)
 */
@CdkDslMarker
public class CfnDeploymentPropsDsl {
    private val cdkBuilder: CfnDeploymentProps.Builder = CfnDeploymentProps.builder()

    private val _tags: MutableList<CfnDeployment.TagsProperty> = mutableListOf()

    /** @param applicationId The application ID. */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /** @param configurationProfileId The configuration profile ID. */
    public fun configurationProfileId(configurationProfileId: String) {
        cdkBuilder.configurationProfileId(configurationProfileId)
    }

    /**
     * @param configurationVersion The configuration version to deploy. If deploying an AWS
     *   AppConfig hosted configuration version, you can specify either the version number or
     *   version label. For all other configurations, you must specify the version number.
     */
    public fun configurationVersion(configurationVersion: String) {
        cdkBuilder.configurationVersion(configurationVersion)
    }

    /** @param deploymentStrategyId The deployment strategy ID. */
    public fun deploymentStrategyId(deploymentStrategyId: String) {
        cdkBuilder.deploymentStrategyId(deploymentStrategyId)
    }

    /** @param description A description of the deployment. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param environmentId The environment ID. */
    public fun environmentId(environmentId: String) {
        cdkBuilder.environmentId(environmentId)
    }

    /**
     * @param kmsKeyIdentifier The AWS KMS key identifier (key ID, key alias, or key ARN). AWS
     *   AppConfig uses this ID to encrypt the configuration data using a customer managed key.
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
        cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * @param tags Metadata to assign to the deployment. Tags help organize and categorize your AWS
     *   AppConfig resources. Each tag consists of a key and an optional value, both of which you
     *   define.
     */
    public fun tags(tags: CfnDeploymentTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnDeploymentTagsPropertyDsl().apply(tags).build())
    }

    /**
     * @param tags Metadata to assign to the deployment. Tags help organize and categorize your AWS
     *   AppConfig resources. Each tag consists of a key and an optional value, both of which you
     *   define.
     */
    public fun tags(tags: Collection<CfnDeployment.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeploymentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
