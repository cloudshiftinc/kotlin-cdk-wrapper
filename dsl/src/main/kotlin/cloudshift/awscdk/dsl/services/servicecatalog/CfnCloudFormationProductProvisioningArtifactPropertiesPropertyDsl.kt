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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

/**
 * Information about a provisioning artifact (also known as a version) for a product.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * Object info;
 * ProvisioningArtifactPropertiesProperty provisioningArtifactPropertiesProperty =
 * ProvisioningArtifactPropertiesProperty.builder()
 * .info(info)
 * // the properties below are optional
 * .description("description")
 * .disableTemplateValidation(false)
 * .name("name")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html)
 */
@CdkDslMarker
public class CfnCloudFormationProductProvisioningArtifactPropertiesPropertyDsl {
    private val cdkBuilder:
        CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.Builder =
        CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty.builder()

    /**
     * @param description The description of the provisioning artifact, including how it differs
     *   from the previous provisioning artifact.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param disableTemplateValidation If set to true, AWS Service Catalog stops validating the
     *   specified provisioning artifact even if it is invalid.
     */
    public fun disableTemplateValidation(disableTemplateValidation: Boolean) {
        cdkBuilder.disableTemplateValidation(disableTemplateValidation)
    }

    /**
     * @param disableTemplateValidation If set to true, AWS Service Catalog stops validating the
     *   specified provisioning artifact even if it is invalid.
     */
    public fun disableTemplateValidation(disableTemplateValidation: IResolvable) {
        cdkBuilder.disableTemplateValidation(disableTemplateValidation)
    }

    /**
     * @param info Specify the template source with one of the following options, but not both. Keys
     *   accepted: [ `LoadTemplateFromURL` , `ImportFromPhysicalId` ]
     *
     * The URL of the AWS CloudFormation template in Amazon S3 in JSON format. Specify the URL in
     * JSON format as follows:
     *
     * `"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."`
     *
     * `ImportFromPhysicalId` : The physical id of the resource that contains the template.
     * Currently only supports AWS CloudFormation stack arn. Specify the physical id in JSON format
     * as follows: `ImportFromPhysicalId:
     * “arn:aws:cloudformation:[us-east-1]:[accountId]:stack/[StackName]/[resourceId]`
     */
    public fun info(info: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(info)
        cdkBuilder.info(builder.map)
    }

    /**
     * @param info Specify the template source with one of the following options, but not both. Keys
     *   accepted: [ `LoadTemplateFromURL` , `ImportFromPhysicalId` ]
     *
     * The URL of the AWS CloudFormation template in Amazon S3 in JSON format. Specify the URL in
     * JSON format as follows:
     *
     * `"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."`
     *
     * `ImportFromPhysicalId` : The physical id of the resource that contains the template.
     * Currently only supports AWS CloudFormation stack arn. Specify the physical id in JSON format
     * as follows: `ImportFromPhysicalId:
     * “arn:aws:cloudformation:[us-east-1]:[accountId]:stack/[StackName]/[resourceId]`
     */
    public fun info(info: Any) {
        cdkBuilder.info(info)
    }

    /**
     * @param name The name of the provisioning artifact (for example, v1 v2beta). No spaces are
     *   allowed.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param type The type of provisioning artifact.
     * * `CLOUD_FORMATION_TEMPLATE` - AWS CloudFormation template
     * * `MARKETPLACE_AMI` - AWS Marketplace AMI
     * * `MARKETPLACE_CAR` - AWS Marketplace Clusters and AWS Resources
     * * `TERRAFORM_OPEN_SOURCE` - Terraform open source configuration file
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty =
        cdkBuilder.build()
}
