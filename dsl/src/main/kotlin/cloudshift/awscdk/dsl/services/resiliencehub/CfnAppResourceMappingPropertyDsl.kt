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

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
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

    /** @param eksSourceName the value to be set. */
    public fun eksSourceName(eksSourceName: String) {
        cdkBuilder.eksSourceName(eksSourceName)
    }

    /** @param logicalStackName The name of the CloudFormation stack this resource is mapped to. */
    public fun logicalStackName(logicalStackName: String) {
        cdkBuilder.logicalStackName(logicalStackName)
    }

    /**
     * @param mappingType Specifies the type of resource mapping. Valid Values: CfnStack | Resource
     *   | AppRegistryApp | ResourceGroup | Terraform
     * * **AppRegistryApp** - The resource is mapped to another application. The name of the
     *   application is contained in the `appRegistryAppName` property.
     * * **CfnStack** - The resource is mapped to a CloudFormation stack. The name of the
     *   CloudFormation stack is contained in the `logicalStackName` property.
     * * **Resource** - The resource is mapped to another resource. The name of the resource is
     *   contained in the `resourceName` property.
     * * **ResourceGroup** - The resource is mapped to a resource group. The name of the resource
     *   group is contained in the `resourceGroupName` property.
     */
    public fun mappingType(mappingType: String) {
        cdkBuilder.mappingType(mappingType)
    }

    /** @param physicalResourceId The identifier of this resource. */
    public fun physicalResourceId(physicalResourceId: IResolvable) {
        cdkBuilder.physicalResourceId(physicalResourceId)
    }

    /** @param physicalResourceId The identifier of this resource. */
    public fun physicalResourceId(physicalResourceId: CfnApp.PhysicalResourceIdProperty) {
        cdkBuilder.physicalResourceId(physicalResourceId)
    }

    /** @param resourceName The name of the resource this resource is mapped to. */
    public fun resourceName(resourceName: String) {
        cdkBuilder.resourceName(resourceName)
    }

    /** @param terraformSourceName The short name of the Terraform source. */
    public fun terraformSourceName(terraformSourceName: String) {
        cdkBuilder.terraformSourceName(terraformSourceName)
    }

    public fun build(): CfnApp.ResourceMappingProperty = cdkBuilder.build()
}
