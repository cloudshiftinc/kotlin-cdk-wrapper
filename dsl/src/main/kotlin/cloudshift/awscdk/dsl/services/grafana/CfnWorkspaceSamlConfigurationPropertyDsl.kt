@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.grafana.CfnWorkspace
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkspaceSamlConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkspace.SamlConfigurationProperty.Builder =
        CfnWorkspace.SamlConfigurationProperty.builder()

    private val _allowedOrganizations: MutableList<String> = mutableListOf()

    public fun allowedOrganizations(vararg allowedOrganizations: String) {
        _allowedOrganizations.addAll(listOf(*allowedOrganizations))
    }

    public fun allowedOrganizations(allowedOrganizations: Collection<String>) {
        _allowedOrganizations.addAll(allowedOrganizations)
    }

    public fun assertionAttributes(assertionAttributes: IResolvable) {
        cdkBuilder.assertionAttributes(assertionAttributes)
    }

    public fun assertionAttributes(assertionAttributes: CfnWorkspace.AssertionAttributesProperty) {
        cdkBuilder.assertionAttributes(assertionAttributes)
    }

    public fun idpMetadata(idpMetadata: IResolvable) {
        cdkBuilder.idpMetadata(idpMetadata)
    }

    public fun idpMetadata(idpMetadata: CfnWorkspace.IdpMetadataProperty) {
        cdkBuilder.idpMetadata(idpMetadata)
    }

    public fun loginValidityDuration(loginValidityDuration: Number) {
        cdkBuilder.loginValidityDuration(loginValidityDuration)
    }

    public fun roleValues(roleValues: IResolvable) {
        cdkBuilder.roleValues(roleValues)
    }

    public fun roleValues(roleValues: CfnWorkspace.RoleValuesProperty) {
        cdkBuilder.roleValues(roleValues)
    }

    public fun build(): CfnWorkspace.SamlConfigurationProperty {
        if (_allowedOrganizations.isNotEmpty()) cdkBuilder.allowedOrganizations(_allowedOrganizations)
        return cdkBuilder.build()
    }
}
