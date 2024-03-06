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

package io.cloudshiftdev.awscdkdsl.services.resiliencehub

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resiliencehub.CfnApp

/**
 * Defines a resource mapping.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resiliencehub.*;
 * ResourceMappingProperty resourceMappingProperty = ResourceMappingProperty.builder()
 * .mappingType("mappingType")
 * .physicalResourceId(PhysicalResourceIdProperty.builder()
 * .identifier("identifier")
 * .type("type")
 * // the properties below are optional
 * .awsAccountId("awsAccountId")
 * .awsRegion("awsRegion")
 * .build())
 * // the properties below are optional
 * .eksSourceName("eksSourceName")
 * .logicalStackName("logicalStackName")
 * .resourceName("resourceName")
 * .terraformSourceName("terraformSourceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resiliencehub-app-resourcemapping.html)
 */
@CdkDslMarker
public class CfnAppResourceMappingPropertyDsl {
    private val cdkBuilder: CfnApp.ResourceMappingProperty.Builder =
        CfnApp.ResourceMappingProperty.builder()

    /**
     * @param eksSourceName Name of the Amazon Elastic Kubernetes Service cluster and namespace that
     *   this resource is mapped to when the `mappingType` is `EKS` .
     *
     * This parameter accepts values in "eks-cluster/namespace" format.
     */
    public fun eksSourceName(eksSourceName: String) {
        cdkBuilder.eksSourceName(eksSourceName)
    }

    /**
     * @param logicalStackName Name of the AWS CloudFormation stack this resource is mapped to when
     *   the `mappingType` is `CfnStack` .
     */
    public fun logicalStackName(logicalStackName: String) {
        cdkBuilder.logicalStackName(logicalStackName)
    }

    /** @param mappingType Specifies the type of resource mapping. */
    public fun mappingType(mappingType: String) {
        cdkBuilder.mappingType(mappingType)
    }

    /** @param physicalResourceId Identifier of the physical resource. */
    public fun physicalResourceId(physicalResourceId: IResolvable) {
        cdkBuilder.physicalResourceId(physicalResourceId)
    }

    /** @param physicalResourceId Identifier of the physical resource. */
    public fun physicalResourceId(physicalResourceId: CfnApp.PhysicalResourceIdProperty) {
        cdkBuilder.physicalResourceId(physicalResourceId)
    }

    /**
     * @param resourceName Name of the resource that this resource is mapped to when the
     *   `mappingType` is `Resource` .
     */
    public fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
    }

    /**
     * @param terraformSourceName Name of the Terraform source that this resource is mapped to when
     *   the `mappingType` is `Terraform` .
     */
    public fun terraformSourceName(terraformSourceName: String) {
        cdkBuilder.terraformSourceName(terraformSourceName)
    }

    public fun build(): CfnApp.ResourceMappingProperty = cdkBuilder.build()
}
