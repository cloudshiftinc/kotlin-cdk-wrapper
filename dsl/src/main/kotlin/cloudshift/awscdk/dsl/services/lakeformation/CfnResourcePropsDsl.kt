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

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnResourceProps

/**
 * Properties for defining a `CfnResource`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * CfnResourceProps cfnResourceProps = CfnResourceProps.builder()
 * .resourceArn("resourceArn")
 * .useServiceLinkedRole(false)
 * // the properties below are optional
 * .roleArn("roleArn")
 * .withFederation(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-resource.html)
 */
@CdkDslMarker
public class CfnResourcePropsDsl {
    private val cdkBuilder: CfnResourceProps.Builder = CfnResourceProps.builder()

    /** @param resourceArn The Amazon Resource Name (ARN) of the resource. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /** @param roleArn The IAM role that registered a resource. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     *   this caller with the Data Catalog .
     */
    public fun useServiceLinkedRole(useServiceLinkedRole: Boolean) {
        cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    /**
     * @param useServiceLinkedRole Designates a trusted caller, an IAM principal, by registering
     *   this caller with the Data Catalog .
     */
    public fun useServiceLinkedRole(useServiceLinkedRole: IResolvable) {
        cdkBuilder.useServiceLinkedRole(useServiceLinkedRole)
    }

    /**
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     *   database.
     */
    public fun withFederation(withFederation: Boolean) {
        cdkBuilder.withFederation(withFederation)
    }

    /**
     * @param withFederation Allows Lake Formation to assume a role to access tables in a federated
     *   database.
     */
    public fun withFederation(withFederation: IResolvable) {
        cdkBuilder.withFederation(withFederation)
    }

    public fun build(): CfnResourceProps = cdkBuilder.build()
}
