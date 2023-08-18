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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnProject
import software.amazon.awscdk.services.sagemaker.CfnProjectProps

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object serviceCatalogProvisioningDetails;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .projectName("projectName")
 * .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
 * // the properties below are optional
 * .projectDescription("projectDescription")
 * .serviceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsProperty.builder()
 * .provisionedProductId("provisionedProductId")
 * .provisionedProductStatusMessage("provisionedProductStatusMessage")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-project.html)
 */
@CdkDslMarker
public class CfnProjectPropsDsl {
    private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param projectDescription The description of the project. */
    public fun projectDescription(projectDescription: String) {
        cdkBuilder.projectDescription(projectDescription)
    }

    /** @param projectName The name of the project. */
    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    /** @param serviceCatalogProvisionedProductDetails Provisioned ServiceCatalog Details. */
    public fun serviceCatalogProvisionedProductDetails(
        serviceCatalogProvisionedProductDetails: IResolvable
    ) {
        cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails)
    }

    /** @param serviceCatalogProvisionedProductDetails Provisioned ServiceCatalog Details. */
    public fun serviceCatalogProvisionedProductDetails(
        serviceCatalogProvisionedProductDetails:
            CfnProject.ServiceCatalogProvisionedProductDetailsProperty
    ) {
        cdkBuilder.serviceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails)
    }

    /**
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to
     *   provision a service catalog. For information, see
     *   [What is AWS Service Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html)
     *   .
     */
    public fun serviceCatalogProvisioningDetails(
        serviceCatalogProvisioningDetails: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(serviceCatalogProvisioningDetails)
        cdkBuilder.serviceCatalogProvisioningDetails(builder.map)
    }

    /**
     * @param serviceCatalogProvisioningDetails The product ID and provisioning artifact ID to
     *   provision a service catalog. For information, see
     *   [What is AWS Service Catalog](https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html)
     *   .
     */
    public fun serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails: Any) {
        cdkBuilder.serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource. For more information, see
     *   [Resource Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   and
     *   [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     *   in the *AWS Billing and Cost Management User Guide* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource. For more information, see
     *   [Resource Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   and
     *   [Using Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
     *   in the *AWS Billing and Cost Management User Guide* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProjectProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
