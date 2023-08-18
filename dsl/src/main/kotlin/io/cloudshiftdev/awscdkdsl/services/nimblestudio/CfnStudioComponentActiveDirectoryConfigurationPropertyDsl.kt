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

package io.cloudshiftdev.awscdkdsl.services.nimblestudio

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

/**
 * The configuration for a AWS Directory Service for Microsoft Active Directory studio resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * ActiveDirectoryConfigurationProperty activeDirectoryConfigurationProperty =
 * ActiveDirectoryConfigurationProperty.builder()
 * .computerAttributes(List.of(ActiveDirectoryComputerAttributeProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .directoryId("directoryId")
 * .organizationalUnitDistinguishedName("organizationalUnitDistinguishedName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-activedirectoryconfiguration.html)
 */
@CdkDslMarker
public class CfnStudioComponentActiveDirectoryConfigurationPropertyDsl {
    private val cdkBuilder: CfnStudioComponent.ActiveDirectoryConfigurationProperty.Builder =
        CfnStudioComponent.ActiveDirectoryConfigurationProperty.builder()

    private val _computerAttributes: MutableList<Any> = mutableListOf()

    /**
     * @param computerAttributes A collection of custom attributes for an Active Directory computer.
     */
    public fun computerAttributes(vararg computerAttributes: Any) {
        _computerAttributes.addAll(listOf(*computerAttributes))
    }

    /**
     * @param computerAttributes A collection of custom attributes for an Active Directory computer.
     */
    public fun computerAttributes(computerAttributes: Collection<Any>) {
        _computerAttributes.addAll(computerAttributes)
    }

    /**
     * @param computerAttributes A collection of custom attributes for an Active Directory computer.
     */
    public fun computerAttributes(computerAttributes: IResolvable) {
        cdkBuilder.computerAttributes(computerAttributes)
    }

    /**
     * @param directoryId The directory ID of the AWS Directory Service for Microsoft Active
     *   Directory to access using this studio component.
     */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    /**
     * @param organizationalUnitDistinguishedName The distinguished name (DN) and organizational
     *   unit (OU) of an Active Directory computer.
     */
    public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
        cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
    }

    public fun build(): CfnStudioComponent.ActiveDirectoryConfigurationProperty {
        if (_computerAttributes.isNotEmpty()) cdkBuilder.computerAttributes(_computerAttributes)
        return cdkBuilder.build()
    }
}
